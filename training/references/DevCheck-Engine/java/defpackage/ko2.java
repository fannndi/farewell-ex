package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ko2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f545a;
    public final String b;
    public final boolean c;

    public ko2(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            c.m("Given String is empty or null");
            throw null;
        }
        this.f545a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            c.m("Given String is empty or null");
            throw null;
        }
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko2)) {
            return false;
        }
        ko2 ko2Var = (ko2) obj;
        return md2.j(this.f545a, ko2Var.f545a) && md2.j(this.b, ko2Var.b) && md2.j(null, null) && this.c == ko2Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f545a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.f545a;
        if (str != null) {
            return str;
        }
        xc1.j(null);
        throw null;
    }
}
