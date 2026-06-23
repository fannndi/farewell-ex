package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class kn0 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final List f541a;
    public final /* synthetic */ int b;

    public kn0(String[] strArr, int i) {
        this.b = i;
        this.f541a = Arrays.asList(strArr);
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        Year of;
        YearMonth of2;
        Duration ofSeconds;
        Instant ofEpochSecond;
        LocalDate of3;
        LocalTime of4;
        MonthDay of5;
        Period of6;
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        ro0Var.e();
        List list = this.f541a;
        long[] jArr = new long[list.size()];
        while (ro0Var.Q() != 4) {
            int indexOf = list.indexOf(ro0Var.K());
            if (indexOf >= 0) {
                jArr[indexOf] = ro0Var.J();
            } else {
                ro0Var.W();
            }
        }
        ro0Var.o();
        switch (this.b) {
            case 0:
                of = Year.of(Math.toIntExact(jArr[0]));
                return of;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                of2 = YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                return of2;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ofSeconds = Duration.ofSeconds(jArr[0], jArr[1]);
                return ofSeconds;
            case 3:
                ofEpochSecond = Instant.ofEpochSecond(jArr[0], jArr[1]);
                return ofEpochSecond;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                of3 = LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                return of3;
            case 5:
                of4 = LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
                return of4;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                of5 = MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
                return of5;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                of6 = Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
                return of6;
            default:
                return new GregorianCalendar(j32.b(jArr[0]), j32.b(jArr[1]), j32.b(jArr[2]), j32.b(jArr[3]), j32.b(jArr[4]), j32.b(jArr[5]));
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        int i;
        int value;
        long[] jArr;
        int year;
        int monthValue;
        long[] jArr2;
        long seconds;
        int nano;
        long epochSecond;
        int nano2;
        int year2;
        int monthValue2;
        int dayOfMonth;
        int hour;
        int minute;
        int second;
        int nano3;
        int monthValue3;
        int dayOfMonth2;
        int years;
        int months;
        int days;
        if (obj == null) {
            to0Var.D();
            return;
        }
        to0Var.j();
        switch (this.b) {
            case 0:
                i = 0;
                value = ig0.l(obj).getValue();
                jArr = new long[]{value};
                jArr2 = jArr;
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                i = 0;
                YearMonth n = ig0.n(obj);
                year = n.getYear();
                monthValue = n.getMonthValue();
                jArr2 = new long[]{year, monthValue};
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                i = 0;
                Duration j = ig0.j(obj);
                seconds = j.getSeconds();
                nano = j.getNano();
                jArr2 = new long[]{seconds, nano};
                break;
            case 3:
                i = 0;
                Instant h = ln0.h(obj);
                epochSecond = h.getEpochSecond();
                nano2 = h.getNano();
                jArr2 = new long[]{epochSecond, nano2};
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                i = 0;
                LocalDate j2 = ln0.j(obj);
                year2 = j2.getYear();
                long j3 = year2;
                monthValue2 = j2.getMonthValue();
                dayOfMonth = j2.getDayOfMonth();
                jArr = new long[]{j3, monthValue2, dayOfMonth};
                jArr2 = jArr;
                break;
            case 5:
                i = 0;
                LocalTime j4 = on0.j(obj);
                hour = j4.getHour();
                minute = j4.getMinute();
                second = j4.getSecond();
                nano3 = j4.getNano();
                jArr2 = new long[]{hour, minute, second, nano3};
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                i = 0;
                MonthDay n2 = on0.n(obj);
                monthValue3 = n2.getMonthValue();
                dayOfMonth2 = n2.getDayOfMonth();
                jArr2 = new long[]{monthValue3, dayOfMonth2};
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                i = 0;
                Period t = on0.t(obj);
                years = t.getYears();
                long j5 = years;
                months = t.getMonths();
                days = t.getDays();
                jArr = new long[]{j5, months, days};
                jArr2 = jArr;
                break;
            default:
                Calendar calendar = (Calendar) obj;
                i = 0;
                jArr2 = new long[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
                break;
        }
        int i2 = i;
        while (true) {
            List list = this.f541a;
            if (i2 >= list.size()) {
                to0Var.o();
                return;
            } else {
                to0Var.r((String) list.get(i2));
                to0Var.I(jArr2[i2]);
                i2++;
            }
        }
    }
}
