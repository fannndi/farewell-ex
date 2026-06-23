package defpackage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hi2 {
    static {
        int i = ji2.f;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = bk2.f89a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            bk2.g("BillingLogger");
            return null;
        }
    }

    public static in2 b(int i, int i2, qj qjVar) {
        try {
            hn2 q = in2.q();
            mn2 r = nn2.r();
            int i3 = qjVar.f847a;
            r.c();
            nn2.p((nn2) r.h, i3);
            String str = qjVar.b;
            r.c();
            nn2.o((nn2) r.h, str);
            r.d(i);
            q.d(r);
            q.c();
            in2.p((in2) q.h, i2);
            return (in2) q.b();
        } catch (Exception unused) {
            bk2.g("BillingLogger");
            return null;
        }
    }

    public static in2 c(int i, int i2, qj qjVar, String str) {
        try {
            mn2 r = nn2.r();
            int i3 = qjVar.f847a;
            r.c();
            nn2.p((nn2) r.h, i3);
            String str2 = qjVar.b;
            r.c();
            nn2.o((nn2) r.h, str2);
            r.d(i);
            if (str != null) {
                r.c();
                nn2.n((nn2) r.h, str);
            }
            hn2 q = in2.q();
            q.d(r);
            q.c();
            in2.p((in2) q.h, i2);
            return (in2) q.b();
        } catch (Throwable unused) {
            bk2.g("BillingLogger");
            return null;
        }
    }

    public static ln2 d(int i) {
        try {
            kn2 p = ln2.p();
            p.c();
            ln2.o((ln2) p.h, i);
            return (ln2) p.b();
        } catch (Exception unused) {
            bk2.g("BillingLogger");
            return null;
        }
    }
}
