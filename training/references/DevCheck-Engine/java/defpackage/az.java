package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class az extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az(int i, Object obj) {
        this.f57a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.f57a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ts1 ts1Var = (ts1) obj;
                ts1Var.g = true;
                ts1Var.notifyDataSetChanged();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                wr0 wr0Var = (wr0) obj;
                if (wr0Var.F.isShowing()) {
                    wr0Var.d();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((TabLayout) obj).j();
                break;
            default:
                ((g82) obj).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.f57a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ts1 ts1Var = (ts1) obj;
                ts1Var.g = false;
                ts1Var.notifyDataSetInvalidated();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((wr0) obj).dismiss();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((TabLayout) obj).j();
                break;
            default:
                ((g82) obj).f();
                break;
        }
    }
}
