package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class up1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1051a;
    public int b;
    public final ld0 c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final je0 h;

    public up1(int i, int i2, je0 je0Var, eo eoVar) {
        ld0 ld0Var = je0Var.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.f1051a = i;
        this.b = i2;
        this.c = ld0Var;
        eoVar.b(new h70(this));
        this.h = je0Var;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        HashSet hashSet = this.e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((eo) obj).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (ae0.H(2)) {
                toString();
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int A = d51.A(i2);
        ld0 ld0Var = this.c;
        if (A == 0) {
            if (this.f1051a != 1) {
                if (ae0.H(2)) {
                    Objects.toString(ld0Var);
                }
                this.f1051a = i;
                return;
            }
            return;
        }
        if (A != 1) {
            if (A != 2) {
                return;
            }
            if (ae0.H(2)) {
                Objects.toString(ld0Var);
            }
            this.f1051a = 1;
            this.b = 3;
            return;
        }
        if (this.f1051a == 1) {
            if (ae0.H(2)) {
                Objects.toString(ld0Var);
            }
            this.f1051a = 2;
            this.b = 2;
        }
    }

    public final void d() {
        int i = this.b;
        je0 je0Var = this.h;
        if (i != 2) {
            if (i == 3) {
                ld0 ld0Var = je0Var.c;
                View j0 = ld0Var.j0();
                if (ae0.H(2)) {
                    Objects.toString(j0.findFocus());
                    j0.toString();
                    ld0Var.toString();
                }
                j0.clearFocus();
                return;
            }
            return;
        }
        ld0 ld0Var2 = je0Var.c;
        View findFocus = ld0Var2.M.findFocus();
        if (findFocus != null) {
            ld0Var2.s().k = findFocus;
            if (ae0.H(2)) {
                findFocus.toString();
                ld0Var2.toString();
            }
        }
        View j02 = this.c.j0();
        if (j02.getParent() == null) {
            je0Var.b();
            j02.setAlpha(0.0f);
        }
        if (j02.getAlpha() == 0.0f && j02.getVisibility() == 0) {
            j02.setVisibility(4);
        }
        jd0 jd0Var = ld0Var2.P;
        j02.setAlpha(jd0Var == null ? 1.0f : jd0Var.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i = this.f1051a;
        String str = "null";
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sb.append("} {mLifecycleImpact = ");
        int i2 = this.b;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "ADDING";
        } else if (i2 == 3) {
            str = "REMOVING";
        }
        sb.append(str);
        sb.append("} {mFragment = ");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
