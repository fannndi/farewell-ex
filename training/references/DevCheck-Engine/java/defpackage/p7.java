package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public final class p7 extends ToggleButton {
    public final w2 g;
    public final g7 h;
    public h6 i;

    public p7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        by1.a(this, getContext());
        w2 w2Var = new w2(this);
        this.g = w2Var;
        w2Var.k(attributeSet, R.attr.buttonStyleToggle);
        g7 g7Var = new g7(this);
        this.h = g7Var;
        g7Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private h6 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new h6(this);
        }
        return this.i;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.a();
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        w2 w2Var = this.g;
        if (w2Var != null) {
            return w2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w2 w2Var = this.g;
        if (w2Var != null) {
            return w2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        g7 g7Var = this.h;
        g7Var.l(colorStateList);
        g7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        g7 g7Var = this.h;
        g7Var.m(mode);
        g7Var.b();
    }
}
