package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.ui.root.ProcessData;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class i11 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407a;

    public /* synthetic */ i11(int i) {
        this.f407a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        bl0 bl0Var = null;
        Account account = null;
        uu uuVar = null;
        Intent intent = null;
        zk0 zk0Var = null;
        int i = 0;
        switch (this.f407a) {
            case 0:
                j11 j11Var = new j11(parcel);
                j11Var.g = parcel.readInt();
                return j11Var;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new ParcelImpl(parcel);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.g = parcel.readInt();
                parcelableVolumeInfo.i = parcel.readInt();
                parcelableVolumeInfo.j = parcel.readInt();
                parcelableVolumeInfo.k = parcel.readInt();
                parcelableVolumeInfo.h = parcel.readInt();
                return parcelableVolumeInfo;
            case 3:
                return new PlaybackStateCompat(parcel);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new l81(parcel);
            case 5:
                return new v81(parcel);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new l91(parcel);
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return new ProcessData(parcel);
            case 8:
                p91 p91Var = new p91();
                p91Var.g = parcel.readInt();
                p91Var.h = parcel.readInt();
                p91Var.i = parcel.readInt();
                p91Var.j = parcel.readInt();
                p91Var.k = parcel.readInt();
                p91Var.l = parcel.readInt();
                p91Var.m = parcel.readInt();
                p91Var.n = parcel.readInt();
                p91Var.o = parcel.readInt();
                p91Var.p = parcel.readInt();
                return p91Var;
            case rt0.o /* 9 */:
                ia1 ia1Var = new ia1();
                ia1Var.g = parcel.readInt();
                ia1Var.h = parcel.readInt();
                ia1Var.i = parcel.readString();
                ia1Var.j = parcel.readString();
                ia1Var.k = parcel.readFloat();
                ia1Var.l = parcel.readInt();
                ia1Var.m = parcel.readInt();
                ia1Var.n = parcel.readInt();
                ia1Var.o = parcel.readByte() != 0;
                ia1Var.p = parcel.readInt();
                ia1Var.q = parcel.readInt();
                ia1Var.r = parcel.readLong();
                ia1Var.s = parcel.readLong();
                ia1Var.t = parcel.readLong();
                ia1Var.u = parcel.readInt();
                ia1Var.v = parcel.readInt();
                return ia1Var;
            case 10:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 11:
                tg1 tg1Var = new tg1();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i2 = sg1.h;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(bl0.d);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof bl0)) {
                        al0 al0Var = new al0();
                        al0Var.g = readStrongBinder;
                        bl0Var = al0Var;
                    } else {
                        bl0Var = (bl0) queryLocalInterface;
                    }
                }
                tg1Var.g = bl0Var;
                return tg1Var;
            case 12:
                return new ll1(parcel);
            case 13:
                pm1 pm1Var = new pm1();
                pm1Var.g = parcel.readInt();
                pm1Var.h = parcel.readInt();
                pm1Var.i = parcel.readString();
                pm1Var.j = parcel.readString();
                pm1Var.k = parcel.readString();
                pm1Var.l = parcel.readByte() != 0;
                pm1Var.m = parcel.readByte() != 0;
                pm1Var.n = parcel.readInt();
                pm1Var.o = parcel.readLong();
                pm1Var.p = parcel.readLong();
                pm1Var.q = parcel.readInt();
                pm1Var.r = parcel.readInt();
                pm1Var.s = parcel.readInt();
                return pm1Var;
            case 14:
                mo1 mo1Var = new mo1();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                int i3 = yk0.g;
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(IGQCApxXGMWo.XRCtfwUCiErVR);
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof zk0)) {
                        xk0 xk0Var = new xk0();
                        xk0Var.g = readStrongBinder2;
                        zk0Var = xk0Var;
                    } else {
                        zk0Var = (zk0) queryLocalInterface2;
                    }
                }
                mo1Var.g = zk0Var;
                return mo1Var;
            case 15:
                hq1 hq1Var = new hq1();
                hq1Var.g = parcel.readInt();
                hq1Var.h = parcel.readInt();
                hq1Var.j = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    hq1Var.i = iArr;
                    parcel.readIntArray(iArr);
                }
                return hq1Var;
            case 16:
                iq1 iq1Var = new iq1();
                iq1Var.g = parcel.readInt();
                iq1Var.h = parcel.readInt();
                int readInt2 = parcel.readInt();
                iq1Var.i = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    iq1Var.j = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                iq1Var.k = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    iq1Var.l = iArr3;
                    parcel.readIntArray(iArr3);
                }
                iq1Var.n = parcel.readInt() == 1;
                iq1Var.o = parcel.readInt() == 1;
                iq1Var.p = parcel.readInt() == 1;
                iq1Var.m = parcel.readArrayList(hq1.class.getClassLoader());
                return iq1Var;
            case rt0.p /* 17 */:
                return new wq1(parcel);
            case 18:
                return new a22(parcel);
            case 19:
                int x0 = ju0.x0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < x0) {
                        int readInt4 = parcel.readInt();
                        char c = (char) readInt4;
                        if (c == 1) {
                            i = ju0.i0(parcel, readInt4);
                        } else if (c != 2) {
                            ju0.s0(parcel, readInt4);
                        } else {
                            Parcelable.Creator<nx0> creator = nx0.CREATOR;
                            int n0 = ju0.n0(parcel, readInt4);
                            int dataPosition = parcel.dataPosition();
                            if (n0 == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + n0);
                        }
                    }
                    ju0.s(parcel, x0);
                    return new lw1(i, arrayList);
                    break;
                }
            case 20:
                int x02 = ju0.x0(parcel);
                int i4 = 0;
                while (parcel.dataPosition() < x02) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        i = ju0.i0(parcel, readInt5);
                    } else if (c2 == 2) {
                        i4 = ju0.i0(parcel, readInt5);
                    } else if (c2 != 3) {
                        ju0.s0(parcel, readInt5);
                    } else {
                        intent = (Intent) ju0.m(parcel, readInt5, Intent.CREATOR);
                    }
                }
                ju0.s(parcel, x02);
                return new if2(i, i4, intent);
            case 21:
                int x03 = ju0.x0(parcel);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                String str8 = null;
                int i5 = 0;
                while (parcel.dataPosition() < x03) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            i5 = ju0.i0(parcel, readInt6);
                            break;
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            str = ju0.n(parcel, readInt6);
                            break;
                        case 3:
                            str2 = ju0.n(parcel, readInt6);
                            break;
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            str3 = ju0.n(parcel, readInt6);
                            break;
                        case 5:
                            str4 = ju0.n(parcel, readInt6);
                            break;
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            uri = (Uri) ju0.m(parcel, readInt6, Uri.CREATOR);
                            break;
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            str5 = ju0.n(parcel, readInt6);
                            break;
                        case '\b':
                            ju0.F0(parcel, readInt6, 8);
                            j = parcel.readLong();
                            break;
                        case rt0.o /* 9 */:
                            str6 = ju0.n(parcel, readInt6);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int n02 = ju0.n0(parcel, readInt6);
                            int dataPosition2 = parcel.dataPosition();
                            if (n02 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition2 + n02);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str7 = ju0.n(parcel, readInt6);
                            break;
                        case '\f':
                            str8 = ju0.n(parcel, readInt6);
                            break;
                        default:
                            ju0.s0(parcel, readInt6);
                            break;
                    }
                }
                ju0.s(parcel, x03);
                return new GoogleSignInAccount(i5, str, str2, str3, str4, uri, str5, j, str6, arrayList2, str7, str8);
            case 22:
                int x04 = ju0.x0(parcel);
                ArrayList<String> arrayList3 = null;
                String str9 = null;
                while (parcel.dataPosition() < x04) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        int n03 = ju0.n0(parcel, readInt7);
                        int dataPosition3 = parcel.dataPosition();
                        if (n03 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + n03);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        ju0.s0(parcel, readInt7);
                    } else {
                        str9 = ju0.n(parcel, readInt7);
                    }
                }
                ju0.s(parcel, x04);
                return new cg2(arrayList3, str9);
            case 23:
                int x05 = ju0.x0(parcel);
                mg2 mg2Var = null;
                while (parcel.dataPosition() < x05) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 1) {
                        i = ju0.i0(parcel, readInt8);
                    } else if (c4 == 2) {
                        uuVar = (uu) ju0.m(parcel, readInt8, uu.CREATOR);
                    } else if (c4 != 3) {
                        ju0.s0(parcel, readInt8);
                    } else {
                        mg2Var = (mg2) ju0.m(parcel, readInt8, mg2.CREATOR);
                    }
                }
                ju0.s(parcel, x05);
                return new gg2(i, uuVar, mg2Var);
            case 24:
                int x06 = ju0.x0(parcel);
                long j2 = 0;
                long j3 = 0;
                int i6 = -1;
                String str10 = null;
                String str11 = null;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < x06) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            i7 = ju0.i0(parcel, readInt9);
                            break;
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            i8 = ju0.i0(parcel, readInt9);
                            break;
                        case 3:
                            i9 = ju0.i0(parcel, readInt9);
                            break;
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            ju0.F0(parcel, readInt9, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            ju0.F0(parcel, readInt9, 8);
                            j3 = parcel.readLong();
                            break;
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            str10 = ju0.n(parcel, readInt9);
                            break;
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            str11 = ju0.n(parcel, readInt9);
                            break;
                        case '\b':
                            i10 = ju0.i0(parcel, readInt9);
                            break;
                        case rt0.o /* 9 */:
                            i6 = ju0.i0(parcel, readInt9);
                            break;
                        default:
                            ju0.s0(parcel, readInt9);
                            break;
                    }
                }
                ju0.s(parcel, x06);
                return new nx0(i7, i8, i9, j2, j3, str10, str11, i10, i6);
            case 25:
                int x07 = ju0.x0(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int i11 = 0;
                while (parcel.dataPosition() < x07) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 1) {
                        i = ju0.i0(parcel, readInt10);
                    } else if (c5 == 2) {
                        account = (Account) ju0.m(parcel, readInt10, Account.CREATOR);
                    } else if (c5 == 3) {
                        i11 = ju0.i0(parcel, readInt10);
                    } else if (c5 != 4) {
                        ju0.s0(parcel, readInt10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ju0.m(parcel, readInt10, GoogleSignInAccount.CREATOR);
                    }
                }
                ju0.s(parcel, x07);
                return new kg2(i, account, i11, googleSignInAccount);
            case 26:
                int x08 = ju0.x0(parcel);
                IBinder iBinder = null;
                uu uuVar2 = null;
                int i12 = 0;
                boolean z = false;
                boolean z2 = false;
                while (parcel.dataPosition() < x08) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        i12 = ju0.i0(parcel, readInt11);
                    } else if (c6 == 2) {
                        int n04 = ju0.n0(parcel, readInt11);
                        int dataPosition4 = parcel.dataPosition();
                        if (n04 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder3 = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + n04);
                            iBinder = readStrongBinder3;
                        }
                    } else if (c6 == 3) {
                        uuVar2 = (uu) ju0.m(parcel, readInt11, uu.CREATOR);
                    } else if (c6 == 4) {
                        z = ju0.g0(parcel, readInt11);
                    } else if (c6 != 5) {
                        ju0.s0(parcel, readInt11);
                    } else {
                        z2 = ju0.g0(parcel, readInt11);
                    }
                }
                ju0.s(parcel, x08);
                return new mg2(i12, iBinder, uuVar2, z, z2);
            case 27:
                int x09 = ju0.x0(parcel);
                PendingIntent pendingIntent = null;
                String str12 = null;
                Integer num = null;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < x09) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        i13 = ju0.i0(parcel, readInt12);
                    } else if (c7 == 2) {
                        i14 = ju0.i0(parcel, readInt12);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) ju0.m(parcel, readInt12, PendingIntent.CREATOR);
                    } else if (c7 == 4) {
                        str12 = ju0.n(parcel, readInt12);
                    } else if (c7 != 5) {
                        ju0.s0(parcel, readInt12);
                    } else {
                        int n05 = ju0.n0(parcel, readInt12);
                        if (n05 == 0) {
                            num = null;
                        } else {
                            if (n05 != 4) {
                                String hexString = Integer.toHexString(n05);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(n05).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(n05);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new pt(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                ju0.s(parcel, x09);
                return new uu(i13, i14, pendingIntent, str12, num);
            case 28:
                int x010 = ju0.x0(parcel);
                int i15 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < x010) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        i15 = ju0.i0(parcel, readInt13);
                    } else if (c8 == 2) {
                        z3 = ju0.g0(parcel, readInt13);
                    } else if (c8 == 3) {
                        z4 = ju0.g0(parcel, readInt13);
                    } else if (c8 == 4) {
                        i16 = ju0.i0(parcel, readInt13);
                    } else if (c8 != 5) {
                        ju0.s0(parcel, readInt13);
                    } else {
                        i17 = ju0.i0(parcel, readInt13);
                    }
                }
                ju0.s(parcel, x010);
                return new bi1(i15, z3, z4, i16, i17);
            default:
                return new pg2((PendingIntent) parcel.readParcelable(wg1.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f407a) {
            case 0:
                return new j11[i];
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new ParcelImpl[i];
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new ParcelableVolumeInfo[i];
            case 3:
                return new PlaybackStateCompat[i];
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new l81[i];
            case 5:
                return new v81[i];
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new l91[i];
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return new ProcessData[i];
            case 8:
                return new p91[i];
            case rt0.o /* 9 */:
                return new ia1[i];
            case 10:
                return new RatingCompat[i];
            case 11:
                return new tg1[i];
            case 12:
                return new ll1[i];
            case 13:
                return new pm1[i];
            case 14:
                return new mo1[i];
            case 15:
                return new hq1[i];
            case 16:
                return new iq1[i];
            case rt0.p /* 17 */:
                return new wq1[i];
            case 18:
                return new a22[i];
            case 19:
                return new lw1[i];
            case 20:
                return new if2[i];
            case 21:
                return new GoogleSignInAccount[i];
            case 22:
                return new cg2[i];
            case 23:
                return new gg2[i];
            case 24:
                return new nx0[i];
            case 25:
                return new kg2[i];
            case 26:
                return new mg2[i];
            case 27:
                return new uu[i];
            case 28:
                return new bi1[i];
            default:
                return new wg1[i];
        }
    }
}
