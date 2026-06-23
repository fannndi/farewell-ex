package flar2.devcheck.nativebridge;

import android.content.Context;
import defpackage.o01;

/* loaded from: classes.dex */
public abstract class MainBridge {
    private static native void a(boolean z, Context context, String str);

    public static void b(boolean z, Context context, String str) {
        if (o01.a()) {
            try {
                a(z, context, str);
            } catch (Throwable unused) {
            }
        }
    }
}
