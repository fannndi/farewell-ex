package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class rd2 {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f888a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f888a = timeZone;
        String n0 = as1.n0(a41.class.getName(), "okhttp3.");
        if (n0.endsWith("Client")) {
            n0 = n0.substring(0, n0.length() - 6);
        }
        b = n0;
    }

    public static final boolean a(ok0 ok0Var, ok0 ok0Var2) {
        ok0Var.getClass();
        ok0Var2.getClass();
        return ym0.b(ok0Var.d, ok0Var2.d) && ok0Var.e == ok0Var2.e && ym0.b(ok0Var.f742a, ok0Var2.f742a);
    }

    public static final void b(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!ym0.b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String c(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long d(lg1 lg1Var) {
        String b2 = lg1Var.l.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        byte[] bArr = pd2.f785a;
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset e(fm fmVar, Charset charset) {
        fmVar.getClass();
        charset.getClass();
        int u = fmVar.u(pd2.b);
        if (u == -1) {
            return charset;
        }
        if (u == 0) {
            return lp.f601a;
        }
        if (u == 1) {
            return lp.b;
        }
        if (u == 2) {
            Charset charset2 = lp.f601a;
            Charset charset3 = lp.d;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            forName.getClass();
            lp.d = forName;
            return forName;
        }
        if (u == 3) {
            return lp.c;
        }
        if (u != 4) {
            throw new AssertionError();
        }
        Charset charset4 = lp.f601a;
        Charset charset5 = lp.e;
        if (charset5 != null) {
            return charset5;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        forName2.getClass();
        lp.e = forName2;
        return forName2;
    }

    public static final boolean f(lp1 lp1Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        long c = lp1Var.c().e() ? lp1Var.c().c() - nanoTime : Long.MAX_VALUE;
        lp1Var.c().d(Math.min(c, timeUnit.toNanos(i)) + nanoTime);
        try {
            wl wlVar = new wl();
            while (lp1Var.g(8192L, wlVar) != -1) {
                wlVar.skip(wlVar.h);
            }
            if (c == Long.MAX_VALUE) {
                lp1Var.c().a();
                return true;
            }
            lp1Var.c().d(nanoTime + c);
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                lp1Var.c().a();
                return false;
            }
            lp1Var.c().d(nanoTime + c);
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                lp1Var.c().a();
            } else {
                lp1Var.c().d(nanoTime + c);
            }
            throw th;
        }
    }

    public static final ui0 g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pi0 pi0Var = (pi0) it.next();
            km kmVar = pi0Var.f791a;
            km kmVar2 = pi0Var.b;
            String j = kmVar.j();
            String j2 = kmVar2.j();
            arrayList.add(j);
            arrayList.add(as1.s0(j2).toString());
        }
        return new ui0((String[]) arrayList.toArray(new String[0]));
    }

    public static final String h(ok0 ok0Var, boolean z) {
        ok0Var.getClass();
        int i = ok0Var.e;
        String str = ok0Var.d;
        if (as1.d0(str, ":")) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = ok0Var.f742a;
            str2.getClass();
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return p80.g;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return p80.g;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            singletonList.getClass();
            return singletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List asList = Arrays.asList(objArr2);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }
}
