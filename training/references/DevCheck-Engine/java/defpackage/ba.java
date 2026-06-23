package defpackage;

/* loaded from: classes.dex */
public final class ba implements za1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f73a;

    public ba(int i) {
        this.f73a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return za1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za1)) {
            return false;
        }
        za1 za1Var = (za1) obj;
        return this.f73a == za1Var.tag() && ya1.g.equals(za1Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f73a ^ 14552422) + (ya1.g.hashCode() ^ 2041407134);
    }

    @Override // defpackage.za1
    public final ya1 intEncoding() {
        return ya1.g;
    }

    @Override // defpackage.za1
    public final int tag() {
        return this.f73a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f73a + "intEncoding=" + ya1.g + ')';
    }
}
