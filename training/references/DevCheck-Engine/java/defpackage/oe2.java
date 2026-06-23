package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.material.behavior.YqV.Gvyagftz;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class oe2 extends he2 implements IInterface {
    public final nv1 h;
    public final /* synthetic */ qe2 i;
    public final /* synthetic */ int j;
    public final df2 k;
    public final /* synthetic */ qe2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe2(qe2 qe2Var, nv1 nv1Var, byte b) {
        super(0);
        Objects.requireNonNull(qe2Var);
        this.i = qe2Var;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.h = nv1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oe2(qe2 qe2Var, nv1 nv1Var, int i) {
        this(qe2Var, nv1Var, (byte) 0);
        this.j = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Objects.requireNonNull(qe2Var);
                this.l = qe2Var;
                this(qe2Var, nv1Var, (byte) 0);
                this.k = new df2("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                Objects.requireNonNull(qe2Var);
                this.l = qe2Var;
                this.k = new df2(Gvyagftz.nMqp);
                break;
        }
    }

    public final void j(Bundle bundle) {
        this.i.e.c(this.h);
    }

    public final void k(Bundle bundle) {
        this.i.e.c(this.h);
    }
}
