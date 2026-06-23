package defpackage;

import android.util.SparseArray;
import android.util.StateSet;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class eu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public eu(int i) {
        this.f249a = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                break;
            default:
                this.f = "";
                this.g = "";
                this.b = -1;
                this.c = zr.T("");
                break;
        }
    }

    public eu(cn1 cn1Var) {
        this.f249a = 2;
        j();
        b(StateSet.WILD_CARD, cn1Var);
    }

    public eu(du duVar) {
        this.f249a = 0;
        this.c = new ArrayList();
        this.g = new IdentityHashMap();
        this.d = new ArrayList();
        this.h = new h();
        this.e = duVar;
        th2 th2Var = new th2();
        th2Var.h = new SparseArray();
        th2Var.g = 0;
        this.f = th2Var;
        this.b = 1;
        this.i = new h70(23, false);
    }

    public static ArrayList l(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int f0 = as1.f0(str, '&', i, 4);
            if (f0 == -1) {
                f0 = str.length();
            }
            int f02 = as1.f0(str, '=', i, 4);
            if (f02 == -1 || f02 > f0) {
                arrayList.add(str.substring(i, f0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, f02));
                arrayList.add(str.substring(f02 + 1, f0));
            }
            i = f0 + 1;
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.getClass();
        arrayList.add(xc1.g(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = (ArrayList) this.d;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? xc1.g(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    public void b(int[] iArr, cn1 cn1Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.e = cn1Var;
        }
        int[][] iArr2 = (int[][]) this.f;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f = iArr3;
            cn1[] cn1VarArr = new cn1[i2];
            System.arraycopy((cn1[]) this.c, 0, cn1VarArr, 0, i);
            this.c = cn1VarArr;
        }
        int[][] iArr4 = (int[][]) this.f;
        int i3 = this.b;
        iArr4[i3] = iArr;
        ((cn1[]) this.c)[i3] = cn1Var;
        this.b = i3 + 1;
    }

    public ok0 c() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str == null) {
            c.n("scheme == null");
            return null;
        }
        String D = xc1.D((String) this.f, 0, 0, 7);
        String D2 = xc1.D((String) this.g, 0, 0, 7);
        String str2 = (String) this.h;
        if (str2 == null) {
            c.n("host == null");
            return null;
        }
        int g = g();
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = new ArrayList(as.U(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(xc1.D((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.d;
        if (arrayList4 != null) {
            arrayList = new ArrayList(as.U(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? xc1.D(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new ok0(str, D, D2, str2, g, arrayList, str4 != null ? xc1.D(str4, 0, 0, 7) : null, toString());
    }

    public dr1 d() {
        if (this.b == 0) {
            return null;
        }
        return new dr1(this);
    }

    public void e() {
        int i;
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = 1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            f11 f11Var = (f11) obj;
            int i3 = f11Var.c.c;
            i = 3;
            if (i3 == 3 || (i3 == 2 && f11Var.e == 0)) {
                break;
            }
        }
        du duVar = (du) this.e;
        if (i != duVar.c) {
            duVar.c = i;
            duVar.f983a.g();
        }
    }

    public int f(f11 f11Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            f11 f11Var2 = (f11) obj;
            if (f11Var2 == f11Var) {
                break;
            }
            i += f11Var2.e;
        }
        return i;
    }

    public int g() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.e;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public h h(int i) {
        h hVar = (h) this.h;
        if (hVar.b) {
            hVar = new h();
        } else {
            hVar.b = true;
        }
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = i;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            f11 f11Var = (f11) obj;
            int i4 = f11Var.e;
            if (i4 > i3) {
                hVar.c = f11Var;
                hVar.f357a = i3;
                break;
            }
            i3 -= i4;
        }
        if (((f11) hVar.c) != null) {
            return hVar;
        }
        c.m(d51.q("Cannot find wrapper for ", i));
        return null;
    }

    public f11 i(te1 te1Var) {
        f11 f11Var = (f11) ((IdentityHashMap) this.g).get(te1Var);
        if (f11Var != null) {
            return f11Var;
        }
        jw0.i("Cannot find wrapper for ", te1Var, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    public void j() {
        this.e = new cn1();
        this.f = new int[10][];
        this.c = new cn1[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0202, code lost:
    
        if (r8 < 65536) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0076, code lost:
    
        if (r14 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(defpackage.ok0 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.k(ok0, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu.toString():java.lang.String");
    }
}
