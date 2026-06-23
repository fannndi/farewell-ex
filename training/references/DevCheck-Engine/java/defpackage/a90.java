package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import flar2.devcheck.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a90 extends LinearLayout {
    public AccessibilityManager.TouchExplorationStateChangeListener A;
    public final y80 B;
    public final TextInputLayout g;
    public final FrameLayout h;
    public final CheckableImageButton i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public View.OnLongClickListener l;
    public final CheckableImageButton m;
    public final fn n;
    public int o;
    public final LinkedHashSet p;
    public ColorStateList q;
    public PorterDuff.Mode r;
    public int s;
    public ImageView.ScaleType t;
    public View.OnLongClickListener u;
    public CharSequence v;
    public final AppCompatTextView w;
    public boolean x;
    public EditText y;
    public final AccessibilityManager z;

    public a90(TextInputLayout textInputLayout, fh fhVar) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.o = 0;
        this.p = new LinkedHashSet();
        this.B = new y80(this);
        z80 z80Var = new z80(this);
        this.z = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.g = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.i = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.m = a3;
        this.n = new fn(this, fhVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.w = appCompatTextView;
        TypedArray typedArray = (TypedArray) fhVar.i;
        if (typedArray.hasValue(38)) {
            this.j = tl2.n(getContext(), fhVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.k = ju0.f0(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(fhVar.w(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setCheckable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.q = tl2.n(getContext(), fhVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.r = ju0.f0(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.q = tl2.n(getContext(), fhVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.r = ju0.f0(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            c.m("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.s) {
            this.s = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType n = kk1.n(typedArray.getInt(31, -1));
            this.t = n;
            a3.setScaleType(n);
            a2.setScaleType(n);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(fhVar.v(74));
        }
        CharSequence text = typedArray.getText(72);
        this.v = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        o();
        frameLayout.addView(a3);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a2);
        a2.setOnFocusableChangedListener(new up(this) { // from class: x80
            public final /* synthetic */ a90 h;

            {
                this.h = this;
            }

            @Override // defpackage.up
            public final void h() {
                int i3 = i;
                a90 a90Var = this.h;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = a90Var.i;
                        kk1.U(checkableImageButton, a90Var.l, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = a90Var.m;
                        kk1.U(checkableImageButton2, a90Var.u, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a3.setOnFocusableChangedListener(new up(this) { // from class: x80
            public final /* synthetic */ a90 h;

            {
                this.h = this;
            }

            @Override // defpackage.up
            public final void h() {
                int i3 = i2;
                a90 a90Var = this.h;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = a90Var.i;
                        kk1.U(checkableImageButton, a90Var.l, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = a90Var.m;
                        kk1.U(checkableImageButton2, a90Var.u, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.l0.add(z80Var);
        if (textInputLayout.k != null) {
            z80Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new lo(i2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (tl2.y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final b90 b() {
        b90 fzVar;
        int i = this.o;
        fn fnVar = this.n;
        SparseArray sparseArray = (SparseArray) fnVar.c;
        b90 b90Var = (b90) sparseArray.get(i);
        if (b90Var != null) {
            return b90Var;
        }
        a90 a90Var = (a90) fnVar.d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                fzVar = new fz(a90Var, i2);
            } else if (i == 1) {
                fzVar = new c61(a90Var, fnVar.b);
            } else if (i == 2) {
                fzVar = new dr(a90Var);
            } else {
                if (i != 3) {
                    c.m(d51.q("Invalid end icon mode: ", i));
                    return null;
                }
                fzVar = new s60(a90Var);
            }
        } else {
            fzVar = new fz(a90Var, 0);
        }
        sparseArray.append(i, fzVar);
        return fzVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.m;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.w.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.h.getVisibility() == 0 && this.m.getVisibility() == 0;
    }

    public final boolean e() {
        return this.i.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        b90 b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.m;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.j) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof s60) || (isActivated = checkableImageButton.isActivated()) == ((s60) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            kk1.H(this.g, checkableImageButton, this.q);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.m;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            kk1.U(checkableImageButton, this.u, charSequence);
        }
    }

    public final void h(int i) {
        if (this.o == i) {
            return;
        }
        b90 b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.A;
        AccessibilityManager accessibilityManager = this.z;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.A = null;
        b.r();
        this.o = i;
        Iterator it = this.p.iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
        i(i != 0);
        b90 b2 = b();
        int i2 = this.n.f297a;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable x = i2 != 0 ? k32.x(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.m;
        checkableImageButton.setImageDrawable(x);
        TextInputLayout textInputLayout = this.g;
        if (x != null) {
            kk1.c(textInputLayout, checkableImageButton, this.q, this.r);
            kk1.H(textInputLayout, checkableImageButton, this.q);
        }
        checkableImageButton.setCheckable(b2.j());
        if (!b2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b2.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
        this.A = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.A);
        }
        View.OnClickListener f = b2.f();
        View.OnLongClickListener onLongClickListener = this.u;
        checkableImageButton.setOnClickListener(f);
        kk1.N(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.y;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        kk1.c(textInputLayout, checkableImageButton, this.q, this.r);
        f(true);
    }

    public final void i(boolean z) {
        EditText editText;
        if (d() != z) {
            CheckableImageButton checkableImageButton = this.m;
            if (!z && checkableImageButton.hasFocus() && (editText = this.y) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            l();
            n();
            this.g.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        m();
        kk1.c(this.g, checkableImageButton, this.j, this.k);
    }

    public final void k(b90 b90Var) {
        if (this.y == null) {
            return;
        }
        if (b90Var.e() != null) {
            this.y.setOnFocusChangeListener(b90Var.e());
        }
        if (b90Var.g() != null) {
            this.m.setOnFocusChangeListener(b90Var.g());
        }
    }

    public final void l() {
        this.h.setVisibility((this.m.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.v == null || this.x) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.i;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.g;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.q.q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.o != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.g;
        if (textInputLayout.k == null) {
            return;
        }
        this.w.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.k.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.k.getPaddingEnd(), textInputLayout.k.getPaddingBottom());
    }

    public final void o() {
        AppCompatTextView appCompatTextView = this.w;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.v == null || this.x) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        appCompatTextView.setVisibility(i);
        this.g.s();
    }
}
