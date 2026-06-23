package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class fr0 implements Iterator {
    public hr0 g;
    public hr0 h = null;
    public int i;
    public final /* synthetic */ ir0 j;
    public final /* synthetic */ int k;

    public fr0(ir0 ir0Var, int i) {
        this.k = i;
        this.j = ir0Var;
        this.g = ir0Var.l.j;
        this.i = ir0Var.k;
    }

    public final Object a() {
        return b();
    }

    public final hr0 b() {
        hr0 hr0Var = this.g;
        ir0 ir0Var = this.j;
        if (hr0Var == ir0Var.l) {
            rw.k();
            return null;
        }
        if (ir0Var.k != this.i) {
            throw new ConcurrentModificationException();
        }
        this.g = hr0Var.j;
        this.h = hr0Var;
        return hr0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != this.j.l;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.k) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return b().l;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        hr0 hr0Var = this.h;
        if (hr0Var == null) {
            throw new IllegalStateException();
        }
        ir0 ir0Var = this.j;
        ir0Var.c(hr0Var, true);
        this.h = null;
        this.i = ir0Var.k;
    }
}
