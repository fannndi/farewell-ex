package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b60 extends Drawable implements Animatable {
    public static final sd s = new sd(Float.class, "growFraction", 6);
    public final Context g;
    public final br0 h;
    public ObjectAnimator j;
    public ObjectAnimator k;
    public ArrayList m;
    public boolean n;
    public float o;
    public int q;
    public final float l = -1.0f;
    public final Paint p = new Paint();
    public final Rect r = new Rect();
    public p4 i = new p4();

    public b60(Context context, br0 br0Var) {
        this.g = context;
        this.h = br0Var;
        setAlpha(255);
    }

    public final float b() {
        br0 br0Var = this.h;
        if (br0Var.g == 0 && br0Var.h == 0) {
            return 1.0f;
        }
        return this.o;
    }

    public final float c() {
        float f = this.l;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof g30;
        br0 br0Var = this.h;
        if (br0Var.c(z) && br0Var.m != 0) {
            p4 p4Var = this.i;
            ContentResolver contentResolver = this.g.getContentResolver();
            p4Var.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                float uptimeMillis = (SystemClock.uptimeMillis() % r7) / ((int) ((((z ? br0Var.j : br0Var.k) * 1000.0f) / br0Var.m) * f2));
                return uptimeMillis < 0.0f ? (uptimeMillis % 1.0f) + 1.0f : uptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        p4 p4Var = this.i;
        ContentResolver contentResolver = this.g.getContentResolver();
        p4Var.getClass();
        return e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.j;
        int i = 0;
        sd sdVar = s;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, sdVar, 0.0f, 1.0f);
            this.j = ofFloat;
            ofFloat.setDuration(500L);
            this.j.setInterpolator(o4.b);
            ObjectAnimator objectAnimator2 = this.j;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                c.m("Cannot set showAnimator while the current showAnimator is running.");
                return false;
            }
            this.j = objectAnimator2;
            objectAnimator2.addListener(new a60(this, i));
        }
        int i2 = 1;
        if (this.k == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, sdVar, 1.0f, 0.0f);
            this.k = ofFloat2;
            ofFloat2.setDuration(500L);
            this.k.setInterpolator(o4.b);
            ObjectAnimator objectAnimator3 = this.k;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                c.m("Cannot set hideAnimator while the current hideAnimator is running.");
                return false;
            }
            this.k = objectAnimator3;
            objectAnimator3.addListener(new a60(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.j : this.k;
            ObjectAnimator objectAnimator5 = z ? this.k : this.j;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.n;
                    this.n = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.n = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.n;
                    this.n = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.n = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                br0 br0Var = this.h;
                if (!z ? br0Var.h != 0 : br0Var.g != 0) {
                    boolean z7 = this.n;
                    this.n = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.n = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void f(wd wdVar) {
        ArrayList arrayList = this.m;
        if (arrayList == null || !arrayList.contains(wdVar)) {
            return;
        }
        this.m.remove(wdVar);
        if (this.m.isEmpty()) {
            this.m = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.k;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.q = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.p.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
