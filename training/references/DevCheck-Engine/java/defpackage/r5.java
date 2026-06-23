package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class r5 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static rs0 b(Configuration configuration) {
        return rs0.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(rs0 rs0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(rs0Var.f904a.f952a.toLanguageTags()));
    }

    public static void d(Configuration configuration, rs0 rs0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(rs0Var.f904a.f952a.toLanguageTags()));
    }
}
