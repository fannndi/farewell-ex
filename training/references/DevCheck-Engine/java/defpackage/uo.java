package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uo extends o92 {
    public final ArrayList k;
    public int l;

    public uo(iw iwVar, int i) {
        super(iwVar);
        iw iwVar2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        iw iwVar3 = this.b;
        iw m = iwVar3.m(i);
        while (true) {
            iwVar2 = iwVar3;
            iwVar3 = m;
            if (iwVar3 == null) {
                break;
            } else {
                m = iwVar3.m(this.f);
            }
        }
        this.b = iwVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? iwVar2.d : i2 == 1 ? iwVar2.e : null);
        iw l = iwVar2.l(this.f);
        while (l != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? l.d : i3 == 1 ? l.e : null);
            l = l.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            o92 o92Var = (o92) obj;
            int i5 = this.f;
            if (i5 == 0) {
                o92Var.b.b = this;
            } else if (i5 == 1) {
                o92Var.b.c = this;
            }
        }
        if (this.f == 0 && ((jw) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((o92) d51.m(arrayList, 1)).b;
        }
        int i6 = this.f;
        iw iwVar4 = this.b;
        this.l = i6 == 0 ? iwVar4.i0 : iwVar4.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.w20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.w20 r28) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo.a(w20):void");
    }

    @Override // defpackage.o92
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o92) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        iw iwVar = ((o92) arrayList.get(0)).b;
        iw iwVar2 = ((o92) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        c30 c30Var = this.i;
        c30 c30Var2 = this.h;
        if (i2 == 0) {
            ev evVar = iwVar.I;
            ev evVar2 = iwVar2.K;
            c30 i3 = o92.i(evVar, 0);
            int e = evVar.e();
            iw m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                o92.b(c30Var2, i3, e);
            }
            c30 i4 = o92.i(evVar2, 0);
            int e2 = evVar2.e();
            iw n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                o92.b(c30Var, i4, -e2);
            }
        } else {
            ev evVar3 = iwVar.J;
            ev evVar4 = iwVar2.L;
            c30 i5 = o92.i(evVar3, 1);
            int e3 = evVar3.e();
            iw m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                o92.b(c30Var2, i5, e3);
            }
            c30 i6 = o92.i(evVar4, 1);
            int e4 = evVar4.e();
            iw n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                o92.b(c30Var, i6, -e4);
            }
        }
        c30Var2.f106a = this;
        c30Var.f106a = this;
    }

    @Override // defpackage.o92
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o92) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.o92
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o92) obj).f();
        }
    }

    @Override // defpackage.o92
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((o92) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.o92
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o92) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final iw m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            iw iwVar = ((o92) arrayList.get(i)).b;
            if (iwVar.g0 != 8) {
                return iwVar;
            }
            i++;
        }
    }

    public final iw n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            iw iwVar = ((o92) arrayList.get(size)).b;
            if (iwVar.g0 != 8) {
                return iwVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((o92) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
