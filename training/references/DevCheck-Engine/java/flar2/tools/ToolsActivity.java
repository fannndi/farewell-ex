package flar2.devcheck.tools;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.b02;
import defpackage.bh;
import defpackage.c;
import defpackage.c02;
import defpackage.c3;
import defpackage.c71;
import defpackage.cf2;
import defpackage.go1;
import defpackage.gr;
import defpackage.i51;
import defpackage.ig1;
import defpackage.jw0;
import defpackage.kj1;
import defpackage.n72;
import defpackage.op0;
import defpackage.ov1;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.ql2;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.te2;
import defpackage.tm0;
import defpackage.uz1;
import defpackage.vm0;
import defpackage.vq;
import defpackage.xo2;
import defpackage.zf;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.gputimes.GpuTimeActivity;
import flar2.devcheck.networkMapper.NetworkMapperActivity;
import flar2.devcheck.permissionsSummary.PermissionsSummaryActivity;
import flar2.devcheck.systemGraphs.SystemGraphsActivity;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import flar2.devcheck.temperature.TemperatureActivity;
import flar2.devcheck.usage.NetworkUsageActivity;
import flar2.devcheck.usage.ScreentimeActivity;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class ToolsActivity extends a5 {
    public static String I;
    public sj F;
    public ArrayList G;
    public b02 H;

    public final void B(int i, String str) {
        if (str.equals(getString(R.string.play_integrity_check))) {
            if (!this.F.d()) {
                uz1.q0(this);
                return;
            }
            if (i51.d("lctsc") >= System.currentTimeMillis() - 30000) {
                String str2 = I;
                ArrayList arrayList = this.G;
                if (str2 != null) {
                    arrayList.remove(3);
                    this.G.add(3, new c02(false, I.contains("MEETS_DEVICE_INTEGRITY"), I.contains("MEETS_BASIC_INTEGRITY"), I.contains("MEETS_STRONG_INTEGRITY"), false));
                    this.H.g(3);
                    return;
                } else {
                    arrayList.remove(3);
                    this.G.add(3, new c02(false, false, false, false, true));
                    this.H.g(3);
                    return;
                }
            }
            te2 te2Var = (te2) tm0.b().c;
            if (te2Var == null) {
                new vm0().b(this);
                te2Var = (te2) tm0.b().c;
            }
            if (te2Var == null) {
                this.G.remove(3);
                this.G.add(3, new c02(false, false, false, false, true));
                this.H.g(3);
            } else {
                try {
                    byte[] digest = MessageDigest.getInstance("SHA-256").digest("asdf".getBytes(StandardCharsets.UTF_8));
                    StringBuilder sb = new StringBuilder(digest.length * 2);
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & 255);
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                    }
                    String sb2 = sb.toString();
                    zf a2 = cf2.a();
                    a2.h = sb2;
                    xo2 a3 = te2Var.a(a2.e());
                    c71 c71Var = new c71(13, this);
                    a3.getClass();
                    kj1 kj1Var = ov1.f761a;
                    a3.b(kj1Var, c71Var);
                    a3.b.d(new ql2(kj1Var, new jw0(23)));
                    a3.h();
                } catch (Exception unused) {
                }
            }
            this.G.remove(3);
            this.G.add(3, new c02(true, false, false, false, false));
            this.H.g(3);
            return;
        }
        if (str.equals(getString(R.string.paired_devices))) {
            Intent intent = new Intent(this, (Class<?>) BluetoothActivity.class);
            intent.putExtra("start", "paired");
            startActivity(intent);
            return;
        }
        if (str.equals(getString(R.string.nearby_devices))) {
            Intent intent2 = new Intent(this, (Class<?>) BluetoothActivity.class);
            intent2.putExtra("start", "nearby");
            startActivity(intent2);
            return;
        }
        if (str.equals(getString(R.string.task_manager))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) TaskManager2Activity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.sysgraphs_title))) {
            startActivity(new Intent(this, (Class<?>) SystemGraphsActivity.class));
            return;
        }
        if (str.equals(getString(R.string.screentime))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) ScreentimeActivity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.permissions_explorer))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) PermissionsSummaryActivity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.cpu_times))) {
            startActivity(new Intent(this, (Class<?>) CPUTimeActivity.class));
            return;
        }
        if (str.equals(getString(R.string.gpu_times))) {
            startActivity(new Intent(this, (Class<?>) GpuTimeActivity.class));
            return;
        }
        if (str.equals(getString(R.string.cpu_analysis))) {
            startActivity(new Intent(this, (Class<?>) CPUActivity.class));
            return;
        }
        if (str.equals(getString(R.string.temperatures))) {
            startActivity(new Intent(this, (Class<?>) TemperatureActivity.class));
            return;
        }
        if (str.equals(getString(R.string.wifi_scanner))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) WifiActivity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.network_mapper))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) NetworkMapperActivity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.network_usage))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) NetworkUsageActivity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.gps_status))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) GpsActivity.class));
                return;
            } else {
                uz1.q0(this);
                return;
            }
        }
        if (str.equals(getString(R.string.usb_check))) {
            if (this.F.d()) {
                startActivity(new Intent(this, (Class<?>) USBActivity.class));
            } else {
                uz1.q0(this);
            }
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String trim;
        String str;
        c3.z(this);
        super.onCreate(bundle);
        pr.m(getWindow());
        setContentView(R.layout.activity_tools);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tools_recyclerview);
        if (coordinatorLayout != null && recyclerView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.tools));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        pr.U(getWindow(), false);
        Context applicationContext = getApplicationContext();
        go1 m = op0.m(applicationContext);
        if (!i51.g("lctsc")) {
            i51.k("lctsc", System.currentTimeMillis() - 60000);
        }
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.tools_recyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager();
        recyclerView2.setLayoutManager(gridLayoutManager);
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        arrayList.add(new c02(null, getString(R.string.system), 8));
        if (uz1.e() || uz1.f()) {
            ArrayList n = uz1.n("su --help");
            if (n.size() < 2) {
                n.clear();
                ArrayList n2 = uz1.n("su -h");
                if (n2.size() > 1) {
                    trim = ((String) n2.get(0)).trim();
                } else {
                    str = "";
                    String str2 = getString(R.string.version) + " " + uz1.o("su -v").replace(":MAGISKSU", "").replace(":SUPERSU", "").trim() + " (" + uz1.o("su -V").trim() + ")";
                    String trim2 = uz1.o("which su").trim();
                    Drawable drawable = getDrawable(R.drawable.ic_supersu);
                    if (!str.contains("MagiskSU") || str.contains("MAGISKSU")) {
                        drawable = getDrawable(R.drawable.ic_magisk);
                    }
                    this.G.add(new c02(drawable, str, str2, trim2, true));
                }
            } else {
                trim = ((String) n.get(0)).trim();
            }
            str = trim;
            String str22 = getString(R.string.version) + " " + uz1.o("su -v").replace(":MAGISKSU", "").replace(":SUPERSU", "").trim() + " (" + uz1.o("su -V").trim() + ")";
            String trim22 = uz1.o("which su").trim();
            Drawable drawable2 = getDrawable(R.drawable.ic_supersu);
            if (!str.contains("MagiskSU")) {
            }
            drawable2 = getDrawable(R.drawable.ic_magisk);
            this.G.add(new c02(drawable2, str, str22, trim22, true));
        } else {
            this.G.add(new c02((Drawable) null, (String) null, (String) null, (String) null, false));
        }
        ArrayList arrayList2 = this.G;
        Resources resources = getResources();
        ThreadLocal threadLocal = ig1.f428a;
        arrayList2.add(new c02(resources.getDrawable(R.drawable.ic_privacy, null), getString(R.string.permissions_explorer), 0));
        ArrayList arrayList3 = this.G;
        c02 c02Var = new c02();
        c02Var.g = false;
        c02Var.j = false;
        c02Var.h = false;
        c02Var.i = true;
        c02Var.f = 4;
        arrayList3.add(c02Var);
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_action_usage, null), getString(R.string.screentime), 0));
        if (m.c()) {
            this.G.add(new c02(getResources().getDrawable(R.drawable.ic_action_history, null), getString(R.string.task_manager), 0));
        }
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_action_monitors, null), getString(R.string.sysgraphs_title), 5));
        this.G.add(new c02(null, getString(R.string.hardware), 8));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_cpu_light, null), getString(R.string.cpu_analysis), 5));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_graph, null), getString(R.string.cpu_times), 5));
        try {
            if (GpuTimeActivity.F(applicationContext) != null) {
                this.G.add(new c02(getResources().getDrawable(R.drawable.ic_graph, null), getString(R.string.gpu_times), 5));
            }
        } catch (Throwable unused) {
        }
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_temperature, null), getString(R.string.temperatures), 5));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_tools_usb, null), getString(R.string.usb_check), 0));
        this.G.add(new c02(null, getString(R.string.connectivity), 8));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_bluetooth, null), getString(R.string.bluetooth), 3));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_wifi_dark, null), getString(R.string.wifi_scanner), 0));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_lan, null), getString(R.string.network_mapper), 0));
        this.G.add(new c02(getResources().getDrawable(R.drawable.ic_network_wan, null), getString(R.string.network_usage), 0));
        if (getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            this.G.add(new c02(getResources().getDrawable(R.drawable.ic_gps, null), getString(R.string.gps_status), 0));
        }
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        sj sjVar = (sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.F = sjVar;
        sjVar.c().e(this, new bh(6, this, gridLayoutManager, recyclerView2));
        this.j.a(this.F.b.f792a);
    }
}
