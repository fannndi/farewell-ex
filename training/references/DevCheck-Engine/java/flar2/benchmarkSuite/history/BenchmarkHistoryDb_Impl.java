package flar2.devcheck.benchmarkSuite.history;

import android.content.Context;
import defpackage.en0;
import defpackage.fh1;
import defpackage.ft1;
import defpackage.of;
import defpackage.tp;
import defpackage.y00;
import defpackage.zg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class BenchmarkHistoryDb_Impl extends BenchmarkHistoryDb {
    public volatile zg t;

    @Override // defpackage.dh1
    public final en0 e() {
        return new en0(this, new HashMap(0), new HashMap(0), "benchmark_run", "subtest_value");
    }

    @Override // defpackage.dh1
    public final ft1 g(y00 y00Var) {
        fh1 fh1Var = new fh1(y00Var, new of(this), "8d7f41e739a0ef6a800b6c8693d47ee8", "c2a4797ed8a3cc62d37ef3086f1c25b9");
        Context context = y00Var.f1203a;
        context.getClass();
        return y00Var.c.b(new tp(context, y00Var.b, fh1Var, false, false));
    }

    @Override // defpackage.dh1
    public final List h(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.dh1
    public final Set m() {
        return new HashSet();
    }

    @Override // defpackage.dh1
    public final Map o() {
        HashMap hashMap = new HashMap();
        hashMap.put(zg.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // flar2.devcheck.benchmarkSuite.history.BenchmarkHistoryDb
    public final zg x() {
        zg zgVar;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new zg(this);
                }
                zgVar = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zgVar;
    }
}
