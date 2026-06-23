package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ee extends View.BaseSavedState {
    public static final Parcelable.Creator<ee> CREATOR = new d(8);
    public float g;
    public float h;
    public ArrayList i;
    public float j;
    public boolean k;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
        parcel.writeList(this.i);
        parcel.writeFloat(this.j);
        parcel.writeBooleanArray(new boolean[]{this.k});
    }
}
