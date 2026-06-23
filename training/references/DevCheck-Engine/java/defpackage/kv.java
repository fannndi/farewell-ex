package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class kv {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f551a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public kv(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f551a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(iw iwVar, ue ueVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        boolean z;
        int baseline;
        int i;
        if (iwVar == null) {
            return;
        }
        ev evVar = iwVar.K;
        ev evVar2 = iwVar.I;
        if (iwVar.g0 == 8) {
            ueVar.e = 0;
            ueVar.f = 0;
            ueVar.g = 0;
            return;
        }
        if (iwVar.T == null) {
            return;
        }
        qn1 qn1Var = ConstraintLayout.v;
        int i2 = ueVar.f1037a;
        int i3 = ueVar.b;
        int i4 = ueVar.c;
        int i5 = ueVar.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = iwVar.f0;
        int A = d51.A(i2);
        if (A == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (A == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (A == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = iwVar.r == 1;
            int i8 = ueVar.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == iwVar.k();
                if (ueVar.j == 2 || !z2 || ((z2 && z3) || iwVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iwVar.q(), 1073741824);
                }
            }
        } else if (A != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = evVar2 != null ? evVar2.g : 0;
            if (evVar != null) {
                i10 += evVar.g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int A2 = d51.A(i3);
        if (A2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (A2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (A2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = iwVar.s == 1;
            int i11 = ueVar.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == iwVar.q();
                if (ueVar.j == 2 || !z4 || ((z4 && z5) || iwVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iwVar.k(), 1073741824);
                }
            }
        } else if (A2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = evVar2 != null ? iwVar.J.g : 0;
            if (evVar != null) {
                i13 += iwVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        jw jwVar = (jw) iwVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (jwVar != null && kk1.q(constraintLayout.o, rt0.t) && view.getMeasuredWidth() == iwVar.q() && view.getMeasuredWidth() < jwVar.q() && view.getMeasuredHeight() == iwVar.k() && view.getMeasuredHeight() < jwVar.k() && view.getBaseline() == iwVar.a0 && !iwVar.z() && a(iwVar.G, makeMeasureSpec, iwVar.q()) && a(iwVar.H, makeMeasureSpec2, iwVar.k())) {
            ueVar.e = iwVar.q();
            ueVar.f = iwVar.k();
            ueVar.g = iwVar.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && iwVar.W > 0.0f;
        boolean z11 = z7 && iwVar.W > 0.0f;
        if (view == null) {
            return;
        }
        jv jvVar = (jv) view.getLayoutParams();
        int i14 = ueVar.j;
        if (i14 != 1 && i14 != 2 && z6 && iwVar.r == 0 && z7 && iwVar.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max2 = 0;
            max = 0;
        } else {
            if ((view instanceof z82) && (iwVar instanceof sb0)) {
                ((z82) view).j((sb0) iwVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            iwVar.G = makeMeasureSpec;
            iwVar.H = makeMeasureSpec2;
            iwVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = iwVar.u;
            max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = iwVar.v;
            if (i16 > 0) {
                max = Math.min(i16, max);
            }
            int i17 = iwVar.x;
            max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = iwVar.y;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            if (!kk1.q(constraintLayout.o, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * iwVar.W) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / iwVar.W) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight == max2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != max) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                iwVar.G = makeMeasureSpec;
                iwVar.H = makeMeasureSpec3;
                z = false;
                iwVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        ueVar.i = (max == ueVar.c && max2 == ueVar.d) ? z : true;
        boolean z13 = jvVar.c0 ? true : z12;
        if (z13 && baseline != -1 && iwVar.a0 != baseline) {
            ueVar.i = true;
        }
        ueVar.e = max;
        ueVar.f = max2;
        ueVar.h = z13;
        ueVar.g = baseline;
    }
}
