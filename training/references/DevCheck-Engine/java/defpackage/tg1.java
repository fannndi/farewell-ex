package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class tg1 implements Parcelable {
    public static final Parcelable.Creator<tg1> CREATOR = new i11(11);
    public bl0 g;

    public void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new sg1(this);
                }
                parcel.writeStrongBinder(this.g.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
