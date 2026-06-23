package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jw extends iw {
    public int A0;
    public to[] B0;
    public to[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final ue L0;
    public ArrayList q0 = new ArrayList();
    public final fh r0 = new fh(this);
    public final b30 s0;
    public int t0;
    public kv u0;
    public boolean v0;
    public final dr0 w0;
    public int x0;
    public int y0;
    public int z0;

    public jw() {
        b30 b30Var = new b30();
        b30Var.b = true;
        b30Var.c = true;
        b30Var.e = new ArrayList();
        new ArrayList();
        b30Var.f = null;
        b30Var.g = new ue();
        b30Var.h = new ArrayList();
        b30Var.f64a = this;
        b30Var.d = this;
        this.s0 = b30Var;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new dr0();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new to[4];
        this.C0 = new to[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new ue();
    }

    public static void V(iw iwVar, kv kvVar, ue ueVar) {
        int i;
        int i2;
        if (kvVar == null) {
            return;
        }
        int i3 = iwVar.g0;
        int[] iArr = iwVar.t;
        if (i3 == 8 || (iwVar instanceof sh0) || (iwVar instanceof kd)) {
            ueVar.e = 0;
            ueVar.f = 0;
            return;
        }
        int[] iArr2 = iwVar.p0;
        ueVar.f1037a = iArr2[0];
        ueVar.b = iArr2[1];
        ueVar.c = iwVar.q();
        ueVar.d = iwVar.k();
        ueVar.i = false;
        ueVar.j = 0;
        boolean z = ueVar.f1037a == 3;
        boolean z2 = ueVar.b == 3;
        boolean z3 = z && iwVar.W > 0.0f;
        boolean z4 = z2 && iwVar.W > 0.0f;
        if (z && iwVar.t(0) && iwVar.r == 0 && !z3) {
            ueVar.f1037a = 2;
            if (z2 && iwVar.s == 0) {
                ueVar.f1037a = 1;
            }
            z = false;
        }
        if (z2 && iwVar.t(1) && iwVar.s == 0 && !z4) {
            ueVar.b = 2;
            if (z && iwVar.r == 0) {
                ueVar.b = 1;
            }
            z2 = false;
        }
        if (iwVar.A()) {
            ueVar.f1037a = 1;
            z = false;
        }
        if (iwVar.B()) {
            ueVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                ueVar.f1037a = 1;
            } else if (!z2) {
                if (ueVar.b == 1) {
                    i2 = ueVar.d;
                } else {
                    ueVar.f1037a = 2;
                    kvVar.b(iwVar, ueVar);
                    i2 = ueVar.f;
                }
                ueVar.f1037a = 1;
                ueVar.c = (int) (iwVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                ueVar.b = 1;
            } else if (!z) {
                if (ueVar.f1037a == 1) {
                    i = ueVar.c;
                } else {
                    ueVar.b = 2;
                    kvVar.b(iwVar, ueVar);
                    i = ueVar.e;
                }
                ueVar.b = 1;
                int i4 = iwVar.X;
                float f = iwVar.W;
                if (i4 == -1) {
                    ueVar.d = (int) (i / f);
                } else {
                    ueVar.d = (int) (f * i);
                }
            }
        }
        kvVar.b(iwVar, ueVar);
        iwVar.O(ueVar.e);
        iwVar.L(ueVar.f);
        iwVar.E = ueVar.h;
        iwVar.I(ueVar.g);
        ueVar.j = 0;
    }

    @Override // defpackage.iw
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.iw
    public final void F(fh fhVar) {
        super.F(fhVar);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((iw) this.q0.get(i)).F(fhVar);
        }
    }

    @Override // defpackage.iw
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((iw) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(iw iwVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            to[] toVarArr = this.C0;
            if (i2 >= toVarArr.length) {
                this.C0 = (to[]) Arrays.copyOf(toVarArr, toVarArr.length * 2);
            }
            to[] toVarArr2 = this.C0;
            int i3 = this.z0;
            toVarArr2[i3] = new to(iwVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            to[] toVarArr3 = this.B0;
            if (i4 >= toVarArr3.length) {
                this.B0 = (to[]) Arrays.copyOf(toVarArr3, toVarArr3.length * 2);
            }
            to[] toVarArr4 = this.B0;
            int i5 = this.A0;
            toVarArr4[i5] = new to(iwVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(dr0 dr0Var) {
        jw jwVar;
        dr0 dr0Var2;
        boolean W = W(64);
        b(dr0Var, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            iw iwVar = (iw) this.q0.get(i);
            boolean[] zArr = iwVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (iwVar instanceof kd) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                iw iwVar2 = (iw) this.q0.get(i2);
                if (iwVar2 instanceof kd) {
                    kd kdVar = (kd) iwVar2;
                    for (int i3 = 0; i3 < kdVar.r0; i3++) {
                        iw iwVar3 = kdVar.q0[i3];
                        if (kdVar.t0 || iwVar3.c()) {
                            int i4 = kdVar.s0;
                            if (i4 == 0 || i4 == 1) {
                                iwVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                iwVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            iw iwVar4 = (iw) this.q0.get(i5);
            iwVar4.getClass();
            boolean z2 = iwVar4 instanceof sb0;
            if (z2 || (iwVar4 instanceof sh0)) {
                if (z2) {
                    hashSet.add(iwVar4);
                } else {
                    iwVar4.b(dr0Var, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb0 sb0Var = (sb0) ((iw) it.next());
                for (int i6 = 0; i6 < sb0Var.r0; i6++) {
                    if (hashSet.contains(sb0Var.q0[i6])) {
                        sb0Var.b(dr0Var, W);
                        hashSet.remove(sb0Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((iw) it2.next()).b(dr0Var, W);
                }
                hashSet.clear();
            }
        }
        if (dr0.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                iw iwVar5 = (iw) this.q0.get(i7);
                iwVar5.getClass();
                if (!(iwVar5 instanceof sb0) && !(iwVar5 instanceof sh0)) {
                    hashSet2.add(iwVar5);
                }
            }
            jwVar = this;
            dr0Var2 = dr0Var;
            jwVar.a(this, dr0Var2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                iw iwVar6 = (iw) it3.next();
                kk1.k(jwVar, dr0Var2, iwVar6);
                iwVar6.b(dr0Var2, W);
            }
        } else {
            jwVar = this;
            dr0Var2 = dr0Var;
            for (int i8 = 0; i8 < size; i8++) {
                iw iwVar7 = (iw) jwVar.q0.get(i8);
                if (iwVar7 instanceof jw) {
                    int[] iArr = iwVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        iwVar7.M(1);
                    }
                    if (i10 == 2) {
                        iwVar7.N(1);
                    }
                    iwVar7.b(dr0Var2, W);
                    if (i9 == 2) {
                        iwVar7.M(i9);
                    }
                    if (i10 == 2) {
                        iwVar7.N(i10);
                    }
                } else {
                    kk1.k(jwVar, dr0Var2, iwVar7);
                    if (!(iwVar7 instanceof sb0) && !(iwVar7 instanceof sh0)) {
                        iwVar7.b(dr0Var2, W);
                    }
                }
            }
        }
        if (jwVar.z0 > 0) {
            kk1.b(jwVar, dr0Var2, null, 0);
        }
        if (jwVar.A0 > 0) {
            kk1.b(jwVar, dr0Var2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        b30 b30Var = this.s0;
        ArrayList arrayList = b30Var.e;
        jw jwVar = b30Var.f64a;
        boolean z3 = false;
        int j = jwVar.j(0);
        int j2 = jwVar.j(1);
        int r = jwVar.r();
        int s = jwVar.s();
        if (z && (j == 2 || j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                o92 o92Var = (o92) obj;
                if (o92Var.f == i && !o92Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    jwVar.M(1);
                    jwVar.O(b30Var.d(jwVar, 0));
                    jwVar.d.e.d(jwVar.q());
                }
            } else if (z && j2 == 2) {
                jwVar.N(1);
                jwVar.L(b30Var.d(jwVar, 1));
                jwVar.e.e.d(jwVar.k());
            }
        }
        int[] iArr = jwVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int q = jwVar.q() + r;
                jwVar.d.i.d(q);
                jwVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int k = jwVar.k() + s;
                jwVar.e.i.d(k);
                jwVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        b30Var.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            o92 o92Var2 = (o92) obj2;
            if (o92Var2.f == i && (o92Var2.b != jwVar || o92Var2.g)) {
                o92Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            o92 o92Var3 = (o92) obj3;
            if (o92Var3.f == i && (z2 || o92Var3.b != jwVar)) {
                if (!o92Var3.h.j) {
                    break;
                }
                if (!o92Var3.i.j) {
                    break;
                }
                if (!(o92Var3 instanceof uo) && !o92Var3.e.j) {
                    break;
                }
            }
        }
        jwVar.M(j);
        jwVar.N(j2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0818 A[LOOP:14: B:278:0x0816->B:279:0x0818, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0637  */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.iw
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((iw) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
