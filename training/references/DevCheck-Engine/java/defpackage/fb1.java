package defpackage;

import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class fb1 {
    public static final km b = new km(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = tl2.z("*");
    public static final fb1 d = new fb1(new yf(2));

    /* renamed from: a, reason: collision with root package name */
    public final yf f274a;

    public fb1(yf yfVar) {
        this.f274a = yfVar;
    }

    public static List b(String str) {
        List p0 = as1.p0(str, new char[]{'.'});
        if (!ym0.b(yr.a0(p0), "")) {
            return p0;
        }
        int size = p0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            c.d(d51.p(size, "Requested element count ", IGQCApxXGMWo.kPExVRlQFvDBW));
            return null;
        }
        p80 p80Var = p80.g;
        if (size == 0) {
            return p80Var;
        }
        if (size >= p0.size()) {
            return yr.g0(p0);
        }
        if (size == 1) {
            if (p0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return tl2.z(p0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = p0.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : tl2.z(arrayList.get(0)) : p80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r1 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r5 = (defpackage.km[]) r2.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r10 >= r9) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r5[r10] = defpackage.fb1.b;
        r11 = (defpackage.km) r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r11 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r11 = defpackage.j70.a(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r1 = r1 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r5 >= r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r6 = (defpackage.km) r12.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r6 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r6 = defpackage.j70.a(r6, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        r12 = defpackage.as1.p0("!".concat(r6), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        if (r0.size() != r12.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        if (((java.lang.String) r12.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
    
        if (((java.lang.String) r12.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        r0 = r0.size();
        r12 = r12.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        r0 = r0 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r13 = new defpackage.fs(0, b(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0152, code lost:
    
        if (r0 < 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (r0 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        r13 = new defpackage.n60(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0163, code lost:
    
        return defpackage.im1.D(r13, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        defpackage.c.d(defpackage.d51.p(r0, "Requested element count ", " is less than zero."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013f, code lost:
    
        r0 = r0.size();
        r12 = r12.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e4, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e8, code lost:
    
        r12 = defpackage.fb1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00eb, code lost:
    
        r1 = defpackage.p80.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ed, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
    
        r2 = defpackage.as1.p0(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
    
        r1 = defpackage.as1.p0(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        if (r2.size() <= r1.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010d, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010f, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f8, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
    
        defpackage.ym0.A("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00af, code lost:
    
        defpackage.ym0.A("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b3, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb1.a(java.lang.String):java.lang.String");
    }
}
