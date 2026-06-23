package defpackage;

import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class h42 implements Iterator {
    public final /* synthetic */ int g;

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
