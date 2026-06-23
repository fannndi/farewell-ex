package defpackage;

import android.app.NotificationChannel;
import android.app.usage.StorageStatsManager;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ig0 {
    public static /* bridge */ /* synthetic */ Class A() {
        return ZoneOffset.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return ZoneId.class;
    }

    public static /* synthetic */ NotificationChannel f(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ StorageStatsManager g(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return LocalDate.class;
    }

    public static /* bridge */ /* synthetic */ Duration j(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Year l(Object obj) {
        return (Year) obj;
    }

    public static /* bridge */ /* synthetic */ YearMonth n(Object obj) {
        return (YearMonth) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneId o(Object obj) {
        return (ZoneId) obj;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return LocalTime.class;
    }
}
