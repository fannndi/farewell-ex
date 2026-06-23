package defpackage;

/* loaded from: classes.dex */
public final class qb0 {

    /* renamed from: a, reason: collision with root package name */
    public int f831a;
    public ev d;
    public ev e;
    public ev f;
    public ev g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ sb0 r;
    public iw b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public qb0(sb0 sb0Var, int i, ev evVar, ev evVar2, ev evVar3, ev evVar4, int i2) {
        this.r = sb0Var;
        this.f831a = i;
        this.d = evVar;
        this.e = evVar2;
        this.f = evVar3;
        this.g = evVar4;
        this.h = sb0Var.w0;
        this.i = sb0Var.s0;
        this.j = sb0Var.x0;
        this.k = sb0Var.t0;
        this.q = i2;
    }

    public final void a(iw iwVar) {
        int i = this.f831a;
        int i2 = this.q;
        sb0 sb0Var = this.r;
        if (i == 0) {
            int U = sb0Var.U(iwVar, i2);
            if (iwVar.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            this.l = U + (iwVar.g0 != 8 ? sb0Var.P0 : 0) + this.l;
            int T = sb0Var.T(iwVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = iwVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = sb0Var.U(iwVar, i2);
            int T2 = sb0Var.T(iwVar, this.q);
            if (iwVar.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            this.m = T2 + (iwVar.g0 != 8 ? sb0Var.Q0 : 0) + this.m;
            if (this.b == null || this.c < U2) {
                this.b = iwVar;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb0.b(int, boolean, boolean):void");
    }

    public final int c() {
        int i = this.f831a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.Q0 : i2;
    }

    public final int d() {
        int i = this.f831a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.P0 : i2;
    }

    public final void e(int i) {
        sb0 sb0Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            sb0Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= sb0Var.b1) {
                break;
            }
            iw iwVar = sb0Var.a1[i2];
            if (this.f831a == 0) {
                if (iwVar != null) {
                    int[] iArr = iwVar.p0;
                    if (iArr[0] == 3 && iwVar.r == 0) {
                        sb0Var.V(1, i5, iArr[1], iwVar.k(), iwVar);
                    }
                }
            } else if (iwVar != null) {
                int[] iArr2 = iwVar.p0;
                if (iArr2[1] == 3 && iwVar.s == 0) {
                    int i7 = i5;
                    sb0Var.V(iArr2[0], iwVar.q(), 1, i7, iwVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= sb0Var.b1) {
                return;
            }
            iw iwVar2 = sb0Var.a1[i10];
            if (this.f831a == 0) {
                int q = iwVar2.q();
                int i11 = sb0Var.P0;
                if (iwVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = q + i11 + this.l;
                int T = sb0Var.T(iwVar2, this.q);
                if (this.b == null || this.c < T) {
                    this.b = iwVar2;
                    this.c = T;
                    this.m = T;
                }
            } else {
                int U = sb0Var.U(iwVar2, this.q);
                int T2 = sb0Var.T(iwVar2, this.q);
                int i12 = sb0Var.Q0;
                if (iwVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = T2 + i12 + this.m;
                if (this.b == null || this.c < U) {
                    this.b = iwVar2;
                    this.c = U;
                    this.l = U;
                }
            }
        }
    }

    public final void f(int i, ev evVar, ev evVar2, ev evVar3, ev evVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f831a = i;
        this.d = evVar;
        this.e = evVar2;
        this.f = evVar3;
        this.g = evVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
