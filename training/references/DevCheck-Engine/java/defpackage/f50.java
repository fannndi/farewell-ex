package defpackage;

import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class f50 {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f262a;

    public f50(DisplayCutout displayCutout) {
        this.f262a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f50.class != obj.getClass()) {
            return false;
        }
        return this.f262a.equals(((f50) obj).f262a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f262a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f262a + "}";
    }
}
