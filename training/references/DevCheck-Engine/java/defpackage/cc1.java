package defpackage;

import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import flar2.devcheck.benchmarkSuite.nativebridge.BenchSuiteBridge;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class cc1 implements os1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f118a;
    public final /* synthetic */ int b;

    public cc1(int i, String str) {
        this.b = i;
        this.f118a = str;
    }

    @Override // defpackage.os1
    public final String a() {
        switch (this.b) {
            case 0:
                return "Random Read";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "Random Write";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "Sequential Read";
            default:
                return "Sequential Write";
        }
    }

    @Override // defpackage.os1
    public final String b() {
        return "MiB/s";
    }

    @Override // defpackage.os1
    public final double c() {
        switch (this.b) {
            case 0:
                return 10.5d;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 38.1d;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return 246.5d;
            default:
                return 47.7d;
        }
    }

    @Override // defpackage.os1
    public final String getId() {
        String str;
        switch (this.b) {
            case 0:
                str = "rand.read";
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                str = "rand.write";
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                str = "seq.read";
                break;
            default:
                str = yFbVsaLCWAtQC.dKYsumRp;
                break;
        }
        return "disk.".concat(str);
    }

    @Override // defpackage.os1
    public final double run() {
        double p;
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        int i = this.b;
        String str = this.f118a;
        switch (i) {
            case 0:
                p = BenchSuiteBridge.p(2.5d, str);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                p = BenchSuiteBridge.q(2.5d, str);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                p = BenchSuiteBridge.r(2.5d, str);
                break;
            default:
                p = BenchSuiteBridge.s(2.5d, str);
                break;
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        return p;
    }
}
