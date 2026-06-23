package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class r implements Iterator {
    public final /* synthetic */ int g;
    public int h;
    public final Object i;

    public /* synthetic */ r(int i, Object obj) {
        this.g = i;
        this.i = obj;
    }

    public r(n60 n60Var) {
        this.g = 2;
        this.i = n60Var.f666a.iterator();
        this.h = n60Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.g;
        Object obj = this.i;
        switch (i) {
            case 0:
                return this.h < ((u) obj).b();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return this.h < ((Object[]) obj).length;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                Iterator it = (Iterator) obj;
                while (this.h > 0 && it.hasNext()) {
                    it.next();
                    this.h--;
                }
                return it.hasNext();
            default:
                return this.h < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.i;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    rw.k();
                    return null;
                }
                int i2 = this.h;
                this.h = i2 + 1;
                return ((u) obj).get(i2);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    int i3 = this.h;
                    this.h = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.h--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                Iterator it = (Iterator) obj;
                while (this.h > 0 && it.hasNext()) {
                    it.next();
                    this.h--;
                }
                return it.next();
            default:
                int i4 = this.h;
                this.h = i4 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.i;
                int i = this.h - 1;
                this.h = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
