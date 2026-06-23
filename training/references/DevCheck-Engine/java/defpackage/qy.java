package defpackage;

import flar2.devcheck.benchmarkSuite.nativebridge.BenchSuiteBridge;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class qy implements os1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f866a;
    public final int b;
    public volatile int[] c;

    public qy(int i, int i2) {
        this.f866a = i2;
        switch (i2) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.c = new int[0];
                this.b = i;
                break;
            default:
                this.c = new int[0];
                this.b = i;
                break;
        }
    }

    @Override // defpackage.os1
    public final String a() {
        int i = this.f866a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return e().concat(i2 == 1 ? " (single-core)" : " (multi-core)");
            default:
                return e().concat(i2 == 1 ? aEQQDLUUMo.lUteVzxQTYPpED : " (multi-thread)");
        }
    }

    @Override // defpackage.os1
    public final double c() {
        switch (this.f866a) {
            case 0:
                return this.b == 1 ? j() : g();
            default:
                return this.b == 1 ? k() : h();
        }
    }

    @Override // defpackage.os1
    public final int[] d() {
        switch (this.f866a) {
        }
        return (int[]) this.c.clone();
    }

    public abstract String e();

    public abstract String f();

    public abstract double g();

    @Override // defpackage.os1
    public final String getId() {
        int i = this.f866a;
        int i2 = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("cpu.");
                sb.append(f());
                sb.append(i2 == 1 ? ".single" : ".multi");
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder("memory.");
                sb2.append(f());
                sb2.append(i2 == 1 ? ".single" : ".multi");
                return sb2.toString();
        }
    }

    public abstract double h();

    public abstract double i(int[] iArr);

    public abstract double j();

    public abstract double k();

    @Override // defpackage.os1
    public final double run() {
        switch (this.f866a) {
            case 0:
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                double i = i(this.b == 1 ? hy.b() : hy.a());
                this.c = BenchSuiteBridge.b();
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                return i;
            default:
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                double i2 = i(this.b == 1 ? hy.b() : hy.a());
                this.c = BenchSuiteBridge.b();
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                return i2;
        }
    }
}
