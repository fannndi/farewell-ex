package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.MenuItem;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h70 implements xu0, ow0, p40, sk0, sa1, z90, co, ui1, jt1, m1 {
    public static h70 h;
    public Object g;

    public h70(int i, boolean z) {
        switch (i) {
            case 8:
                this.g = new LruCache(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
                break;
            case 20:
                this.g = new LinkedHashSet();
                break;
            case 23:
                this.g = new ai1();
                break;
            default:
                this.g = null;
                break;
        }
    }

    public h70(Context context) {
        this.g = new EdgeEffect(context);
    }

    public h70(ft1 ft1Var) {
        ft1Var.getClass();
        this.g = ft1Var;
    }

    public /* synthetic */ h70(Object obj) {
        this.g = obj;
    }

    public static void m(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g70.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float r(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g70.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    @Override // defpackage.ow0
    public void H(MenuBuilder menuBuilder) {
    }

    @Override // defpackage.sk0
    public fj0 a(float f, float f2) {
        rk0 rk0Var;
        PieChart pieChart = (PieChart) this.g;
        if (pieChart.h(f, f2) <= pieChart.getRadius()) {
            float i = pieChart.i(f, f2);
            pieChart.getAnimator().getClass();
            float rotationAngle = (i / 1.0f) - pieChart.getRotationAngle();
            DisplayMetrics displayMetrics = n52.f665a;
            while (rotationAngle < 0.0f) {
                rotationAngle += 360.0f;
            }
            float f3 = rotationAngle % 360.0f;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                float[] fArr = pieChart.P;
                if (i3 >= fArr.length) {
                    i3 = -1;
                    break;
                }
                if (fArr[i3] > f3) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                ArrayList arrayList = pieChart.getData().i;
                if (arrayList == null || arrayList.isEmpty()) {
                    rk0Var = null;
                } else {
                    rk0Var = (rk0) arrayList.get(0);
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        rk0 rk0Var2 = (rk0) obj;
                        if (((w00) rk0Var2).j.size() > ((w00) rk0Var).j.size()) {
                            rk0Var = rk0Var2;
                        }
                    }
                }
                if (i3 < ((w00) rk0Var).j.size()) {
                    return new fj0(i3, ((j71) pieChart.getData()).l().g(i3).b(), f, f2, 0, 1);
                }
            }
        }
        return null;
    }

    @Override // defpackage.m1
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.g;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = y62.f1215a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        ke keVar = swipeDismissBehavior.b;
        if (keVar != null) {
            keVar.a(view);
        }
        return true;
    }

    @Override // defpackage.z90
    public ed1 c() {
        ji1 b;
        IOException iOException = null;
        while (!((jd1) this.g).k.w) {
            try {
                b = ((jd1) this.g).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    bw0.b(iOException, e);
                }
                if (!((jd1) this.g).a(null)) {
                    throw iOException;
                }
            }
            if (!b.e()) {
                ii1 g = b.g();
                if (g.b == null && g.c == null) {
                    g = b.c();
                }
                ji1 ji1Var = g.b;
                Throwable th = g.c;
                if (th != null) {
                    throw th;
                }
                if (ji1Var != null) {
                    ((jd1) this.g).p.addFirst(ji1Var);
                }
            }
            return b.d();
        }
        rw.f("Canceled");
        return null;
    }

    @Override // defpackage.ui1
    public ti1 d(String str) {
        str.getClass();
        return new ct1(((ft1) this.g).z());
    }

    @Override // defpackage.z90
    public jd1 e() {
        return (jd1) this.g;
    }

    @Override // defpackage.p40
    public boolean f(float f) {
        if (f == 0.0f) {
            return false;
        }
        i();
        ((NestedScrollView) this.g).j((int) f);
        return true;
    }

    @Override // defpackage.sa1
    public void g(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.g).setResultCode(i);
    }

    @Override // defpackage.p40
    public float h() {
        return -((NestedScrollView) this.g).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.p40
    public void i() {
        ((NestedScrollView) this.g).j.abortAnimation();
    }

    @Override // defpackage.jt1
    public String j() {
        return ((kt1) this.g).h;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(defpackage.o12 r5, defpackage.ex r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.u31
            if (r0 == 0) goto L13
            r0 = r6
            u31 r0 = (defpackage.u31) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            u31 r0 = new u31
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.j
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r4)
            return
        L27:
            defpackage.om0.O(r6)
            pt r4 = new pt
            r4.<init>()
            throw r4
        L30:
            defpackage.om0.O(r6)
            java.lang.Object r4 = r4.g
            zq1 r4 = (defpackage.zq1) r4
            r0.l = r2
            r4.a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h70.k(o12, ex):void");
    }

    @Override // defpackage.jt1
    public void l(it1 it1Var) {
        kt1 kt1Var = (kt1) this.g;
        int length = kt1Var.j.length;
        for (int i = 1; i < length; i++) {
            int i2 = kt1Var.j[i];
            if (i2 == 1) {
                it1Var.d(i, kt1Var.k[i]);
            } else if (i2 == 2) {
                it1Var.n(i, kt1Var.l[i]);
            } else if (i2 == 3) {
                String str = kt1Var.m[i];
                str.getClass();
                it1Var.k(i, str);
            } else if (i2 == 4) {
                byte[] bArr = kt1Var.n[i];
                bArr.getClass();
                it1Var.f(i, bArr);
            } else if (i2 == 5) {
                it1Var.b(i);
            }
        }
    }

    public String o(String str) {
        try {
            return ((JSONObject) this.g).getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.co
    public void onCancel() {
        ((up1) this.g).a();
    }

    public void p(Set set) {
        Object e;
        int[] iArr;
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        zq1 zq1Var = (zq1) this.g;
        do {
            e = zq1Var.e();
            int[] iArr2 = (int[]) e;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
            if (e == null) {
                e = i31.f410a;
            }
        } while (!zq1Var.f(e, iArr));
    }

    public void q() {
        ((nd0) this.g).q.O();
    }

    @Override // defpackage.ow0
    public boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) this.g;
        if (bottomNavigationView.l == null || menuItem.getItemId() != bottomNavigationView.getSelectedItemId()) {
            c11 c11Var = bottomNavigationView.k;
            if (c11Var == null || c11Var.c(menuItem)) {
                return false;
            }
        } else {
            BenchmarkSuiteActivity benchmarkSuiteActivity = ((ti) bottomNavigationView.l).g;
            int i = BenchmarkSuiteActivity.M;
            Deque deque = (Deque) benchmarkSuiteActivity.L.get(Integer.valueOf(menuItem.getItemId()));
            if (deque != null && deque.size() > 1) {
                ae0 s = benchmarkSuiteActivity.s();
                s.getClass();
                yb ybVar = new yb(s);
                ybVar.r = true;
                while (deque.size() > 1) {
                    ybVar.j((ld0) deque.pop());
                }
                ybVar.m((ld0) deque.peek());
                ybVar.e(true);
                return true;
            }
        }
        return true;
    }
}
