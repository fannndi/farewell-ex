package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jb0 extends g0 {
    public static final Parcelable.Creator<jb0> CREATOR = new lh2(0);
    public final String g;
    public final int h;
    public final long i;
    public final boolean j;

    public jb0(String str, int i, long j, boolean z) {
        this.g = str;
        this.h = i;
        this.i = j;
        this.j = z;
    }

    public final long a() {
        long j = this.i;
        return j == -1 ? this.h : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jb0) {
            jb0 jb0Var = (jb0) obj;
            if (md2.j(this.g, jb0Var.g) && a() == jb0Var.a() && this.j == jb0Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Long.valueOf(a()), Boolean.valueOf(this.j)});
    }

    public final String toString() {
        u40 u40Var = new u40(this);
        u40Var.f("name", this.g);
        u40Var.f("version", Long.valueOf(a()));
        u40Var.f("is_fully_rolled_out", Boolean.valueOf(this.j));
        return u40Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.E(parcel, 1, this.g);
        md2.I(parcel, 2, 4);
        parcel.writeInt(this.h);
        long a2 = a();
        md2.I(parcel, 3, 8);
        parcel.writeLong(a2);
        md2.I(parcel, 4, 4);
        parcel.writeInt(this.j ? 1 : 0);
        md2.K(parcel, J);
    }
}
