package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class pz1 extends k {
    public static final Parcelable.Creator<pz1> CREATOR = new j(12);
    public int i;
    public boolean j;

    public pz1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readInt();
        this.j = parcel.readInt() != 0;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
