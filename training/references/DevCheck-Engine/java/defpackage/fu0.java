package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class fu0 {
    public int g;
    public int h;
    public int i;
    public Object j;

    public fu0() {
        if (m52.g == null) {
            m52.g = new m52();
        }
    }

    public int a(int i) {
        if (i < this.i) {
            return ((ByteBuffer) this.j).getShort(this.h + i);
        }
        return 0;
    }

    public void b() {
        if (((gu0) this.j).n != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.g;
            gu0 gu0Var = (gu0) this.j;
            if (i >= gu0Var.l || gu0Var.i[i] >= 0) {
                return;
            } else {
                this.g = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.h) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.h) {
            tag = c(view);
        } else {
            tag = view.getTag(this.g);
            if (!((Class) this.j).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate e = y62.e(view);
            o0 o0Var = e != null ? e instanceof n0 ? ((n0) e).f660a : new o0(e) : null;
            if (o0Var == null) {
                o0Var = new o0();
            }
            y62.o(view, o0Var);
            view.setTag(this.g, obj);
            y62.i(view, this.i);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.g < ((gu0) this.j).l;
    }

    public void remove() {
        gu0 gu0Var = (gu0) this.j;
        b();
        if (this.h == -1) {
            c.n("Call next() before removing element from the iterator.");
            return;
        }
        gu0Var.c();
        gu0Var.k(this.h);
        this.h = -1;
        this.i = gu0Var.n;
    }
}
