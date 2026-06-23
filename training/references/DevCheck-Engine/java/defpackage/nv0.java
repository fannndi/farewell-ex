package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;

/* loaded from: classes.dex */
public final class nv0 extends View.BaseSavedState {
    public static final Parcelable.Creator<nv0> CREATOR = new d(20);
    public int g;

    public final String toString() {
        StringBuilder sb = new StringBuilder(nTAZxGMqQtZZAQ.FJbvSJrspvFVg);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.g;
        return d51.u(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.g));
    }
}
