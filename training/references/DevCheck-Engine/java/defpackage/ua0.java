package defpackage;

import android.animation.ObjectAnimator;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.view.View;
import flar2.devcheck.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ua0 extends z02 {
    public static final String[] I = {"android:visibility:visibility", "android:visibility:parent"};
    public final int H;

    public ua0() {
        this.H = 3;
    }

    public ua0(int i) {
        this();
        this.H = i;
    }

    public static void J(g12 g12Var) {
        View view = g12Var.b;
        int visibility = view.getVisibility();
        HashMap hashMap = g12Var.f312a;
        hashMap.put(BFtDZYxPcpGN.brP, Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float L(g12 g12Var, float f) {
        Float f2;
        return (g12Var == null || (f2 = (Float) g12Var.f312a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c92 M(defpackage.g12 r8, defpackage.g12 r9) {
        /*
            c92 r0 = new c92
            r0.<init>()
            r1 = 0
            r0.f113a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f312a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f312a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.f113a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.f113a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.f113a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.f113a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.f113a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.f113a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua0.M(g12, g12):c92");
    }

    public final ObjectAnimator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        q82.f825a.x(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, q82.b, f2);
        ta0 ta0Var = new ta0(view);
        ofFloat.addListener(ta0Var);
        p().a(ta0Var);
        return ofFloat;
    }

    @Override // defpackage.z02
    public final void d(g12 g12Var) {
        J(g12Var);
    }

    @Override // defpackage.z02
    public final void g(g12 g12Var) {
        J(g12Var);
        View view = g12Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(q82.f825a.l(view)) : Float.valueOf(0.0f);
        }
        g12Var.f312a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (M(o(r3, false), s(r3, false)).f113a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dd  */
    @Override // defpackage.z02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r25, defpackage.g12 r26, defpackage.g12 r27) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua0.k(android.view.ViewGroup, g12, g12):android.animation.Animator");
    }

    @Override // defpackage.z02
    public final String[] r() {
        return I;
    }

    @Override // defpackage.z02
    public final boolean t(g12 g12Var, g12 g12Var2) {
        if (g12Var == null && g12Var2 == null) {
            return false;
        }
        if (g12Var != null && g12Var2 != null && g12Var2.f312a.containsKey("android:visibility:visibility") != g12Var.f312a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c92 M = M(g12Var, g12Var2);
        if (M.f113a) {
            return M.c == 0 || M.d == 0;
        }
        return false;
    }
}
