package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public final class v90 implements ap1 {
    public final ap1 g;
    public final long h;
    public final boolean i;
    public boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public final /* synthetic */ oj n;

    public v90(oj ojVar, ap1 ap1Var, long j, boolean z) {
        ap1Var.getClass();
        this.n = ojVar;
        this.g = ap1Var;
        this.h = j;
        this.i = z;
        this.l = z;
    }

    public final void a() {
        this.g.close();
    }

    @Override // defpackage.ap1
    public final bz1 c() {
        return this.g.c();
    }

    @Override // defpackage.ap1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        this.m = true;
        long j = this.h;
        if (j != -1 && this.k != j) {
            throw new ProtocolException(yttXLrAeLjN.KCnj);
        }
        try {
            a();
            e(null);
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    public final IOException e(IOException iOException) {
        if (this.j) {
            return iOException;
        }
        this.j = true;
        return oj.a(this.n, this.i, iOException, 4);
    }

    @Override // defpackage.ap1, java.io.Flushable
    public final void flush() {
        try {
            j();
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    public final void j() {
        this.g.flush();
    }

    @Override // defpackage.ap1
    public final void q(long j, wl wlVar) {
        if (this.m) {
            c.n("closed");
            return;
        }
        long j2 = this.h;
        if (j2 != -1 && this.k + j > j2) {
            throw new ProtocolException("expected " + this.h + " bytes but received " + (this.k + j));
        }
        try {
            if (this.l) {
                this.l = false;
                ((dd1) this.n.b).j.getClass();
            }
            this.g.q(j, wlVar);
            this.k += j;
        } catch (IOException e) {
            IOException e2 = e(e);
            e2.getClass();
            throw e2;
        }
    }

    public final String toString() {
        return v90.class.getSimpleName() + '(' + this.g + ')';
    }
}
