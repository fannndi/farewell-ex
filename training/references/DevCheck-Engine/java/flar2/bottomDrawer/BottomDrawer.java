package flar2.devcheck.bottomDrawer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import defpackage.cn1;
import defpackage.p62;
import defpackage.pb1;
import defpackage.tb;
import defpackage.vv0;
import defpackage.y62;
import defpackage.ym0;
import flar2.devcheck.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class BottomDrawer extends FrameLayout {
    public static final /* synthetic */ int t = 0;
    public final int g;
    public final View h;
    public final FrameLayout i;
    public final Rect j;
    public final vv0 k;
    public final int l;
    public final int m;
    public int n;
    public float o;
    public boolean p;
    public int q;
    public int r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        context.getClass();
        this.g = -1;
        this.j = new Rect();
        setWillNotDraw(false);
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pb1.f781a, 0, 0);
            try {
                obtainStyledAttributes.getClass();
                this.m = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.bottom_sheet_extra_padding));
                obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.bottom_sheet_corner_radius));
                int i2 = 5;
                obtainStyledAttributes.getBoolean(5, false);
                obtainStyledAttributes.getBoolean(4, false);
                TypedValue typedValue = new TypedValue();
                if (context.getTheme().resolveAttribute(R.attr.card_background_color, typedValue, true)) {
                    int i3 = typedValue.resourceId;
                    i = i3 != 0 ? context.getColor(i3) : typedValue.data;
                } else {
                    i = 0;
                }
                this.l = obtainStyledAttributes.getColor(0, i);
                this.g = obtainStyledAttributes.getResourceId(3, -1);
                obtainStyledAttributes.recycle();
                if (this.g != -1) {
                    View inflate = LayoutInflater.from(context).inflate(this.g, (ViewGroup) null);
                    inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.h = inflate;
                }
                vv0 vv0Var = new vv0(cn1.h(context, attributeSet, R.attr.bottomSheetStyle, 0).a());
                vv0Var.t(ColorStateList.valueOf(this.l));
                this.k = vv0Var;
                this.n = this.m;
                Object systemService = context.getSystemService("window");
                systemService.getClass();
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                Point point = new Point();
                Point point2 = new Point();
                defaultDisplay.getCurrentSizeRange(point, point2);
                int i4 = point2.y;
                this.q = i4;
                this.r = i4;
                this.s = i4 / 2;
                tb tbVar = new tb(this, i2, context);
                WeakHashMap weakHashMap = y62.f1215a;
                p62.c(this, tbVar);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.i = frameLayout;
                super.addView(frameLayout);
                if (this.g != -1) {
                    View view = this.h;
                    if (view == null) {
                        ym0.A("content");
                        throw null;
                    }
                    addView(view);
                }
                a(0.0f);
            } catch (Throwable th) {
                th = th;
                typedArray = obtainStyledAttributes;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(float f) {
        boolean z = this.p;
        vv0 vv0Var = this.k;
        if (!z) {
            vv0Var.u(1.0f);
            b(this.n, 0.0f);
        } else if (f <= 0.9f) {
            vv0Var.u(1.0f);
            this.i.setTranslationY(0.0f);
        } else {
            float f2 = (f - 0.9f) * 9.999998f;
            b(this.n, f2);
            vv0Var.u(1.0f - f2);
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        this.i.addView(view);
    }

    public final void b(int i, float f) {
        float f2 = i * f;
        this.o = f2;
        FrameLayout frameLayout = this.i;
        frameLayout.setTranslationY(f2);
        int i2 = (int) this.o;
        if (getTop() != 0 || this.o == 0.0f || frameLayout.getPaddingBottom() == i2) {
            return;
        }
        frameLayout.setPadding(0, 0, 0, i2);
    }

    public final void c() {
        int top = this.n - getTop();
        float f = (top < 0 || top > this.n) ? 0.0f : top;
        b((int) f, 1.0f);
        vv0 vv0Var = this.k;
        if (f == 0.0f) {
            vv0Var.u(1.0f);
        } else if (getTop() == 0) {
            vv0Var.u(0.0f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Rect rect = this.j;
        if (rect.isEmpty()) {
            return;
        }
        vv0 vv0Var = this.k;
        vv0Var.setBounds(rect);
        vv0Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.j.set(0, i2, i3 - i, this.q + 200);
        ViewParent parent = this.i.getParent();
        parent.getClass();
        boolean z2 = ((ViewGroup) parent).getMeasuredHeight() >= this.r;
        this.p = z2;
        this.k.u(!z2 ? 1.0f : 0.0f);
    }
}
