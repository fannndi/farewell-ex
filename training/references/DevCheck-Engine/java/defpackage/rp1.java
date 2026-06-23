package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class rp1 extends ld0 implements u61 {
    public boolean d0 = false;
    public RecyclerView e0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.permissions_special_access_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        u8 u8Var = new u8(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom(), 9);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(recyclerView, u8Var);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        g0().A(toolbar);
        sl r = g0().r();
        Objects.requireNonNull(r);
        r.j0(true);
        toolbar.setNavigationOnClickListener(new tc(28, this));
        toolbar.setTitle(g0().getString(R.string.special_access));
        if (uz1.d(i0())) {
            g0().getWindow().setStatusBarColor(i0().getColor(R.color.cardview_dark_background));
        } else {
            g0().getWindow().setStatusBarColor(i0().getColor(R.color.cardview_light_background));
        }
        this.e0 = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        this.e0.setLayoutManager(new LinearLayoutManager(1));
        x61 x61Var = new x61(g0(), new ArrayList(), this);
        this.e0.setAdapter(x61Var);
        View findViewById = inflate.findViewById(R.id.progressbar);
        findViewById.setVisibility(0);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(sp1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        sp1 sp1Var = (sp1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        if (sp1Var.c == null) {
            ew0 ew0Var = new ew0(0);
            sp1Var.c = ew0Var;
            ew0Var.l(sp1Var.e, new nc(26, sp1Var));
        }
        sp1Var.c.e(D(), new q8(this, x61Var, swipeRefreshLayout, findViewById, 4));
        swipeRefreshLayout.setOnRefreshListener(new u40(this, sp1Var, 10, false));
        return inflate;
    }

    @Override // defpackage.u61
    public final void p(String str, HashMap hashMap) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2078357533:
                if (str.equals("android.permission.WRITE_SETTINGS")) {
                    c = 0;
                    break;
                }
                break;
            case -1820920440:
                if (str.equals("android.permission.BIND_DEVICE_ADMIN")) {
                    c = 1;
                    break;
                }
                break;
            case -1813079487:
                if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c = 2;
                    break;
                }
                break;
            case -1783097621:
                if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c = 3;
                    break;
                }
                break;
            case -1746502293:
                if (str.equals("android.permission.BIND_VR_LISTENER_SERVICE")) {
                    c = 4;
                    break;
                }
                break;
            case -1561629405:
                if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c = 5;
                    break;
                }
                break;
            case -1329757649:
                if (str.equals("android.permission.BIND_TV_INPUT")) {
                    c = 6;
                    break;
                }
                break;
            case -784330217:
                if (str.equals("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    c = 7;
                    break;
                }
                break;
            case -272536472:
                if (str.equals("android.permission.BIND_VPN_SERVICE")) {
                    c = '\b';
                    break;
                }
                break;
            case -162862488:
                if (str.equals(XmJDY.dDmigjaQYMrHXIz)) {
                    c = '\t';
                    break;
                }
                break;
            case -121723492:
                if (str.equals("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
                    c = '\n';
                    break;
                }
                break;
            case 358539178:
                if (str.equals(UQdsoaJMID.gIvaNVInhCw)) {
                    c = 11;
                    break;
                }
                break;
            case 970694249:
                if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c = '\f';
                    break;
                }
                break;
            case 1412417858:
                if (str.equals("android.permission.BIND_ACCESSIBILITY_SERVICE")) {
                    c = '\r';
                    break;
                }
                break;
            case 1448369304:
                if (str.equals("android.permission.BIND_INPUT_METHOD")) {
                    c = 14;
                    break;
                }
                break;
            case 1590470175:
                if (str.equals(CDsMEtnUjndKau.YKvmiNqDDEx)) {
                    c = 15;
                    break;
                }
                break;
            case 1777263169:
                if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                d10.L(i0(), "android.settings.action.MANAGE_WRITE_SETTINGS");
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    s0(new Intent().setComponent(new ComponentName("com.android.settings", "com.android.settings.DeviceAdminSettings")));
                    break;
                } catch (Exception unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    d10.L(i0(), RIhTGWkqQvGL.gRfFnSIIjcsKBZ);
                    break;
                }
                break;
            case 3:
                d10.L(i0(), "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                d10.L(i0(), "android.settings.VR_LISTENER_SETTINGS");
                break;
            case 5:
                d10.L(i0(), "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                d10.L(i0(), "android.settings.PICTURE_IN_PICTURE_SETTINGS");
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                d10.L(i0(), "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                break;
            case '\b':
                d10.L(i0(), "android.settings.VPN_SETTINGS");
                break;
            case rt0.o /* 9 */:
                d10.L(i0(), "android.settings.USAGE_ACCESS_SETTINGS");
                break;
            case '\n':
                d10.L(i0(), "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                break;
            case 11:
                d10.L(i0(), "android.settings.REQUEST_MANAGE_MEDIA");
                break;
            case '\f':
                d10.L(i0(), "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                break;
            case '\r':
                d10.L(i0(), "android.settings.ACCESSIBILITY_SETTINGS");
                break;
            case 14:
                d10.L(i0(), "android.settings.INPUT_METHOD_SETTINGS");
                break;
            case 15:
                d10.L(i0(), "android.settings.NFC_SETTINGS");
                break;
            case 16:
                d10.L(i0(), "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                break;
        }
    }
}
