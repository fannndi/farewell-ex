package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class j51 extends r70 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j51(de1 de1Var, int i) {
        super(de1Var);
        this.d = i;
    }

    @Override // defpackage.r70
    public final int d(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ee1 ee1Var = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                right = view.getRight() + ((ee1) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ee1Var).rightMargin;
                break;
            default:
                ee1 ee1Var2 = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                right = view.getBottom() + ((ee1) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ee1Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // defpackage.r70
    public final int e(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ee1 ee1Var = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                A = de1.A(view) + ((ViewGroup.MarginLayoutParams) ee1Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ee1Var).rightMargin;
                break;
            default:
                ee1 ee1Var2 = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                A = de1.z(view) + ((ViewGroup.MarginLayoutParams) ee1Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ee1Var2).bottomMargin;
                break;
        }
        return A + i;
    }

    @Override // defpackage.r70
    public final int f(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ee1 ee1Var = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                z = de1.z(view) + ((ViewGroup.MarginLayoutParams) ee1Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) ee1Var).bottomMargin;
                break;
            default:
                ee1 ee1Var2 = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                z = de1.A(view) + ((ViewGroup.MarginLayoutParams) ee1Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) ee1Var2).rightMargin;
                break;
        }
        return z + i;
    }

    @Override // defpackage.r70
    public final int g(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ee1 ee1Var = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                left = view.getLeft() - ((ee1) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ee1Var).leftMargin;
                break;
            default:
                ee1 ee1Var2 = (ee1) view.getLayoutParams();
                ((de1) obj).getClass();
                left = view.getTop() - ((ee1) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ee1Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // defpackage.r70
    public final int h() {
        switch (this.d) {
            case 0:
                return ((de1) this.b).n;
            default:
                return ((de1) this.b).o;
        }
    }

    @Override // defpackage.r70
    public final int i() {
        int i;
        int E;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                de1 de1Var = (de1) obj;
                i = de1Var.n;
                E = de1Var.E();
                break;
            default:
                de1 de1Var2 = (de1) obj;
                i = de1Var2.o;
                E = de1Var2.C();
                break;
        }
        return i - E;
    }

    @Override // defpackage.r70
    public final int j() {
        switch (this.d) {
            case 0:
                return ((de1) this.b).E();
            default:
                return ((de1) this.b).C();
        }
    }

    @Override // defpackage.r70
    public final int k() {
        switch (this.d) {
            case 0:
                return ((de1) this.b).l;
            default:
                return ((de1) this.b).m;
        }
    }

    @Override // defpackage.r70
    public final int l() {
        switch (this.d) {
            case 0:
                return ((de1) this.b).m;
            default:
                return ((de1) this.b).l;
        }
    }

    @Override // defpackage.r70
    public final int m() {
        switch (this.d) {
            case 0:
                return ((de1) this.b).D();
            default:
                return ((de1) this.b).F();
        }
    }

    @Override // defpackage.r70
    public final int n() {
        int D;
        int E;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                de1 de1Var = (de1) obj;
                D = de1Var.n - de1Var.D();
                E = de1Var.E();
                break;
            default:
                de1 de1Var2 = (de1) obj;
                D = de1Var2.o - de1Var2.F();
                E = de1Var2.C();
                break;
        }
        return D - E;
    }

    @Override // defpackage.r70
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((de1) obj2).J(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((de1) obj2).J(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.r70
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((de1) obj2).J(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((de1) obj2).J(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.r70
    public final void q(int i) {
        switch (this.d) {
            case 0:
                ((de1) this.b).O(i);
                break;
            default:
                ((de1) this.b).P(i);
                break;
        }
    }
}
