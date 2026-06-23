package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class df2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f189a;

    public df2(String str) {
        this.f189a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + CGvJMCDBOmCdj.SSInSPF).concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + IGQCApxXGMWo.wCzVQNHzk;
            }
        }
        return d51.s(str, bOxzFZXgEkjph.BLBFpkQ, str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            c(this.f189a, str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            c(this.f189a, str, objArr);
        }
    }
}
