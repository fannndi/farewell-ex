package defpackage;

import android.view.View;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class iw {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final ev I;
    public final ev J;
    public final ev K;
    public final ev L;
    public final ev M;
    public final ev N;
    public final ev O;
    public final ev P;
    public final ev[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public iw T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public uo b;
    public int b0;
    public uo c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final iw[] l0;
    public boolean m;
    public final iw[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f452a = false;
    public lj0 d = null;
    public h62 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public iw() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        ev evVar = new ev(this, 2);
        this.I = evVar;
        ev evVar2 = new ev(this, 3);
        this.J = evVar2;
        ev evVar3 = new ev(this, 4);
        this.K = evVar3;
        ev evVar4 = new ev(this, 5);
        this.L = evVar4;
        ev evVar5 = new ev(this, 6);
        this.M = evVar5;
        ev evVar6 = new ev(this, 8);
        this.N = evVar6;
        ev evVar7 = new ev(this, 9);
        this.O = evVar7;
        ev evVar8 = new ev(this, 7);
        this.P = evVar8;
        this.Q = new ev[]{evVar, evVar3, evVar2, evVar4, evVar5, evVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new iw[]{null, null};
        this.m0 = new iw[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(evVar);
        arrayList.add(evVar2);
        arrayList.add(evVar3);
        arrayList.add(evVar4);
        arrayList.add(evVar6);
        arrayList.add(evVar7);
        arrayList.add(evVar8);
        arrayList.add(evVar5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(jYVJoqfHJs.TgMgZsYLaELoTm);
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, CDsMEtnUjndKau.rbzysIN, sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, ev evVar) {
        if (evVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(evVar.f);
        sb.append("'");
        if (evVar.h != Integer.MIN_VALUE || evVar.g != 0) {
            sb.append(",");
            sb.append(evVar.g);
            if (evVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(evVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        iw iwVar = this.T;
        if (iwVar != null && (iwVar instanceof jw)) {
            ((jw) iwVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ev) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ev evVar = (ev) arrayList.get(i);
            evVar.c = false;
            evVar.b = 0;
        }
    }

    public void F(fh fhVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        lj0 lj0Var = this.d;
        boolean z3 = z & lj0Var.g;
        h62 h62Var = this.e;
        boolean z4 = z2 & h62Var.g;
        int i3 = lj0Var.h.g;
        int i4 = h62Var.h.g;
        int i5 = lj0Var.i.g;
        int i6 = h62Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(dr0 dr0Var, boolean z) {
        int i;
        int i2;
        h62 h62Var;
        lj0 lj0Var;
        dr0Var.getClass();
        int n = dr0.n(this.I);
        int n2 = dr0.n(this.J);
        int n3 = dr0.n(this.K);
        int n4 = dr0.n(this.L);
        if (z && (lj0Var = this.d) != null) {
            c30 c30Var = lj0Var.h;
            if (c30Var.j) {
                c30 c30Var2 = lj0Var.i;
                if (c30Var2.j) {
                    n = c30Var.g;
                    n3 = c30Var2.g;
                }
            }
        }
        if (z && (h62Var = this.e) != null) {
            c30 c30Var3 = h62Var.h;
            if (c30Var3.j) {
                c30 c30Var4 = h62Var.i;
                if (c30Var4.j) {
                    n2 = c30Var3.g;
                    n4 = c30Var4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Y = n;
        this.Z = n2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(jw jwVar, dr0 dr0Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            kk1.k(jwVar, dr0Var, this);
            hashSet.remove(this);
            b(dr0Var, jwVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.f250a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((ev) it.next()).d.a(jwVar, dr0Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.f250a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((ev) it2.next()).d.a(jwVar, dr0Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f250a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((ev) it3.next()).d.a(jwVar, dr0Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.f250a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((ev) it4.next()).d.a(jwVar, dr0Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f250a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((ev) it5.next()).d.a(jwVar, dr0Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.g0 == r14) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [iw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.dr0 r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw.b(dr0, boolean):void");
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dr0 r30, boolean r31, boolean r32, boolean r33, boolean r34, defpackage.kp1 r35, defpackage.kp1 r36, int r37, boolean r38, defpackage.ev r39, defpackage.ev r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw.d(dr0, boolean, boolean, boolean, boolean, kp1, kp1, int, boolean, ev, ev, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, iw iwVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, iwVar, i2, 0);
                    e(4, iwVar, i2, 0);
                    i(7).a(iwVar.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, iwVar, i2, 0);
                        e(5, iwVar, i2, 0);
                        i(7).a(iwVar.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            ev i4 = i(2);
            ev i5 = i(4);
            ev i6 = i(3);
            ev i7 = i(5);
            boolean z2 = true;
            if ((i4 == null || !i4.h()) && (i5 == null || !i5.h())) {
                e(2, iwVar, 2, 0);
                e(4, iwVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(3, iwVar, 3, 0);
                e(5, iwVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(iwVar.i(7), 0);
                return;
            } else if (z) {
                i(8).a(iwVar.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(iwVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            ev i8 = i(2);
            ev i9 = iwVar.i(i2);
            ev i10 = i(4);
            i8.a(i9, 0);
            i10.a(i9, 0);
            i(8).a(i9, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            ev i11 = iwVar.i(i2);
            i(3).a(i11, 0);
            i(5).a(i11, 0);
            i(9).a(i11, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(iwVar.i(2), 0);
            i(4).a(iwVar.i(4), 0);
            i(8).a(iwVar.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(iwVar.i(3), 0);
            i(5).a(iwVar.i(5), 0);
            i(9).a(iwVar.i(i2), 0);
            return;
        }
        ev i12 = i(i);
        ev i13 = iwVar.i(i2);
        if (i12.i(i13)) {
            if (i == 6) {
                ev i14 = i(3);
                ev i15 = i(5);
                if (i14 != null) {
                    i14.j();
                }
                if (i15 != null) {
                    i15.j();
                }
            } else if (i == 3 || i == 5) {
                ev i16 = i(6);
                if (i16 != null) {
                    i16.j();
                }
                ev i17 = i(7);
                if (i17.f != i13) {
                    i17.j();
                }
                ev f = i(i).f();
                ev i18 = i(9);
                if (i18.h()) {
                    f.j();
                    i18.j();
                }
            } else if (i == 2 || i == 4) {
                ev i19 = i(7);
                if (i19.f != i13) {
                    i19.j();
                }
                ev f2 = i(i).f();
                ev i20 = i(8);
                if (i20.h()) {
                    f2.j();
                    i20.j();
                }
            }
            i12.a(i13, i3);
        }
    }

    public final void f(ev evVar, ev evVar2, int i) {
        if (evVar.d == this) {
            e(evVar.e, evVar2.d, evVar2.e, i);
        }
    }

    public final void g(dr0 dr0Var) {
        dr0Var.k(this.I);
        dr0Var.k(this.J);
        dr0Var.k(this.K);
        dr0Var.k(this.L);
        if (this.a0 > 0) {
            dr0Var.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            lj0 lj0Var = new lj0(this);
            lj0Var.h.e = 4;
            lj0Var.i.e = 5;
            lj0Var.f = 0;
            this.d = lj0Var;
        }
        if (this.e == null) {
            h62 h62Var = new h62(this);
            c30 c30Var = new c30(h62Var);
            h62Var.k = c30Var;
            h62Var.l = null;
            h62Var.h.e = 6;
            h62Var.i.e = 7;
            c30Var.e = 8;
            h62Var.f = 1;
            this.e = h62Var;
        }
    }

    public ev i(int i) {
        switch (d51.A(i)) {
            case 0:
                return null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return this.I;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return this.J;
            case 3:
                return this.K;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return this.L;
            case 5:
                return this.M;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return this.P;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(d51.z(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final iw l(int i) {
        ev evVar;
        ev evVar2;
        if (i != 0) {
            if (i == 1 && (evVar2 = (evVar = this.L).f) != null && evVar2.f == evVar) {
                return evVar2.d;
            }
            return null;
        }
        ev evVar3 = this.K;
        ev evVar4 = evVar3.f;
        if (evVar4 == null || evVar4.f != evVar3) {
            return null;
        }
        return evVar4.d;
    }

    public final iw m(int i) {
        ev evVar;
        ev evVar2;
        if (i != 0) {
            if (i == 1 && (evVar2 = (evVar = this.J).f) != null && evVar2.f == evVar) {
                return evVar2.d;
            }
            return null;
        }
        ev evVar3 = this.I;
        ev evVar4 = evVar3.f;
        if (evVar4 == null || evVar4.f != evVar3) {
            return null;
        }
        return evVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.p0;
        int i6 = iArr2[0];
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.W;
        int i13 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(bOxzFZXgEkjph.NCHaJcSiS);
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        iw iwVar = this.T;
        return (iwVar == null || !(iwVar instanceof jw)) ? this.Y : ((jw) iwVar).x0 + this.Y;
    }

    public final int s() {
        iw iwVar = this.T;
        return (iwVar == null || !(iwVar instanceof jw)) ? this.Z : ((jw) iwVar).y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            ev r5 = r4.I
            ev r5 = r5.f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            ev r4 = r4.K
            ev r4 = r4.f
            if (r4 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            ev r5 = r4.J
            ev r5 = r5.f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            ev r3 = r4.L
            ev r3 = r3.f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            ev r4 = r4.M
            ev r4 = r4.f
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L36:
            r4 = r1
        L37:
            int r5 = r5 + r4
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw.t(int):boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.h0 != null ? d51.u(new StringBuilder("id: "), this.h0, " ") : "");
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        return d51.t(sb, this.V, ")");
    }

    public final boolean u(int i, int i2) {
        ev evVar;
        ev evVar2;
        ev evVar3;
        ev evVar4;
        if (i == 0) {
            ev evVar5 = this.I;
            ev evVar6 = evVar5.f;
            if (evVar6 == null || !evVar6.c || (evVar4 = (evVar3 = this.K).f) == null || !evVar4.c) {
                return false;
            }
            return (evVar4.d() - evVar3.e()) - (evVar5.e() + evVar5.f.d()) >= i2;
        }
        ev evVar7 = this.J;
        ev evVar8 = evVar7.f;
        if (evVar8 == null || !evVar8.c || (evVar2 = (evVar = this.L).f) == null || !evVar2.c) {
            return false;
        }
        return (evVar2.d() - evVar.e()) - (evVar7.e() + evVar7.f.d()) >= i2;
    }

    public final void v(int i, int i2, int i3, int i4, iw iwVar) {
        i(i).b(iwVar.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        ev evVar;
        ev evVar2;
        int i2 = i * 2;
        ev[] evVarArr = this.Q;
        ev evVar3 = evVarArr[i2];
        ev evVar4 = evVar3.f;
        return (evVar4 == null || evVar4.f == evVar3 || (evVar2 = (evVar = evVarArr[i2 + 1]).f) == null || evVar2.f != evVar) ? false : true;
    }

    public final boolean x() {
        ev evVar = this.I;
        ev evVar2 = evVar.f;
        if (evVar2 != null && evVar2.f == evVar) {
            return true;
        }
        ev evVar3 = this.K;
        ev evVar4 = evVar3.f;
        return evVar4 != null && evVar4.f == evVar3;
    }

    public final boolean y() {
        ev evVar = this.J;
        ev evVar2 = evVar.f;
        if (evVar2 != null && evVar2.f == evVar) {
            return true;
        }
        ev evVar3 = this.L;
        ev evVar4 = evVar3.f;
        return evVar4 != null && evVar4.f == evVar3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
