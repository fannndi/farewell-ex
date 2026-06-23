package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class te1 {
    public static final List z = Collections.EMPTY_LIST;
    public final View g;
    public WeakReference h;
    public int p;
    public RecyclerView x;
    public td1 y;
    public int i = -1;
    public int j = -1;
    public long k = -1;
    public int l = -1;
    public int m = -1;
    public te1 n = null;
    public te1 o = null;
    public ArrayList q = null;
    public List r = null;
    public int s = 0;
    public ke1 t = null;
    public boolean u = false;
    public int v = 0;
    public int w = -1;

    public te1(View view) {
        if (view != null) {
            this.g = view;
        } else {
            c.m("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.p = i | this.p;
    }

    public final int b() {
        RecyclerView recyclerView;
        td1 adapter;
        int K;
        if (this.y == null || (recyclerView = this.x) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.x.K(this)) == -1) {
            return -1;
        }
        return adapter.b(this.y, this, K);
    }

    public final int c() {
        int i = this.m;
        return i == -1 ? this.i : i;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.p & rt0.v) != 0 || (arrayList = this.q) == null || arrayList.size() == 0) ? z : this.r;
    }

    public final boolean e() {
        View view = this.g;
        return (view.getParent() == null || view.getParent() == this.x) ? false : true;
    }

    public final boolean f() {
        return (this.p & 1) != 0;
    }

    public final boolean g() {
        return (this.p & 4) != 0;
    }

    public final boolean h() {
        if ((this.p & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = y62.f1215a;
        return !this.g.hasTransientState();
    }

    public final boolean i() {
        return (this.p & 8) != 0;
    }

    public final boolean j() {
        return this.t != null;
    }

    public final boolean k() {
        return (this.p & rt0.t) != 0;
    }

    public final boolean l() {
        return (this.p & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.j == -1) {
            this.j = this.i;
        }
        if (this.m == -1) {
            this.m = this.i;
        }
        if (z2) {
            this.m += i;
        }
        this.i += i;
        View view = this.g;
        if (view.getLayoutParams() != null) {
            ((ee1) view.getLayoutParams()).c = true;
        }
    }

    public final void n() {
        if (RecyclerView.I0 && k()) {
            p22.c("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
            return;
        }
        this.p = 0;
        this.i = -1;
        this.j = -1;
        this.k = -1L;
        this.m = -1;
        this.s = 0;
        this.n = null;
        this.o = null;
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.p &= -1025;
        this.v = 0;
        this.w = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z2) {
        int i = this.s;
        int i2 = z2 ? i - 1 : i + 1;
        this.s = i2;
        if (i2 < 0) {
            this.s = 0;
            if (RecyclerView.I0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z2 && i2 == 1) {
            this.p |= 16;
        } else if (z2 && i2 == 0) {
            this.p &= -17;
        }
        if (RecyclerView.J0) {
            toString();
        }
    }

    public final boolean p() {
        return (this.p & rt0.s) != 0;
    }

    public final boolean q() {
        return (this.p & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.i + " id=" + this.k + ", oldPos=" + this.j + ", pLpos:" + this.m);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.u ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(Gvyagftz.SdJkzHgXTEMDukk);
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.p & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.s + ")");
        }
        if ((this.p & rt0.u) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.g.getParent() == null) {
            sb.append(qJTtDWNCVUDjB.PvDzSnTkmnhMSpI);
        }
        sb.append("}");
        return sb.toString();
    }
}
