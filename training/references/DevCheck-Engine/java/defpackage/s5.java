package defpackage;

import android.window.OnBackInvokedCallback;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f918a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(int i, Object obj) {
        this.f918a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f918a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a6) obj).G();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((ru0) obj).a();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((af0) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
