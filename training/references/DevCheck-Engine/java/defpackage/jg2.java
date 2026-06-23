package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;
import com.google.android.material.bottomappbar.HaCM.rQcwh;

/* loaded from: classes.dex */
public final class jg2 extends a {
    public final mw1 y;

    public jg2(Context context, Looper looper, yf yfVar, mw1 mw1Var, mf2 mf2Var, mf2 mf2Var2) {
        super(context, looper, 270, yfVar, mf2Var, mf2Var2);
        this.y = mw1Var;
    }

    @Override // defpackage.q4
    public final int d() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof fg2 ? (fg2) queryLocalInterface : new fg2(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final jb0[] o() {
        return op0.o;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return rQcwh.pVbzOIFTVCwCA;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
