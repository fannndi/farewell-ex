package defpackage;

import android.view.KeyEvent;
import androidx.viewpager2.widget.ViewPager2;
import flar2.devcheck.MainActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class nt0 implements zu1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f700a;
    public final KeyEvent.Callback b;

    public /* synthetic */ nt0(KeyEvent.Callback callback, int i) {
        this.f700a = i;
        this.b = callback;
    }

    @Override // defpackage.yu1
    public final void a(cv1 cv1Var) {
        int i = this.f700a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                try {
                    ((MainActivity) callback).G.setCurrentItem(cv1Var.b);
                    break;
                } catch (ClassCastException unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((g82) callback).setCurrentItem(cv1Var.b);
                break;
            default:
                ViewPager2 viewPager2 = (ViewPager2) callback;
                int i2 = cv1Var.b;
                Object obj = viewPager2.t.g;
                viewPager2.b(i2);
                break;
        }
    }
}
