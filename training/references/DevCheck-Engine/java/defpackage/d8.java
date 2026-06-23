package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d8 extends e {
    public final boolean i;
    public final int j;
    public static final Pattern k = Pattern.compile("^([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:])*[A-Za-z][A-Za-z0-9_]*$");
    public static final Parcelable.Creator<d8> CREATOR = new d(4);

    public d8(int i) {
        super(i);
        String str = this.g;
        if (str == null || !k.matcher(str).matches() || !new File("/data/data", this.g.split(rQcwh.UtFKid)[0]).exists()) {
            throw new c8(String.format("The process %d does not belong to any application", Integer.valueOf(i)));
        }
        this.i = false;
        this.j = 0;
    }

    public d8(Parcel parcel) {
        super(parcel);
        this.i = parcel.readByte() != 0;
        this.j = parcel.readInt();
    }

    @Override // defpackage.e, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.j);
    }
}
