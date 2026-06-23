package defpackage;

/* loaded from: classes.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public String f86a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Integer f;

    public bi(bi biVar) {
        this.f86a = b(biVar.f86a);
        this.b = b(biVar.b);
        this.c = b(biVar.c);
        this.d = b(biVar.d);
        this.e = b(biVar.e);
        this.f = biVar.f;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim;
    }

    public String a() {
        StringBuilder sb = new StringBuilder("q=");
        String str = this.f86a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|s=");
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("|m=");
        String str3 = this.c;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append("|sv=");
        String str4 = this.d;
        if (str4 == null) {
            str4 = "";
        }
        sb.append(str4);
        sb.append("|sc=");
        String str5 = this.e;
        if (str5 == null) {
            str5 = "";
        }
        sb.append(str5);
        sb.append("|minR=");
        Object obj = this.f;
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append("|maxR=");
        sb.append((Object) "");
        return sb.toString();
    }

    public bi c() {
        bi biVar = new bi();
        biVar.f86a = this.f86a;
        biVar.b = this.b;
        biVar.c = this.c;
        biVar.d = this.d;
        biVar.e = this.e;
        biVar.f = this.f;
        return biVar;
    }
}
