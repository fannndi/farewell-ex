package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class is0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f447a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public is0(Context context, WorkerParameters workerParameters) {
        this.f447a = context;
        this.b = workerParameters;
    }

    public abstract pn a();

    public abstract pn b();
}
