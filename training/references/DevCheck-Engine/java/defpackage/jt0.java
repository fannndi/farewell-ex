package defpackage;

import android.R;
import android.view.MenuItem;
import android.view.View;
import flar2.devcheck.MainActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class jt0 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ MainActivity h;

    public /* synthetic */ jt0(MainActivity mainActivity, int i) {
        this.g = i;
        this.h = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        MainActivity mainActivity = this.h;
        switch (i) {
            case 0:
                if (!mainActivity.S) {
                    mainActivity.F = true;
                    try {
                        View findViewById = mainActivity.findViewById(R.id.content);
                        if (findViewById != null) {
                            findViewById.invalidate();
                            break;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                String str = MainActivity.U;
                n72 l = mainActivity.l();
                l72 g = mainActivity.g();
                py0 h = mainActivity.h();
                l.getClass();
                g.getClass();
                gr grVar = new gr(l, g, h);
                vq a2 = af1.a(mi0.class);
                String b = a2.b();
                if (b == null) {
                    c.m("Local and anonymous classes can not be ViewModels");
                    break;
                } else {
                    ((mi0) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).l();
                    n72 l2 = mainActivity.l();
                    l72 g2 = mainActivity.g();
                    py0 h2 = mainActivity.h();
                    l2.getClass();
                    g2.getClass();
                    gr grVar2 = new gr(l2, g2, h2);
                    vq a3 = af1.a(wu1.class);
                    String b2 = a3.b();
                    if (b2 == null) {
                        c.m("Local and anonymous classes can not be ViewModels");
                        break;
                    } else {
                        ((wu1) grVar2.t(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2))).h();
                        break;
                    }
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                String str2 = MainActivity.U;
                try {
                    MenuItem menuItem = mainActivity.N;
                    if (menuItem != null && menuItem.isVisible()) {
                        mainActivity.N.setVisible(false);
                        if (i51.b("prefHardwareDB").booleanValue()) {
                            mainActivity.O.setVisible(false);
                            break;
                        }
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            default:
                if (mainActivity.Q.d()) {
                    fo1.a(mainActivity);
                }
                mainActivity.invalidateOptionsMenu();
                break;
        }
    }
}
