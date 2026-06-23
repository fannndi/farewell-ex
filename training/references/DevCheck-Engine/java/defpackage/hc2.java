package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hc2 implements lf0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ String i;

    public /* synthetic */ hc2(long j, String str, int i) {
        this.g = i;
        this.h = j;
        this.i = str;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        aj1 C;
        int i = this.g;
        String str = this.i;
        long j = this.h;
        ti1 ti1Var = (ti1) obj;
        switch (i) {
            case 0:
                ti1Var.getClass();
                C = ti1Var.C("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    C.d(1, j);
                    C.s(2, str);
                    C.w();
                    int x = op0.x(ti1Var);
                    C.close();
                    return Integer.valueOf(x);
                } finally {
                }
            default:
                ti1Var.getClass();
                C = ti1Var.C("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    C.d(1, j);
                    C.s(2, str);
                    C.w();
                    C.close();
                    return e42.f219a;
                } finally {
                }
        }
    }
}
