package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w02 implements Iterator {
    public final /* synthetic */ int g;
    public Iterator h;
    public final Object i;

    public w02(r rVar) {
        this.g = 1;
        this.i = new ArrayList();
        this.h = rVar;
    }

    public w02(u20 u20Var) {
        this.g = 0;
        this.i = u20Var;
        this.h = ((gm1) u20Var.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.g) {
        }
        return this.h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((lf0) ((u20) obj).c).j(this.h.next());
            default:
                Object next = this.h.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                r rVar = viewGroup != null ? new r(3, viewGroup) : null;
                if (rVar == null || !rVar.hasNext()) {
                    while (!this.h.hasNext() && !arrayList.isEmpty()) {
                        this.h = (Iterator) yr.a0(arrayList);
                        es.W(arrayList);
                    }
                } else {
                    arrayList.add(this.h);
                    this.h = rVar;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
