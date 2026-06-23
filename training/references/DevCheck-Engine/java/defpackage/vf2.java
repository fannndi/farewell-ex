package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class vf2 extends he2 implements lg0, mg0 {
    public static final hf2 o = xf2.f1183a;
    public final Context h;
    public final Handler i;
    public final hf2 j;
    public final Set k;
    public final yf l;
    public uo1 m;
    public of2 n;

    public vf2(Context context, lg2 lg2Var, yf yfVar) {
        super(1);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.h = context;
        this.i = lg2Var;
        this.l = yfVar;
        this.k = (Set) yfVar.b;
        this.j = o;
    }

    @Override // defpackage.lg0
    public final void a(int i) {
        of2 of2Var = this.n;
        mf2 mf2Var = (mf2) ((ng0) of2Var.l).j.get((u4) of2Var.i);
        if (mf2Var != null) {
            if (mf2Var.o) {
                mf2Var.p(new uu(17, null, null));
            } else {
                mf2Var.a(i);
            }
        }
    }

    @Override // defpackage.mg0
    public final void b(uu uuVar) {
        this.n.a(uuVar);
    }

    @Override // defpackage.lg0
    public final void d() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        uo1 uo1Var = this.m;
        uo1Var.getClass();
        boolean z = false;
        try {
            try {
                uo1Var.z.getClass();
                Account account = new Account("<<default account>>", "com.google");
                try {
                    if ("<<default account>>".equals(account.name)) {
                        Context context = uo1Var.c;
                        ReentrantLock reentrantLock = ir1.c;
                        xc1.j(context);
                        ReentrantLock reentrantLock2 = ir1.c;
                        reentrantLock2.lock();
                        try {
                            if (ir1.d == null) {
                                ir1.d = new ir1(context.getApplicationContext());
                            }
                            ir1 ir1Var = ir1.d;
                            reentrantLock2.unlock();
                            String a2 = ir1Var.a(XmJDY.FBmI);
                            if (!TextUtils.isEmpty(a2)) {
                                String a3 = ir1Var.a("googleSignInAccount:" + a2);
                                if (a3 != null) {
                                    try {
                                        googleSignInAccount = GoogleSignInAccount.a(a3);
                                    } catch (JSONException unused) {
                                    }
                                    Integer num = uo1Var.B;
                                    xc1.j(num);
                                    kg2 kg2Var = new kg2(2, account, num.intValue(), googleSignInAccount);
                                    zf2 zf2Var = (zf2) uo1Var.q();
                                    obtain = Parcel.obtain();
                                    obtain.writeInterfaceToken(zf2Var.i);
                                    int i = rf2.f891a;
                                    obtain.writeInt(1);
                                    int J = md2.J(obtain, 20293);
                                    md2.I(obtain, 1, 4);
                                    obtain.writeInt(1);
                                    md2.D(obtain, 2, kg2Var, 0);
                                    md2.K(obtain, J);
                                    obtain.writeStrongBinder(this);
                                    obtain2 = Parcel.obtain();
                                    zf2Var.h.transact(12, obtain, obtain2, 0);
                                    obtain2.readException();
                                    obtain.recycle();
                                    obtain2.recycle();
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    zf2Var.h.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain.recycle();
                    obtain2.recycle();
                    return;
                } catch (Throwable th2) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th2;
                }
                googleSignInAccount = null;
                Integer num2 = uo1Var.B;
                xc1.j(num2);
                kg2 kg2Var2 = new kg2(2, account, num2.intValue(), googleSignInAccount);
                zf2 zf2Var2 = (zf2) uo1Var.q();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(zf2Var2.i);
                int i2 = rf2.f891a;
                obtain.writeInt(1);
                int J2 = md2.J(obtain, 20293);
                md2.I(obtain, 1, 4);
                obtain.writeInt(1);
                md2.D(obtain, 2, kg2Var2, 0);
                md2.K(obtain, J2);
                obtain.writeStrongBinder(this);
                obtain2 = Parcel.obtain();
            } catch (RemoteException unused2) {
                this.i.post(new hk2(this, new gg2(1, new uu(8, null, null), null), 17, z));
            }
        } catch (RemoteException unused3) {
        }
    }
}
