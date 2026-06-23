package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class il2 {
    public static final il2 b;
    public static final il2 c;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f439a;

    static {
        if (ro2.j) {
            c = null;
            b = null;
        } else {
            c = new il2(null);
            b = new il2(null);
        }
    }

    public il2(CancellationException cancellationException) {
        this.f439a = cancellationException;
    }
}
