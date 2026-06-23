package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vp1 {
    public static final x60 n = new x60(1);
    public static final x60 o = new x60(2);
    public static final x60 p = new x60(3);
    public static final x60 q = new x60(4);
    public static final x60 r = new x60(5);
    public static final x60 s = new x60(0);
    public final Object d;
    public final kk1 e;
    public float h;
    public wp1 k;
    public float l;
    public boolean m;

    /* renamed from: a, reason: collision with root package name */
    public float f1096a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public long g = 0;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();

    public vp1(Object obj, kk1 kk1Var) {
        this.d = obj;
        this.e = kk1Var;
        if (kk1Var == p || kk1Var == q || kk1Var == r) {
            this.h = 0.1f;
        } else if (kk1Var == s) {
            this.h = 0.00390625f;
        } else if (kk1Var == n || kk1Var == o) {
            this.h = 0.002f;
        } else {
            this.h = 1.0f;
        }
        this.k = null;
        this.l = Float.MAX_VALUE;
        this.m = false;
    }

    public static m4 b() {
        ThreadLocal threadLocal = m4.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new m4(new kp(1)));
        }
        return (m4) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [j4, java.lang.Object] */
    public final void a(float f) {
        float durationScale;
        if (this.f) {
            this.l = f;
            return;
        }
        if (this.k == null) {
            this.k = new wp1(f);
        }
        wp1 wp1Var = this.k;
        double d = f;
        wp1Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            rw.l("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            rw.l("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.h * 0.75f);
        wp1Var.d = abs;
        wp1Var.e = abs * 62.5d;
        kp kpVar = b().e;
        kpVar.getClass();
        if (Thread.currentThread() != ((Looper) kpVar.i).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        int i = 1;
        this.f = true;
        if (!this.c) {
            this.b = this.e.u(this.d);
        }
        float f2 = this.b;
        if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
            c.m("Starting value need to be in between min value and max value");
            return;
        }
        m4 b = b();
        ArrayList arrayList = b.b;
        if (arrayList.size() == 0) {
            ((Choreographer) b.e.h).postFrameCallback(new k4(b.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b.g = durationScale;
                if (b.h == null) {
                    b.h = new zf(i, b);
                }
                final zf zfVar = b.h;
                if (((j4) zfVar.h) == null) {
                    ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: j4
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((m4) zf.this.i).g = f3;
                        }
                    };
                    zfVar.h = r0;
                    ValueAnimator.registerDurationScaleChangeListener(r0);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.e.O(this.d, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                throw iy1.e(arrayList, i);
            }
            i++;
        }
    }

    public final void d() {
        if (this.k.b <= 0.0d) {
            rw.l("Spring animations can only come to an end when there is damping");
            return;
        }
        kp kpVar = b().e;
        kpVar.getClass();
        if (Thread.currentThread() != ((Looper) kpVar.i).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.m = true;
        }
    }
}
