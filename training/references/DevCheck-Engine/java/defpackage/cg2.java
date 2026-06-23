package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cg2 extends g0 {
    public static final Parcelable.Creator<cg2> CREATOR = new i11(22);
    public final List g;
    public final String h;

    public cg2(ArrayList arrayList, String str) {
        this.g = arrayList;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        List<String> list = this.g;
        if (list != null) {
            int J2 = md2.J(parcel, 1);
            parcel.writeStringList(list);
            md2.K(parcel, J2);
        }
        md2.E(parcel, 2, this.h);
        md2.K(parcel, J);
    }
}
