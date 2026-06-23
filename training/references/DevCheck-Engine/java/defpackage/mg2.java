package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class mg2 extends g0 {
    public static final Parcelable.Creator<mg2> CREATOR = new i11(26);
    public final int g;
    public final IBinder h;
    public final uu i;
    public final boolean j;
    public final boolean k;

    public mg2(int i, IBinder iBinder, uu uuVar, boolean z, boolean z2) {
        this.g = i;
        this.h = iBinder;
        this.i = uuVar;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        Object to2Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg2)) {
            return false;
        }
        mg2 mg2Var = (mg2) obj;
        if (!this.i.equals(mg2Var.i)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.h;
        if (iBinder == null) {
            to2Var = null;
        } else {
            int i = n1.h;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            to2Var = queryLocalInterface instanceof qk0 ? (qk0) queryLocalInterface : new to2(iBinder);
        }
        IBinder iBinder2 = mg2Var.h;
        if (iBinder2 != null) {
            int i2 = n1.h;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof qk0 ? (qk0) queryLocalInterface2 : new to2(iBinder2);
        }
        return md2.j(to2Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        IBinder iBinder = this.h;
        if (iBinder != null) {
            int J2 = md2.J(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            md2.K(parcel, J2);
        }
        md2.D(parcel, 3, this.i, i);
        md2.I(parcel, 4, 4);
        parcel.writeInt(this.j ? 1 : 0);
        md2.I(parcel, 5, 4);
        parcel.writeInt(this.k ? 1 : 0);
        md2.K(parcel, J);
    }
}
