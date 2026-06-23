package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class a11 extends FrameLayout implements w01 {
    public final TextView g;
    public boolean h;
    public boolean i;
    public sw0 j;
    public ColorStateList k;

    public a11(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.g = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        sw0 sw0Var = this.j;
        if (sw0Var != null) {
            setVisibility((!sw0Var.isVisible() || (!this.h && this.i)) ? 8 : 0);
        }
    }

    @Override // defpackage.gx0
    public final void c(sw0 sw0Var) {
        this.j = sw0Var;
        sw0Var.setCheckable(false);
        this.g.setText(sw0Var.e);
        a();
    }

    @Override // defpackage.gx0
    public sw0 getItemData() {
        return this.j;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.w01
    public void setExpanded(boolean z) {
        this.h = z;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // defpackage.w01
    public void setOnlyShowWhenExpanded(boolean z) {
        this.i = z;
        a();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.g;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (colorStateList != null) {
            this.g.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
