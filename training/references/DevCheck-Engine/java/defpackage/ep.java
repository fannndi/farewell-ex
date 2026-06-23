package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;

/* loaded from: classes.dex */
public final class ep extends fp {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f243a;

    public ep(Throwable th) {
        this.f243a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ep) {
            return ym0.b(this.f243a, ((ep) obj).f243a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f243a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fp
    public final String toString() {
        return GFUHKHDfiFuPm.TcxbmoNlmBMfBx + this.f243a + ')';
    }
}
