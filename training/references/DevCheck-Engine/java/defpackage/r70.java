package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class r70 {

    /* renamed from: a, reason: collision with root package name */
    public int f875a;
    public final Object b;
    public final Object c;

    public r70(int i, String str, String str2) {
        this.f875a = i;
        this.b = str;
        this.c = str2;
    }

    public r70(de1 de1Var) {
        this.f875a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = de1Var;
    }

    public r70(t70 t70Var) {
        this.f875a = 0;
        this.c = new p10();
        this.b = t70Var;
    }

    public static r70 b(de1 de1Var, int i) {
        if (i == 0) {
            return new j51(de1Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new j51(de1Var, i2);
        }
        c.m("invalid orientation");
        return null;
    }

    public abstract void a(ti1 ti1Var);

    public abstract void c(ti1 ti1Var);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(ti1 ti1Var);

    public abstract void s(ti1 ti1Var);

    public abstract void t(ti1 ti1Var);

    public abstract void u(ti1 ti1Var);

    public abstract eh1 v(ti1 ti1Var);
}
