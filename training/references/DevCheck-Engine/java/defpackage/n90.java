package defpackage;

/* loaded from: classes.dex */
public abstract class n90 extends sx {
    public static final /* synthetic */ int l = 0;
    public long i;
    public boolean j;
    public j9 k;

    public final void H(boolean z) {
        long j = this.i - (z ? 4294967296L : 1L);
        this.i = j;
        if (j <= 0 && this.j) {
            shutdown();
        }
    }

    public final void I(c50 c50Var) {
        j9 j9Var = this.k;
        if (j9Var == null) {
            j9Var = new j9();
            this.k = j9Var;
        }
        j9Var.addLast(c50Var);
    }

    public final void J(boolean z) {
        this.i = (z ? 4294967296L : 1L) + this.i;
        if (z) {
            return;
        }
        this.j = true;
    }

    public abstract long K();

    public final boolean L() {
        j9 j9Var = this.k;
        if (j9Var == null) {
            return false;
        }
        c50 c50Var = (c50) (j9Var.isEmpty() ? null : j9Var.removeFirst());
        if (c50Var == null) {
            return false;
        }
        c50Var.run();
        return true;
    }

    public abstract void shutdown();
}
