package defpackage;

import android.app.Application;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class r61 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ s61 h;

    public /* synthetic */ r61(s61 s61Var, int i) {
        this.g = i;
        this.h = s61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PackageManager packageManager;
        int i;
        PackageInfo packageInfo;
        int i2;
        String[] strArr;
        Iterator it;
        String str;
        int i3 = this.g;
        s61 s61Var = this.h;
        switch (i3) {
            case 0:
                Collator collator = s61.k;
                s61Var.d();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ArrayList arrayList = s61Var.d;
                PackageManager packageManager2 = s61Var.i;
                Application application = s61Var.b;
                if (!s61Var.h) {
                    try {
                        s61Var.h = true;
                        arrayList.clear();
                        application.getClass();
                        String string = Settings.Secure.getString(application.getContentResolver(), "enabled_accessibility_services");
                        HashMap hashMap = new HashMap();
                        Iterator it2 = ((List) s61Var.e.d()).iterator();
                        while (it2.hasNext()) {
                            x7 x7Var = (x7) it2.next();
                            boolean z = x7Var.b;
                            String str2 = x7Var.f1168a;
                            ApplicationInfo applicationInfo = x7Var.c;
                            if (!z || i51.b("ppss").booleanValue()) {
                                PackageInfo packageInfo2 = packageManager2.getPackageInfo(str2, 12288);
                                String[] strArr2 = packageInfo2.requestedPermissions;
                                ArrayList C = d10.C();
                                j61 j61Var = j61.i;
                                j61 j61Var2 = j61.h;
                                j61 j61Var3 = j61.g;
                                if (strArr2 != null) {
                                    int length = strArr2.length;
                                    int i4 = 0;
                                    while (i4 < length) {
                                        int i5 = length;
                                        try {
                                            str = strArr2[i4];
                                        } catch (Exception unused) {
                                        }
                                        if (str.contains("android.permission")) {
                                            if (hashMap.get(str) == null) {
                                                it = it2;
                                                try {
                                                    strArr = strArr2;
                                                } catch (Exception unused2) {
                                                    strArr = strArr2;
                                                }
                                                try {
                                                    Drawable x = d10.x(application, str, d10.v(str));
                                                    d10.u(application, str);
                                                    i2 = i4;
                                                    try {
                                                        hashMap.put(str, new a71(x, str, d10.A(application, str)));
                                                    } catch (Exception unused3) {
                                                        packageInfo = packageInfo2;
                                                        i4 = i2 + 1;
                                                        length = i5;
                                                        it2 = it;
                                                        strArr2 = strArr;
                                                        packageInfo2 = packageInfo;
                                                    }
                                                } catch (Exception unused4) {
                                                    i2 = i4;
                                                    packageInfo = packageInfo2;
                                                    i4 = i2 + 1;
                                                    length = i5;
                                                    it2 = it;
                                                    strArr2 = strArr;
                                                    packageInfo2 = packageInfo;
                                                }
                                            } else {
                                                it = it2;
                                                strArr = strArr2;
                                                i2 = i4;
                                            }
                                            boolean z2 = (packageInfo2.requestedPermissionsFlags[i2] & 2) == 2;
                                            j61 j61Var4 = C.contains(str) ? j61Var : z2 ? j61Var3 : j61Var2;
                                            if (d10.D().contains(str)) {
                                                j61Var4 = z2 ? j61Var3 : j61Var2;
                                            }
                                            packageInfo = packageInfo2;
                                            try {
                                                ((a71) hashMap.get(str)).a().put(str2, new y61(str2, packageManager2.getApplicationLabel(applicationInfo).toString(), j61Var4, 5));
                                            } catch (Exception unused5) {
                                            }
                                            i4 = i2 + 1;
                                            length = i5;
                                            it2 = it;
                                            strArr2 = strArr;
                                            packageInfo2 = packageInfo;
                                        }
                                        it = it2;
                                        packageInfo = packageInfo2;
                                        strArr = strArr2;
                                        i2 = i4;
                                        i4 = i2 + 1;
                                        length = i5;
                                        it2 = it;
                                        strArr2 = strArr;
                                        packageInfo2 = packageInfo;
                                    }
                                }
                                Iterator it3 = it2;
                                try {
                                    ServiceInfo[] serviceInfoArr = packageManager2.getPackageInfo(str2, 8196).services;
                                    ActivityInfo[] activityInfoArr = packageManager2.getPackageInfo(str2, 8194).receivers;
                                    ArrayList arrayList2 = new ArrayList();
                                    try {
                                        int length2 = serviceInfoArr.length;
                                        int i6 = 0;
                                        while (i6 < length2) {
                                            ServiceInfo serviceInfo = serviceInfoArr[i6];
                                            ServiceInfo[] serviceInfoArr2 = serviceInfoArr;
                                            String str3 = serviceInfo.permission;
                                            if (str3 != null && !arrayList2.contains(str3)) {
                                                arrayList2.add(serviceInfo.permission);
                                            }
                                            i6++;
                                            serviceInfoArr = serviceInfoArr2;
                                        }
                                    } catch (NullPointerException unused6) {
                                    }
                                    try {
                                        for (ActivityInfo activityInfo : activityInfoArr) {
                                            String str4 = activityInfo.permission;
                                            if (str4 != null && !arrayList2.contains(str4)) {
                                                arrayList2.add(activityInfo.permission);
                                            }
                                        }
                                    } catch (NullPointerException unused7) {
                                    }
                                    int size = arrayList2.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Object obj = arrayList2.get(i7);
                                        i7++;
                                        String str5 = (String) obj;
                                        if (str5.contains("android.permission")) {
                                            if (hashMap.get(str5) == null) {
                                                Drawable x2 = d10.x(application, str5, d10.v(str5));
                                                d10.u(application, str5);
                                                i = size;
                                                hashMap.put(str5, new a71(x2, str5, d10.A(application, str5)));
                                            } else {
                                                i = size;
                                            }
                                            packageManager = packageManager2;
                                            try {
                                                ((a71) hashMap.get(str5)).a().put(str2, new y61(str2, packageManager2.getApplicationLabel(applicationInfo).toString(), str5.equals("android.permission.BIND_ACCESSIBILITY_SERVICE") ? (string == null || !string.contains(str2)) ? j61Var2 : j61Var3 : j61Var, 5));
                                                size = i;
                                                packageManager2 = packageManager;
                                            } catch (Exception unused8) {
                                            }
                                        }
                                    }
                                } catch (Exception unused9) {
                                }
                                packageManager = packageManager2;
                                it2 = it3;
                                packageManager2 = packageManager;
                            }
                        }
                        Iterator it4 = hashMap.entrySet().iterator();
                        while (it4.hasNext()) {
                            arrayList.add((a71) ((Map.Entry) it4.next()).getValue());
                        }
                        arrayList.sort(new a9(14));
                        s61Var.d();
                    } catch (Exception unused10) {
                    }
                    s61Var.h = false;
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                s61Var.c.i(new ArrayList());
                break;
            default:
                s61Var.c.i(s61Var.d);
                break;
        }
    }
}
