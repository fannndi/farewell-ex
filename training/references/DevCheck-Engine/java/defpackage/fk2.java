package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fk2 implements Executor {
    public static final fk2 g;
    public static final /* synthetic */ fk2[] h;

    static {
        fk2 fk2Var = new fk2("INSTANCE", 0);
        g = fk2Var;
        h = new fk2[]{fk2Var};
    }

    public static fk2[] values() {
        return (fk2[]) h.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
