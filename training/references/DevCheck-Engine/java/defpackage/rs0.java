package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class rs0 {
    public static final rs0 b = new rs0(new ss0(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final ss0 f904a;

    public rs0(ss0 ss0Var) {
        this.f904a = ss0Var;
    }

    public static rs0 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new rs0(new ss0(new LocaleList(localeArr)));
    }

    public final boolean b() {
        return this.f904a.f952a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rs0) {
            return this.f904a.equals(((rs0) obj).f904a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f904a.f952a.hashCode();
    }

    public final String toString() {
        return this.f904a.f952a.toString();
    }
}
