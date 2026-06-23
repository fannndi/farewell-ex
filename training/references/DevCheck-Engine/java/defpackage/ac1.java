package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public abstract class ac1 extends ConstraintLayout {
    public final r60 w;
    public int x;
    public final vv0 y;

    public ac1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        vv0 vv0Var = new vv0();
        this.y = vv0Var;
        vv0Var.setShapeAppearanceModel(vv0Var.h.f1010a.e(new of1(0.5f)));
        this.y.t(ColorStateList.valueOf(-1));
        setBackground(this.y);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yb1.M, R.attr.materialClockStyle, 0);
        this.x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.w = new r60(15, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            r60 r60Var = this.w;
            handler.removeCallbacks(r60Var);
            handler.post(r60Var);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            r60 r60Var = this.w;
            handler.removeCallbacks(r60Var);
            handler.post(r60Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.y.t(ColorStateList.valueOf(i));
    }
}
