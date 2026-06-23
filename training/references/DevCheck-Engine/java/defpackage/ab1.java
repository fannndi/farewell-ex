package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ab1 implements n31 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final kb0 g;
    public static final kb0 h;
    public static final ho0 i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f20a;
    public final HashMap b;
    public final HashMap c;
    public final m31 d;
    public final bb1 e = new bb1(this);

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        g = new kb0("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        ba baVar2 = new ba(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(za1.class, baVar2);
        h = new kb0("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        i = new ho0(1);
    }

    public ab1(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, m31 m31Var) {
        this.f20a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = m31Var;
    }

    public static int g(kb0 kb0Var) {
        za1 za1Var = (za1) ((Annotation) kb0Var.b.get(za1.class));
        if (za1Var != null) {
            return za1Var.tag();
        }
        throw new w80("Field has no @Protobuf config");
    }

    @Override // defpackage.n31
    public final n31 a(kb0 kb0Var, Object obj) {
        e(kb0Var, obj, true);
        return this;
    }

    public final void b(kb0 kb0Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        za1 za1Var = (za1) ((Annotation) kb0Var.b.get(za1.class));
        if (za1Var == null) {
            throw new w80("Field has no @Protobuf config");
        }
        int ordinal = za1Var.intEncoding().ordinal();
        if (ordinal == 0) {
            h(za1Var.tag() << 3);
            h(i2);
        } else if (ordinal == 1) {
            h(za1Var.tag() << 3);
            h((i2 << 1) ^ (i2 >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            h((za1Var.tag() << 3) | 5);
            this.f20a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(kb0 kb0Var, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        za1 za1Var = (za1) ((Annotation) kb0Var.b.get(za1.class));
        if (za1Var == null) {
            throw new w80("Field has no @Protobuf config");
        }
        int ordinal = za1Var.intEncoding().ordinal();
        if (ordinal == 0) {
            h(za1Var.tag() << 3);
            i(j);
        } else if (ordinal == 1) {
            h(za1Var.tag() << 3);
            i((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            h((za1Var.tag() << 3) | 1);
            this.f20a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.n31
    public final n31 d(kb0 kb0Var, long j) {
        c(kb0Var, j, true);
        return this;
    }

    public final void e(kb0 kb0Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(kb0Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.f20a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(kb0Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(i, kb0Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z && doubleValue == 0.0d) {
                return;
            }
            h((g(kb0Var) << 3) | 1);
            this.f20a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            h((g(kb0Var) << 3) | 5);
            this.f20a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(kb0Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(kb0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(kb0Var) << 3) | 2);
            h(bArr.length);
            this.f20a.write(bArr);
            return;
        }
        m31 m31Var = (m31) this.b.get(obj.getClass());
        if (m31Var != null) {
            f(m31Var, kb0Var, obj, z);
            return;
        }
        o52 o52Var = (o52) this.c.get(obj.getClass());
        if (o52Var != null) {
            bb1 bb1Var = this.e;
            bb1Var.f76a = false;
            bb1Var.c = kb0Var;
            bb1Var.b = z;
            o52Var.a(obj, bb1Var);
            return;
        }
        if (obj instanceof at0) {
            b(kb0Var, ((at0) obj).g, true);
        } else if (obj instanceof Enum) {
            b(kb0Var, ((Enum) obj).ordinal(), true);
        } else {
            f(this.d, kb0Var, obj, z);
        }
    }

    public final void f(m31 m31Var, kb0 kb0Var, Object obj, boolean z) {
        up0 up0Var = new up0();
        up0Var.g = 0L;
        try {
            OutputStream outputStream = this.f20a;
            this.f20a = up0Var;
            try {
                m31Var.a(obj, this);
                this.f20a = outputStream;
                long j = up0Var.g;
                up0Var.close();
                if (z && j == 0) {
                    return;
                }
                h((g(kb0Var) << 3) | 2);
                i(j);
                m31Var.a(obj, this);
            } catch (Throwable th) {
                this.f20a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                up0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i2) {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.f20a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | rt0.s);
                i2 >>>= 7;
            }
        }
    }

    public final void i(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f20a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | rt0.s);
                j >>>= 7;
            }
        }
    }
}
