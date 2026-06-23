package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ov0 extends e5 {
    public static final int[] E = {R.attr.state_indeterminate};
    public static final int[] F = {R.attr.state_error};
    public static final int[][] G = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int H = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CharSequence A;
    public CompoundButton.OnCheckedChangeListener B;
    public final i4 C;
    public final wd D;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public ColorStateList m;
    public boolean n;
    public boolean o;
    public boolean p;
    public CharSequence q;
    public Drawable r;
    public Drawable s;
    public boolean t;
    public ColorStateList u;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public int x;
    public int[] y;
    public boolean z;

    public ov0(Context context, AttributeSet attributeSet) {
        super(ym0.D(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        Context context2 = getContext();
        i4 i4Var = new i4(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = ig1.f428a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(i4Var.l);
        new g4(drawable.getConstantState());
        i4Var.g = drawable;
        this.C = i4Var;
        this.D = new wd(this, 2);
        Context context3 = getContext();
        this.r = getButtonDrawable();
        this.u = getSuperButtonTintList();
        setSupportButtonTintList(null);
        fh K = d10.K(context3, attributeSet, yb1.C, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) K.i;
        this.s = K.w(2);
        if (this.r != null && md2.s(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == H && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.r = k32.x(context3, R.drawable.mtrl_checkbox_button);
                this.t = true;
                if (this.s == null) {
                    this.s = k32.x(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.v = tl2.n(context3, K, 3);
        this.w = ju0.f0(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.n = typedArray.getBoolean(11, false);
        this.o = typedArray.getBoolean(6, true);
        this.p = typedArray.getBoolean(9, false);
        this.q = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        if (typedArray.hasValue(10)) {
            setRippleColor(tl2.n(context3, K, 10));
        }
        K.L();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.x;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.m == null) {
            int O = je2.O(getContext(), md2.v(this, R.attr.colorControlActivated));
            int O2 = je2.O(getContext(), md2.v(this, R.attr.colorError));
            int O3 = je2.O(getContext(), md2.v(this, R.attr.colorSurface));
            int O4 = je2.O(getContext(), md2.v(this, R.attr.colorOnSurface));
            this.m = new ColorStateList(G, new int[]{je2.J(O3, 1.0f, O2), je2.J(O3, 1.0f, O), je2.J(O3, 0.54f, O4), je2.J(O3, 0.38f, O4), je2.J(O3, 0.38f, O4)});
        }
        return this.m;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.u;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        r1 r1Var;
        Drawable drawable = this.r;
        ColorStateList colorStateList3 = this.u;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.r = drawable;
        Drawable drawable2 = this.s;
        ColorStateList colorStateList4 = this.v;
        PorterDuff.Mode mode = this.w;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.s = drawable2;
        if (this.t) {
            i4 i4Var = this.C;
            if (i4Var != null) {
                f4 f4Var = i4Var.h;
                wd wdVar = this.D;
                if (wdVar != null) {
                    Drawable drawable3 = i4Var.g;
                    if (drawable3 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                        if (wdVar.f1127a == null) {
                            wdVar.f1127a = new b4(wdVar);
                        }
                        h4.c(animatedVectorDrawable, wdVar.f1127a);
                    }
                    ArrayList arrayList = i4Var.k;
                    if (arrayList != null) {
                        arrayList.remove(wdVar);
                        if (i4Var.k.size() == 0 && (r1Var = i4Var.j) != null) {
                            f4Var.b.removeListener(r1Var);
                            i4Var.j = null;
                        }
                    }
                }
                if (wdVar != null) {
                    Drawable drawable4 = i4Var.g;
                    if (drawable4 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                        if (wdVar.f1127a == null) {
                            wdVar.f1127a = new b4(wdVar);
                        }
                        h4.b(animatedVectorDrawable2, wdVar.f1127a);
                    } else {
                        if (i4Var.k == null) {
                            i4Var.k = new ArrayList();
                        }
                        if (!i4Var.k.contains(wdVar)) {
                            i4Var.k.add(wdVar);
                            if (i4Var.j == null) {
                                i4Var.j = new r1(1, i4Var);
                            }
                            f4Var.b.addListener(i4Var.j);
                        }
                    }
                }
            }
            Drawable drawable5 = this.r;
            if ((drawable5 instanceof AnimatedStateListDrawable) && i4Var != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, i4Var, false);
                ((AnimatedStateListDrawable) this.r).addTransition(R.id.indeterminate, R.id.unchecked, i4Var, false);
            }
        }
        Drawable drawable6 = this.r;
        if (drawable6 != null && (colorStateList2 = this.u) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.s;
        if (drawable7 != null && (colorStateList = this.v) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.r;
        Drawable drawable9 = this.s;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.r;
    }

    public Drawable getButtonIconDrawable() {
        return this.s;
    }

    public ColorStateList getButtonIconTintList() {
        return this.v;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.w;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.u;
    }

    public int getCheckedState() {
        return this.x;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.q;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.x == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n && this.u == null && this.v == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        if (this.p) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.y = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.o || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.p) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.q));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nv0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nv0 nv0Var = (nv0) parcelable;
        super.onRestoreInstanceState(nv0Var.getSuperState());
        setCheckedState(nv0Var.g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        nv0 nv0Var = new nv0(super.onSaveInstanceState());
        nv0Var.g = getCheckedState();
        return nv0Var;
    }

    @Override // defpackage.e5, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(k32.x(getContext(), i));
    }

    @Override // defpackage.e5, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.r = drawable;
        this.t = false;
        a();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.s = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(k32.x(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.v == colorStateList) {
            return;
        }
        this.v = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.w == mode) {
            return;
        }
        this.w = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.u == colorStateList) {
            return;
        }
        this.u = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.x != i) {
            this.x = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.A == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.z) {
                return;
            }
            this.z = true;
            LinkedHashSet linkedHashSet = this.l;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw d51.l(it);
                }
            }
            if (this.x != 2 && (onCheckedChangeListener = this.B) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.z = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.q = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        refreshDrawableState();
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.B = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.A = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.n = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
