package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class j11 extends View.BaseSavedState {
    public static final Parcelable.Creator<j11> CREATOR = new i11(0);
    public int g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(YSHrxiHkAFcciU.zIoyHT);
        return d51.t(sb, this.g, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.g);
    }
}
