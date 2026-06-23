package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.material.behavior.YqV.Gvyagftz;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class he2 extends Binder implements IInterface {
    public final /* synthetic */ int g;

    public /* synthetic */ he2(int i) {
        this.g = i;
    }

    public he2(String str) {
        this.g = 3;
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.g;
        return this;
    }

    public boolean i(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        sq1 sq1Var = null;
        Exception exc = null;
        int i3 = 0;
        Object[] objArr = 0;
        switch (this.g) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                oe2 oe2Var = (oe2) this;
                nv1 nv1Var = oe2Var.h;
                qe2 qe2Var = oe2Var.i;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) ve2.a(parcel);
                    ve2.b(parcel);
                    switch (oe2Var.j) {
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            oe2Var.k(bundle);
                            oe2Var.k.b("onWarmUpExpressIntegrityToken", new Object[0]);
                            oe2Var.l.d.getClass();
                            int i4 = bundle.getInt("error");
                            if (i4 != 0) {
                                bundle.getBoolean("is.error.remediable");
                                sq1Var = new sq1(i4, null);
                            }
                            nv1 nv1Var2 = oe2Var.h;
                            if (sq1Var != null) {
                                nv1Var2.a(sq1Var);
                                return true;
                            }
                            nv1Var2.b(Long.valueOf(bundle.getLong("warm.up.sid")));
                            return true;
                        default:
                            oe2Var.k(bundle);
                            return true;
                    }
                }
                if (i != 3) {
                    if (i == 4) {
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        ve2.b(parcel);
                        qe2Var.e.c(nv1Var);
                        return true;
                    }
                    if (i != 5) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    ve2.b(parcel);
                    qe2Var.e.c(nv1Var);
                    return true;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) ve2.a(parcel);
                ve2.b(parcel);
                switch (oe2Var.j) {
                    case 0:
                        nv1 nv1Var3 = oe2Var.h;
                        oe2Var.j(bundle2);
                        oe2Var.k.b("onRequestExpressIntegrityToken", new Object[0]);
                        oe2Var.l.d.getClass();
                        int i5 = bundle2.getInt("error");
                        if (i5 != 0) {
                            bundle2.getBoolean("is.error.remediable");
                            exc = new sq1(i5, null);
                        }
                        if (exc != null) {
                            nv1Var3.a(exc);
                            return true;
                        }
                        bundle2.getLong("request.token.sid");
                        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + bPnJ.scqasIntXPOnbo).concat("IntegrityDialogWrapper");
                        String string = bundle2.getString(Gvyagftz.fOtM);
                        if (string != null) {
                            nv1Var3.b(new se2(string));
                            return true;
                        }
                        jw0.f("Null token");
                        return true;
                    default:
                        oe2Var.j(bundle2);
                        return true;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                vf2 vf2Var = (vf2) this;
                switch (i) {
                    case 3:
                        rf2.b(parcel);
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        rf2.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        rf2.b(parcel);
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        rf2.b(parcel);
                        break;
                    case 8:
                        gg2 gg2Var = (gg2) rf2.a(parcel, gg2.CREATOR);
                        rf2.b(parcel);
                        vf2Var.i.post(new hk2(vf2Var, gg2Var, 17, objArr == true ? 1 : 0));
                        break;
                    case rt0.o /* 9 */:
                        rf2.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                xh2 xh2Var = (xh2) this;
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                int i6 = eh2.f234a;
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(d51.q("Parcel data not fully consumed, unread size: ", dataAvail));
                }
                so2 so2Var = xh2Var.h;
                Integer valueOf = Integer.valueOf(readInt);
                so2Var.d = true;
                wo2 wo2Var = so2Var.b;
                if (wo2Var == null) {
                    return true;
                }
                uo2 uo2Var = wo2Var.h;
                uo2Var.getClass();
                if (!ro2.l.P(uo2Var, null, valueOf)) {
                    return true;
                }
                ro2.d(uo2Var);
                so2Var.f948a = null;
                so2Var.b = null;
                so2Var.c = null;
                return true;
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return i(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                rl2 rl2Var = (rl2) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator5 = Bundle.CREATOR;
                int i7 = bi2.f87a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator5.createFromParcel(parcel) : null);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(d51.q("Parcel data not fully consumed, unread size: ", dataAvail2));
                }
                vo2 vo2Var = rl2Var.j.f238a;
                if (vo2Var != null) {
                    nv1 nv1Var4 = rl2Var.i;
                    synchronized (vo2Var.f) {
                        vo2Var.e.remove(nv1Var4);
                    }
                    vo2Var.a().post(new mo2(i3, vo2Var));
                }
                rl2Var.h.b("onGetLaunchReviewFlowInfo", new Object[0]);
                rl2Var.i.b(new pg2((PendingIntent) bundle3.get("confirmation_intent"), bundle3.getBoolean("is_review_no_op")));
                return true;
        }
    }
}
