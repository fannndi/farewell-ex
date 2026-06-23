package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class kh1 extends ContextWrapper implements Callable {
    public static final /* synthetic */ int g = 0;

    static {
        try {
            Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class).setAccessible(true);
        } catch (Exception e) {
            rw.j(e);
        }
    }
}
