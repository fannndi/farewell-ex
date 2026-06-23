package defpackage;

/* loaded from: classes.dex */
public abstract class pd implements gv {

    /* renamed from: a, reason: collision with root package name */
    public final uv f784a;

    public pd(uv uvVar) {
        uvVar.getClass();
        this.f784a = uvVar;
    }

    @Override // defpackage.gv
    public final ln a(lw lwVar) {
        lwVar.getClass();
        return new ln(new od(this, null, 0), n80.g, -2, xl.g);
    }

    @Override // defpackage.gv
    public final boolean c(gc2 gc2Var) {
        return b(gc2Var) && e(this.f784a.a());
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
