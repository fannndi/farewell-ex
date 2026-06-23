package flar2.devcheck;

import Cwd.YSHrxiHkAFcciU;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.slider.KtNX.kle.shRZEcAQGbvjQ;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.cp1;
import defpackage.do1;
import defpackage.et;
import defpackage.fo1;
import defpackage.gi;
import defpackage.go1;
import defpackage.gr;
import defpackage.i51;
import defpackage.ig1;
import defpackage.il1;
import defpackage.j3;
import defpackage.jl0;
import defpackage.jt0;
import defpackage.l72;
import defpackage.lt0;
import defpackage.m01;
import defpackage.m5;
import defpackage.mi0;
import defpackage.n3;
import defpackage.n72;
import defpackage.om;
import defpackage.pr;
import defpackage.py0;
import defpackage.qf;
import defpackage.rs0;
import defpackage.rt0;
import defpackage.sj;
import defpackage.st0;
import defpackage.th2;
import defpackage.uz1;
import defpackage.vq;
import defpackage.vt0;
import flar2.devcheck.colorPicker.ColorPickerPalette;
import flar2.devcheck.permissionsSummary.VUpU.kYxonkLwz;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import flar2.devcheck.utils.SafeViewPager;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipFile;
import org.apache.commons.logging.impl.SimpleLog;
import p000.p001.bi;
import p002i.p003i.pk;

/* loaded from: classes.dex */
public class MainActivity extends a5 {
    public static volatile String U;
    public SafeViewPager G;
    public vt0 H;
    public MenuItem I;
    public MenuItem J;
    public MenuItem K;
    public m01 L;
    public n3 M;
    public MenuItem N;
    public MenuItem O;
    public sj P;
    public go1 Q;
    public boolean F = false;
    public final Handler R = new Handler(Looper.getMainLooper());
    public boolean S = false;
    public final jt0 T = new jt0(this, 0);

    /* loaded from: classes2.dex */
    public abstract class c2020060317 extends a5 {
        public static final void onResume(MainActivity mainActivity) {
            super.onResume();
            mainActivity.invalidateOptionsMenu();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class c2020060318 extends a5 {
        public static final void onPause(MainActivity mainActivity) {
            super.onPause();
            m01 m01Var = mainActivity.L;
            if (m01Var != null) {
                m01Var.v0(false, false);
            }
            n3 n3Var = mainActivity.M;
            if (n3Var == null || !n3Var.isShowing()) {
                return;
            }
            mainActivity.M.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class c2020060319 extends a5 {
        /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)|4|5|6|7|(1:97)(1:12)|13|14|15|(1:17)(2:93|(8:95|19|(4:21|(1:23)|24|25)|27|28|29|30|(18:32|(1:34)|35|36|37|(2:41|(1:43))|45|(3:79|80|(1:82))|49|(3:51|(1:53)|54)|55|(1:78)(1:59)|60|61|62|63|64|(3:66|67|(2:69|70)(1:72))(2:73|74))(2:89|90)))|18|19|(0)|27|28|29|30|(0)(0)|(1:(0))) */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b9 A[Catch: all -> 0x00e9, TryCatch #4 {all -> 0x00e9, blocks: (B:15:0x0091, B:19:0x00ae, B:21:0x00b9, B:23:0x00ce, B:25:0x00e6, B:93:0x0098, B:95:0x00a9), top: B:14:0x0091 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x03a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void onCreate(final flar2.devcheck.MainActivity r23, android.os.Bundle r24) {
            /*
                Method dump skipped, instructions count: 992
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.MainActivity.c2020060319.onCreate(flar2.devcheck.MainActivity, android.os.Bundle):void");
        }
    }

    public static long ac(Context context) {
        String[] strArr;
        String str;
        String B0;
        String B02;
        String B03;
        String[] strArr2 = uz1.e;
        try {
            int x0 = uz1.x0(55);
            String str2 = strArr2[1];
            String string = context.getResources().getString(R.color.green);
            try {
                B02 = x0 == 1 ? uz1.B0(str2, string) : uz1.B0(str2, string);
            } catch (NullPointerException unused) {
                B02 = uz1.B0(str2, string);
            }
            int x02 = uz1.x0(60);
            String str3 = strArr2[2];
            String string2 = context.getResources().getString(R.color.green);
            try {
                B03 = x02 == 1 ? uz1.B0(str3, string2) : uz1.B0(str3, string2);
            } catch (NullPointerException unused2) {
                B03 = uz1.B0(str3, string2);
            }
            strArr = new String[]{B02, B03};
        } catch (Exception unused3) {
            strArr = null;
        }
        try {
            str = strArr2[3];
        } catch (Exception unused4) {
            str = null;
        }
        String string3 = context.getResources().getString(R.color.green);
        try {
            B0 = uz1.B0(str, string3);
        } catch (NullPointerException unused5) {
            B0 = uz1.B0(str, string3);
        }
        try {
            ZipFile zipFile = new ZipFile(context.getPackageCodePath());
            long longValue = ((Long) Class.forName(strArr[0]).getMethod(strArr[1], null).invoke(zipFile.getEntry(B0), null)).longValue();
            zipFile.close();
            return longValue;
        } catch (Exception unused6) {
            return 0L;
        }
    }

    public static void b(Activity activity) {
        i51.h("prefHardwareDB", true);
        try {
            ((MaterialToolbar) activity.findViewById(R.id.toolbar)).setTitle(activity.getString(R.string.app_name_pro));
        } catch (NullPointerException unused) {
        }
        try {
            MenuItem menuItem = (MenuItem) activity.findViewById(R.id.action_iap);
            if (menuItem == null || !menuItem.isVisible()) {
                return;
            }
            menuItem.setVisible(false);
        } catch (ClassCastException unused2) {
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) activity.findViewById(R.id.action_iap);
            if (actionMenuItemView != null) {
                actionMenuItemView.setVisibility(8);
            }
        }
    }

    public static void c(Activity activity) {
        i51.h("prefHardwareDB", false);
        if (Build.VERSION.SDK_INT >= 29) {
            i51.h("prefSysTheme", true);
        }
        i51.h(YSHrxiHkAFcciU.FyQqStqM, false);
        try {
            et.c("prefMonitorBoot", false);
        } catch (IllegalArgumentException unused) {
        }
        i51.j(6, "prefColor");
        try {
            ((MaterialToolbar) activity.findViewById(R.id.toolbar)).setTitle(activity.getString(R.string.app_name));
        } catch (NullPointerException unused2) {
        }
    }

    public static String e(Context context) {
        String str = "";
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                str = Base64.encodeToString(messageDigest.digest(), 0);
            }
        } catch (PackageManager.NameNotFoundException | NullPointerException | NoSuchAlgorithmException unused) {
        }
        return str.trim();
    }

    public static /* synthetic */ void setNavigationIcon$036(Toolbar toolbar, int i) {
    }

    public static /* synthetic */ void setNavigationIcon$040(MaterialToolbar materialToolbar, Drawable drawable) {
    }

    public final String B(int i, String str) {
        try {
            String string = getString(i);
            if (string != null) {
                if (!string.trim().isEmpty()) {
                    return string;
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        return str;
    }

    public final boolean C(String str) {
        try {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            launchIntentForPackage.addFlags(268435456);
            startActivity(launchIntentForPackage);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 311) {
                new om(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, intent.getData());
            }
            if (i == 321) {
                this.H.getClass();
                n72 l = l();
                l72 g = g();
                py0 h = h();
                l.getClass();
                g.getClass();
                gr grVar = new gr(l, g, h);
                vq a2 = af1.a(mi0.class);
                String b = a2.b();
                if (b != null) {
                    ((mi0) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).l();
                } else {
                    c.m("Local and anonymous classes can not be ViewModels");
                }
            }
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kYxonkLwz.RLjqqlLSZq.invoke(null, this, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r8) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.MainActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = 2;
        int i2 = 0;
        switch (menuItem.getItemId()) {
            case R.id.action_about /* 2131361860 */:
                startActivity(new Intent(this, (Class<?>) AboutActivity.class));
                return true;
            case R.id.action_colors /* 2131361872 */:
                if (!this.P.d()) {
                    uz1.q0(this);
                    return true;
                }
                m01 m01Var = new m01();
                this.L = m01Var;
                int[] iArr = {getColor(R.color.yellow), getColor(R.color.blue), getColor(R.color.grey), getColor(R.color.green), getColor(R.color.red), getColor(R.color.aqua), getColor(R.color.orange), getColor(R.color.pink), getColor(R.color.indigo)};
                int c = i51.c(getColor(R.color.green), "prefColor");
                Bundle bundle = new Bundle();
                bundle.putInt("title_id", R.string.color_picker_default_title);
                bundle.putInt("columns", 3);
                bundle.putInt("size", 2);
                m01Var.m0(bundle);
                switch (c) {
                    case 3:
                        c = Color.parseColor("#ffa000");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        c = Color.parseColor("#4587BF");
                        break;
                    case 5:
                        c = Color.parseColor("#607D8B");
                        break;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        c = Color.parseColor("#4e9b45");
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        c = Color.parseColor("#E66260");
                        break;
                    case 8:
                        c = Color.parseColor("#3f8095");
                        break;
                    case rt0.o /* 9 */:
                        c = Color.parseColor("#E66C46");
                        break;
                    case 10:
                        c = Color.parseColor("#E4648F");
                        break;
                    case 11:
                        c = Color.parseColor("#6F7BC1");
                        break;
                }
                if (m01Var.u0 != iArr || m01Var.z0 != c) {
                    m01Var.u0 = iArr;
                    m01Var.z0 = c;
                    ColorPickerPalette colorPickerPalette = m01Var.x0;
                    if (colorPickerPalette != null) {
                        colorPickerPalette.a(iArr, c);
                    }
                }
                m01 m01Var2 = this.L;
                m01Var2.w0 = new lt0(this);
                m01Var2.z0(s(), "colorpicker");
                return true;
            case R.id.action_export /* 2131361883 */:
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                String str = "DevCheck-" + DateFormat.getDateTimeInstance(2, 3, Locale.getDefault()).format(new Date()) + ".txt";
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TITLE", str);
                try {
                    startActivityForResult(intent, 311);
                } catch (Exception unused) {
                }
                return true;
            case R.id.action_iap /* 2131361887 */:
                uz1.q0(this);
                return true;
            case R.id.action_language /* 2131361891 */:
                th2 th2Var = new th2(this);
                j3 j3Var = (j3) th2Var.h;
                j3Var.e = getString(R.string.language);
                th2Var.h(getString(R.string.cancel), null);
                String[] strArr = {getString(R.string.system_language), getString(R.string.czech), getString(R.string.german), getString(R.string.english), getString(R.string.finnish), getString(R.string.french), getString(R.string.italian), getString(R.string.japanese), getString(R.string.dutch), getString(R.string.hungarian), getString(R.string.malayalam), getString(R.string.polish), getString(R.string.portuguese), getString(R.string.portuguese_brazil), getString(R.string.russian), getString(R.string.slovenian), getString(R.string.spanish), getString(R.string.turkish), getString(R.string.vietnamese), getString(R.string.bengali), getString(R.string.chinese_simplified), getString(R.string.chinese_traditional), getString(R.string.indonesian), getString(R.string.hindi), getString(R.string.ukrainian), getString(R.string.slovak), getString(R.string.korean), getString(R.string.arabic), getString(R.string.bulgarian), getString(R.string.malay), getString(R.string.azerbaijani), getString(R.string.romanian), getString(R.string.greek), getString(R.string.danish), getString(R.string.thai), getString(R.string.swedish)};
                String[] strArr2 = {"default", "cs", "de", nTAZxGMqQtZZAQ.yaDKERE, "fi", "fr", "it", "ja", "nl", "hu", "ml", "pl", "pt", "pt_BR", "ru", XmJDY.FgxUenEP, "es", "tr", "vi", "bn", "zh_CN", hTYJVDOvZnZlYL.VfYSKn, XmJDY.sHnGqTqvpf, "hi", "uk", "sk", "ko", "ar", "bg", "ms", "az", "ro", "el", "da", "th", "sv"};
                rs0 b = m5.b();
                String languageTags = b.b() ? "" : b.f904a.f952a.toLanguageTags();
                int i3 = 0;
                while (true) {
                    if (i2 >= 36) {
                        i2 = i3;
                    } else if (!pr.F(strArr2[i2]).equals(languageTags)) {
                        if (languageTags.isEmpty() && strArr2[i2].equals("default")) {
                            i3 = i2;
                        }
                        i2++;
                    }
                }
                gi giVar = new gi(this, 4, strArr2);
                j3Var.p = strArr;
                j3Var.r = giVar;
                j3Var.w = i2;
                j3Var.v = true;
                th2Var.a().show();
                return true;
            case R.id.action_manage_subscriptions /* 2131361894 */:
                try {
                    uz1.m0(this);
                    return true;
                } catch (Exception unused2) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
                    return true;
                }
            case R.id.action_reset /* 2131361906 */:
                boolean booleanValue = i51.b("prefPDR").booleanValue();
                il1 il1Var = (il1) i51.f();
                il1Var.getClass();
                SharedPreferences.Editor edit = il1Var.f438a.edit();
                edit.clear();
                edit.commit();
                startActivity(Intent.makeRestartActivityTask(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent()).putExtra("keyR", booleanValue));
                Runtime.getRuntime().exit(0);
                return true;
            case R.id.action_root /* 2131361908 */:
                vt0 vt0Var = this.H;
                vt0Var.c.submit(new st0(vt0Var, i2));
                return true;
            case R.id.action_share /* 2131361912 */:
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra(IGQCApxXGMWo.jYNwWsQypvWLp, getString(R.string.app_name) + " Hardware and System Info");
                intent2.putExtra("android.intent.extra.TEXT", "Complete information about your CPU, GPU, battery, camera, network and OS.\n\nAvailable on Google Play: https://play.google.com/store/apps/details?id=flar2.devcheck");
                intent2.setType("text/plain");
                startActivity(Intent.createChooser(intent2, getString(R.string.share)));
                return true;
            case R.id.action_shizuku /* 2131361913 */:
                go1 go1Var = this.Q;
                if (go1Var == null) {
                    View findViewById = findViewById(R.id.coord_layout);
                    int[] iArr2 = cp1.B;
                    cp1.f(findViewById, findViewById.getResources().getText(R.string.shizuku_sui_not_found_on_this_device), -1).h();
                    return true;
                }
                if (!go1Var.b()) {
                    if (!C("moe.shizuku.privileged.api") && !C("moe.shizuku.privileged.api25") && !C("rikka.sui")) {
                        View findViewById2 = findViewById(R.id.coord_layout);
                        int[] iArr3 = cp1.B;
                        cp1.f(findViewById2, findViewById2.getResources().getText(R.string.shizuku_sui_not_found_on_this_device), -1).h();
                        return true;
                    }
                    return true;
                }
                if (this.Q.d()) {
                    View findViewById3 = findViewById(R.id.coord_layout);
                    int[] iArr4 = cp1.B;
                    cp1.f(findViewById3, findViewById3.getResources().getText(R.string.shizuku_already_enabled), -1).h();
                    return true;
                }
                go1 go1Var2 = this.Q;
                switch (go1Var2.f347a) {
                    default:
                        if (go1Var2.b()) {
                            try {
                                if (do1.f() != 0) {
                                    try {
                                        ((jl0) do1.j()).j(1001);
                                    } catch (RemoteException e) {
                                        throw new RuntimeException(e);
                                    }
                                } else {
                                    fo1.a(go1Var2.b);
                                    go1Var2.a();
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                    case 0:
                        return true;
                }
                break;
            case R.id.action_tempunit /* 2131361916 */:
                boolean d = et.f248a.d("prefFahrenheit");
                MenuItem menuItem2 = this.J;
                if (d) {
                    menuItem2.setTitle(getString(R.string.units_imperial));
                    et.c("prefFahrenheit", false);
                    return true;
                }
                menuItem2.setTitle(getString(R.string.units_metric));
                et.c("prefFahrenheit", true);
                return true;
            case R.id.action_themes /* 2131361918 */:
                if (!this.P.d()) {
                    uz1.q0(this);
                    return true;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    boolean booleanValue2 = i51.b("prefDarkTheme").booleanValue();
                    MenuItem menuItem3 = this.I;
                    if (booleanValue2) {
                        menuItem3.setTitle(getString(R.string.light_theme));
                        i51.i("prefSysTheme", false);
                        i51.i("prefDarkTheme", false);
                        c3.c(this, 1);
                        return true;
                    }
                    menuItem3.setTitle(getString(R.string.dark_theme));
                    i51.i("prefSysTheme", false);
                    i51.i("prefDarkTheme", true);
                    c3.c(this, 2);
                    return true;
                }
                th2 th2Var2 = new th2(this);
                j3 j3Var2 = (j3) th2Var2.h;
                j3Var2.e = getString(R.string.themes);
                th2Var2.h(getString(R.string.cancel), null);
                String[] strArr3 = {getString(R.string.sys_theme), getString(R.string.light_theme), getString(R.string.dark_theme)};
                if (((il1) i51.f()).getBoolean("prefSysTheme", true)) {
                    i = 0;
                } else if (!i51.b("prefDarkTheme").booleanValue()) {
                    i = 1;
                }
                qf qfVar = new qf(7, this);
                j3Var2.p = strArr3;
                j3Var2.r = qfVar;
                j3Var2.w = i;
                j3Var2.v = true;
                n3 a2 = th2Var2.a();
                this.M = a2;
                try {
                    a2.show();
                    ((TextView) this.M.findViewById(R.id.alertTitle)).setTypeface(ig1.b(this, R.font.open_sans_semibold));
                } catch (Exception unused4) {
                    this.M = null;
                }
                return true;
            case R.id.action_user_guide /* 2131361923 */:
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://devcheck.app/faq"));
                if (intent3.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                    return true;
                }
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        shRZEcAQGbvjQ.gXmLiDUI.invoke(null, this);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.action_manage_subscriptions);
        if (findItem != null) {
            boolean z = false;
            try {
                sj sjVar = this.P;
                if (sjVar != null) {
                    z = Boolean.TRUE.equals(sjVar.e().d());
                }
            } catch (Throwable unused) {
            }
            findItem.setVisible(z);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.zt, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        try {
            Method declaredMethod = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(menu, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        super.onPreparePanel(i, view, menu);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        pk.process(this);
        bi.b(this);
        shRZEcAQGbvjQ.MRAxkYgDlXiupr.invoke(null, this);
    }
}
