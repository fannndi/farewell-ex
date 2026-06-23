package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hg1 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f383a;
    public final Resources.Theme b;

    public hg1(Resources resources, Resources.Theme theme) {
        this.f383a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hg1.class == obj.getClass()) {
            hg1 hg1Var = (hg1) obj;
            if (this.f383a.equals(hg1Var.f383a) && Objects.equals(this.b, hg1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f383a, this.b);
    }
}
