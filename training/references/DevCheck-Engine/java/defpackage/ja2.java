package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ja2 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final dn2 f471a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public ja2(dn2 dn2Var) {
        super(0);
        this.d = new HashMap();
        this.f471a = dn2Var;
    }

    public final ma2 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        ma2 ma2Var = (ma2) hashMap.get(windowInsetsAnimation);
        if (ma2Var != null) {
            return ma2Var;
        }
        ma2 ma2Var2 = new ma2(0, null, 0L);
        ma2Var2.f621a = new ka2(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, ma2Var2);
        return ma2Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f471a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f471a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation k = u21.k(list.get(size));
            ma2 a2 = a(k);
            fraction = k.getFraction();
            a2.f621a.e(fraction);
            this.c.add(a2);
        }
        return this.f471a.c(gb2.h(null, windowInsets), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        zf d = this.f471a.d(a(windowInsetsAnimation), new zf(bounds));
        d.getClass();
        u21.m();
        return u21.i(((mm0) d.h).e(), ((mm0) d.i).e());
    }
}
