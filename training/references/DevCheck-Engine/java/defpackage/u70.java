package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class u70 {
    public static final Object j = new Object();
    public static volatile u70 k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1023a;
    public final r9 b;
    public volatile int c;
    public final Handler d;
    public final q70 e;
    public final t70 f;
    public final pg0 g;
    public final int h;
    public final p10 i;

    public u70(pc0 pc0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1023a = reentrantReadWriteLock;
        this.c = 3;
        t70 t70Var = (t70) pc0Var.b;
        this.f = t70Var;
        int i = pc0Var.f875a;
        this.h = i;
        this.i = (p10) pc0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new r9(0);
        this.g = new pg0();
        q70 q70Var = new q70(this);
        this.e = q70Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f1023a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                t70Var.a(new p70(q70Var));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static u70 a() {
        u70 u70Var;
        synchronized (j) {
            try {
                u70Var = k;
                if (!(u70Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return u70Var;
    }

    public final int b() {
        this.f1023a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f1023a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            c.n("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.f1023a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.f1023a.writeLock().unlock();
            q70 q70Var = this.e;
            u70 u70Var = q70Var.f820a;
            try {
                u70Var.f.a(new p70(q70Var));
            } catch (Throwable th) {
                u70Var.d(th);
            }
        } finally {
            this.f1023a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1023a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f1023a.writeLock().unlock();
            this.d.post(new ce(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f1023a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:29:0x005a, B:32:0x005f, B:34:0x0063, B:36:0x0070, B:38:0x008f, B:40:0x0099, B:42:0x009c, B:44:0x00a0, B:46:0x00b0, B:47:0x00b3), top: B:28:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(s70 s70Var) {
        op0.e("initCallback cannot be null", s70Var);
        this.f1023a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(s70Var);
                this.f1023a.writeLock().unlock();
            }
            this.d.post(new ce(Arrays.asList(s70Var), this.c, (Throwable) null));
            this.f1023a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1023a.writeLock().unlock();
            throw th;
        }
    }
}
