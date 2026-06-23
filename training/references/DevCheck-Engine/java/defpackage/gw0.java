package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import flar2.devcheck.benchmarkSuite.nativebridge.BenchSuiteBridge;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class gw0 extends qy {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw0(int i, int i2) {
        super(i, 1);
        this.d = i2;
    }

    @Override // defpackage.os1
    public final String b() {
        switch (this.d) {
            case 0:
                return "MiB/s";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "MiB/s";
            default:
                return Gvyagftz.pVvD;
        }
    }

    @Override // defpackage.qy
    public final String e() {
        switch (this.d) {
            case 0:
                return "Memory Read";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "STREAM Triad";
            default:
                return "Memory Write";
        }
    }

    @Override // defpackage.qy
    public final String f() {
        switch (this.d) {
            case 0:
                return "read";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "triad";
            default:
                return "write";
        }
    }

    @Override // defpackage.qy
    public final double h() {
        switch (this.d) {
            case 0:
                return 10751.5d;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 9143.3d;
            default:
                return 8667.6d;
        }
    }

    @Override // defpackage.qy
    public final double i(int[] iArr) {
        switch (this.d) {
            case 0:
                return BenchSuiteBridge.m(2.5d, iArr);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return BenchSuiteBridge.n(2.5d, iArr);
            default:
                return BenchSuiteBridge.o(2.5d, iArr);
        }
    }

    @Override // defpackage.qy
    public final double k() {
        switch (this.d) {
            case 0:
                return 7444.3d;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 9267.6d;
            default:
                return 8938.5d;
        }
    }
}
