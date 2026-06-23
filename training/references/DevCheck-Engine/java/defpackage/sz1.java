package defpackage;

/* loaded from: classes.dex */
public final class sz1 extends k32 {
    public final /* synthetic */ int j;
    public boolean k;
    public int l;
    public final /* synthetic */ Object m;

    public sz1(k82 k82Var) {
        this.j = 1;
        this.m = k82Var;
        this.k = false;
        this.l = 0;
    }

    public sz1(tz1 tz1Var, int i) {
        this.j = 0;
        this.m = tz1Var;
        this.l = i;
        this.k = false;
    }

    @Override // defpackage.l82
    public final void a() {
        int i = this.j;
        Object obj = this.m;
        switch (i) {
            case 0:
                if (!this.k) {
                    ((tz1) obj).f1015a.setVisibility(this.l);
                    break;
                }
                break;
            default:
                int i2 = this.l + 1;
                this.l = i2;
                k82 k82Var = (k82) obj;
                if (i2 == k82Var.f519a.size()) {
                    l82 l82Var = k82Var.d;
                    if (l82Var != null) {
                        l82Var.a();
                    }
                    this.l = 0;
                    this.k = false;
                    k82Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k32, defpackage.l82
    public void b() {
        switch (this.j) {
            case 0:
                this.k = true;
                break;
        }
    }

    @Override // defpackage.k32, defpackage.l82
    public final void c() {
        int i = this.j;
        Object obj = this.m;
        switch (i) {
            case 0:
                ((tz1) obj).f1015a.setVisibility(0);
                break;
            default:
                if (!this.k) {
                    this.k = true;
                    l82 l82Var = ((k82) obj).d;
                    if (l82Var != null) {
                        l82Var.c();
                        break;
                    }
                }
                break;
        }
    }
}
