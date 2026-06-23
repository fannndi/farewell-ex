package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class n91 implements eq0 {
    public static final n91 o = new n91();
    public int g;
    public int h;
    public Handler k;
    public boolean i = true;
    public boolean j = true;
    public final gq0 l = new gq0(this);
    public final r60 m = new r60(12, this);
    public final h70 n = new h70(this);

    public final void b() {
        int i = this.h + 1;
        this.h = i;
        if (i == 1) {
            if (this.i) {
                this.l.d(xp0.ON_RESUME);
                this.i = false;
            } else {
                Handler handler = this.k;
                handler.getClass();
                handler.removeCallbacks(this.m);
            }
        }
    }

    @Override // defpackage.eq0
    public final gq0 q() {
        return this.l;
    }
}
