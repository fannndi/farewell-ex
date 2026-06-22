#!/system/bin/sh
# Farewell ZygiskNext Companion — post-fs-data
# Deployed by KernelSU module manager

MODDIR=${0%/*}

# Wait for zygote
while [ "$(getprop init.svc.zygote)" != "running" ]; do
    sleep 1
done

# Module already loaded by ZygiskNext
# Config sync handled by app via JNI
