package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r40 implements Executor {
    public static final r40 g;
    public static final /* synthetic */ r40[] h;

    static {
        r40 r40Var = new r40("INSTANCE", 0);
        g = r40Var;
        h = new r40[]{r40Var};
    }

    public static r40 valueOf(String str) {
        return (r40) Enum.valueOf(r40.class, str);
    }

    public static r40[] values() {
        return (r40[]) h.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
