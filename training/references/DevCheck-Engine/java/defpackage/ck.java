package defpackage;

import java.lang.ref.WeakReference;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ck implements Runnable {
    public final /* synthetic */ int g;
    public final WeakReference h;

    public ck(dk dkVar) {
        this.g = 0;
        this.h = new WeakReference(dkVar);
    }

    public ck(lk lkVar, int i) {
        this.g = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                this.h = new WeakReference(lkVar);
                break;
            default:
                this.h = new WeakReference(lkVar);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        WeakReference weakReference = this.h;
        switch (i) {
            case 0:
                if (weakReference.get() != null) {
                    ((dk) weakReference.get()).D0();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                if (weakReference.get() != null) {
                    ((lk) weakReference.get()).m = false;
                    break;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((lk) weakReference.get()).n = false;
                    break;
                }
                break;
        }
    }
}
