#!/system/bin/sh
# Farewell Companion — post-fs-data
# KernelSU module entry point

MODDIR=${0%/*}

# SELinux context untuk sysfs access
for sysfs in /sys/devices/system/cpu/*/cpufreq /sys/class/kgsl/kgsl-3d0 /sys/class/power_supply/battery /sys/class/thermal/thermal_message; do
    [ -e "$sysfs" ] && chmod 755 "$sysfs" 2>/dev/null
done

# Sync config dari app ke companion module
CONFIG_SRC="/data/local/tmp/farewell_companion_config.json"
CONFIG_DST="$MODDIR/config.json"
[ -f "$CONFIG_SRC" ] && cp "$CONFIG_SRC" "$CONFIG_DST"

# Mark companion as active
touch "$MODDIR/.active"
