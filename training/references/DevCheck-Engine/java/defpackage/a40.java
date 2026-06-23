package defpackage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a40 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;

    public a40(Context context, PendingIntent pendingIntent) {
        this.g = new e52(this);
        this.h = new f52(0, this);
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.e = pendingIntent;
        this.c = (AppOpsManager) applicationContext.getSystemService("appops");
        this.d = new Handler(Looper.getMainLooper());
    }

    public a40(AssetManager assetManager, Executor executor, sa1 sa1Var, String str, File file) {
        byte[] bArr;
        this.f7a = false;
        this.b = executor;
        this.c = sa1Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = md2.f;
                    break;
                case 26:
                    bArr = md2.e;
                    break;
                case 27:
                    bArr = md2.d;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = md2.c;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = md2.b;
        }
        this.d = bArr;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void b(int i, Serializable serializable) {
        ((Executor) this.b).execute(new hh(i, 3, this, serializable));
    }

    public void c() {
        this.f = null;
        this.f7a = false;
        AppOpsManager appOpsManager = (AppOpsManager) this.c;
        if (appOpsManager != null) {
            appOpsManager.stopWatchingMode((e52) this.g);
        }
        ((Handler) this.d).removeCallbacks((f52) this.h);
    }
}
