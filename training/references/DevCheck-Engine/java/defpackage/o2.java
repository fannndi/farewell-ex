package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;

/* loaded from: classes.dex */
public final class o2 implements Parcelable {
    public static final Parcelable.Creator<o2> CREATOR = new d(2);
    public final int g;
    public final Intent h;

    public o2(Intent intent, int i) {
        this.g = i;
        this.h = intent;
    }

    public o2(Parcel parcel) {
        this.g = parcel.readInt();
        this.h = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.g;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : yFbVsaLCWAtQC.yzxmJuVhrDHar);
        sb.append(", data=");
        sb.append(this.h);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        Intent intent = this.h;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
