package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class bv1 extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public ValueAnimator g;
    public final /* synthetic */ TabLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv1(TabLayout tabLayout, Context context) {
        super(context);
        this.h = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i2) {
        TabLayout tabLayout = this.h;
        if (tabLayout.d0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i2);
            j70 j70Var = tabLayout.O;
            Drawable drawable = tabLayout.u;
            j70Var.getClass();
            RectF g = j70.g(tabLayout, childAt);
            drawable.setBounds((int) g.left, drawable.getBounds().top, (int) g.right, drawable.getBounds().bottom);
            tabLayout.g = i2;
        }
    }

    public final void b(int i2) {
        TabLayout tabLayout = this.h;
        Rect bounds = tabLayout.u.getBounds();
        tabLayout.u.setBounds(bounds.left, 0, bounds.right, i2);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        TabLayout tabLayout = this.h;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.u;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.u.getBounds().bottom);
        } else {
            tabLayout.O.l(tabLayout, view, view2, f, tabLayout.u);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i2, int i3, boolean z) {
        TabLayout tabLayout = this.h;
        if (tabLayout.g == i2) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i2);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.g = i2;
        av1 av1Var = new av1(this, childAt, childAt2);
        if (!z) {
            this.g.removeAllUpdateListeners();
            this.g.addUpdateListener(av1Var);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.g = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.P);
        valueAnimator.setDuration(i3);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(av1Var);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.h;
        int height2 = tabLayout.u.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.u.getIntrinsicHeight();
        }
        int i2 = tabLayout.H;
        if (i2 == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i2 != 1) {
            height = 0;
            if (i2 != 2) {
                height2 = i2 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.u.getBounds().width() > 0) {
            Rect bounds = tabLayout.u.getBounds();
            tabLayout.u.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.u.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        ValueAnimator valueAnimator = this.g;
        TabLayout tabLayout = this.h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.g == -1) {
            tabLayout.g = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.h;
        boolean z = true;
        if (tabLayout.F == 1 || tabLayout.I == 2) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    i4 = Math.max(i4, childAt.getMeasuredWidth());
                }
            }
            if (i4 <= 0) {
                return;
            }
            if (i4 * childCount <= getMeasuredWidth() - (((int) ju0.r(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i6 = 0; i6 < childCount; i6++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                    if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i4;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.F = 0;
                tabLayout.p(false);
            }
            if (z) {
                super.onMeasure(i2, i3);
            }
        }
    }
}
