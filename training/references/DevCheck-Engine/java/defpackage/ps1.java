package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ps1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f807a;
    public final String b;
    public final String c;
    public final boolean d;
    public final double[] e;
    public final double f;
    public final double g;
    public final double h;
    public final long i;
    public final boolean j;
    public final int[] k;

    public ps1(String str, String str2, String str3, boolean z, double[] dArr, long j, boolean z2, int[] iArr) {
        this.f807a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = (double[]) dArr.clone();
        this.i = j;
        this.j = z2;
        if (iArr == null) {
            this.k = new int[0];
        } else {
            this.k = (int[]) iArr.clone();
        }
        boolean z3 = dArr.length > 0;
        int length = dArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!Double.isNaN(dArr[i])) {
                z3 = false;
                break;
            }
            i++;
        }
        if (z3) {
            this.f = Double.NaN;
            this.g = Double.NaN;
            this.h = Double.NaN;
            return;
        }
        double[] dArr2 = (double[]) dArr.clone();
        Arrays.sort(dArr2);
        int length2 = dArr2.length;
        while (length2 > 0 && Double.isNaN(dArr2[length2 - 1])) {
            length2--;
        }
        if (length2 == 0) {
            this.f = 0.0d;
            this.g = 0.0d;
            this.h = 0.0d;
        } else if ((length2 & 1) != 0) {
            this.f = dArr2[length2 / 2];
            this.g = dArr2[0];
            this.h = dArr2[length2 - 1];
        } else {
            int i2 = length2 / 2;
            this.f = (dArr2[i2 - 1] + dArr2[i2]) * 0.5d;
            this.g = dArr2[0];
            this.h = dArr2[length2 - 1];
        }
    }

    public final boolean a() {
        double[] dArr = this.e;
        if (dArr.length == 0) {
            return false;
        }
        for (double d : dArr) {
            if (!Double.isNaN(d)) {
                return false;
            }
        }
        return true;
    }
}
