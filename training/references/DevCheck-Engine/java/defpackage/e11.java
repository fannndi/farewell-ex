package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class e11 extends FrameLayout {
    public final u01 g;
    public final fl h;
    public final z01 i;
    public at1 j;
    public c11 k;
    public b11 l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public e11(Context context, AttributeSet attributeSet) {
        super(ym0.D(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        ?? r10;
        z01 z01Var = new z01();
        z01Var.h = false;
        this.i = z01Var;
        Context context2 = getContext();
        fh K = d10.K(context2, attributeSet, yb1.L, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        u01 u01Var = new u01(context2, getClass(), getMaxItemCount());
        this.g = u01Var;
        fl flVar = new fl(context2);
        this.h = flVar;
        flVar.setMinimumHeight(getSuggestedMinimumHeight());
        flVar.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        z01Var.g = flVar;
        z01Var.i = 1;
        flVar.setPresenter(z01Var);
        u01Var.b(z01Var, u01Var.f39a);
        z01Var.e(getContext(), u01Var);
        TypedArray typedArray = (TypedArray) K.i;
        if (typedArray.hasValue(11)) {
            flVar.setIconTintList(K.v(11));
        } else {
            flVar.setIconTintList(flVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(K.v(18));
        }
        Drawable background = getBackground();
        ColorStateList D = ju0.D(background);
        if (background == null || D != null) {
            vv0 vv0Var = new vv0(cn1.h(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (D != null) {
                vv0Var.t(D);
            }
            vv0Var.p(context2);
            setBackground(vv0Var);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(tl2.n(context2, K, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            flVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(tl2.n(context2, K, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, yb1.K);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes.getString(9);
            int i = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    i = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    i = obtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(i);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize2);
            int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize2);
            int i2 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = flVar.e0;
            rect.left = i2;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            w01[] w01VarArr = flVar.m;
            if (w01VarArr != null) {
                for (w01 w01Var : w01VarArr) {
                    if (w01Var instanceof t01) {
                        ((t01) w01Var).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(tl2.o(context2, obtainStyledAttributes, 2));
            r10 = 0;
            setItemActiveIndicatorShapeAppearance(cn1.g(context2, obtainStyledAttributes.getResourceId(11, 0), 0).a());
            obtainStyledAttributes.recycle();
        } else {
            r10 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r10);
            z01 z01Var2 = this.i;
            z01Var2.h = true;
            getMenuInflater().inflate(resourceId3, this.g);
            z01Var2.h = r10;
            z01Var2.j(true);
        }
        K.L();
        addView(this.h);
        this.g.e = new h70((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.j == null) {
            this.j = new at1(getContext());
        }
        return this.j;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.h.setMeasurePaddingFromLabelBaseline(z);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.h.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.h.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.h.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.h.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.h.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.h.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.h.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.h.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.h.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.h.getItemActiveIndicatorMarginHorizontal();
    }

    public cn1 getItemActiveIndicatorShapeAppearance() {
        return this.h.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.h.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.h.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.h.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.h.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.h.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.h.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.h.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.h.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.h.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.h.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.h.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.h.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.h.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.h.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.g;
    }

    public hx0 getMenuView() {
        return this.h;
    }

    public ViewGroup getMenuViewGroup() {
        return this.h;
    }

    public z01 getPresenter() {
        return this.i;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.h.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.h.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rt0.I(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof d11)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d11 d11Var = (d11) parcelable;
        super.onRestoreInstanceState(d11Var.g);
        Bundle bundle = d11Var.i;
        CopyOnWriteArrayList copyOnWriteArrayList = this.g.v;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            fx0 fx0Var = (fx0) weakReference.get();
            if (fx0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = fx0Var.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    fx0Var.f(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable m;
        d11 d11Var = new d11(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        d11Var.i = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.g.v;
        if (copyOnWriteArrayList.isEmpty()) {
            return d11Var;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            fx0 fx0Var = (fx0) weakReference.get();
            if (fx0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = fx0Var.getId();
                if (id > 0 && (m = fx0Var.m()) != null) {
                    sparseArray.put(id, m);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return d11Var;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.h.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        rt0.C(this, f);
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.h.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.h.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.h.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.h.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.h.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.h.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.h.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.h.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.h.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.h.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(cn1 cn1Var) {
        this.h.setItemActiveIndicatorShapeAppearance(cn1Var);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.h.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.h.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.h.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        fl flVar = this.h;
        if (flVar.getItemGravity() != i) {
            flVar.setItemGravity(i);
            this.i.j(false);
        }
    }

    public void setItemIconGravity(int i) {
        fl flVar = this.h;
        if (flVar.getItemIconGravity() != i) {
            flVar.setItemIconGravity(i);
            this.i.j(false);
        }
    }

    public void setItemIconSize(int i) {
        this.h.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.h.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.h.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.h.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.h.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.h.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.h.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.h.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.h.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.h.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.h.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        fl flVar = this.h;
        if (flVar.getLabelVisibilityMode() != i) {
            flVar.setLabelVisibilityMode(i);
            this.i.j(false);
        }
    }

    public void setOnItemReselectedListener(b11 b11Var) {
        this.l = b11Var;
    }

    public void setOnItemSelectedListener(c11 c11Var) {
        this.k = c11Var;
    }

    public void setSelectedItemId(int i) {
        u01 u01Var = this.g;
        MenuItem findItem = u01Var.findItem(i);
        if (findItem != null) {
            boolean q = u01Var.q(findItem, this.i, 0);
            if (findItem.isCheckable()) {
                if (!q || findItem.isChecked()) {
                    this.h.setCheckedItem(findItem);
                }
            }
        }
    }
}
