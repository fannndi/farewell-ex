package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class a22 extends l81 {
    public static final Parcelable.Creator<a22> CREATOR = new i11(18);
    public boolean g;

    public a22() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public a22(Parcel parcel) {
        super(parcel);
        this.g = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
