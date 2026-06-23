package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class fd1 extends lv1 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(gd1 gd1Var, String str) {
        super(str);
        this.f = gd1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(String str, af0 af0Var) {
        super(str);
        this.f = af0Var;
    }

    @Override // defpackage.lv1
    public final long a() {
        switch (this.e) {
            case 0:
                gd1 gd1Var = (gd1) this.f;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - gd1Var.f334a) + 1;
                Iterator it = gd1Var.d.iterator();
                it.getClass();
                ed1 ed1Var = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                ed1 ed1Var2 = null;
                ed1 ed1Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    ed1 ed1Var4 = (ed1) it.next();
                    ed1Var4.getClass();
                    synchronized (ed1Var4) {
                        if (gd1Var.a(ed1Var4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = ed1Var4.q;
                            if (j3 < j) {
                                j = j3;
                                ed1Var2 = ed1Var4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                ed1Var3 = ed1Var4;
                            }
                        }
                    }
                }
                if (ed1Var2 != null) {
                    ed1Var = ed1Var2;
                } else if (i > 5) {
                    j = j2;
                    ed1Var = ed1Var3;
                } else {
                    j = -1;
                }
                if (ed1Var == null) {
                    if (ed1Var3 != null) {
                        return (j2 + gd1Var.f334a) - nanoTime;
                    }
                    if (i2 > 0) {
                        return gd1Var.f334a;
                    }
                    return -1L;
                }
                synchronized (ed1Var) {
                    if (ed1Var.p.isEmpty() && ed1Var.q == j) {
                        ed1Var.j = true;
                        gd1Var.d.remove(ed1Var);
                        rd2.b(ed1Var.e);
                        if (!gd1Var.d.isEmpty()) {
                            return 0L;
                        }
                        iw1 iw1Var = gd1Var.b;
                        synchronized (iw1Var.f453a) {
                            if (iw1Var.a()) {
                                iw1Var.f453a.c(iw1Var);
                            }
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((af0) this.f).a();
                return -1L;
        }
    }
}
