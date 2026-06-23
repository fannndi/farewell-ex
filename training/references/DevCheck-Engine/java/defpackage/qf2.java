package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.R;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class qf2 {

    /* renamed from: a, reason: collision with root package name */
    public static final yo1 f840a = new yo1(0);
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = bd2.a(context).g;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a2);
        }
        if (i == 2) {
            return bw0.r(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a2);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a2);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a2);
            case rt0.p /* 17 */:
                return d(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return e(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return e(context, "common_google_play_services_restricted_profile_title");
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        yo1 yo1Var = f840a;
        synchronized (yo1Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(b)) {
                    yo1Var.clear();
                    b = locale;
                }
                String str2 = (String) yo1Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = og0.c;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", rQcwh.DMLr);
                    if (identifier != 0) {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f840a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
