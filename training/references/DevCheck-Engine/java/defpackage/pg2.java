package defpackage;

import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class pg2 extends wg1 {
    public final PendingIntent g;
    public final boolean h;

    public pg2(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            jw0.f("Null pendingIntent");
            throw null;
        }
        this.g = pendingIntent;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wg1) {
            pg2 pg2Var = (pg2) ((wg1) obj);
            if (this.g.equals(pg2Var.g) && this.h == pg2Var.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.h ? 1237 : 1231) ^ ((this.g.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder w = d51.w("ReviewInfo{pendingIntent=", this.g.toString(), ", isNoOp=");
        w.append(this.h);
        w.append("}");
        return w.toString();
    }
}
