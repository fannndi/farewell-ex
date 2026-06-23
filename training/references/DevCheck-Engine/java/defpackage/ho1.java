package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ho1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f393a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ho1(int i, Object obj) {
        this.f393a = i;
        this.b = obj;
    }

    public final void a(int i) {
        int i2 = this.f393a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                go1 go1Var = (go1) obj;
                if (i == 0) {
                    if (go1Var.b()) {
                        fo1.a(go1Var.b);
                    }
                    go1Var.a();
                    break;
                }
                break;
            default:
                a5 a5Var = (a5) obj;
                a5Var.runOnUiThread(new r60(29, a5Var));
                break;
        }
    }
}
