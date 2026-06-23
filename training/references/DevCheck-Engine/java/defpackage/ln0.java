package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ln0 {
    public static /* bridge */ /* synthetic */ Class A() {
        return OffsetDateTime.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return OffsetTime.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return Period.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return Year.class;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return Duration.class;
    }

    public static /* bridge */ /* synthetic */ Instant h(Object obj) {
        return (Instant) obj;
    }

    public static /* bridge */ /* synthetic */ LocalDate j(Object obj) {
        return (LocalDate) obj;
    }

    public static /* bridge */ /* synthetic */ LocalDateTime k(Object obj) {
        return (LocalDateTime) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneId m(Object obj) {
        return (ZoneId) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneOffset o(Object obj) {
        return (ZoneOffset) obj;
    }

    public static /* bridge */ /* synthetic */ ZonedDateTime q(Object obj) {
        return (ZonedDateTime) obj;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof ZoneOffset;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return YearMonth.class;
    }

    public static /* bridge */ /* synthetic */ LocalDateTime u(Object obj) {
        return (LocalDateTime) obj;
    }

    public static /* bridge */ /* synthetic */ ZoneOffset v(Object obj) {
        return (ZoneOffset) obj;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return ZonedDateTime.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return Instant.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return LocalDateTime.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return MonthDay.class;
    }
}
