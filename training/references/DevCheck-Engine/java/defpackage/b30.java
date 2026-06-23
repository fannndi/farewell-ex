package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b30 {

    /* renamed from: a, reason: collision with root package name */
    public jw f64a;
    public boolean b;
    public boolean c;
    public jw d;
    public ArrayList e;
    public kv f;
    public ue g;
    public ArrayList h;

    public final void a(c30 c30Var, int i, ArrayList arrayList, ni1 ni1Var) {
        o92 o92Var = c30Var.d;
        ni1 ni1Var2 = o92Var.c;
        c30 c30Var2 = o92Var.i;
        c30 c30Var3 = o92Var.h;
        if (ni1Var2 == null) {
            jw jwVar = this.f64a;
            if (o92Var == jwVar.d || o92Var == jwVar.e) {
                return;
            }
            if (ni1Var == null) {
                ni1Var = new ni1();
                ni1Var.f684a = null;
                ni1Var.b = new ArrayList();
                ni1Var.f684a = o92Var;
                arrayList.add(ni1Var);
            }
            o92Var.c = ni1Var;
            ni1Var.b.add(o92Var);
            ArrayList arrayList2 = c30Var3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                w20 w20Var = (w20) obj;
                if (w20Var instanceof c30) {
                    a((c30) w20Var, i, arrayList, ni1Var);
                }
            }
            ArrayList arrayList3 = c30Var2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                w20 w20Var2 = (w20) obj2;
                if (w20Var2 instanceof c30) {
                    a((c30) w20Var2, i, arrayList, ni1Var);
                }
            }
            if (i == 1 && (o92Var instanceof h62)) {
                ArrayList arrayList4 = ((h62) o92Var).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    w20 w20Var3 = (w20) obj3;
                    if (w20Var3 instanceof c30) {
                        a((c30) w20Var3, i, arrayList, ni1Var);
                    }
                }
            }
            ArrayList arrayList5 = c30Var3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((c30) obj4, i, arrayList, ni1Var);
            }
            ArrayList arrayList6 = c30Var2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((c30) obj5, i, arrayList, ni1Var);
            }
            if (i == 1 && (o92Var instanceof h62)) {
                ArrayList arrayList7 = ((h62) o92Var).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((c30) obj6, i, arrayList, ni1Var);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0274, code lost:
    
        r6 = 1;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0277, code lost:
    
        f(r11, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029a, code lost:
    
        r7 = r10;
        r0 = r13;
        r10 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e8, code lost:
    
        if (r15 != 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ea, code lost:
    
        if (r6 != r0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ec, code lost:
    
        f(r0, 0, r0, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f5, code lost:
    
        r11 = r12.k();
        f(1, (int) ((r11 * r12.W) + 0.5f), 1, r11, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012c, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012f, code lost:
    
        if (r15 != 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0131, code lost:
    
        f(r8, 0, r6, 0, r12);
        r12.d.e.m = r12.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r15 != 2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
    
        r0 = r2[r16];
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
    
        if (r0 == 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014c, code lost:
    
        if (r0 != 4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x014f, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0152, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0154, code lost:
    
        f(1, (int) ((r4 * r25.q()) + 0.5f), r6, r12.k(), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0182, code lost:
    
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018a, code lost:
    
        if (r7[r16].f == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0190, code lost:
    
        if (r7[1].f != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:
    
        f(r8, 0, r10, 0, r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b4, code lost:
    
        r8 = r0;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r13 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r13 != 3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r6 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
    
        r8 = r0;
        r0 = 3;
        r10 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b8, code lost:
    
        if (r10 != r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ba, code lost:
    
        if (r13 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
    
        if (r13 != r6) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bf, code lost:
    
        r9 = r0;
        r7 = r10;
        r0 = r13;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        r8 = r6;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029f, code lost:
    
        if (r0 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a1, code lost:
    
        if (r7 != r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a3, code lost:
    
        if (r15 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
    
        if (r1 != r6) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a9, code lost:
    
        if (r1 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ab, code lost:
    
        if (r15 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02af, code lost:
    
        if (r2[r16] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02b3, code lost:
    
        if (r2[r6] != r8) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b5, code lost:
    
        f(r8, (int) ((r4 * r25.q()) + 0.5f), r8, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e8, code lost:
    
        f(r10, 0, r10, 0, r12);
        r12.d.e.m = r12.q();
        r12.e.e.m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:
    
        if (r1 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        if (r13 != r8) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        f(r8, 0, r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d3, code lost:
    
        r9 = r12.q();
        r0 = r12.W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        if (r12.X != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01de, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        f(r6, r9, r6, (int) ((r9 * r0) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0208, code lost:
    
        if (r1 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020a, code lost:
    
        f(r13, 0, r8, 0, r12);
        r12.e.e.m = r12.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021f, code lost:
    
        r11 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r1 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0224, code lost:
    
        r7 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r7 == r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        if (r7 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = r8;
        r7 = r10;
        r10 = r11;
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        f(r8, r12.q(), r6, (int) ((r14 * r25.k()) + 0.5f), r12);
        r12.d.e.d(r12.q());
        r12.e.e.d(r12.k());
        r12.f452a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r0 = r8;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        if (r7[2].f == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        if (r7[3].f != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0272, code lost:
    
        r7 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.jw r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b30.b(jw):void");
    }

    public final void c() {
        jw jwVar = this.f64a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        jw jwVar2 = this.d;
        jwVar2.d.f();
        jwVar2.e.f();
        arrayList2.add(jwVar2.d);
        arrayList2.add(jwVar2.e);
        ArrayList arrayList3 = jwVar2.q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            iw iwVar = (iw) obj;
            if (iwVar instanceof sh0) {
                th0 th0Var = new th0(iwVar);
                iwVar.d.f();
                iwVar.e.f();
                th0Var.f = ((sh0) iwVar).u0;
                arrayList2.add(th0Var);
            } else {
                if (iwVar.x()) {
                    if (iwVar.b == null) {
                        iwVar.b = new uo(iwVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(iwVar.b);
                } else {
                    arrayList2.add(iwVar.d);
                }
                if (iwVar.y()) {
                    if (iwVar.c == null) {
                        iwVar.c = new uo(iwVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(iwVar.c);
                } else {
                    arrayList2.add(iwVar.e);
                }
                if (iwVar instanceof zi0) {
                    arrayList2.add(new yi0(iwVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((o92) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            o92 o92Var = (o92) obj3;
            if (o92Var.b != jwVar2) {
                o92Var.d();
            }
        }
        arrayList.clear();
        e(jwVar.d, 0, arrayList);
        e(jwVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(jw jwVar, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        jw jwVar2 = jwVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            o92 o92Var = ((ni1) arrayList2.get(i3)).f684a;
            if (!(o92Var instanceof uo) ? !(i != 0 ? (o92Var instanceof h62) : (o92Var instanceof lj0)) : ((uo) o92Var).f != i) {
                c30 c30Var = (i == 0 ? jwVar2.d : jwVar2.e).h;
                c30 c30Var2 = (i == 0 ? jwVar2.d : jwVar2.e).i;
                c30 c30Var3 = o92Var.h;
                c30 c30Var4 = o92Var.i;
                boolean contains = c30Var3.l.contains(c30Var);
                boolean contains2 = c30Var4.l.contains(c30Var2);
                long j3 = o92Var.j();
                if (contains && contains2) {
                    long b = ni1.b(c30Var3, j);
                    arrayList = arrayList2;
                    long a2 = ni1.a(c30Var4, j);
                    long j4 = b - j3;
                    int i4 = c30Var4.f;
                    i2 = i3;
                    if (j4 >= (-i4)) {
                        j4 += i4;
                    }
                    long j5 = c30Var3.f;
                    long j6 = ((-a2) - j3) - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    iw iwVar = o92Var.b;
                    if (i == 0) {
                        f = iwVar.d0;
                    } else if (i == 1) {
                        f = iwVar.e0;
                    } else {
                        iwVar.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j4 / (1.0f - f)) + (j6 / f)) : 0L;
                    max = (c30Var3.f + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - c30Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    max = contains ? Math.max(ni1.b(c30Var3, c30Var3.f), c30Var3.f + j3) : contains2 ? Math.max(-ni1.a(c30Var4, c30Var4.f), (-c30Var4.f) + j3) : (o92Var.j() + c30Var3.f) - c30Var4.f;
                }
            } else {
                arrayList = arrayList2;
                max = j;
                i2 = i3;
            }
            j2 = Math.max(j2, max);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            jwVar2 = jwVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void e(o92 o92Var, int i, ArrayList arrayList) {
        c30 c30Var = o92Var.h;
        c30 c30Var2 = o92Var.i;
        ArrayList arrayList2 = c30Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            w20 w20Var = (w20) obj;
            if (w20Var instanceof c30) {
                a((c30) w20Var, i, arrayList, null);
            } else if (w20Var instanceof o92) {
                a(((o92) w20Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = c30Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            w20 w20Var2 = (w20) obj2;
            if (w20Var2 instanceof c30) {
                a((c30) w20Var2, i, arrayList, null);
            } else if (w20Var2 instanceof o92) {
                a(((o92) w20Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((h62) o92Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                w20 w20Var3 = (w20) obj3;
                if (w20Var3 instanceof c30) {
                    a((c30) w20Var3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, iw iwVar) {
        ue ueVar = this.g;
        ueVar.f1037a = i;
        ueVar.b = i3;
        ueVar.c = i2;
        ueVar.d = i4;
        this.f.b(iwVar, ueVar);
        iwVar.O(ueVar.e);
        iwVar.L(ueVar.f);
        iwVar.E = ueVar.h;
        iwVar.I(ueVar.g);
    }

    public final void g() {
        se seVar;
        b30 b30Var = this;
        ArrayList arrayList = b30Var.f64a.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iw iwVar = (iw) arrayList.get(i);
            if (!iwVar.f452a) {
                int[] iArr = iwVar.p0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iwVar.r;
                int i6 = iwVar.s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                q40 q40Var = iwVar.d.e;
                boolean z3 = q40Var.j;
                q40 q40Var2 = iwVar.e.e;
                boolean z4 = q40Var2.j;
                boolean z5 = z;
                if (z3 && z4) {
                    b30Var.f(1, q40Var.g, 1, q40Var2.g, iwVar);
                    iwVar.f452a = true;
                } else if (z3 && z2) {
                    f(1, q40Var.g, 2, q40Var2.g, iwVar);
                    h62 h62Var = iwVar.e;
                    if (i4 == 3) {
                        h62Var.e.m = iwVar.k();
                    } else {
                        h62Var.e.d(iwVar.k());
                        iwVar.f452a = true;
                    }
                } else if (z4 && z5) {
                    f(2, q40Var.g, 1, q40Var2.g, iwVar);
                    lj0 lj0Var = iwVar.d;
                    if (i3 == 3) {
                        lj0Var.e.m = iwVar.q();
                    } else {
                        lj0Var.e.d(iwVar.q());
                        iwVar.f452a = true;
                    }
                }
                if (iwVar.f452a && (seVar = iwVar.e.l) != null) {
                    seVar.d(iwVar.a0);
                }
                b30Var = this;
            }
            i = i2;
        }
    }
}
