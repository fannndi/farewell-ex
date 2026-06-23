package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class sf2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f934a;

    public sf2(int i) {
        this.f934a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(mf2 mf2Var);

    public abstract jb0[] b(mf2 mf2Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(mf2 mf2Var);

    public abstract void f(xi0 xi0Var, boolean z);
}
