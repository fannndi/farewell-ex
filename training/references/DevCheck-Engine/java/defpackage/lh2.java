package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class lh2 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f589a;

    public /* synthetic */ lh2(int i) {
        this.f589a = i;
    }

    public static void a(dg0 dg0Var, Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        int i2 = dg0Var.g;
        md2.I(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = dg0Var.h;
        md2.I(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = dg0Var.i;
        md2.I(parcel, 3, 4);
        parcel.writeInt(i4);
        md2.E(parcel, 4, dg0Var.j);
        IBinder iBinder = dg0Var.k;
        if (iBinder != null) {
            int J2 = md2.J(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            md2.K(parcel, J2);
        }
        md2.F(parcel, 6, dg0Var.l, i);
        Bundle bundle = dg0Var.m;
        if (bundle != null) {
            int J3 = md2.J(parcel, 7);
            parcel.writeBundle(bundle);
            md2.K(parcel, J3);
        }
        md2.D(parcel, 8, dg0Var.n, i);
        md2.F(parcel, 10, dg0Var.o, i);
        md2.F(parcel, 11, dg0Var.p, i);
        boolean z = dg0Var.q;
        md2.I(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = dg0Var.r;
        md2.I(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = dg0Var.s;
        md2.I(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        md2.E(parcel, 15, dg0Var.t);
        md2.K(parcel, J);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        switch (this.f589a) {
            case 0:
                int x0 = ju0.x0(parcel);
                int i2 = 0;
                boolean z = false;
                String str2 = null;
                long j = -1;
                while (parcel.dataPosition() < x0) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str2 = ju0.n(parcel, readInt);
                    } else if (c == 2) {
                        i2 = ju0.i0(parcel, readInt);
                    } else if (c == 3) {
                        ju0.F0(parcel, readInt, 8);
                        j = parcel.readLong();
                    } else if (c != 4) {
                        ju0.s0(parcel, readInt);
                    } else {
                        z = ju0.g0(parcel, readInt);
                    }
                }
                ju0.s(parcel, x0);
                return new jb0(str2, i2, j, z);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int x02 = ju0.x0(parcel);
                while (parcel.dataPosition() < x02) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i = ju0.i0(parcel, readInt2);
                    } else if (c2 != 2) {
                        ju0.s0(parcel, readInt2);
                    } else {
                        str = ju0.n(parcel, readInt2);
                    }
                }
                ju0.s(parcel, x02);
                return new Scope(i, str);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int x03 = ju0.x0(parcel);
                PendingIntent pendingIntent = null;
                uu uuVar = null;
                while (parcel.dataPosition() < x03) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 == 1) {
                        i = ju0.i0(parcel, readInt3);
                    } else if (c3 == 2) {
                        str = ju0.n(parcel, readInt3);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) ju0.m(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        ju0.s0(parcel, readInt3);
                    } else {
                        uuVar = (uu) ju0.m(parcel, readInt3, uu.CREATOR);
                    }
                }
                ju0.s(parcel, x03);
                return new Status(i, str, pendingIntent, uuVar);
            case 3:
                int x04 = ju0.x0(parcel);
                Bundle bundle = null;
                jb0[] jb0VarArr = null;
                yu yuVar = null;
                while (parcel.dataPosition() < x04) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 == 1) {
                        int n0 = ju0.n0(parcel, readInt4);
                        int dataPosition = parcel.dataPosition();
                        if (n0 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition + n0);
                            bundle = readBundle;
                        }
                    } else if (c4 == 2) {
                        jb0VarArr = (jb0[]) ju0.o(parcel, readInt4, jb0.CREATOR);
                    } else if (c4 == 3) {
                        i = ju0.i0(parcel, readInt4);
                    } else if (c4 != 4) {
                        ju0.s0(parcel, readInt4);
                    } else {
                        yuVar = (yu) ju0.m(parcel, readInt4, yu.CREATOR);
                    }
                }
                ju0.s(parcel, x04);
                tm2 tm2Var = new tm2();
                tm2Var.g = bundle;
                tm2Var.h = jb0VarArr;
                tm2Var.i = i;
                tm2Var.j = yuVar;
                return tm2Var;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                int x05 = ju0.x0(parcel);
                boolean z2 = false;
                boolean z3 = false;
                int i3 = 0;
                bi1 bi1Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < x05) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            bi1Var = (bi1) ju0.m(parcel, readInt5, bi1.CREATOR);
                            break;
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            z2 = ju0.g0(parcel, readInt5);
                            break;
                        case 3:
                            z3 = ju0.g0(parcel, readInt5);
                            break;
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int n02 = ju0.n0(parcel, readInt5);
                            int dataPosition2 = parcel.dataPosition();
                            if (n02 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + n02);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i3 = ju0.i0(parcel, readInt5);
                            break;
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int n03 = ju0.n0(parcel, readInt5);
                            int dataPosition3 = parcel.dataPosition();
                            if (n03 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + n03);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            ju0.s0(parcel, readInt5);
                            break;
                    }
                }
                ju0.s(parcel, x05);
                return new yu(bi1Var, z2, z3, iArr, i3, iArr2);
            default:
                int x06 = ju0.x0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = dg0.u;
                jb0[] jb0VarArr2 = dg0.v;
                jb0[] jb0VarArr3 = jb0VarArr2;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                boolean z4 = false;
                int i7 = 0;
                boolean z5 = false;
                String str3 = null;
                IBinder iBinder = null;
                Account account = null;
                String str4 = null;
                while (parcel.dataPosition() < x06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            i4 = ju0.i0(parcel, readInt6);
                            break;
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            i5 = ju0.i0(parcel, readInt6);
                            break;
                        case 3:
                            i6 = ju0.i0(parcel, readInt6);
                            break;
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            str3 = ju0.n(parcel, readInt6);
                            break;
                        case 5:
                            int n04 = ju0.n0(parcel, readInt6);
                            int dataPosition4 = parcel.dataPosition();
                            if (n04 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition4 + n04);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            scopeArr = (Scope[]) ju0.o(parcel, readInt6, Scope.CREATOR);
                            break;
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int n05 = ju0.n0(parcel, readInt6);
                            int dataPosition5 = parcel.dataPosition();
                            if (n05 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition5 + n05);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account = (Account) ju0.m(parcel, readInt6, Account.CREATOR);
                            break;
                        case rt0.o /* 9 */:
                        default:
                            ju0.s0(parcel, readInt6);
                            break;
                        case '\n':
                            jb0VarArr2 = (jb0[]) ju0.o(parcel, readInt6, jb0.CREATOR);
                            break;
                        case 11:
                            jb0VarArr3 = (jb0[]) ju0.o(parcel, readInt6, jb0.CREATOR);
                            break;
                        case '\f':
                            z4 = ju0.g0(parcel, readInt6);
                            break;
                        case '\r':
                            i7 = ju0.i0(parcel, readInt6);
                            break;
                        case 14:
                            z5 = ju0.g0(parcel, readInt6);
                            break;
                        case 15:
                            str4 = ju0.n(parcel, readInt6);
                            break;
                    }
                }
                ju0.s(parcel, x06);
                return new dg0(i4, i5, i6, str3, iBinder, scopeArr, bundle2, account, jb0VarArr2, jb0VarArr3, z4, i7, z5, str4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f589a) {
            case 0:
                return new jb0[i];
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new Scope[i];
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new Status[i];
            case 3:
                return new tm2[i];
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new yu[i];
            default:
                return new dg0[i];
        }
    }
}
