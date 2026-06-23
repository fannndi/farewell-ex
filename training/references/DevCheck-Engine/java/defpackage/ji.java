package defpackage;

import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;

/* loaded from: classes.dex */
public final class ji extends c41 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ki e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(ki kiVar, boolean z, boolean z2) {
        super(z);
        this.e = kiVar;
        this.d = z2;
    }

    @Override // defpackage.c41
    public final void a() {
        boolean z = this.d;
        ki kiVar = this.e;
        if (z) {
            ((BenchmarkSuiteActivity) kiVar.g0()).G();
        } else {
            kiVar.d0.f();
            ym0.o(kiVar.g0());
        }
    }
}
