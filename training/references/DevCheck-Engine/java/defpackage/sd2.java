package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sd2 extends ef2 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public sd2(d9 d9Var, IBinder iBinder) {
        this.i = iBinder;
        this.j = d9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(qe2 qe2Var, nv1 nv1Var, Context context) {
        super(nv1Var);
        this.i = context;
        this.j = qe2Var;
    }

    @Override // defpackage.ef2
    public final void b() {
        af2 ye2Var;
        String str;
        int i = this.h;
        int i2 = 0;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                vd2 vd2Var = (vd2) ((d9) obj).b;
                x42 x42Var = vd2Var.i;
                ArrayList arrayList = vd2Var.d;
                df2 df2Var = vd2Var.b;
                IBinder iBinder = (IBinder) obj2;
                x42Var.getClass();
                int i3 = ze2.h;
                if (iBinder == null) {
                    ye2Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                    ye2Var = queryLocalInterface instanceof af2 ? (af2) queryLocalInterface : new ye2(iBinder);
                }
                vd2Var.n = ye2Var;
                df2Var.b("linkToDeath", new Object[0]);
                try {
                    ((ye2) vd2Var.n).g.linkToDeath(vd2Var.k, 0);
                } catch (RemoteException e) {
                    df2Var.a(e, "linkToDeath failed", new Object[0]);
                }
                vd2Var.g = false;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    ((Runnable) obj3).run();
                }
                arrayList.clear();
                break;
            default:
                Context context = (Context) obj2;
                nv1 nv1Var = ((qe2) obj).c;
                df2 df2Var2 = xd2.f1179a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(jYVJoqfHJs.brSIBhKd, 64);
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        Signature[] signatureArr = packageInfo.signatures;
                        df2 df2Var3 = xd2.f1179a;
                        if (signatureArr == null || (signatureArr.length) == 0) {
                            Object[] objArr = new Object[0];
                            df2Var3.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                df2.c(df2Var3.f189a, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Signature signature : signatureArr) {
                                byte[] byteArray = signature.toByteArray();
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                    messageDigest.update(byteArray);
                                    str = Base64.encodeToString(messageDigest.digest(), 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    str = "";
                                }
                                arrayList2.add(str);
                                if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                                    String str2 = Build.TAGS;
                                    if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !YSHrxiHkAFcciU.aeWRx.equals(str)) {
                                    }
                                }
                                i2 = packageInfo.versionCode;
                            }
                            StringBuilder sb = new StringBuilder();
                            Iterator it = arrayList2.iterator();
                            if (it.hasNext()) {
                                while (true) {
                                    sb.append((CharSequence) it.next());
                                    if (it.hasNext()) {
                                        sb.append((CharSequence) ", ");
                                    }
                                }
                            }
                            String y = d51.y("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "].");
                            Object[] objArr2 = new Object[0];
                            df2Var3.getClass();
                            if (Log.isLoggable("PlayCore", 5)) {
                                df2.c(df2Var3.f189a, y, objArr2);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                nv1Var.b(Integer.valueOf(i2));
                break;
        }
    }
}
