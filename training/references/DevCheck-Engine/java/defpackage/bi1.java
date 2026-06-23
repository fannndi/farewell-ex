package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bi1 extends g0 {
    public static final Parcelable.Creator<bi1> CREATOR = new i11(28);
    public final int g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;

    public bi1(int i, boolean z, boolean z2, int i2, int i3) {
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = i2;
        this.k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.I(parcel, 2, 4);
        parcel.writeInt(this.h ? 1 : 0);
        md2.I(parcel, 3, 4);
        parcel.writeInt(this.i ? 1 : 0);
        md2.I(parcel, 4, 4);
        parcel.writeInt(this.j);
        md2.I(parcel, 5, 4);
        parcel.writeInt(this.k);
        md2.K(parcel, J);
    }
}
