package defpackage;

import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class fs implements gm1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fs(int i, Object obj) {
        this.f303a = i;
        this.b = obj;
    }

    @Override // defpackage.gm1
    public final Iterator iterator() {
        int i = this.f303a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return (Iterator) obj;
            default:
                return new er0((String) obj);
        }
    }
}
