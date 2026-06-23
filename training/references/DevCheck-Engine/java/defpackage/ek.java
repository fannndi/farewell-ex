package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;

/* loaded from: classes.dex */
public abstract class ek {
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}
