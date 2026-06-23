package defpackage;

/* loaded from: classes.dex */
public final class rl2 extends he2 {
    public final o1 h;
    public final nv1 i;
    public final /* synthetic */ em2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl2(em2 em2Var, nv1 nv1Var) {
        super(4);
        o1 o1Var = new o1("OnRequestInstallCallback");
        this.j = em2Var;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.h = o1Var;
        this.i = nv1Var;
    }
}
