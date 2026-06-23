package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f133a;
    public String c;
    public int b = 1;
    public boolean d = false;
    public boolean e = true;

    public co1(ComponentName componentName) {
        this.f133a = componentName;
    }

    public static Bundle a(co1 co1Var) {
        co1Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", co1Var.f133a);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", co1Var.d);
        bundle.putInt("shizuku:user-service-arg-version-code", co1Var.b);
        bundle.putBoolean("shizuku:user-service-arg-daemon", co1Var.e);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = co1Var.c;
        Objects.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        return bundle;
    }
}
