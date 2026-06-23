package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class bw0 {
    public static ux0 f;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static Boolean k;
    public static Boolean l;
    public static Boolean m;
    public static String n;
    public static long o;
    public static Method p;
    public static Method q;
    public static Method r;

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f100a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ux0 e = new ux0(null, null, null);
    public static final int[] g = {R.attr.stateListAnimator};

    public static String A(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static float B() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static /* synthetic */ boolean C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zj2 zj2Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zj2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(zj2Var) != obj && atomicReferenceFieldUpdater.get(zj2Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final String a(Object[] objArr, int i2, int i3, v vVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == vVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void b(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = in0.f441a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = r71.f876a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void c(View view) {
        view.getClass();
        hm1 hm1Var = new hm1();
        h72 h72Var = new h72(view, hm1Var);
        h72Var.j = hm1Var;
        hm1Var.j = h72Var;
        while (hm1Var.hasNext()) {
            View view2 = (View) hm1Var.next();
            e81 e81Var = (e81) view2.getTag(flar2.devcheck.R.id.pooling_container_listener_holder_tag);
            if (e81Var == null) {
                e81Var = new e81();
                view2.setTag(flar2.devcheck.R.id.pooling_container_listener_holder_tag, e81Var);
            }
            ArrayList arrayList = e81Var.f226a;
            arrayList.getClass();
            int size = arrayList.size() - 1;
            if (-1 < size) {
                throw iy1.e(arrayList, size);
            }
        }
    }

    public static final zb2 e(Context context, ju juVar) {
        bh1 e2;
        context.getClass();
        gr grVar = new gr(juVar.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        lm1 lm1Var = (lm1) grVar.h;
        lm1Var.getClass();
        ai1 ai1Var = juVar.d;
        boolean z = context.getResources().getBoolean(flar2.devcheck.R.bool.workmanager_test_configuration);
        ai1Var.getClass();
        q21 q21Var = null;
        if (z) {
            e2 = new bh1(applicationContext, WorkDatabase.class, null);
            e2.i = true;
        } else {
            e2 = ym0.e(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            e2.h = new c71(17, applicationContext);
        }
        e2.f = lm1Var;
        e2.d.add(new zq(ai1Var));
        e2.a(rx0.h);
        e2.a(new ag1(applicationContext, 2, 3));
        e2.a(rx0.i);
        e2.a(rx0.j);
        e2.a(new ag1(applicationContext, 5, 6));
        e2.a(rx0.k);
        e2.a(rx0.l);
        e2.a(rx0.m);
        e2.a(new ag1(applicationContext));
        e2.a(new ag1(applicationContext, 10, 11));
        e2.a(rx0.d);
        e2.a(rx0.e);
        e2.a(rx0.f);
        e2.a(rx0.g);
        e2.a(new ag1(applicationContext, 21, 22));
        e2.p = false;
        e2.q = true;
        e2.r = true;
        WorkDatabase workDatabase = (WorkDatabase) e2.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        Context applicationContext3 = applicationContext2.getApplicationContext();
        applicationContext3.getClass();
        ff ffVar = new ff(applicationContext3, grVar, 0);
        Context applicationContext4 = applicationContext2.getApplicationContext();
        applicationContext4.getClass();
        ff ffVar2 = new ff(applicationContext4, grVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext5 = applicationContext2.getApplicationContext();
            applicationContext5.getClass();
            int i2 = p21.f771a;
            q21Var = new q21(applicationContext5, grVar);
        }
        Context applicationContext6 = applicationContext2.getApplicationContext();
        applicationContext6.getClass();
        ff ffVar3 = new ff(applicationContext6, grVar, 2);
        yh yhVar = new yh();
        yhVar.g = applicationContext2;
        yhVar.h = ffVar;
        yhVar.i = ffVar2;
        yhVar.j = q21Var;
        yhVar.k = ffVar3;
        la1 la1Var = new la1(context.getApplicationContext(), juVar, grVar, workDatabase);
        int i3 = ek1.f236a;
        su1 su1Var = new su1(context, workDatabase, juVar);
        r51.a(context, SystemJobService.class, true);
        ai1.h().getClass();
        return new zb2(context.getApplicationContext(), juVar, grVar, workDatabase, zr.S(su1Var, new hh0(context, juVar, yhVar, la1Var, new kp(la1Var, grVar), grVar)), la1Var, yhVar);
    }

    public static boolean f(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = f(file2) && z;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:32:0x008e BREAK  A[LOOP:0: B:10:0x0014->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List g(defpackage.s00 r9, int r10, int r11) {
        /*
            r9.getClass()
            if (r10 != r11) goto L8
            p80 r9 = defpackage.p80.g
            return r9
        L8:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r0
        Lf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L14:
            if (r2 == 0) goto L19
            if (r10 >= r11) goto L8f
            goto L1b
        L19:
            if (r10 <= r11) goto L8f
        L1b:
            java.util.LinkedHashMap r4 = r9.f913a
            r5 = 0
            if (r2 == 0) goto L38
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L2e
        L2c:
            r7 = r5
            goto L4e
        L2e:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            z51 r7 = new z51
            r7.<init>(r4, r6)
            goto L4e
        L38:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L45
            goto L2c
        L45:
            java.util.Set r6 = r4.keySet()
            z51 r7 = new z51
            r7.<init>(r4, r6)
        L4e:
            if (r7 != 0) goto L51
            goto L8e
        L51:
            java.lang.Object r4 = r7.g
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r7.h
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L76
            int r8 = r10 + 1
            if (r8 > r7) goto L5d
            if (r7 > r11) goto L5d
            goto L7a
        L76:
            if (r11 > r7) goto L5d
            if (r7 >= r10) goto L5d
        L7a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            r10.getClass()
            r3.add(r10)
            r4 = r1
            r10 = r7
            goto L8c
        L8b:
            r4 = r0
        L8c:
            if (r4 != 0) goto L14
        L8e:
            return r5
        L8f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw0.g(s00, int, int):java.util.List");
    }

    public static ox h(ox oxVar, px pxVar) {
        pxVar.getClass();
        if (ym0.b(oxVar.getKey(), pxVar)) {
            return oxVar;
        }
        return null;
    }

    public static String i() {
        String str = n;
        if (str != null) {
            return str;
        }
        String k2 = k("ro.boot.avb_version");
        if (k2 == null || k2.trim().isEmpty()) {
            n = null;
        } else {
            n = k2.trim();
        }
        return n;
    }

    public static int j(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i2});
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            ColorStateList q2 = resourceId != 0 ? pr.q(context, resourceId) : obtainStyledAttributes.getColorStateList(0);
            if (q2 != null) {
                return q2.getDefaultColor();
            }
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static String k(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void l(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            rw.j(cause);
        }
    }

    public static boolean m() {
        Boolean bool = m;
        if (bool != null) {
            return bool.booleanValue();
        }
        String k2 = k("ro.boot.dynamic_partitions");
        if (k2.isEmpty()) {
            k2 = k("ro.dynamic_partitions");
        }
        Boolean valueOf = Boolean.valueOf("true".equalsIgnoreCase(k2));
        m = valueOf;
        return valueOf.booleanValue();
    }

    public static int n(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return ts.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 29) {
            return p02.c();
        }
        try {
            if (p == null) {
                o = Trace.class.getField(UQdsoaJMID.bIANsojN).getLong(null);
                p = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) p.invoke(null, Long.valueOf(o))).booleanValue();
        } catch (Exception e2) {
            l(e2);
            return false;
        }
    }

    public static final boolean p(y00 y00Var, int i2, int i3) {
        y00Var.getClass();
        if (i2 > i3 && y00Var.l) {
            return false;
        }
        Set set = y00Var.m;
        return y00Var.k && (set == null || !set.contains(Integer.valueOf(i2)));
    }

    public static boolean q() {
        Boolean bool = l;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equalsIgnoreCase(k("ro.apex.updatable")));
        l = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean r(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (h == null) {
            h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        h.booleanValue();
        if (i == null) {
            i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (i.booleanValue()) {
            return !om0.F() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static float s(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static qx t(ox oxVar, px pxVar) {
        pxVar.getClass();
        return ym0.b(oxVar.getKey(), pxVar) ? n80.g : oxVar;
    }

    public static final boolean u(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void v(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static qx w(ox oxVar, qx qxVar) {
        qxVar.getClass();
        return qxVar == n80.g ? oxVar : (qx) qxVar.m(oxVar, new ys(1));
    }

    public static final void x(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final Object y(pf0 pf0Var) {
        Thread.interrupted();
        return ju0.p0(n80.g, new kz(pf0Var, null));
    }

    public static void z(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(flar2.devcheck.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = jYVJoqfHJs.dxbFuPwE;
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, flar2.devcheck.R.attr.state_liftable, -2130969990}, ObjectAnimator.ofFloat(appBarLayout, str, 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, str, f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, str, 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public abstract List d(String str, List list);
}
