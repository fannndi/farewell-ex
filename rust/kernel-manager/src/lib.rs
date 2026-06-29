mod sysfs;
mod sysctl_qcom;
mod cpu;
mod gpu;
mod memory;
mod thermal;
mod power;
mod power_xiaomi;
mod display_xiaomi;
mod haptic;
mod boot_qcom;
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
mod stune;
mod touch;

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

// ==================== KGSL IOCTL — SELinux-safe GPU reading ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readGpuFreqIoctlNative(_env: JNIEnv, _class: JClass) -> jint {
    gpu::read_gpu_freq_ioctl()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readGpuBusyIoctlNative(_env: JNIEnv, _class: JClass) -> jint {
    gpu::read_gpu_busy_ioctl()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readGpuModelIoctlNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, gpu::read_gpu_model_ioctl())
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

// ==================== DEBUG DIAGNOSTIC ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_runDebugDiagnosticNative(mut env: JNIEnv, _class: JClass, tier_name: JString) -> jstring {
    let t: String = env.get_string(&tier_name).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, checker::run_debug_diagnostic(&t))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readDebugLogNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, checker::read_debug_log())
}

// ==================== XIAOMI CHARGING (power_xiaomi) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasReverseChargeNative(_env: JNIEnv, _class: JClass) -> jint {
    if power_xiaomi::has_reverse_charge() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setReverseChargeNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match power_xiaomi::set_reverse_charge(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getReverseChargeNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power_xiaomi::get_reverse_charge())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasNightChargingNative(_env: JNIEnv, _class: JClass) -> jint {
    if power_xiaomi::has_night_charging() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setNightChargingNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match power_xiaomi::set_night_charging(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getNightChargingNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power_xiaomi::get_night_charging())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasCoolModeNative(_env: JNIEnv, _class: JClass) -> jint {
    if power_xiaomi::has_cool_mode() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCoolModeNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match power_xiaomi::set_cool_mode(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCoolModeNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power_xiaomi::get_cool_mode())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasSmartBatteryNative(_env: JNIEnv, _class: JClass) -> jint {
    if power_xiaomi::has_smart_battery() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSmartBatteryNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match power_xiaomi::set_smart_battery(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSmartBatteryNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, power_xiaomi::get_smart_battery())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasInputSuspendNative(_env: JNIEnv, _class: JClass) -> jint {
    if power_xiaomi::has_input_suspend() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setInputSuspendNative(_env: JNIEnv, _class: JClass, suspend: jint) -> jint {
    match power_xiaomi::set_input_suspend(suspend != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getUsbpdStatusNative(env: JNIEnv, _class: JClass) -> jstring {
    let status = power_xiaomi::get_usbpd_status();
    let json: String = status.iter().map(|(k,v)| format!("\"{}\":\"{}\"", k, v)).collect::<Vec<_>>().join(",");
    create_jstring_safe(&env, format!("{{{}}}", json))
}

// ==================== XIAOMI DISPLAY (display_xiaomi) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasKcalNative(_env: JNIEnv, _class: JClass) -> jint {
    if display_xiaomi::has_kcal() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setKcalRgbNative(_env: JNIEnv, _class: JClass, r: jint, g: jint, b: jint) -> jint {
    match display_xiaomi::set_kcal_rgb(r, g, b) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getKcalValuesNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, display_xiaomi::get_kcal_values())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setKcalContrastNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match display_xiaomi::set_kcal_contrast(val) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setKcalSaturationNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match display_xiaomi::set_kcal_saturation(val) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasDfpsNative(_env: JNIEnv, _class: JClass) -> jint {
    if display_xiaomi::has_dfps() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDfpsNative(_env: JNIEnv, _class: JClass, mode: jint) -> jint {
    match display_xiaomi::set_dfps(mode) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getDfpsModeNative(_env: JNIEnv, _class: JClass) -> jint {
    display_xiaomi::get_dfps_mode()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasHistogramNative(_env: JNIEnv, _class: JClass) -> jint {
    if display_xiaomi::has_histogram() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setHistogramNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match display_xiaomi::set_histogram(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasMipiRegNative(_env: JNIEnv, _class: JClass) -> jint {
    if display_xiaomi::has_mipi_reg() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readMipiRegNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, display_xiaomi::read_mipi_reg())
}

// ==================== HAPTIC (AW8697) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasAw8697Native(_env: JNIEnv, _class: JClass) -> jint {
    if haptic::has_aw8697() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasLraCalibrationNative(_env: JNIEnv, _class: JClass) -> jint {
    if haptic::has_lra_calibration() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readLraCalibrationNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, haptic::read_lra_calibration())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readAw8697F0Native(mut env: JNIEnv, _class: JClass, bus_addr: JString) -> jstring {
    let b: String = env.get_string(&bus_addr).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, haptic::read_aw8697_f0(&b))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasCustomWaveNative(_env: JNIEnv, _class: JClass) -> jint {
    if haptic::has_custom_wave() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_writeCustomWaveNative(mut env: JNIEnv, _class: JClass, bus_addr: JString, data: JString) -> jint {
    let b: String = env.get_string(&bus_addr).map(|s| s.into()).unwrap_or_default();
    let d: String = env.get_string(&data).map(|s| s.into()).unwrap_or_default();
    match haptic::write_custom_wave(&b, &d) { Ok(true) => 1, _ => 0 }
}

// ==================== BOOT QCOM ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getBootStatusJsonNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, boot_qcom::get_boot_status_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasUfsClkscaleNative(_env: JNIEnv, _class: JClass) -> jint {
    if boot_qcom::has_ufs_clkscale() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setUfsClkscaleNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match boot_qcom::set_ufs_clkscale(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getUfsClkscaleNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, boot_qcom::get_ufs_clkscale())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSubsysConfigJsonNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, boot_qcom::get_subsys_config_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasUsbIclNative(_env: JNIEnv, _class: JClass) -> jint {
    if boot_qcom::has_usb_icl() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setUsbIclNative(_env: JNIEnv, _class: JClass, active: jint, val_ma: jint) -> jint {
    match boot_qcom::set_usb_icl(active != 0, val_ma) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getUsbIclNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, boot_qcom::get_usb_icl())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getPilTimeoutsJsonNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, boot_qcom::get_pil_timeouts_json())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasDloadNative(_env: JNIEnv, _class: JClass) -> jint {
    if boot_qcom::has_dload() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDloadNative(_env: JNIEnv, _class: JClass, enable: jint) -> jint {
    match boot_qcom::set_dload(enable != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_shutdownWlanNative(_env: JNIEnv, _class: JClass) -> jint {
    match boot_qcom::shutdown_wlan() { Ok(true) => 1, _ => 0 }
}

// ==================== SCHEDULER MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getSchedFeaturesNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, scheduler::get_sched_features())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedFeatureNative(mut env: JNIEnv, _class: JClass, feature: JString, enabled: jint) -> jint {
    let f: String = env.get_string(&feature).map(|s| s.into()).unwrap_or_default();
    match scheduler::set_sched_feature(&f, enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSchedFeature: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedLibNameNative(mut env: JNIEnv, _class: JClass, names: JString) -> jint {
    let n: String = env.get_string(&names).map(|s| s.into()).unwrap_or_default();
    match scheduler::set_sched_lib_name(&n) { Ok(true) => 1, Err(e) => { eprintln!("setSchedLibName: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedLibMaskForceNative(_env: JNIEnv, _class: JClass, mask: jint) -> jint {
    match scheduler::set_sched_lib_mask_force(mask) { Ok(true) => 1, Err(e) => { eprintln!("setSchedLibMaskForce: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBurstUpdatePeriodNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    match scheduler::set_sched_burst_update_period(ms) { Ok(true) => 1, Err(e) => { eprintln!("setSchedBurstUpdatePeriod: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBurstSmoothUpNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match scheduler::set_sched_burst_smooth_up(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSchedBurstSmoothUp: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedBurstGrahamNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match scheduler::set_sched_burst_graham(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSchedBurstGraham: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedAutogroupNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match scheduler::set_sched_autogroup_enabled(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setSchedAutogroup: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setOvercommitRatioNative(_env: JNIEnv, _class: JClass, pct: jint) -> jint {
    match scheduler::set_overcommit_ratio(pct) { Ok(true) => 1, Err(e) => { eprintln!("setOvercommitRatio: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getCpusetMemsNative(mut env: JNIEnv, _class: JClass, group: JString) -> jstring {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, scheduler::get_cpuset_mems(&g))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpusetMemsNative(mut env: JNIEnv, _class: JClass, group: JString, mems: JString) -> jint {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    let m: String = env.get_string(&mems).map(|s| s.into()).unwrap_or_default();
    match scheduler::set_cpuset_mems(&g, &m) { Ok(true) => 1, Err(e) => { eprintln!("setCpusetMems: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedUtilClampMinRtDefaultNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match scheduler::set_sched_util_clamp_min_rt_default(val) { Ok(true) => 1, Err(e) => { eprintln!("setSchedUtilClampMinRtDefault: {}", e); 0 }, _ => 0 }
}

// ==================== CPU MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpufreqHardlimitMaxNative(_env: JNIEnv, _class: JClass, freq: jlong) -> jint {
    match cpu::set_cpufreq_hardlimit_max(freq) { Ok(true) => 1, Err(e) => { eprintln!("setCpufreqHardlimitMax: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpufreqHardlimitMinNative(_env: JNIEnv, _class: JClass, freq: jlong) -> jint {
    match cpu::set_cpufreq_hardlimit_min(freq) { Ok(true) => 1, Err(e) => { eprintln!("setCpufreqHardlimitMin: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setCpufreqHardlimitDvfsLockNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match cpu::set_cpufreq_hardlimit_dvfs_lock(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setCpufreqHardlimitDvfsLock: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setMsmCpufreqLimitNative(_env: JNIEnv, _class: JClass, limit: jlong) -> jint {
    match cpu::set_msm_cpufreq_limit(limit) { Ok(true) => 1, Err(e) => { eprintln!("setMsmCpufreqLimit: {}", e); 0 }, _ => 0 }
}

// ==================== POWER MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readWakeupCountNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_wakeup_count()
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readSuspendCountNative(_env: JNIEnv, _class: JClass) -> jint {
    power::read_suspend_count()
}

// ==================== NETWORK MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDmesgRestrictNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match network::set_dmesg_restrict(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setDmesgRestrict: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setPrintkNative(_env: JNIEnv, _class: JClass, level: jint) -> jint {
    match network::set_printk(level) { Ok(true) => 1, Err(e) => { eprintln!("setPrintk: {}", e); 0 }, _ => 0 }
}

// ==================== DISPLAY MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBacklightDimmerNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    if display::set_backlight_dimmer_enabled(enabled != 0) { 1 } else { 0 }
}

// ==================== THERMAL MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setEaraFakeThrottleNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match thermal::set_eara_fake_throttle(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setEaraFakeThrottle: {}", e); 0 }, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setFpsgoForceNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match thermal::set_fpsgo_force(enabled != 0) { Ok(true) => 1, Err(e) => { eprintln!("setFpsgoForce: {}", e); 0 }, _ => 0 }
}

// ==================== I/O MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getIoSchedulerNative(mut env: JNIEnv, _class: JClass, device: JString) -> jstring {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, io::get_io_scheduler(&d))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getAvailableIoSchedulersNative(mut env: JNIEnv, _class: JClass, device: JString) -> jstring {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, serde_json::to_string(&io::get_available_io_schedulers(&d)).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getIoReadaheadKbNative(mut env: JNIEnv, _class: JClass, device: JString) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    io::get_io_readahead_kb(&d)
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getIoNrRequestsNative(mut env: JNIEnv, _class: JClass, device: JString) -> jint {
    let d: String = env.get_string(&device).map(|s| s.into()).unwrap_or_default();
    io::get_io_nr_requests(&d)
}

// ==================== GPU MISSING JNI BINDINGS ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getBusDcvsComponentsNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_bus_dcvs_components()).unwrap_or_else(|_| "[]".to_string()))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getBusDcvsFreqNative(mut env: JNIEnv, _class: JClass, bus_name: JString) -> jstring {
    let b: String = env.get_string(&bus_name).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, serde_json::to_string(&gpu::get_bus_dcvs_freq(&b)).unwrap_or_else(|_| "[]".to_string()))
}

// ==================== SYSCTL QCOM (proc/sys paths from stock ROM) ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedLatencyNsNative(_env: JNIEnv, _class: JClass, ns: jint) -> jint {
    match sysctl_qcom::set_sched_latency_ns(ns) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedWakeupGranularityNsNative(_env: JNIEnv, _class: JClass, ns: jint) -> jint {
    match sysctl_qcom::set_sched_wakeup_granularity_ns(ns) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setSchedChildRunsFirstNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match sysctl_qcom::set_sched_child_runs_first(enabled != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setRandomizeVaSpaceNative(_env: JNIEnv, _class: JClass, level: jint) -> jint {
    match sysctl_qcom::set_randomize_va_space(level) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDirtyExpireCentisecsNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match sysctl_qcom::set_dirty_expire_centisecs(val) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDirtyBackgroundRatioNative(_env: JNIEnv, _class: JClass, pct: jint) -> jint {
    match sysctl_qcom::set_dirty_background_ratio(pct) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setOvercommitMemoryNative(_env: JNIEnv, _class: JClass, mode: jint) -> jint {
    match sysctl_qcom::set_overcommit_memory(mode) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setExtraFreeKbytesNative(_env: JNIEnv, _class: JClass, kb: jint) -> jint {
    match sysctl_qcom::set_extra_free_kbytes(kb) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setDropCachesLevelNative(_env: JNIEnv, _class: JClass, level: jint) -> jint {
    match sysctl_qcom::set_drop_caches_level(level) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setPerfEventParanoidNative(_env: JNIEnv, _class: JClass, level: jint) -> jint {
    match sysctl_qcom::set_perf_event_paranoid(level) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setKptrRestrictNative(_env: JNIEnv, _class: JClass, level: jint) -> jint {
    match sysctl_qcom::set_kptr_restrict(level) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setTcpDefaultInitRwndNative(_env: JNIEnv, _class: JClass, val: jint) -> jint {
    match sysctl_qcom::set_tcp_default_init_rwnd(val) { Ok(true) => 1, _ => 0 }
}

// ==================== BOOT QCOM EXTENDED ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBootAdspNative(_env: JNIEnv, _class: JClass) -> jint {
    match boot_qcom::set_boot_adsp() { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBootCdspNative(_env: JNIEnv, _class: JClass) -> jint {
    match boot_qcom::set_boot_cdsp() { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBootNpuNative(_env: JNIEnv, _class: JClass) -> jint {
    match boot_qcom::set_boot_npu() { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBootCvpNative(_env: JNIEnv, _class: JClass) -> jint {
    match boot_qcom::set_boot_cvp() { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setBootSlpiNative(_env: JNIEnv, _class: JClass) -> jint {
    match boot_qcom::set_boot_slpi() { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setPblMbaTimeoutMsNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    match boot_qcom::set_pbl_mba_timeout_ms(ms) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setModemAuthTimeoutMsNative(_env: JNIEnv, _class: JClass, ms: jint) -> jint {
    match boot_qcom::set_modem_auth_timeout_ms(ms) { Ok(true) => 1, _ => 0 }
}

// ==================== STUNE ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getStuneValueNative(mut env: JNIEnv, _class: JClass, group: JString, param: JString) -> jstring {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    let p: String = env.get_string(&param).map(|s| s.into()).unwrap_or_default();
    create_jstring_safe(&env, stune::get_stune_value(&g, &p))
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStuneValueNative(mut env: JNIEnv, _class: JClass, group: JString, param: JString, value: JString) -> jint {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    let p: String = env.get_string(&param).map(|s| s.into()).unwrap_or_default();
    let v: String = env.get_string(&value).map(|s| s.into()).unwrap_or_default();
    match stune::set_stune_value(&g, &p, &v) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStuneColocateNative(_env: JNIEnv, _class: JClass, enabled: jint) -> jint {
    match stune::set_stune_colocate(enabled != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_setStuneSchedBoostNoOverrideNative(mut env: JNIEnv, _class: JClass, group: JString, enabled: jint) -> jint {
    let g: String = env.get_string(&group).map(|s| s.into()).unwrap_or_default();
    match stune::set_stune_sched_boost_no_override(&g, enabled != 0) { Ok(true) => 1, _ => 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getStuneGroupsNative(mut env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, serde_json::to_string(&stune::get_stune_groups()).unwrap_or_default())
}

// ==================== TOUCH ====================

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasXiaomiTouchNative(_env: JNIEnv, _class: JClass) -> jint {
    if touch::has_xiaomi_touch() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_getFodStatusNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, touch::get_fod_status())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasFodNative(_env: JNIEnv, _class: JClass) -> jint {
    if touch::has_fod() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_hasTpLockdownNative(_env: JNIEnv, _class: JClass) -> jint {
    if touch::has_tp_lockdown() { 1 } else { 0 }
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readTpInfoNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, touch::read_tp_info())
}

#[unsafe(no_mangle)]
pub extern "system" fn Java_com_farewell_kernelmanager_kernel_NativeLib_readTpGestureNative(env: JNIEnv, _class: JClass) -> jstring {
    create_jstring_safe(&env, touch::read_tp_gesture())
}
