package defpackage;

/* loaded from: classes.dex */
public final class lu extends bm {
    public final xl v;

    public lu(int i, xl xlVar) {
        super(i);
        this.v = xlVar;
        if (xlVar != xl.g) {
            if (i >= 1) {
                return;
            }
            c.d(d51.p(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + af1.a(bm.class).c() + " instead").toString());
    }

    @Override // defpackage.bm
    public final boolean A() {
        return this.v == xl.h;
    }

    public final Object O(Object obj, boolean z) {
        if (this.v != xl.i) {
            return K(obj);
        }
        Object k = super.k(obj);
        return (!(k instanceof fp) || (k instanceof ep)) ? k : e42.f219a;
    }

    @Override // defpackage.bm, defpackage.wl1
    public final Object b(dx dxVar, Object obj) {
        if (O(obj, true) instanceof ep) {
            throw s();
        }
        return e42.f219a;
    }

    @Override // defpackage.bm, defpackage.wl1
    public final Object k(Object obj) {
        return O(obj, false);
    }
}
