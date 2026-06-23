package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class lw1 extends g0 {
    public static final Parcelable.Creator<lw1> CREATOR = new i11(19);
    public final int g;
    public List h;

    public lw1(int i, List list) {
        this.g = i;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.G(parcel, 2, this.h);
        md2.K(parcel, J);
    }
}
