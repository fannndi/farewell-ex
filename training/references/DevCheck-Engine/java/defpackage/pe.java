package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import flar2.devcheck.R;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class pe {

    /* renamed from: a, reason: collision with root package name */
    public final int f786a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final oe i;
    public final SnackbarContentLayout j;
    public int k;
    public final je l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final AccessibilityManager s;
    public final me t = new me(this);
    public static final za0 u = o4.b;
    public static final LinearInterpolator v = o4.f715a;
    public static final za0 w = o4.d;
    public static final int[] y = {R.attr.snackbarStyle};
    public static final Handler x = new Handler(Looper.getMainLooper(), new ie());

    public pe(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.l = new je(this, i);
        if (view == null) {
            c.m("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            c.m("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        d10.e(context, d10.d, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        oe oeVar = (oe) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = oeVar;
        oeVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = oeVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.h.setTextColor(je2.J(je2.O(snackbarContentLayout2.getContext(), md2.v(snackbarContentLayout2, R.attr.colorSurface)), actionTextColorAlpha, snackbarContentLayout2.h.getCurrentTextColor()));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(oeVar.getMaxInlineActionWidth());
        }
        oeVar.addView(view);
        oeVar.setAccessibilityLiveRegion(1);
        oeVar.setImportantForAccessibility(1);
        oeVar.setFitsSystemWindows(true);
        ke keVar = new ke(this);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(oeVar, keVar);
        y62.o(oeVar, new le(i, this));
        this.s = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = kk1.J(context, R.attr.motionDurationLong2, 250);
        this.f786a = kk1.J(context, R.attr.motionDurationLong2, 150);
        this.b = kk1.J(context, R.attr.motionDurationMedium1, 75);
        this.d = kk1.K(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.f = kk1.K(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.e = kk1.K(context, R.attr.motionEasingEmphasizedInterpolator, u);
    }

    public final void a(int i) {
        gr s = gr.s();
        me meVar = this.t;
        synchronized (s.h) {
            try {
                if (s.v(meVar)) {
                    s.f((ep1) s.j, i);
                } else {
                    ep1 ep1Var = (ep1) s.k;
                    if (ep1Var != null && ep1Var.f244a.get() == meVar) {
                        s.f((ep1) s.k, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        gr s = gr.s();
        me meVar = this.t;
        synchronized (s.h) {
            try {
                if (s.v(meVar)) {
                    s.j = null;
                    if (((ep1) s.k) != null) {
                        s.C();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        gr s = gr.s();
        me meVar = this.t;
        synchronized (s.h) {
            try {
                if (s.v(meVar)) {
                    s.B((ep1) s.j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        oe oeVar = this.i;
        if (z) {
            oeVar.post(new je(this, 2));
            return;
        }
        if (oeVar.getParent() != null) {
            oeVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        oe oeVar = this.i;
        ViewGroup.LayoutParams layoutParams = oeVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || oeVar.p == null || oeVar.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = oeVar.p;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            oeVar.requestLayout();
        }
        if ((z || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = oeVar.getLayoutParams();
            if ((layoutParams2 instanceof kx) && (((kx) layoutParams2).f555a instanceof SwipeDismissBehavior)) {
                je jeVar = this.l;
                oeVar.removeCallbacks(jeVar);
                oeVar.post(jeVar);
            }
        }
    }
}
