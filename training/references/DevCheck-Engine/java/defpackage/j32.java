package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public abstract class j32 {
    public static final z22 A;
    public static final z22 B;
    public static final h90 C;

    /* renamed from: a, reason: collision with root package name */
    public static final z22 f461a;
    public static final z22 b;
    public static final c32 c;
    public static final a32 d;
    public static final a32 e;
    public static final a32 f;
    public static final a32 g;
    public static final z22 h;
    public static final z22 i;
    public static final z22 j;
    public static final h22 k;
    public static final h32 l;
    public static final h32 m;
    public static final a32 n;
    public static final z22 o;
    public static final z22 p;
    public static final z22 q;
    public static final z22 r;
    public static final z22 s;
    public static final z22 t;
    public static final z22 u;
    public static final z22 v;
    public static final z22 w;
    public static final z22 x;
    public static final z22 y;
    public static final j31 z;

    static {
        int i2 = 0;
        f461a = new z22(Class.class, new o22().a(), i2);
        b = new z22(BitSet.class, new y22().a(), i2);
        b32 b32Var = new b32();
        c = new c32();
        d = new a32(Boolean.TYPE, Boolean.class, b32Var);
        e = new a32(Byte.TYPE, Byte.class, new d32());
        f = new a32(Short.TYPE, Short.class, new e32());
        g = new a32(Integer.TYPE, Integer.class, new f32());
        h = new z22(AtomicInteger.class, new g32().a(), i2);
        i = new z22(AtomicBoolean.class, new e22().a(), i2);
        j = new z22(AtomicIntegerArray.class, new f22().a(), i2);
        k = new h22();
        new i22();
        int i3 = 1;
        new h32(1, false);
        l = new h32(1, true);
        new h32(0, false);
        m = new h32(0, true);
        n = new a32(Character.TYPE, Character.class, new j22());
        k22 k22Var = new k22();
        o = new z22(BigDecimal.class, new l22(), i2);
        p = new z22(BigInteger.class, new m22(), i2);
        q = new z22(ip0.class, new n22(), i2);
        r = new z22(String.class, k22Var, i2);
        s = new z22(StringBuilder.class, new q22(), i2);
        t = new z22(StringBuffer.class, new r22(), i2);
        u = new z22(URL.class, new s22(), i2);
        v = new z22(URI.class, new t22(), i2);
        w = new z22(InetAddress.class, new u22(), i3);
        x = new z22(UUID.class, new v22(), i2);
        y = new z22(Currency.class, new w22().a(), i2);
        z = new j31(new kn0(new String[]{"year", "month", "dayOfMonth", "hourOfDay", "minute", "second"}, 8), i3);
        A = new z22(Locale.class, new x22(), i2);
        B = new z22(lo0.class, mo0.f648a, i3);
        C = i90.d;
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static int b(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        throw new IllegalArgumentException("Too big for an int: " + j2);
    }
}
