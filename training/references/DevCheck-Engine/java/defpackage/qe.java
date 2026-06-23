package defpackage;

/* loaded from: classes.dex */
public final class qe extends ap0 implements lf0 {
    public static final qe i;
    public static final qe j;
    public final /* synthetic */ int h;

    static {
        int i2 = 1;
        i = new qe(i2, 0);
        j = new qe(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        switch (this.h) {
            case 0:
                return Integer.valueOf((int) Math.sqrt(((Number) obj).intValue()));
            default:
                ((Number) obj).intValue();
                return 0;
        }
    }
}
