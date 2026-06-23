package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u52 extends v52 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1021a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public u52() {
        this.f1021a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u52(u52 u52Var, p9 p9Var) {
        s52 s52Var;
        this.f1021a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = u52Var.c;
        this.d = u52Var.d;
        this.e = u52Var.e;
        this.f = u52Var.f;
        this.g = u52Var.g;
        this.h = u52Var.h;
        this.i = u52Var.i;
        String str = u52Var.k;
        this.k = str;
        if (str != null) {
            p9Var.put(str, this);
        }
        matrix.set(u52Var.j);
        ArrayList arrayList = u52Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof u52) {
                this.b.add(new u52((u52) obj, p9Var));
            } else {
                if (obj instanceof t52) {
                    t52 t52Var = (t52) obj;
                    t52 t52Var2 = new t52(t52Var);
                    t52Var2.e = 0.0f;
                    t52Var2.g = 1.0f;
                    t52Var2.h = 1.0f;
                    t52Var2.i = 0.0f;
                    t52Var2.j = 1.0f;
                    t52Var2.k = 0.0f;
                    t52Var2.l = Paint.Cap.BUTT;
                    t52Var2.m = Paint.Join.MITER;
                    t52Var2.n = 4.0f;
                    t52Var2.d = t52Var.d;
                    t52Var2.e = t52Var.e;
                    t52Var2.g = t52Var.g;
                    t52Var2.f = t52Var.f;
                    t52Var2.c = t52Var.c;
                    t52Var2.h = t52Var.h;
                    t52Var2.i = t52Var.i;
                    t52Var2.j = t52Var.j;
                    t52Var2.k = t52Var.k;
                    t52Var2.l = t52Var.l;
                    t52Var2.m = t52Var.m;
                    t52Var2.n = t52Var.n;
                    s52Var = t52Var2;
                } else {
                    if (!(obj instanceof s52)) {
                        c.n("Unknown object in the tree!");
                        throw null;
                    }
                    s52Var = new s52((s52) obj);
                }
                this.b.add(s52Var);
                Object obj2 = s52Var.b;
                if (obj2 != null) {
                    p9Var.put(obj2, s52Var);
                }
            }
        }
    }

    @Override // defpackage.v52
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((v52) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.v52
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((v52) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }
}
