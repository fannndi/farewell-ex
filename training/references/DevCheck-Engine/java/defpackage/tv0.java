package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class tv0 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public an1 f1010a;
    public o70 b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public final Paint.Style r;

    public tv0(an1 an1Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.f1010a = an1Var;
        this.b = null;
    }

    public tv0(tv0 tv0Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.f1010a = tv0Var.f1010a;
        this.b = tv0Var.b;
        this.k = tv0Var.k;
        this.c = tv0Var.c;
        this.d = tv0Var.d;
        this.g = tv0Var.g;
        this.f = tv0Var.f;
        this.l = tv0Var.l;
        this.i = tv0Var.i;
        this.q = tv0Var.q;
        this.o = tv0Var.o;
        this.j = tv0Var.j;
        this.m = tv0Var.m;
        this.n = tv0Var.n;
        this.p = tv0Var.p;
        this.e = tv0Var.e;
        this.r = tv0Var.r;
        if (tv0Var.h != null) {
            this.h = new Rect(tv0Var.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        vv0 vv0Var = new vv0(this);
        vv0Var.l = true;
        vv0Var.m = true;
        return vv0Var;
    }
}
