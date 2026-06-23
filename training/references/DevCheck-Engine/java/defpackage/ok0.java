package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ok0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f742a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;

    public ok0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.f742a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f742a.length() + 3;
        String str = this.h;
        return str.substring(as1.f0(str, ':', length, 4) + 1, as1.f0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.f742a.length() + 3;
        String str = this.h;
        int f0 = as1.f0(str, '/', length, 4);
        return str.substring(f0, pd2.c(f0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.f742a.length() + 3;
        String str = this.h;
        int f0 = as1.f0(str, '/', length, 4);
        int c = pd2.c(f0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (f0 < c) {
            int i = f0 + 1;
            int d = pd2.d(str, '/', i, c);
            arrayList.add(str.substring(i, d));
            f0 = d;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int f0 = as1.f0(str, '?', 0, 6) + 1;
        return str.substring(f0, pd2.d(str, '#', f0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.f742a.length() + 3;
        String str = this.h;
        return str.substring(length, pd2.c(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ok0) && ((ok0) obj).h.equals(this.h);
    }

    public final eu f() {
        eu euVar = new eu(1);
        ArrayList arrayList = (ArrayList) euVar.c;
        String str = this.f742a;
        euVar.e = str;
        euVar.f = e();
        euVar.g = a();
        euVar.h = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        euVar.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        euVar.d = d != null ? eu.l(xc1.g(d, 0, 0, " \"'<>#", 83)) : null;
        if (this.g != null) {
            String str3 = this.h;
            str2 = str3.substring(as1.f0(str3, '#', 0, 6) + 1);
        }
        euVar.i = str2;
        return euVar;
    }

    public final String g() {
        eu euVar;
        try {
            euVar = new eu(1);
            euVar.k(this, "/...");
        } catch (IllegalArgumentException unused) {
            euVar = null;
        }
        euVar.getClass();
        euVar.f = xc1.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        euVar.g = xc1.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return euVar.c().h;
    }

    public final URI h() {
        String str;
        eu f = f();
        ArrayList arrayList = (ArrayList) f.c;
        String str2 = (String) f.h;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str2).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        f.h = str;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, xc1.g((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) f.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str3 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str3 != null ? xc1.g(str3, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str4 = (String) f.i;
        f.i = str4 != null ? xc1.g(str4, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String euVar = f.toString();
        try {
            return new URI(euVar);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(euVar).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                rw.j(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
