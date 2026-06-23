package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class if2 extends g0 {
    public static final Parcelable.Creator<if2> CREATOR = new i11(20);
    public final int g;
    public final int h;
    public final Intent i;

    public if2(int i, int i2, Intent intent) {
        this.g = i;
        this.h = i2;
        this.i = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.I(parcel, 2, 4);
        parcel.writeInt(this.h);
        md2.D(parcel, 3, this.i, i);
        md2.K(parcel, J);
    }
}
