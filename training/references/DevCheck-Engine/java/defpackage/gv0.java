package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class gv0 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ jv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(jv0 jv0Var, int i, int i2) {
        super(i);
        this.F = jv0Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.de1
    public final void C0(RecyclerView recyclerView, int i) {
        ho hoVar = new ho(recyclerView.getContext());
        hoVar.f151a = i;
        D0(hoVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(pe1 pe1Var, int[] iArr) {
        jv0 jv0Var = this.F;
        RecyclerView recyclerView = jv0Var.k0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = jv0Var.k0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = jv0Var.k0.getHeight();
        }
    }
}
