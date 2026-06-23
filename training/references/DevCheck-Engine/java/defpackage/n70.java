package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class n70 extends j70 {
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n70(int i) {
        super(28);
        this.p = i;
    }

    @Override // defpackage.j70
    public final void l(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float sin;
        float cos;
        switch (this.p) {
            case 0:
                RectF g = j70.g(tabLayout, view);
                RectF g2 = j70.g(tabLayout, view2);
                if (g.left < g2.left) {
                    double d = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d2 = (f * 3.141592653589793d) / 2.0d;
                    sin = (float) Math.sin(d2);
                    cos = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(o4.c((int) g.left, sin, (int) g2.left), drawable.getBounds().top, o4.c((int) g.right, cos, (int) g2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF g3 = j70.g(tabLayout, view);
                float b = f < 0.5f ? o4.b(1.0f, 0.0f, 0.0f, 0.5f, f) : o4.b(0.0f, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) g3.left, drawable.getBounds().top, (int) g3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                break;
        }
    }
}
