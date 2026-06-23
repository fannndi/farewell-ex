package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b91 extends ve1 {
    public final RecyclerView f;
    public final ue1 g;
    public final le h;

    public b91(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = this.e;
        this.h = new le(8, this);
        this.f = recyclerView;
    }

    @Override // defpackage.ve1
    public final o0 j() {
        return this.h;
    }
}
