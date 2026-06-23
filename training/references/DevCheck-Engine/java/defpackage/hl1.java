package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class hl1 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f389a;
    public final /* synthetic */ il1 b;

    public hl1(il1 il1Var) {
        this.b = il1Var;
        this.f389a = il1Var.f438a.edit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f389a.apply();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f389a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f389a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        String d = this.b.d(Boolean.toString(z));
        if (d != null) {
            this.f389a.putString(il1.f(str), d);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        String d = this.b.d(Float.toString(f));
        if (d != null) {
            this.f389a.putString(il1.f(str), d);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        String d = this.b.d(Integer.toString(i));
        if (d != null) {
            this.f389a.putString(il1.f(str), d);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        String d = this.b.d(Long.toString(j));
        if (d != null) {
            this.f389a.putString(il1.f(str), d);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        String d = this.b.d(str2);
        SharedPreferences.Editor editor = this.f389a;
        String f = il1.f(str);
        if (d == null) {
            editor.remove(f);
            return this;
        }
        editor.putString(f, d);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String d = this.b.d((String) it.next());
            if (d != null) {
                hashSet.add(d);
            }
        }
        this.f389a.putStringSet(il1.f(str), hashSet);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f389a.remove(il1.f(str));
        return this;
    }
}
