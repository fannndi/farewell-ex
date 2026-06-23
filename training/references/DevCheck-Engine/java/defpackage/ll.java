package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class ll extends k {
    public static final Parcelable.Creator<ll> CREATOR = new j(1);
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public ll(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt() == 1;
        this.l = parcel.readInt() == 1;
        this.m = parcel.readInt() == 1;
    }

    public ll(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.i = bottomSheetBehavior.P;
        this.j = bottomSheetBehavior.f;
        this.k = bottomSheetBehavior.b;
        this.l = bottomSheetBehavior.J;
        this.m = bottomSheetBehavior.K;
    }

    @Override // defpackage.k, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
    }
}
