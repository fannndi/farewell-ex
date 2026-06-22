use std::collections::HashMap;
use std::ffi::CString;
use std::fmt;
use std::time::{Duration, Instant};
use once_cell::sync::Lazy;
use parking_lot::RwLock;

/// Error type for sysfs operations with context.
#[derive(Debug, Clone, PartialEq)]
pub enum SysfsError {
    /// File not found at given path
    NotFound(String),
    /// Permission denied (need chmod)
    PermissionDenied(String),
    /// Read/write operation failed
    IoError(String),
    /// Parse error (int/float conversion)
    ParseError(String),
}

impl fmt::Display for SysfsError {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        match self {
            SysfsError::NotFound(p) => write!(f, "NotFound: {}", p),
            SysfsError::PermissionDenied(p) => write!(f, "PermissionDenied: {}", p),
            SysfsError::IoError(e) => write!(f, "IoError: {}", e),
            SysfsError::ParseError(e) => write!(f, "ParseError: {}", e),
        }
    }
}

impl std::error::Error for SysfsError {}

/// Result alias for sysfs operations.
pub type SysfsResult<T> = Result<T, SysfsError>;

struct CachedValue {
    value: String,
    timestamp: Instant,
}

static VALUE_CACHE: Lazy<RwLock<HashMap<String, CachedValue>>> =
    Lazy::new(|| RwLock::new(HashMap::with_capacity(128)));

/// Read file contents as trimmed string.
///
/// **Sysfs path:** Generic file path
/// **Root:** Not required
/// **Returns:** File contents as String, or None on error
///
/// Example:
/// ```
/// let contents = sysfs::read_file("/proc/version");
/// ```
#[inline]
pub fn read_file(path: &str) -> Option<String> {
    #[cfg(unix)]
    {
        use rustix::fs::{openat, CWD, OFlags, Mode};
        use rustix::io::read as rustix_read;
        let fd = openat(CWD, path, OFlags::RDONLY, Mode::empty()).ok()?;
        let mut buffer = [0u8; 4096];
        let bytes_read = rustix_read(&fd, &mut buffer).ok()?;
        String::from_utf8(buffer[..bytes_read].to_vec())
            .ok()
            .map(|s| s.trim().to_string())
    }
    #[cfg(not(unix))]
    {
        std::fs::read_to_string(path).ok().map(|s| s.trim().to_string())
    }
}

/// Read file contents via libc open/read (fallback on non-rustix platforms).
///
/// **Sysfs path:** Generic file path
/// **Root:** Not required
/// **Returns:** File contents as String, or None on error
#[inline]
pub fn read_file_libc(path: &str) -> Option<String> {
    let c_path = CString::new(path).ok()?;
    unsafe {
        let fd = libc::open(c_path.as_ptr(), libc::O_RDONLY);
        if fd < 0 { return None; }
        let mut buffer = [0u8; 4096];
        let bytes_read = libc::read(fd, buffer.as_mut_ptr() as *mut libc::c_void, buffer.len());
        libc::close(fd);
        if bytes_read <= 0 { return None; }
        String::from_utf8(buffer[..bytes_read as usize].to_vec())
            .ok()
            .map(|s| s.trim().to_string())
    }
}

/// Read sysfs node, trying rustix then libc fallback.
///
/// **Sysfs path:** Generic sysfs path
/// **Root:** Not required
/// **Returns:** Sysfs node value as String, or None on error
#[inline]
pub fn read_sysfs(path: &str) -> Option<String> {
    read_file(path).or_else(|| read_file_libc(path))
}

/// Read sysfs node with TTL-based caching.
///
/// **Sysfs path:** Generic sysfs path
/// **Root:** Not required
/// **Returns:** Cached or fresh value, or None on error
///
/// Example:
/// ```
/// let val = sysfs::read_sysfs_cached("/sys/class/kgsl/kgsl-3d0/gpuclk", 500);
/// ```
#[inline]
pub fn read_sysfs_cached(path: &str, ttl_ms: u64) -> Option<String> {
    if ttl_ms > 0 {
        let cache = VALUE_CACHE.read();
        if let Some(cached) = cache.get(path) {
            if cached.timestamp.elapsed() < Duration::from_millis(ttl_ms) {
                return Some(cached.value.clone());
            }
        }
    }
    let value = read_sysfs(path)?;
    if ttl_ms > 0 {
        let mut cache = VALUE_CACHE.write();
        cache.insert(path.to_string(), CachedValue {
            value: value.clone(),
            timestamp: Instant::now(),
        });
    }
    Some(value)
}

/// Read sysfs node as `i64` with caching.
///
/// **Sysfs path:** Generic sysfs path
/// **Root:** Not required
/// **Returns:** Parsed integer, or None on error
#[inline]
pub fn read_sysfs_int(path: &str, ttl_ms: u64) -> Option<i64> {
    read_sysfs_cached(path, ttl_ms)?.parse().ok()
}

/// Read sysfs node as `f32` with caching.
///
/// **Sysfs path:** Generic sysfs path
/// **Root:** Not required
/// **Returns:** Parsed float, or None on error
#[inline]
pub fn read_sysfs_float(path: &str, ttl_ms: u64) -> Option<f32> {
    read_sysfs_cached(path, ttl_ms)?.parse().ok()
}

/// Read file contents into an existing buffer.
///
/// **Sysfs path:** Generic file path
/// **Root:** Not required
/// **Returns:** Number of bytes read, or None on error
#[inline]
pub fn read_file_buf(path: &str, buf: &mut [u8]) -> Option<usize> {
    let c_path = CString::new(path).ok()?;
    unsafe {
        let fd = libc::open(c_path.as_ptr(), libc::O_RDONLY);
        if fd < 0 { return None; }
        let bytes_read = libc::read(fd, buf.as_mut_ptr() as *mut libc::c_void, buf.len());
        libc::close(fd);
        if bytes_read <= 0 { None } else { Some(bytes_read as usize) }
    }
}

/// Write value to a sysfs node.
///
/// **Sysfs path:** Generic sysfs path
/// **Root:** Required
/// **Returns:** `true` if write succeeded
///
/// Example:
/// ```
/// sysfs::write_sysfs("/sys/class/kgsl/kgsl-3d0/bus_split", "1");
/// ```
#[inline]
pub fn write_sysfs(path: &str, value: &str) -> bool {
    let c_path = match CString::new(path) { Ok(c) => c, Err(_) => return false };
    let c_value = match CString::new(value) { Ok(c) => c, Err(_) => return false };
    let ok = unsafe {
        let fd = libc::open(c_path.as_ptr(), libc::O_WRONLY | libc::O_TRUNC);
        if fd < 0 { return false; }
        let written = libc::write(fd, c_value.as_ptr() as *const libc::c_void, c_value.as_bytes().len());
        libc::close(fd);
        written > 0
    };
    if ok { invalidate_cache(); }
    ok
}

/// Change permissions on a sysfs node via `fchmod`.
///
/// **Sysfs path:** Generic sysfs path
/// **Root:** Required
/// **Returns:** `true` if chmod succeeded
#[inline]
pub fn chmod(path: &str, mode: &str) -> bool {
    let c_path = match CString::new(path) { Ok(c) => c, Err(_) => return false };
    let Ok(c_mode) = CString::new(mode) else { return false };
    unsafe {
        let fd = libc::open(c_path.as_ptr(), libc::O_RDONLY | libc::O_PATH);
        if fd < 0 { return false; }
        let mode_int = i32::from_str_radix(c_mode.to_str().unwrap_or("644"), 8).unwrap_or(0o644);
        let result = libc::fchmod(fd, mode_int.try_into().unwrap());
        libc::close(fd);
        result == 0
    }
}

/// Check if a file/sysfs node exists.
///
/// **Sysfs path:** Generic path
/// **Root:** Not required
/// **Returns:** `true` if the path exists and is accessible
#[inline]
pub fn file_exists(path: &str) -> bool {
    #[cfg(unix)]
    {
        use rustix::fs::{accessat, Access, AtFlags, CWD};
        if accessat(CWD, path, Access::EXISTS, AtFlags::empty()).is_ok() {
            return true;
        }
    }
    if let Ok(c_path) = CString::new(path) {
        unsafe { return libc::access(c_path.as_ptr(), 0) == 0; }
    }
    false
}

/// Read Android system property via `getprop`.
///
/// **Sysfs path:** N/A (Android property system)
/// **Root:** Not required
/// **Returns:** Property value, or None on non-Android
#[inline]
pub fn get_system_property(key: &str) -> Option<String> {
    #[cfg(target_os = "android")]
    {
        android_properties::getprop(key).value()
    }
    #[cfg(not(target_os = "android"))]
    { None }
}

/// Invalidate all cached sysfs values.
///
/// **Sysfs path:** N/A
/// **Root:** Not required
/// **Returns:** Nothing
pub fn invalidate_cache() {
    VALUE_CACHE.write().clear();
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_read_sysfs_cached_nonexistent() {
        let r = read_sysfs_cached("/farewell_test_nonexistent_42", 1000);
        assert!(r.is_none());
    }

    #[test]
    fn test_invalidate_cache_clears() {
        invalidate_cache();
        let r = read_sysfs_cached("/farewell_test_nonexistent_42", 1000);
        assert!(r.is_none());
    }

    #[test]
    fn test_read_sysfs_int_nonexistent() {
        let r = read_sysfs_int("/farewell_test_nonexistent_42", 1000);
        assert!(r.is_none());
    }

    #[test]
    fn test_read_sysfs_float_nonexistent() {
        let r = read_sysfs_float("/farewell_test_nonexistent_42", 1000);
        assert!(r.is_none());
    }

    #[test]
    fn test_write_sysfs_nonexistent() {
        assert!(!write_sysfs("/farewell_test_nonexistent_42", "x"));
    }

    #[test]
    fn test_file_exists_nonexistent() {
        assert!(!file_exists("/farewell_test_nonexistent_42"));
    }

    #[test]
    fn test_chmod_nonexistent() {
        assert!(!chmod("/farewell_test_nonexistent_42", "644"));
    }

    #[test]
    fn test_read_file_buf_nonexistent() {
        let mut buf = [0u8; 16];
        assert!(read_file_buf("/farewell_test_nonexistent_42", &mut buf).is_none());
    }

    #[test]
    fn test_get_system_property_non_android() {
        #[cfg(not(target_os = "android"))]
        assert!(get_system_property("test.prop").is_none());
    }

    #[test]
    fn test_sysfs_error_display_variants() {
        assert_eq!(SysfsError::NotFound("/x".into()).to_string(), "NotFound: /x");
        assert_eq!(SysfsError::PermissionDenied("/x".into()).to_string(), "PermissionDenied: /x");
        assert_eq!(SysfsError::IoError("fail".into()).to_string(), "IoError: fail");
        assert_eq!(SysfsError::ParseError("bad".into()).to_string(), "ParseError: bad");
    }

    #[test]
    fn test_sysfs_error_is_error() {
        let e = SysfsError::NotFound("x".into());
        let _: &dyn std::error::Error = &e;
    }

    #[test]
    fn test_sysfs_error_clone_and_partial_eq() {
        let a = SysfsError::IoError("e".into());
        let b = SysfsError::IoError("e".into());
        let c = SysfsError::ParseError("e".into());
        assert_eq!(a, b);
        assert_ne!(a, c);
        let _d = a.clone();
    }

    #[test]
    fn test_read_sysfs_cached_zero_ttl() {
        invalidate_cache();
        let r = read_sysfs_cached("/nonexistent_zero_ttl", 0);
        assert!(r.is_none());
    }

    #[test]
    fn test_write_sysfs_null_byte_path() {
        assert!(!write_sysfs("/bad\x00path", "1"));
    }

    #[test]
    fn test_write_sysfs_empty_value() {
        assert!(!write_sysfs("/nonexistent_empty_val", ""));
    }

    #[test]
    fn test_chmod_invalid_mode_string() {
        assert!(!chmod("/nonexistent_bad_mode", "notanum"));
    }

    #[test]
    fn test_file_exists_null_path() {
        assert!(!file_exists("/bad\x00path"));
    }

    #[test]
    fn test_read_sysfs_cached_negative_ttl() {
        let r = read_sysfs_cached("/nonexistent_neg_ttl", 0);
        assert!(r.is_none());
    }
}
