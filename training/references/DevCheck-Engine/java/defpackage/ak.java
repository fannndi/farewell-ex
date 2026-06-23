package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: classes.dex */
public abstract class ak {
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
