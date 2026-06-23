package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes.dex */
public final class bw extends ex {
    public is0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ConstraintTrackingWorker l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(ConstraintTrackingWorker constraintTrackingWorker, ex exVar) {
        super(exVar);
        this.l = constraintTrackingWorker;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.l, this);
    }
}
