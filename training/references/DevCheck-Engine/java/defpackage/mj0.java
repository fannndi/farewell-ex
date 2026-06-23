package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mj0 {
    public long c;
    public final zc1 d;
    public int g;
    public int h;

    /* renamed from: a, reason: collision with root package name */
    public int f637a = rt0.x;
    public final ArrayList b = new ArrayList();
    public pi0[] e = new pi0[8];
    public int f = 7;

    public mj0(gk0 gk0Var) {
        this.d = new zc1(gk0Var);
    }

    public final void a(pi0 pi0Var) {
        this.b.add(pi0Var);
        long a2 = this.c + pi0Var.b.a() + pi0Var.f791a.a();
        this.c = a2;
        if (a2 <= 262144) {
            return;
        }
        rw.f("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                pi0 pi0Var = this.e[length];
                pi0Var.getClass();
                int i4 = pi0Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            pi0[] pi0VarArr = this.e;
            System.arraycopy(pi0VarArr, i2 + 1, pi0VarArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final km c(int i) {
        if (i >= 0) {
            pi0[] pi0VarArr = oj0.f740a;
            if (i <= pi0VarArr.length - 1) {
                return pi0VarArr[i].f791a;
            }
        }
        int length = this.f + 1 + (i - oj0.f740a.length);
        if (length >= 0) {
            pi0[] pi0VarArr2 = this.e;
            if (length < pi0VarArr2.length) {
                pi0 pi0Var = pi0VarArr2[length];
                pi0Var.getClass();
                return pi0Var.f791a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(pi0 pi0Var) {
        a(pi0Var);
        int i = pi0Var.c;
        int i2 = this.f637a;
        if (i > i2) {
            u9.l0(r7, null, 0, this.e.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
        int i3 = this.g + 1;
        pi0[] pi0VarArr = this.e;
        if (i3 > pi0VarArr.length) {
            pi0[] pi0VarArr2 = new pi0[pi0VarArr.length * 2];
            System.arraycopy(pi0VarArr, 0, pi0VarArr2, pi0VarArr.length, pi0VarArr.length);
            this.f = this.e.length - 1;
            this.e = pi0VarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = pi0Var;
        this.g++;
        this.h += i;
    }

    public final km e() {
        zc1 zc1Var = this.d;
        byte readByte = zc1Var.readByte();
        byte[] bArr = pd2.f785a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long f = f(i, 127);
        if (this.c + f > 262144) {
            rw.f("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return zc1Var.i(f);
        }
        wl wlVar = new wl();
        int[] iArr = pk0.f794a;
        zc1Var.getClass();
        lv lvVar = pk0.c;
        lv lvVar2 = lvVar;
        int i3 = 0;
        for (long j = 0; j < f; j++) {
            byte readByte2 = zc1Var.readByte();
            byte[] bArr2 = pd2.f785a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                lv[] lvVarArr = (lv[]) lvVar2.c;
                lvVarArr.getClass();
                lvVar2 = lvVarArr[(i2 >>> (i3 - 8)) & 255];
                lvVar2.getClass();
                if (((lv[]) lvVar2.c) == null) {
                    wlVar.I(lvVar2.f607a);
                    i3 -= lvVar2.b;
                    lvVar2 = lvVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            lv[] lvVarArr2 = (lv[]) lvVar2.c;
            lvVarArr2.getClass();
            lv lvVar3 = lvVarArr2[(i2 << (8 - i3)) & 255];
            lvVar3.getClass();
            int i4 = lvVar3.b;
            if (((lv[]) lvVar3.c) != null || i4 > i3) {
                break;
            }
            wlVar.I(lvVar3.f607a);
            i3 -= i4;
            lvVar2 = lvVar;
        }
        return wlVar.i(wlVar.h);
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte readByte = this.d.readByte();
            byte[] bArr = pd2.f785a;
            i4++;
            long j2 = (readByte & Byte.MAX_VALUE) << i5;
            if (j2 > 2147483647L - j) {
                rw.f("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((readByte & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        rw.f("HPACK integer overflow");
        return 0;
    }
}
