package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import flar2.devcheck.R;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class dk extends ld0 {
    public lk d0;
    public final Handler e0 = new Handler(Looper.getMainLooper());

    public final void A0(int i, CharSequence charSequence) {
        B0(i, charSequence);
        v0();
    }

    public final void B0(int i, CharSequence charSequence) {
        lk lkVar = this.d0;
        if (!lkVar.l && lkVar.k) {
            lkVar.k = false;
            Executor executor = lkVar.b;
            if (executor == null) {
                executor = new x9(2);
            }
            executor.execute(new xj(this, i, charSequence));
        }
    }

    public final void C0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = A(R.string.default_error_msg);
        }
        lk lkVar = this.d0;
        if (lkVar.w == null) {
            lkVar.w = new qy0();
        }
        lk.f(lkVar.w, 2);
        lk lkVar2 = this.d0;
        if (lkVar2.x == null) {
            lkVar2.x = new qy0();
        }
        lk.f(lkVar2.x, charSequence);
    }

    public final void D0() {
        boolean z;
        boolean z2;
        if (this.d0.j || v() == null) {
            return;
        }
        lk lkVar = this.d0;
        lkVar.j = true;
        lkVar.k = true;
        Context v = v();
        boolean z3 = false;
        if (v != null) {
            String str = Build.MANUFACTURER;
            if (Build.VERSION.SDK_INT != 29) {
                z2 = false;
            } else {
                if (str != null) {
                    for (String str2 : v.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors)) {
                        if (str.equalsIgnoreCase(str2)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                z2 = !z;
            }
            if (z2) {
                int c = this.d0.c();
                if ((c & 255) == 255 && tl2.w(c)) {
                    this.d0.o = true;
                    z0();
                    return;
                }
            }
        }
        if (y0()) {
            A0(12, ym0.l(i0().getApplicationContext(), 12));
            return;
        }
        BiometricPrompt.Builder d = zj.d(i0().getApplicationContext());
        fh fhVar = this.d0.d;
        CharSequence charSequence = fhVar != null ? (CharSequence) fhVar.h : null;
        CharSequence charSequence2 = fhVar != null ? (CharSequence) fhVar.i : null;
        if (charSequence != null) {
            zj.g(d, charSequence);
        }
        if (charSequence2 != null) {
            zj.f(d, charSequence2);
        }
        lk lkVar2 = this.d0;
        CharSequence charSequence3 = lkVar2.h;
        if (charSequence3 == null) {
            fh fhVar2 = lkVar2.d;
            if (fhVar2 != null) {
                charSequence3 = (CharSequence) fhVar2.j;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
            } else {
                charSequence3 = null;
            }
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            Executor executor = this.d0.b;
            if (executor == null) {
                executor = new x9(2);
            }
            lk lkVar3 = this.d0;
            if (lkVar3.g == null) {
                lkVar3.g = new kk(lkVar3);
            }
            zj.e(d, charSequence3, executor, lkVar3.g);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            fh fhVar3 = this.d0.d;
            ak.a(d, true);
        }
        int c2 = this.d0.c();
        if (i >= 30) {
            bk.a(d, c2);
        } else if (i >= 29) {
            ak.b(d, tl2.w(c2));
        }
        BiometricPrompt c3 = zj.c(d);
        Context v2 = v();
        this.d0.getClass();
        BiometricPrompt.CryptoObject z0 = ju0.z0(null);
        lk lkVar4 = this.d0;
        if (lkVar4.f == null) {
            lkVar4.f = new kp(4, z3);
        }
        kp kpVar = lkVar4.f;
        if (((CancellationSignal) kpVar.h) == null) {
            kpVar.h = fo.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) kpVar.h;
        x9 x9Var = new x9(1);
        lk lkVar5 = this.d0;
        if (lkVar5.e == null) {
            jk jkVar = new jk(lkVar5);
            xi0 xi0Var = new xi0();
            xi0Var.h = jkVar;
            lkVar5.e = xi0Var;
        }
        xi0 xi0Var2 = lkVar5.e;
        if (((BiometricPrompt$AuthenticationCallback) xi0Var2.g) == null) {
            xi0Var2.g = da.a((jk) xi0Var2.h);
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) xi0Var2.g;
        try {
            if (z0 == null) {
                zj.b(c3, cancellationSignal, x9Var, biometricPrompt$AuthenticationCallback);
            } else {
                zj.a(c3, z0, cancellationSignal, x9Var, biometricPrompt$AuthenticationCallback);
            }
        } catch (NullPointerException unused) {
            A0(1, v2 != null ? v2.getString(R.string.default_error_msg) : "");
        }
    }

    @Override // defpackage.ld0
    public final void K(int i, int i2, Intent intent) {
        super.K(i, i2, intent);
        if (i == 1) {
            lk lkVar = this.d0;
            lkVar.l = false;
            if (i2 != -1) {
                A0(10, A(R.string.generic_error_user_canceled));
                return;
            }
            if (lkVar.o) {
                lkVar.o = false;
            }
            gk gkVar = new gk();
            if (lkVar.k) {
                lkVar.k = false;
                Executor executor = lkVar.b;
                if (executor == null) {
                    executor = new x9(2);
                }
                executor.execute(new vj(this, gkVar));
            }
            v0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [ni0, o72] */
    /* JADX WARN: Type inference failed for: r6v28, types: [ld0] */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        final int i = 1;
        if (this.d0 == null) {
            lk lkVar = null;
            ?? t = this.m.getBoolean("host_activity", true) ? t() : 0;
            if (t == 0) {
                t = this.B;
            }
            if (t != 0) {
                n72 l = t.l();
                l72 g = t.g();
                py0 h = t.h();
                l.getClass();
                g.getClass();
                gr grVar = new gr(l, g, h);
                vq a2 = af1.a(lk.class);
                String b = a2.b();
                if (b != null) {
                    lkVar = (lk) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                } else {
                    c.m(qJTtDWNCVUDjB.rFvzIPsc);
                }
            } else {
                c.n("view model not found");
            }
            this.d0 = lkVar;
        }
        lk lkVar2 = this.d0;
        a5 t2 = t();
        lkVar2.getClass();
        new WeakReference(t2);
        lk lkVar3 = this.d0;
        if (lkVar3.p == null) {
            lkVar3.p = new qy0();
        }
        final int i2 = 0;
        lkVar3.p.e(this, new v31(this) { // from class: wj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i3 = i2;
                int i4 = 0;
                int i5 = 2;
                CharSequence charSequence = null;
                dk dkVar = this.b;
                switch (i3) {
                    case 0:
                        gk gkVar = (gk) obj;
                        if (gkVar != null) {
                            lk lkVar4 = dkVar.d0;
                            if (lkVar4.k) {
                                lkVar4.k = false;
                                Executor executor = lkVar4.b;
                                if (executor == null) {
                                    executor = new x9(2);
                                }
                                executor.execute(new vj(dkVar, gkVar));
                            }
                            dkVar.v0();
                            lk lkVar5 = dkVar.d0;
                            if (lkVar5.p == null) {
                                lkVar5.p = new qy0();
                            }
                            lk.f(lkVar5.p, null);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        uj ujVar = (uj) obj;
                        if (ujVar != null) {
                            int i6 = ujVar.f1045a;
                            CharSequence charSequence2 = ujVar.b;
                            switch (i6) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                case 3:
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                case 5:
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                case 8:
                                case rt0.o /* 9 */:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                default:
                                    i6 = 8;
                                    break;
                            }
                            Context v = dkVar.v();
                            int i7 = Build.VERSION.SDK_INT;
                            if (i7 < 29 && ((i6 == 7 || i6 == 9) && v != null)) {
                                KeyguardManager a3 = xo0.a(v);
                                if ((a3 == null ? false : xo0.b(a3)) && tl2.w(dkVar.d0.c())) {
                                    dkVar.z0();
                                    dkVar.d0.d(null);
                                    break;
                                }
                            }
                            if (dkVar.y0()) {
                                if (charSequence2 == null) {
                                    charSequence2 = ym0.l(dkVar.v(), i6);
                                }
                                lk lkVar6 = dkVar.d0;
                                if (i6 == 5) {
                                    int i8 = lkVar6.i;
                                    if (i8 == 0 || i8 == 3) {
                                        dkVar.B0(i6, charSequence2);
                                    }
                                    dkVar.v0();
                                } else {
                                    if (lkVar6.u) {
                                        dkVar.A0(i6, charSequence2);
                                    } else {
                                        dkVar.C0(charSequence2);
                                        Handler handler = dkVar.e0;
                                        hh hhVar = new hh(i6, i5, dkVar, charSequence2);
                                        Context v2 = dkVar.v();
                                        if (v2 != null) {
                                            String str = Build.MODEL;
                                            if (i7 == 28 && str != null) {
                                                for (String str2 : v2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                    if (str.startsWith(str2)) {
                                                        handler.postDelayed(hhVar, i4);
                                                    }
                                                }
                                            }
                                        }
                                        i4 = 2000;
                                        handler.postDelayed(hhVar, i4);
                                    }
                                    dkVar.d0.u = true;
                                }
                            } else {
                                if (charSequence2 == null) {
                                    charSequence2 = dkVar.A(R.string.default_error_msg) + XmJDY.PQGxcjPS + i6;
                                }
                                dkVar.A0(i6, charSequence2);
                            }
                            dkVar.d0.d(null);
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        CharSequence charSequence3 = (CharSequence) obj;
                        if (charSequence3 != null) {
                            if (dkVar.y0()) {
                                dkVar.C0(charSequence3);
                            }
                            dkVar.d0.d(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.y0()) {
                                dkVar.C0(dkVar.A(R.string.fingerprint_not_recognized));
                            }
                            lk lkVar7 = dkVar.d0;
                            if (lkVar7.k) {
                                Executor executor2 = lkVar7.b;
                                if (executor2 == null) {
                                    executor2 = new x9(2);
                                }
                                executor2.execute(new vj(dkVar));
                            }
                            lk lkVar8 = dkVar.d0;
                            if (lkVar8.s == null) {
                                lkVar8.s = new qy0();
                            }
                            lk.f(lkVar8.s, Boolean.FALSE);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.x0()) {
                                dkVar.z0();
                            } else {
                                lk lkVar9 = dkVar.d0;
                                String str3 = lkVar9.h;
                                if (str3 != null) {
                                    charSequence = str3;
                                } else {
                                    fh fhVar = lkVar9.d;
                                    if (fhVar != null && (charSequence = (CharSequence) fhVar.j) == null) {
                                        charSequence = "";
                                    }
                                }
                                if (charSequence == null) {
                                    charSequence = dkVar.A(R.string.default_error_msg);
                                }
                                dkVar.A0(13, charSequence);
                                dkVar.u0(2);
                            }
                            dkVar.d0.e(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            dkVar.u0(1);
                            dkVar.v0();
                            lk lkVar10 = dkVar.d0;
                            if (lkVar10.v == null) {
                                lkVar10.v = new qy0();
                            }
                            lk.f(lkVar10.v, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        lk lkVar4 = this.d0;
        if (lkVar4.q == null) {
            lkVar4.q = new qy0();
        }
        lkVar4.q.e(this, new v31(this) { // from class: wj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i3 = i;
                int i4 = 0;
                int i5 = 2;
                CharSequence charSequence = null;
                dk dkVar = this.b;
                switch (i3) {
                    case 0:
                        gk gkVar = (gk) obj;
                        if (gkVar != null) {
                            lk lkVar42 = dkVar.d0;
                            if (lkVar42.k) {
                                lkVar42.k = false;
                                Executor executor = lkVar42.b;
                                if (executor == null) {
                                    executor = new x9(2);
                                }
                                executor.execute(new vj(dkVar, gkVar));
                            }
                            dkVar.v0();
                            lk lkVar5 = dkVar.d0;
                            if (lkVar5.p == null) {
                                lkVar5.p = new qy0();
                            }
                            lk.f(lkVar5.p, null);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        uj ujVar = (uj) obj;
                        if (ujVar != null) {
                            int i6 = ujVar.f1045a;
                            CharSequence charSequence2 = ujVar.b;
                            switch (i6) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                case 3:
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                case 5:
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                case 8:
                                case rt0.o /* 9 */:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                default:
                                    i6 = 8;
                                    break;
                            }
                            Context v = dkVar.v();
                            int i7 = Build.VERSION.SDK_INT;
                            if (i7 < 29 && ((i6 == 7 || i6 == 9) && v != null)) {
                                KeyguardManager a3 = xo0.a(v);
                                if ((a3 == null ? false : xo0.b(a3)) && tl2.w(dkVar.d0.c())) {
                                    dkVar.z0();
                                    dkVar.d0.d(null);
                                    break;
                                }
                            }
                            if (dkVar.y0()) {
                                if (charSequence2 == null) {
                                    charSequence2 = ym0.l(dkVar.v(), i6);
                                }
                                lk lkVar6 = dkVar.d0;
                                if (i6 == 5) {
                                    int i8 = lkVar6.i;
                                    if (i8 == 0 || i8 == 3) {
                                        dkVar.B0(i6, charSequence2);
                                    }
                                    dkVar.v0();
                                } else {
                                    if (lkVar6.u) {
                                        dkVar.A0(i6, charSequence2);
                                    } else {
                                        dkVar.C0(charSequence2);
                                        Handler handler = dkVar.e0;
                                        hh hhVar = new hh(i6, i5, dkVar, charSequence2);
                                        Context v2 = dkVar.v();
                                        if (v2 != null) {
                                            String str = Build.MODEL;
                                            if (i7 == 28 && str != null) {
                                                for (String str2 : v2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                    if (str.startsWith(str2)) {
                                                        handler.postDelayed(hhVar, i4);
                                                    }
                                                }
                                            }
                                        }
                                        i4 = 2000;
                                        handler.postDelayed(hhVar, i4);
                                    }
                                    dkVar.d0.u = true;
                                }
                            } else {
                                if (charSequence2 == null) {
                                    charSequence2 = dkVar.A(R.string.default_error_msg) + XmJDY.PQGxcjPS + i6;
                                }
                                dkVar.A0(i6, charSequence2);
                            }
                            dkVar.d0.d(null);
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        CharSequence charSequence3 = (CharSequence) obj;
                        if (charSequence3 != null) {
                            if (dkVar.y0()) {
                                dkVar.C0(charSequence3);
                            }
                            dkVar.d0.d(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.y0()) {
                                dkVar.C0(dkVar.A(R.string.fingerprint_not_recognized));
                            }
                            lk lkVar7 = dkVar.d0;
                            if (lkVar7.k) {
                                Executor executor2 = lkVar7.b;
                                if (executor2 == null) {
                                    executor2 = new x9(2);
                                }
                                executor2.execute(new vj(dkVar));
                            }
                            lk lkVar8 = dkVar.d0;
                            if (lkVar8.s == null) {
                                lkVar8.s = new qy0();
                            }
                            lk.f(lkVar8.s, Boolean.FALSE);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.x0()) {
                                dkVar.z0();
                            } else {
                                lk lkVar9 = dkVar.d0;
                                String str3 = lkVar9.h;
                                if (str3 != null) {
                                    charSequence = str3;
                                } else {
                                    fh fhVar = lkVar9.d;
                                    if (fhVar != null && (charSequence = (CharSequence) fhVar.j) == null) {
                                        charSequence = "";
                                    }
                                }
                                if (charSequence == null) {
                                    charSequence = dkVar.A(R.string.default_error_msg);
                                }
                                dkVar.A0(13, charSequence);
                                dkVar.u0(2);
                            }
                            dkVar.d0.e(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            dkVar.u0(1);
                            dkVar.v0();
                            lk lkVar10 = dkVar.d0;
                            if (lkVar10.v == null) {
                                lkVar10.v = new qy0();
                            }
                            lk.f(lkVar10.v, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        lk lkVar5 = this.d0;
        if (lkVar5.r == null) {
            lkVar5.r = new qy0();
        }
        final int i3 = 2;
        lkVar5.r.e(this, new v31(this) { // from class: wj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i32 = i3;
                int i4 = 0;
                int i5 = 2;
                CharSequence charSequence = null;
                dk dkVar = this.b;
                switch (i32) {
                    case 0:
                        gk gkVar = (gk) obj;
                        if (gkVar != null) {
                            lk lkVar42 = dkVar.d0;
                            if (lkVar42.k) {
                                lkVar42.k = false;
                                Executor executor = lkVar42.b;
                                if (executor == null) {
                                    executor = new x9(2);
                                }
                                executor.execute(new vj(dkVar, gkVar));
                            }
                            dkVar.v0();
                            lk lkVar52 = dkVar.d0;
                            if (lkVar52.p == null) {
                                lkVar52.p = new qy0();
                            }
                            lk.f(lkVar52.p, null);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        uj ujVar = (uj) obj;
                        if (ujVar != null) {
                            int i6 = ujVar.f1045a;
                            CharSequence charSequence2 = ujVar.b;
                            switch (i6) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                case 3:
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                case 5:
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                case 8:
                                case rt0.o /* 9 */:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                default:
                                    i6 = 8;
                                    break;
                            }
                            Context v = dkVar.v();
                            int i7 = Build.VERSION.SDK_INT;
                            if (i7 < 29 && ((i6 == 7 || i6 == 9) && v != null)) {
                                KeyguardManager a3 = xo0.a(v);
                                if ((a3 == null ? false : xo0.b(a3)) && tl2.w(dkVar.d0.c())) {
                                    dkVar.z0();
                                    dkVar.d0.d(null);
                                    break;
                                }
                            }
                            if (dkVar.y0()) {
                                if (charSequence2 == null) {
                                    charSequence2 = ym0.l(dkVar.v(), i6);
                                }
                                lk lkVar6 = dkVar.d0;
                                if (i6 == 5) {
                                    int i8 = lkVar6.i;
                                    if (i8 == 0 || i8 == 3) {
                                        dkVar.B0(i6, charSequence2);
                                    }
                                    dkVar.v0();
                                } else {
                                    if (lkVar6.u) {
                                        dkVar.A0(i6, charSequence2);
                                    } else {
                                        dkVar.C0(charSequence2);
                                        Handler handler = dkVar.e0;
                                        hh hhVar = new hh(i6, i5, dkVar, charSequence2);
                                        Context v2 = dkVar.v();
                                        if (v2 != null) {
                                            String str = Build.MODEL;
                                            if (i7 == 28 && str != null) {
                                                for (String str2 : v2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                    if (str.startsWith(str2)) {
                                                        handler.postDelayed(hhVar, i4);
                                                    }
                                                }
                                            }
                                        }
                                        i4 = 2000;
                                        handler.postDelayed(hhVar, i4);
                                    }
                                    dkVar.d0.u = true;
                                }
                            } else {
                                if (charSequence2 == null) {
                                    charSequence2 = dkVar.A(R.string.default_error_msg) + XmJDY.PQGxcjPS + i6;
                                }
                                dkVar.A0(i6, charSequence2);
                            }
                            dkVar.d0.d(null);
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        CharSequence charSequence3 = (CharSequence) obj;
                        if (charSequence3 != null) {
                            if (dkVar.y0()) {
                                dkVar.C0(charSequence3);
                            }
                            dkVar.d0.d(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.y0()) {
                                dkVar.C0(dkVar.A(R.string.fingerprint_not_recognized));
                            }
                            lk lkVar7 = dkVar.d0;
                            if (lkVar7.k) {
                                Executor executor2 = lkVar7.b;
                                if (executor2 == null) {
                                    executor2 = new x9(2);
                                }
                                executor2.execute(new vj(dkVar));
                            }
                            lk lkVar8 = dkVar.d0;
                            if (lkVar8.s == null) {
                                lkVar8.s = new qy0();
                            }
                            lk.f(lkVar8.s, Boolean.FALSE);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.x0()) {
                                dkVar.z0();
                            } else {
                                lk lkVar9 = dkVar.d0;
                                String str3 = lkVar9.h;
                                if (str3 != null) {
                                    charSequence = str3;
                                } else {
                                    fh fhVar = lkVar9.d;
                                    if (fhVar != null && (charSequence = (CharSequence) fhVar.j) == null) {
                                        charSequence = "";
                                    }
                                }
                                if (charSequence == null) {
                                    charSequence = dkVar.A(R.string.default_error_msg);
                                }
                                dkVar.A0(13, charSequence);
                                dkVar.u0(2);
                            }
                            dkVar.d0.e(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            dkVar.u0(1);
                            dkVar.v0();
                            lk lkVar10 = dkVar.d0;
                            if (lkVar10.v == null) {
                                lkVar10.v = new qy0();
                            }
                            lk.f(lkVar10.v, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        lk lkVar6 = this.d0;
        if (lkVar6.s == null) {
            lkVar6.s = new qy0();
        }
        final int i4 = 3;
        lkVar6.s.e(this, new v31(this) { // from class: wj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i32 = i4;
                int i42 = 0;
                int i5 = 2;
                CharSequence charSequence = null;
                dk dkVar = this.b;
                switch (i32) {
                    case 0:
                        gk gkVar = (gk) obj;
                        if (gkVar != null) {
                            lk lkVar42 = dkVar.d0;
                            if (lkVar42.k) {
                                lkVar42.k = false;
                                Executor executor = lkVar42.b;
                                if (executor == null) {
                                    executor = new x9(2);
                                }
                                executor.execute(new vj(dkVar, gkVar));
                            }
                            dkVar.v0();
                            lk lkVar52 = dkVar.d0;
                            if (lkVar52.p == null) {
                                lkVar52.p = new qy0();
                            }
                            lk.f(lkVar52.p, null);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        uj ujVar = (uj) obj;
                        if (ujVar != null) {
                            int i6 = ujVar.f1045a;
                            CharSequence charSequence2 = ujVar.b;
                            switch (i6) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                case 3:
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                case 5:
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                case 8:
                                case rt0.o /* 9 */:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                default:
                                    i6 = 8;
                                    break;
                            }
                            Context v = dkVar.v();
                            int i7 = Build.VERSION.SDK_INT;
                            if (i7 < 29 && ((i6 == 7 || i6 == 9) && v != null)) {
                                KeyguardManager a3 = xo0.a(v);
                                if ((a3 == null ? false : xo0.b(a3)) && tl2.w(dkVar.d0.c())) {
                                    dkVar.z0();
                                    dkVar.d0.d(null);
                                    break;
                                }
                            }
                            if (dkVar.y0()) {
                                if (charSequence2 == null) {
                                    charSequence2 = ym0.l(dkVar.v(), i6);
                                }
                                lk lkVar62 = dkVar.d0;
                                if (i6 == 5) {
                                    int i8 = lkVar62.i;
                                    if (i8 == 0 || i8 == 3) {
                                        dkVar.B0(i6, charSequence2);
                                    }
                                    dkVar.v0();
                                } else {
                                    if (lkVar62.u) {
                                        dkVar.A0(i6, charSequence2);
                                    } else {
                                        dkVar.C0(charSequence2);
                                        Handler handler = dkVar.e0;
                                        hh hhVar = new hh(i6, i5, dkVar, charSequence2);
                                        Context v2 = dkVar.v();
                                        if (v2 != null) {
                                            String str = Build.MODEL;
                                            if (i7 == 28 && str != null) {
                                                for (String str2 : v2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                    if (str.startsWith(str2)) {
                                                        handler.postDelayed(hhVar, i42);
                                                    }
                                                }
                                            }
                                        }
                                        i42 = 2000;
                                        handler.postDelayed(hhVar, i42);
                                    }
                                    dkVar.d0.u = true;
                                }
                            } else {
                                if (charSequence2 == null) {
                                    charSequence2 = dkVar.A(R.string.default_error_msg) + XmJDY.PQGxcjPS + i6;
                                }
                                dkVar.A0(i6, charSequence2);
                            }
                            dkVar.d0.d(null);
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        CharSequence charSequence3 = (CharSequence) obj;
                        if (charSequence3 != null) {
                            if (dkVar.y0()) {
                                dkVar.C0(charSequence3);
                            }
                            dkVar.d0.d(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.y0()) {
                                dkVar.C0(dkVar.A(R.string.fingerprint_not_recognized));
                            }
                            lk lkVar7 = dkVar.d0;
                            if (lkVar7.k) {
                                Executor executor2 = lkVar7.b;
                                if (executor2 == null) {
                                    executor2 = new x9(2);
                                }
                                executor2.execute(new vj(dkVar));
                            }
                            lk lkVar8 = dkVar.d0;
                            if (lkVar8.s == null) {
                                lkVar8.s = new qy0();
                            }
                            lk.f(lkVar8.s, Boolean.FALSE);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.x0()) {
                                dkVar.z0();
                            } else {
                                lk lkVar9 = dkVar.d0;
                                String str3 = lkVar9.h;
                                if (str3 != null) {
                                    charSequence = str3;
                                } else {
                                    fh fhVar = lkVar9.d;
                                    if (fhVar != null && (charSequence = (CharSequence) fhVar.j) == null) {
                                        charSequence = "";
                                    }
                                }
                                if (charSequence == null) {
                                    charSequence = dkVar.A(R.string.default_error_msg);
                                }
                                dkVar.A0(13, charSequence);
                                dkVar.u0(2);
                            }
                            dkVar.d0.e(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            dkVar.u0(1);
                            dkVar.v0();
                            lk lkVar10 = dkVar.d0;
                            if (lkVar10.v == null) {
                                lkVar10.v = new qy0();
                            }
                            lk.f(lkVar10.v, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        lk lkVar7 = this.d0;
        if (lkVar7.t == null) {
            lkVar7.t = new qy0();
        }
        final int i5 = 4;
        lkVar7.t.e(this, new v31(this) { // from class: wj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i32 = i5;
                int i42 = 0;
                int i52 = 2;
                CharSequence charSequence = null;
                dk dkVar = this.b;
                switch (i32) {
                    case 0:
                        gk gkVar = (gk) obj;
                        if (gkVar != null) {
                            lk lkVar42 = dkVar.d0;
                            if (lkVar42.k) {
                                lkVar42.k = false;
                                Executor executor = lkVar42.b;
                                if (executor == null) {
                                    executor = new x9(2);
                                }
                                executor.execute(new vj(dkVar, gkVar));
                            }
                            dkVar.v0();
                            lk lkVar52 = dkVar.d0;
                            if (lkVar52.p == null) {
                                lkVar52.p = new qy0();
                            }
                            lk.f(lkVar52.p, null);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        uj ujVar = (uj) obj;
                        if (ujVar != null) {
                            int i6 = ujVar.f1045a;
                            CharSequence charSequence2 = ujVar.b;
                            switch (i6) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                case 3:
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                case 5:
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                case 8:
                                case rt0.o /* 9 */:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                default:
                                    i6 = 8;
                                    break;
                            }
                            Context v = dkVar.v();
                            int i7 = Build.VERSION.SDK_INT;
                            if (i7 < 29 && ((i6 == 7 || i6 == 9) && v != null)) {
                                KeyguardManager a3 = xo0.a(v);
                                if ((a3 == null ? false : xo0.b(a3)) && tl2.w(dkVar.d0.c())) {
                                    dkVar.z0();
                                    dkVar.d0.d(null);
                                    break;
                                }
                            }
                            if (dkVar.y0()) {
                                if (charSequence2 == null) {
                                    charSequence2 = ym0.l(dkVar.v(), i6);
                                }
                                lk lkVar62 = dkVar.d0;
                                if (i6 == 5) {
                                    int i8 = lkVar62.i;
                                    if (i8 == 0 || i8 == 3) {
                                        dkVar.B0(i6, charSequence2);
                                    }
                                    dkVar.v0();
                                } else {
                                    if (lkVar62.u) {
                                        dkVar.A0(i6, charSequence2);
                                    } else {
                                        dkVar.C0(charSequence2);
                                        Handler handler = dkVar.e0;
                                        hh hhVar = new hh(i6, i52, dkVar, charSequence2);
                                        Context v2 = dkVar.v();
                                        if (v2 != null) {
                                            String str = Build.MODEL;
                                            if (i7 == 28 && str != null) {
                                                for (String str2 : v2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                    if (str.startsWith(str2)) {
                                                        handler.postDelayed(hhVar, i42);
                                                    }
                                                }
                                            }
                                        }
                                        i42 = 2000;
                                        handler.postDelayed(hhVar, i42);
                                    }
                                    dkVar.d0.u = true;
                                }
                            } else {
                                if (charSequence2 == null) {
                                    charSequence2 = dkVar.A(R.string.default_error_msg) + XmJDY.PQGxcjPS + i6;
                                }
                                dkVar.A0(i6, charSequence2);
                            }
                            dkVar.d0.d(null);
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        CharSequence charSequence3 = (CharSequence) obj;
                        if (charSequence3 != null) {
                            if (dkVar.y0()) {
                                dkVar.C0(charSequence3);
                            }
                            dkVar.d0.d(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.y0()) {
                                dkVar.C0(dkVar.A(R.string.fingerprint_not_recognized));
                            }
                            lk lkVar72 = dkVar.d0;
                            if (lkVar72.k) {
                                Executor executor2 = lkVar72.b;
                                if (executor2 == null) {
                                    executor2 = new x9(2);
                                }
                                executor2.execute(new vj(dkVar));
                            }
                            lk lkVar8 = dkVar.d0;
                            if (lkVar8.s == null) {
                                lkVar8.s = new qy0();
                            }
                            lk.f(lkVar8.s, Boolean.FALSE);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.x0()) {
                                dkVar.z0();
                            } else {
                                lk lkVar9 = dkVar.d0;
                                String str3 = lkVar9.h;
                                if (str3 != null) {
                                    charSequence = str3;
                                } else {
                                    fh fhVar = lkVar9.d;
                                    if (fhVar != null && (charSequence = (CharSequence) fhVar.j) == null) {
                                        charSequence = "";
                                    }
                                }
                                if (charSequence == null) {
                                    charSequence = dkVar.A(R.string.default_error_msg);
                                }
                                dkVar.A0(13, charSequence);
                                dkVar.u0(2);
                            }
                            dkVar.d0.e(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            dkVar.u0(1);
                            dkVar.v0();
                            lk lkVar10 = dkVar.d0;
                            if (lkVar10.v == null) {
                                lkVar10.v = new qy0();
                            }
                            lk.f(lkVar10.v, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        lk lkVar8 = this.d0;
        if (lkVar8.v == null) {
            lkVar8.v = new qy0();
        }
        final int i6 = 5;
        lkVar8.v.e(this, new v31(this) { // from class: wj
            public final /* synthetic */ dk b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i32 = i6;
                int i42 = 0;
                int i52 = 2;
                CharSequence charSequence = null;
                dk dkVar = this.b;
                switch (i32) {
                    case 0:
                        gk gkVar = (gk) obj;
                        if (gkVar != null) {
                            lk lkVar42 = dkVar.d0;
                            if (lkVar42.k) {
                                lkVar42.k = false;
                                Executor executor = lkVar42.b;
                                if (executor == null) {
                                    executor = new x9(2);
                                }
                                executor.execute(new vj(dkVar, gkVar));
                            }
                            dkVar.v0();
                            lk lkVar52 = dkVar.d0;
                            if (lkVar52.p == null) {
                                lkVar52.p = new qy0();
                            }
                            lk.f(lkVar52.p, null);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        uj ujVar = (uj) obj;
                        if (ujVar != null) {
                            int i62 = ujVar.f1045a;
                            CharSequence charSequence2 = ujVar.b;
                            switch (i62) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                case 3:
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                case 5:
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                case 8:
                                case rt0.o /* 9 */:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                default:
                                    i62 = 8;
                                    break;
                            }
                            Context v = dkVar.v();
                            int i7 = Build.VERSION.SDK_INT;
                            if (i7 < 29 && ((i62 == 7 || i62 == 9) && v != null)) {
                                KeyguardManager a3 = xo0.a(v);
                                if ((a3 == null ? false : xo0.b(a3)) && tl2.w(dkVar.d0.c())) {
                                    dkVar.z0();
                                    dkVar.d0.d(null);
                                    break;
                                }
                            }
                            if (dkVar.y0()) {
                                if (charSequence2 == null) {
                                    charSequence2 = ym0.l(dkVar.v(), i62);
                                }
                                lk lkVar62 = dkVar.d0;
                                if (i62 == 5) {
                                    int i8 = lkVar62.i;
                                    if (i8 == 0 || i8 == 3) {
                                        dkVar.B0(i62, charSequence2);
                                    }
                                    dkVar.v0();
                                } else {
                                    if (lkVar62.u) {
                                        dkVar.A0(i62, charSequence2);
                                    } else {
                                        dkVar.C0(charSequence2);
                                        Handler handler = dkVar.e0;
                                        hh hhVar = new hh(i62, i52, dkVar, charSequence2);
                                        Context v2 = dkVar.v();
                                        if (v2 != null) {
                                            String str = Build.MODEL;
                                            if (i7 == 28 && str != null) {
                                                for (String str2 : v2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                                    if (str.startsWith(str2)) {
                                                        handler.postDelayed(hhVar, i42);
                                                    }
                                                }
                                            }
                                        }
                                        i42 = 2000;
                                        handler.postDelayed(hhVar, i42);
                                    }
                                    dkVar.d0.u = true;
                                }
                            } else {
                                if (charSequence2 == null) {
                                    charSequence2 = dkVar.A(R.string.default_error_msg) + XmJDY.PQGxcjPS + i62;
                                }
                                dkVar.A0(i62, charSequence2);
                            }
                            dkVar.d0.d(null);
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        CharSequence charSequence3 = (CharSequence) obj;
                        if (charSequence3 != null) {
                            if (dkVar.y0()) {
                                dkVar.C0(charSequence3);
                            }
                            dkVar.d0.d(null);
                            break;
                        }
                        break;
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.y0()) {
                                dkVar.C0(dkVar.A(R.string.fingerprint_not_recognized));
                            }
                            lk lkVar72 = dkVar.d0;
                            if (lkVar72.k) {
                                Executor executor2 = lkVar72.b;
                                if (executor2 == null) {
                                    executor2 = new x9(2);
                                }
                                executor2.execute(new vj(dkVar));
                            }
                            lk lkVar82 = dkVar.d0;
                            if (lkVar82.s == null) {
                                lkVar82.s = new qy0();
                            }
                            lk.f(lkVar82.s, Boolean.FALSE);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (((Boolean) obj).booleanValue()) {
                            if (dkVar.x0()) {
                                dkVar.z0();
                            } else {
                                lk lkVar9 = dkVar.d0;
                                String str3 = lkVar9.h;
                                if (str3 != null) {
                                    charSequence = str3;
                                } else {
                                    fh fhVar = lkVar9.d;
                                    if (fhVar != null && (charSequence = (CharSequence) fhVar.j) == null) {
                                        charSequence = "";
                                    }
                                }
                                if (charSequence == null) {
                                    charSequence = dkVar.A(R.string.default_error_msg);
                                }
                                dkVar.A0(13, charSequence);
                                dkVar.u0(2);
                            }
                            dkVar.d0.e(false);
                            break;
                        }
                        break;
                    default:
                        if (((Boolean) obj).booleanValue()) {
                            dkVar.u0(1);
                            dkVar.v0();
                            lk lkVar10 = dkVar.d0;
                            if (lkVar10.v == null) {
                                lkVar10.v = new qy0();
                            }
                            lk.f(lkVar10.v, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.ld0
    public final void a0() {
        this.K = true;
        if (Build.VERSION.SDK_INT == 29 && tl2.w(this.d0.c())) {
            lk lkVar = this.d0;
            lkVar.n = true;
            this.e0.postDelayed(new ck(lkVar, 2), 250L);
        }
    }

    @Override // defpackage.ld0
    public final void b0() {
        this.K = true;
        if (Build.VERSION.SDK_INT >= 29 || this.d0.l) {
            return;
        }
        a5 t = t();
        if (t == null || !t.isChangingConfigurations()) {
            u0(0);
        }
    }

    public final void u0(int i) {
        if (i == 3 || !this.d0.n) {
            if (y0()) {
                this.d0.i = i;
                if (i == 1) {
                    B0(10, ym0.l(v(), 10));
                }
            }
            lk lkVar = this.d0;
            if (lkVar.f == null) {
                lkVar.f = new kp(4, false);
            }
            kp kpVar = lkVar.f;
            CancellationSignal cancellationSignal = (CancellationSignal) kpVar.h;
            if (cancellationSignal != null) {
                try {
                    fo.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                kpVar.h = null;
            }
            eo eoVar = (eo) kpVar.i;
            if (eoVar != null) {
                try {
                    eoVar.a();
                } catch (NullPointerException unused2) {
                }
                kpVar.i = null;
            }
        }
    }

    public final void v0() {
        w0();
        lk lkVar = this.d0;
        lkVar.j = false;
        if (!lkVar.l && G()) {
            yb ybVar = new yb(y());
            ybVar.j(this);
            ybVar.e(true);
        }
        Context v = v();
        if (v != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : v.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        lk lkVar2 = this.d0;
                        lkVar2.m = true;
                        this.e0.postDelayed(new ck(lkVar2, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void w0() {
        this.d0.j = false;
        if (G()) {
        }
    }

    public final boolean x0() {
        return Build.VERSION.SDK_INT <= 28 && tl2.w(this.d0.c());
    }

    public final boolean y0() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            if (v() != null) {
                this.d0.getClass();
            }
            if (i == 28) {
                Bundle bundle = this.m;
                Context v = v();
                if (!bundle.getBoolean("has_fingerprint", (v == null || v.getPackageManager() == null || !t51.a(v.getPackageManager())) ? false : true)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void z0() {
        Context v = v();
        KeyguardManager a2 = v != null ? xo0.a(v) : null;
        if (a2 == null) {
            A0(12, A(R.string.generic_error_no_keyguard));
            return;
        }
        lk lkVar = this.d0;
        fh fhVar = lkVar.d;
        CharSequence charSequence = fhVar != null ? (CharSequence) fhVar.h : null;
        CharSequence charSequence2 = fhVar != null ? (CharSequence) fhVar.i : null;
        lkVar.getClass();
        Intent a3 = yj.a(a2, charSequence, charSequence2 != null ? charSequence2 : null);
        if (a3 == null) {
            A0(14, A(R.string.generic_error_no_device_credential));
            return;
        }
        this.d0.l = true;
        if (y0()) {
            w0();
        }
        a3.setFlags(134742016);
        t0(a3, 1);
    }
}
