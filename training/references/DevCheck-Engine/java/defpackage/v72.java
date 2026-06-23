package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v72 extends k {
    public static final Parcelable.Creator<v72> CREATOR = new j(13);
    public int i;
    public Parcelable j;

    public v72(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? v72.class.getClassLoader() : classLoader;
        this.i = parcel.readInt();
        this.j = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return d51.t(sb, this.i, "}");
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
        parcel.writeParcelable(this.j, i);
    }
}
