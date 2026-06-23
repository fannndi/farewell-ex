package defpackage;

/* loaded from: classes.dex */
public abstract class og1 extends qd {
    public og1(dx dxVar) {
        super(dxVar);
        if (dxVar == null || dxVar.d() == n80.g) {
            return;
        }
        c.m("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.dx
    public final qx d() {
        return n80.g;
    }
}
