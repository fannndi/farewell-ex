package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ol extends c6 {
    public BottomSheetBehavior l;
    public FrameLayout m;
    public CoordinatorLayout n;
    public FrameLayout o;
    public boolean p;
    public boolean q;
    public boolean r;
    public nl s;
    public final boolean t;
    public fh u;
    public final zk v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ol(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968724(0x7f040094, float:1.754611E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017978(0x7f14033a, float:1.967425E38)
        L1b:
            r3.<init>(r4, r5)
            r3.p = r0
            r3.q = r0
            zk r4 = new zk
            r4.<init>(r0, r3)
            r3.v = r4
            m5 r4 = r3.d()
            r4.i(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130969144(0x7f040238, float:1.7546962E38)
            int[] r5 = new int[]{r5}
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            r5 = 0
            boolean r5 = r4.getBoolean(r5, r5)
            r3.t = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.l == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.m == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.m = frameLayout;
            this.n = (CoordinatorLayout) this.m.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.m.findViewById(R.id.design_bottom_sheet);
            this.o = frameLayout2;
            BottomSheetBehavior E = BottomSheetBehavior.E(frameLayout2);
            this.l = E;
            ArrayList arrayList = E.c0;
            zk zkVar = this.v;
            if (!arrayList.contains(zkVar)) {
                arrayList.add(zkVar);
            }
            this.l.M(this.p);
            this.u = new fh(this.l, this.o);
        }
    }

    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.m.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.t) {
            FrameLayout frameLayout = this.m;
            gm2 gm2Var = new gm2(16, this);
            WeakHashMap weakHashMap = y62.f1215a;
            p62.c(frameLayout, gm2Var);
        }
        this.o.removeAllViews();
        FrameLayout frameLayout2 = this.o;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new q1(2, this));
        y62.o(this.o, new le(2, this));
        this.o.setOnTouchListener(new ne(1));
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r6 = this;
            super.onAttachedToWindow()
            android.view.Window r0 = r6.getWindow()
            r1 = 0
            if (r0 == 0) goto L43
            boolean r2 = r6.t
            r3 = 1
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r2 >= r4) goto L1a
            int r2 = r0.getNavigationBarColor()
            goto L1b
        L1a:
            r2 = r1
        L1b:
            int r2 = android.graphics.Color.alpha(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 >= r4) goto L25
            r2 = r3
            goto L26
        L25:
            r2 = r1
        L26:
            android.widget.FrameLayout r4 = r6.m
            if (r4 == 0) goto L2f
            r5 = r2 ^ 1
            r4.setFitsSystemWindows(r5)
        L2f:
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r6.n
            if (r4 == 0) goto L38
            r5 = r2 ^ 1
            r4.setFitsSystemWindows(r5)
        L38:
            r2 = r2 ^ r3
            defpackage.pr.U(r0, r2)
            nl r2 = r6.s
            if (r2 == 0) goto L43
            r2.e(r0)
        L43:
            fh r0 = r6.u
            if (r0 != 0) goto L48
            goto L63
        L48:
            java.lang.Object r2 = r0.j
            android.view.View r2 = (android.view.View) r2
            boolean r6 = r6.p
            java.lang.Object r3 = r0.h
            su0 r3 = (defpackage.su0) r3
            if (r6 == 0) goto L5e
            if (r3 == 0) goto L63
            java.lang.Object r6 = r0.i
            ru0 r6 = (defpackage.ru0) r6
            r3.b(r6, r2, r1)
            return
        L5e:
            if (r3 == 0) goto L63
            r3.c(r2)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol.onAttachedToWindow():void");
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        su0 su0Var;
        nl nlVar = this.s;
        if (nlVar != null) {
            nlVar.e(null);
        }
        fh fhVar = this.u;
        if (fhVar == null || (su0Var = (su0) fhVar.h) == null) {
            return;
        }
        su0Var.c((View) fhVar.j);
    }

    @Override // defpackage.bu, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.l;
        if (bottomSheetBehavior == null || bottomSheetBehavior.P != 5) {
            return;
        }
        bottomSheetBehavior.O(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        fh fhVar;
        super.setCancelable(z);
        if (this.p != z) {
            this.p = z;
            BottomSheetBehavior bottomSheetBehavior = this.l;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.M(z);
            }
            if (getWindow() == null || (fhVar = this.u) == null) {
                return;
            }
            View view = (View) fhVar.j;
            boolean z2 = this.p;
            su0 su0Var = (su0) fhVar.h;
            if (z2) {
                if (su0Var != null) {
                    su0Var.b((ru0) fhVar.i, view, false);
                }
            } else if (su0Var != null) {
                su0Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.p) {
            this.p = true;
        }
        this.q = z;
        this.r = true;
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }
}
