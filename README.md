# farewell-ex — Kernel Manager (Rust/Android)

**Target Device:** POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618)
**Root:** KernelSU
**Goal:** Reverse engineering 11 source repos → Rust kernel manager library → Android app

---

## Commands (untuk Session Baru)

### Resume Progress
Ketik di session baru:
```
Resume plan: lanjut Phase 2 step berikutnya dari training/plan.md
```

### Check Status
```
Status plan: berapa persen progress, file mana yang sudah dipelajari
```

### Start New Phase
Setelah Phase 2 selesai:
```
Summary: buat feature catalog dari knowledge/modules/ per source
```

### Implementation
```
Implement: bikin CPU governor switching dengan Rust SDK (MVP)
Implement: tambah GPU renderer switching dari SkiaShift
Implement: tambah thermal management dari AZenith
```

---

## Source References (gitignored — `training/references/`)

### Kernel Managers
| Repo | Files | Language | Fokus |
|------|-------|----------|-------|
| Xtra-Kernel-Manager | 451 | Kotlin + **Rust JNI** | High-perf native reader, modern UI |
| SmartPack-Kernel-Manager | 452 | Java | Battle-tested, comprehensive sysfs |
| RvKernel-Manager | 118 | Kotlin/Compose | Minimalis, dynamic sysfs probing |
| ZKM | 443 | Kotlin/Compose | Bus DCVS, GPU discovery |

### Performance & Gaming Modules
| Repo | Files | Language | Fokus |
|------|-------|----------|-------|
| AZenith | 150 | C + Kotlin | KernelSU module, game detection, thermal core |
| Encore Tweaks | 242 | C++ + Vue | Profile-style tuner, native daemon |
| SkiaShift | 47 | Kotlin + C++ | Per-app GPU renderer (Vulkan/OpenGL) |
| COPG | 64 | C++ + shell | Zygisk device/CPU spoofing |

### Frameworks & Utilities
| Repo | Files | Language | Fokus |
|------|-------|----------|-------|
| Shizuku | 300 | Java/Kotlin | Root alternative via Binder IPC |
| Shizuku-API | 119 | Java/Kotlin | Shizuku API interface |
| DPIS | 788 | Java | Per-app DPI/font scaling |

---

## Progress

| Source | Core Files | Study Status |
|--------|------------|-------------|
| Xtra-Kernel Rust | 12 | ✅ DONE |
| Xtra-Kernel Kotlin | 16 | ✅ DONE |
| Encore Tweaks | 19 | ✅ DONE |
| SkiaShift | 5 | ✅ DONE |
| DPIS | 10 | ✅ DONE |
| SmartPack | 31 | ✅ DONE |
| ZKM | 14 | ✅ DONE |
| AZenith | 19 | ✅ DONE |
| COPG | 5 | ✅ DONE |
| Shizuku | 7 | ✅ DONE |
| Shizuku-API | 7 | ✅ DONE |
| **Total** | **2,115** | **2,115 (100%)** |

---

## Knowledge Base

| File | Isi |
|------|-----|
| `knowledge/INDEX.md` | Master index — 2,115 files, modular per source |
| `knowledge/index/*.md` | Per-source file index (11 files) |
| `knowledge/rust-sdk.md` | Rust SDK design template |
| `knowledge/modules/12-sysfs-rw.md` | JNI bridge + sysfs architecture |
| `knowledge/modules/13-kotlin-bridge.md` | Kotlin JNI bridge + RootManager |
| `knowledge/modules/14-encore-tweaks.md` | Native daemon + shell profiler |
| `knowledge/modules/15-skiashift.md` | Per-app GPU renderer control |
| `knowledge/modules/16-smartpack-catalog.md` | Comprehensive sysfs catalog |
| `knowledge/modules/17-dpis.md` | Per-app DPI/font scaling |
| `knowledge/modules/18-zkm.md` | Zygisk kernel manager + Bus DCVS |
| `knowledge/modules/19-azenith.md` | KernelSU game module |
| `knowledge/modules/20-copg-shizuku-rvkernel.md` | CPU spoofing + Binder IPC + Material 3 |
| `knowledge/feature-catalog.md` | 200+ features across 14 categories |
| `training/plan.md` | Master plan + progress tracker |

---

## Cross-Reference (POCO X3 NFC)

| Komponen | Source Terbaik | Alasan |
|----------|---------------|--------|
| **App UI** | XKM + RvKernel | Kotlin/Compose + Material 3 |
| **Native perf** | XKM | Rust JNI for zero-overhead sysfs reads |
| **Sysfs catalog** | SmartPack | Comprehensive, battle-tested |
| **GPU tuning** | ZKM + XKM | Adreno BusDCVS, multi-vendor |
| **Background daemon** | Encore | Native C daemon pattern |
| **GPU renderer** | SkiaShift | Per-app Vulkan/OpenGL override |
| **Root API** | Shizuku | Binder IPC (faster than shell) |
| **Profiles** | AZenith + RvKernel | Game-based auto-switch |
| **CPU spoofing** | COPG | Zygisk GOT/PLT hooks |
| **Thermal** | SmartPack + AZenith | MSM thermal + game mode |

---

## Files

```
farewell-ex/
├── README.md
├── .gitignore
├── knowledge/
│   ├── INDEX.md                 ← Master index (2,115 files)
│   ├── index/                   ← Per-source modular indexes (11 files)
│   │   ├── 01-SmartPack-Kernel-Manager.md
│   │   ├── 02-Xtra-Kernel-Manager.md
│   │   ├── 03-RvKernel-Manager.md
│   │   ├── 04-ZKM.md
│   │   ├── 05-AZenith.md
│   │   ├── 06-Encore.md
│   │   ├── 07-SkiaShift.md
│   │   ├── 08-COPG.md
│   │   ├── 09-DPIS.md
│   │   ├── 10-Shizuku.md
│   │   └── 11-Shizuku-API.md
│   ├── rust-sdk.md              ← Rust SDK design
│   └── modules/                 ← Extracted knowledge per module
├── training/
│   ├── plan.md                  ← Master plan + progress tracker
│   ├── references/              ← (gitignored) 11 cloned repos
│   └── log.md                   ← (gitignored) daily training log
├── rust/kernel-manager/         ← (Phase 2)
└── android/app/                 ← (Phase 3)
```
