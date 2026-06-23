package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ha2 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final dn2 f372a;
    public gb2 b;

    public ha2(View view, dn2 dn2Var) {
        gb2 gb2Var;
        this.f372a = dn2Var;
        WeakHashMap weakHashMap = y62.f1215a;
        gb2 a2 = q62.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            gb2Var = (i >= 36 ? new ta2(a2) : i >= 35 ? new sa2(a2) : i >= 34 ? new ra2(a2) : i >= 31 ? new qa2(a2) : i >= 30 ? new pa2(a2) : i >= 29 ? new oa2(a2) : new na2(a2)).b();
        } else {
            gb2Var = null;
        }
        this.b = gb2Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = gb2.h(view, windowInsets);
            return ia2.j(view, windowInsets);
        }
        gb2 h = gb2.h(view, windowInsets);
        db2 db2Var = h.f329a;
        if (this.b == null) {
            WeakHashMap weakHashMap = y62.f1215a;
            this.b = q62.a(view);
        }
        if (this.b == null) {
            this.b = h;
            return ia2.j(view, windowInsets);
        }
        dn2 k = ia2.k(view);
        if (k != null && Objects.equals((gb2) k.f202a, h)) {
            return ia2.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        gb2 gb2Var = this.b;
        int i = 1;
        while (i <= 512) {
            mm0 h2 = db2Var.h(i);
            mm0 h3 = gb2Var.f329a.h(i);
            int i2 = h2.f643a;
            int i3 = h2.d;
            int i4 = h2.c;
            int i5 = h2.b;
            int i6 = h3.f643a;
            int i7 = h3.d;
            int i8 = h3.c;
            int i9 = h3.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = h;
            return ia2.j(view, windowInsets);
        }
        gb2 gb2Var2 = this.b;
        ma2 ma2Var = new ma2(i12, (i10 & 8) != 0 ? ia2.e : (i11 & 8) != 0 ? ia2.f : (i10 & 519) != 0 ? ia2.g : (i11 & 519) != 0 ? ia2.h : null, (i12 & 8) != 0 ? 160L : 250L);
        ma2Var.f621a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ma2Var.f621a.b());
        mm0 h4 = db2Var.h(i12);
        mm0 h5 = gb2Var2.f329a.h(i12);
        int min = Math.min(h4.f643a, h5.f643a);
        int i13 = h4.b;
        int i14 = h5.b;
        int min2 = Math.min(i13, i14);
        int i15 = h4.c;
        int i16 = h5.c;
        int min3 = Math.min(i15, i16);
        int i17 = h4.d;
        int i18 = h5.d;
        zf zfVar = new zf(mm0.c(min, min2, min3, Math.min(i17, i18)), 12, mm0.c(Math.max(h4.f643a, h5.f643a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        ia2.g(view, ma2Var, h, false);
        duration.addUpdateListener(new ga2(ma2Var, h, gb2Var2, i12, view));
        duration.addListener(new ri(ma2Var, 4, view));
        w41.a(view, new mo(view, ma2Var, zfVar, duration));
        this.b = h;
        return ia2.j(view, windowInsets);
    }
}
