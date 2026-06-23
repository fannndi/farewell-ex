package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mn1 {

    /* renamed from: a, reason: collision with root package name */
    public float f647a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public mn1() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        in1 in1Var = new in1(f4, f5, f4, f5);
        in1Var.f = this.e;
        in1Var.g = f3;
        this.h.add(new gn1(in1Var));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kn1) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        jn1 jn1Var = new jn1();
        jn1Var.b = f;
        jn1Var.c = f2;
        this.g.add(jn1Var);
        hn1 hn1Var = new hn1(jn1Var, this.c, this.d);
        float b = hn1Var.b() + 270.0f;
        float b2 = hn1Var.b() + 270.0f;
        a(b);
        this.h.add(hn1Var);
        this.e = b2;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.f647a = f;
        this.b = f2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = (f3 + f4) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
