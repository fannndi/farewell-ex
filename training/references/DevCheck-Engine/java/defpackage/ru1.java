package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class ru1 {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f908a;
    public final ai1 b;
    public final boolean c;

    static {
        ai1.k("SystemJobInfoConverter");
    }

    public ru1(Context context, ai1 ai1Var, boolean z) {
        this.b = ai1Var;
        this.f908a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
