# Module 20: COPG + Shizuku + Shizuku-API + RvKernel

**Status:** ✅ VERIFIED — COPG mount+cow, Shizuku BinderSender, RvKernel dynamic probing confirmed

---

## COPG — CPU Spoofing via Zygisk

**Hook Mechanisms:**
1. **JNI Build field spoof** — `env->SetStaticObjectField` on `android.os.Build` (MODEL, BRAND, DEVICE)
2. **COW prop spoof** — `mmap(MAP_PRIVATE | MAP_FIXED)` of `/dev/__properties__` pages
3. **ANDROID_ID cache-forge** — Directly forge `Settings$Secure.sNameValueCache` in ART heap
4. **CPU spoof** — Bind-mount at `/proc/cpuinfo` via companion: `mount --bind <spoof_file> /proc/cpuinfo`

**Config:** `/data/adb/modules/COPG/COPG.json` with per-package device profiles

---

## Shizuku — Binder IPC Root Alternative

**Mechanism:** Java server running as root/shell UID, sends binder to client apps via ContentProvider IPC bridge.

**Binder Delivery Flow:**
1. `BinderSender` registers `ProcessObserver` + `UidObserver` on `ActivityManager`
2. App starts → `sendBinderToUserApp()`
3. Server calls `getContentProviderExternal(shizuku)`
4. Sends `IBinder` via `IContentProvider.call("sendBinder")`
5. Client's `ShizukuProvider` receives → `Shizuku.onBinderReceived()`

**Key Pattern:** BinderWrapper tunnels arbitrary Binder calls through Shizuku's privileged process.

---

## Shizuku-API — API Interface

**Core Classes:**
- `Shizuku.java` — Static singleton, holds `IBinder`/`IShizukuService`
- `ShizukuBinderWrapper.java` — `IBinder` wrapper, tunnels `transact()` via `Shizuku.transactRemote()`
- `ShizukuProvider.java` — ContentProvider for binder receipt
- `UserService.java` — Spawns root process via `app_process`

**AIDL:** 18 methods (getVersion, newProcess, requestPermission, etc.)

---

## RvKernel-Manager — Material 3 Kernel Manager

**Key Pattern:** Dynamic sysfs probing — no hardcoded cluster topology
```kotlin
Utils.testFile(path) → if true, read/write; else hide UI
```

**Sysfs Paths (Key):**
| Category | Paths |
|----------|-------|
| CPU freq | `/sys/devices/system/cpu/cpufreq/policy{0,3,4,6,7}/scaling_*` |
| GPU (KGSL) | `/sys/class/kgsl/kgsl-3d0/{min,max}_clock_mhz`, `gpuclk`, `devfreq/governor` |
| Kernel params | `/proc/sys/kernel/sched_*`, `dmesg_restrict` |
| ZRAM | `/sys/block/zram0/{reset,disksize,comp_algorithm}` |
| VM | `/proc/sys/vm/swappiness`, `dirty_ratio` |
| TCP | `/proc/sys/net/ipv4/tcp_congestion_control` |

**Material 3:** Dynamic color (Monet), dark mode, ViewModel-UI with `StateFlow`
