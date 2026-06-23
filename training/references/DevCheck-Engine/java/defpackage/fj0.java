package defpackage;

import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;

/* loaded from: classes.dex */
public final class fj0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f283a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public fj0(float f, float f2, float f3, float f4, int i, int i2) {
        this.f283a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
    }

    public final boolean a(fj0 fj0Var) {
        return fj0Var != null && this.e == fj0Var.e && this.f283a == fj0Var.f283a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Highlight, x: ");
        sb.append(this.f283a);
        sb.append(ILBLnlCHDVqsSN.gCxKzi);
        sb.append(this.b);
        sb.append(", dataSetIndex: ");
        return d51.t(sb, this.e, ", stackIndex (only stacked barentry): -1");
    }
}
