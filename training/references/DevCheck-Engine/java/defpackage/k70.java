package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class k70 extends l81 {
    public static final Parcelable.Creator<k70> CREATOR = new d(12);
    public String g;

    public k70() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public k70(Parcel parcel) {
        super(parcel);
        this.g = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.g);
    }
}
