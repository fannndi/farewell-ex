package defpackage;

/* loaded from: classes.dex */
public final class p31 {
    public static int g;

    /* renamed from: a, reason: collision with root package name */
    public int f772a;
    public int b;
    public Object[] c;
    public int d;
    public o31 e;
    public float f;

    public static synchronized p31 a(int i, o31 o31Var) {
        p31 p31Var;
        synchronized (p31.class) {
            p31Var = new p31();
            if (i <= 0) {
                throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
            }
            p31Var.b = i;
            p31Var.c = new Object[i];
            p31Var.d = 0;
            p31Var.e = o31Var;
            p31Var.f = 1.0f;
            p31Var.d();
            int i2 = g;
            p31Var.f772a = i2;
            g = i2 + 1;
        }
        return p31Var;
    }

    public final synchronized o31 b() {
        o31 o31Var;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            o31Var = (o31) objArr[i];
            o31Var.g = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return o31Var;
    }

    public final synchronized void c(o31 o31Var) {
        try {
            int i = o31Var.g;
            if (i != -1) {
                if (i == this.f772a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + o31Var.g + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.c.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                Object[] objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            o31Var.g = this.f772a;
            this.c[this.d] = o31Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
