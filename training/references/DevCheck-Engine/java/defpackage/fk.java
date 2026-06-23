package defpackage;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes.dex */
public abstract class fk {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
