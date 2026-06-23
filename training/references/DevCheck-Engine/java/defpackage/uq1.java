package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class uq1 extends LinearLayout {
    public final TextInputLayout g;
    public final AppCompatTextView h;
    public CharSequence i;
    public final CheckableImageButton j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public boolean p;

    public uq1(TextInputLayout textInputLayout, fh fhVar) {
        super(textInputLayout.getContext());
        this.g = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.j = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.h = appCompatTextView;
        if (tl2.y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(null);
        kk1.N(checkableImageButton, onLongClickListener);
        this.o = null;
        checkableImageButton.setOnLongClickListener(null);
        kk1.N(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) fhVar.i;
        if (typedArray.hasValue(70)) {
            this.k = tl2.n(getContext(), fhVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.l = ju0.f0(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            c(fhVar.w(67));
            if (typedArray.hasValue(66)) {
                b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            c.m("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType n = kk1.n(typedArray.getInt(69, -1));
            this.n = n;
            checkableImageButton.setScaleType(n);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(fhVar.v(62));
        }
        CharSequence text = typedArray.getText(60);
        this.i = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        f();
        addView(checkableImageButton);
        addView(appCompatTextView);
        checkableImageButton.setOnFocusableChangedListener(new c71(4, this));
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.j;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.h.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            kk1.U(checkableImageButton, this.o, charSequence);
        }
    }

    public final void c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.k;
            PorterDuff.Mode mode = this.l;
            TextInputLayout textInputLayout = this.g;
            kk1.c(textInputLayout, checkableImageButton, colorStateList, mode);
            d(true);
            kk1.H(textInputLayout, checkableImageButton, this.k);
            return;
        }
        d(false);
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(null);
        kk1.N(checkableImageButton, onLongClickListener);
        this.o = null;
        checkableImageButton.setOnLongClickListener(null);
        kk1.N(checkableImageButton, null);
        b(null);
    }

    public final void d(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.j;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.g.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            e();
            f();
        }
    }

    public final void e() {
        EditText editText = this.g.k;
        if (editText == null) {
            return;
        }
        this.h.setPaddingRelative(this.j.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void f() {
        int i = (this.i == null || this.p) ? 8 : 0;
        setVisibility((this.j.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.h.setVisibility(i);
        this.g.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        e();
    }
}
