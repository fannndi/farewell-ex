package defpackage;

/* loaded from: classes.dex */
public abstract class q90 implements Runnable, n50, Comparable {
    public volatile Object _heap;
    public long g;
    public int h = -1;

    public q90(long j) {
        this.g = j;
    }

    public final int a(long j, r90 r90Var, s90 s90Var) {
        synchronized (this) {
            if (this._heap == t90.f973a) {
                return 2;
            }
            synchronized (r90Var) {
                try {
                    q90[] q90VarArr = r90Var.f1152a;
                    q90 q90Var = q90VarArr != null ? q90VarArr[0] : null;
                    if (s90.o.get(s90Var) != 0) {
                        return 1;
                    }
                    if (q90Var == null) {
                        r90Var.c = j;
                    } else {
                        long j2 = q90Var.g;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - r90Var.c > 0) {
                            r90Var.c = j;
                        }
                    }
                    long j3 = this.g;
                    long j4 = r90Var.c;
                    if (j3 - j4 < 0) {
                        this.g = j4;
                    }
                    r90Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.n50
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                o1 o1Var = t90.f973a;
                if (obj == o1Var) {
                    return;
                }
                r90 r90Var = obj instanceof r90 ? (r90) obj : null;
                if (r90Var != null) {
                    synchronized (r90Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof wy1 ? (wy1) obj2 : null) != null) {
                            r90Var.b(this.h);
                        }
                    }
                }
                this._heap = o1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.g - ((q90) obj).g;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(r90 r90Var) {
        if (this._heap != t90.f973a) {
            this._heap = r90Var;
        } else {
            c.m("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.g + ']';
    }
}
