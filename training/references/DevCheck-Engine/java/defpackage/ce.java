package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ce implements Runnable {
    public final /* synthetic */ int g;
    public int h;
    public final Object i;

    public /* synthetic */ ce(int i, int i2, Object obj) {
        this.g = i2;
        this.i = obj;
        this.h = i;
    }

    public ce(int i, e82 e82Var) {
        this.g = 5;
        this.h = i;
        this.i = e82Var;
    }

    public ce(fe feVar) {
        this.g = 0;
        this.i = feVar;
        this.h = -1;
    }

    public ce(List list, int i, Throwable th) {
        this.g = 2;
        op0.e("initCallbacks cannot be null", list);
        this.i = new ArrayList(list);
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((fe) obj).n.w(this.h, 4);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i2 = this.h;
                sl slVar = (sl) ((my1) obj).g;
                if (slVar != null) {
                    slVar.T(i2);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (this.h == 1) {
                    while (i3 < size) {
                        ((s70) arrayList.get(i3)).b();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((s70) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                }
            case 3:
                ((jv0) obj).k0.l0(this.h);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ((t01) obj).j(this.h);
                break;
            case 5:
                ((RecyclerView) obj).l0(this.h);
                break;
            default:
                ((mf2) obj).i(this.h);
                break;
        }
    }
}
