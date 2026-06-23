package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* loaded from: classes.dex */
public final class a91 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public u81 h;
    public u81 i;
    public u81 j;

    public a91(Context context) {
        this.f16a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (!this.e) {
            return b().edit();
        }
        if (this.d == null) {
            this.d = b().edit();
        }
        return this.d;
    }

    public final SharedPreferences b() {
        if (this.c == null) {
            this.c = this.f16a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }
}
