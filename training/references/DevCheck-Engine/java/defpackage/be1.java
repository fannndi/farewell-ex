package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class be1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79a;
    public final /* synthetic */ de1 b;

    public /* synthetic */ be1(de1 de1Var, int i) {
        this.f79a = i;
        this.b = de1Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.f79a) {
            case 0:
                ee1 ee1Var = (ee1) view.getLayoutParams();
                right = view.getRight() + ((ee1) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ee1Var).rightMargin;
                break;
            default:
                ee1 ee1Var2 = (ee1) view.getLayoutParams();
                right = view.getBottom() + ((ee1) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ee1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.f79a) {
            case 0:
                ee1 ee1Var = (ee1) view.getLayoutParams();
                left = view.getLeft() - ((ee1) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ee1Var).leftMargin;
                break;
            default:
                ee1 ee1Var2 = (ee1) view.getLayoutParams();
                left = view.getTop() - ((ee1) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ee1Var2).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int E;
        int i2 = this.f79a;
        de1 de1Var = this.b;
        switch (i2) {
            case 0:
                i = de1Var.n;
                E = de1Var.E();
                break;
            default:
                i = de1Var.o;
                E = de1Var.C();
                break;
        }
        return i - E;
    }

    public final int d() {
        int i = this.f79a;
        de1 de1Var = this.b;
        switch (i) {
            case 0:
                return de1Var.D();
            default:
                return de1Var.F();
        }
    }
}
