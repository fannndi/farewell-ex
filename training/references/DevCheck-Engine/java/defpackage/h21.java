package defpackage;

import android.net.NetworkRequest;

/* loaded from: classes.dex */
public final class h21 {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f361a;

    static {
        ai1.k("NetworkRequestCompat");
    }

    public h21(NetworkRequest networkRequest) {
        this.f361a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h21) && ym0.b(this.f361a, ((h21) obj).f361a);
    }

    public final int hashCode() {
        Object obj = this.f361a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f361a + ')';
    }
}
