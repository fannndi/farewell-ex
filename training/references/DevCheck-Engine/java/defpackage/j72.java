package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class j72 {

    /* renamed from: a, reason: collision with root package name */
    public final pg0 f466a = new pg0();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                iy1.f(autoCloseable);
            } catch (Exception e) {
                rw.j(e);
            }
        }
    }
}
