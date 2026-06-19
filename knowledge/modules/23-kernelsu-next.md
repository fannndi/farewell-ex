# Module 23: KernelSU-Next — Kernel-Based Root

**Source:** `KernelSU-Next/` 
**Status:** ✅ EXTRACTED

## Architecture

Kernel-level root with module system and App Profile.

```
KernelSU-Next
├── Kernel Module (init.c) → syscall hooks, LSM patches, kprobes
├── Supercalls → IOCTL on anonymous inode fd
├── Module System → Magic Mount + OverlayFS
├── App Profile → Per-app root/non-root credentials
├── ksud (Rust) → Userspace daemon, su binary, module manager
└── SELinux → Custom domain u:r:ksu:s0, live policy injection
```

## Root Grant Flow

1. Zygote fork → `setresuid` hook intercepts
2. If UID in allowlist → install KSU fd via `ksu_install_fd()`
3. App calls `su` → `ksucalls::grant_root()` → IOCTL
4. Kernel: `escape_with_root_profile()` → `commit_creds()`

## Module System

```
/data/adb/modules/<id>/
├── module.prop     ← metadata
├── system/         ← Magic Mount overlay
├── sepolicy.rule   ← SELinux rules
├── system.prop     ← Properties
├── post-fs-data.sh ← Boot stage scripts
├── services.sh
└── boot-completed.sh
```

## Detection Methods

| Method | Path/Command |
|--------|-------------|
| KSU dir | `/data/adb/ksu/` |
| Kernel module | `/sys/module/ksu` or `/sys/module/kernelsu` |
| ksud binary | `/data/adb/ksud` |
| ksud version | `ksud --version` |

## Anti-Detection

- Module umount for non-root apps (per-profile)
- SELinux hiding
- Uname spoofing (`CHANGE_SPOOF_UNAME`)
- ext4 sysfs hiding (`KSU_IOCTL_NUKE_EXT4_SYSFS`)

## Integration for Kernel Manager

1. Detect KernelSU-Next via module paths + kernel module
2. Use App Profile for per-app root control
3. Module system for Magisk-compatible modules
4. IOCTL interface for direct kernel communication
