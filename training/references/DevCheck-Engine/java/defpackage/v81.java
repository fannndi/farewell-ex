package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes.dex */
public final class v81 extends l81 {
    public static final Parcelable.Creator<v81> CREATOR = new i11(5);
    public final int g;

    public v81(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.g = i;
    }

    public v81(Parcel parcel) {
        super(parcel);
        this.g = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.g);
    }
}
