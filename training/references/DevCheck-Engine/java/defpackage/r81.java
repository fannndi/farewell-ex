package defpackage;

import android.view.Window;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class r81 {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
