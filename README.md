# farelwel-ex — Kernel Manager (Rust/Android)

**Target Device:** POCO X3 NFC (Qualcomm SM7150-AC, Adreno 618)
**Root:** KernelSU
**Goal:** Reverse engineering → Rust kernel manager library → Android app

## Source References (cloned, gitignored)

| Repo | Files | Fokus |
|------|-------|-------|
| SmartPack-Kernel-Manager | 452 | Java, battle-tested, **paling komplit** |
| Xtra-Kernel-Manager | 451 | Kotlin+Rust, high-perf native reader |
| ZKM | 443 | Kotlin/Compose, bus DCVS, GPU discovery |
| RvKernel-Manager | 118 | Kotlin/Compose, minimalis, dynamic probing |
| Shizuku | 300 | Root alternative via Binder IPC |
| Shizuku-API | 119 | Shizuku API interface |
| AZenith | 11 | KernelSU module, C daemon (closed source) |

## Methodology

1. Study source files per-function per-module
2. Extract knowledge ke `knowledge/modules/`
3. Build Rust SDK dari hasil reverse engineering
4. Integrasi ke Android app via JNI

## Progress

See `knowledge/INDEX.md` for file study status
See `training/log.md` for daily log
