package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class sj1 implements vj1 {

    /* renamed from: a, reason: collision with root package name */
    public final zf f940a;
    public boolean b;
    public Bundle c;
    public final wt1 d;

    public sj1(zf zfVar, o72 o72Var) {
        zfVar.getClass();
        this.f940a = zfVar;
        this.d = new wt1(new qt(6, o72Var));
    }

    @Override // defpackage.vj1
    public final Bundle a() {
        Bundle d = md2.d((z51[]) Arrays.copyOf(new z51[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            d.putAll(bundle);
        }
        for (Map.Entry entry : ((tj1) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((rt) ((oj1) entry.getValue()).f741a.k).a();
            if (!a2.isEmpty()) {
                str.getClass();
                d.putBundle(str, a2);
            }
        }
        this.b = false;
        return d;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle g = this.f940a.g("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle d = md2.d((z51[]) Arrays.copyOf(new z51[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            d.putAll(bundle);
        }
        if (g != null) {
            d.putAll(g);
        }
        this.c = d;
        this.b = true;
    }
}
