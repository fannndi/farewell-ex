package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* loaded from: classes.dex */
public abstract class da {
    public static BiometricPrompt$AuthenticationCallback a(fa faVar) {
        return new ca(faVar);
    }

    public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }
}
