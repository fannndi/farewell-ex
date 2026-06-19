# Plan: Reverse Engineering → Kernel Manager

**Target:** POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618, KernelSU)
**Stack:** Rust (kernel library) + Kotlin/Compose (Android UI)
**MVP:** CPU Governor Switching
**Full:** Complete kernel manager

---

## Progress Tracker

| Phase | Status | Progress | Notes |
|-------|--------|----------|-------|
| 1. INDEXING | ✅ DONE | 2,115 files | 11 modular INDEX files |
| 2. STUDY PER-FILE | 🔄 IN PROGRESS | 14/2,115 | Xtra-Kernel Rust done |
| 3. SUMMARY | ⬜ TODO | 0/11 sources | Feature catalog per source |
| 4. SELECTION | ⬜ TODO | — | User picks features |
| 5. IMPLEMENTATION | ⬜ TODO | — | MVP: CPU governor |

---

## Phase 2: Study Per-File

### Study Order

| Step | Source | Start File | Target |
|------|--------|-----------|--------|
| 1 | Xtra-Kernel Kotlin | X13: NativeLib.kt | JNI bridge |
| 2 | Encore Tweaks | EN01: Main.cpp | Snapdragon daemon |
| 3 | SkiaShift | SS01: skiashift.cpp | GPU renderer |
| 4 | DPIS | DP01: dpis_native.cpp | DPI hooks |
| 5 | SmartPack | S07: CPUFreq.java | Sysfs catalog |
| 6 | ZKM | Z01: AdrenoUtils.kt | GPU discovery |
| 7 | AZenith | A01: main.c | C daemon |
| 8 | COPG | CG01: spoof_module.cpp | CPU spoofing |
| 9 | Shizuku | SH01: ShizukuService.java | Root API |
| 10 | RvKernel | R02: SoCUtils.kt | Material 3 |

### Per-File Workflow

```
1. Read file → understand purpose
2. Extract sysfs/procfs paths → catalog
3. Extract patterns → reusable code blocks
4. Mark ⬜ → ✅ in modular INDEX
5. Write knowledge to knowledge/modules/
```

### Phase 2 Status

| Source | Indexed | Done | Status |
|--------|---------|------|--------|
| Xtra-Kernel Rust | 12 | 12 | ✅ |
| Xtra-Kernel Kotlin | 16 | 0 | ⬜ |
| Encore | 19 | 0 | ⬜ |
| SkiaShift | 5 | 0 | ⬜ |
| DPIS | 10 | 0 | ⬜ |
| SmartPack | 31 | 0 | ⬜ |
| ZKM | 14 | 0 | ⬜ |
| AZenith | 19 | 0 | ⬜ |
| COPG | 5 | 0 | ⬜ |
| Shizuku | 7 | 0 | ⬜ |
| Shizuku-API | 7 | 0 | ⬜ |

---

## Phase 3: Summary (Feature Catalog)

Per source, buat catalog fitur yang tersedia:

| Source | Fitur Utama | Root Required | QCOM Specific |
|--------|-------------|---------------|---------------|
| SmartPack | CPU freq/governor/hotplug, GPU Adreno, I/O scheduler, ZRAM, thermal MSM, battery, wakelock, gesture, display, sound | Ya | Ya (MSM) |
| Xtra-Kernel | CPU cluster detect, GPU multi-vendor, battery persistent FD, thermal auto-detect, memory pressure | Ya | Ya |
| RvKernel | CPU multi-cluster uclamp, GPU power level, battery fast charge, ZRAM, TCP congestion, BORE scheduler, profiles | Ya | Ya |
| ZKM | Bus DCVS, Adreno discovery, FPS monitor, dex2oat, debloater, SetEdit | Ya | Ya (DCVS) |
| AZenith | Game detection, thermal core, CPU freq limiter, bypass charge, game preload, profiler | Ya | No (universal) |
| Encore | Snapdragon bus DCVS, DDR/LLC/L3, scheduler, I/O, memory, thermal, network | Ya | Ya (SD profiles) |
| SkiaShift | Per-app GPU renderer (Vulkan/OpenGL), ShadowHook | Ya (LSPosed) | No |
| COPG | Device/CPU spoofing, GOT/PLT hook, comfort tweaks | Ya (Zygisk) | No |
| DPIS | Per-app DPI/scale/font, DisplayMetrics hooks, system server hooks | Ya (Xposed) | No |
| Shizuku | Binder IPC, privileged API, UserService | ADB/Root | No |
| Shizuku-API | API interface, BinderWrapper | ADB/Root | No |

---

## Phase 4: Selection

User memilih fitur dari feature catalog berdasarkan:
- **Root mode:** non-root/Shizuku/full-root
- **Prioritas:** fitur mana yang paling dibutuhkan
- **MVP scope:** CPU governor switching dulu

### MVP Feature Set (CPU Governor)

| Feature | Source | Complexity |
|---------|--------|-----------|
| Read current governor | Xtra-Kernel | Low |
| List available governors | Xtra-Kernel | Low |
| Write governor | Xtra-Kernel | Medium |
| CPU cluster detection | Xtra-Kernel | Medium |
| UI: dropdown selector | Kotlin | Medium |
| Root check | Shizuku pattern | Low |

---

## Phase 5: Implementation

### Step 1: Rust SDK Foundation
- `rust/kernel-manager/src/sysfs/rw.rs` — core read/write
- `rust/kernel-manager/src/cpu/governor.rs` — governor r/w
- `rust/kernel-manager/src/root/su.rs` — root detection

### Step 2: Android App MVP
- `android/app/` — Kotlin/Compose
- JNI bridge to Rust SDK
- Single screen: CPU Governor selector

### Step 3: Testing
- Manual test via adb + kernel manager
- Verify governor read/write on POCO X3 NFC

### Step 4: Expand
- Add features from selected sources
- GPU tuning, thermal, battery, etc.

---

## Commands

### Resume Progress
```
# Open new session, then say:
"Resume plan: jalankan Phase 2 step [X] dari knowledge/index/[source].md"
```

### Check Status
```
# Check current progress:
"Status plan: berapa persen progress?"
```

### Start New Phase
```
# After all study done, start summary:
"Summary: buat feature catalog dari knowledge/modules/"
```

### Implementation
```
# Start MVP:
"Implement: bikin CPU governor switching dengan Rust SDK"

# Add feature:
"Implement: tambah GPU renderer switching dari SkiaShift"
```

---

## File Reference

| File | Fungsi |
|------|--------|
| `training/plan.md` | This file — master plan |
| `knowledge/INDEX.md` | Master index (2,115 files) |
| `knowledge/index/*.md` | Per-source file index |
| `knowledge/modules/*.md` | Extracted knowledge |
| `knowledge/rust-sdk.md` | Rust SDK design |
| `training/log.md` | Daily log |
