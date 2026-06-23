package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class m02 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f613a;
    public final /* synthetic */ n02 b;

    public /* synthetic */ m02(n02 n02Var, int i) {
        this.f613a = i;
        this.b = n02Var;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        int i = this.f613a;
        n02 n02Var = this.b;
        switch (i) {
            case 0:
                n02Var.o = (ic1) obj;
                n02Var.e();
                break;
            default:
                List list = (List) obj;
                n02Var.n.b((list == null || list.isEmpty()) ? null : (li) list.get(0));
                break;
        }
    }
}
