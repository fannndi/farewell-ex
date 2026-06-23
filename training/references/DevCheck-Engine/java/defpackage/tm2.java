package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class tm2 extends g0 {
    public static final Parcelable.Creator<tm2> CREATOR = new lh2(3);
    public Bundle g;
    public jb0[] h;
    public int i;
    public yu j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        Bundle bundle = this.g;
        if (bundle != null) {
            int J2 = md2.J(parcel, 1);
            parcel.writeBundle(bundle);
            md2.K(parcel, J2);
        }
        md2.F(parcel, 2, this.h, i);
        int i2 = this.i;
        md2.I(parcel, 3, 4);
        parcel.writeInt(i2);
        md2.D(parcel, 4, this.j, i);
        md2.K(parcel, J);
    }
}
