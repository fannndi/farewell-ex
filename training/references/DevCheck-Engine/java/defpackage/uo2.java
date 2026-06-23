package defpackage;

/* loaded from: classes.dex */
public final class uo2 extends ro2 {
    public final /* synthetic */ wo2 n;

    public uo2(wo2 wo2Var) {
        this.n = wo2Var;
    }

    @Override // defpackage.ro2
    public final String c() {
        so2 so2Var = (so2) this.n.g.get();
        return so2Var == null ? "Completer object has been garbage collected, future will fail soon" : d51.y("tag=[", String.valueOf(so2Var.f948a), "]");
    }
}
