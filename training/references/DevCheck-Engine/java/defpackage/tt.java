package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media.RfwE.BIxeFreLLop;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tt {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1005a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ zt h;

    public tt(zt ztVar) {
        this.h = ztVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.f1005a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        t2 t2Var = (t2) this.e.get(str);
        if (t2Var != null) {
            p2 p2Var = t2Var.f966a;
            if (this.d.contains(str)) {
                p2Var.a(t2Var.b.M(intent, i2));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new o2(intent, i2));
        return true;
    }

    public final void b(int i, d10 d10Var, Object obj) {
        Bundle bundle;
        int i2;
        zt ztVar = this.h;
        b1 E = d10Var.E(ztVar, obj);
        if (E != null) {
            new Handler(Looper.getMainLooper()).post(new c7(this, i, E, 2));
            return;
        }
        Intent i3 = d10Var.i(ztVar, obj);
        if (i3.getExtras() != null && i3.getExtras().getClassLoader() == null) {
            i3.setExtrasClassLoader(ztVar.getClassLoader());
        }
        String str = BIxeFreLLop.RPedYwHu;
        if (i3.hasExtra(str)) {
            bundle = i3.getBundleExtra(str);
            i3.removeExtra(str);
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(i3.getAction())) {
            String[] stringArrayExtra = i3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            pr.R(ztVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(i3.getAction())) {
            ztVar.startActivityForResult(i3, i, bundle2);
            return;
        }
        wm0 wm0Var = (wm0) i3.getParcelableExtra(bPnJ.kYEWuKYmxwE);
        try {
            i2 = i;
            try {
                ztVar.startIntentSenderForResult(wm0Var.g, i2, wm0Var.h, wm0Var.i, wm0Var.j, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new c7(this, i2, e, 3));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final s2 c(String str, d10 d10Var, p2 p2Var) {
        d(str);
        this.e.put(str, new t2(p2Var, d10Var));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            p2Var.a(obj);
        }
        Bundle bundle = this.g;
        o2 o2Var = (o2) bundle.getParcelable(str);
        if (o2Var != null) {
            bundle.remove(str);
            p2Var.a(d10Var.M(o2Var.h, o2Var.g));
        }
        return new s2(this, str, d10Var, 1);
    }

    public final void d(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        x xVar = ec1.g;
        int nextInt = ec1.g.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + rt0.B;
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap2 = this.f1005a;
            if (!hashMap2.containsKey(valueOf)) {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            } else {
                x xVar2 = ec1.g;
                nextInt = ec1.g.a().nextInt(2147418112);
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.f1005a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Objects.toString(hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        u2 u2Var = (u2) hashMap2.get(str);
        if (u2Var != null) {
            ArrayList arrayList = u2Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                u2Var.f1017a.f((bq0) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
