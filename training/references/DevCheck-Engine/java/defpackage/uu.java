package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import java.util.Arrays;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class uu extends g0 {
    public final int g;
    public final int h;
    public final PendingIntent i;
    public final String j;
    public final Integer k;
    public static final uu l = new uu(0, null, null);
    public static final Parcelable.Creator<uu> CREATOR = new i11(27);

    public uu(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.g = i;
        this.h = i2;
        this.i = pendingIntent;
        this.j = str;
        this.k = num;
    }

    public uu(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return YHJbtPFAANaPQ.dHzO;
            case 0:
                return "SUCCESS";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "SERVICE_MISSING";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return "RESOLUTION_REQUIRED";
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case rt0.o /* 9 */:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return GFUHKHDfiFuPm.qdsmVmTvFTZvwJh;
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case rt0.p /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(YHJbtPFAANaPQ.FWXKXuxDHIH);
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return this.h == uuVar.h && md2.j(this.i, uuVar.i) && md2.j(this.j, uuVar.j) && md2.j(this.k, uuVar.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.i, this.j, this.k});
    }

    public final String toString() {
        u40 u40Var = new u40(this);
        u40Var.f("statusCode", a(this.h));
        u40Var.f("resolution", this.i);
        u40Var.f(QCeVODiUkb.nyO, this.j);
        u40Var.f("clientMethodKey", this.k);
        return u40Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = md2.J(parcel, 20293);
        md2.I(parcel, 1, 4);
        parcel.writeInt(this.g);
        md2.I(parcel, 2, 4);
        parcel.writeInt(this.h);
        md2.D(parcel, 3, this.i, i);
        md2.E(parcel, 4, this.j);
        Integer num = this.k;
        if (num != null) {
            md2.I(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        md2.K(parcel, J);
    }
}
