package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class tu implements qu {
    public final u71 g;
    public final u71 h;
    public final ThreadLocal i;
    public final AtomicBoolean j;
    public final long k;

    public tu(i8 i8Var) {
        this.i = new ThreadLocal();
        this.j = new AtomicBoolean(false);
        j70 j70Var = u60.g;
        this.k = md2.A(30);
        u71 u71Var = new u71(1, new qt(1, i8Var));
        this.g = u71Var;
        this.h = u71Var;
    }

    public tu(final i8 i8Var, final String str, int i) {
        str.getClass();
        this.i = new ThreadLocal();
        final int i2 = 0;
        this.j = new AtomicBoolean(false);
        j70 j70Var = u60.g;
        this.k = md2.A(30);
        if (i <= 0) {
            c.m("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.g = new u71(i, new af0() { // from class: ru
            @Override // defpackage.af0
            public final Object a() {
                int i3 = i2;
                String str2 = str;
                i8 i8Var2 = i8Var;
                switch (i3) {
                    case 0:
                        ti1 d = i8Var2.d(str2);
                        kk1.s(d, "PRAGMA query_only = 1");
                        return d;
                    default:
                        return i8Var2.d(str2);
                }
            }
        });
        final int i3 = 1;
        this.h = new u71(1, new af0() { // from class: ru
            @Override // defpackage.af0
            public final Object a() {
                int i32 = i3;
                String str2 = str;
                i8 i8Var2 = i8Var;
                switch (i32) {
                    case 0:
                        ti1 d = i8Var2.d(str2);
                        kk1.s(d, "PRAGMA query_only = 1");
                        return d;
                    default:
                        return i8Var2.d(str2);
                }
            }
        });
    }

    public final void a(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.h.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.g.c(sb);
        kk1.S(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.j.compareAndSet(false, true)) {
            this.g.b();
            this.h.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x011d, code lost:
    
        if (defpackage.om0.R(r8, r0, r4) == r14) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0196 A[Catch: all -> 0x01ae, TRY_LEAVE, TryCatch #9 {all -> 0x01ae, blocks: (B:17:0x0190, B:19:0x0196, B:24:0x01a0, B:21:0x01a5), top: B:16:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130 A[Catch: all -> 0x014d, TryCatch #7 {all -> 0x014d, blocks: (B:63:0x012a, B:65:0x0130, B:69:0x0149, B:70:0x0153, B:74:0x015d, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01b8, B:82:0x01bb), top: B:62:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8 A[Catch: all -> 0x014d, TryCatch #7 {all -> 0x014d, blocks: (B:63:0x012a, B:65:0x0130, B:69:0x0149, B:70:0x0153, B:74:0x015d, B:78:0x01af, B:79:0x01b6, B:80:0x01b7, B:81:0x01b8, B:82:0x01bb), top: B:62:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007e  */
    @Override // defpackage.qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(boolean r17, defpackage.pf0 r18, defpackage.ex r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.p(boolean, pf0, ex):java.lang.Object");
    }
}
