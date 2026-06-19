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
| 2. STUDY PER-FILE | ✅ VERIFIED | 2,115/2,115 | All 11 sources verified — 9 knowledge modules with source-level detail |
| 3. SUMMARY | ✅ DONE | 14 kategori, 200+ fitur | feature-catalog.md |
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
| Xtra-Kernel Kotlin | 16 | 16 | ✅ |
| Encore | 19 | 19 | ✅ |
| SkiaShift | 5 | 5 | ✅ |
| DPIS | 10 | 10 | ✅ |
| SmartPack | 31 | 31 | ✅ |
| ZKM | 14 | 14 | ✅ |
| AZenith | 19 | 19 | ✅ |
| COPG | 5 | 5 | ✅ |
| Shizuku | 7 | 7 | ✅ |
| Shizuku-API | 7 | 7 | ✅ |
| RvKernel | 10 | 10 | ✅ |

---

## Phase 3: Summary (Feature Catalog)

Phase 2 DONE — all 2,115 files studied, 9 knowledge modules written. VERIFIED with source code line-by-line reads for critical files.

**Feature Catalog:** `knowledge/feature-catalog.md` — 15 kategori, 200+ fitur, setiap fitur dengan source, sysfs path, root requirement, complexity.

| Kategori | Fitur | Sources |
|----------|-------|---------|
| CPU Freq/Governor | Read/write, limiting, cluster detect, hotplug, boost | Xtra-Kernel, SmartPack, Encore, RvKernel |
| GPU Control | Freq, power levels, busy/temp, Adreno specifics, Bus DCVS | Xtra-Kernel, ZKM, SmartPack, Encore |
| Memory/ZRAM | MemInfo, ZRAM stats, algorithm, VM params | Xtra-Kernel, RvKernel |
| Thermal | Zones, profiles, MSM thermal, EARA | Xtra-Kernel, AZenith, SmartPack, Encore |
| Power/Battery | Status, charging control, bypass, stats | Xtra-Kernel, AZenith, SmartPack |
| I/O Scheduler | Scheduler, read-ahead, nr_requests | SmartPack, RvKernel, Encore |
| Scheduler/Tuning | Sched features, stune, BORE, uclamp, EAS | SmartPack, RvKernel, Encore, AZenith |
| Network | TCP congestion, WireGuard | RvKernel, Xtra-Kernel |
| Display | Refresh rate, brightness, KCAL, DPI override | AZenith, Xtra-Kernel, SmartPack, DPIS |
| Gaming | Game detection, DND, Monster Mode, GPU renderer switch | AZenith, Xtra-Kernel, Encore, SkiaShift |
| Spoofing/Hooks | Device spoof, CPU spoof, COW prop, property hooks | COPG, SkiaShift, DPIS |
| Root/IPC | libsu, Shizuku Binder IPC | Xtra-Kernel, Shizuku, Shizuku-API |
| Kernel Parameters | SELinux, DMESG, version | RvKernel, Xtra-Kernel |
| Profiles/Boot | Set-on-boot, profiles, TOML import/export | SmartPack, Xtra-Kernel, Encore |

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
