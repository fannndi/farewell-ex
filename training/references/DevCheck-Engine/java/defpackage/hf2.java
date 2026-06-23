package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class hf2 extends xc1 {
    public final /* synthetic */ int d;

    @Override // defpackage.xc1
    public q4 e(Context context, Looper looper, yf yfVar, Object obj, lg0 lg0Var, mg0 mg0Var) {
        switch (this.d) {
            case 0:
                yfVar.getClass();
                Integer num = (Integer) yfVar.g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new uo1(context, looper, yfVar, bundle, lg0Var, mg0Var);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw d51.k(obj);
            default:
                return super.e(context, looper, yfVar, obj, lg0Var, mg0Var);
        }
    }

    @Override // defpackage.xc1
    public /* synthetic */ q4 f(Context context, Looper looper, yf yfVar, Object obj, mf2 mf2Var, mf2 mf2Var2) {
        switch (this.d) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new jg2(context, looper, yfVar, (mw1) obj, mf2Var, mf2Var2);
            default:
                return super.f(context, looper, yfVar, obj, mf2Var, mf2Var2);
        }
    }
}
