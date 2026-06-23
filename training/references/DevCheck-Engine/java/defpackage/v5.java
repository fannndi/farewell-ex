package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class v5 extends x5 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ a6 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(a6 a6Var, Context context) {
        super(a6Var);
        this.d = a6Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(a6 a6Var, z12 z12Var) {
        super(a6Var);
        this.d = a6Var;
        this.e = z12Var;
    }

    @Override // defpackage.x5
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    @Override // defpackage.x5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.g():int");
    }

    @Override // defpackage.x5
    public final void n() {
        int i = this.c;
        a6 a6Var = this.d;
        switch (i) {
            case 0:
                a6Var.p(true, true);
                break;
            default:
                a6Var.p(true, true);
                break;
        }
    }
}
