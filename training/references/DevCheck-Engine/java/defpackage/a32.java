package defpackage;

import android.telephony.fHMN.BFtDZYxPcpGN;

/* loaded from: classes.dex */
public final class a32 implements d22 {
    public final /* synthetic */ Class g;
    public final /* synthetic */ Class h;
    public final /* synthetic */ c22 i;

    public a32(Class cls, Class cls2, c22 c22Var) {
        this.g = cls;
        this.h = cls2;
        this.i = c22Var;
    }

    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        Class cls = l32Var.f569a;
        if (cls == this.g || cls == this.h) {
            return this.i;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.h.getName() + "+" + this.g.getName() + BFtDZYxPcpGN.xrPxHlWFCQzgz + this.i + "]";
    }
}
