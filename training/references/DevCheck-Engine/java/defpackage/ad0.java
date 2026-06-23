package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class ad0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21a;
    public final int b;
    public final Notification c;

    public ad0(int i, Notification notification, int i2) {
        this.f21a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad0.class != obj.getClass()) {
            return false;
        }
        ad0 ad0Var = (ad0) obj;
        if (this.f21a == ad0Var.f21a && this.b == ad0Var.b) {
            return this.c.equals(ad0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f21a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f21a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
