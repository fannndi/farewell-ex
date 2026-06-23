package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class dg0 extends g0 {
    public static final Parcelable.Creator<dg0> CREATOR = new lh2(5);
    public static final Scope[] u = new Scope[0];
    public static final jb0[] v = new jb0[0];
    public final int g;
    public final int h;
    public final int i;
    public String j;
    public IBinder k;
    public Scope[] l;
    public Bundle m;
    public Account n;
    public jb0[] o;
    public jb0[] p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final String t;

    public dg0(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, jb0[] jb0VarArr, jb0[] jb0VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? u : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        jb0[] jb0VarArr3 = v;
        jb0VarArr = jb0VarArr == null ? jb0VarArr3 : jb0VarArr;
        jb0VarArr2 = jb0VarArr2 == null ? jb0VarArr3 : jb0VarArr2;
        this.g = i;
        this.h = i2;
        this.i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.j = "com.google.android.gms";
        } else {
            this.j = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = n1.h;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface to2Var = queryLocalInterface instanceof qk0 ? (qk0) queryLocalInterface : new to2(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    account2 = ((to2) to2Var).a();
                } catch (RemoteException unused) {
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
            this.n = account2;
        } else {
            this.k = iBinder;
            this.n = account;
        }
        this.l = scopeArr;
        this.m = bundle;
        this.o = jb0VarArr;
        this.p = jb0VarArr2;
        this.q = z;
        this.r = i4;
        this.s = z2;
        this.t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lh2.a(this, parcel, i);
    }
}
