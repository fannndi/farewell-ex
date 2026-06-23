package defpackage;

/* loaded from: classes.dex */
public final class tr0 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ wr0 h;

    public /* synthetic */ tr0(wr0 wr0Var, int i) {
        this.g = i;
        this.h = wr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        wr0 wr0Var = this.h;
        switch (i) {
            case 0:
                l60 l60Var = wr0Var.i;
                if (l60Var != null) {
                    l60Var.setListSelectionHidden(true);
                    l60Var.requestLayout();
                    break;
                }
                break;
            default:
                l60 l60Var2 = wr0Var.i;
                if (l60Var2 != null && l60Var2.isAttachedToWindow() && wr0Var.i.getCount() > wr0Var.i.getChildCount() && wr0Var.i.getChildCount() <= wr0Var.s) {
                    wr0Var.F.setInputMethodMode(2);
                    wr0Var.d();
                    break;
                }
                break;
        }
    }
}
