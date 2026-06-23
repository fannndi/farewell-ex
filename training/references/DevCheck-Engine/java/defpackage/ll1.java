package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class ll1 extends l81 {
    public static final Parcelable.Creator<ll1> CREATOR = new i11(12);
    public int g;
    public int h;
    public int i;

    public ll1() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public ll1(Parcel parcel) {
        super(parcel);
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
