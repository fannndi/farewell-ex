package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class c00 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ p00 h;

    public /* synthetic */ c00(p00 p00Var, int i) {
        this.g = i;
        this.h = p00Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        p00 p00Var = this.h;
        switch (i2) {
            case 0:
                p00Var.r1.dismiss();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i3 = p00.H1;
                uz1.r0(p00Var.i0());
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                p00Var.r1.dismiss();
                break;
            case 3:
                int i4 = p00.H1;
                uz1.s0(p00Var.i0());
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                p00Var.r1.dismiss();
                break;
            case 5:
                int i5 = p00.H1;
                Context i0 = p00Var.i0();
                String str = uz1.f1060a;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
                    intent.addFlags(1350565888);
                    if (i0.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
                        i0.getApplicationContext().startActivity(intent);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                p00Var.r1.dismiss();
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                int i6 = p00.H1;
                uz1.w0(p00Var.i0());
                break;
            case 8:
                p00Var.r1.dismiss();
                break;
            case rt0.o /* 9 */:
                int i7 = p00.H1;
                uz1.u0(p00Var.i0());
                break;
            case 10:
                p00Var.r1.dismiss();
                break;
            case 11:
                int i8 = p00.H1;
                uz1.v0(p00Var.i0());
                break;
            case 12:
                p00Var.r1.dismiss();
                break;
            default:
                int i9 = p00.H1;
                try {
                    uz1.t0(p00Var.i0());
                    break;
                } catch (IllegalStateException unused2) {
                    return;
                }
        }
    }
}
