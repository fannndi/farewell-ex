package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ca extends BiometricPrompt$AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fa f114a;

    public ca(fa faVar) {
        this.f114a = faVar;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference weakReference = ((jk) this.f114a).f485a;
        if (weakReference.get() == null || ((lk) weakReference.get()).l || !((lk) weakReference.get()).k) {
            return;
        }
        ((lk) weakReference.get()).d(new uj(i, charSequence));
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((jk) this.f114a).f485a;
        if (weakReference.get() == null || !((lk) weakReference.get()).k) {
            return;
        }
        lk lkVar = (lk) weakReference.get();
        if (lkVar.s == null) {
            lkVar.s = new qy0();
        }
        lk.f(lkVar.s, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int i;
        BiometricPrompt.CryptoObject b;
        int i2;
        if (authenticationResult != null && (b = da.b(authenticationResult)) != null && vy.d(b) == null && vy.f(b) == null && vy.e(b) == null && (((i2 = Build.VERSION.SDK_INT) < 30 || wy.b(b) == null) && i2 >= 33)) {
            xy.b(b);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            if (authenticationResult != null) {
                i = ea.a(authenticationResult);
            }
            i = -1;
        } else {
            if (i3 != 29) {
                i = 2;
            }
            i = -1;
        }
        gk gkVar = new gk();
        WeakReference weakReference = ((jk) this.f114a).f485a;
        if (weakReference.get() == null || !((lk) weakReference.get()).k) {
            return;
        }
        if (i == -1) {
            ((lk) weakReference.get()).c();
            gkVar = new gk();
        }
        lk lkVar = (lk) weakReference.get();
        if (lkVar.p == null) {
            lkVar.p = new qy0();
        }
        lk.f(lkVar.p, gkVar);
    }
}
