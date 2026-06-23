package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class ii2 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f434a;
    public int b;
    public boolean c;

    public ii2() {
        c3.S(4, "initialCapacity");
        this.f434a = new Object[4];
        this.b = 0;
    }

    public static int b(int i, int i2) {
        if (i2 < 0) {
            c.m("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public final void a(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f434a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void c(int i) {
        int length = this.f434a.length;
        int b = b(length, this.b + i);
        if (b > length || this.c) {
            this.f434a = Arrays.copyOf(this.f434a, b);
            this.c = false;
        }
    }
}
