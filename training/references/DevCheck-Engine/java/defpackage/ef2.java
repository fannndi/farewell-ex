package defpackage;

/* loaded from: classes.dex */
public abstract class ef2 implements Runnable {
    public final nv1 g;

    public ef2() {
        this.g = null;
    }

    public ef2(nv1 nv1Var) {
        this.g = nv1Var;
    }

    public void a(Exception exc) {
        nv1 nv1Var = this.g;
        if (nv1Var != null) {
            nv1Var.a(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }
}
