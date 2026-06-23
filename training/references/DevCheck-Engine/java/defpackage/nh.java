package defpackage;

import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nh implements jn {
    public final /* synthetic */ int g;
    public final /* synthetic */ ph h;
    public final /* synthetic */ String i;
    public final /* synthetic */ zf j;

    public /* synthetic */ nh(zf zfVar, ph phVar, String str, int i) {
        this.g = i;
        this.j = zfVar;
        this.h = phVar;
        this.i = str;
    }

    @Override // defpackage.jn
    public final void h(IOException iOException) {
        int i = this.g;
        ph phVar = this.h;
        switch (i) {
            case 0:
                phVar.l();
                break;
            default:
                phVar.l();
                break;
        }
    }

    @Override // defpackage.jn
    public final void m(lg1 lg1Var) {
        switch (this.g) {
            case 0:
                ph phVar = this.h;
                try {
                    boolean z = lg1Var.v;
                    ng1 ng1Var = lg1Var.m;
                    if (!z || ng1Var == null) {
                        phVar.l();
                    } else {
                        try {
                            ai d = zf.d(new JSONObject(ng1Var.l()));
                            zf zfVar = this.j;
                            String str = this.i;
                            oh ohVar = new oh(null, d, null);
                            synchronized (zfVar) {
                                ((mh) zfVar.i).put(str, ohVar);
                            }
                            phVar.onResult(d);
                        } catch (Throwable unused) {
                            phVar.l();
                        }
                    }
                    lg1Var.close();
                    return;
                } finally {
                }
            default:
                ph phVar2 = this.h;
                try {
                    boolean z2 = lg1Var.v;
                    ng1 ng1Var2 = lg1Var.m;
                    if (!z2 || ng1Var2 == null) {
                        phVar2.l();
                    } else {
                        try {
                            qh a2 = zf.a(new JSONObject(ng1Var2.l()));
                            zf zfVar2 = this.j;
                            String str2 = this.i;
                            oh ohVar2 = new oh(null, null, a2);
                            synchronized (zfVar2) {
                                ((mh) zfVar2.i).put(str2, ohVar2);
                            }
                            phVar2.onResult(a2);
                        } catch (Throwable unused2) {
                            phVar2.l();
                        }
                    }
                    lg1Var.close();
                    return;
                } finally {
                }
        }
    }
}
