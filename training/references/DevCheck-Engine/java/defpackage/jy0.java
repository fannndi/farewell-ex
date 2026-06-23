package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class jy0 extends l81 {
    public static final Parcelable.Creator<jy0> CREATOR = new d(28);
    public HashSet g;

    public jy0() {
        super(AbsSavedState.EMPTY_STATE);
    }

    public jy0(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.g = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.g, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.g.size());
        HashSet hashSet = this.g;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }
}
