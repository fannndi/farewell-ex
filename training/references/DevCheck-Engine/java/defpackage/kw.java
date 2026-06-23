package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class kw {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f553a;
    public final boolean b;

    public kw(Uri uri, boolean z) {
        this.f553a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        kw kwVar = (kw) obj;
        return this.f553a.equals(kwVar.f553a) && this.b == kwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f553a.hashCode() * 31);
    }
}
