package defpackage;

import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class h8 extends pn1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(dh1 dh1Var, int i) {
        super(dh1Var);
        this.d = i;
    }

    @Override // defpackage.pn1
    public final String b() {
        switch (this.d) {
            case 0:
                return CDsMEtnUjndKau.lcbztXK;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "DELETE FROM app_usage";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "DELETE FROM battery_sample WHERE captured_at < ? AND resolution = ?";
            case 3:
                return "DELETE FROM battery_sample";
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "DELETE FROM benchmark_run WHERE id = ?";
            case 5:
                return "DELETE FROM benchmark_run";
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return "UPDATE benchmark_run SET uploaded = 1, server_run_id = ? WHERE id = ?";
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return "UPDATE benchmark_run SET uploaded = 2 WHERE id = ?";
            case 8:
                return "UPDATE charging_session SET ended_at = ? WHERE ended_at = 0 AND started_at < ?";
            case rt0.o /* 9 */:
                return "DELETE FROM charging_session";
            case 10:
                return "UPDATE discharge_session SET ended_at = ? WHERE ended_at = 0 AND started_at < ?";
            case 11:
                return "DELETE FROM discharge_session";
            default:
                return "DELETE FROM health_snapshot";
        }
    }
}
