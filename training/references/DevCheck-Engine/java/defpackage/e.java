package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new d(0);
    public final String g;
    public final int h;

    public e(int i) {
        String str;
        this.h = i;
        try {
            str = l91.a(String.format("/proc/%d/cmdline", Integer.valueOf(i))).trim();
        } catch (IOException unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            String[] strArr = new wq1(String.format("/proc/%d/stat", Integer.valueOf(i))).h;
            str = strArr.length > 1 ? strArr[1].replace("(", "").replace(")", "") : "";
        }
        this.g = str;
    }

    public e(Parcel parcel) {
        this.g = parcel.readString();
        this.h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
    }
}
