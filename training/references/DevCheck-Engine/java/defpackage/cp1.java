package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;

/* loaded from: classes.dex */
public final class cp1 extends pe {
    public static final int[] B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public boolean A;
    public final AccessibilityManager z;

    public cp1(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.z = (AccessibilityManager) viewGroup.getContext().getSystemService(CGvJMCDBOmCdj.ThBmijaUdv);
    }

    public static cp1 f(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            c.m("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        cp1 cp1Var = new cp1(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) cp1Var.i.getChildAt(0)).getMessageView().setText(charSequence);
        cp1Var.k = i;
        return cp1Var;
    }

    public final void g(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.A = false;
        } else {
            this.A = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new uc(this, 15, onClickListener));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0029, code lost:
    
        if (r1.isTouchExplorationEnabled() != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r9 = this;
            gr r0 = defpackage.gr.s()
            android.view.accessibility.AccessibilityManager r1 = r9.z
            int r2 = r9.k
            r3 = 0
            r4 = 4
            r5 = -2
            if (r2 != r5) goto Lf
        Ld:
            r2 = r5
            goto L2c
        Lf:
            int r6 = android.os.Build.VERSION.SDK_INT
            boolean r7 = r9.A
            r8 = 29
            if (r6 < r8) goto L23
            if (r7 == 0) goto L1b
            r5 = r4
            goto L1c
        L1b:
            r5 = r3
        L1c:
            r5 = r5 | 3
            int r2 = defpackage.fi0.d(r1, r2, r5)
            goto L2c
        L23:
            if (r7 == 0) goto L2c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L2c
            goto Ld
        L2c:
            me r9 = r9.t
            java.lang.Object r1 = r0.h
            monitor-enter(r1)
            boolean r5 = r0.v(r9)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L4f
            java.lang.Object r9 = r0.j     // Catch: java.lang.Throwable -> L4d
            ep1 r9 = (defpackage.ep1) r9     // Catch: java.lang.Throwable -> L4d
            r9.b = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r0.i     // Catch: java.lang.Throwable -> L4d
            android.os.Handler r2 = (android.os.Handler) r2     // Catch: java.lang.Throwable -> L4d
            r2.removeCallbacksAndMessages(r9)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r9 = r0.j     // Catch: java.lang.Throwable -> L4d
            ep1 r9 = (defpackage.ep1) r9     // Catch: java.lang.Throwable -> L4d
            r0.B(r9)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            return
        L4d:
            r9 = move-exception
            goto L84
        L4f:
            java.lang.Object r5 = r0.k     // Catch: java.lang.Throwable -> L4d
            ep1 r5 = (defpackage.ep1) r5     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L5e
            java.lang.ref.WeakReference r5 = r5.f244a     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L4d
            if (r5 != r9) goto L5e
            r3 = 1
        L5e:
            if (r3 == 0) goto L67
            java.lang.Object r9 = r0.k     // Catch: java.lang.Throwable -> L4d
            ep1 r9 = (defpackage.ep1) r9     // Catch: java.lang.Throwable -> L4d
            r9.b = r2     // Catch: java.lang.Throwable -> L4d
            goto L6e
        L67:
            ep1 r3 = new ep1     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r2, r9)     // Catch: java.lang.Throwable -> L4d
            r0.k = r3     // Catch: java.lang.Throwable -> L4d
        L6e:
            java.lang.Object r9 = r0.j     // Catch: java.lang.Throwable -> L4d
            ep1 r9 = (defpackage.ep1) r9     // Catch: java.lang.Throwable -> L4d
            if (r9 == 0) goto L7c
            boolean r9 = r0.f(r9, r4)     // Catch: java.lang.Throwable -> L4d
            if (r9 == 0) goto L7c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            return
        L7c:
            r9 = 0
            r0.j = r9     // Catch: java.lang.Throwable -> L4d
            r0.C()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            return
        L84:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp1.h():void");
    }
}
