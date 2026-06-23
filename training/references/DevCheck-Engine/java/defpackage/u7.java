package defpackage;

import flar2.devcheck.PaywallActivity;
import flar2.devcheck.tools.CPUActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1022a;

    @Override // defpackage.v31
    public final void a(Object obj) {
        switch (this.f1022a) {
            case 0:
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Objects.requireNonNull((String) it.next());
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int i = CPUActivity.J;
                i51.h("pfs", true);
                break;
            case 3:
                i51.h("pfs", true);
                break;
            default:
                int i2 = PaywallActivity.R;
                break;
        }
    }
}
