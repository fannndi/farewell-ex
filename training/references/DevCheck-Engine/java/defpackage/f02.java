package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import flar2.devcheck.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f02 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static f02 q;
    public static f02 r;
    public final View g;
    public final CharSequence h;
    public final int i;
    public final e02 j;
    public final e02 k;
    public int l;
    public int m;
    public h02 n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Type inference failed for: r0v0, types: [e02] */
    /* JADX WARN: Type inference failed for: r0v1, types: [e02] */
    public f02(View view, CharSequence charSequence) {
        final int i = 0;
        this.j = new Runnable(this) { // from class: e02
            public final /* synthetic */ f02 h;

            {
                this.h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                f02 f02Var = this.h;
                switch (i2) {
                    case 0:
                        f02Var.c(false);
                        break;
                    default:
                        f02Var.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.k = new Runnable(this) { // from class: e02
            public final /* synthetic */ f02 h;

            {
                this.h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                f02 f02Var = this.h;
                switch (i22) {
                    case 0:
                        f02Var.c(false);
                        break;
                    default:
                        f02Var.a();
                        break;
                }
            }
        };
        this.g = view;
        this.h = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = z62.f1263a;
        this.i = Build.VERSION.SDK_INT >= 28 ? r4.o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.p = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(f02 f02Var) {
        f02 f02Var2 = q;
        if (f02Var2 != null) {
            f02Var2.g.removeCallbacks(f02Var2.j);
        }
        q = f02Var;
        if (f02Var != null) {
            f02Var.g.postDelayed(f02Var.j, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        f02 f02Var = r;
        View view = this.g;
        if (f02Var == this) {
            r = null;
            h02 h02Var = this.n;
            if (h02Var != null) {
                View view2 = (View) h02Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) h02Var.f358a).getSystemService("window")).removeView(view2);
                }
                this.n = null;
                this.p = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (q == this) {
            b(null);
        }
        view.removeCallbacks(this.k);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.g;
        if (view.isAttachedToWindow()) {
            b(null);
            f02 f02Var = r;
            if (f02Var != null) {
                f02Var.a();
            }
            r = this;
            this.o = z;
            h02 h02Var = new h02(view.getContext());
            View view2 = (View) h02Var.b;
            Context context = (Context) h02Var.f358a;
            this.n = h02Var;
            int i5 = this.l;
            int i6 = this.m;
            boolean z3 = this.o;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) h02Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) h02Var.c).setText(this.h);
            int[] iArr = (int[]) h02Var.g;
            int[] iArr2 = (int[]) h02Var.f;
            Rect rect = (Rect) h02Var.e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i7 = i5;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i8 + i7) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i4];
                int i10 = ((i9 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams.y = i10;
                    } else {
                        layoutParams.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i10;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.o) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = y62.f1215a;
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            e02 e02Var = this.k;
            view.removeCallbacks(e02Var);
            view.postDelayed(e02Var, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.m) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            h02 r4 = r3.n
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.o
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.g
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.p = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            h02 r4 = r3.n
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.p
            if (r1 != 0) goto L66
            int r1 = r3.l
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.i
            if (r1 > r2) goto L66
            int r1 = r3.m
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.l = r4
            r3.m = r5
            r3.p = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f02.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.l = view.getWidth() / 2;
        this.m = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
