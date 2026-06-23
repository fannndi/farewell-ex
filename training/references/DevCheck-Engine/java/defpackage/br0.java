package defpackage;

/* loaded from: classes.dex */
public final class br0 {

    /* renamed from: a, reason: collision with root package name */
    public int f96a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    public final int a() {
        return this.d ? (int) (this.f96a * this.c) : this.b;
    }

    public final int b() {
        return !this.y ? a() : this.x ? (int) (this.f96a * this.w) : this.v;
    }

    public final boolean c(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public final void d() {
        if (this.i < 0) {
            c.m("indicatorTrackGapSize must be >= 0.");
            return;
        }
        if (this.t < 0) {
            c.m("Stop indicator size must be >= 0.");
            return;
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && b() > 0)) && this.i == 0) {
                c.m("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.e.length >= 3) {
                    return;
                }
                c.m("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
