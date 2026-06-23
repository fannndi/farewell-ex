package defpackage;

import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

/* loaded from: classes.dex */
public final class pn0 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f798a;
    public final /* synthetic */ c22 b;
    public final /* synthetic */ c22 c;

    public /* synthetic */ pn0(c22 c22Var, c22 c22Var2, int i) {
        this.f798a = i;
        this.b = c22Var;
        this.c = c22Var2;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        LocalDateTime of;
        OffsetTime of2;
        int i = this.f798a;
        c22 c22Var = this.c;
        c22 c22Var2 = this.b;
        Serializable serializable = null;
        switch (i) {
            case 0:
                ro0Var.e();
                LocalTime localTime = null;
                while (ro0Var.Q() != 4) {
                    String K = ro0Var.K();
                    if (K.equals("date")) {
                        serializable = on0.e(c22Var2.b(ro0Var));
                    } else if (K.equals("time")) {
                        localTime = on0.A(c22Var.b(ro0Var));
                    } else {
                        ro0Var.W();
                    }
                }
                ro0Var.o();
                mn0.a(serializable, "date", ro0Var);
                LocalDate j = ln0.j(serializable);
                mn0.a(localTime, "time", ro0Var);
                of = LocalDateTime.of(j, on0.j(localTime));
                return of;
            default:
                ro0Var.e();
                ZoneOffset zoneOffset = null;
                while (true) {
                    int Q = ro0Var.Q();
                    String str = qJTtDWNCVUDjB.euPUbqh;
                    if (Q == 4) {
                        ro0Var.o();
                        mn0.a(serializable, "time", ro0Var);
                        LocalTime j2 = on0.j(serializable);
                        mn0.a(zoneOffset, str, ro0Var);
                        of2 = OffsetTime.of(j2, ln0.v(zoneOffset));
                        return of2;
                    }
                    String K2 = ro0Var.K();
                    if (K2.equals(str)) {
                        zoneOffset = ln0.o(c22Var.b(ro0Var));
                    } else if (K2.equals("time")) {
                        serializable = on0.A(c22Var2.b(ro0Var));
                    } else {
                        ro0Var.W();
                    }
                }
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        LocalDate localDate;
        LocalTime localTime;
        LocalTime localTime2;
        ZoneOffset offset;
        int i = this.f798a;
        c22 c22Var = this.c;
        c22 c22Var2 = this.b;
        switch (i) {
            case 0:
                LocalDateTime k = ln0.k(obj);
                to0Var.j();
                to0Var.r("date");
                localDate = k.toLocalDate();
                c22Var2.c(to0Var, localDate);
                to0Var.r("time");
                localTime = k.toLocalTime();
                c22Var.c(to0Var, localTime);
                to0Var.o();
                break;
            default:
                OffsetTime q = on0.q(obj);
                to0Var.j();
                to0Var.r("time");
                localTime2 = q.toLocalTime();
                c22Var2.c(to0Var, localTime2);
                to0Var.r("offset");
                offset = q.getOffset();
                c22Var.c(to0Var, offset);
                to0Var.o();
                break;
        }
    }
}
