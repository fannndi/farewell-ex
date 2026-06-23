package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* loaded from: classes.dex */
public final class ou0 extends ArrayAdapter {
    public ColorStateList g;
    public ColorStateList h;
    public final /* synthetic */ pu0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou0(pu0 pu0Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.i = pu0Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        pu0 pu0Var = this.i;
        ColorStateList colorStateList2 = pu0Var.s;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.h = colorStateList;
        if (pu0Var.r != 0 && pu0Var.s != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ts.b(pu0Var.s.getColorForState(iArr3, 0), pu0Var.r), ts.b(pu0Var.s.getColorForState(iArr2, 0), pu0Var.r), pu0Var.r});
        }
        this.g = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            pu0 pu0Var = this.i;
            ColorDrawable colorDrawable = null;
            if (pu0Var.getText().toString().contentEquals(textView.getText()) && pu0Var.r != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(pu0Var.r);
                if (this.h != null) {
                    colorDrawable2.setTintList(this.g);
                    ?? rippleDrawable = new RippleDrawable(this.h, colorDrawable2, null);
                    FocusRingDrawable f = FocusRingDrawable.f(getContext(), rippleDrawable, null);
                    if (f != null) {
                        f.u.x = pu0Var.m;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
