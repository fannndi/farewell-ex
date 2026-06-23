package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class vx1 extends k {
    public static final Parcelable.Creator<vx1> CREATOR = new j(11);
    public CharSequence i;
    public boolean j;

    public vx1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.i) + "}";
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.i, parcel, i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
