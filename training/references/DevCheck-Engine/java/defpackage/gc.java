package defpackage;

/* loaded from: classes.dex */
public class gc {
    public final float[] b;

    /* renamed from: a, reason: collision with root package name */
    public int f330a = 0;
    public float c = 1.0f;

    public gc(int i, boolean z) {
        this.b = new float[i];
    }

    public final void a(float f, float f2, float f3, float f4) {
        int i = this.f330a;
        int i2 = i + 1;
        this.f330a = i2;
        float[] fArr = this.b;
        fArr[i] = f;
        int i3 = i + 2;
        this.f330a = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f330a = i4;
        fArr[i3] = f3;
        this.f330a = i + 4;
        fArr[i4] = f4;
    }

    public void b(jc jcVar) {
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
                a(f4, f6, f5, f3);
            }
        }
        this.f330a = 0;
    }
}
