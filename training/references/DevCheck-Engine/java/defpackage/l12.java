package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l12 {
    public static volatile rz e;

    /* renamed from: a, reason: collision with root package name */
    public final ir f565a;
    public final ir b;
    public final d20 c;
    public final w42 d;

    public l12(ir irVar, ir irVar2, d20 d20Var, w42 w42Var, gr grVar) {
        this.f565a = irVar;
        this.b = irVar2;
        this.c = d20Var;
        this.d = w42Var;
        ((Executor) grVar.h).execute(new oo1(12, grVar));
    }

    public static l12 a() {
        rz rzVar = e;
        if (rzVar != null) {
            return (l12) rzVar.l.get();
        }
        c.n("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (l12.class) {
                try {
                    if (e == null) {
                        qz qzVar = new qz();
                        context.getClass();
                        qzVar.g = context;
                        e = qzVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final fh c(lm lmVar) {
        Set unmodifiableSet = lmVar instanceof lm ? Collections.unmodifiableSet(lm.d) : Collections.singleton(new v80("proto"));
        fh a2 = nb.a();
        lmVar.getClass();
        a2.h = "cct";
        String str = lmVar.f597a;
        String str2 = lmVar.b;
        if (str2 == null) {
            str2 = "";
        }
        a2.i = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new fh(unmodifiableSet, a2.o(), this, 27, false);
    }
}
