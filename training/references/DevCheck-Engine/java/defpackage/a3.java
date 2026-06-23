package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.benchmarkSuite.nativebridge.BenchSuiteBridge;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class a3 extends qy {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, int i2) {
        super(i, 0);
        this.d = i2;
    }

    @Override // defpackage.os1
    public final String b() {
        switch (this.d) {
        }
        return "MiB/s";
    }

    @Override // defpackage.qy
    public final String e() {
        switch (this.d) {
            case 0:
                return Gvyagftz.SBWluNNPorp;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "Dijkstra";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "SGEMM";
            case 3:
                return rQcwh.uVSdluXnBkZ;
            default:
                return "Zstd Decompress";
        }
    }

    @Override // defpackage.qy
    public final String f() {
        switch (this.d) {
            case 0:
                return "aes256";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "dijkstra";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "sgemm";
            case 3:
                return "sha256";
            default:
                return "zstd.decompress";
        }
    }

    @Override // defpackage.qy
    public final double g() {
        switch (this.d) {
            case 0:
                return 1202.1d;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 2922.5d;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return 11.6d;
            case 3:
                return 241.3d;
            default:
                return 908.3d;
        }
    }

    @Override // defpackage.qy
    public final double i(int[] iArr) {
        switch (this.d) {
            case 0:
                return BenchSuiteBridge.e(2.5d, iArr);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return BenchSuiteBridge.f(2.5d, iArr);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return BenchSuiteBridge.t(2.5d, iArr);
            case 3:
                return BenchSuiteBridge.u(2.5d, iArr);
            default:
                return BenchSuiteBridge.v(2.5d, iArr);
        }
    }

    @Override // defpackage.qy
    public final double j() {
        switch (this.d) {
            case 0:
                return 422.3d;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 1053.0d;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return 2.8d;
            case 3:
                return 65.4d;
            default:
                return 284.3d;
        }
    }
}
