package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.RemoteViews;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.behavior.YqV.Gvyagftz;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.benchmarkSuite.sanity.SanityCheckActivity;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class je2 implements u80 {

    /* renamed from: a, reason: collision with root package name */
    public static ud2 f479a;
    public static final ue b = new ue();
    public static final ho0 c = new ho0(2);

    public static String A(int i) {
        try {
            String glGetString = GLES20.glGetString(i);
            return glGetString != null ? !glGetString.isEmpty() ? glGetString : "—" : "—";
        } catch (Throwable unused) {
            return "—";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int B(int r109, int r110) {
        /*
            Method dump skipped, instructions count: 2562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je2.B(int, int):int");
    }

    public static boolean C(JSONArray jSONArray, String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.optString(i, "").toLowerCase(Locale.US).contains(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(y41 y41Var) {
        return y41Var.f1210a >= 3;
    }

    public static void E(int i, kv kvVar, iw iwVar, boolean z) {
        ev evVar;
        ev evVar2;
        boolean z2;
        ev evVar3;
        ev evVar4;
        if (iwVar.m) {
            return;
        }
        if (!(iwVar instanceof jw) && iwVar.z() && e(iwVar)) {
            jw.V(iwVar, kvVar, new ue());
        }
        ev i2 = iwVar.i(2);
        ev i3 = iwVar.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f250a;
        if (hashSet != null && i2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ev evVar5 = (ev) it.next();
                iw iwVar2 = evVar5.d;
                int i4 = i + 1;
                boolean e = e(iwVar2);
                ev evVar6 = iwVar2.I;
                ev evVar7 = iwVar2.K;
                if (iwVar2.z() && e) {
                    z2 = true;
                    jw.V(iwVar2, kvVar, new ue());
                } else {
                    z2 = true;
                }
                boolean z3 = ((evVar5 == evVar6 && (evVar4 = evVar7.f) != null && evVar4.c) || (evVar5 == evVar7 && (evVar3 = evVar6.f) != null && evVar3.c)) ? z2 : false;
                int i5 = iwVar2.p0[0];
                if (i5 != 3 || e) {
                    if (!iwVar2.z()) {
                        if (evVar5 == evVar6 && evVar7.f == null) {
                            int e2 = evVar6.e() + d;
                            iwVar2.J(e2, iwVar2.q() + e2);
                            E(i4, kvVar, iwVar2, z);
                        } else if (evVar5 == evVar7 && evVar6.f == null) {
                            int e3 = d - evVar7.e();
                            iwVar2.J(e3 - iwVar2.q(), e3);
                            E(i4, kvVar, iwVar2, z);
                        } else if (z3 && !iwVar2.x()) {
                            S(i4, kvVar, iwVar2, z);
                        }
                    }
                } else if (i5 == 3 && iwVar2.v >= 0 && iwVar2.u >= 0 && (iwVar2.g0 == 8 || (iwVar2.r == 0 && iwVar2.W == 0.0f))) {
                    if (!iwVar2.x() && !iwVar2.F && z3 && !iwVar2.x()) {
                        T(i4, iwVar, kvVar, iwVar2, z);
                    }
                }
            }
        }
        if (iwVar instanceof sh0) {
            return;
        }
        HashSet hashSet2 = i3.f250a;
        if (hashSet2 != null && i3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ev evVar8 = (ev) it2.next();
                iw iwVar3 = evVar8.d;
                int i6 = i + 1;
                boolean e4 = e(iwVar3);
                ev evVar9 = iwVar3.I;
                ev evVar10 = iwVar3.K;
                if (iwVar3.z() && e4) {
                    jw.V(iwVar3, kvVar, new ue());
                }
                boolean z4 = (evVar8 == evVar9 && (evVar2 = evVar10.f) != null && evVar2.c) || (evVar8 == evVar10 && (evVar = evVar9.f) != null && evVar.c);
                int i7 = iwVar3.p0[0];
                if (i7 != 3 || e4) {
                    if (!iwVar3.z()) {
                        if (evVar8 == evVar9 && evVar10.f == null) {
                            int e5 = evVar9.e() + d2;
                            iwVar3.J(e5, iwVar3.q() + e5);
                            E(i6, kvVar, iwVar3, z);
                        } else if (evVar8 == evVar10 && evVar9.f == null) {
                            int e6 = d2 - evVar10.e();
                            iwVar3.J(e6 - iwVar3.q(), e6);
                            E(i6, kvVar, iwVar3, z);
                        } else if (z4 && !iwVar3.x()) {
                            S(i6, kvVar, iwVar3, z);
                        }
                    }
                } else if (i7 == 3 && iwVar3.v >= 0 && iwVar3.u >= 0) {
                    if (iwVar3.g0 == 8 || (iwVar3.r == 0 && iwVar3.W == 0.0f)) {
                        if (!iwVar3.x() && !iwVar3.F && z4 && !iwVar3.x()) {
                            T(i6, iwVar, kvVar, iwVar3, z);
                        }
                    }
                }
            }
        }
        iwVar.m = true;
    }

    public static final n50 F(rn0 rn0Var, boolean z, vn0 vn0Var) {
        if (rn0Var instanceof bo0) {
            return ((bo0) rn0Var).M(z, vn0Var);
        }
        boolean r = vn0Var.r();
        dn0 dn0Var = new dn0(1, vn0Var, vn0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1);
        return ((bo0) rn0Var).M(z, r ? new fn0(dn0Var) : new gn0(dn0Var));
    }

    public static boolean G(int i, y41 y41Var) {
        int i2 = y41Var.f1210a;
        if (i2 <= 3) {
            return i2 == 3 && y41Var.b >= i;
        }
        return true;
    }

    public static boolean H(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = ts.f1003a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            c.m("outXyz must have a length of 3.");
            return false;
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static boolean I(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static int J(int i, float f, int i2) {
        return ts.b(ts.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static void K(c71 c71Var, String str) {
        SanityCheckActivity sanityCheckActivity = (SanityCheckActivity) c71Var.h;
        sanityCheckActivity.i.post(new n51(sanityCheckActivity, 15, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xm N(defpackage.ui0 r26) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je2.N(ui0):xm");
    }

    public static int O(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    public static final int P(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static String Q(String str) {
        return (str == null || str.isEmpty()) ? "—" : str;
    }

    public static void R(Context context, int i, int i2) {
        context.getApplicationContext().getSharedPreferences("widget_accent_prefs", 0).edit().putInt("accent_" + i, i2).apply();
    }

    public static void S(int i, kv kvVar, iw iwVar, boolean z) {
        float f = iwVar.d0;
        ev evVar = iwVar.I;
        int d = evVar.f.d();
        ev evVar2 = iwVar.K;
        int d2 = evVar2.f.d();
        int e = evVar.e() + d;
        int e2 = d2 - evVar2.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int q = iwVar.q();
        int i2 = (d2 - d) - q;
        if (d > d2) {
            i2 = (d - d2) - q;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + d;
        int i4 = i3 + q;
        if (d > d2) {
            i4 = i3 - q;
        }
        iwVar.J(i3, i4);
        E(i + 1, kvVar, iwVar, z);
    }

    public static void T(int i, iw iwVar, kv kvVar, iw iwVar2, boolean z) {
        float f = iwVar2.d0;
        ev evVar = iwVar2.I;
        int e = evVar.e() + evVar.f.d();
        ev evVar2 = iwVar2.K;
        int d = evVar2.f.d() - evVar2.e();
        if (d >= e) {
            int q = iwVar2.q();
            if (iwVar2.g0 != 8) {
                int i2 = iwVar2.r;
                if (i2 == 2) {
                    q = (int) (iwVar2.d0 * 0.5f * (iwVar instanceof jw ? iwVar.q() : iwVar.T.q()));
                } else if (i2 == 0) {
                    q = d - e;
                }
                q = Math.max(iwVar2.u, q);
                int i3 = iwVar2.v;
                if (i3 > 0) {
                    q = Math.min(i3, q);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - q)) + 0.5f));
            iwVar2.J(i4, q + i4);
            E(i + 1, kvVar, iwVar2, z);
        }
    }

    public static void U(int i, kv kvVar, iw iwVar) {
        float f = iwVar.e0;
        ev evVar = iwVar.J;
        int d = evVar.f.d();
        ev evVar2 = iwVar.L;
        int d2 = evVar2.f.d();
        int e = evVar.e() + d;
        int e2 = d2 - evVar2.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int k = iwVar.k();
        int i2 = (d2 - d) - k;
        if (d > d2) {
            i2 = (d - d2) - k;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = d + i3;
        int i5 = i4 + k;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - k;
        }
        iwVar.K(i4, i5);
        Z(i + 1, kvVar, iwVar);
    }

    public static void V(int i, iw iwVar, kv kvVar, iw iwVar2) {
        float f = iwVar2.e0;
        ev evVar = iwVar2.J;
        int e = evVar.e() + evVar.f.d();
        ev evVar2 = iwVar2.L;
        int d = evVar2.f.d() - evVar2.e();
        if (d >= e) {
            int k = iwVar2.k();
            if (iwVar2.g0 != 8) {
                int i2 = iwVar2.s;
                if (i2 == 2) {
                    k = (int) (f * 0.5f * (iwVar instanceof jw ? iwVar.k() : iwVar.T.k()));
                } else if (i2 == 0) {
                    k = d - e;
                }
                k = Math.max(iwVar2.x, k);
                int i3 = iwVar2.y;
                if (i3 > 0) {
                    k = Math.min(i3, k);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - k)) + 0.5f));
            iwVar2.K(i4, k + i4);
            Z(i + 1, kvVar, iwVar2);
        }
    }

    public static final Object W(hk1 hk1Var, hk1 hk1Var2, pf0 pf0Var) {
        Object otVar;
        Object P;
        try {
            k32.g(2, pf0Var);
            otVar = pf0Var.f(hk1Var2, hk1Var);
        } catch (Throwable th) {
            otVar = new ot(th, false);
        }
        zx zxVar = zx.g;
        if (otVar == zxVar || (P = hk1Var.P(otVar)) == co0.b) {
            return zxVar;
        }
        if (P instanceof ot) {
            throw ((ot) P).f756a;
        }
        return co0.a(P);
    }

    public static int X(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final String Y(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = rt0.d;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            c.g(d51.p(i2, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        c.m(d51.p(i2, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    public static void Z(int i, kv kvVar, iw iwVar) {
        boolean z;
        ev evVar;
        ev evVar2;
        ev evVar3;
        ev evVar4;
        if (iwVar.n) {
            return;
        }
        if (!(iwVar instanceof jw) && iwVar.z() && e(iwVar)) {
            jw.V(iwVar, kvVar, new ue());
        }
        ev i2 = iwVar.i(3);
        ev i3 = iwVar.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f250a;
        if (hashSet != null && i2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ev evVar5 = (ev) it.next();
                iw iwVar2 = evVar5.d;
                int i4 = i + 1;
                boolean e = e(iwVar2);
                ev evVar6 = iwVar2.J;
                ev evVar7 = iwVar2.L;
                if (iwVar2.z() && e) {
                    jw.V(iwVar2, kvVar, new ue());
                }
                boolean z2 = (evVar5 == evVar6 && (evVar4 = evVar7.f) != null && evVar4.c) || (evVar5 == evVar7 && (evVar3 = evVar6.f) != null && evVar3.c);
                int i5 = iwVar2.p0[1];
                if (i5 != 3 || e) {
                    if (!iwVar2.z()) {
                        if (evVar5 == evVar6 && evVar7.f == null) {
                            int e2 = evVar6.e() + d;
                            iwVar2.K(e2, iwVar2.k() + e2);
                            Z(i4, kvVar, iwVar2);
                        } else if (evVar5 == evVar7 && evVar6.f == null) {
                            int e3 = d - evVar7.e();
                            iwVar2.K(e3 - iwVar2.k(), e3);
                            Z(i4, kvVar, iwVar2);
                        } else if (z2 && !iwVar2.y()) {
                            U(i4, kvVar, iwVar2);
                        }
                    }
                } else if (i5 == 3 && iwVar2.y >= 0 && iwVar2.x >= 0 && (iwVar2.g0 == 8 || (iwVar2.s == 0 && iwVar2.W == 0.0f))) {
                    if (!iwVar2.y() && !iwVar2.F && z2 && !iwVar2.y()) {
                        V(i4, iwVar, kvVar, iwVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (iwVar instanceof sh0) {
            return;
        }
        HashSet hashSet2 = i3.f250a;
        if (hashSet2 != null && i3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ev evVar8 = (ev) it2.next();
                iw iwVar3 = evVar8.d;
                int i6 = i + 1;
                boolean e4 = e(iwVar3);
                ev evVar9 = iwVar3.J;
                ev evVar10 = iwVar3.L;
                if (iwVar3.z() && e4) {
                    jw.V(iwVar3, kvVar, new ue());
                }
                boolean z4 = (evVar8 == evVar9 && (evVar2 = evVar10.f) != null && evVar2.c) || (evVar8 == evVar10 && (evVar = evVar9.f) != null && evVar.c);
                int i7 = iwVar3.p0[1];
                if (i7 != 3 || e4) {
                    if (!iwVar3.z()) {
                        if (evVar8 == evVar9 && evVar10.f == null) {
                            int e5 = evVar9.e() + d2;
                            iwVar3.K(e5, iwVar3.k() + e5);
                            Z(i6, kvVar, iwVar3);
                        } else if (evVar8 == evVar10 && evVar9.f == null) {
                            int e6 = d2 - evVar10.e();
                            iwVar3.K(e6 - iwVar3.k(), e6);
                            Z(i6, kvVar, iwVar3);
                        } else if (z4 && !iwVar3.y()) {
                            U(i6, kvVar, iwVar3);
                        }
                    }
                } else if (i7 == 3 && iwVar3.y >= 0 && iwVar3.x >= 0 && (iwVar3.g0 == 8 || (iwVar3.s == 0 && iwVar3.W == 0.0f))) {
                    if (!iwVar3.y() && !iwVar3.F && z4 && !iwVar3.y()) {
                        V(i6, iwVar, kvVar, iwVar3);
                    }
                }
            }
        }
        ev i8 = iwVar.i(6);
        if (i8.f250a != null && i8.c) {
            int d3 = i8.d();
            Iterator it3 = i8.f250a.iterator();
            while (it3.hasNext()) {
                ev evVar11 = (ev) it3.next();
                iw iwVar4 = evVar11.d;
                int i9 = i + 1;
                boolean e7 = e(iwVar4);
                ev evVar12 = iwVar4.M;
                if (iwVar4.z() && e7) {
                    jw.V(iwVar4, kvVar, new ue());
                }
                if (iwVar4.p0[z3 ? 1 : 0] != 3 || e7) {
                    if (!iwVar4.z()) {
                        if (evVar11 == evVar12) {
                            int e8 = evVar11.e() + d3;
                            if (iwVar4.E) {
                                int i10 = e8 - iwVar4.a0;
                                int i11 = iwVar4.V + i10;
                                iwVar4.Z = i10;
                                iwVar4.J.l(i10);
                                iwVar4.L.l(i11);
                                evVar12.l(e8);
                                z = z3 ? 1 : 0;
                                iwVar4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            Z(i9, kvVar, iwVar4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        iwVar.n = z3;
    }

    public static tn0 a() {
        return new tn0(null);
    }

    public static void a0(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void b(RemoteViews remoteViews, int i, int... iArr) {
        if (i == 0) {
            return;
        }
        for (int i2 : iArr) {
            remoteViews.setTextColor(i2, i);
        }
    }

    public static void b0(int i, int i2) {
        String L;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                L = tl2.L("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                L = tl2.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(L);
        }
    }

    public static void c(RemoteViews remoteViews, int i, String str, int... iArr) {
        if (i != 0 && Build.VERSION.SDK_INT >= 31) {
            ColorStateList valueOf = ColorStateList.valueOf(i);
            for (int i2 : iArr) {
                remoteViews.setColorStateList(i2, str, valueOf);
            }
        }
    }

    public static void c0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? d0(i, "start index", i3) : (i2 < 0 || i2 > i3) ? d0(i2, "end index", i3) : tl2.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void d(go1 go1Var, Runnable runnable) {
        switch (go1Var.f347a) {
            case 0:
                go1Var.c.addIfAbsent(runnable);
                runnable.run();
                break;
            default:
                go1Var.c.addIfAbsent(runnable);
                runnable.run();
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
        }
        try {
            do1.i();
        } catch (Throwable unused) {
        }
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public static String d0(int i, String str, int i2) {
        if (i < 0) {
            return tl2.L("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return tl2.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean e(iw iwVar) {
        int[] iArr = iwVar.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        iw iwVar2 = iwVar.T;
        jw jwVar = iwVar2 != null ? (jw) iwVar2 : null;
        if (jwVar != null) {
            int i3 = jwVar.p0[0];
        }
        if (jwVar != null) {
            int i4 = jwVar.p0[1];
        }
        boolean z = i == 1 || iwVar.A() || i == 2 || (i == 3 && iwVar.r == 0 && iwVar.W == 0.0f && iwVar.t(0)) || (i == 3 && iwVar.r == 1 && iwVar.u(0, iwVar.q()));
        boolean z2 = i2 == 1 || iwVar.B() || i2 == 2 || (i2 == 3 && iwVar.s == 0 && iwVar.W == 0.0f && iwVar.t(1)) || (i2 == 3 && iwVar.s == 1 && iwVar.u(1, iwVar.k()));
        return (iwVar.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static final void f(qx qxVar, CancellationException cancellationException) {
        rn0 rn0Var = (rn0) qxVar.r(pg0.k);
        if (rn0Var != null) {
            rn0Var.e(cancellationException);
        }
    }

    public static final void g(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + gXdyRQCGVlHW.xXjPyOyV + j2 + " byteCount=" + j3);
        }
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                bw0.b(th, th2);
            }
        }
    }

    public static String i() {
        y41 y41Var;
        int i;
        int i2;
        boolean z;
        try {
            y41Var = m();
        } catch (Throwable th) {
            th = th;
            y41Var = null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vendor", Q(A(7936)));
            jSONObject2.put("renderer", Q(A(7937)));
            jSONObject2.put("version", Q(A(7938)));
            jSONObject2.put("slVersion", Q(A(35724)));
            jSONObject2.put("esLevel", y41Var.f1210a + "." + y41Var.b);
            jSONObject.put("identity", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("version", Q(EGL14.eglQueryString((EGLDisplay) y41Var.c, 12372)));
            jSONObject3.put("vendor", Q(EGL14.eglQueryString((EGLDisplay) y41Var.c, 12371)));
            jSONObject.put("egl", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("maxTextureSize", x(3379));
            jSONObject4.put(hTYJVDOvZnZlYL.nPkAiOATwMuN, x(34076));
            jSONObject4.put("max3DTextureSize", D(y41Var) ? Integer.valueOf(x(32883)) : JSONObject.NULL);
            jSONObject4.put("maxRenderbufferSize", x(34024));
            try {
                if (D(y41Var)) {
                    int[] iArr = new int[1];
                    GLES20.glGetIntegerv(36183, iArr, 0);
                    i = iArr[0];
                } else {
                    int[] iArr2 = new int[1];
                    GLES20.glGetIntegerv(36183, iArr2, 0);
                    i = iArr2[0];
                }
            } catch (Throwable unused) {
                i = 0;
            }
            jSONObject4.put("maxSamples", i);
            jSONObject4.put("maxVertexAttribs", x(34921));
            String str = XmJDY.QKkOhEpFe;
            try {
                if (D(y41Var)) {
                    int[] iArr3 = new int[1];
                    GLES20.glGetIntegerv(35659, iArr3, 0);
                    i2 = iArr3[0];
                } else {
                    i2 = x(36348);
                }
            } catch (Throwable unused2) {
                i2 = 0;
            }
            jSONObject4.put(str, i2);
            jSONObject4.put("maxVertexUniformVectors", x(36347));
            jSONObject4.put("maxFragmentUniformVectors", x(36349));
            jSONObject4.put("maxTextureImageUnits", x(34930));
            jSONObject4.put("maxVertexTextureImageUnits", x(35660));
            jSONObject4.put("maxCombinedTextureImageUnits", D(y41Var) ? Integer.valueOf(x(35661)) : JSONObject.NULL);
            int[] iArr4 = new int[2];
            GLES20.glGetIntegerv(3386, iArr4, 0);
            jSONObject4.put("maxViewportWidth", iArr4[0]);
            jSONObject4.put(ILBLnlCHDVqsSN.NUOYIeCuetncDh, iArr4[1]);
            jSONObject4.put(yFbVsaLCWAtQC.iNeSCEdooogH, D(y41Var) ? Integer.valueOf(x(35071)) : JSONObject.NULL);
            jSONObject4.put(yttXLrAeLjN.TYRyZG, D(y41Var) ? Integer.valueOf(x(36063)) : JSONObject.NULL);
            if (D(y41Var)) {
                jSONObject4.put("maxVertexUniformBlocks", x(35371));
                jSONObject4.put("maxFragmentUniformBlocks", x(35373));
                jSONObject4.put("maxCombinedUniformBlocks", x(35374));
            } else {
                Object obj = JSONObject.NULL;
                jSONObject4.put("maxVertexUniformBlocks", obj);
                jSONObject4.put("maxFragmentUniformBlocks", obj);
                jSONObject4.put("maxCombinedUniformBlocks", obj);
            }
            jSONObject4.put(BFtDZYxPcpGN.QnmygiPxRixsVzf, G(1, y41Var) ? Integer.valueOf(x(37307)) : JSONObject.NULL);
            jSONObject4.put("maxGeometryUniformBlocks", G(2, y41Var) ? Integer.valueOf(x(35372)) : JSONObject.NULL);
            jSONObject4.put("maxTessControlUniformBlocks", G(2, y41Var) ? Integer.valueOf(x(36489)) : JSONObject.NULL);
            jSONObject4.put(CGvJMCDBOmCdj.zTCEIXMQp, G(2, y41Var) ? Integer.valueOf(x(36490)) : JSONObject.NULL);
            jSONObject4.put("subpixelBits", x(3408));
            GLES20.glGetFloatv(33902, new float[2], 0);
            jSONObject4.put("aliasedLineWidthMin", Math.round(r6[0] * 10.0d) / 10.0d);
            jSONObject4.put("aliasedLineWidthMax", Math.round(r6[1] * 10.0d) / 10.0d);
            jSONObject4.put("compressedTextureFormats", x(34466));
            jSONObject.put("limits", jSONObject4);
            JSONArray w = w(y41Var);
            jSONObject.put("extensions", w);
            jSONObject.put("extensionsCount", w.length());
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("astc", C(w, "ASTC"));
            if (!D(y41Var) && !C(w, "GL_ES_compressed_ETC2")) {
                z = false;
                jSONObject5.put("etc2", z);
                jSONObject5.put("etc1", C(w, "GL_OES_compressed_ETC1_RGB8_texture"));
                jSONObject5.put("srgb", C(w, "GL_EXT_sRGB"));
                jSONObject5.put("textureStorage", !D(y41Var) || C(w, "GL_EXT_texture_storage"));
                jSONObject5.put("timerQuery", C(w, "GL_EXT_disjoint_timer_query"));
                jSONObject5.put("compute", G(1, y41Var));
                jSONObject5.put("geometry", G(2, y41Var));
                jSONObject5.put("tessellation", G(2, y41Var));
                jSONObject.put("highlights", jSONObject5);
                return jSONObject.toString();
            }
            z = true;
            jSONObject5.put("etc2", z);
            jSONObject5.put("etc1", C(w, "GL_OES_compressed_ETC1_RGB8_texture"));
            jSONObject5.put("srgb", C(w, "GL_EXT_sRGB"));
            jSONObject5.put("textureStorage", !D(y41Var) || C(w, "GL_EXT_texture_storage"));
            jSONObject5.put("timerQuery", C(w, "GL_EXT_disjoint_timer_query"));
            jSONObject5.put("compute", G(1, y41Var));
            jSONObject5.put("geometry", G(2, y41Var));
            jSONObject5.put("tessellation", G(2, y41Var));
            jSONObject.put("highlights", jSONObject5);
            return jSONObject.toString();
        } catch (Throwable th2) {
            th = th2;
            try {
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("error", th.getClass().getSimpleName() + ": " + th.getMessage());
                    return jSONObject6.toString();
                } finally {
                    p(y41Var);
                }
            } catch (Throwable unused3) {
                return Gvyagftz.vUmr;
            }
        }
    }

    public static int j(int i, int i2) {
        return ts.e(i, (Color.alpha(i) * i2) / 255);
    }

    public static final void k(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static y41 l(int i) {
        y41 y41Var = new y41();
        y41Var.c = EGL14.EGL_NO_DISPLAY;
        y41Var.d = EGL14.EGL_NO_CONTEXT;
        y41Var.e = EGL14.EGL_NO_SURFACE;
        try {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            y41Var.c = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("No EGL display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new RuntimeException("eglInitialize failed");
            }
            EGL14.eglBindAPI(12448);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            if (!EGL14.eglChooseConfig((EGLDisplay) y41Var.c, new int[]{12352, i >= 3 ? 64 : 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] <= 0) {
                throw new RuntimeException("eglChooseConfig failed");
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) y41Var.c, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, i, 12344}, 0);
            y41Var.d = eglCreateContext;
            if (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                throw new RuntimeException("eglCreateContext failed (ES " + i + ")");
            }
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) y41Var.c, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
            y41Var.e = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == null || eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                throw new RuntimeException("eglCreatePbufferSurface failed");
            }
            if (EGL14.eglMakeCurrent((EGLDisplay) y41Var.c, eglCreatePbufferSurface, eglCreatePbufferSurface, (EGLContext) y41Var.d)) {
                return y41Var;
            }
            throw new RuntimeException("eglMakeCurrent failed");
        } catch (Exception e) {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) y41Var.c;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGLContext eGLContext = (EGLContext) y41Var.d;
                    if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext((EGLDisplay) y41Var.c, eGLContext);
                    }
                    EGLSurface eGLSurface2 = (EGLSurface) y41Var.e;
                    if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface((EGLDisplay) y41Var.c, eGLSurface2);
                    }
                    EGL14.eglTerminate((EGLDisplay) y41Var.c);
                    EGL14.eglReleaseThread();
                }
            } catch (Throwable unused) {
            }
            throw e;
        }
    }

    public static y41 m() {
        int[][] iArr = {new int[]{3, 2}, new int[]{3, 1}, new int[]{3, 0}, new int[]{2, 0}};
        Exception e = null;
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = iArr[i];
            try {
                int i2 = iArr2[0];
                int i3 = iArr2[1];
                y41 l = l(i2);
                l.f1210a = iArr2[0];
                l.b = iArr2[1];
                return l;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
        c.o("Unable to create any GLES context");
        return null;
    }

    public static void n(Context context, int i) {
        context.getApplicationContext().getSharedPreferences("widget_accent_prefs", 0).edit().remove(yFbVsaLCWAtQC.EfhNyJFslgbVp + i).apply();
    }

    public static int o(int i) {
        float f;
        float abs;
        int round;
        int round2;
        float[] fArr = new float[3];
        ThreadLocal threadLocal = ts.f1003a;
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        float max = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f2 = max - min;
        float f3 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == red ? ((green - blue) / f2) % 6.0f : max == green ? ((blue - red) / f2) + 2.0f : ((red - green) / f2) + 4.0f;
            abs = f2 / (1.0f - Math.abs((f3 * 2.0f) - 1.0f));
        }
        float f4 = (f * 60.0f) % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        float min2 = f4 < 0.0f ? 0.0f : Math.min(f4, 360.0f);
        int i2 = 0;
        fArr[0] = min2;
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        float min3 = f3 < 0.0f ? 0.0f : Math.min(f3, 1.0f);
        fArr[2] = min3;
        fArr[1] = fArr[1] * 0.6f;
        float min4 = min3 < 0.5f ? Math.min(1.0f, min3 + 0.55f) : Math.max(0.0f, min3 - 0.45f);
        fArr[2] = min4;
        float f5 = fArr[0];
        float abs2 = (1.0f - Math.abs((min4 * 2.0f) - 1.0f)) * fArr[1];
        float f6 = min4 - (0.5f * abs2);
        float abs3 = (1.0f - Math.abs(((f5 / 60.0f) % 2.0f) - 1.0f)) * abs2;
        switch (((int) f5) / 60) {
            case 0:
                i2 = Math.round((abs2 + f6) * 255.0f);
                round = Math.round((abs3 + f6) * 255.0f);
                round2 = Math.round(f6 * 255.0f);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                i2 = Math.round((abs3 + f6) * 255.0f);
                round = Math.round((abs2 + f6) * 255.0f);
                round2 = Math.round(f6 * 255.0f);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                i2 = Math.round(f6 * 255.0f);
                round = Math.round((abs2 + f6) * 255.0f);
                round2 = Math.round((abs3 + f6) * 255.0f);
                break;
            case 3:
                i2 = Math.round(f6 * 255.0f);
                round = Math.round((abs3 + f6) * 255.0f);
                round2 = Math.round((abs2 + f6) * 255.0f);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                i2 = Math.round((abs3 + f6) * 255.0f);
                round = Math.round(f6 * 255.0f);
                round2 = Math.round((abs2 + f6) * 255.0f);
                break;
            case 5:
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                i2 = Math.round((abs2 + f6) * 255.0f);
                round = Math.round(f6 * 255.0f);
                round2 = Math.round((abs3 + f6) * 255.0f);
                break;
            default:
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(ts.d(i2), ts.d(round), ts.d(round2)) | (-16777216);
    }

    public static void p(y41 y41Var) {
        try {
            if (y41Var == null) {
                try {
                    EGL14.eglReleaseThread();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) y41Var.c;
                if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGLContext eGLContext = (EGLContext) y41Var.d;
                    if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                        EGL14.eglDestroyContext((EGLDisplay) y41Var.c, eGLContext);
                    }
                    EGLSurface eGLSurface2 = (EGLSurface) y41Var.e;
                    if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface((EGLDisplay) y41Var.c, eGLSurface2);
                    }
                    EGL14.eglTerminate((EGLDisplay) y41Var.c);
                }
                EGL14.eglReleaseThread();
            } catch (Throwable unused2) {
                EGL14.eglReleaseThread();
            }
        } catch (Throwable unused3) {
        }
    }

    public static int q(int i, Context context, String str) {
        return O(context, md2.u(i, context, str));
    }

    public static int r(Context context, int i) {
        return context.getApplicationContext().getSharedPreferences("widget_accent_prefs", 0).getInt("accent_" + i, 0);
    }

    public static int s(Context context, int i, int i2) {
        Integer t = t(context, i);
        return t != null ? t.intValue() : i2;
    }

    public static Integer t(Context context, int i) {
        TypedValue q = md2.q(context.getTheme(), i);
        if (q != null) {
            return Integer.valueOf(O(context, q));
        }
        return null;
    }

    public static final int u(Cursor cursor, String str) {
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        columnNames.getClass();
        String concat = ".".concat(str);
        String str2 = "." + str + '`';
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str3 = columnNames[i];
            int i3 = i2 + 1;
            if (str3.length() >= str.length() + 2 && (str3.endsWith(concat) || (str3.charAt(0) == '`' && str3.endsWith(str2)))) {
                return i2;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    public static final int v(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        int u = u(cursor, str);
        if (u >= 0) {
            return u;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            String str3 = RIhTGWkqQvGL.cNEoNwvqTtn;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str3);
            int i = 0;
            for (String str4 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                om0.a(sb, str4, null);
            }
            sb.append((CharSequence) str3);
            str2 = sb.toString();
        } catch (Exception unused) {
            str2 = "unknown";
        }
        rw.h("column '", str, "' does not exist. Available columns: ", str2);
        return 0;
    }

    public static JSONArray w(y41 y41Var) {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            if (D(y41Var)) {
                int[] iArr = new int[1];
                GLES20.glGetIntegerv(33309, iArr, 0);
                int max = Math.max(0, iArr[0]);
                while (i < max) {
                    String glGetStringi = GLES30.glGetStringi(7939, i);
                    if (glGetStringi != null && !glGetStringi.isEmpty()) {
                        jSONArray.put(glGetStringi);
                    }
                    i++;
                }
            } else {
                String glGetString = GLES20.glGetString(7939);
                if (glGetString != null && !glGetString.isEmpty()) {
                    String[] split = glGetString.split("\\s+");
                    int length = split.length;
                    while (i < length) {
                        String str = split[i];
                        if (!str.isEmpty()) {
                            jSONArray.put(str);
                        }
                        i++;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public static int x(int i) {
        int[] iArr = new int[1];
        try {
            GLES20.glGetIntegerv(i, iArr, 0);
            return iArr[0];
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int y(Context context) {
        return context.getResources().getColor((context.getResources().getConfiguration().uiMode & 48) == 32 ? R.color.system_accent1_200 : R.color.system_accent1_600, context.getTheme()) | (-16777216);
    }

    public static final int z(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                c.m("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public abstract void L(int i);

    public abstract void M(Typeface typeface, boolean z);
}
