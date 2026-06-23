package defpackage;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class od2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f729a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? as1.d0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }
}
