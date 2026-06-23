package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class aq1 extends c22 {
    public static final zp1 b = new zp1();

    /* renamed from: a, reason: collision with root package name */
    public final c22 f49a;

    public aq1(c22 c22Var) {
        this.f49a = c22Var;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        Date date = (Date) this.f49a.b(ro0Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        this.f49a.c(to0Var, (Timestamp) obj);
    }
}
