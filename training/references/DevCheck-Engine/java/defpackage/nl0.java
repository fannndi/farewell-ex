package defpackage;

import androidx.work.impl.WorkDatabase;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class nl0 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f690a;

    public nl0(WorkDatabase workDatabase, int i) {
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.f690a = workDatabase;
                break;
            default:
                workDatabase.getClass();
                this.f690a = workDatabase;
                break;
        }
    }
}
