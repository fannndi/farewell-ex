package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;
import flar2.devcheck.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class fv1 extends LinearLayout {
    public static final /* synthetic */ int r = 0;
    public cv1 g;
    public TextView h;
    public ImageView i;
    public View j;
    public dc k;
    public View l;
    public TextView m;
    public ImageView n;
    public Drawable o;
    public int p;
    public final /* synthetic */ TabLayout q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv1(TabLayout tabLayout, Context context) {
        super(context);
        this.q = tabLayout;
        this.p = 2;
        e(context);
        setPaddingRelative(tabLayout.k, tabLayout.l, tabLayout.m, tabLayout.n);
        setGravity(17);
        setOrientation(!tabLayout.J ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        WeakHashMap weakHashMap = y62.f1215a;
        r62.a(this, systemIcon);
    }

    private dc getBadge() {
        return this.k;
    }

    private dc getOrCreateBadge() {
        if (this.k == null) {
            this.k = new dc(getContext(), null);
        }
        b();
        dc dcVar = this.k;
        if (dcVar != null) {
            return dcVar;
        }
        c.n("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.k != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.j;
            if (view != null) {
                dc dcVar = this.k;
                if (dcVar != null) {
                    if (dcVar.e() != null) {
                        dcVar.e().setForeground(null);
                    } else {
                        view.getOverlay().remove(dcVar);
                    }
                }
                this.j = null;
            }
        }
    }

    public final void b() {
        if (this.k != null) {
            if (this.l != null) {
                a();
                return;
            }
            TextView textView = this.h;
            if (textView == null || this.g == null) {
                a();
                return;
            }
            if (this.j == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.h;
            if (this.k == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            dc dcVar = this.k;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            dcVar.setBounds(rect);
            dcVar.j(textView2, null);
            if (dcVar.e() != null) {
                dcVar.e().setForeground(dcVar);
            } else {
                textView2.getOverlay().add(dcVar);
            }
            this.j = textView2;
        }
    }

    public final void c(View view) {
        dc dcVar = this.k;
        if (dcVar == null || view != this.j) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        dcVar.setBounds(rect);
        dcVar.j(view, null);
    }

    public final void d() {
        boolean z;
        f();
        cv1 cv1Var = this.g;
        if (cv1Var != null) {
            TabLayout tabLayout = cv1Var.d;
            if (tabLayout == null) {
                c.m("Tab not attached to a TabLayout");
                return;
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == cv1Var.b) {
                z = true;
                setSelected(z);
            }
        }
        z = false;
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o;
        if ((drawable == null || !drawable.isStateful()) ? false : this.o.setState(drawableState)) {
            invalidate();
            this.q.invalidate();
        }
    }

    public final void e(Context context) {
        TabLayout tabLayout = this.q;
        int i = tabLayout.z;
        if (i != 0) {
            Drawable x = k32.x(context, i);
            this.o = x;
            if (x != null && x.isStateful()) {
                this.o.setState(getDrawableState());
            }
        } else {
            this.o = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable drawable = gradientDrawable;
        if (tabLayout.t != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList f = rt0.f(tabLayout.t);
            if (tabLayout.N) {
                RippleDrawable rippleDrawable = new RippleDrawable(f, null, null);
                ColorDrawable colorDrawable = FocusRingDrawable.v;
                drawable = rippleDrawable;
                if (md2.s(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                    drawable = new FocusRingDrawable(context, rippleDrawable);
                }
            } else {
                RippleDrawable rippleDrawable2 = new RippleDrawable(f, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.f(context, rippleDrawable2, null);
                drawable = rippleDrawable2;
            }
        }
        setBackground(drawable);
        tabLayout.invalidate();
    }

    public final void f() {
        int i;
        ViewParent parent;
        cv1 cv1Var = this.g;
        View view = cv1Var != null ? cv1Var.c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.l;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.l);
                }
                addView(view);
            }
            this.l = view;
            TextView textView = this.h;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.i;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.i.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.m = textView2;
            if (textView2 != null) {
                this.p = textView2.getMaxLines();
            }
            this.n = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.l;
            if (view3 != null) {
                removeView(view3);
                this.l = null;
            }
            this.m = null;
            this.n = null;
        }
        if (this.l == null) {
            if (this.i == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.i = imageView2;
                addView(imageView2, 0);
            }
            if (this.h == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.h = textView3;
                addView(textView3);
                this.p = this.h.getMaxLines();
            }
            TextView textView4 = this.h;
            TabLayout tabLayout = this.q;
            textView4.setTextAppearance(tabLayout.o);
            if (!isSelected() || (i = tabLayout.q) == -1) {
                this.h.setTextAppearance(tabLayout.p);
            } else {
                this.h.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.r;
            if (colorStateList != null) {
                this.h.setTextColor(colorStateList);
            }
            g(this.h, this.i, true);
            b();
            ImageView imageView3 = this.i;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ev1(this, imageView3));
            }
            TextView textView5 = this.h;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ev1(this, textView5));
            }
        } else {
            TextView textView6 = this.m;
            if (textView6 != null || this.n != null) {
                g(textView6, this.n, false);
            }
        }
        if (cv1Var == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void g(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        cv1 cv1Var = this.g;
        CharSequence charSequence = cv1Var != null ? cv1Var.f156a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                z2 = false;
            } else {
                this.g.getClass();
                z2 = true;
            }
            textView.setText(!isEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int r2 = (z2 && imageView.getVisibility() == 0) ? (int) ju0.r(getContext(), 8) : 0;
            if (this.q.J) {
                if (r2 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(r2);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (r2 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = r2;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        ym0.z(this, isEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.h, this.i, this.l};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.h, this.i, this.l};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return i - i2;
    }

    public cv1 getTab() {
        return this.g;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dc dcVar = this.k;
        if (dcVar != null && dcVar.isVisible()) {
            accessibilityNodeInfo.setContentDescription(this.k.d());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b1.b(isSelected(), 0, 1, this.g.b, 1).g);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) v0.e.f1061a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.q;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.A, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.h != null) {
            float f = tabLayout.w;
            if (isSelected() && tabLayout.q != -1) {
                f = tabLayout.x;
            }
            int i3 = this.p;
            ImageView imageView = this.i;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.h;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.y;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.h.getTextSize();
            int lineCount = this.h.getLineCount();
            int maxLines = this.h.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.I == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.h.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.h.setTextSize(0, f);
                this.h.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.g == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        cv1 cv1Var = this.g;
        TabLayout tabLayout = cv1Var.d;
        if (tabLayout != null) {
            tabLayout.l(cv1Var, true);
            return true;
        }
        c.m("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.h;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.l;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(cv1 cv1Var) {
        if (cv1Var != this.g) {
            this.g = cv1Var;
            d();
        }
    }
}
