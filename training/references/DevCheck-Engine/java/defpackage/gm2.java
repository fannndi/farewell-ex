package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.gms.common.internal.a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.BatteryMonitor.BatteryActivity;
import flar2.devcheck.BatteryMonitor.BatteryMonitorService;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.usage.GgP.rlfWzcx;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidget;
import flar2.devcheck.widgets.batteryWidget.BatteryWidget;
import flar2.devcheck.widgets.dashWidget.DashWidget;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gm2 implements h7, ow0, en, h2, rw0, pv0, jn, ww, uw, sa0, ex0, b41, ph, zr0, rd {
    public static final x42 i = new x42();
    public static gm2 j;
    public final /* synthetic */ int g;
    public Object h;

    public gm2(int i2) {
        Handler handler;
        this.g = i2;
        switch (i2) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.h = new e1(this);
                    return;
                } else {
                    this.h = new d1(this);
                    return;
                }
            case 22:
                TimeUnit.MINUTES.getClass();
                jw1 jw1Var = jw1.l;
                jw1Var.getClass();
                this.h = new gd1(jw1Var);
                return;
            case 27:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = r4.b(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e) {
                        Throwable cause = e.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        rw.j(cause);
                        throw null;
                    }
                }
                this.h = handler;
                return;
            default:
                om2 om2Var = om2.c;
                my1 my1Var = new my1(new jm2[]{j70.n, i});
                Charset charset = zl2.f1280a;
                this.h = my1Var;
                return;
        }
    }

    public /* synthetic */ gm2(int i2, Object obj) {
        this.g = i2;
        this.h = obj;
    }

    public /* synthetic */ gm2(int i2, boolean z) {
        this.g = i2;
    }

    public gm2(ClipData clipData, int i2) {
        this.g = 23;
        this.h = hf.f(clipData, i2);
    }

    public gm2(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, cn1 cn1Var, Rect rect) {
        this.g = 17;
        op0.d(rect.left);
        op0.d(rect.top);
        op0.d(rect.right);
        op0.d(rect.bottom);
        this.h = cn1Var;
    }

    public gm2(ContentInfo contentInfo) {
        this.g = 24;
        contentInfo.getClass();
        this.h = hf.h(contentInfo);
    }

    public gm2(a aVar) {
        this.g = 9;
        Objects.requireNonNull(aVar);
        this.h = aVar;
    }

    public static void N(gm2 gm2Var) {
        synchronized (gm2Var) {
            BatteryMonitorService batteryMonitorService = (BatteryMonitorService) gm2Var.h;
            if (batteryMonitorService.m) {
                return;
            }
            batteryMonitorService.i.acquire(4000L);
            BatteryMonitorService batteryMonitorService2 = (BatteryMonitorService) gm2Var.h;
            batteryMonitorService2.m = true;
            if (batteryMonitorService2.o) {
                batteryMonitorService2.o = false;
                if (batteryMonitorService2.i.isHeld()) {
                    ((BatteryMonitorService) gm2Var.h).i.release();
                }
                return;
            }
            i51.k("prefTBatt", (i51.d("prefTBatt") + System.currentTimeMillis()) - i51.d(tEegR.hVVYBSa));
            i51.k("prefTChargeMark", System.currentTimeMillis());
            i51.j(((BatteryMonitorService) gm2Var.h).g(), "prefPChargeMark");
            BatteryMonitorService batteryMonitorService3 = (BatteryMonitorService) gm2Var.h;
            if (batteryMonitorService3.p) {
                i51.j(batteryMonitorService3.d(), "prefCChargeMark");
            }
            if (((PowerManager) ((BatteryMonitorService) gm2Var.h).getSystemService("power")).isScreenOn()) {
                i51.k("prefTSOn", (i51.d("prefTSOn") + System.currentTimeMillis()) - i51.d("prefTSOnMark"));
                i51.j((i51.c(0, "prefPSOn") + i51.c(0, "prefPSOnMark")) - ((BatteryMonitorService) gm2Var.h).g(), "prefPSOn");
                if (((BatteryMonitorService) gm2Var.h).p) {
                    i51.j((i51.c(0, "prefCSOn") + i51.c(0, "prefCSOnMark")) - ((BatteryMonitorService) gm2Var.h).d(), "prefCSOn");
                }
            } else {
                i51.k("prefTSOff", (i51.d("prefTSOff") + System.currentTimeMillis()) - i51.d("prefTSOffMark"));
                i51.j((i51.c(0, "prefPSOff") + i51.c(0, "prefPSOffMark")) - ((BatteryMonitorService) gm2Var.h).g(), "prefPSOff");
                if (((BatteryMonitorService) gm2Var.h).p) {
                    i51.j((i51.c(0, "prefPCOff") + i51.c(0, "prefCSOffMark")) - ((BatteryMonitorService) gm2Var.h).d(), "prefPCOff");
                }
                i51.k("prefTDSDischarge", (BatteryMonitorService.e() - i51.d("prefTDSDischargeMark")) + i51.d(MiGPiFgcCQCVh.NJCUbtnUaPWn));
            }
            if (((BatteryMonitorService) gm2Var.h).i.isHeld()) {
                ((BatteryMonitorService) gm2Var.h).i.release();
            }
        }
    }

    public static void O(gm2 gm2Var) {
        synchronized (gm2Var) {
            BatteryMonitorService batteryMonitorService = (BatteryMonitorService) gm2Var.h;
            if (batteryMonitorService.m) {
                batteryMonitorService.i.acquire(4000L);
                BatteryMonitorService batteryMonitorService2 = (BatteryMonitorService) gm2Var.h;
                batteryMonitorService2.m = false;
                if (batteryMonitorService2.o) {
                    batteryMonitorService2.o = false;
                    if (batteryMonitorService2.i.isHeld()) {
                        ((BatteryMonitorService) gm2Var.h).i.release();
                    }
                    return;
                }
                i51.k(rlfWzcx.cgeboUUhwldE, System.currentTimeMillis());
                i51.k("prefTCharge", (i51.d("prefTCharge") + System.currentTimeMillis()) - i51.d("prefTChargeMark"));
                i51.j((i51.c(0, "prefPCharge") + i51.c(0, "prefPChargeMark")) - ((BatteryMonitorService) gm2Var.h).g(), Iyrs.aTo);
                if (((BatteryMonitorService) gm2Var.h).p) {
                    i51.j((i51.c(0, "prefCCharge") + i51.c(0, "prefCChargeMark")) - ((BatteryMonitorService) gm2Var.h).d(), "prefCCharge");
                }
                i51.k("prefTSOnMark", System.currentTimeMillis());
                i51.j(((BatteryMonitorService) gm2Var.h).g(), "prefPSOnMark");
                BatteryMonitorService batteryMonitorService3 = (BatteryMonitorService) gm2Var.h;
                if (batteryMonitorService3.p) {
                    i51.j(batteryMonitorService3.d(), "prefCSOnMark");
                }
                i51.k("prefTSOffMark", System.currentTimeMillis());
                i51.j(((BatteryMonitorService) gm2Var.h).g(), "prefPSOffMark");
                BatteryMonitorService batteryMonitorService4 = (BatteryMonitorService) gm2Var.h;
                if (batteryMonitorService4.p) {
                    i51.j(batteryMonitorService4.d(), "prefCSOffMark");
                }
                i51.k("prefTDSDischargeMark", BatteryMonitorService.e());
                if (((BatteryMonitorService) gm2Var.h).i.isHeld()) {
                    ((BatteryMonitorService) gm2Var.h).i.release();
                }
            }
        }
    }

    public static void P(final gm2 gm2Var, final boolean z) {
        synchronized (gm2Var) {
            MainApp.h.execute(new Runnable() { // from class: sf
                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    BatteryMonitorService batteryMonitorService = (BatteryMonitorService) gm2.this.h;
                    try {
                        if (batteryMonitorService.j == null) {
                            return;
                        }
                        BatteryMonitorService.a(batteryMonitorService);
                        BatteryMonitorService.c(batteryMonitorService);
                        boolean a2 = batteryMonitorService.g.a(batteryMonitorService, batteryMonitorService.n, batteryMonitorService.u, batteryMonitorService.w);
                        int i3 = batteryMonitorService.g.f480a;
                        if (i3 < 15) {
                            batteryMonitorService.j.p.icon = R.drawable.ic_battery_5;
                        } else {
                            e31 e31Var = batteryMonitorService.j;
                            if (i3 < 35) {
                                e31Var.p.icon = R.drawable.ic_battery_33;
                            } else if (i3 < 60) {
                                e31Var.p.icon = R.drawable.ic_battery_50;
                            } else if (i3 < 80) {
                                e31Var.p.icon = R.drawable.ic_battery_66;
                            } else {
                                e31Var.p.icon = R.drawable.ic_battery;
                            }
                        }
                        if (batteryMonitorService.k == null) {
                            batteryMonitorService.k = (NotificationManager) batteryMonitorService.getSystemService("notification");
                        }
                        NotificationManager notificationManager = batteryMonitorService.k;
                        e31 e31Var2 = batteryMonitorService.j;
                        String str = batteryMonitorService.getString(R.string.battery) + ": " + batteryMonitorService.g.b + "  " + batteryMonitorService.g.d;
                        e31Var2.getClass();
                        e31Var2.e = e31.b(str);
                        e31Var2.f = e31.b(batteryMonitorService.g.h + "   " + batteryMonitorService.g.i);
                        e31Var2.h = -1;
                        notificationManager.notify(48, e31Var2.a());
                        if (a2 || z) {
                            int[] appWidgetIds = BatteryMonitorService.b(batteryMonitorService).getAppWidgetIds(new ComponentName(batteryMonitorService.getApplicationContext(), (Class<?>) BatteryWidget.class));
                            int length = appWidgetIds.length;
                            int i4 = 0;
                            while (true) {
                                i2 = R.id.title_layout;
                                if (i4 >= length) {
                                    break;
                                }
                                int i5 = appWidgetIds[i4];
                                String O = sl.O(i5, "battery_size_");
                                lg lgVar = lg.h;
                                lg lgVar2 = (lg) om0.P(lg.class, O, lgVar);
                                RemoteViews remoteViews = new RemoteViews("flar2.devcheck", lgVar2.g);
                                remoteViews.setViewVisibility(R.id.loading, 8);
                                remoteViews.setViewVisibility(R.id.title_layout, 8);
                                remoteViews.setProgressBar(R.id.pbPercent, 100, batteryMonitorService.g.f480a, false);
                                if (batteryMonitorService.g.f) {
                                    remoteViews.setViewVisibility(R.id.charging, 0);
                                } else {
                                    remoteViews.setViewVisibility(R.id.charging, 4);
                                }
                                jf jfVar = batteryMonitorService.g;
                                if (!jfVar.e || jfVar.f) {
                                    remoteViews.setViewVisibility(R.id.powersave, 4);
                                } else {
                                    remoteViews.setViewVisibility(R.id.powersave, 0);
                                }
                                remoteViews.setOnClickPendingIntent(R.id.container, PendingIntent.getActivity(batteryMonitorService, i5, new Intent(batteryMonitorService, (Class<?>) BatteryActivity.class).putExtra("appWidgetId", i5), 201326592));
                                if (lgVar2 == lgVar) {
                                    remoteViews.setTextViewText(R.id.misc, batteryMonitorService.g.c);
                                    remoteViews.setTextViewText(R.id.free, String.valueOf(batteryMonitorService.g.f480a));
                                    remoteViews.setTextViewText(R.id.model, d10.o(batteryMonitorService));
                                } else {
                                    remoteViews.setTextViewText(R.id.misc, "");
                                    remoteViews.setTextViewText(R.id.free, batteryMonitorService.g.b);
                                }
                                BatteryMonitorService.b(batteryMonitorService).partiallyUpdateAppWidget(i5, remoteViews);
                                i4++;
                            }
                            for (int i6 : BatteryMonitorService.b(batteryMonitorService).getAppWidgetIds(new ComponentName(batteryMonitorService.getApplicationContext(), (Class<?>) DashWidget.class))) {
                                RemoteViews remoteViews2 = new RemoteViews(batteryMonitorService.getPackageName(), R.layout.widget_dash);
                                remoteViews2.setViewVisibility(R.id.loading, 8);
                                remoteViews2.setViewVisibility(R.id.title_layout, 8);
                                if (sl.M(i6)) {
                                    remoteViews2.setViewVisibility(R.id.clock_layout, 0);
                                } else {
                                    remoteViews2.setViewVisibility(R.id.clock_layout, 8);
                                }
                                remoteViews2.setTextViewText(R.id.battery_level, batteryMonitorService.g.b);
                                remoteViews2.setTextViewText(R.id.temperature, batteryMonitorService.g.d);
                                if (batteryMonitorService.g.c.equals(batteryMonitorService.getString(R.string.full))) {
                                    remoteViews2.setTextViewText(R.id.battery_remaining, "");
                                } else {
                                    remoteViews2.setTextViewText(R.id.battery_remaining, batteryMonitorService.g.c);
                                }
                                BatteryMonitorService.b(batteryMonitorService).partiallyUpdateAppWidget(i6, remoteViews2);
                            }
                            int[] appWidgetIds2 = BatteryMonitorService.b(batteryMonitorService).getAppWidgetIds(new ComponentName(batteryMonitorService.getApplicationContext(), (Class<?>) BarDetailWidget.class));
                            int length2 = appWidgetIds2.length;
                            int i7 = 0;
                            while (i7 < length2) {
                                int i8 = appWidgetIds2[i7];
                                String O2 = sl.O(i8, "bar_type_");
                                if (O2 != null && O2.equals("BATTERY")) {
                                    String O3 = sl.O(i8, "bar_size_");
                                    zc zcVar = zc.h;
                                    zc zcVar2 = (zc) om0.P(zc.class, O3, zcVar);
                                    RemoteViews remoteViews3 = new RemoteViews("flar2.devcheck", zcVar2.g);
                                    remoteViews3.setViewVisibility(R.id.loading, 8);
                                    remoteViews3.setViewVisibility(i2, 8);
                                    remoteViews3.setTextViewText(R.id.title, batteryMonitorService.getString(R.string.battery));
                                    remoteViews3.setTextViewText(R.id.free, batteryMonitorService.g.b);
                                    if (zcVar2 == zcVar) {
                                        remoteViews3.setProgressBar(R.id.pbPercent, 100, batteryMonitorService.g.f480a, false);
                                    }
                                    BatteryMonitorService.b(batteryMonitorService).partiallyUpdateAppWidget(i8, remoteViews3);
                                }
                                i7++;
                                i2 = R.id.title_layout;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static gm2 Q(Context context, int i2) {
        op0.c("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, yb1.A);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList o = tl2.o(context, obtainStyledAttributes, 4);
        ColorStateList o2 = tl2.o(context, obtainStyledAttributes, 9);
        ColorStateList o3 = tl2.o(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        cn1 a2 = cn1.g(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        return new gm2(o, o2, o3, dimensionPixelSize, a2, rect);
    }

    public static gm2 T(Context context) {
        if (j == null) {
            gm2 gm2Var = new gm2(21, false);
            gm2Var.h = context.getSharedPreferences(context.getPackageName(), 0);
            j = gm2Var;
        }
        return j;
    }

    @Override // defpackage.en
    public void A() {
        ((yf) this.h).l(new c(9));
    }

    @Override // defpackage.zr0
    public void B(int i2, int i3) {
        ((td1) this.h).i(i2, i3);
    }

    @Override // defpackage.h7
    public void C(int i2) {
    }

    @Override // defpackage.uw
    public void D(Uri uri) {
        ((ContentInfo.Builder) this.h).setLinkUri(uri);
    }

    @Override // defpackage.en
    public void E(final int i2, final int i3, final String str, final String str2) {
        ((yf) this.h).l(new wg() { // from class: tg
            @Override // defpackage.wg
            public final void h(mi miVar) {
                miVar.f634a = 2;
                miVar.d = str;
                miVar.e = str2;
                miVar.f = i2;
                miVar.g = i3;
                miVar.h = null;
                miVar.i = null;
                miVar.j = null;
                miVar.k = -1;
                miVar.l = 0;
            }
        });
    }

    @Override // defpackage.zr0
    public void F(int i2, int i3, Object obj) {
        ((td1) this.h).f983a.d(i2, i3, obj);
    }

    @Override // defpackage.ex0
    public boolean G(MenuBuilder menuBuilder) {
        d2 d2Var = (d2) this.h;
        if (menuBuilder == d2Var.i) {
            return false;
        }
        d2Var.E = ((ls1) menuBuilder).B.f958a;
        ex0 ex0Var = d2Var.k;
        if (ex0Var != null) {
            return ex0Var.G(menuBuilder);
        }
        return false;
    }

    @Override // defpackage.ow0
    public void H(MenuBuilder menuBuilder) {
        ow0 ow0Var = ((ActionMenuView) this.h).B;
        if (ow0Var != null) {
            ow0Var.H(menuBuilder);
        }
    }

    @Override // defpackage.en
    public void I(int i2) {
        ((yf) this.h).l(new ug(i2, 0));
    }

    @Override // defpackage.h7
    public void J(int i2, float f) {
    }

    @Override // defpackage.en
    public void K() {
        ((yf) this.h).l(new c(10));
    }

    @Override // defpackage.en
    public void L(int i2) {
        ((yf) this.h).l(new ug(i2, 1));
    }

    @Override // defpackage.uw
    public void M(int i2) {
        ((ContentInfo.Builder) this.h).setFlags(i2);
    }

    public c1 R(int i2) {
        return null;
    }

    public c1 S(int i2) {
        return null;
    }

    public Point U(String str, Point point) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.h;
        int i2 = point.x;
        int i3 = point.y;
        return new Point(sharedPreferences.getInt(str + "_SELECTOR_X", i2), sharedPreferences.getInt(str + "_SELECTOR_Y", i3));
    }

    public boolean V(int i2, int i3, Bundle bundle) {
        return false;
    }

    @Override // defpackage.ex0
    public void a(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder instanceof ls1) {
            ((ls1) menuBuilder).A.k().c(false);
        }
        ex0 ex0Var = ((d2) this.h).k;
        if (ex0Var != null) {
            ex0Var.a(menuBuilder, z);
        }
    }

    @Override // defpackage.ww
    public int b() {
        int source;
        source = ((ContentInfo) this.h).getSource();
        return source;
    }

    @Override // defpackage.uw
    public xw build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.h).build();
        return new xw(new gm2(build));
    }

    @Override // defpackage.h2
    public boolean c(j2 j2Var, Menu menu) {
        cj cjVar = (cj) this.h;
        cjVar.E0 = menu.add(0, R.menu.bottom_navigation_apps, 0, R.string.benchmark_compare_action_compare);
        View inflate = LayoutInflater.from(cjVar.i0()).inflate(R.layout.action_bench_compare, (ViewGroup) null);
        inflate.setOnClickListener(new uc(this, 5, j2Var));
        cjVar.E0.setActionView(inflate);
        ym0.z(inflate, cjVar.A(R.string.benchmark_compare_action_compare));
        cjVar.E0.setShowAsAction(2);
        n02 n02Var = cjVar.e0;
        j2Var.m(cjVar.B(R.string.benchmark_compare_action_title, Integer.valueOf(n02Var != null ? n02Var.l.size() : 0)));
        return true;
    }

    @Override // defpackage.ww
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.h).getClip();
        return clip;
    }

    @Override // defpackage.en
    public void e(dn dnVar) {
    }

    @Override // defpackage.rw0
    public void f(MenuBuilder menuBuilder, MenuItem menuItem) {
        ((oo) this.h).m.removeCallbacksAndMessages(menuBuilder);
    }

    @Override // defpackage.h2
    public boolean g(j2 j2Var, MenuItem menuItem) {
        if (menuItem.getItemId() != R.menu.bottom_navigation_apps) {
            return false;
        }
        ((cj) this.h).y0();
        return true;
    }

    @Override // defpackage.db1
    public Object get() {
        return new fh((Context) ((b1) this.h).g, new i42(), new x42(), 13, false);
    }

    @Override // defpackage.jn
    public void h(IOException iOException) {
        ((c71) this.h).j(false, false);
    }

    @Override // defpackage.zr0
    public void i(int i2, int i3) {
        ((td1) this.h).j(i2, i3);
    }

    @Override // defpackage.zr0
    public void j(int i2, int i3) {
        ((td1) this.h).h(i2, i3);
    }

    @Override // defpackage.h7
    public void k(int i2) {
    }

    @Override // defpackage.ph
    public void l() {
        ((xg) this.h).e0.post(new l2(12, this));
    }

    @Override // defpackage.jn
    public void m(lg1 lg1Var) {
        String str;
        try {
            int i2 = lg1Var.j;
            String str2 = null;
            try {
                ng1 ng1Var = lg1Var.m;
                if (ng1Var != null) {
                    str2 = ng1Var.l();
                }
            } catch (Exception unused) {
            }
            lg1Var.close();
            boolean z = i2 >= 200 && i2 < 300;
            boolean z2 = z && x30.a(str2);
            if (z && (str = Build.MANUFACTURER) != null && str.equalsIgnoreCase("HUAWEI") && str2 != null && !str2.isEmpty()) {
                try {
                    String optString = new JSONObject(str2).optString("nonce", "");
                    if (!optString.isEmpty()) {
                        x30.b = optString;
                        x30.c = System.currentTimeMillis();
                    }
                } catch (Throwable unused2) {
                }
            }
            if (z2) {
                try {
                    ym0.x(d10.n());
                } catch (Throwable unused3) {
                }
            }
            if (i2 == 202) {
                ((c71) this.h).j(true, z2);
                return;
            }
            c71 c71Var = (c71) this.h;
            if (i2 == 204) {
                c71Var.j(false, z2);
            } else if (i2 != 429) {
                c71Var.j(false, z2);
            } else {
                c71Var.j(false, z2);
                i51.h("needs_upload_check", true);
            }
        } catch (Throwable th) {
            try {
                lg1Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.en
    public void n(String str) {
    }

    @Override // defpackage.rw0
    public void o(MenuBuilder menuBuilder, sw0 sw0Var) {
        oo ooVar = (oo) this.h;
        Handler handler = ooVar.m;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = ooVar.o;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuBuilder == ((no) arrayList.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        handler.postAtTime(new mo(this, i3 < arrayList.size() ? (no) arrayList.get(i3) : null, sw0Var, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.ph
    public void onResult(Object obj) {
        ((xg) this.h).e0.post(new k5(this, 5, (qh) obj));
    }

    @Override // defpackage.h2
    public boolean p(j2 j2Var, Menu menu) {
        return false;
    }

    @Override // defpackage.rd
    public void q(uu uuVar) {
        boolean z = uuVar.h == 0;
        a aVar = (a) this.h;
        if (z) {
            aVar.l(null, aVar.w);
            return;
        }
        my1 my1Var = aVar.o;
        if (my1Var != null) {
            ((mg0) my1Var.g).b(uuVar);
        }
    }

    @Override // defpackage.en
    public void r(int i2, int i3) {
        ((yf) this.h).l(new sg(i2, i3, 0));
    }

    @Override // defpackage.en
    public void s(String str, String str2, String str3, int i2) {
        ((yf) this.h).l(new vg(str, str2, str3, i2));
    }

    @Override // defpackage.uw
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.h).setExtras(bundle);
    }

    @Override // defpackage.en
    public void t(int i2, int i3) {
        ((yf) this.h).l(new sg(i2, i3, 1));
    }

    public String toString() {
        switch (this.g) {
            case 24:
                return rlfWzcx.eshVFCHPGBvbz + ((ContentInfo) this.h) + ILBLnlCHDVqsSN.QtaMr;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.h2
    public void u(j2 j2Var) {
        int c;
        n02 n02Var;
        cj cjVar = (cj) this.h;
        cjVar.D0 = null;
        cjVar.E0 = null;
        boolean z = cjVar.F0;
        cjVar.F0 = false;
        if (!z && (n02Var = cjVar.e0) != null) {
            LinkedHashMap linkedHashMap = n02Var.l;
            if (!linkedHashMap.isEmpty()) {
                linkedHashMap.clear();
                n02Var.m.k(Collections.unmodifiableSet(new LinkedHashSet(linkedHashMap.keySet())));
            }
        }
        k02 k02Var = cjVar.f0;
        if (k02Var != null && (c = k02Var.c()) != 0) {
            k02Var.f983a.d(0, c, null);
        }
        cjVar.B0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        gb2 gb2Var2;
        int i2 = 0;
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                AppBarLayout appBarLayout = (AppBarLayout) this.h;
                gb2Var2 = appBarLayout.getFitsSystemWindows() ? gb2Var : null;
                if (!Objects.equals(appBarLayout.m, gb2Var2)) {
                    appBarLayout.m = gb2Var2;
                    if (appBarLayout.D != null && appBarLayout.getTopInset() > 0) {
                        i2 = 1;
                    }
                    appBarLayout.setWillNotDraw(i2 ^ 1);
                    appBarLayout.requestLayout();
                }
                return gb2Var;
            case 16:
                ol olVar = (ol) this.h;
                nl nlVar = olVar.s;
                if (nlVar != null) {
                    olVar.l.c0.remove(nlVar);
                }
                nl nlVar2 = new nl(olVar.o, gb2Var);
                olVar.s = nlVar2;
                nlVar2.e(olVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = olVar.l;
                nl nlVar3 = olVar.s;
                ArrayList arrayList = bottomSheetBehavior.c0;
                if (!arrayList.contains(nlVar3)) {
                    arrayList.add(nlVar3);
                }
                return gb2Var;
            case 20:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.h;
                gb2Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? gb2Var : null;
                if (!Objects.equals(collapsingToolbarLayout.K, gb2Var2)) {
                    collapsingToolbarLayout.K = gb2Var2;
                    collapsingToolbarLayout.requestLayout();
                }
                return gb2Var.f329a.c();
            default:
                db2 db2Var = gb2Var.f329a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h;
                if (!Objects.equals(coordinatorLayout.t, gb2Var)) {
                    coordinatorLayout.t = gb2Var;
                    boolean z = gb2Var.d() > 0;
                    coordinatorLayout.u = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!db2Var.r()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i2 < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i2);
                            WeakHashMap weakHashMap = y62.f1215a;
                            if (!childAt.getFitsSystemWindows() || ((kx) childAt.getLayoutParams()).f555a == null || !db2Var.r()) {
                                i2++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return gb2Var;
        }
    }

    @Override // defpackage.ww
    public int w() {
        int flags;
        flags = ((ContentInfo) this.h).getFlags();
        return flags;
    }

    @Override // defpackage.ow0
    public boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        boolean onMenuItemSelected;
        g2 g2Var = ((ActionMenuView) this.h).G;
        if (g2Var != null) {
            Toolbar toolbar = ((kz1) g2Var).g;
            Iterator it = ((CopyOnWriteArrayList) toolbar.M.i).iterator();
            while (true) {
                if (!it.hasNext()) {
                    oz1 oz1Var = toolbar.O;
                    onMenuItemSelected = oz1Var != null ? ((qz1) oz1Var).g.v.onMenuItemSelected(0, menuItem) : false;
                } else if (((ud0) it.next()).f1036a.o(menuItem)) {
                    onMenuItemSelected = true;
                    break;
                }
            }
            if (onMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ww
    public ContentInfo y() {
        return (ContentInfo) this.h;
    }

    @Override // defpackage.en
    public void z(String str, ps1 ps1Var) {
        ((yf) this.h).l(new tb(str, 3, ps1Var));
    }
}
