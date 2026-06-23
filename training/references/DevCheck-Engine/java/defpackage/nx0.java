package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class nx0 extends g0 {
    public static final Parcelable.Creator<nx0> CREATOR = new i11(24);
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;

    public nx0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = j;
        this.k = j2;
        this.l = str;
        this.m = str2;
        this.n = i4;
        this.o = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.I(parcel, 2, 4);
        parcel.writeInt(this.h);
        md2.I(parcel, 3, 4);
        parcel.writeInt(this.i);
        md2.I(parcel, 4, 8);
        parcel.writeLong(this.j);
        md2.I(parcel, 5, 8);
        parcel.writeLong(this.k);
        md2.E(parcel, 6, this.l);
        md2.E(parcel, 7, this.m);
        md2.I(parcel, 8, 4);
        parcel.writeInt(this.n);
        md2.I(parcel, 9, 4);
        parcel.writeInt(this.o);
        md2.K(parcel, J);
    }
}
