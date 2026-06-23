package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class cn1 implements an1 {
    public static final of1 m = new of1(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public ym0 f131a = new fi1();
    public ym0 b = new fi1();
    public ym0 c = new fi1();
    public ym0 d = new fi1();
    public nx e = new l(0.0f);
    public nx f = new l(0.0f);
    public nx g = new l(0.0f);
    public nx h = new l(0.0f);
    public j70 i;
    public j70 j;
    public j70 k;
    public j70 l;

    public cn1() {
        int i = 0;
        this.i = new j70(i);
        this.j = new j70(i);
        this.k = new j70(i);
        this.l = new j70(i);
    }

    public static bn1 g(Context context, int i, int i2) {
        l lVar = new l(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(yb1.O), lVar);
    }

    public static bn1 h(Context context, AttributeSet attributeSet, int i, int i2) {
        l lVar = new l(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yb1.F, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(yb1.O), lVar);
    }

    public static bn1 i(TypedArray typedArray, nx nxVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            nx j = j(typedArray, 5, nxVar);
            nx j2 = j(typedArray, 8, j);
            nx j3 = j(typedArray, 9, j);
            nx j4 = j(typedArray, 7, j);
            nx j5 = j(typedArray, 6, j);
            bn1 bn1Var = new bn1();
            bn1Var.f92a = rt0.g(i2);
            bn1Var.e = j2;
            bn1Var.b = rt0.g(i3);
            bn1Var.f = j3;
            bn1Var.c = rt0.g(i4);
            bn1Var.g = j4;
            bn1Var.d = rt0.g(i5);
            bn1Var.h = j5;
            return bn1Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static nx j(TypedArray typedArray, int i, nx nxVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new l(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new of1(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return nxVar;
    }

    @Override // defpackage.an1
    public final cn1 a(float f) {
        bn1 l = l();
        l.b(f);
        return l.a();
    }

    @Override // defpackage.an1
    public final cn1 b(int[] iArr) {
        return this;
    }

    @Override // defpackage.an1
    public final cn1[] c() {
        return new cn1[]{this};
    }

    @Override // defpackage.an1
    public final cn1 d() {
        return this;
    }

    @Override // defpackage.an1
    public final cn1 e(of1 of1Var) {
        bn1 l = l();
        l.e = of1Var;
        l.f = of1Var;
        l.g = of1Var;
        l.h = of1Var;
        return l.a();
    }

    @Override // defpackage.an1
    public final boolean f() {
        return false;
    }

    public final boolean k(RectF rectF) {
        boolean z = this.l.getClass().equals(j70.class) && this.j.getClass().equals(j70.class) && this.i.getClass().equals(j70.class) && this.k.getClass().equals(j70.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && (this.b instanceof fi1) && (this.f131a instanceof fi1) && (this.c instanceof fi1) && (this.d instanceof fi1);
    }

    public final bn1 l() {
        bn1 bn1Var = new bn1();
        bn1Var.f92a = this.f131a;
        bn1Var.b = this.b;
        bn1Var.c = this.c;
        bn1Var.d = this.d;
        bn1Var.e = this.e;
        bn1Var.f = this.f;
        bn1Var.g = this.g;
        bn1Var.h = this.h;
        bn1Var.i = this.i;
        bn1Var.j = this.j;
        bn1Var.k = this.k;
        bn1Var.l = this.l;
        return bn1Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
