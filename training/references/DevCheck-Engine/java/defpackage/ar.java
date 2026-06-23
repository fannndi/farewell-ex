package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import flar2.devcheck.manifest.ManifestActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ar implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ar(int i, Object obj) {
        this.f50a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f50a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dr drVar = (dr) obj;
                drVar.s(drVar.t());
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                s60 s60Var = (s60) obj;
                s60Var.l = z;
                s60Var.p();
                if (!z) {
                    s60Var.s(false);
                    s60Var.m = false;
                    break;
                }
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) obj;
                int i2 = ManifestActivity.N;
                try {
                    if (z) {
                        x4 x4Var = (x4) frameLayout.getLayoutParams();
                        x4Var.f1162a = 0;
                        frameLayout.setLayoutParams(x4Var);
                    } else {
                        x4 x4Var2 = (x4) frameLayout.getLayoutParams();
                        x4Var2.f1162a = 21;
                        frameLayout.setLayoutParams(x4Var2);
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
