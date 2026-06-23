package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class tx {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1013a;

    static {
        try {
            Iterator it = Arrays.asList(new u3()).iterator();
            it.getClass();
            f1013a = im1.E(new dv(new fs(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
