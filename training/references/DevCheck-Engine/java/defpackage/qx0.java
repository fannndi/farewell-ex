package defpackage;

/* loaded from: classes.dex */
public abstract class qx0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f865a;
    public final int b;

    public qx0(int i, int i2) {
        this.f865a = i;
        this.b = i2;
    }

    public void a(se0 se0Var) {
        se0Var.getClass();
        throw new c31("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(ti1 ti1Var) {
        ti1Var.getClass();
        if (!(ti1Var instanceof ct1)) {
            throw new c31("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((ct1) ti1Var).g);
    }
}
