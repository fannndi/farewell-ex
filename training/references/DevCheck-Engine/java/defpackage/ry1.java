package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.MainApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ry1 {
    public static volatile ry1 g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f912a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public ry1(Context context) {
        this.f912a = 0;
        this.d = new qy0(null);
        this.b = 0;
        this.c = context.getApplicationContext();
    }

    public ry1(List list, HashSet hashSet, int i) {
        this.f912a = 2;
        byte[] bArr = new byte[64];
        this.d = bArr;
        this.b = i;
        bArr[0] = 64;
        this.f = new sh[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            ms msVar = (ms) list.get(i2);
            sh[] shVarArr = (sh[]) this.f;
            int i3 = msVar.e;
            sh shVar = new sh();
            shVar.f936a = i2;
            shVar.b = i3;
            shVarArr[i2] = shVar;
        }
        this.e = new int[i];
        int i4 = 0;
        for (short s = 0; s < i; s = (short) (s + 1)) {
            boolean contains = hashSet.contains(Short.valueOf(s));
            int[] iArr = (int[]) this.e;
            if (contains) {
                iArr[s] = i4;
                i4 += 16;
            } else {
                iArr[s] = -1;
            }
        }
        this.c = new ps((short) 513, (short) 84, (((sh[]) this.f).length * 16) + (((int[]) this.e).length * 4) + 84);
    }

    public ry1(sd1 sd1Var) {
        this.f912a = 1;
        this.b = 0;
        this.c = sd1Var;
        this.d = new zp(0);
        this.e = new ArrayList();
    }

    public static ry1 f(Application application) {
        if (g == null) {
            synchronized (ry1.class) {
                try {
                    if (g == null) {
                        g = new ry1(application.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public void a(View view, int i, boolean z) {
        RecyclerView recyclerView = ((sd1) this.c).g;
        int childCount = i < 0 ? recyclerView.getChildCount() : g(i);
        ((zp) this.d).e(childCount, z);
        if (z) {
            j(view);
        }
        recyclerView.addView(view, childCount);
        te1 N = RecyclerView.N(view);
        td1 td1Var = recyclerView.s;
        if (td1Var != null && N != null) {
            td1Var.q(N);
        }
        ArrayList arrayList = recyclerView.I;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((y72) recyclerView.I.get(size)).getClass();
                ee1 ee1Var = (ee1) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) ee1Var).width != -1 || ((ViewGroup.MarginLayoutParams) ee1Var).height != -1) {
                    c.n("Pages must fill the whole ViewPager2 (use match_parent)");
                    return;
                }
            }
        }
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((sd1) this.c).g;
        int childCount = i < 0 ? recyclerView.getChildCount() : g(i);
        ((zp) this.d).e(childCount, z);
        if (z) {
            j(view);
        }
        te1 N = RecyclerView.N(view);
        if (N != null) {
            if (!N.k() && !N.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N);
                c.l(sb, recyclerView.C());
                return;
            } else {
                if (RecyclerView.J0) {
                    N.toString();
                }
                N.p &= -257;
            }
        } else if (RecyclerView.I0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String C = recyclerView.C();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(C);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void c(int i) {
        int g2 = g(i);
        ((zp) this.d).g(g2);
        RecyclerView recyclerView = ((sd1) this.c).g;
        View childAt = recyclerView.getChildAt(g2);
        if (childAt != null) {
            te1 N = RecyclerView.N(childAt);
            if (N != null) {
                if (N.k() && !N.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N);
                    c.l(sb, recyclerView.C());
                    return;
                } else {
                    if (RecyclerView.J0) {
                        N.toString();
                    }
                    N.a(rt0.t);
                }
            }
        } else if (RecyclerView.I0) {
            throw new IllegalArgumentException("No view at offset " + g2 + recyclerView.C());
        }
        recyclerView.detachViewFromParent(g2);
    }

    public View d(int i) {
        return ((sd1) this.c).g.getChildAt(g(i));
    }

    public int e() {
        return ((sd1) this.c).g.getChildCount() - ((ArrayList) this.e).size();
    }

    public int g(int i) {
        zp zpVar = (zp) this.d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((sd1) this.c).g.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - zpVar.b(i2));
            if (b == 0) {
                while (zpVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public View h(int i) {
        return ((sd1) this.c).g.getChildAt(i);
    }

    public int i() {
        return ((sd1) this.c).g.getChildCount();
    }

    public void j(View view) {
        ((ArrayList) this.e).add(view);
        sd1 sd1Var = (sd1) this.c;
        te1 N = RecyclerView.N(view);
        if (N != null) {
            View view2 = N.g;
            RecyclerView recyclerView = sd1Var.g;
            int i = N.w;
            if (i != -1) {
                N.v = i;
            } else {
                N.v = view2.getImportantForAccessibility();
            }
            if (!recyclerView.R()) {
                view2.setImportantForAccessibility(4);
            } else {
                N.w = 4;
                recyclerView.A0.add(N);
            }
        }
    }

    public synchronized void k() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29) {
            ((qy0) this.d).i(null);
            return;
        }
        int i = this.b + 1;
        this.b = i;
        if (i > 1) {
            return;
        }
        try {
            if (((PowerManager) this.e) == null) {
                this.e = (PowerManager) ((Context) this.c).getSystemService("power");
            }
            powerManager = (PowerManager) this.e;
        } catch (Throwable unused) {
        }
        if (powerManager == null) {
            return;
        }
        if (((qy1) this.f) == null) {
            this.f = new qy1(new c71(12, this));
        }
        MainApp.h.execute(new b9(16, this, powerManager, (qy1) this.f));
    }

    public synchronized void l() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        int i = this.b;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.b = i2;
        if (i2 > 0) {
            return;
        }
        PowerManager powerManager = (PowerManager) this.e;
        qy1 qy1Var = (qy1) this.f;
        if (powerManager != null && qy1Var != null) {
            MainApp.h.execute(new n51(powerManager, 18, qy1Var));
        }
    }

    public void m(View view) {
        if (((ArrayList) this.e).remove(view)) {
            sd1 sd1Var = (sd1) this.c;
            te1 N = RecyclerView.N(view);
            if (N != null) {
                RecyclerView recyclerView = sd1Var.g;
                int i = N.v;
                if (recyclerView.R()) {
                    N.w = i;
                    recyclerView.A0.add(N);
                } else {
                    N.g.setImportantForAccessibility(i);
                }
                N.v = 0;
            }
        }
    }

    public String toString() {
        switch (this.f912a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((zp) this.d).toString() + ", hidden list:" + ((ArrayList) this.e).size();
            default:
                return super.toString();
        }
    }
}
