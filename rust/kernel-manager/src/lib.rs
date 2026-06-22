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
mod renderer;
mod spoof;
mod display_control;
mod daemon;
mod tier;
mod checker;
mod hotplug;
mod disk;

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
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readCoreDataNative(mut env: JNIEnv, _class: JClass) -> jstring {
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
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCpuModelNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, cpu::get_cpu_model())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGovernorNative(mut env: JNIEnv, _class: JClass, governor: JString) -> jint {
    let gov: String = env.get_string(&governor).map(|s| s.into()).unwrap_or_default();
    match cpu::set_governor(&gov) { Ok(true) => 1, Err(e) => { eprintln!("setGovernor: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setFreqLimitNative(_env: JNIEnv, _class: JClass, core: jint, min: jint, max: jint) -> jint {
    match cpu::set_freq_limit(core, min, max) { Ok(true) => 1, Err(e) => { eprintln!("setFreqLimit: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCoreOnlineNative(_env: JNIEnv, _class: JClass, core: jint, online: jint) -> jint {
    match cpu::set_core_online(core, online != 0) { Ok(true) => 1, Err(e) => { eprintln!("setCoreOnline: {}", e); 0 }, _ => 0 }
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
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuModelNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, gpu::get_gpu_model())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuAvailableFrequenciesNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_gpu_available_frequencies()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuAvailablePoliciesNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_gpu_available_policies()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getGpuDriverInfoNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, gpu::get_gpu_driver_info())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuPowerLevelsNative(_env: JNIEnv, _class: JClass, min: jint, max: jint) -> jint {
    match gpu::set_gpu_power_levels(min, max) { Ok(true) => 1, Err(e) => { eprintln!("setGpuPowerLevels: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuForceNative(mut env: JNIEnv, _class: JClass, state: JString, value: jint) -> jint {
    let s: String = env.get_string(&state).map(|s| s.into()).unwrap_or_default();
    match gpu::set_gpu_force(&s, value != 0) { Ok(true) => 1, Err(e) => { eprintln!("setGpuForce: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuFreqLimitNative(_env: JNIEnv, _class: JClass, min: jint, max: jint) -> jint {
    match gpu::set_gpu_freq_limit(min, max) { Ok(true) => 1, Err(e) => { eprintln!("setGpuFreqLimit: {}", e); 0 }, _ => 0 }
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
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getAvailableZramAlgorithmsNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&memory::get_available_zram_algorithms()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSwappinessNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match memory::set_swappiness(val) { Ok(true) => 1, Err(e) => { eprintln!("setSwappiness: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDirtyRatioNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match memory::set_dirty_ratio(val) { Ok(true) => 1, Err(e) => { eprintln!("setDirtyRatio: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setMinFreeKbytesNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match memory::set_min_free_kbytes(val) { Ok(true) => 1, Err(e) => { eprintln!("setMinFreeKbytes: {}", e); 0 }, _ => 0 }
}

// ==================== THERMAL ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readThermalZonesNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, thermal::read_thermal_zones_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setThermalSconfigNative(mut env: JNIEnv, _class: JClass, preset: JString) -> jint {
    let p: String = env.get_string(&preset).map(|s| s.into()).unwrap_or_default();
    match thermal::set_thermal_sconfig(&p) { Ok(true) => 1, Err(e) => { eprintln!("setThermalSconfig: {}", e); 0 }, _ => 0 }
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
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryHealthNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power::read_battery_health())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readBatteryCapacityLevelNative(_env: JNIEnv, _class: JClass) -> jfloat {
    power::read_battery_capacity_level()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBypassChargingNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match power::set_bypass_charging(enable != 0) { Ok(true) => 1, Err(e) => { eprintln!("setBypassCharging: {}", e); 0 }, _ => 0 }
}

// ==================== SYSFS GENERIC ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSystemPropertyNative(mut env: JNIEnv, _class: JClass, key: JString) -> jstring {
    let k: String = env.get_string(&key).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, sysfs::get_system_property(&k).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_fileExistsNative(mut env: JNIEnv, _class: JClass, path: JString) -> jint {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    if sysfs::file_exists(&p) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readSysfsNative(mut env: JNIEnv, _class: JClass, path: JString) -> jstring {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, sysfs::read_sysfs(&p).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_writeSysfsNative(mut env: JNIEnv, _class: JClass, path: JString, value: JString) -> jint {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    let v: String = env.get_string(&value).map(|s| s.into()).unwrap_or_default();
    if sysfs::write_sysfs(&p, &v) { 1 } else { 0 }
}

// ==================== GPU ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuBusSplitNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match gpu::set_gpu_bus_split(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setGpuBusSplit: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuThrottlingNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match gpu::set_gpu_throttling(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setGpuThrottling: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuIdleTimerNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    match gpu::set_gpu_idle_timer(ms) { Ok(true) => 1, Err(e) => { eprintln!("setGpuIdleTimer: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuMaxGpuclkNative(_env: JNIEnv, _class: JClass, hz: jlong) -> jint {
    match gpu::set_gpu_max_gpuclk(hz) { Ok(true) => 1, Err(e) => { eprintln!("setGpuMaxGpuclk: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGpuDevfreqGovernorNative(mut env: JNIEnv, _class: JClass, governor: JString) -> jint {
    let g: String = env.get_string(&governor).map(|s| s.into()).unwrap_or_default();
    match gpu::set_gpu_devfreq_governor(&g) { Ok(true) => 1, Err(e) => { eprintln!("setGpuDevfreqGovernor: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerActiveNative(_env: JNIEnv, _class: JClass, active: jint) -> jint {
    match gpu::set_adreno_idler_active(active != 0) { Ok(true) => 1, Err(e) => { eprintln!("setAdrenoIdlerActive: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerIdlewaitNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    match gpu::set_adreno_idler_idlewait(ms) { Ok(true) => 1, Err(e) => { eprintln!("setAdrenoIdlerIdlewait: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerDowndifferentialNative(_env: JNIEnv, _class: JClass, pct: jint) -> jint {
    match gpu::set_adreno_idler_downdifferential(pct) { Ok(true) => 1, Err(e) => { eprintln!("setAdrenoIdlerDowndifferential: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoIdlerIdleworkloadNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match gpu::set_adreno_idler_idleworkload(val) { Ok(true) => 1, Err(e) => { eprintln!("setAdrenoIdlerIdleworkload: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSimpleGpuActivateNative(_env: JNIEnv, _class: JClass, active: jint) -> jint {
    match gpu::set_simple_gpu_activate(active != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSimpleGpuActivate: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSimpleGpuLazinessNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match gpu::set_simple_gpu_laziness(val) { Ok(true) => 1, Err(e) => { eprintln!("setSimpleGpuLaziness: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSimpleGpuRampThresholdNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match gpu::set_simple_gpu_ramp_threshold(val) { Ok(true) => 1, Err(e) => { eprintln!("setSimpleGpuRampThreshold: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasBusDcvsNative(_env: JNIEnv, _class: JClass) -> jint {
    if gpu::has_bus_dcvs() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBusDcvsFreqNative(mut env: JNIEnv, _class: JClass, bus_name: JString, min: jint, max: jint) -> jint {
    let b: String = env.get_string(&bus_name).map(|s| s.into()).unwrap_or_default();
    match gpu::set_bus_dcvs_freq(&b, min, max) { Ok(true) => 1, Err(e) => { eprintln!("setBusDcvsFreq: {}", e); 0 }, _ => 0 }
}

// ==================== SCHEDULER + VM ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStunePreferIdleNative(_env: JNIEnv, _class: JClass, prefer: jint) -> jint {
    match scheduler::set_stune_prefer_idle(prefer != 0) { Ok(true) => 1, Err(e) => { eprintln!("setStunePreferIdle: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStuneBoostNative(_env: JNIEnv, _class: JClass, boost: jint) -> jint {
    match scheduler::set_stune_boost(boost) { Ok(true) => 1, Err(e) => { eprintln!("setStuneBoost: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setVfsCachePressureNative(_env: JNIEnv, _class: JClass, pct: jint) -> jint {
    match scheduler::set_vfs_cache_pressure(pct) { Ok(true) => 1, Err(e) => { eprintln!("setVfsCachePressure: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSplitLockMitigateNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match scheduler::set_split_lock_mitigate(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSplitLockMitigate: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBoreNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match scheduler::set_sched_bore(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSchedBore: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedUtilClampMinNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match scheduler::set_sched_util_clamp_min(val) { Ok(true) => 1, Err(e) => { eprintln!("setSchedUtilClampMin: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedUtilClampMaxNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match scheduler::set_sched_util_clamp_max(val) { Ok(true) => 1, Err(e) => { eprintln!("setSchedUtilClampMax: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_dropCachesNative(_env: JNIEnv, _class: JClass) -> jint {
    match scheduler::drop_caches() { Ok(true) => 1, Err(e) => { eprintln!("dropCaches: {}", e); 0 }, _ => 0 }
}

// ==================== I/O ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setIoSchedulerNative(mut env: JNIEnv, _class: JClass, device: JString, scheduler: JString) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    let s: String = env.get_string(&scheduler).map(|s| s.into()).unwrap_or_default();
    match io::set_io_scheduler(&d, &s) { Ok(true) => 1, Err(e) => { eprintln!("setIoScheduler: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setIoReadaheadNative(mut env: JNIEnv, _class: JClass, device: JString, kb: jint) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    match io::set_io_readahead_kb(&d, kb) { Ok(true) => 1, Err(e) => { eprintln!("setIoReadahead: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setIoNrRequestsNative(mut env: JNIEnv, _class: JClass, device: JString, nr: jint) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    match io::set_io_nr_requests(&d, nr) { Ok(true) => 1, Err(e) => { eprintln!("setIoNrRequests: {}", e); 0 }, _ => 0 }
}

// ==================== NETWORK ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setTcpCongestionNative(mut env: JNIEnv, _class: JClass, algo: JString) -> jint {
    let a: String = env.get_string(&algo).map(|s| s.into()).unwrap_or_default();
    match network::set_tcp_congestion(&a) { Ok(true) => 1, Err(e) => { eprintln!("setTcpCongestion: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getKernelVersionNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, network::get_kernel_version())
}

// ==================== CPU ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setInputBoostMsNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    match cpu::set_input_boost_ms(ms) { Ok(true) => 1, Err(e) => { eprintln!("setInputBoostMs: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBoostOnInputNative(_env: JNIEnv, _class: JClass, boost: jint) -> jint {
    match cpu::set_sched_boost_on_input(boost != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSchedBoostOnInput: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpuEasEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match cpu::set_cpu_eas_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setCpuEasEnabled: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpuDcvsDisableNative(_env: JNIEnv, _class: JClass, core: jint, disable: jint) -> jint {
    match cpu::set_cpu_dcvs_disable(core, disable != 0) { Ok(true) => 1, Err(e) => { eprintln!("setCpuDcvsDisable: {}", e); 0 }, _ => 0 }
}

// ==================== THERMAL ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setMsmThermalEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match thermal::set_msm_thermal_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setMsmThermalEnabled: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setEarathEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match thermal::set_eara_thermal_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setEaraThermalEnabled: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setFpsgoEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match thermal::set_fpsgo_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setFpsgoEnabled: {}", e); 0 }, _ => 0 }
}

// ==================== POWER ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_discoverBypassChargingNodeNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power::discover_bypass_charging_node().unwrap_or_default())
}

// ==================== MEMORY ENHANCEMENTS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_zramSetAlgorithmNative(mut env: JNIEnv, _class: JClass, device: jint, algo: JString) -> jint {
    let a: String = env.get_string(&algo).map(|s| s.into()).unwrap_or_default();
    match memory::zram_set_algorithm(device, &a) { Ok(true) => 1, Err(e) => { eprintln!("zramSetAlgorithm: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_zramSetSizeNative(_env: JNIEnv, _class: JClass, device: jint, size: jlong) -> jint {
    match memory::zram_set_size(device, size) { Ok(true) => 1, Err(e) => { eprintln!("zramSetSize: {}", e); 0 }, _ => 0 }
}

// ==================== RENDERER (SkiaShift resetprop) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setRendererNative(mut env: JNIEnv, _class: JClass, mode: JString) -> jint {
    let m: String = env.get_string(&mode).map(|s| s.into()).unwrap_or_default();
    match renderer::set_renderer(&m) { Ok(true) => 1, Err(e) => { eprintln!("setRenderer: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCurrentRendererNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, renderer::get_current_renderer())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_isVulkanEnabledNative(_env: JNIEnv, _class: JClass) -> jint {
    if renderer::is_vulkan_enabled() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_restartSurfaceflingerNative(_env: JNIEnv, _class: JClass) -> jint {
    if renderer::restart_surfaceflinger() { 1 } else { 0 }
}

// ==================== SPOOF (COPG resetprop + mount) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_spoofDevicePropertyNative(mut env: JNIEnv, _class: JClass, key: JString, value: JString) -> jint {
    let k: String = env.get_string(&key).map(|s| s.into()).unwrap_or_default();
    let v: String = env.get_string(&value).map(|s| s.into()).unwrap_or_default();
    match spoof::spoof_device_property(&k, &v) { Ok(true) => 1, Err(e) => { eprintln!("spoofDeviceProperty: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_restoreDevicePropertyNative(mut env: JNIEnv, _class: JClass, key: JString) -> jint {
    let k: String = env.get_string(&key).map(|s| s.into()).unwrap_or_default();
    match spoof::restore_device_property(&k) { Ok(true) => 1, Err(e) => { eprintln!("restoreDeviceProperty: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_restoreAllSpoofsNative(_env: JNIEnv, _class: JClass) -> jint {
    match spoof::restore_all_spoofs() { Ok(true) => 1, Err(e) => { eprintln!("restoreAllSpoofs: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_mountCpuinfoSpoofNative(_env: JNIEnv, _class: JClass) -> jint {
    match spoof::mount_cpuinfo_spoof() { Ok(true) => 1, Err(e) => { eprintln!("mountCpuinfoSpoof: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_unmountCpuinfoSpoofNative(_env: JNIEnv, _class: JClass) -> jint {
    match spoof::unmount_cpuinfo_spoof() { Ok(true) => 1, Err(e) => { eprintln!("unmountCpuinfoSpoof: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_isCpuinfoSpoofedNative(_env: JNIEnv, _class: JClass) -> jint {
    if spoof::is_cpuinfo_spoofed() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_applyDeviceProfileNative(mut env: JNIEnv, _class: JClass, profile: JString) -> jint {
    let p: String = env.get_string(&profile).map(|s| s.into()).unwrap_or_default();
    match spoof::apply_device_profile(&p) { Ok(true) => 1, Err(e) => { eprintln!("applyDeviceProfile: {}", e); 0 }, _ => 0 }
}

// ==================== DISPLAY CONTROL (DPIS wm density) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGlobalDensityNative(_env: JNIEnv, _class: JClass, dpi: jint) -> jint {
    match display_control::set_global_density(dpi) { Ok(true) => 1, Err(e) => { eprintln!("setGlobalDensity: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_resetGlobalDensityNative(_env: JNIEnv, _class: JClass) -> jint {
    match display_control::reset_global_density() { Ok(true) => 1, Err(e) => { eprintln!("resetGlobalDensity: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCurrentDensityNative(_env: JNIEnv, _class: JClass) -> jint {
    display_control::get_current_density()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setGlobalFontScaleNative(_env: JNIEnv, _class: JClass, scale: jfloat) -> jint {
    match display_control::set_global_font_scale(scale) { Ok(true) => 1, Err(e) => { eprintln!("setGlobalFontScale: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCurrentFontScaleNative(_env: JNIEnv, _class: JClass) -> jfloat {
    display_control::get_current_font_scale()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_applyDensityPresetNative(mut env: JNIEnv, _class: JClass, preset: JString) -> jint {
    let p: String = env.get_string(&preset).map(|s| s.into()).unwrap_or_default();
    match display_control::apply_density_preset(&p) { Ok(true) => 1, Err(e) => { eprintln!("applyDensityPreset: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_applyFontPresetNative(mut env: JNIEnv, _class: JClass, preset: JString) -> jint {
    let p: String = env.get_string(&preset).map(|s| s.into()).unwrap_or_default();
    match display_control::apply_font_preset(&p) { Ok(true) => 1, Err(e) => { eprintln!("applyFontPreset: {}", e); 0 }, _ => 0 }
}

// ==================== DAEMON (Foreground Monitor + Per-App) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getForegroundAppNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, daemon::get_foreground_app())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_startProfileMonitorNative(_env: JNIEnv, _class: JClass) -> jint {
    daemon::ProfileManager::start_monitor_thread();
    1
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_stopProfileMonitorNative(_env: JNIEnv, _class: JClass) -> jint {
    daemon::MONITOR_ACTIVE.store(false, std::sync::atomic::Ordering::Relaxed);
    1
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_saveProfilesNative(mut env: JNIEnv, _class: JClass, json: JString) -> jint {
    let j: String = env.get_string(&json).map(|s| s.into()).unwrap_or_default();
    if daemon::save_profiles_to_file("/data/local/tmp/farewell_profiles.json", &j) { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_loadProfilesNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, daemon::load_profiles_from_file("/data/local/tmp/farewell_profiles.json"))
}

// ==================== Framework Detection ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasKernelSuNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::has_kernelsu() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasMagiskNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::has_magisk() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasRezygiskNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::has_rezygisk() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasLsposedNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::has_lsposed() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasResetpropNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::has_resetprop() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getFrameworkStatusNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, daemon::get_framework_status())
}

// ==================== DND + Game Controls ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDndEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match daemon::set_dnd_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setDndEnabled: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setImmersiveModeNative(mut env: JNIEnv, _class: JClass, pkg: JString, enabled: jint) -> jint {
    let p: String = env.get_string(&pkg).map(|s| s.into()).unwrap_or_default();
    match daemon::set_immersive_mode(&p, enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setImmersiveMode: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_dropCachesAndKillNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::drop_caches_and_kill() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setScreenBrightnessNative(_env: JNIEnv, _class: JClass, value: jint) -> jint {
    match daemon::set_screen_brightness(value) { Ok(true) => 1, Err(e) => { eprintln!("setScreenBrightness: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setScreenBrightnessModeManualNative(_env: JNIEnv, _class: JClass) -> jint {
    match daemon::set_screen_brightness_mode_manual() { Ok(true) => 1, Err(e) => { eprintln!("setScreenBrightnessModeManual: {}", e); 0 }, _ => 0 }
}

// ==================== Apply-on-Boot ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_saveBootConfigNative(mut env: JNIEnv, _class: JClass, config: JString) -> jint {
    let c: String = env.get_string(&config).map(|s| s.into()).unwrap_or_default();
    match daemon::save_boot_config(&c) { Ok(true) => 1, Err(e) => { eprintln!("saveBootConfig: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_loadBootConfigNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, daemon::load_boot_config())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_applyBootConfigNative(_env: JNIEnv, _class: JClass) -> jint {
    match daemon::apply_boot_config() { Ok(true) => 1, Err(e) => { eprintln!("applyBootConfig: {}", e); 0 }, _ => 0 }
}

// ==================== TIER SYSTEM ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_detectTierNative(_env: JNIEnv, _class: JClass) -> jint {
    let status = tier::FrameworkStatus::detect();
    status.current_tier as jint
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getFrameworkStatusJsonNative(mut env: JNIEnv, _class: JClass) -> jstring {
    let status = tier::FrameworkStatus::detect();
    create_jstring_safe(&env, status.to_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getUnlockedFeaturesNative(mut env: JNIEnv, _class: JClass) -> jint {
    let status = tier::FrameworkStatus::detect();
    tier::get_unlocked_features(&status.current_tier).len() as jint
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getLockedFeaturesNative(mut env: JNIEnv, _class: JClass) -> jint {
    let status = tier::FrameworkStatus::detect();
    tier::get_locked_features(&status.current_tier).len() as jint
}

// ==================== FEATURE CHECKER ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_verifyFeatureNative(mut env: JNIEnv, _class: JClass, feature: JString) -> jstring {
    let f: String = env.get_string(&feature).map(|s| s.into()).unwrap_or_default();
    let result = checker::verify_feature(&f);
    checker::log_check(&result);
    let status = if result.passed { "PASS" } else { "FAIL" };
    create_jstring_safe(&env, format!("{}: {}", status, result.message))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_verifyAllFeaturesNative(_env: JNIEnv, _class: JClass) -> jint {
    let status = tier::FrameworkStatus::detect();
    let results = checker::verify_all_features(&status.current_tier);
    checker::get_pass_rate(&results) as jint
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCheckerLogNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, checker::get_log_content())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_clearCheckerLogNative(_env: JNIEnv, _class: JClass) -> jint {
    if checker::clear_logs() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_exportLogsNative(env: JNIEnv, _class: JClass) -> jstring {
    match checker::export_logs() {
        Some(path) => create_jstring_safe(&env, path),
        None => create_jstring_safe(&env, String::new()),
    }
}

// ==================== HOTPLUG ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getAvailableHotplugDriversNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&hotplug::get_available_hotplug_drivers()).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCoreCtlMinCpusNative(_env: JNIEnv, _class: JClass, cluster: jint) -> jint {
    hotplug::get_core_ctl_min_cpus(cluster)
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCoreCtlMinCpusNative(_env: JNIEnv, _class: JClass, cluster: jint, n: jint) -> jint {
    match hotplug::set_core_ctl_min_cpus(cluster, n) { Ok(true) => 1, Err(e) => { eprintln!("setCoreCtlMinCpus: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCoreCtlMaxCpusNative(_env: JNIEnv, _class: JClass, cluster: jint, n: jint) -> jint {
    match hotplug::set_core_ctl_max_cpus(cluster, n) { Ok(true) => 1, Err(e) => { eprintln!("setCoreCtlMaxCpus: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setMsmHotplugEnabledNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match hotplug::set_msm_hotplug_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setMsmHotplugEnabled: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_isScreenOnNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::is_screen_on() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_fstrimAllNative(_env: JNIEnv, _class: JClass) -> jint {
    if daemon::fstrim_all() { 1 } else { 0 }
}

// ==================== CPU DEVFREQ ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getDevfreqCurFreqNative(mut _env: JNIEnv, _class: JClass, device: JString) -> jlong {
    let d: String = _env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    cpu::get_devfreq_cur_freq(&d)
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDevfreqMinFreqNative(mut _env: JNIEnv, _class: JClass, device: JString, freq: jlong) -> jint {
    let d: String = _env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    match cpu::set_devfreq_min_freq(&d, freq) { Ok(true) => 1, Err(e) => { eprintln!("setDevfreqMinFreq: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDevfreqMaxFreqNative(mut _env: JNIEnv, _class: JClass, device: JString, freq: jlong) -> jint {
    let d: String = _env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    match cpu::set_devfreq_max_freq(&d, freq) { Ok(true) => 1, Err(e) => { eprintln!("setDevfreqMaxFreq: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDevfreqGovernorNative(mut env: JNIEnv, _class: JClass, device: JString, gov: JString) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    let g: String = env.get_string(&gov).map(|s| s.into()).unwrap_or_default();
    match cpu::set_devfreq_governor(&d, &g) { Ok(true) => 1, Err(e) => { eprintln!("setDevfreqGovernor: {}", e); 0 }, _ => 0 }
}

// ==================== ADRENOBOOST ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getAdrenoboostNative(_env: JNIEnv, _class: JClass) -> jint {
    gpu::get_adrenoboost()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setAdrenoboostNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match gpu::set_adrenoboost(val) { Ok(true) => 1, Err(e) => { eprintln!("setAdrenoboost: {}", e); 0 }, _ => 0 }
}

// ==================== DISPLAY MODES ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getDisplayModesNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_display_modes()).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDisplayModeNative(mut env: JNIEnv, _class: JClass, mode: JString) -> jint {
    let m: String = env.get_string(&mode).map(|s| s.into()).unwrap_or_default();
    match gpu::set_display_mode(&m) { Ok(true) => 1, Err(e) => { eprintln!("setDisplayMode: {}", e); 0 }, _ => 0 }
}

// ==================== CHARGING CURRENT ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getConstantChargeCurrentMaxNative(_env: JNIEnv, _class: JClass) -> jint {
    power::get_constant_charge_current_max()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setConstantChargeCurrentMaxNative(_env: JNIEnv, _class: JClass, ua: jint) -> jint {
    match power::set_constant_charge_current_max(ua) { Ok(true) => 1, Err(e) => { eprintln!("setConstantChargeCurrentMax: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getUsbCurrentMaxNative(_env: JNIEnv, _class: JClass) -> jint {
    power::get_usb_current_max()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setUsbCurrentMaxNative(_env: JNIEnv, _class: JClass, ua: jint) -> jint {
    match power::set_usb_current_max(ua) { Ok(true) => 1, Err(e) => { eprintln!("setUsbCurrentMax: {}", e); 0 }, _ => 0 }
}

// ==================== MISSING FEATURES ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getPrintkNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, network::get_printk())
}
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getWireguardVersionNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, network::get_wireguard_version())
}
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSchedAutogroupEnabledNative(_env: JNIEnv, _class: JClass) -> jint {
    if scheduler::get_sched_autogroup_enabled() { 1 } else { 0 }
}
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getOvercommitRatioNative(_env: JNIEnv, _class: JClass) -> jint {
    scheduler::get_overcommit_ratio()
}
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getChargeControlLimitNative(_env: JNIEnv, _class: JClass) -> jint {
    power::get_charge_control_limit()
}

// ==================== CPUSET ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCpusetCpusNative(mut env: JNIEnv, _class: JClass, group: JString) -> jstring {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, scheduler::get_cpuset_cpus(&g))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpusetCpusNative(mut env: JNIEnv, _class: JClass, group: JString, cpus: JString) -> jint {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    let c: String = env.get_string(&cpus).map(|s| s.into()).unwrap_or_default();
    match scheduler::set_cpuset_cpus(&g, &c) { Ok(true) => 1, Err(e) => { eprintln!("setCpusetCpus: {}", e); 0 }, _ => 0 }
}

// ==================== DISK STATS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readDiskStatsNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, disk::read_diskstats_json())
}

// ==================== QCOM DEVFREQ DEVICES ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getQcomDevfreqDevicesNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&cpu::get_qcom_devfreq_devices()).unwrap_or_default())
}

// ==================== CPUSET GROUPS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getAvailableCpusetGroupsNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&scheduler::get_available_cpuset_groups()).unwrap_or_default())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_debounceWriteNative(mut env: JNIEnv, _class: JClass, path: JString, value: JString) -> jint {
    let p: String = env.get_string(&path).map(|s| s.into()).unwrap_or_default();
    let v: String = env.get_string(&value).map(|s| s.into()).unwrap_or_default();
    if daemon::debounce_write(&p, &v, 3) { 1 } else { 0 }
}

// ==================== COMPANION MODULE DETECTION ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasFarewellCompanionNative(_env: JNIEnv, _class: JClass) -> jint {
    if tier::has_farewell_companion() { 1 } else { 0 }
}
