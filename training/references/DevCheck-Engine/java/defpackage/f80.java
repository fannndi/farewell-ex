package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f80 {

    /* renamed from: a, reason: collision with root package name */
    public int f269a = 1;
    public final mx0 b;
    public mx0 c;
    public mx0 d;
    public int e;
    public int f;

    public f80(mx0 mx0Var) {
        this.b = mx0Var;
        this.c = mx0Var;
    }

    public final void a() {
        this.f269a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        kx0 b = this.c.b.b();
        int a2 = b.a(6);
        return !(a2 == 0 || ((ByteBuffer) b.j).get(a2 + b.g) == 0) || this.e == 65039;
    }
}
