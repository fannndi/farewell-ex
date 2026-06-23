package defpackage;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class l0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f560a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f560a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(rd2.f888a);
                break;
        }
        return new DecimalFormat("0.##########");
    }
}
