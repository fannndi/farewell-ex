mod sysfs;
mod cpu;
mod gpu;
mod memory;
mod thermal;
mod power;
mod scheduler;
mod io;
mod network;
mod display;
mod wake;

use jni::objects::{JClass, JString};
use jni::sys::{jfloat, jint, jlong, jstring};
use jni::JNIEnv;

#[unsafe(no_mangle)]
pub extern "system" fn JNI_OnLoad(_vm: *mut jni::sys::JavaVM, _reserved: *mut std::ffi::c_void) -> jint {
    jni::sys::JNI_VERSION_1_6
}

#[inline]
fn create_jstring_safe(env: &JNIEnv, s: String) -> jstring {
    env.new_string(s).unwrap_or_else(|_| env.new_string("").unwrap()).into_raw()
}

// ==================== CPU ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_detectCpuClustersNative(env: JNIEnv, _class: JClass) -> jstring {
    let clusters = cpu::detect_cpu_clusters();
    create_jstring_safe(&env, serde_json::to_string(&clusters).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readCoreDataNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, cpu::read_core_data())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readCpuLoadNative(_env: JNIEnv, _class: JClass) -> jfloat {
    cpu::read_cpu_load()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readCpuTemperatureNative(_env: JNIEnv, _class: JClass) -> jfloat {
    thermal::read_cpu_temperature()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readCoreTemperatureNative(_env: JNIEnv, _class: JClass, core: jint) -> jfloat {
    cpu::read_core_temperature(core)
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCpuModelNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, cpu::get_cpu_model())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGovernorNative(env: JNIEnv, _class: JClass, governor: JString) -> jint {
    let gov: String = env.get_string(&governor).map(|s| s.into()).unwrap_or_default();
    if cpu::set_governor(&gov) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setFreqLimitNative(_env: JNIEnv, _class: JClass, core: jint, min: jint, max: jint) -> jint {
    if cpu::set_freq_limit(core, min, max) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCoreOnlineNative(_env: JNIEnv, _class: JClass, core: jint, online: jint) -> jint {
    if cpu::set_core_online(core, online != 0) { 1 } else { 0 }
}

// ==================== GPU ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readGpuFreqNative(_env: JNIEnv, _class: JClass) -> jint {
    gpu::read_gpu_freq()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readGpuBusyNative(_env: JNIEnv, _class: JClass) -> jint {
    gpu::read_gpu_busy()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_resetGpuStatsNative(_env: JNIEnv, _class: JClass) {
    gpu::reset_gpu_stats();
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuVendorNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, gpu::get_gpu_vendor().to_string())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuModelNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, gpu::get_gpu_model())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuAvailableFrequenciesNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_gpu_available_frequencies()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuAvailablePoliciesNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_gpu_available_policies()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuDriverInfoNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, gpu::get_gpu_driver_info())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuPowerLevelsNative(_env: JNIEnv, _class: JClass, min: jint, max: jint) -> jint {
    if gpu::set_gpu_power_levels(min, max) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuForceNative(env: JNIEnv, _class: JClass, state: JString, value: jint) -> jint {
    let s: String = env.get_string(&state).map(|s| s.into()).unwrap_or_default();
    if gpu::set_gpu_force(&s, value != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuFreqLimitNative(_env: JNIEnv, _class: JClass, min: jint, max: jint) -> jint {
    if gpu::set_gpu_freq_limit(min, max) { 1 } else { 0 }
}

// ==================== MEMORY ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readMemInfoNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, memory::read_meminfo_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readZramSizeNative(_env: JNIEnv, _class: JClass) -> jlong {
    memory::read_zram_stats().disksize
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getMemoryPressureNative(_env: JNIEnv, _class: JClass) -> jfloat {
    memory::get_memory_pressure()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSwappinessNative(_env: JNIEnv, _class: JClass) -> jint {
    memory::read_swappiness()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getZramCompressionRatioNative(_env: JNIEnv, _class: JClass) -> jfloat {
    memory::read_zram_stats().compression_ratio
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getZramAlgorithmNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, memory::get_current_zram_algorithm())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getAvailableZramAlgorithmsNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&memory::get_available_zram_algorithms()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSwappinessNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if memory::set_swappiness(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDirtyRatioNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if memory::set_dirty_ratio(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setMinFreeKbytesNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if memory::set_min_free_kbytes(val) { 1 } else { 0 }
}

// ==================== THERMAL ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readThermalZonesNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, thermal::read_thermal_zones_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setThermalSconfigNative(env: JNIEnv, _class: JClass, preset: JString) -> jint {
    let p: String = env.get_string(&preset).map(|s| s.into()).unwrap_or_default();
    if thermal::set_thermal_sconfig(&p) { 1 } else { 0 }
}

// ==================== POWER ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryLevelNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_battery_level()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryTempNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_battery_temp()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryVoltageNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_battery_voltage_mv()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryCurrentNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_battery_current_ma()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_isChargingNative(_env: JNIEnv, _class: JClass) -> jint {
    if power::is_charging() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readCycleCountNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_cycle_count()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryHealthNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power::read_battery_health())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryCapacityLevelNative(_env: JNIEnv, _class: JClass) -> jfloat {
    power::read_battery_capacity_level()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBypassChargingNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    if power::set_bypass_charging(enable != 0) { 1 } else { 0 }
}

// ==================== SYSFS GENERIC ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSystemPropertyNative(env: JNIEnv, _class: JClass, key: JString) -> jstring {
    let k: String = env.get_string(&key).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, sysfs::get_system_property(&k).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_fileExistsNative(env: JNIEnv, _class: JClass, path: JString) -> jint {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    if sysfs::file_exists(&p) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readSysfsNative(env: JNIEnv, _class: JClass, path: JString) -> jstring {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, sysfs::read_sysfs(&p).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_writeSysfsNative(env: JNIEnv, _class: JClass, path: JString, value: JString) -> jint {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    let v: String = env.get_string(&value).map(|s| s.into()).unwrap_or_default();
    if sysfs::write_sysfs(&p, &v) { 1 } else { 0 }
}

// ==================== GPU ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuBusSplitNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if gpu::set_gpu_bus_split(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuThrottlingNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if gpu::set_gpu_throttling(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuIdleTimerNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    if gpu::set_gpu_idle_timer(ms) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuMaxGpuclkNative(_env: JNIEnv, _class: JClass, hz: jlong) -> jint {
    if gpu::set_gpu_max_gpuclk(hz) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuDevfreqGovernorNative(env: JNIEnv, _class: JClass, governor: JString) -> jint {
    let g: String = env.get_string(&governor).map(|s| s.into()).unwrap_or_default();
    if gpu::set_gpu_devfreq_governor(&g) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerActiveNative(_env: JNIEnv, _class: JClass, active: jint) -> jint {
    if gpu::set_adreno_idler_active(active != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerIdlewaitNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    if gpu::set_adreno_idler_idlewait(ms) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerDowndifferentialNative(_env: JNIEnv, _class: JClass, pct: jint) -> jint {
    if gpu::set_adreno_idler_downdifferential(pct) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerIdleworkloadNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if gpu::set_adreno_idler_idleworkload(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSimpleGpuActivateNative(_env: JNIEnv, _class: JClass, active: jint) -> jint {
    if gpu::set_simple_gpu_activate(active != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSimpleGpuLazinessNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if gpu::set_simple_gpu_laziness(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSimpleGpuRampThresholdNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if gpu::set_simple_gpu_ramp_threshold(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasBusDcvsNative(_env: JNIEnv, _class: JClass) -> jint {
    if gpu::has_bus_dcvs() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBusDcvsFreqNative(env: JNIEnv, _class: JClass, bus_name: JString, min: jint, max: jint) -> jint {
    let b: String = env.get_string(&bus_name).map(|s| s.into()).unwrap_or_default();
    if gpu::set_bus_dcvs_freq(&b, min, max) { 1 } else { 0 }
}

// ==================== SCHEDULER + VM ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStunePreferIdleNative(_env: JNIEnv, _class: JClass, prefer: jint) -> jint {
    if scheduler::set_stune_prefer_idle(prefer != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStuneBoostNative(_env: JNIEnv, _class: JClass, boost: jint) -> jint {
    if scheduler::set_stune_boost(boost) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setVfsCachePressureNative(_env: JNIEnv, _class: JClass, pct: jint) -> jint {
    if scheduler::set_vfs_cache_pressure(pct) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSplitLockMitigateNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if scheduler::set_split_lock_mitigate(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBoreNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if scheduler::set_sched_bore(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedUtilClampMinNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if scheduler::set_sched_util_clamp_min(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedUtilClampMaxNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    if scheduler::set_sched_util_clamp_max(val) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_dropCachesNative(_env: JNIEnv, _class: JClass) -> jint {
    if scheduler::drop_caches() { 1 } else { 0 }
}

// ==================== I/O ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setIoSchedulerNative(env: JNIEnv, _class: JClass, device: JString, scheduler: JString) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    let s: String = env.get_string(&scheduler).map(|s| s.into()).unwrap_or_default();
    if io::set_io_scheduler(&d, &s) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setIoReadaheadNative(env: JNIEnv, _class: JClass, device: JString, kb: jint) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    if io::set_io_readahead_kb(&d, kb) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setIoNrRequestsNative(env: JNIEnv, _class: JClass, device: JString, nr: jint) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    if io::set_io_nr_requests(&d, nr) { 1 } else { 0 }
}

// ==================== NETWORK ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setTcpCongestionNative(env: JNIEnv, _class: JClass, algo: JString) -> jint {
    let a: String = env.get_string(&algo).map(|s| s.into()).unwrap_or_default();
    if network::set_tcp_congestion(&a) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getKernelVersionNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, network::get_kernel_version())
}

// ==================== CPU ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setInputBoostMsNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    if cpu::set_input_boost_ms(ms) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBoostOnInputNative(_env: JNIEnv, _class: JClass, boost: jint) -> jint {
    if cpu::set_sched_boost_on_input(boost != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpuEasEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if cpu::set_cpu_eas_enabled(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpuDcvsDisableNative(_env: JNIEnv, _class: JClass, core: jint, disable: jint) -> jint {
    if cpu::set_cpu_dcvs_disable(core, disable != 0) { 1 } else { 0 }
}

// ==================== THERMAL ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setMsmThermalEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if thermal::set_msm_thermal_enabled(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setEarathEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if thermal::set_eara_thermal_enabled(enabled != 0) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setFpsgoEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if thermal::set_fpsgo_enabled(enabled != 0) { 1 } else { 0 }
}

// ==================== POWER ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_discoverBypassChargingNodeNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power::discover_bypass_charging_node().unwrap_or_default())
}

// ==================== MEMORY ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_zramSetAlgorithmNative(env: JNIEnv, _class: JClass, device: jint, algo: JString) -> jint {
    let a: String = env.get_string(&algo).map(|s| s.into()).unwrap_or_default();
    if memory::zram_set_algorithm(device, &a) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_zramSetSizeNative(_env: JNIEnv, _class: JClass, device: jint, size: jlong) -> jint {
    if memory::zram_set_size(device, size) { 1 } else { 0 }
}
