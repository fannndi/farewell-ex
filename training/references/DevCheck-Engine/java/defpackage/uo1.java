package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class uo1 extends a {
    public final Bundle A;
    public final Integer B;
    public final boolean y;
    public final yf z;

    public uo1(Context context, Looper looper, yf yfVar, Bundle bundle, lg0 lg0Var, mg0 mg0Var) {
        super(context, looper, 44, yfVar, lg0Var, mg0Var);
        this.y = true;
        this.z = yfVar;
        this.A = bundle;
        this.B = (Integer) yfVar.g;
    }

    @Override // defpackage.q4
    public final int d() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.q4
    public final boolean k() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zf2 ? (zf2) queryLocalInterface : new zf2(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        yf yfVar = this.z;
        boolean equals = this.c.getPackageName().equals((String) yfVar.d);
        Bundle bundle = this.A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) yfVar.d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
