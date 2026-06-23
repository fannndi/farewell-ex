package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class e5 extends CheckBox implements gz1 {
    public final g5 g;
    public final w2 h;
    public final g7 i;
    public h6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ez1.a(context);
        by1.a(this, getContext());
        g5 g5Var = new g5(this);
        this.g = g5Var;
        g5Var.c(attributeSet, i);
        w2 w2Var = new w2(this);
        this.h = w2Var;
        w2Var.k(attributeSet, i);
        g7 g7Var = new g7(this);
        this.i = g7Var;
        g7Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private h6 getEmojiTextViewHelper() {
        if (this.j == null) {
            this.j = new h6(this);
        }
        return this.j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.a();
        }
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        w2 w2Var = this.h;
        if (w2Var != null) {
            return w2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w2 w2Var = this.h;
        if (w2Var != null) {
            return w2Var.i();
        }
        return null;
    }

    @Override // defpackage.gz1
    public ColorStateList getSupportButtonTintList() {
        g5 g5Var = this.g;
        if (g5Var != null) {
            return g5Var.f319a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g5 g5Var = this.g;
        if (g5Var != null) {
            return g5Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.i.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(k32.x(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g5 g5Var = this.g;
        if (g5Var != null) {
            if (g5Var.e) {
                g5Var.e = false;
            } else {
                g5Var.e = true;
                g5Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.i;
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
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.t(mode);
        }
    }

    @Override // defpackage.gz1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g5 g5Var = this.g;
        if (g5Var != null) {
            g5Var.f319a = colorStateList;
            g5Var.c = true;
            g5Var.a();
        }
    }

    @Override // defpackage.gz1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g5 g5Var = this.g;
        if (g5Var != null) {
            g5Var.b = mode;
            g5Var.d = true;
            g5Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        g7 g7Var = this.i;
        g7Var.l(colorStateList);
        g7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        g7 g7Var = this.i;
        g7Var.m(mode);
        g7Var.b();
    }
}
