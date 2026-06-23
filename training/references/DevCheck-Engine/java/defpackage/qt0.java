package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class qt0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xh0 f861a;

    static {
        String str;
        int i = tu1.f1008a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new t3()).iterator();
            it.getClass();
            Iterator it2 = im1.E(new dv(new fs(1, it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((t3) obj).getClass();
                    do {
                        ((t3) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((t3) obj) == null) {
                c.n("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f861a = new xh0(yh0.a(mainLooper), false);
            } else {
                c.n("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
