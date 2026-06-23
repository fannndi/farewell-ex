package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class p21 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f771a = 0;

    static {
        ai1.k("NetworkStateTracker");
    }

    public static final o21 a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        NetworkInfo activeNetworkInfo;
        boolean z3;
        boolean z4;
        NetworkCapabilities networkCapabilities;
        connectivityManager.getClass();
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException unused) {
                ai1.h().getClass();
            }
        } catch (SecurityException unused2) {
            z2 = z;
        }
        try {
            if (networkCapabilities != null) {
                z4 = networkCapabilities.hasCapability(16);
                z2 = z;
                return new o21(z3, z4, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming(), z2);
            }
            return new o21(z3, z4, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming(), z2);
        } catch (SecurityException unused3) {
            ai1.h().getClass();
            return new o21(false, false, false, true, z2);
        }
        z4 = false;
        z2 = z;
    }
}
