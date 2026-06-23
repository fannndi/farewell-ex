package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class td1 {

    /* renamed from: a, reason: collision with root package name */
    public final ud1 f983a = new ud1();
    public boolean b = false;
    public int c = 1;

    public final void a(te1 te1Var, int i) {
        td1 td1Var = te1Var.y;
        View view = te1Var.g;
        boolean z = td1Var == null;
        if (z) {
            te1Var.i = i;
            if (this.b) {
                te1Var.k = d(i);
            }
            te1Var.p = (te1Var.p & (-520)) | 1;
            if (q02.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(te1Var.l)));
            }
        }
        te1Var.y = this;
        if (RecyclerView.I0) {
            if (view.getParent() == null && view.isAttachedToWindow() != te1Var.k()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + te1Var.k() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + te1Var);
            }
            if (view.getParent() == null && view.isAttachedToWindow()) {
                rw.n("Attempting to bind attached holder with no parent (AKA temp detached): ", te1Var);
                return;
            }
        }
        m(te1Var, i, te1Var.d());
        if (z) {
            ArrayList arrayList = te1Var.q;
            if (arrayList != null) {
                arrayList.clear();
            }
            te1Var.p &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ee1) {
                ((ee1) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public int b(td1 td1Var, te1 te1Var, int i) {
        if (td1Var == this) {
            return i;
        }
        return -1;
    }

    public abstract int c();

    public long d(int i) {
        return -1L;
    }

    public int e(int i) {
        return 0;
    }

    public final void f() {
        this.f983a.b();
    }

    public final void g(int i) {
        this.f983a.d(i, 1, null);
    }

    public final void h(int i, int i2) {
        this.f983a.c(i, i2);
    }

    public final void i(int i, int i2) {
        this.f983a.e(i, i2);
    }

    public final void j(int i, int i2) {
        this.f983a.f(i, i2);
    }

    public void k(RecyclerView recyclerView) {
    }

    public abstract void l(te1 te1Var, int i);

    public void m(te1 te1Var, int i, List list) {
        l(te1Var, i);
    }

    public abstract te1 n(ViewGroup viewGroup, int i);

    public void o(RecyclerView recyclerView) {
    }

    public boolean p(te1 te1Var) {
        return false;
    }

    public void q(te1 te1Var) {
    }

    public void r(te1 te1Var) {
    }

    public void s(te1 te1Var) {
    }

    public final void t(vd1 vd1Var) {
        this.f983a.registerObserver(vd1Var);
    }

    public final void u(boolean z) {
        if (this.f983a.a()) {
            c.n("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }
}
