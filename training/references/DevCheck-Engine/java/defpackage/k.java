package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class k implements Parcelable {
    public final Parcelable g;
    public static final i h = new i();
    public static final Parcelable.Creator<k> CREATOR = new j(0);

    public k() {
        this.g = null;
    }

    public k(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.g = readParcelable == null ? h : readParcelable;
    }

    public k(Parcelable parcelable) {
        if (parcelable != null) {
            this.g = parcelable == h ? null : parcelable;
        } else {
            c.m("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.g, i);
    }
}
