package defpackage;

/* loaded from: classes.dex */
public class f81 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f270a;
    public int b;

    public f81() {
        this.f270a = new Object[rt0.t];
    }

    public f81(int i) {
        if (i > 0) {
            this.f270a = new Object[i];
        } else {
            c.m("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f270a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(q9 q9Var) {
        int i = this.b;
        Object[] objArr = this.f270a;
        if (i < objArr.length) {
            objArr[i] = q9Var;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f270a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                c.n("Already in the pool!");
                return false;
            }
            i2++;
        }
    }
}
