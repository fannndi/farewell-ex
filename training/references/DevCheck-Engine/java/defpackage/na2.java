package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class na2 extends ua2 {
    public static Field g;
    public static boolean h;
    public static Constructor i;
    public static boolean j;
    public WindowInsets e;
    public mm0 f;

    public na2() {
        this.e = j();
    }

    public na2(gb2 gb2Var) {
        super(gb2Var);
        this.e = gb2Var.g();
    }

    public static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.ua2
    public gb2 b() {
        a();
        gb2 h2 = gb2.h(null, this.e);
        mm0[] mm0VarArr = this.b;
        db2 db2Var = h2.f329a;
        db2Var.u(mm0VarArr);
        db2Var.w(this.f);
        db2Var.t(null);
        db2Var.y(this.c);
        db2Var.z(this.d);
        return h2;
    }

    @Override // defpackage.ua2
    public void f(mm0 mm0Var) {
        this.f = mm0Var;
    }

    @Override // defpackage.ua2
    public void h(mm0 mm0Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(mm0Var.f643a, mm0Var.b, mm0Var.c, mm0Var.d);
        }
    }
}
