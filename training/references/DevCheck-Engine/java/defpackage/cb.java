package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class cb extends sy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f117a;
    public final ir b;
    public final ir c;
    public final String d;

    public cb(Context context, ir irVar, ir irVar2, String str) {
        if (context == null) {
            jw0.f("Null applicationContext");
            throw null;
        }
        this.f117a = context;
        if (irVar == null) {
            jw0.f("Null wallClock");
            throw null;
        }
        this.b = irVar;
        if (irVar2 == null) {
            jw0.f("Null monotonicClock");
            throw null;
        }
        this.c = irVar2;
        if (str != null) {
            this.d = str;
        } else {
            jw0.f("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sy) {
            cb cbVar = (cb) ((sy) obj);
            if (this.f117a.equals(cbVar.f117a) && this.b.equals(cbVar.b) && this.c.equals(cbVar.c) && this.d.equals(cbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.f117a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f117a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return d51.u(sb, this.d, "}");
    }
}
