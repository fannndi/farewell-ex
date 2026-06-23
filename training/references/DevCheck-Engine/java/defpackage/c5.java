package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class c5 extends Button {
    public final w2 g;
    public final g7 h;
    public h6 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ez1.a(context);
        by1.a(this, getContext());
        w2 w2Var = new w2(this);
        this.g = w2Var;
        w2Var.k(attributeSet, i);
        g7 g7Var = new g7(this);
        this.h = g7Var;
        g7Var.f(attributeSet, i);
        g7Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private h6 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new h6(this);
        }
        return this.i;
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
    public int getAutoSizeMaxTextSize() {
        if (r82.c) {
            return super.getAutoSizeMaxTextSize();
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            return Math.round(g7Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r82.c) {
            return super.getAutoSizeMinTextSize();
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            return Math.round(g7Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r82.c) {
            return super.getAutoSizeStepGranularity();
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            return Math.round(g7Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r82.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        g7 g7Var = this.h;
        return g7Var != null ? g7Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (r82.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            return g7Var.i.f718a;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g7 g7Var = this.h;
        if (g7Var == null || r82.c) {
            return;
        }
        g7Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        g7 g7Var = this.h;
        if (g7Var != null) {
            o7 o7Var = g7Var.i;
            if (r82.c || !o7Var.e()) {
                return;
            }
            o7Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (r82.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (r82.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (r82.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.k(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(rt0.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.f321a.setAllCaps(z);
        }
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = r82.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            o7 o7Var = g7Var.i;
            if (z || o7Var.e()) {
                return;
            }
            o7Var.f(i, f);
        }
    }
}
