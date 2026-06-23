package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class i50 implements Choreographer.FrameCallback {
    public int b;
    public long c;
    public boolean d;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f411a = new long[30];
    public volatile float e = Float.NaN;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2 = this.c;
        long j3 = 0;
        if (j2 > 0) {
            long[] jArr = this.f411a;
            int i = this.b;
            jArr[i % 30] = j - j2;
            int i2 = i + 1;
            this.b = i2;
            int min = Math.min(i2, 30);
            if (min >= 4) {
                for (int i3 = 0; i3 < min; i3++) {
                    j3 += this.f411a[i3];
                }
                float f = (j3 / min) / 1000000.0f;
                if (f > 0.5f) {
                    this.e = 1000.0f / f;
                }
            }
        }
        this.c = j;
        if (this.d) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
