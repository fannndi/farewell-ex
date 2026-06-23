package defpackage;

/* loaded from: classes.dex */
public final class eo {

    /* renamed from: a, reason: collision with root package name */
    public boolean f242a;
    public co b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f242a) {
                    return;
                }
                this.f242a = true;
                this.c = true;
                co coVar = this.b;
                if (coVar != null) {
                    try {
                        coVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(co coVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == coVar) {
                return;
            }
            this.b = coVar;
            if (this.f242a) {
                coVar.onCancel();
            }
        }
    }
}
