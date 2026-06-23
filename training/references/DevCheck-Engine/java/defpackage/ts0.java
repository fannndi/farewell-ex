package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ts0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f1004a = new AtomicReference(rs0.b);

    public static Context a(Context context) {
        rs0 rs0Var = (rs0) f1004a.get();
        if (rs0Var == null || rs0Var.b()) {
            return context;
        }
        try {
            Locale locale = rs0Var.f904a.f952a.get(0);
            if (locale == null) {
                return context;
            }
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(new LocaleList(locale));
            return context.createConfigurationContext(configuration);
        } catch (Throwable unused) {
            return context;
        }
    }

    public static String b(Context context, int i) {
        return a(context).getString(i);
    }
}
