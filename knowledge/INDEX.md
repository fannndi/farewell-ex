# Knowledge Index — Master Index (Modular)

Target Device: POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618, KernelSU)
Total core files: 2,115 across 16 repos
Progress: 2,115/2,115 (100%) — VERIFIED

---

## Feature Catalog

See `feature-catalog.md` — 15 categories, 200+ features, each with source, sysfs path, root requirement, and complexity.

---

## Per-Source Index Files

### Kernel Management (11 sources)
| # | Source | Core Files | Modular Index |
|---|--------|------------|---------------|
| 1 | SmartPack-Kernel-Manager | 385 | `index/01-SmartPack-Kernel-Manager.md` |
| 2 | Xtra-Kernel-Manager | 268 | `index/02-Xtra-Kernel-Manager.md` |
| 3 | RvKernel-Manager | 100 | `index/03-RvKernel-Manager.md` |
| 4 | ZKM | 322 | `index/04-ZKM.md` |
| 5 | AZenith | 81 | `index/05-AZenith.md` |
| 6 | Encore | 65 | `index/06-Encore.md` |
| 7 | SkiaShift | 24 | `index/07-SkiaShift.md` |
| 8 | COPG | 18 | `index/08-COPG.md` |
| 9 | DPIS | 477 | `index/09-DPIS.md` |
| 10 | Shizuku | 271 | `index/10-Shizuku.md` |
| 11 | Shizuku-API | 104 | `index/11-Shizuku-API.md` |

### Framework & Tooling (5 sources)
| # | Source | Purpose | Modular Index |
|---|--------|---------|---------------|
| 12 | ZygiskNext | Standalone Zygisk | `modules/21-zygisknext.md` |
| 13 | Vector | Modern Xposed (LSPlant) | `modules/22-vector.md` |
| 14 | KernelSU-Next | Kernel-based root | `modules/23-kernelsu-next.md` |
| 15 | ZN-AuditPatch | Audit log replacement | `modules/24-zn-auditpatch.md` |
| 16 | LogFox | Crash logging | `modules/25-logfox.md` |

---

## Study Order

### Original 11 Sources (Kernel Features)
| Phase | Source | Focus | Files |
|-------|--------|-------|-------|
| 1 | Xtra-Kernel Kotlin | JNI bridge + root manager | ~16 |
| 2 | Encore Tweaks | Snapdragon sysfs writes | ~19 |
| 3 | SkiaShift + DPIS | GPU/DPI per-app | ~15 |
| 4 | SmartPack | Sysfs catalog reference | ~30 |
| 5 | ZKM | Bus DCVS + GPU discovery | ~15 |
| 6 | AZenith | C daemon + game detection | ~10 |
| 7 | COPG | CPU spoofing | ~5 |
| 8 | Shizuku/API | Root alternative | ~10 |
| 9 | RvKernel | Material 3 baseline | ~10 |

### New 5 Sources (Framework Detection)
| Phase | Source | Focus | Files |
|-------|--------|-------|-------|
| 10 | KernelSU-Next | Kernel root detection | ~10 |
| 11 | ZygiskNext | Zygisk detection + API | ~5 |
| 12 | Vector | Xposed detection + API | ~5 |
| 13 | ZN-AuditPatch | Audit log patterns | ~3 |
| 14 | LogFox | Crash logging + export | ~10 |
| 15 | FPSViewer | FPS overlay + SurfaceFlinger latency | ~5 |
