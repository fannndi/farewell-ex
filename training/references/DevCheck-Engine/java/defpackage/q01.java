package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class q01 extends FrameLayout implements w01 {
    public boolean g;
    public boolean h;
    public boolean i;

    public final void a() {
        setVisibility((!this.i || (!this.g && this.h)) ? 8 : 0);
    }

    @Override // defpackage.gx0
    public final void c(sw0 sw0Var) {
        a();
    }

    @Override // defpackage.gx0
    public sw0 getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setDividersEnabled(boolean z) {
        this.i = z;
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.w01
    public void setExpanded(boolean z) {
        this.g = z;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // defpackage.w01
    public void setOnlyShowWhenExpanded(boolean z) {
        this.h = z;
        a();
    }

    public void setTitle(CharSequence charSequence) {
    }
}
