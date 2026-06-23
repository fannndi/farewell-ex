package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qe2 {

    /* renamed from: a, reason: collision with root package name */
    public final df2 f838a;
    public final String b;
    public final nv1 c;
    public final m52 d;
    public final vd2 e;

    public qe2(Context context, df2 df2Var, m52 m52Var) {
        nv1 nv1Var = new nv1();
        this.c = nv1Var;
        this.b = context.getPackageName();
        this.f838a = df2Var;
        this.d = m52Var;
        vd2 vd2Var = new vd2(context, df2Var, re2.f889a, new x42());
        this.e = vd2Var;
        vd2Var.a().post(new sd2(this, nv1Var, context));
    }

    public static Bundle a(qe2 qe2Var, cf2 cf2Var, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", qe2Var.b);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", cf2Var.f123a);
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt(YSHrxiHkAFcciU.knNGe, 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(cf2Var.b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xe2(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(md2.a(arrayList)));
        return bundle;
    }

    public static Bundle b(qe2 qe2Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", qe2Var.b);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xe2(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(md2.a(arrayList)));
        return bundle;
    }

    public static boolean c(qe2 qe2Var) {
        nv1 nv1Var = qe2Var.c;
        return nv1Var.f703a.d() && ((Integer) nv1Var.f703a.c()).intValue() < 83420000;
    }

    public static boolean d(qe2 qe2Var) {
        nv1 nv1Var = qe2Var.c;
        return nv1Var.f703a.d() && ((Integer) nv1Var.f703a.c()).intValue() == 0;
    }
}
