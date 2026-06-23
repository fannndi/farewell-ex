package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class el1 extends k {
    public static final Parcelable.Creator<el1> CREATOR = new j(9);
    public boolean i;

    public el1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.i + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.i));
    }
}
