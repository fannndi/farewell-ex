package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class kd1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f529a;
    public float[] b;
    public int c;
    public float d = Float.NaN;
    public final Path e = new Path();
    public final Path f = new Path();
    public LinearGradient g;
    public float h;

    public kd1(int i, int i2) {
        this.f529a = i;
        this.b = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i3] = Float.NaN;
        }
    }
}
