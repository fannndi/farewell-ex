package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class w4 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1111a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w4(Object obj, int i, Object obj2) {
        this.f1111a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f1111a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.H;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((vv0) obj).s(floatValue);
                Drawable drawable = appBarLayout.D;
                if (drawable instanceof vv0) {
                    ((vv0) drawable).s(floatValue);
                }
                Iterator it = appBarLayout.x.iterator();
                if (it.hasNext()) {
                    throw d51.l(it);
                }
                Iterator it2 = appBarLayout.y.iterator();
                if (it2.hasNext()) {
                    throw d51.l(it2);
                }
                return;
            default:
                g30 g30Var = (g30) obj2;
                br0 br0Var = (br0) obj;
                if (br0Var.c(true) && br0Var.m != 0 && g30Var.isVisible()) {
                    g30Var.invalidateSelf();
                    return;
                }
                return;
        }
    }
}
