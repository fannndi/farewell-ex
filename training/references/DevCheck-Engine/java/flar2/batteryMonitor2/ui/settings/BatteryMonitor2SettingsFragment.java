package flar2.devcheck.batteryMonitor2.ui.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import defpackage.a91;
import defpackage.c;
import defpackage.d51;
import defpackage.k3;
import defpackage.pf;
import defpackage.u81;
import defpackage.z81;
import flar2.devcheck.R;
import flar2.devcheck.usage.GgP.rlfWzcx;

/* loaded from: classes.dex */
public final class BatteryMonitor2SettingsFragment extends u81 {
    @Override // defpackage.u81
    public final void u0(String str) {
        PreferenceScreen preferenceScreen;
        PreferenceScreen preferenceScreen2;
        a91 a91Var = this.e0;
        if (a91Var == null) {
            c.o("This should be called after super.onCreate.");
            return;
        }
        Context i0 = i0();
        a91Var.e = true;
        z81 z81Var = new z81(i0, a91Var);
        XmlResourceParser xml = i0.getResources().getXml(R.xml.bm2_preferences);
        try {
            PreferenceGroup c = z81Var.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) c;
            preferenceScreen3.j(a91Var);
            SharedPreferences.Editor editor = a91Var.d;
            if (editor != null) {
                editor.apply();
            }
            a91Var.e = false;
            Preference preference = preferenceScreen3;
            if (str != null) {
                Preference w = preferenceScreen3.w(str);
                boolean z = w instanceof PreferenceScreen;
                preference = w;
                if (!z) {
                    c.m(d51.y("Preference object with key ", str, " is not a PreferenceScreen"));
                    return;
                }
            }
            PreferenceScreen preferenceScreen4 = (PreferenceScreen) preference;
            a91 a91Var2 = this.e0;
            PreferenceScreen preferenceScreen5 = a91Var2.g;
            if (preferenceScreen4 != preferenceScreen5) {
                if (preferenceScreen5 != null) {
                    preferenceScreen5.m();
                }
                a91Var2.g = preferenceScreen4;
                this.g0 = true;
                if (this.h0) {
                    k3 k3Var = this.j0;
                    if (!k3Var.hasMessages(1)) {
                        k3Var.obtainMessage(1).sendToTarget();
                    }
                }
            }
            a91 a91Var3 = this.e0;
            Preference preference2 = null;
            Preference w2 = (a91Var3 == null || (preferenceScreen = a91Var3.g) == null) ? null : preferenceScreen.w("bm2_pref_export_csv");
            if (w2 != null) {
                w2.k = new pf(this, 0);
            }
            a91 a91Var4 = this.e0;
            if (a91Var4 != null && (preferenceScreen2 = a91Var4.g) != null) {
                preference2 = preferenceScreen2.w(rlfWzcx.IxPSvPfjgNUuVkF);
            }
            if (preference2 != null) {
                preference2.k = new pf(this, 1);
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
