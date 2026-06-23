package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class bq1 extends k10 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bq1(int i, Class cls) {
        super(cls);
        this.c = i;
    }

    @Override // defpackage.k10
    public final Date a(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
