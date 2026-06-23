package defpackage;

/* loaded from: classes.dex */
public final class s42 extends UnsupportedOperationException {
    public final jb0 g;

    public s42(jb0 jb0Var) {
        this.g = jb0Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.g));
    }
}
