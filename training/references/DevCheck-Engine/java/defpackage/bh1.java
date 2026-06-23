package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bh1 {

    /* renamed from: a, reason: collision with root package name */
    public final vq f85a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public c71 h;
    public boolean i;
    public final ch1 j;
    public final long k;
    public final s00 l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public final ArrayList o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final boolean s;

    public bh1(Context context, Class cls, String str) {
        context.getClass();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = ch1.g;
        this.k = -1L;
        this.l = new s00(2);
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.o = new ArrayList();
        this.p = true;
        this.s = true;
        this.f85a = af1.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(qx0... qx0VarArr) {
        for (qx0 qx0Var : qx0VarArr) {
            Integer valueOf = Integer.valueOf(qx0Var.f865a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(qx0Var.b));
        }
        qx0[] qx0VarArr2 = (qx0[]) Arrays.copyOf(qx0VarArr, qx0VarArr.length);
        s00 s00Var = this.l;
        s00Var.getClass();
        for (qx0 qx0Var2 : qx0VarArr2) {
            s00Var.a(qx0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x020c, code lost:
    
        defpackage.c.m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0213, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dh1 b() {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh1.b():dh1");
    }
}
