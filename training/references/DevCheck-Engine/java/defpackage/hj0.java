package defpackage;

/* loaded from: classes.dex */
public final class hj0 extends gc {
    @Override // defpackage.gc
    public final void b(jc jcVar) {
        float size = jcVar.j.size() * 1.0f;
        float f = this.c / 2.0f;
        for (int i = 0; i < size; i++) {
            ad adVar = (ad) jcVar.g(i);
            if (adVar != null) {
                float f2 = adVar.i;
                float f3 = adVar.g;
                float f4 = f2 - f;
                float f5 = f2 + f;
                float f6 = f3 >= 0.0f ? f3 : 0.0f;
                if (f3 > 0.0f) {
                    f3 = 0.0f;
                }
                if (f6 > 0.0f) {
                    f6 *= 1.0f;
                } else {
                    f3 *= 1.0f;
                }
                a(f3, f5, f6, f4);
            }
        }
        this.f330a = 0;
    }
}
