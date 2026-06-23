package defpackage;

/* loaded from: classes.dex */
public final class g81 extends f81 {
    public final Object c;

    public g81(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.f81
    public final Object a() {
        Object a2;
        synchronized (this.c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // defpackage.f81
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
