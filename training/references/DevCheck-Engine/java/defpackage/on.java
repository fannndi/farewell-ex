package defpackage;

/* loaded from: classes.dex */
public final class on extends f0 {
    public final /* synthetic */ pn n;

    public on(pn pnVar) {
        this.n = pnVar;
    }

    @Override // defpackage.f0
    public final String h() {
        mn mnVar = (mn) this.n.g.get();
        if (mnVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + mnVar.f645a + "]";
    }
}
