package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class me1 extends k {
    public static final Parcelable.Creator<me1> CREATOR = new j(8);
    public Parcelable i;

    public me1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readParcelable(classLoader == null ? de1.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.i, 0);
    }
}
