package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gg2 extends g0 {
    public static final Parcelable.Creator<gg2> CREATOR = new i11(23);
    public final int g;
    public final uu h;
    public final mg2 i;

    public gg2(int i, uu uuVar, mg2 mg2Var) {
        this.g = i;
        this.h = uuVar;
        this.i = mg2Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.D(parcel, 2, this.h, i);
        md2.D(parcel, 3, this.i, i);
        md2.K(parcel, J);
    }
}
