package defpackage;

import android.content.pm.PackageManager;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;

/* loaded from: classes.dex */
public abstract class u51 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature(bOxzFZXgEkjph.psPuDSQfdta);
    }
}
