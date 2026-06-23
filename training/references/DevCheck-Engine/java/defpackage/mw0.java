package defpackage;

/* loaded from: classes.dex */
public final class mw0 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final kp f657a;
    public final ku1 b;
    public long c = -1;
    public long d = -1;

    public mw0(kp kpVar, ku1 ku1Var) {
        this.f657a = kpVar;
        this.b = ku1Var;
    }

    public static float b(String str) {
        char charAt;
        int indexOf = str.indexOf("avg10=");
        if (indexOf < 0) {
            return Float.NaN;
        }
        int i = indexOf + 6;
        int i2 = i;
        while (i2 < str.length() && (charAt = str.charAt(i2)) != ' ' && charAt != '\t' && charAt != '\n') {
            i2++;
        }
        try {
            return Float.parseFloat(str.substring(i, i2));
        } catch (NumberFormatException unused) {
            return Float.NaN;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    @Override // defpackage.mj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw0.a():void");
    }
}
