package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jc0 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public Drawable.ConstantState f473a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public an1 t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;

    public jc0(jc0 jc0Var) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.w;
        if (jc0Var != null) {
            this.f473a = jc0Var.f473a;
            this.b = jc0Var.b;
            this.c = jc0Var.c;
            this.d = jc0Var.d;
            this.e = jc0Var.e;
            this.f = jc0Var.f;
            this.g = jc0Var.g;
            this.h = jc0Var.h;
            this.i = jc0Var.i;
            this.j = jc0Var.j;
            this.k = jc0Var.k;
            this.l = jc0Var.l;
            this.m = jc0Var.m;
            this.n = jc0Var.n;
            this.o = jc0Var.o;
            this.p = jc0Var.p;
            this.q = jc0Var.q;
            this.r = jc0Var.r;
            this.s = jc0Var.s;
            this.u = jc0Var.u;
            this.v = jc0Var.v;
            an1 an1Var = jc0Var.t;
            if (an1Var instanceof cn1) {
                this.t = ((cn1) an1Var).l().a();
            } else if (an1Var instanceof dr1) {
                this.t = ((dr1) an1Var).j().d();
            } else {
                this.t = an1Var;
            }
            if (jc0Var.w != null) {
                this.w = new Rect(jc0Var.w);
            }
            int[] iArr = jc0Var.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f473a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
