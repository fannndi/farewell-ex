# farewell-ex — Kernel Manager (Rust/Android)

**Target Device:** POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618)
**Root:** KernelSU
**Goal:** Reverse engineering 11 source repos → Rust kernel manager library → Android app

## Source References (cloned, gitignored — `training/references/`)

### Kernel Managers
| Repo | Files | Language | Fokus |
|------|-------|----------|-------|
| Xtra-Kernel-Manager | 451 | Kotlin + **Rust JNI** | High-perf native reader, modern UI |
| SmartPack-Kernel-Manager | 452 | Java | Battle-tested, comprehensive sysfs |
| RvKernel-Manager | 118 | Kotlin/Compose | Minimalis, dynamic sysfs probing |
| ZKM | 443 | Kotlin/Compose | Bus DCVS, GPU discovery, enterprise suite |

### Performance & Gaming Modules
| Repo | Files | Language | Fokus |
|------|-------|----------|-------|
| AZenith | 150 (C+) | C + Kotlin | KernelSU module, game detection, thermal core |
| Encore Tweaks | 242 | C++ + Vue | Profile-style performance tuner, native daemon |
| SkiaShift | 47 | Kotlin + C++ | Per-app GPU renderer (Vulkan/OpenGL) |
| COPG | 64 | C++ + shell | Zygisk device/CPU spoofing |

### Frameworks & Utilities
| Repo | Files | Language | Fokus |
|------|-------|----------|-------|
| Shizuku | 300 | Java/Kotlin | Root alternative via Binder IPC |
| Shizuku-API | 119 | Java/Kotlin | Shizuku API interface |
| DPIS | 788 | Java | Per-app DPI/font scaling (Xposed) |

## Progress

| Source | Indexed | TODO | Status |
|--------|---------|------|--------|
| Xtra-Kernel Rust | 12 | 0 | ✅ DONE |
| Xtra-Kernel Kotlin | 0 | 16 | ⬜ |
| SmartPack | 0 | 31 | ⬜ |
| RvKernel | 0 | 10 | ⬜ |
| ZKM | 0 | 14 | ⬜ |
| AZenith | 0 | 19 | ⬜ |
| Encore Tweaks | 0 | 19 | ⬜ |
| SkiaShift | 0 | 5 | ⬜ |
| COPG | 0 | 5 | ⬜ |
| DPIS | 0 | 10 | ⬜ |
| Shizuku | 0 | 7 | ⬜ |
| Shizuku-API | 0 | 7 | ⬜ |
| **Total** | **14** | **231** | **5.7%** |

## Methodology

1. **Index** — Catalog setiap file dari 11 sources (245 files total)
2. **Study per-file** — Reverse engineering per-function per-module
3. **Extract knowledge** → `knowledge/modules/`
4. **Build Rust SDK** → `rust/kernel-manager/` (Phase 2)
5. **Android app** → `android/app/` (Phase 3)

## Knowledge Base

| File | Isi |
|------|-----|
| `knowledge/INDEX.md` | Master index — 245 files, 11 sources |
| `knowledge/rust-sdk.md` | Rust SDK design template |
| `knowledge/modules/12-sysfs-rw.md` | JNI bridge + sysfs architecture |

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

## Files

```
farewell-ex/
├── README.md
├── .gitignore                       ← ignores training/references/
├── knowledge/
│   ├── INDEX.md                     ← 245 file entries
│   ├── rust-sdk.md                  ← Rust SDK design
│   └── modules/                     ← extracted knowledge per module
├── training/
│   ├── references/                  ← (gitignored) 11 cloned repos
│   └── log.md                       ← (gitignored) daily training log
├── rust/kernel-manager/             ← (Phase 2)
└── android/app/                     ← (Phase 3)
```
