package defpackage;

import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class uc1 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1034a;
    public final /* synthetic */ vc1 b;

    public /* synthetic */ uc1(vc1 vc1Var, int i) {
        this.f1034a = i;
        this.b = vc1Var;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        switch (this.f1034a) {
            case 0:
                ic1 ic1Var = (ic1) obj;
                if (ic1Var != null) {
                    this.b.g = ic1Var;
                    vc1.d(this.b);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.b.h = (String) obj;
                vc1.d(this.b);
                break;
            default:
                List list = (List) obj;
                this.b.c.b((list == null || list.isEmpty()) ? null : (li) list.get(0));
                break;
        }
    }
}
