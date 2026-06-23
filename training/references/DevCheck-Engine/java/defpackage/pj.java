package defpackage;

/* loaded from: classes.dex */
public final class pj {
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    /* renamed from: a, reason: collision with root package name */
    public final wb f792a;

    static {
        String str = i51.b;
        String str2 = i51.c;
        String str3 = i51.d;
        String str4 = i51.e;
        String str5 = i51.f;
        String str6 = i51.g;
        String str7 = i51.h;
        String str8 = i51.i;
        String str9 = i51.j;
        String str10 = i51.k;
        b = new String[]{"devcheck.lifetime", str, str2, str3, str4, str5, str6, str7, str8, str9, str10};
        c = new String[]{str4, str5, str6, str7, str8, str9, str10};
        d = new String[]{str4, str5, str6};
        e = new String[]{"devcheck.monthly", "devcheck.annual"};
    }

    public pj(wb wbVar) {
        zo1 zo1Var = new zo1();
        this.f792a = wbVar;
        zo1 zo1Var2 = new zo1();
        zo1 zo1Var3 = wbVar.q;
        zo1Var.l(zo1Var2, new nc(8, zo1Var));
        zo1Var.l(zo1Var3, new u7(1));
    }
}
