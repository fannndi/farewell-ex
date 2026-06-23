package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class e71 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225a;
    public final /* synthetic */ f71 b;

    public /* synthetic */ e71(f71 f71Var, int i) {
        this.f225a = i;
        this.b = f71Var;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        int i = this.f225a;
        f71 f71Var = this.b;
        switch (i) {
            case 0:
                f71Var.e.submit(new r60(11, f71Var));
                break;
            default:
                f71Var.c.i((List) f71Var.d.d());
                break;
        }
    }
}
