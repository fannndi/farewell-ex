package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class jl extends xc1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ hx e;

    public /* synthetic */ jl(hx hxVar, int i) {
        this.d = i;
        this.e = hxVar;
    }

    @Override // defpackage.xc1
    public final void A(int i) {
        int i2 = this.d;
        hx hxVar = this.e;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hxVar;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.P(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hxVar;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.x(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.xc1
    public final void B(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.d;
        hx hxVar = this.e;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) hxVar).C(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hxVar;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    op0 op0Var = sideSheetBehavior.f144a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (op0Var.f752a) {
                        case 0:
                            if (left <= op0Var.b.m) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i4 = op0Var.b.m;
                            if (left <= i4) {
                                marginLayoutParams.rightMargin = i4 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                op0 op0Var2 = sideSheetBehavior.f144a;
                switch (op0Var2.f752a) {
                    case 0:
                        op0Var2.p();
                        op0Var2.o();
                        break;
                    default:
                        int i5 = op0Var2.b.m;
                        op0Var2.o();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw d51.l(it);
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (java.lang.Math.abs((r0.b.k * r10) + r9.getRight()) > 0.5f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (java.lang.Math.abs(r10) > 500.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r9.getLeft() > ((r10.o() + r10.b.m) / 2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r5 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r9.getRight() < ((r10.o() - r10.p()) / 2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (java.lang.Math.abs(r10) > 500.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (java.lang.Math.abs(r10 - r8.f144a.o()) < java.lang.Math.abs(r10 - r8.f144a.p())) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0044, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0057, code lost:
    
        if (java.lang.Math.abs((r0.b.k * r10) + r9.getLeft()) > 0.5f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x001b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x001f, code lost:
    
        if (r10 > 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
    
        if (r10 > r8.F) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r10 < 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015d, code lost:
    
        if (java.lang.Math.abs(r9.getTop() - r8.G()) < java.lang.Math.abs(r9.getTop() - r8.F)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018d, code lost:
    
        if (java.lang.Math.abs(r10 - r8.F) < java.lang.Math.abs(r10 - r8.H)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        if (java.lang.Math.abs(r10 - r8.E) < java.lang.Math.abs(r10 - r8.H)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b6, code lost:
    
        if (r10 < java.lang.Math.abs(r10 - r8.H)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (java.lang.Math.abs(r10 - r11) < java.lang.Math.abs(r10 - r8.H)) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    @Override // defpackage.xc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r9, float r10, float r11) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.C(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r0.canScrollVertically(-1) != false) goto L41;
     */
    @Override // defpackage.xc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.d
            r1 = 1
            hx r4 = r4.e
            r2 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto L9;
            }
        L9:
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            int r6 = r4.h
            if (r6 != r1) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r4 = r4.p
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            int r0 = r4.P
            if (r0 != r1) goto L24
            goto L6e
        L24:
            boolean r3 = r4.i0
            if (r3 == 0) goto L29
            goto L6e
        L29:
            r3 = 3
            if (r0 != r3) goto L60
            int r0 = r4.f0
            if (r0 != r6) goto L60
            boolean r6 = r4.e
            r0 = 0
            if (r6 == 0) goto L41
            java.lang.ref.WeakReference r6 = r4.h0
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            r0 = r6
            android.view.View r0 = (android.view.View) r0
            goto L56
        L41:
            java.util.ArrayList r6 = r4.b0
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L56
            java.lang.Object r6 = r6.get(r2)
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            r0 = r6
            android.view.View r0 = (android.view.View) r0
        L56:
            if (r0 == 0) goto L60
            r6 = -1
            boolean r6 = r0.canScrollVertically(r6)
            if (r6 == 0) goto L60
            goto L6e
        L60:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r4 = r4.Y
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L6e
            goto L6f
        L6e:
            r1 = r2
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.J(android.view.View, int):boolean");
    }

    @Override // defpackage.xc1
    public final int l(View view, int i) {
        int i2;
        int i3;
        switch (this.d) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                op0 op0Var = sideSheetBehavior.f144a;
                switch (op0Var.f752a) {
                    case 0:
                        i2 = -op0Var.b.l;
                        break;
                    default:
                        i2 = op0Var.o();
                        break;
                }
                op0 op0Var2 = sideSheetBehavior.f144a;
                switch (op0Var2.f752a) {
                    case 0:
                        i3 = op0Var2.b.o;
                        break;
                    default:
                        i3 = op0Var2.b.m;
                        break;
                }
                return pr.k(i, i2, i3);
        }
    }

    @Override // defpackage.xc1
    public final int m(View view, int i) {
        switch (this.d) {
            case 0:
                return pr.k(i, ((BottomSheetBehavior) this.e).G(), v());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.xc1
    public int u(View view) {
        switch (this.d) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.u(view);
        }
    }

    @Override // defpackage.xc1
    public int v() {
        switch (this.d) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.v();
        }
    }
}
