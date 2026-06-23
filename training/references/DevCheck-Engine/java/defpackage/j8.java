package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import flar2.devcheck.R;
import flar2.devcheck.manifest.ManifestActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ td1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ j8(l01 l01Var, int i) {
        this.g = 2;
        this.h = l01Var;
        this.i = i;
    }

    public /* synthetic */ j8(n8 n8Var, int i, m8 m8Var, int i2) {
        this.g = i2;
        this.h = n8Var;
        this.i = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p51 p51Var;
        ApplicationInfo applicationInfo;
        int i = this.g;
        int i2 = this.i;
        td1 td1Var = this.h;
        switch (i) {
            case 0:
                n8 n8Var = (n8) td1Var;
                n8Var.f.u0(((y61) n8Var.d.get(i2)).h);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                n8 n8Var2 = (n8) td1Var;
                n8Var2.f.u0(((y61) n8Var2.d.get(i2)).h);
                break;
            default:
                p8 p8Var = ((l01) td1Var).r;
                if (p8Var != null && (applicationInfo = (p51Var = (p51) p8Var.h).u0) != null) {
                    boolean booleanValue = i51.b("prefRoot").booleanValue();
                    go1 go1Var = p51Var.x0;
                    boolean z = go1Var != null && go1Var.d();
                    try {
                        if (i2 == R.id.action_open) {
                            Intent launchIntentForPackage = p51Var.i0().getPackageManager().getLaunchIntentForPackage(applicationInfo.packageName);
                            if (launchIntentForPackage != null) {
                                p51Var.s0(launchIntentForPackage);
                            } else {
                                Toast.makeText(p51Var.i0(), p51Var.A(R.string.not_found), 0).show();
                            }
                        } else if (i2 == R.id.action_uninstall) {
                            Intent intent = new Intent("android.intent.action.DELETE");
                            intent.setData(Uri.parse("package:" + applicationInfo.packageName));
                            p51Var.s0(intent);
                        } else if (i2 == R.id.action_manifest) {
                            Intent intent2 = new Intent(p51Var.i0(), (Class<?>) ManifestActivity.class);
                            intent2.putExtra("appinfo", applicationInfo);
                            intent2.putExtra("darktheme", uz1.d(p51Var.g0()));
                            intent2.putExtra("color", i51.c(6, "prefColor"));
                            p51Var.s0(intent2);
                        } else if (i2 == R.id.action_kill) {
                            if (booleanValue) {
                                wn1.a("am force-stop " + applicationInfo.packageName).l(x32.b, null);
                            } else if (z) {
                                ju0.q0("am force-stop ".concat(ju0.r0(applicationInfo.packageName)));
                            }
                            Toast.makeText(p51Var.i0(), p51Var.A(R.string.stopping) + " " + applicationInfo.packageName, 0).show();
                            break;
                        } else if (i2 == R.id.action_disable) {
                            boolean z2 = applicationInfo.enabled;
                            String str = applicationInfo.packageName;
                            if (z2) {
                                wn1.a("pm disable " + str).l(x32.b, null);
                                Toast.makeText(p51Var.i0(), applicationInfo.packageName + " " + p51Var.A(R.string.disabled), 0).show();
                            } else {
                                wn1.a("pm enable " + str).l(x32.b, null);
                                Toast.makeText(p51Var.i0(), applicationInfo.packageName + " " + p51Var.A(R.string.enabled), 0).show();
                            }
                            p51Var.v0(false, false);
                            break;
                        } else if (i2 == R.id.action_download) {
                            o51 o51Var = p51Var.w0;
                            if (o51Var != null) {
                                o51Var.b(applicationInfo);
                                break;
                            }
                        } else if (i2 == R.id.action_market) {
                            try {
                                p51Var.s0(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + applicationInfo.packageName)));
                            } catch (Exception unused) {
                                p51Var.s0(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + applicationInfo.packageName)));
                            }
                        }
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
