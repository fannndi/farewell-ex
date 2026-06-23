package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class ir1 {
    public static final ReentrantLock c = new ReentrantLock();
    public static ir1 d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f446a = new ReentrantLock();
    public final SharedPreferences b;

    public ir1(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f446a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
