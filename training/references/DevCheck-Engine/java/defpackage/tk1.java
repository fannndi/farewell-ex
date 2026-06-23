package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class tk1 extends he1 {

    /* renamed from: a, reason: collision with root package name */
    public cu f992a;
    public final ViewPager2 b;
    public final e82 c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final sk1 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public tk1(ViewPager2 viewPager2) {
        this.b = viewPager2;
        e82 e82Var = viewPager2.p;
        this.c = e82Var;
        this.d = (LinearLayoutManager) e82Var.getLayoutManager();
        this.g = new sk1();
        d();
    }

    @Override // defpackage.he1
    public final void a(RecyclerView recyclerView, int i) {
        cu cuVar;
        cu cuVar2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.P0();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        sk1 sk1Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            e();
            if (!this.k) {
                int i4 = sk1Var.f942a;
                if (i4 != -1 && (cuVar2 = this.f992a) != null) {
                    cuVar2.b(i4, 0.0f, 0);
                }
            } else if (sk1Var.c == 0) {
                int i5 = this.h;
                int i6 = sk1Var.f942a;
                if (i5 != i6 && (cuVar = this.f992a) != null) {
                    cuVar.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (sk1Var.c == 0) {
                int i7 = this.i;
                int i8 = sk1Var.f942a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    cu cuVar3 = this.f992a;
                    if (cuVar3 != null) {
                        cuVar3.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ((r7 < 0) == (r5.b.m.b.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // defpackage.he1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.k = r6
            r5.e()
            boolean r0 = r5.j
            r1 = -1
            sk1 r2 = r5.g
            r3 = 0
            if (r0 == 0) goto L42
            r5.j = r3
            if (r8 > 0) goto L2a
            if (r8 != 0) goto L32
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.b
            z72 r8 = r8.m
            androidx.recyclerview.widget.RecyclerView r8 = r8.b
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L27
            r8 = r6
            goto L28
        L27:
            r8 = r3
        L28:
            if (r7 != r8) goto L32
        L2a:
            int r7 = r2.c
            if (r7 == 0) goto L32
            int r7 = r2.f942a
            int r7 = r7 + r6
            goto L34
        L32:
            int r7 = r2.f942a
        L34:
            r5.i = r7
            int r8 = r5.h
            if (r8 == r7) goto L52
            cu r8 = r5.f992a
            if (r8 == 0) goto L52
            r8.c(r7)
            goto L52
        L42:
            int r7 = r5.e
            if (r7 != 0) goto L52
            int r7 = r2.f942a
            if (r7 != r1) goto L4b
            r7 = r3
        L4b:
            cu r8 = r5.f992a
            if (r8 == 0) goto L52
            r8.c(r7)
        L52:
            int r7 = r2.f942a
            if (r7 != r1) goto L57
            r7 = r3
        L57:
            float r8 = r2.b
            int r0 = r2.c
            cu r4 = r5.f992a
            if (r4 == 0) goto L62
            r4.b(r7, r8, r0)
        L62:
            int r7 = r2.f942a
            int r8 = r5.i
            if (r7 == r8) goto L6a
            if (r8 != r1) goto L78
        L6a:
            int r7 = r2.c
            if (r7 != 0) goto L78
            int r7 = r5.f
            if (r7 == r6) goto L78
            r5.c(r3)
            r5.d()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk1.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        cu cuVar = this.f992a;
        if (cuVar != null) {
            cuVar.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = 0;
        sk1 sk1Var = this.g;
        sk1Var.f942a = -1;
        sk1Var.b = 0.0f;
        sk1Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        r12 = r0.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        if (r3 >= r12) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        if (defpackage.d4.a(r0.u(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        defpackage.c.n("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
    
        r12 = java.util.Locale.US;
        defpackage.c.n(defpackage.d51.q(com.imn.iivisu.ltkT.CDsMEtnUjndKau.Widh, r2.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        if (r4[r12 - 1][1] >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0136, code lost:
    
        if (r0.v() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk1.e():void");
    }
}
