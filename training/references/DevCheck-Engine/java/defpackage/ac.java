package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ac implements Parcelable {
    public static final Parcelable.Creator<ac> CREATOR = new d(6);
    public final ArrayList g;
    public final ArrayList h;

    public ac(Parcel parcel) {
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(zb.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
    }
}
