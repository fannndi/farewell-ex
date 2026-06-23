package defpackage;

import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class l9 implements Iterator {
    public int g;
    public int h;
    public boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public l9(int i) {
        this.g = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l9(p9 p9Var, int i) {
        this(p9Var.i);
        this.j = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.k = p9Var;
                this(p9Var.i);
                break;
            default:
                this.k = p9Var;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l9(r9 r9Var) {
        this(r9Var.i);
        this.j = 2;
        this.k = r9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (!hasNext()) {
            rw.k();
            return null;
        }
        int i = this.h;
        int i2 = this.j;
        Object obj = this.k;
        switch (i2) {
            case 0:
                f = ((p9) obj).f(i);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                f = ((p9) obj).i(i);
                break;
            default:
                f = ((r9) obj).h[i];
                break;
        }
        this.h++;
        this.i = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            c.n("Call next() before removing an element.");
            return;
        }
        int i = this.h - 1;
        this.h = i;
        int i2 = this.j;
        Object obj = this.k;
        switch (i2) {
            case 0:
                ((p9) obj).g(i);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((p9) obj).g(i);
                break;
            default:
                ((r9) obj).b(i);
                break;
        }
        this.g--;
        this.i = false;
    }
}
