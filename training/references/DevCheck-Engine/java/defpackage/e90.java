package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e90 implements Parcelable {
    public static final Parcelable.Creator<e90> CREATOR = new d(13);
    public float g;
    public Parcelable h = null;
    public float i;

    public e90(float f, float f2) {
        this.g = f2;
        this.i = f;
    }

    public float a() {
        return this.i;
    }

    public float b() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.i + " y: " + b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.i);
        parcel.writeFloat(b());
        if (this.h == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.h, i);
        }
    }
}
