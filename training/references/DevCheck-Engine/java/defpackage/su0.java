package defpackage;

import android.window.OnBackInvokedCallback;
import java.util.Objects;

/* loaded from: classes.dex */
public class su0 {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f955a;

    public OnBackInvokedCallback a(ru0 ru0Var) {
        Objects.requireNonNull(ru0Var);
        return new s5(1, ru0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.ru0 r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.f955a
            if (r0 == 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r3 = defpackage.u0.i(r3)
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r2 = r1.a(r2)
            r1.f955a = r2
            if (r4 == 0) goto L18
            r1 = 1000000(0xf4240, float:1.401298E-39)
            goto L19
        L18:
            r1 = 0
        L19:
            defpackage.u0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su0.b(ru0, android.view.View, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r2) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.f955a
            if (r0 != 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r2 = defpackage.u0.i(r2)
            if (r2 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r0 = r1.f955a
            defpackage.u0.p(r2, r0)
            r2 = 0
            r1.f955a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su0.c(android.view.View):void");
    }
}
