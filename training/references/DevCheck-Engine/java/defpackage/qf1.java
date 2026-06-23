package defpackage;

import android.os.Handler;
import android.os.Looper;
import flar2.devcheck.hwData.DeviceInfo;
import flar2.devcheck.hwData.a;
import java.util.Collections;

/* loaded from: classes.dex */
public final class qf1 {

    /* renamed from: a, reason: collision with root package name */
    public final zf f839a = new zf(3);
    public final Handler b = new Handler(Looper.getMainLooper());
    public final qy0 c = new qy0(new ic1(0.0d, hc1.e, null, null, null, Collections.EMPTY_LIST));
    public volatile li d;
    public volatile rh e;
    public volatile ai f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r24 = this;
            r0 = r24
            li r1 = r0.d
            rh r2 = r0.e
            ai r3 = r0.f
            r4 = 0
            if (r1 != 0) goto Le
            r9 = r4
            goto L11
        Le:
            double r6 = r1.e
            r9 = r6
        L11:
            if (r1 != 0) goto L17
            hc1 r1 = defpackage.hc1.e
            r11 = r1
            goto L4d
        L17:
            java.lang.String r1 = r1.f
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r6.<init>(r1)     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "cpu"
            double r7 = r6.optDouble(r1, r4)     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "memory"
            double r11 = r6.optDouble(r1, r4)     // Catch: org.json.JSONException -> L41
            java.lang.String r1 = "disk"
            double r13 = r6.optDouble(r1, r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r1 = "gpu"
            double r4 = r6.optDouble(r1, r4)     // Catch: org.json.JSONException -> L36
        L36:
            r22 = r4
            r16 = r7
            r18 = r11
            r20 = r13
            goto L47
        L3f:
            r13 = r4
            goto L36
        L41:
            r11 = r4
        L42:
            r13 = r11
            goto L36
        L44:
            r7 = r4
            r11 = r7
            goto L42
        L47:
            hc1 r15 = new hc1
            r15.<init>(r16, r18, r20, r22)
            r11 = r15
        L4d:
            r1 = 0
            if (r2 != 0) goto L52
            r12 = r1
            goto L55
        L52:
            fc1 r4 = r2.f894a
            r12 = r4
        L55:
            if (r2 != 0) goto L59
            r13 = r1
            goto L5c
        L59:
            fc1 r4 = r2.b
            r13 = r4
        L5c:
            if (r2 != 0) goto L60
        L5e:
            r14 = r1
            goto L63
        L60:
            fc1 r1 = r2.c
            goto L5e
        L63:
            if (r3 != 0) goto L69
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L67:
            r15 = r1
            goto L6c
        L69:
            java.util.List r1 = r3.f30a
            goto L67
        L6c:
            ic1 r8 = new ic1
            r8.<init>(r9, r11, r12, r13, r14, r15)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L81
            qy0 r0 = r0.c
            r0.k(r8)
            goto L8d
        L81:
            android.os.Handler r1 = r0.b
            n51 r2 = new n51
            r3 = 8
            r2.<init>(r0, r3, r8)
            r1.post(r2)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf1.a():void");
    }

    public final void b(li liVar) {
        String str;
        ok0 ok0Var;
        rh rhVar;
        this.d = liVar;
        a();
        try {
            str = a.b((DeviceInfo) new nh0().a(d10.q(d10.n())));
        } catch (Throwable unused) {
            str = null;
        }
        int i = 5;
        if (str != null) {
            zf zfVar = this.f839a;
            pf1 pf1Var = new pf1(this, 0);
            zfVar.getClass();
            String concat = "dev:".concat(str);
            oh J = zfVar.J(concat);
            if (J == null || (rhVar = J.b) == null) {
                try {
                    eu euVar = new eu(1);
                    euVar.k(null, "https://api.devcheck.app/api/rankings");
                    ok0Var = euVar.c();
                } catch (IllegalArgumentException unused2) {
                    ok0Var = null;
                }
                eu f = ok0Var.f();
                f.a("hardwareHash", str);
                f.a("schemaVersion", "3");
                ok0 c = f.c();
                a41 a41Var = (a41) zfVar.h;
                yh yhVar = new yh();
                yhVar.g = c;
                yhVar.b("GET", null);
                yf yfVar = new yf(yhVar);
                a41Var.getClass();
                new dd1(a41Var, yfVar).e(new fh(i, zfVar, pf1Var, concat));
            } else {
                pf1Var.onResult(rhVar);
            }
        }
        this.f839a.y(5, null, null, new pf1(this, 1));
    }
}
