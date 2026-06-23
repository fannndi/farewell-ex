package defpackage;

import android.view.View;
import flar2.devcheck.monitors.LoadMonitorWindow;
import flar2.devcheck.monitors.TempMonitorWindow;

/* loaded from: classes.dex */
public final /* synthetic */ class ps0 implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f806a;
    public final /* synthetic */ oq1 b;

    public /* synthetic */ ps0(oq1 oq1Var, int i) {
        this.f806a = i;
        this.b = oq1Var;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = this.f806a;
        oq1 oq1Var = this.b;
        switch (i2) {
            case 0:
                LoadMonitorWindow loadMonitorWindow = (LoadMonitorWindow) oq1Var;
                if (i > 0) {
                    String[] strArr = LoadMonitorWindow.O;
                    if (zx0.b("prefMonitorFullscreen").booleanValue()) {
                        loadMonitorWindow.q.setTranslationY(-8000.0f);
                        break;
                    }
                }
                zx0.a(loadMonitorWindow.q);
                break;
            default:
                TempMonitorWindow tempMonitorWindow = (TempMonitorWindow) oq1Var;
                if (i > 0) {
                    int i3 = TempMonitorWindow.I;
                    if (zx0.b("prefMonitorFullscreen").booleanValue()) {
                        tempMonitorWindow.u.setTranslationY(-8000.0f);
                        break;
                    }
                }
                zx0.a(tempMonitorWindow.u);
                break;
        }
    }
}
