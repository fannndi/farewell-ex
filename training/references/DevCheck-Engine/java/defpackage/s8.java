package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class s8 implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f921a;

    public /* synthetic */ s8(int i) {
        this.f921a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f921a) {
            case 0:
                return ((y61) obj).g;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return Integer.valueOf(((hn0) obj).v);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new ArrayList();
            case 3:
                return new TreeSet();
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new AtomicInteger(0);
            case 5:
                String str = ((gp0) obj).f349a;
                return str == null ? "" : str.toLowerCase(Locale.US);
            default:
                return ((k61) obj).b;
        }
    }
}
