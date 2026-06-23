package defpackage;

import Cwd.ynLVXgis;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.graphics.drawable.Drawable;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.system.Os;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class d10 {
    public static ExecutorService b;
    public static volatile Context f;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f164a = new Object();
    public static final byte[] c = new byte[1];
    public static final int[] d = {R.attr.colorPrimary};
    public static final int[] e = {R.attr.colorPrimaryVariant};

    public static String A(Context context, String str) {
        String str2 = BFtDZYxPcpGN.tbPsbRiWl;
        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
            return context.getString(R.string.display_on_top);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            String charSequence = packageManager.getPermissionInfo(str, rt0.s).loadLabel(packageManager).toString();
            if (charSequence.startsWith("android.permission.") || charSequence.startsWith("com.") || charSequence.contains("_")) {
                String z = z(context, str);
                return z.equals(str) ? uz1.b(str.substring(str.lastIndexOf(str2) + 1).replace("_", " ")) : z;
            }
            try {
                return charSequence.substring(0, 1).toUpperCase() + charSequence.substring(1);
            } catch (Exception unused) {
                return uz1.b(str.substring(str.lastIndexOf(str2) + 1).replace("_", " "));
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return uz1.b(str.substring(str.lastIndexOf(str2) + 1).replace("_", " "));
        }
    }

    public static h52 B(g52 g52Var) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(11, 1);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(currentTimeMillis);
        if (calendar2.get(11) < 1) {
            timeInMillis -= 86400000;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        return g52Var == g52.g ? new h52(timeInMillis, currentTimeMillis2) : g52Var == g52.h ? new h52(currentTimeMillis2 - 604800000, currentTimeMillis2) : new h52(currentTimeMillis2 - 2592000000L, currentTimeMillis2);
    }

    public static ArrayList C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.BATTERY_STATS");
        arrayList.add(nTAZxGMqQtZZAQ.NGz);
        arrayList.add("android.permission.BIND_AUTOFILL_SERVICE");
        arrayList.add("android.permission.BIND_DEVICE_ADMIN");
        arrayList.add("android.permission.BIND_DREAM_SERVICE");
        arrayList.add("android.permission.BIND_INPUT_METHOD");
        arrayList.add("android.permission.BIND_MIDI_DEVICE_SERVICE");
        arrayList.add("android.permission.BIND_NFC_SERVICE");
        arrayList.add("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE");
        arrayList.add("android.permission.BIND_PRINT_SERVICE");
        arrayList.add("android.permission.BIND_QUICK_ACCESS_WALLET_SERVICE");
        arrayList.add("android.permission.BIND_REMOTEVIEWS");
        arrayList.add("android.permission.BIND_TEXT_SERVICE");
        arrayList.add("android.permission.BIND_TV_INPUT");
        arrayList.add("android.permission.BIND_VOICE_INTERACTION");
        arrayList.add("android.permission.BIND_VPN_SERVICE");
        arrayList.add("android.permission.BIND_VR_LISTENER_SERVICE");
        arrayList.add("android.permission.BIND_WALLPAPER");
        arrayList.add("android.permission.GLOBAL_SEARCH");
        arrayList.add("android.permission.INSTANT_APP_FOREGROUND_SERVICE");
        arrayList.add("android.permission.MANAGE_MEDIA");
        arrayList.add("android.permission.MANAGE_ONGOING_CALLS");
        arrayList.add("android.permission.PACKAGE_USAGE_STATS");
        arrayList.add("com.android.voicemail.permission.READ_VOICEMAIL");
        arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
        arrayList.add("android.permission.SMS_FINANCIAL_TRANSACTIONS");
        arrayList.add("android.permission.START_VIEW_PERMISSION_USAGE");
        arrayList.add(BIxeFreLLop.UwhSvVtKOWRmcl);
        arrayList.add("android.permission.USE_ICC_AUTH_WITH_DEVICE_IDENTIFIER");
        arrayList.add("android.permission.WRITE_SETTINGS");
        arrayList.add("com.android.voicemail.permission.WRITE_VOICEMAIL");
        arrayList.add("android.permission.WRITE_SECURE_SETTINGS");
        arrayList.add("android.permission.READ_LOGS");
        arrayList.add("android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER");
        arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
        arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
        return arrayList;
    }

    public static ArrayList D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER");
        arrayList.add("android.permission.READ_LOGS");
        arrayList.add("android.permission.WRITE_SECURE_SETTINGS");
        arrayList.add("android.permission.BATTERY_STATS");
        return arrayList;
    }

    public static int F(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        c.m(d51.q("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static jp0 H(af0 af0Var) {
        ai1 ai1Var = ai1.o;
        r42 r42Var = new r42();
        r42Var.g = af0Var;
        r42Var.h = ai1Var;
        return r42Var;
    }

    public static String I(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder w = d51.w("<", str2, " threw ");
                    w.append(e2.getClass().getName());
                    w.append(ynLVXgis.GoYMtRSfxSKV);
                    sb = w.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf(UQdsoaJMID.qYGVLljarrGC, i3)) != -1) {
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static TypedArray J(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        c(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static fh K(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        c(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return new fh(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static void L(Context context, String str) {
        try {
            Intent intent = new Intent(str);
            intent.addFlags(1350565888);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final String N(dx dxVar) {
        Object pg1Var;
        if (dxVar instanceof z40) {
            return ((z40) dxVar).toString();
        }
        try {
            pg1Var = dxVar + '@' + r(dxVar);
        } catch (Throwable th) {
            pg1Var = new pg1(th);
        }
        if (qg1.a(pg1Var) != null) {
            pg1Var = dxVar.getClass().getName() + '@' + r(dxVar);
        }
        return (String) pg1Var;
    }

    public static th2 O(String str, Bundle bundle) {
        qj qjVar = li2.i;
        if (bundle == null) {
            int i = bk2.f89a;
            Log.isLoggable("BillingClient", 5);
            return new th2(54, qjVar);
        }
        int a2 = bk2.a("BillingClient", bundle);
        String e2 = bk2.e("BillingClient", bundle);
        cf a3 = qj.a();
        a3.f122a = a2;
        a3.b = e2;
        qj a4 = a3.a();
        if (a2 != 0) {
            Log.isLoggable("BillingClient", 5);
            return new th2(23, a4);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            Log.isLoggable("BillingClient", 5);
            return new th2(55, qjVar);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            Log.isLoggable("BillingClient", 5);
            return new th2(56, qjVar);
        }
        if (stringArrayList2 == null) {
            Log.isLoggable("BillingClient", 5);
            return new th2(57, qjVar);
        }
        if (stringArrayList3 == null) {
            Log.isLoggable("BillingClient", 5);
            return new th2(58, qjVar);
        }
        return new th2(1, li2.j);
    }

    public static boolean a(ContextThemeWrapper contextThemeWrapper, HashMap hashMap) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        ResourcesLoader resourcesLoader = null;
        try {
            byte[] o = kk1.o(contextThemeWrapper, hashMap);
            int length = o.length;
            if (o.length != 0) {
                try {
                    fileDescriptor = Os.memfd_create("temp.arsc", 0);
                    if (fileDescriptor != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                            try {
                                fileOutputStream.write(o);
                                ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                                try {
                                    s0.p();
                                    ResourcesLoader f2 = s0.f();
                                    loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                                    f2.addProvider(loadFromTable);
                                    if (dup != null) {
                                        dup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptor);
                                    resourcesLoader = f2;
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileDescriptor != null) {
                                Os.close(fileDescriptor);
                            }
                            throw th;
                        }
                    } else if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = null;
                }
            }
        } catch (Exception unused) {
        }
        if (resourcesLoader == null) {
            return false;
        }
        contextThemeWrapper.getResources().addLoaders(resourcesLoader);
        return true;
    }

    public static void c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yb1.W, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                e(context, e, "Theme.MaterialComponents");
            }
        }
        e(context, d, BFtDZYxPcpGN.KDkylx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = defpackage.yb1.W
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            defpackage.c.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d10.d(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void e(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                c.m(d51.y("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static int f(pe1 pe1Var, r70 r70Var, View view, View view2, de1 de1Var, boolean z) {
        if (de1Var.v() == 0 || pe1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(de1.G(view) - de1.G(view2)) + 1;
        }
        return Math.min(r70Var.n(), r70Var.d(view2) - r70Var.g(view));
    }

    public static int g(pe1 pe1Var, r70 r70Var, View view, View view2, de1 de1Var, boolean z, boolean z2) {
        if (de1Var.v() == 0 || pe1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (pe1Var.b() - Math.max(de1.G(view), de1.G(view2))) - 1) : Math.max(0, Math.min(de1.G(view), de1.G(view2)));
        if (z) {
            return Math.round((max * (Math.abs(r70Var.d(view2) - r70Var.g(view)) / (Math.abs(de1.G(view) - de1.G(view2)) + 1))) + (r70Var.m() - r70Var.g(view)));
        }
        return max;
    }

    public static int h(pe1 pe1Var, r70 r70Var, View view, View view2, de1 de1Var, boolean z) {
        if (de1Var.v() == 0 || pe1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return pe1Var.b();
        }
        return (int) (((r70Var.d(view2) - r70Var.g(view)) / (Math.abs(de1.G(view) - de1.G(view2)) + 1)) * pe1Var.b());
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    public static InputStream l(ks1 ks1Var) {
        File createTempFile;
        byte[] bArr = xn1.f1189a;
        if (ks1Var.b("[ -d @@ ]") || !ks1Var.b("[ -r @@ ]")) {
            throw new FileNotFoundException("No such file or directory: " + ks1Var.getPath());
        }
        File file = null;
        try {
            try {
                createTempFile = File.createTempFile(rlfWzcx.XYIkwxWKSwUINEe, null);
                createTempFile.delete();
                Os.mkfifo(createTempFile.getPath(), 420);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            ExecutorService executorService = wn1.m;
            rt0.k().e(new tb(ks1Var, 12, createTempFile));
            InputStream inputStream = (InputStream) wn1.m.submit(new tn1(1, createTempFile)).get(250L, TimeUnit.MILLISECONDS);
            createTempFile.delete();
            return inputStream;
        } catch (Exception e3) {
            e = e3;
            if (e instanceof FileNotFoundException) {
                throw ((FileNotFoundException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                throw ((FileNotFoundException) cause);
            }
            throw ((FileNotFoundException) new FileNotFoundException("Cannot open fifo").initCause(e));
        } catch (Throwable th2) {
            th = th2;
            file = createTempFile;
            if (file != null) {
                file.delete();
            }
            throw th;
        }
    }

    public static cw0 m(String str) {
        str.getClass();
        fh a2 = cw0.c.a(0, str);
        if (a2 == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((mu0) a2.j) == null) {
            a2.j = new mu0(a2);
        }
        mu0 mu0Var = (mu0) a2.j;
        mu0Var.getClass();
        String str2 = (String) mu0Var.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        if (((mu0) a2.j) == null) {
            a2.j = new mu0(a2);
        }
        mu0 mu0Var2 = (mu0) a2.j;
        mu0Var2.getClass();
        String lowerCase2 = ((String) mu0Var2.get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) a2.h;
        int i = tl2.K(matcher.start(), matcher.end()).h;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new cw0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            fh a3 = cw0.d.a(i2, str);
            if (a3 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            Matcher matcher2 = (Matcher) a3.h;
            nu0 nu0Var = (nu0) a3.i;
            lu0 c2 = nu0Var.c(1);
            String str3 = c2 != null ? c2.f606a : null;
            if (str3 == null) {
                i = tl2.K(matcher2.start(), matcher2.end()).h;
            } else {
                lu0 c3 = nu0Var.c(2);
                String str4 = c3 != null ? c3.f606a : null;
                if (str4 == null) {
                    lu0 c4 = nu0Var.c(3);
                    c4.getClass();
                    str4 = c4.f606a;
                } else if (str4.length() > 0 && ju0.t(str4.charAt(0), '\'', false) && str4.length() > 0 && ju0.t(str4.charAt(str4.length() - 1), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = tl2.K(matcher2.start(), matcher2.end()).h;
            }
        }
    }

    public static Context n() {
        Context context = f;
        if (context != null) {
            return context;
        }
        c.n("Contextor not initialized! Call initApplicationContext() first.");
        return null;
    }

    public static String o(Context context) {
        String E;
        if (i51.g("batWidgetTitle")) {
            return i51.e("batWidgetTitle");
        }
        try {
            E = !TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name")) ? sl.E() : Build.VERSION.SDK_INT >= 25 ? Settings.Global.getString(context.getContentResolver(), "device_name") : BluetoothAdapter.getDefaultAdapter().getName();
        } catch (Exception unused) {
            E = sl.E();
        }
        i51.l("batWidgetTitle", E);
        return E;
    }

    public static ArrayList p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.gms.permission.ACTIVITY_RECOGNITION");
        arrayList.add("android.permission.ACTIVITY_RECOGNITION");
        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
        arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
        arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        arrayList.add("android.permission.BODY_SENSORS");
        arrayList.add("android.permission.CALL_PHONE");
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.GET_ACCOUNTS");
        arrayList.add("android.permission.GET_ACCOUNTS_PRIVILEGED");
        arrayList.add("android.permission.PROCESS_OUTGOING_CALLS");
        arrayList.add("android.permission.READ_CALENDAR");
        arrayList.add("android.permission.READ_CALL_LOG");
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add(QCeVODiUkb.OcUA);
        arrayList.add(aEQQDLUUMo.bRcghPch);
        arrayList.add("android.permission.READ_PHONE_STATE");
        arrayList.add("android.permission.READ_SMS");
        arrayList.add("android.permission.RECEIVE_MMS");
        arrayList.add("android.permission.RECEIVE_SMS");
        arrayList.add("android.permission.RECEIVE_WAP_PUSH");
        arrayList.add("android.permission.RECORD_AUDIO");
        arrayList.add("android.permission.SEND_SMS");
        arrayList.add(aEQQDLUUMo.cSsxvrfU);
        arrayList.add("android.permission.UWB_RANGING");
        arrayList.add("android.permission.WRITE_CALENDAR");
        arrayList.add(CGvJMCDBOmCdj.WepZVE);
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        arrayList.add(jYVJoqfHJs.dmX);
        arrayList.add("android.permission.WRITE_MEDIA_STORAGE");
        arrayList.add("android.permission.READ_MEDIA_AUDIO");
        arrayList.add("android.permission.READ_MEDIA_VIDEO");
        arrayList.add("android.permission.READ_MEDIA_IMAGES");
        arrayList.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(163:0|1|(2:2|3)|(2:4|5)|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|(2:16|17)|(3:19|20|(1:24))|(3:26|(1:28)(1:421)|29)|(2:30|31)|(3:32|33|(1:37))|(3:39|40|(1:44))|(2:46|47)|48|(2:49|50)|(8:51|52|(1:54)|55|(1:57)|58|(1:60)|61)|(3:63|64|(1:66))|68|(2:69|70)|71|(4:72|73|(1:75)|76)|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(164:0|1|(2:2|3)|(2:4|5)|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|16|17|(3:19|20|(1:24))|(3:26|(1:28)(1:421)|29)|(2:30|31)|(3:32|33|(1:37))|(3:39|40|(1:44))|(2:46|47)|48|(2:49|50)|(8:51|52|(1:54)|55|(1:57)|58|(1:60)|61)|(3:63|64|(1:66))|68|(2:69|70)|71|(4:72|73|(1:75)|76)|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(179:0|1|(2:2|3)|4|5|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|16|17|(3:19|20|(1:24))|(3:26|(1:28)(1:421)|29)|(2:30|31)|32|33|(1:37)|39|40|(1:44)|(2:46|47)|48|(2:49|50)|51|52|(1:54)|55|(1:57)|58|(1:60)|61|(3:63|64|(1:66))|68|(2:69|70)|71|72|73|(1:75)|76|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(180:0|1|2|3|4|5|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|16|17|(3:19|20|(1:24))|(3:26|(1:28)(1:421)|29)|(2:30|31)|32|33|(1:37)|39|40|(1:44)|(2:46|47)|48|(2:49|50)|51|52|(1:54)|55|(1:57)|58|(1:60)|61|(3:63|64|(1:66))|68|(2:69|70)|71|72|73|(1:75)|76|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(184:0|1|2|3|4|5|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|16|17|(3:19|20|(1:24))|(3:26|(1:28)(1:421)|29)|30|31|32|33|(1:37)|39|40|(1:44)|(2:46|47)|48|(2:49|50)|51|52|(1:54)|55|(1:57)|58|(1:60)|61|63|64|(1:66)|68|69|70|71|72|73|(1:75)|76|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(189:0|1|2|3|4|5|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|16|17|19|20|(1:24)|26|(1:28)(1:421)|29|30|31|32|33|(1:37)|39|40|(1:44)|(2:46|47)|48|49|50|51|52|(1:54)|55|(1:57)|58|(1:60)|61|63|64|(1:66)|68|69|70|71|72|73|(1:75)|76|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Can't wrap try/catch for region: R(190:0|1|2|3|4|5|6|(3:7|8|(1:10))|12|(1:14)(1:425)|15|16|17|19|20|(1:24)|26|(1:28)(1:421)|29|30|31|32|33|(1:37)|39|40|(1:44)|46|47|48|49|50|51|52|(1:54)|55|(1:57)|58|(1:60)|61|63|64|(1:66)|68|69|70|71|72|73|(1:75)|76|(136:81|82|83|84|85|(1:87)(2:400|(1:402)(1:403))|(1:89)|91|92|(4:94|(1:96)|97|(1:99))|101|102|(1:106)|108|109|110|112|113|(1:115)(1:395)|(3:117|(1:119)(1:127)|(2:123|(1:125)))|128|129|(3:131|(1:138)(1:135)|136)|139|140|142|143|(3:145|(1:152)(1:149)|150)|153|154|155|(1:389)(1:159)|160|161|162|(1:166)|168|(2:384|385)|170|(2:173|171)|174|175|176|177|(1:179)(1:382)|180|181|(1:183)(1:380)|(1:185)(1:379)|186|187|188|(1:190)(3:371|(3:373|(1:375)|376)|377)|191|192|193|(1:195)(3:363|(3:365|(1:367)|368)|369)|196|197|198|(2:200|(2:202|(4:205|(2:207|208)(1:210)|209|203)))(1:361)|211|212|(3:214|(3:220|221|(3:223|224|225)(1:226))(3:216|217|218)|219)|228|229|(4:231|(1:233)(1:356)|(6:239|240|241|242|243|(2:248|249))(3:235|236|237)|238)|358|359|355|250|(1:252)|253|(1:255)|256|(1:258)|259|(1:261)|262|(1:264)|265|(1:267)|268|(1:270)|271|(1:273)|274|(1:276)|277|(1:279)|280|(1:282)|283|(1:285)|286|(1:288)|289|(1:291)|292|(1:294)|295|(1:297)|298|(1:300)|301|(1:303)|304|(1:306)|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322|(1:324)|325|(1:327)|328|(1:330)|331|(1:333)|334|(1:336)|337|(1:339)|340|(1:342)|343|(1:350)|347|348)|406|82|83|84|85|(0)(0)|(0)|91|92|(0)|101|102|(2:104|106)|108|109|110|112|113|(0)(0)|(0)|128|129|(0)|139|140|142|143|(0)|153|154|155|(1:157)|389|160|161|162|(2:164|166)|168|(0)|170|(1:171)|174|175|176|177|(0)(0)|180|181|(0)(0)|(0)(0)|186|187|188|(0)(0)|191|192|193|(0)(0)|196|197|198|(0)(0)|211|212|(0)|228|229|(0)|358|359|355|250|(0)|253|(0)|256|(0)|259|(0)|262|(0)|265|(0)|268|(0)|271|(0)|274|(0)|277|(0)|280|(0)|283|(0)|286|(0)|289|(0)|292|(0)|295|(0)|298|(0)|301|(0)|304|(0)|307|(0)|310|(0)|313|(0)|316|(0)|319|(0)|322|(0)|325|(0)|328|(0)|331|(0)|334|(0)|337|(0)|340|(0)|343|(1:345)|350|347|348) */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x03ac, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0297 A[Catch: Exception -> 0x02bd, TryCatch #27 {Exception -> 0x02bd, blocks: (B:113:0x028f, B:115:0x0297, B:117:0x029f, B:119:0x02a5, B:121:0x02ad, B:123:0x02b0, B:125:0x02bb), top: B:112:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029f A[Catch: Exception -> 0x02bd, TryCatch #27 {Exception -> 0x02bd, blocks: (B:113:0x028f, B:115:0x0297, B:117:0x029f, B:119:0x02a5, B:121:0x02ad, B:123:0x02b0, B:125:0x02bb), top: B:112:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c5 A[Catch: Exception -> 0x02e3, TryCatch #12 {Exception -> 0x02e3, blocks: (B:129:0x02bd, B:131:0x02c5, B:133:0x02cb, B:135:0x02d3, B:136:0x02d9), top: B:128:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0303 A[Catch: Exception -> 0x0321, TryCatch #14 {Exception -> 0x0321, blocks: (B:143:0x02ef, B:145:0x0303, B:147:0x0309, B:149:0x0311, B:150:0x0317), top: B:142:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0385 A[LOOP:0: B:171:0x037f->B:173:0x0385, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e6 A[Catch: Exception -> 0x03f8, TryCatch #5 {Exception -> 0x03f8, blocks: (B:188:0x03e0, B:190:0x03e6, B:371:0x03e9, B:373:0x03f1, B:377:0x03fa), top: B:187:0x03e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0404 A[Catch: Exception -> 0x0416, TryCatch #21 {Exception -> 0x0416, blocks: (B:193:0x03fe, B:195:0x0404, B:363:0x0407, B:365:0x040f, B:369:0x0418), top: B:192:0x03fe }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0428 A[Catch: Exception -> 0x04c8, TryCatch #29 {Exception -> 0x04c8, blocks: (B:198:0x041c, B:200:0x0428, B:203:0x042d, B:205:0x0430, B:207:0x0434, B:229:0x046d, B:231:0x0491, B:233:0x049b, B:240:0x04a8), top: B:197:0x041c }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x044c A[Catch: Exception -> 0x046d, TryCatch #2 {Exception -> 0x046d, blocks: (B:212:0x043f, B:214:0x044c, B:221:0x045e, B:224:0x0467), top: B:211:0x043f }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0491 A[Catch: Exception -> 0x04c8, TryCatch #29 {Exception -> 0x04c8, blocks: (B:198:0x041c, B:200:0x0428, B:203:0x042d, B:205:0x0430, B:207:0x0434, B:229:0x046d, B:231:0x0491, B:233:0x049b, B:240:0x04a8), top: B:197:0x041c }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0407 A[Catch: Exception -> 0x0416, TryCatch #21 {Exception -> 0x0416, blocks: (B:193:0x03fe, B:195:0x0404, B:363:0x0407, B:365:0x040f, B:369:0x0418), top: B:192:0x03fe }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x03e9 A[Catch: Exception -> 0x03f8, TryCatch #5 {Exception -> 0x03f8, blocks: (B:188:0x03e0, B:190:0x03e6, B:371:0x03e9, B:373:0x03f1, B:377:0x03fa), top: B:187:0x03e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0185 A[Catch: Exception -> 0x0195, TryCatch #23 {Exception -> 0x0195, blocks: (B:85:0x016d, B:87:0x0173, B:89:0x0193, B:400:0x0185), top: B:84:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173 A[Catch: Exception -> 0x0195, TryCatch #23 {Exception -> 0x0195, blocks: (B:85:0x016d, B:87:0x0173, B:89:0x0193, B:400:0x0185), top: B:84:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193 A[Catch: Exception -> 0x0195, TRY_LEAVE, TryCatch #23 {Exception -> 0x0195, blocks: (B:85:0x016d, B:87:0x0173, B:89:0x0193, B:400:0x0185), top: B:84:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019d A[Catch: Exception -> 0x01c7, TryCatch #30 {Exception -> 0x01c7, blocks: (B:92:0x0195, B:94:0x019d, B:96:0x01a1, B:97:0x01a7, B:99:0x01ab), top: B:91:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d10.q(android.content.Context):java.lang.String");
    }

    public static final String r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static ArrayList s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.BIND_JOB_SERVICE");
        arrayList.add("android.permission.BIND_QUICK_SETTINGS_TILE");
        arrayList.add("android.permission.BIND_REMOTEVIEWS");
        arrayList.add("android.permission.DUMP");
        arrayList.add("android.permission.FLASHLIGHT");
        arrayList.add("android.permission.SUBSCRIBED_FEEDS_WRITE");
        arrayList.add("android.permission.SUBSCRIBED_FEEDS_READ");
        arrayList.add(CGvJMCDBOmCdj.YpXqk);
        arrayList.add("com.android.browser.permission.WRITE_HISTORY_BOOKMARKS");
        arrayList.add("com.android.browser.permission.READ_HISTORY_BOOKMARKS");
        arrayList.add("android.permission.WRITE_USER_DICTIONARY");
        arrayList.add("android.permission.READ_USER_DICTIONARY");
        arrayList.add(MiGPiFgcCQCVh.keB);
        arrayList.add("android.permission.READ_SOCIAL_STREAM");
        arrayList.add("android.permission.WRITE_PROFILE");
        arrayList.add("android.permission.READ_PROFILE");
        return arrayList;
    }

    public static final ao t(dx dxVar) {
        if (!(dxVar instanceof z40)) {
            return new ao(1, dxVar);
        }
        ao o = ((z40) dxVar).o();
        if (o != null) {
            if (!o.F()) {
                o = null;
            }
            if (o != null) {
                return o;
            }
        }
        return new ao(2, dxVar);
    }

    public static String u(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getResourcesForApplication("android").getString(packageManager.getPermissionInfo(str, 0).descriptionRes);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String v(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2146256447:
                if (str.equals("android.permission.health.READ_RESTING_HEART_RATE")) {
                    c2 = 0;
                    break;
                }
                break;
            case -2123701411:
                if (str.equals("android.permission.health.WRITE_BASAL_METABOLIC_RATE")) {
                    c2 = 1;
                    break;
                }
                break;
            case -2062864405:
                if (str.equals(YHJbtPFAANaPQ.yMbwECOjvJ)) {
                    c2 = 2;
                    break;
                }
                break;
            case -2062386608:
                if (str.equals(QCeVODiUkb.pcbNGMM)) {
                    c2 = 3;
                    break;
                }
                break;
            case -1944110761:
                if (str.equals("android.permission.health.READ_ELEVATION_GAINED")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1931441037:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_PERSONAL_DETAILS")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1928411001:
                if (str.equals("android.permission.READ_CALENDAR")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1925850455:
                if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1921431796:
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1916801016:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_CONDITIONS")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1813079487:
                if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1809335533:
                if (str.equals("android.permission.health.WRITE_POWER")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1806671643:
                if (str.equals("android.permission.health.WRITE_SLEEP")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -1806552491:
                if (str.equals("android.permission.health.WRITE_SPEED")) {
                    c2 = 14;
                    break;
                }
                break;
            case -1806432971:
                if (str.equals("android.permission.health.WRITE_STEPS")) {
                    c2 = 15;
                    break;
                }
                break;
            case -1806400955:
                if (str.equals("android.permission.health.READ_ACTIVE_CALORIES_BURNED")) {
                    c2 = 16;
                    break;
                }
                break;
            case -1806349618:
                if (str.equals("android.permission.health.READ_BASAL_BODY_TEMPERATURE")) {
                    c2 = 17;
                    break;
                }
                break;
            case -1804588487:
                if (str.equals("android.permission.health.READ_HEART_RATE_VARIABILITY")) {
                    c2 = 18;
                    break;
                }
                break;
            case -1767298993:
                if (str.equals("android.permission.health.READ_LEAN_BODY_MASS")) {
                    c2 = 19;
                    break;
                }
                break;
            case -1743287028:
                if (str.equals("android.permission.health.WRITE_INTERMENSTRUAL_BLEEDING")) {
                    c2 = 20;
                    break;
                }
                break;
            case -1685169921:
                if (str.equals("android.permission.health.WRITE_OXYGEN_SATURATION")) {
                    c2 = 21;
                    break;
                }
                break;
            case -1674700861:
                if (str.equals("android.permission.ANSWER_PHONE_CALLS")) {
                    c2 = 22;
                    break;
                }
                break;
            case -1508181510:
                if (str.equals("android.permission.health.READ_OXYGEN_SATURATION")) {
                    c2 = 23;
                    break;
                }
                break;
            case -1479758289:
                if (str.equals(yttXLrAeLjN.nXDsBYglsn)) {
                    c2 = 24;
                    break;
                }
                break;
            case -1424900102:
                if (str.equals("android.permission.health.READ_EXERCISE_ROUTES")) {
                    c2 = 25;
                    break;
                }
                break;
            case -1398207758:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_SOCIAL_HISTORY")) {
                    c2 = 26;
                    break;
                }
                break;
            case -1329819996:
                if (str.equals("android.permission.health.WRITE_SKIN_TEMPERATURE")) {
                    c2 = 27;
                    break;
                }
                break;
            case -1238066820:
                if (str.equals("android.permission.BODY_SENSORS")) {
                    c2 = 28;
                    break;
                }
                break;
            case -1188384688:
                if (str.equals("android.permission.health.WRITE_MINDFULNESS")) {
                    c2 = 29;
                    break;
                }
                break;
            case -1164582768:
                if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c2 = 30;
                    break;
                }
                break;
            case -1142799244:
                if (str.equals("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                    c2 = 31;
                    break;
                }
                break;
            case -1085971457:
                if (str.equals(XmJDY.zihV)) {
                    c2 = ' ';
                    break;
                }
                break;
            case -1021284917:
                if (str.equals("android.permission.health.READ_HEALTH_DATA_HISTORY")) {
                    c2 = '!';
                    break;
                }
                break;
            case -1020546037:
                if (str.equals("android.permission.health.WRITE_WHEELCHAIR_PUSHES")) {
                    c2 = '\"';
                    break;
                }
                break;
            case -946019174:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_LABORATORY_RESULTS")) {
                    c2 = '#';
                    break;
                }
                break;
            case -895679497:
                if (str.equals("android.permission.RECEIVE_MMS")) {
                    c2 = '$';
                    break;
                }
                break;
            case -895673731:
                if (str.equals(CGvJMCDBOmCdj.quTjtcM)) {
                    c2 = '%';
                    break;
                }
                break;
            case -843557626:
                if (str.equals("android.permission.health.READ_WHEELCHAIR_PUSHES")) {
                    c2 = '&';
                    break;
                }
                break;
            case -837391989:
                if (str.equals("android.permission.health.READ_MINDFULNESS")) {
                    c2 = '\'';
                    break;
                }
                break;
            case -798669607:
                if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c2 = '(';
                    break;
                }
                break;
            case -729850441:
                if (str.equals("android.permission.health.WRITE_CERVICAL_MUCUS")) {
                    c2 = ')';
                    break;
                }
                break;
            case -693361376:
                if (str.equals("android.permission.WRITE_MEDIA_STORAGE")) {
                    c2 = '*';
                    break;
                }
                break;
            case -690134957:
                if (str.equals("android.permission.RECORD_BACKGROUND_AUDIO")) {
                    c2 = '+';
                    break;
                }
                break;
            case -645334265:
                if (str.equals("android.permission.health.WRITE_DISTANCE")) {
                    c2 = ',';
                    break;
                }
                break;
            case -585864995:
                if (str.equals("android.permission.health.READ_SEXUAL_ACTIVITY")) {
                    c2 = '-';
                    break;
                }
                break;
            case -577531568:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_PROCEDURES")) {
                    c2 = '.';
                    break;
                }
                break;
            case -547142740:
                if (str.equals("android.permission.health.READ_DISTANCE")) {
                    c2 = '/';
                    break;
                }
                break;
            case -537638249:
                if (str.equals("android.permission.health.WRITE_BLOOD_GLUCOSE")) {
                    c2 = '0';
                    break;
                }
                break;
            case -532269906:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_VACCINES")) {
                    c2 = '1';
                    break;
                }
                break;
            case -522776274:
                if (str.equals("android.permission.health.WRITE_FLOORS_CLIMBED")) {
                    c2 = '2';
                    break;
                }
                break;
            case -493510471:
                if (str.equals(ILBLnlCHDVqsSN.RCcGIf)) {
                    c2 = '3';
                    break;
                }
                break;
            case -482528107:
                if (str.equals("android.permission.health.READ_TOTAL_CALORIES_BURNED")) {
                    c2 = '4';
                    break;
                }
                break;
            case -470743966:
                if (str.equals("android.permission.health.READ_BODY_WATER_MASS")) {
                    c2 = '5';
                    break;
                }
                break;
            case -421271027:
                if (str.equals("android.permission.health.WRITE_MENSTRUATION")) {
                    c2 = '6';
                    break;
                }
                break;
            case -406040016:
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c2 = '7';
                    break;
                }
                break;
            case -399525215:
                if (str.equals("android.permission.health.READ_NUTRITION")) {
                    c2 = '8';
                    break;
                }
                break;
            case -394606436:
                if (str.equals("android.permission.health.WRITE_BLOOD_PRESSURE")) {
                    c2 = '9';
                    break;
                }
                break;
            case -367718889:
                if (str.equals(bPnJ.HThKTrYwSLJoS)) {
                    c2 = ':';
                    break;
                }
                break;
            case -205073591:
                if (str.equals("android.permission.health.WRITE_BODY_TEMPERATURE")) {
                    c2 = ';';
                    break;
                }
                break;
            case -194372827:
                if (str.equals("android.permission.health.WRITE_PLANNED_EXERCISE")) {
                    c2 = '<';
                    break;
                }
                break;
            case -178429963:
                if (str.equals("android.permission.SYSTEM_CAMERA")) {
                    c2 = '=';
                    break;
                }
                break;
            case -64073206:
                if (str.equals(bPnJ.wfYZewSumAzOmIY)) {
                    c2 = '>';
                    break;
                }
                break;
            case -63024214:
                if (str.equals(nTAZxGMqQtZZAQ.jwuo)) {
                    c2 = '?';
                    break;
                }
                break;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    c2 = '@';
                    break;
                }
                break;
            case 27563527:
                if (str.equals("android.permission.health.READ_VO2_MAX")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 52602690:
                if (str.equals("android.permission.SEND_SMS")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 54570858:
                if (str.equals("android.permission.health.WRITE_LEAN_BODY_MASS")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 57525538:
                if (str.equals("android.permission.health.WRITE_SEXUAL_ACTIVITY")) {
                    c2 = 'D';
                    break;
                }
                break;
            case 58942684:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_ALLERGIES_INTOLERANCES")) {
                    c2 = 'E';
                    break;
                }
                break;
            case 96094141:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_PREGNANCY")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 112197485:
                if (str.equals("android.permission.CALL_PHONE")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 165058564:
                if (str.equals("android.permission.health.WRITE_HYDRATION")) {
                    c2 = 'H';
                    break;
                }
                break;
            case 172646567:
                if (str.equals(hTYJVDOvZnZlYL.KvfRtidmrh)) {
                    c2 = 'I';
                    break;
                }
                break;
            case 175802396:
                if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 199909961:
                if (str.equals("android.permission.health.READ_SKIN_TEMPERATURE")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 214526995:
                if (str.equals("android.permission.WRITE_CONTACTS")) {
                    c2 = 'L';
                    break;
                }
                break;
            case 294922486:
                if (str.equals("android.permission.CAMERA_OPEN_CLOSE_LISTENER")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 320697201:
                if (str.equals("android.permission.health.READ_OVULATION_TEST")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 357566285:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_PRACTITIONER_DETAILS")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 358539178:
                if (str.equals("android.permission.MANAGE_MEDIA")) {
                    c2 = 'P';
                    break;
                }
                break;
            case 441496538:
                if (str.equals("android.permission.ACCEPT_HANDOVER")) {
                    c2 = 'Q';
                    break;
                }
                break;
            case 442433226:
                if (str.equals("android.permission.health.WRITE_MEDICAL_DATA")) {
                    c2 = 'R';
                    break;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c2 = 'S';
                    break;
                }
                break;
            case 518524789:
                if (str.equals("android.permission.health.WRITE_ACTIVITY_INTENSITY")) {
                    c2 = 'T';
                    break;
                }
                break;
            case 573540634:
                if (str.equals("android.permission.health.WRITE_TOTAL_CALORIES_BURNED")) {
                    c2 = 'U';
                    break;
                }
                break;
            case 583604391:
                if (str.equals(ILBLnlCHDVqsSN.qzUoTsffQXNoO)) {
                    c2 = 'V';
                    break;
                }
                break;
            case 603653886:
                if (str.equals("android.permission.WRITE_CALENDAR")) {
                    c2 = 'W';
                    break;
                }
                break;
            case 610633091:
                if (str.equals("android.permission.WRITE_CALL_LOG")) {
                    c2 = 'X';
                    break;
                }
                break;
            case 613178498:
                if (str.equals("android.permission.health.READ_BASAL_METABOLIC_RATE")) {
                    c2 = 'Y';
                    break;
                }
                break;
            case 691260818:
                if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c2 = 'Z';
                    break;
                }
                break;
            case 710297143:
                if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c2 = '[';
                    break;
                }
                break;
            case 770133486:
                if (str.equals("android.permission.health.WRITE_BODY_FAT")) {
                    c2 = '\\';
                    break;
                }
                break;
            case 784282783:
                if (str.equals("android.permission.health.READ_HEALTH_DATA_IN_BACKGROUND")) {
                    c2 = ']';
                    break;
                }
                break;
            case 784519842:
                if (str.equals("android.permission.USE_SIP")) {
                    c2 = '^';
                    break;
                }
                break;
            case 806074004:
                if (str.equals("android.permission.health.WRITE_EXERCISE_ROUTE")) {
                    c2 = '_';
                    break;
                }
                break;
            case 821126578:
                if (str.equals("android.permission.health.WRITE_ELEVATION_GAINED")) {
                    c2 = '`';
                    break;
                }
                break;
            case 851504806:
                if (str.equals("android.permission.health.WRITE_NUTRITION")) {
                    c2 = 'a';
                    break;
                }
                break;
            case 860999352:
                if (str.equals("android.permission.health.READ_BONE_MASS")) {
                    c2 = 'b';
                    break;
                }
                break;
            case 866958944:
                if (str.equals("android.permission.health.WRITE_ACTIVE_CALORIES_BURNED")) {
                    c2 = 'c';
                    break;
                }
                break;
            case 867010281:
                if (str.equals("android.permission.health.WRITE_BASAL_BODY_TEMPERATURE")) {
                    c2 = 'd';
                    break;
                }
                break;
            case 868325011:
                if (str.equals("android.permission.health.READ_BODY_FAT")) {
                    c2 = 'e';
                    break;
                }
                break;
            case 868771412:
                if (str.equals("android.permission.health.WRITE_HEART_RATE_VARIABILITY")) {
                    c2 = 'f';
                    break;
                }
                break;
            case 952819282:
                if (str.equals("android.permission.PROCESS_OUTGOING_CALLS")) {
                    c2 = 'g';
                    break;
                }
                break;
            case 957037404:
                if (str.equals("android.permission.health.WRITE_RESTING_HEART_RATE")) {
                    c2 = 'h';
                    break;
                }
                break;
            case 998835540:
                if (str.equals("moe.shizuku.manager.permission.API_V23")) {
                    c2 = 'i';
                    break;
                }
                break;
            case 1081382934:
                if (str.equals("android.permission.BACKGROUND_CAMERA")) {
                    c2 = 'j';
                    break;
                }
                break;
            case 1122529514:
                if (str.equals("android.permission.health.WRITE_EXERCISE")) {
                    c2 = 'k';
                    break;
                }
                break;
            case 1166454870:
                if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c2 = 'l';
                    break;
                }
                break;
            case 1220721039:
                if (str.equals("android.permission.health.READ_EXERCISE")) {
                    c2 = 'm';
                    break;
                }
                break;
            case 1281902023:
                if (str.equals("android.permission.health.READ_INTERMENSTRUAL_BLEEDING")) {
                    c2 = 'n';
                    break;
                }
                break;
            case 1304018062:
                if (str.equals("android.permission.health.READ_POWER")) {
                    c2 = 'o';
                    break;
                }
                break;
            case 1306681952:
                if (str.equals("android.permission.health.READ_SLEEP")) {
                    c2 = 'p';
                    break;
                }
                break;
            case 1306801104:
                if (str.equals("android.permission.health.READ_SPEED")) {
                    c2 = 'q';
                    break;
                }
                break;
            case 1306920624:
                if (str.equals("android.permission.health.READ_STEPS")) {
                    c2 = 'r';
                    break;
                }
                break;
            case 1324656366:
                if (str.equals("android.permission.health.READ_BODY_TEMPERATURE")) {
                    c2 = 's';
                    break;
                }
                break;
            case 1335357130:
                if (str.equals("android.permission.health.READ_PLANNED_EXERCISE")) {
                    c2 = 't';
                    break;
                }
                break;
            case 1338966036:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_MEDICATIONS")) {
                    c2 = 'u';
                    break;
                }
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c2 = 'v';
                    break;
                }
                break;
            case 1415136728:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_VISITS")) {
                    c2 = 'w';
                    break;
                }
                break;
            case 1531170462:
                if (str.equals("android.permission.health.READ_HEIGHT")) {
                    c2 = 'x';
                    break;
                }
                break;
            case 1686964044:
                if (str.equals("android.permission.health.WRITE_VO2_MAX")) {
                    c2 = 'y';
                    break;
                }
                break;
            case 1710198234:
                if (str.equals("android.permission.health.READ_ACTIVITY_INTENSITY")) {
                    c2 = 'z';
                    break;
                }
                break;
            case 1743247004:
                if (str.equals("android.permission.health.READ_CERVICAL_MUCUS")) {
                    c2 = '{';
                    break;
                }
                break;
            case 1758896402:
                if (str.equals("android.permission.health.READ_BLOOD_GLUCOSE")) {
                    c2 = '|';
                    break;
                }
                break;
            case 1780337063:
                if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c2 = '}';
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c2 = '~';
                    break;
                }
                break;
            case 1869568050:
                if (str.equals("android.permission.health.READ_MENSTRUATION")) {
                    c2 = 127;
                    break;
                }
                break;
            case 1903679699:
                if (str.equals("android.permission.health.READ_MEDICAL_DATA_VITAL_SIGNS")) {
                    c2 = 128;
                    break;
                }
                break;
            case 1950321171:
                if (str.equals(yttXLrAeLjN.jgoKWlptTtUjCNw)) {
                    c2 = 129;
                    break;
                }
                break;
            case 1960607727:
                if (str.equals("android.permission.health.READ_WEIGHT")) {
                    c2 = 130;
                    break;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c2 = 131;
                    break;
                }
                break;
            case 2024715147:
                if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c2 = 132;
                    break;
                }
                break;
            case 2062356686:
                if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                    c2 = 133;
                    break;
                }
                break;
            case 2078491009:
                if (str.equals("android.permission.health.READ_BLOOD_PRESSURE")) {
                    c2 = 134;
                    break;
                }
                break;
            case 2104877904:
                if (str.equals("android.permission.health.READ_HEART_RATE")) {
                    c2 = 135;
                    break;
                }
                break;
            case 2112029373:
                if (str.equals("android.permission.health.WRITE_BONE_MASS")) {
                    c2 = 136;
                    break;
                }
                break;
            case 2113334348:
                if (str.equals(bOxzFZXgEkjph.PZGScuTMepjsW)) {
                    c2 = 137;
                    break;
                }
                break;
            case 2114579147:
                if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c2 = 138;
                    break;
                }
                break;
            case 2133799037:
                if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c2 = 139;
                    break;
                }
                break;
            case 2142567052:
                if (str.equals("android.permission.health.WRITE_OVULATION_TEST")) {
                    c2 = 140;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
            case 5:
            case rt0.o /* 9 */:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case rt0.p /* 17 */:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 29:
            case rt0.q /* 32 */:
            case '!':
            case '\"':
            case '#':
            case '&':
            case '\'':
            case ')':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '8':
            case '9':
            case ';':
            case '<':
            case '>':
            case 'A':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'H':
            case 'I':
            case 'K':
            case 'N':
            case 'O':
            case 'R':
            case 'T':
            case 'U':
            case 'V':
            case 'Y':
            case '\\':
            case ']':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'h':
            case 'k':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '{':
            case '|':
            case 127:
            case rt0.s /* 128 */:
            case 129:
            case 130:
            case 134:
            case 135:
            case 136:
            case 137:
            case 140:
                return "android.permission-group.HEALTH";
            case 3:
            case 24:
            case '$':
            case '%':
            case 'B':
                return "android.permission-group.SMS";
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
            case 'W':
                return "android.permission-group.CALENDAR";
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return "android.permission-group.NOTIFICATIONS";
            case '\b':
            case 'X':
            case 'g':
                return "android.permission-group.CALL_LOG";
            case '\n':
            case '?':
            case 132:
                return "android.permission-group.LOCATION";
            case 11:
            case '*':
            case '7':
            case 'P':
            case 'v':
            case 138:
                return "android.permission-group.STORAGE";
            case 22:
            case 30:
            case ':':
            case rt0.r /* 64 */:
            case 'G':
            case 'Q':
            case '^':
            case 139:
                return "android.permission-group.PHONE";
            case 28:
                return "android.permission-group.SENSORS";
            case 31:
            case 'J':
            case '[':
                return "android.permission-group.READ_MEDIA_VISUAL";
            case '(':
            case 'l':
            case 133:
                return "android.permission-group.NEARBY_DEVICES";
            case '+':
            case '~':
                return "android.permission-group.MICROPHONE";
            case '=':
            case 'M':
            case 'S':
            case 'j':
                return "android.permission-group.CAMERA";
            case 'L':
            case 131:
                return "android.permission-group.CONTACTS";
            case 'Z':
                return "android.permission-group.READ_MEDIA_AURAL";
            case 'i':
                return "custom.permission-group.SHIZUKU";
            case '}':
                return "android.permission-group.ACTIVITY_RECOGNITION";
            default:
                return null;
        }
    }

    public static String w(Context context, String str) {
        if (str.equals(nyGJ.PNrtbv)) {
            return context.getString(R.string.accessibility_service);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            String str2 = (String) packageManager.getPermissionGroupInfo(str, 0).loadDescription(packageManager);
            if (str2.startsWith("android.permission.") || str2.startsWith("com.") || str2.contains("_")) {
                String z = z(context, str);
                return z.equals(str) ? uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " ")) : z;
            }
            try {
                return str2.substring(0, 1).toUpperCase() + str2.substring(1);
            } catch (Exception unused) {
                return uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " "));
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " "));
        }
    }

    public static Drawable x(Context context, String str, String str2) {
        Drawable drawable = null;
        try {
            drawable = context.getPackageManager().getResourcesForApplication("android").getDrawable(context.getPackageManager().getPermissionGroupInfo(str2, rt0.s).icon, null);
        } catch (Exception unused) {
        }
        if (drawable == null) {
            switch (str) {
                case "android.permission.WRITE_SETTINGS":
                case "android.permission.WRITE_SECURE_SETTINGS":
                    return context.getDrawable(R.drawable.ic_settings);
                case "android.permission.BIND_DEVICE_ADMIN":
                    return context.getDrawable(R.drawable.ic_settings);
                case "android.permission.MANAGE_EXTERNAL_STORAGE":
                case "android.permission.READ_MEDIA_IMAGES":
                case "android.permission.MANAGE_MEDIA":
                case "android.permission.READ_MEDIA_AUDIO":
                case "android.permission.READ_MEDIA_VIDEO":
                case "android.permission.ACCESS_MEDIA_LOCATION":
                    return context.getDrawable(R.drawable.ic_storage);
                case "android.permission.ACCESS_NOTIFICATION_POLICY":
                    return context.getDrawable(R.drawable.ic_action_notification);
                case "android.permission.SYSTEM_ALERT_WINDOW":
                    return context.getDrawable(R.drawable.ic_settings);
                case "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS":
                case "android.permission.BATTERY_STATS":
                    return context.getDrawable(R.drawable.ic_battery);
                case "android.permission.PACKAGE_USAGE_STATS":
                    return context.getDrawable(R.drawable.ic_action_usage);
                case "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE":
                    return context.getDrawable(R.drawable.ic_action_notification);
                case "android.permission.READ_LOGS":
                    return context.getDrawable(R.drawable.ic_action_note);
                case "android.permission.BIND_ACCESSIBILITY_SERVICE":
                    return context.getDrawable(R.drawable.ic_action_accessibility);
                case "android.permission.REQUEST_INSTALL_PACKAGES":
                    return context.getDrawable(R.drawable.ic_action_install2);
            }
        }
        return drawable;
    }

    public static String y(Context context, String str) {
        if (str.equals("accessibility")) {
            return context.getString(R.string.accessibility_service);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            String charSequence = packageManager.getPermissionGroupInfo(str, rt0.s).loadLabel(packageManager).toString();
            if (charSequence.startsWith("android.permission.") || charSequence.startsWith("com.") || charSequence.contains("_")) {
                String z = z(context, str);
                return z.equals(str) ? uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " ")) : z;
            }
            try {
                return charSequence.substring(0, 1).toUpperCase() + charSequence.substring(1);
            } catch (Exception unused) {
                return uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " "));
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            return uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " "));
        }
    }

    public static String z(Context context, String str) {
        str.getClass();
        switch (str) {
            case "android.permission.BIND_DEVICE_ADMIN":
                return context.getString(R.string.device_administrator);
            case "android.permission.MANAGE_EXTERNAL_STORAGE":
                return context.getString(R.string.all_files_access);
            case "android.permission.BIND_VR_LISTENER_SERVICE":
                return context.getString(R.string.permission_vr);
            case "android.permission.BIND_DREAM_SERVICE":
                return context.getString(R.string.screensaver);
            case "android.permission.SYSTEM_ALERT_WINDOW":
                try {
                    return context.getPackageManager().getResourcesForApplication("android").getString(context.getPackageManager().getResourcesForApplication("android").getIdentifier("alert_windows_notification_channel_group_name", "string", "android"));
                } catch (Exception unused) {
                    return str;
                }
            case "android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER":
                return context.getString(R.string.set_volume_long_press);
            case "android.permission.WRITE_MEDIA_STORAGE":
                return context.getString(R.string.write_media_storage);
            case "com.android.voicemail.permission.READ_VOICEMAIL":
                return context.getString(R.string.read_voicemail);
            case "android.permission.BIND_VPN_SERVICE":
                return context.getString(R.string.vpn_service);
            case "accessibility":
            case "android.permission.BIND_ACCESSIBILITY_SERVICE":
                return context.getString(R.string.accessibility);
            case "android.permission.BATTERY_STATS":
                return context.getString(R.string.battery_stats);
            case "android.permission.PACKAGE_USAGE_STATS":
                return context.getString(R.string.usage_access);
            case "android.permission.GET_ACCOUNTS_PRIVILEGED":
                return context.getString(R.string.get_accounts_privileged);
            case "android.permission.WRITE_SECURE_SETTINGS":
                return context.getString(R.string.write_secure_settings);
            case "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE":
                return context.getString(R.string.notification_access);
            case "android.permission.MANAGE_MEDIA":
                return context.getString(R.string.manage_media);
            case "android.permission.CHANGE_CONFIGURATION":
                return context.getString(R.string.change_configuration);
            case "android.permission.READ_LOGS":
                return context.getString(R.string.read_logs);
            case "android.permission.SCHEDULE_EXACT_ALARM":
                return context.getString(R.string.schedule_exact_alarm);
            case "android.permission.CLEAR_APP_CACHE":
                return context.getString(R.string.clear_app_cache);
            case "android.permission.GET_ACCOUNTS":
                return context.getString(R.string.get_accounts);
            case "android.permission.BIND_INPUT_METHOD":
                return context.getString(R.string.create_input_method);
            case "android.permission.BIND_NFC_SERVICE":
                return context.getString(R.string.nfc_service);
            case "com.android.voicemail.permission.WRITE_VOICEMAIL":
                return context.getString(R.string.write_voicemail);
            default:
                return uz1.b(str.substring(str.lastIndexOf(".") + 1).replace("_", " "));
        }
    }

    public b1 E(Context context, Object obj) {
        return null;
    }

    public void G(ti1 ti1Var, Object obj) {
        ti1Var.getClass();
        if (obj == null) {
            return;
        }
        aj1 C = ti1Var.C(j());
        try {
            b(C, obj);
            C.w();
            rt0.e(C, null);
        } finally {
        }
    }

    public abstract Object M(Intent intent, int i);

    public abstract void b(aj1 aj1Var, Object obj);

    public abstract Intent i(Context context, Object obj);

    public abstract String j();
}
