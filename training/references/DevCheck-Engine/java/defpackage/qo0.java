package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qo0 extends lo0 {
    public final Serializable g;

    public qo0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.g = bool;
    }

    public qo0(Number number) {
        Objects.requireNonNull(number);
        this.g = number;
    }

    public qo0(String str) {
        Objects.requireNonNull(str);
        this.g = str;
    }

    public static boolean e(qo0 qo0Var) {
        Serializable serializable = qo0Var.g;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger b() {
        Serializable serializable = this.g;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (e(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String d = d();
        ju0.g(d);
        return new BigInteger(d);
    }

    public final Number c() {
        Serializable serializable = this.g;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ip0((String) serializable);
        }
        rw.l("Primitive is neither a number nor a string");
        return null;
    }

    public final String d() {
        Serializable serializable = this.g;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo0.class != obj.getClass()) {
            return false;
        }
        qo0 qo0Var = (qo0) obj;
        Serializable serializable = qo0Var.g;
        Serializable serializable2 = this.g;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (e(this) && e(qo0Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? b().equals(qo0Var.b()) : c().longValue() == qo0Var.c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : ju0.e0(d())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : ju0.e0(qo0Var.d())) == 0;
        }
        double doubleValue = serializable2 instanceof Number ? c().doubleValue() : Double.parseDouble(d());
        double doubleValue2 = serializable instanceof Number ? qo0Var.c().doubleValue() : Double.parseDouble(qo0Var.d());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.g;
        if (serializable == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
