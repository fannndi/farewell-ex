package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class b82 implements m1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ gr h;

    public /* synthetic */ b82(gr grVar, int i) {
        this.g = i;
        this.h = grVar;
    }

    @Override // defpackage.m1
    public final boolean b(View view) {
        int i = this.g;
        gr grVar = this.h;
        switch (i) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) grVar.k;
                if (viewPager2.x) {
                    viewPager2.b(currentItem);
                    break;
                }
                break;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager22 = (ViewPager2) grVar.k;
                if (viewPager22.x) {
                    viewPager22.b(currentItem2);
                    break;
                }
                break;
        }
        return true;
    }
}
