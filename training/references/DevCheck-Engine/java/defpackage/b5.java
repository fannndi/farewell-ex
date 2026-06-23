package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class b5 extends AutoCompleteTextView {
    public static final int[] j = {R.attr.popupBackground};
    public final w2 g;
    public final g7 h;
    public final zf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, flar2.devcheck.R.attr.autoCompleteTextViewStyle);
        ez1.a(context);
        by1.a(this, getContext());
        fh G = fh.G(flar2.devcheck.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, j);
        if (((TypedArray) G.i).hasValue(0)) {
            setDropDownBackgroundDrawable(G.w(0));
        }
        G.L();
        w2 w2Var = new w2(this);
        this.g = w2Var;
        w2Var.k(attributeSet, flar2.devcheck.R.attr.autoCompleteTextViewStyle);
        g7 g7Var = new g7(this);
        this.h = g7Var;
        g7Var.f(attributeSet, flar2.devcheck.R.attr.autoCompleteTextViewStyle);
        g7Var.b();
        zf zfVar = new zf(this);
        this.i = zfVar;
        zfVar.D(attributeSet, flar2.devcheck.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener A = zfVar.A(keyListener);
        if (A == keyListener) {
            return;
        }
        super.setKeyListener(A);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return rt0.L(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        op0.G(editorInfo, onCreateInputConnection, this);
        return this.i.F(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(rt0.N(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(k32.x(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.i.O(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.i.A(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.g(context, i);
        }
    }
}
