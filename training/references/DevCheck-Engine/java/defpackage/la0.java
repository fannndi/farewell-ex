package defpackage;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes.dex */
public final class la0 implements pa0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ExtendedFloatingActionButton h;

    public /* synthetic */ la0(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.g = i;
        this.h = extendedFloatingActionButton;
    }

    @Override // defpackage.pa0
    public final int a() {
        int i = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedSize();
            default:
                return extendedFloatingActionButton.getMeasuredHeight();
        }
    }

    @Override // defpackage.pa0
    public final int c() {
        int i = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedPadding();
            default:
                return extendedFloatingActionButton.h0;
        }
    }

    @Override // defpackage.pa0
    public final int e() {
        int i = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedPadding();
            default:
                return extendedFloatingActionButton.g0;
        }
    }

    @Override // defpackage.pa0
    public final int k() {
        int i = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        switch (i) {
            case 0:
                return extendedFloatingActionButton.getCollapsedSize();
            default:
                return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.g0 + extendedFloatingActionButton.h0;
        }
    }

    @Override // defpackage.pa0
    public final ViewGroup.LayoutParams l() {
        switch (this.g) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
                return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
            default:
                return new ViewGroup.LayoutParams(-2, -2);
        }
    }
}
