package defpackage;

import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u32 {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1019a;
    public final gr b;
    public volatile int c = 0;

    public u32(gr grVar, int i) {
        this.b = grVar;
        this.f1019a = i;
    }

    public final int a(int i) {
        kx0 b = b();
        int a2 = b.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.j;
        int i2 = a2 + b.g;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final kx0 b() {
        ThreadLocal threadLocal = d;
        kx0 kx0Var = (kx0) threadLocal.get();
        if (kx0Var == null) {
            kx0Var = new kx0();
            threadLocal.set(kx0Var);
        }
        lx0 lx0Var = (lx0) this.b.h;
        int a2 = lx0Var.a(6);
        if (a2 != 0) {
            int i = a2 + lx0Var.g;
            int i2 = (this.f1019a * 4) + ((ByteBuffer) lx0Var.j).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) lx0Var.j).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) lx0Var.j;
            kx0Var.j = byteBuffer;
            if (byteBuffer != null) {
                kx0Var.g = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                kx0Var.h = i4;
                kx0Var.i = ((ByteBuffer) kx0Var.j).getShort(i4);
                return kx0Var;
            }
            kx0Var.g = 0;
            kx0Var.h = 0;
            kx0Var.i = 0;
        }
        return kx0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(hTYJVDOvZnZlYL.rQEHMVfKla);
        kx0 b = b();
        int a2 = b.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) b.j).getInt(a2 + b.g) : 0));
        sb.append(", codepoints:");
        kx0 b2 = b();
        int a3 = b2.a(16);
        if (a3 != 0) {
            int i2 = a3 + b2.g;
            i = ((ByteBuffer) b2.j).getInt(((ByteBuffer) b2.j).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
