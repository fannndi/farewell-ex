package defpackage;

import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ho0 implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f392a;

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        switch (this.f392a) {
            case 0:
                throw new w80("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Map.Entry entry = (Map.Entry) obj;
                n31 n31Var = (n31) obj2;
                n31Var.a(ab1.g, entry.getKey());
                n31Var.a(ab1.h, entry.getValue());
                return;
            default:
                throw new w80("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
