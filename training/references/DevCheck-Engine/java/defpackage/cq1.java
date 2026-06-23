package defpackage;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f149a;
    public static final bq1 b;
    public static final bq1 c;
    public static final List d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f149a = z;
        if (z) {
            b = new bq1(0, Date.class);
            c = new bq1(1, Timestamp.class);
            d = Collections.unmodifiableList(Arrays.asList(yp1.b, xp1.b, aq1.b));
        } else {
            b = null;
            c = null;
            d = Collections.EMPTY_LIST;
        }
    }
}
