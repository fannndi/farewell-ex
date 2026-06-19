use std::collections::HashMap;
use std::ffi::CString;
use std::time::{Duration, Instant};
use once_cell::sync::Lazy;
use parking_lot::RwLock;

struct CachedValue {
    value: String,
    timestamp: Instant,
}

static VALUE_CACHE: Lazy<RwLock<HashMap<String, CachedValue>>> =
    Lazy::new(|| RwLock::new(HashMap::with_capacity(128)));

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

#[inline]
pub fn read_sysfs(path: &str) -> Option<String> {
    read_file(path).or_else(|| read_file_libc(path))
}

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

#[inline]
pub fn read_sysfs_int(path: &str, ttl_ms: u64) -> Option<i64> {
    read_sysfs_cached(path, ttl_ms)?.parse().ok()
}

#[inline]
pub fn read_sysfs_float(path: &str, ttl_ms: u64) -> Option<f32> {
    read_sysfs_cached(path, ttl_ms)?.parse().ok()
}

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

#[inline]
pub fn write_sysfs(path: &str, value: &str) -> bool {
    let c_path = CString::new(path).ok()?;
    unsafe {
        let fd = libc::open(c_path.as_ptr(), libc::O_WRONLY | libc::O_TRUNC);
        if fd < 0 { return false; }
        let c_value = CString::new(value).ok()?;
        let written = libc::write(fd, c_value.as_ptr() as *const libc::c_void, c_value.as_bytes().len());
        libc::close(fd);
        written > 0
    }
}

#[inline]
pub fn chmod(path: &str, mode: &str) -> bool {
    let c_path = CString::new(path).ok()?;
    let c_mode = CString::new(mode).ok()?;
    unsafe {
        let fd = libc::open(c_path.as_ptr(), libc::O_RDONLY | libc::O_PATH);
        if fd < 0 { return false; }
        let mode_int = i32::from_str_radix(c_mode.to_str().unwrap_or("644"), 8).unwrap_or(0o644);
        let result = libc::fchmod(fd, mode_int);
        libc::close(fd);
        result == 0
    }
}

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

#[inline]
pub fn get_system_property(key: &str) -> Option<String> {
    #[cfg(target_os = "android")]
    {
        android_properties::getprop(key).value()
    }
    #[cfg(not(target_os = "android"))]
    { None }
}

pub fn invalidate_cache() {
    VALUE_CACHE.write().clear();
}
