package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class db2 {
    public static final gb2 b;

    /* renamed from: a, reason: collision with root package name */
    public final gb2 f184a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new ta2() : i >= 35 ? new sa2() : i >= 34 ? new ra2() : i >= 31 ? new qa2() : i >= 30 ? new pa2() : i >= 29 ? new oa2() : new na2()).b().f329a.a().f329a.b().f329a.c();
    }

    public db2(gb2 gb2Var) {
        this.f184a = gb2Var;
    }

    public gb2 a() {
        return this.f184a;
    }

    public gb2 b() {
        return this.f184a;
    }

    public gb2 c() {
        return this.f184a;
    }

    public void d(View view) {
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2)) {
            return false;
        }
        db2 db2Var = (db2) obj;
        return s() == db2Var.s() && r() == db2Var.r() && Objects.equals(m(), db2Var.m()) && Objects.equals(k(), db2Var.k()) && Objects.equals(g(), db2Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public f50 g() {
        return null;
    }

    public mm0 h(int i) {
        return mm0.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public mm0 i(int i) {
        if ((i & 8) == 0) {
            return mm0.e;
        }
        c.m("Unable to query the maximum insets for IME");
        return null;
    }

    public mm0 j() {
        return m();
    }

    public mm0 k() {
        return mm0.e;
    }

    public mm0 l() {
        return m();
    }

    public mm0 m() {
        return mm0.e;
    }

    public mm0 n() {
        return m();
    }

    public void o(View view) {
    }

    public void p() {
    }

    public gb2 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public void t(l50 l50Var) {
    }

    public void u(mm0[] mm0VarArr) {
    }

    public void v(gb2 gb2Var) {
    }

    public void w(mm0 mm0Var) {
    }

    public void x(int i) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }
}
