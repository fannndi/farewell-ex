package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class j implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f455a;

    public /* synthetic */ j(int i) {
        this.f455a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f455a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return k.h;
                }
                c.n("superState must be null");
                return null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new ll(parcel, null);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new vp(parcel, null);
            case 3:
                return new mx(parcel, null);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new kd0(parcel, null);
            case 5:
                return new yu0(parcel, null);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new d11(parcel, null);
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return new b61(parcel, null);
            case 8:
                return new me1(parcel, null);
            case rt0.o /* 9 */:
                return new el1(parcel, null);
            case 10:
                return new to1(parcel, null);
            case 11:
                return new vx1(parcel, null);
            case 12:
                return new pz1(parcel, null);
            case 13:
                return new v72(parcel, null);
            default:
                f82 f82Var = new f82(parcel, null);
                f82Var.g = parcel.readInt();
                f82Var.h = parcel.readInt();
                f82Var.i = parcel.readParcelable(null);
                return f82Var;
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f455a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return k.h;
                }
                c.n("superState must be null");
                return null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new ll(parcel, classLoader);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new vp(parcel, classLoader);
            case 3:
                return new mx(parcel, classLoader);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new kd0(parcel, classLoader);
            case 5:
                return new yu0(parcel, classLoader);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new d11(parcel, classLoader);
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return new b61(parcel, classLoader);
            case 8:
                return new me1(parcel, classLoader);
            case rt0.o /* 9 */:
                return new el1(parcel, classLoader);
            case 10:
                return new to1(parcel, classLoader);
            case 11:
                return new vx1(parcel, classLoader);
            case 12:
                return new pz1(parcel, classLoader);
            case 13:
                return new v72(parcel, classLoader);
            default:
                f82 f82Var = new f82(parcel, classLoader);
                f82Var.g = parcel.readInt();
                f82Var.h = parcel.readInt();
                f82Var.i = parcel.readParcelable(classLoader);
                return f82Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f455a) {
            case 0:
                return new k[i];
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new ll[i];
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new vp[i];
            case 3:
                return new mx[i];
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new kd0[i];
            case 5:
                return new yu0[i];
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new d11[i];
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return new b61[i];
            case 8:
                return new me1[i];
            case rt0.o /* 9 */:
                return new el1[i];
            case 10:
                return new to1[i];
            case 11:
                return new vx1[i];
            case 12:
                return new pz1[i];
            case 13:
                return new v72[i];
            default:
                return new f82[i];
        }
    }
}
