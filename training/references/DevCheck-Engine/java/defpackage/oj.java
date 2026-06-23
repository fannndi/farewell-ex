package defpackage;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class oj {

    /* renamed from: a, reason: collision with root package name */
    public boolean f739a;
    public Object b;
    public Object c;
    public Object d;

    public static IOException a(oj ojVar, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            ojVar.g(iOException);
        }
        if (z3) {
            m90 m90Var = ((dd1) ojVar.b).j;
            if (iOException != null) {
                m90Var.getClass();
            } else {
                m90Var.getClass();
            }
        }
        if (z2) {
            m90 m90Var2 = ((dd1) ojVar.b).j;
            if (iOException != null) {
                m90Var2.getClass();
            } else {
                m90Var2.getClass();
            }
        }
        return ((dd1) ojVar.b).h(ojVar, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public ed1 b() {
        x90 g = ((y90) this.d).g();
        ed1 ed1Var = g instanceof ed1 ? (ed1) g : null;
        if (ed1Var != null) {
            return ed1Var;
        }
        c.n("no connection for CONNECT tunnels");
        return null;
    }

    public boolean c(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.c;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this.f739a = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean d(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.c;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this.f739a = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public id1 e(lg1 lg1Var) {
        oj ojVar;
        String b;
        long h;
        try {
            b = lg1Var.l.b("Content-Type");
            if (b == null) {
                b = null;
            }
            h = ((y90) this.d).h(lg1Var);
            ojVar = this;
        } catch (IOException e) {
            e = e;
            ojVar = this;
        }
        try {
            return new id1(b, h, new zc1(new w90(ojVar, ((y90) this.d).a(lg1Var), h, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((dd1) ojVar.b).j.getClass();
            ojVar.g(iOException);
            throw iOException;
        }
    }

    public kg1 f(boolean z) {
        try {
            kg1 j = ((y90) this.d).j(z);
            if (j == null) {
                return j;
            }
            j.n = this;
            return j;
        } catch (IOException e) {
            ((dd1) this.b).j.getClass();
            g(e);
            throw e;
        }
    }

    public void g(IOException iOException) {
        this.f739a = true;
        ((y90) this.d).g().b((dd1) this.b, iOException);
    }

    public zf h() {
        dd1 dd1Var = (dd1) this.b;
        if (dd1Var.p) {
            c.n("Check failed.");
            return null;
        }
        dd1Var.p = true;
        dd1Var.k.i();
        synchronized (dd1Var) {
            if (dd1Var.x == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (dd1Var.t || dd1Var.u) {
                throw new IllegalStateException("Check failed.");
            }
            if (dd1Var.r) {
                throw new IllegalStateException("Check failed.");
            }
            if (!dd1Var.s) {
                throw new IllegalStateException("Check failed.");
            }
            dd1Var.s = false;
            dd1Var.t = true;
            dd1Var.u = true;
        }
        x90 g = ((y90) this.d).g();
        g.getClass();
        ed1 ed1Var = (ed1) g;
        ed1Var.e.setSoTimeout(0);
        ed1Var.h();
        return new zf(this);
    }
}
