package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d11 extends k {
    public static final Parcelable.Creator<d11> CREATOR = new j(6);
    public Bundle i;

    public d11(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readBundle(classLoader == null ? d11.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.i);
    }
}
