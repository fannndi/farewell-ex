package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class kg2 extends g0 {
    public static final Parcelable.Creator<kg2> CREATOR = new i11(25);
    public final int g;
    public final Account h;
    public final int i;
    public final GoogleSignInAccount j;

    public kg2(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.g = i;
        this.h = account;
        this.i = i2;
        this.j = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.D(parcel, 2, this.h, i);
        md2.I(parcel, 3, 4);
        parcel.writeInt(this.i);
        md2.D(parcel, 4, this.j, i);
        md2.K(parcel, J);
    }
}
