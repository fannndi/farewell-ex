package defpackage;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ua2 {

    /* renamed from: a, reason: collision with root package name */
    public final gb2 f1030a;
    public mm0[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public ua2() {
        this(new gb2());
    }

    public ua2(gb2 gb2Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.f1030a = gb2Var;
        c(gb2Var);
    }

    public final void a() {
        mm0[] mm0VarArr = this.b;
        if (mm0VarArr != null) {
            mm0 mm0Var = mm0VarArr[0];
            mm0 mm0Var2 = mm0VarArr[1];
            gb2 gb2Var = this.f1030a;
            if (mm0Var2 == null) {
                mm0Var2 = gb2Var.f329a.h(2);
            }
            if (mm0Var == null) {
                mm0Var = gb2Var.f329a.h(1);
            }
            h(mm0.a(mm0Var, mm0Var2));
            mm0 mm0Var3 = this.b[d10.F(16)];
            if (mm0Var3 != null) {
                g(mm0Var3);
            }
            mm0 mm0Var4 = this.b[d10.F(32)];
            if (mm0Var4 != null) {
                e(mm0Var4);
            }
            mm0 mm0Var5 = this.b[d10.F(64)];
            if (mm0Var5 != null) {
                i(mm0Var5);
            }
        }
    }

    public abstract gb2 b();

    public void c(gb2 gb2Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = gb2Var.f329a.e(i);
            int F = d10.F(i);
            this.c[F] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = gb2Var.f329a.f(i);
                this.d[F] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, mm0 mm0Var) {
        if (this.b == null) {
            this.b = new mm0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[d10.F(i2)] = mm0Var;
            }
        }
    }

    public void e(mm0 mm0Var) {
    }

    public abstract void f(mm0 mm0Var);

    public void g(mm0 mm0Var) {
    }

    public abstract void h(mm0 mm0Var);

    public void i(mm0 mm0Var) {
    }
}
