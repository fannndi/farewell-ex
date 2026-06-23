package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e8 implements Runnable {
    public int g;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            f8.f268a.add(new d8(this.g));
        } catch (c8 | IOException unused) {
        }
    }
}
