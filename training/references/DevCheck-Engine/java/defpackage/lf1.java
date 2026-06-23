package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lf1 implements d22 {
    public final zf g;
    public final int h;
    public final ba0 i;
    public final fo0 j;
    public final List k;

    public lf1(zf zfVar, int i, ba0 ba0Var, fo0 fo0Var, List list) {
        this.g = zfVar;
        this.h = i;
        this.i = ba0Var;
        this.j = fo0Var;
        this.k = list;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ef1.c(field) + " and " + ef1.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        Class cls = l32Var.f569a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        c3 c3Var = ef1.f230a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new ff1();
        }
        rt0.s(this.k);
        return ef1.f230a.v(cls) ? new kf1(cls, c(nh0Var, l32Var, cls, true)) : new if1(this.g.z(l32Var, true), c(nh0Var, l32Var, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jf1 c(defpackage.nh0 r30, defpackage.l32 r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf1.c(nh0, l32, java.lang.Class, boolean):jf1");
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        ba0 ba0Var = this.i;
        ba0Var.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || ba0Var.b(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? ba0Var.g : ba0Var.h;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw d51.l(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
