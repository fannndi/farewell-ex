package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class s60 extends b90 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final tc i;
    public final ar j;
    public final q60 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [q60] */
    public s60(a90 a90Var) {
        super(a90Var);
        this.i = new tc(7, this);
        this.j = new ar(1, this);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: q60
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                s60 s60Var = s60.this;
                AutoCompleteTextView autoCompleteTextView = s60Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                s60Var.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = kk1.J(a90Var.getContext(), R.attr.motionDurationShort3, 67);
        this.e = kk1.J(a90Var.getContext(), R.attr.motionDurationShort3, 50);
        this.g = kk1.K(a90Var.getContext(), R.attr.motionEasingLinearInterpolator, o4.f715a);
    }

    @Override // defpackage.b90
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && je2.I(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new r60(0, this));
    }

    @Override // defpackage.b90
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.b90
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.b90
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.b90
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.b90
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.b90
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.b90
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.b90
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            c.o("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: o60
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    s60 s60Var = s60.this;
                    long j = uptimeMillis - s60Var.o;
                    if (j < 0 || j > 300) {
                        s60Var.m = false;
                    }
                    s60Var.t();
                    s60Var.m = true;
                    s60Var.o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: p60
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                s60 s60Var = s60.this;
                s60Var.m = true;
                s60Var.o = SystemClock.uptimeMillis();
                s60Var.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f71a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.b90
    public final void m(c1 c1Var) {
        if (!je2.I(this.h)) {
            c1Var.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? c1Var.f104a.isShowingHintText() : c1Var.e(4)) {
            c1Var.k(null);
        }
    }

    @Override // defpackage.b90
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || je2.I(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.b90
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 3;
        ofFloat.addUpdateListener(new zd(i, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new zd(i, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new r1(4, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.b90
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
