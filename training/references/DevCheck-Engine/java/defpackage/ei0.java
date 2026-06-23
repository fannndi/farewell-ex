package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import flar2.devcheck.MainActivity;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.opengl.OpenGLInfoActivity;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.tools.CPUActivity;
import flar2.devcheck.vulkanInfo.VulkanInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ei0 extends ld0 implements h01, d01, f01 {
    public RecyclerView d0;
    public SwipeRefreshLayout e0;
    public mi0 g0;
    public n3 h0;
    public BluetoothAdapter i0;
    public RecyclerView k0;
    public l01 l0;
    public boolean f0 = false;
    public final ci0 j0 = new ci0(this, 0);
    public final ArrayList m0 = new ArrayList();
    public final ci0 n0 = new ci0(this, 1);

    public static void F0(Context context) {
        try {
            Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
            intent.addFlags(1350565888);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void A0() {
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(g0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        int i = 1;
        j3Var.n = true;
        th2Var.j(A(R.string.okay), new bi0(this, 6));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(i0())) {
                imageView.setImageResource(R.drawable.ic_input_dark);
            } else {
                imageView.setImageResource(R.drawable.ic_input_light);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(A(R.string.input_devices));
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new di0(this, recyclerView, i).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }

    public final void B0(int i) {
        ArrayList arrayList = this.m0;
        arrayList.clear();
        arrayList.add(new hn0(1, A(R.string.scanning), (String) null));
        new Handler().postDelayed(new k5(this, 19, new IntentFilter("android.bluetooth.device.action.FOUND")), i);
    }

    public final void C0() {
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(g0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = true;
        int i = 2;
        th2Var.j(A(R.string.okay), new bi0(this, i));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(i0())) {
                imageView.setImageResource(R.drawable.ic_storage_light);
            } else {
                imageView.setImageResource(R.drawable.ic_storage_dark);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(A(R.string.partitions));
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new di0(this, recyclerView, i).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }

    public final void D0(Intent intent) {
        th2 th2Var = new th2(g0());
        String stringExtra = intent.getStringExtra("volume_label");
        String A = A(R.string.disk_usage);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = A;
        j3Var.g = B(R.string.usb_disk_access, stringExtra);
        th2Var.h(A(R.string.cancel), new bi0(this, 8));
        th2Var.j(A(R.string.okay), new gi(this, 3, intent));
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }

    public final void E0() {
        th2 th2Var = new th2(g0());
        String str = "\n" + A(R.string.submit_hw_msg) + "\n";
        j3 j3Var = (j3) th2Var.h;
        j3Var.g = str;
        j3Var.e = A(R.string.report);
        j3Var.n = false;
        th2Var.h(A(R.string.cancel), null);
        j3Var.l = A(R.string.preview);
        j3Var.m = null;
        th2Var.j(A(R.string.submit), new bi0(this, 9));
        n3 a2 = th2Var.a();
        this.h0 = a2;
        try {
            a2.show();
            this.h0.f(-3).setOnClickListener(new tc(11, this));
            try {
                ((TextView) this.h0.findViewById(R.id.alertTitle)).setTypeface(ig1.b(i0(), R.font.open_sans_semibold));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            this.h0 = null;
        }
    }

    @Override // defpackage.ld0
    public final void K(int i, int i2, Intent intent) {
        super.K(i, i2, intent);
        if (i2 == -1 && i == 213) {
            if (intent.getData() != null) {
                i0().getContentResolver().takePersistableUriPermission(intent.getData(), 1);
            }
            this.g0.l();
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.tab_fragment2, viewGroup, false);
        this.d0 = (RecyclerView) inflate.findViewById(R.id.fragment_recyclerview);
        i0();
        int i = 1;
        this.d0.setLayoutManager(new LinearLayoutManager(1));
        l01 l01Var = new l01(i0(), (List) new ArrayList());
        l01Var.o = this;
        l01Var.k = this;
        l01Var.j = this;
        l01Var.p = this;
        this.d0.setAdapter(l01Var);
        this.i0 = BluetoothAdapter.getDefaultAdapter();
        int i2 = (z().getBoolean(R.bool.isTablet) || z().getBoolean(R.bool.isTablet10)) ? 320 : (z().getBoolean(R.bool.isNexus6) && z().getBoolean(R.bool.isLandscape)) ? 420 : z().getBoolean(R.bool.isLandscape) ? 350 : z().getBoolean(R.bool.isNexus6) ? 530 : 450;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.e0 = swipeRefreshLayout;
        swipeRefreshLayout.g(i2);
        this.e0.setOnRefreshListener(new p8(21, this));
        this.e0.setRefreshing(true);
        a5 g0 = g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(mi0.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        mi0 mi0Var = (mi0) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.g0 = mi0Var;
        mi0Var.l();
        mi0Var.c.e(D(), new rn(this, i, l01Var));
        this.g0.l.e(D(), new u7(3));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        BluetoothAdapter bluetoothAdapter;
        this.K = true;
        tl0.a("hardware");
        n3 n3Var = this.h0;
        if (n3Var != null) {
            n3Var.dismiss();
        }
        try {
            i0().unregisterReceiver(this.j0);
        } catch (Exception unused) {
        }
        try {
            i0().unregisterReceiver(this.n0);
        } catch (Exception unused2) {
        }
        try {
            if ((this.i0 == null || Build.VERSION.SDK_INT < 31 || pr.g(i0(), "android.permission.BLUETOOTH_SCAN") == 0) && (bluetoothAdapter = this.i0) != null) {
                bluetoothAdapter.cancelDiscovery();
            }
        } catch (Exception unused3) {
        }
    }

    @Override // defpackage.ld0
    public final void X(int i, String[] strArr, int[] iArr) {
        try {
            switch (i) {
                case 132:
                    if (iArr.length != 0) {
                        if (iArr[0] != 0) {
                            if (!r0("android.permission.ACCESS_FINE_LOCATION")) {
                                Toast.makeText(i0(), R.string.permission_denied, 0).show();
                                break;
                            }
                        } else {
                            B0(3000);
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 133:
                    if (iArr.length != 0) {
                        if (iArr[0] != 0) {
                            if (!r0("android.permission.BLUETOOTH_SCAN")) {
                                Toast.makeText(i0(), R.string.permission_denied, 0).show();
                                break;
                            }
                        } else {
                            B0(3000);
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 134:
                    if (iArr.length != 0) {
                        if (iArr[0] != 0) {
                            if (!r0("android.permission.BLUETOOTH_CONNECT")) {
                                Toast.makeText(i0(), A(R.string.permission_denied), 0).show();
                                break;
                            }
                        } else if (Build.VERSION.SDK_INT < 33 && !this.i0.isEnabled()) {
                            this.i0.enable();
                            this.g0.l();
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "hardware");
        ((MainActivity) g0()).F = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(bOxzFZXgEkjph.laBGg);
        i0().registerReceiver(this.n0, intentFilter);
    }

    @Override // defpackage.d01
    public final void d(String str) {
        try {
            if (str.equals(A(R.string.input_devices)) || str.equals("Input devices")) {
                A0();
                return;
            }
            if (str.equals(A(R.string.partitions)) || str.equals("Disk partitions")) {
                C0();
                return;
            }
            if (str.equals(jYVJoqfHJs.fGOvWHdAtZAx)) {
                y0();
                return;
            }
            if (str.equals(A(R.string.bluetooth_support)) || str.equals("Bluetooth support")) {
                if (this.i0.isEnabled()) {
                    this.g0.l();
                    return;
                } else {
                    x0(str);
                    return;
                }
            }
            if (str.equals(A(R.string.extensions)) || str.equals("Extensions")) {
                z0();
                return;
            }
            if (str.equals(A(R.string.vulkan_analysis)) || str.equals(bOxzFZXgEkjph.DZzQHifjoZ)) {
                s0(new Intent(i0(), (Class<?>) VulkanInfoActivity.class));
            } else if (str.equals(A(R.string.opengl_analysis)) || str.equals("Open GL Capabilities")) {
                s0(new Intent(i0(), (Class<?>) OpenGLInfoActivity.class));
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.f01
    public final void i(String str) {
        if (str.equals(A(R.string.display))) {
            uz1.s0(i0());
            return;
        }
        if (str.equals(A(R.string.bluetooth))) {
            F0(i0());
            return;
        }
        if (str.equals(A(R.string.storage))) {
            uz1.v0(i0());
            return;
        }
        if (str.equals(A(R.string.memory))) {
            uz1.t0(i0());
            return;
        }
        if (str.equals(A(R.string.processor))) {
            try {
                if (i51.b("pfs").booleanValue()) {
                    Toast.makeText(i0(), i0().getString(R.string.already_submitted), 0).show();
                } else {
                    E0();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.d01
    public final void j(String str) {
        try {
            if (!str.equals(A(R.string.cpu_analysis)) && !str.equals("CPU Analysis")) {
                if (!str.equals(A(R.string.vulkan_analysis)) && !str.equals("Vulkan Capabilities")) {
                    if (!str.equals(A(R.string.opengl_analysis)) && !str.equals("Open GL Capabilities")) {
                        if (!str.equals(A(R.string.input_devices)) && !str.equals("Input devices")) {
                            if (!str.equals(A(R.string.partitions)) && !str.equals("Disk partitions")) {
                                if (str.equals(A(R.string.paired_devices)) || str.equals("Paired devices") || str.equals(A(R.string.nearby_devices)) || str.equals("Nearby devices")) {
                                    w0(str);
                                }
                            }
                            C0();
                        }
                        A0();
                    }
                    s0(new Intent(i0(), (Class<?>) OpenGLInfoActivity.class));
                }
                s0(new Intent(i0(), (Class<?>) VulkanInfoActivity.class));
            }
            s0(new Intent(i0(), (Class<?>) CPUActivity.class));
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
        if (str.equals(A(R.string.disk_usage)) || str.equals("Disk usage")) {
            try {
                D0(intent);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.h01
    public final void o() {
        try {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=flar2.hbmwidget"));
                intent.addFlags(1350565888);
                s0(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=flar2.hbmwidget"));
            intent2.addFlags(1350565888);
            s0(intent2);
        }
    }

    public final void u0() {
        this.h0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (z().getDisplayMetrics().widthPixels * 90) / 100;
            if (z().getConfiguration().orientation == 2 || z().getBoolean(R.bool.isTablet)) {
                i = (z().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.h0.getWindow().setLayout(i, -2);
        } catch (Exception unused) {
        }
    }

    public final void v0(int i) {
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(g0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = true;
        int i2 = 0;
        th2Var.h(A(R.string.cancel), new bi0(this, i2));
        th2Var.j(A(R.string.settings), new bi0(this, 1));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(i0())) {
                imageView.setImageResource(R.drawable.ic_bluetooth_dark);
            } else {
                imageView.setImageResource(R.drawable.ic_bluetooth_light);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(A(R.string.bluetooth));
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new di0(this, recyclerView, i2).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }

    public final void w0(String str) {
        if (!this.i0.isEnabled()) {
            x0(str);
            return;
        }
        if (str.equals(A(R.string.paired_devices)) || str.equals("Paired devices")) {
            if (Build.VERSION.SDK_INT < 31) {
                v0(0);
                return;
            } else if (pr.g(i0(), "android.permission.BLUETOOTH_CONNECT") == 0) {
                v0(0);
                return;
            } else {
                f0(new String[]{"android.permission.BLUETOOTH_CONNECT"}, 134);
                return;
            }
        }
        int i = Build.VERSION.SDK_INT;
        String str2 = QCeVODiUkb.LtNIZj;
        if (i < 31) {
            if (pr.g(i0(), str2) == 0) {
                B0(0);
                return;
            } else {
                f0(new String[]{str2}, 132);
                return;
            }
        }
        if (pr.g(i0(), "android.permission.BLUETOOTH_SCAN") == 0 && pr.g(i0(), str2) == 0) {
            B0(0);
        } else {
            f0(new String[]{str2, "android.permission.BLUETOOTH_SCAN"}, 132);
        }
    }

    public final void x0(String str) {
        th2 th2Var = new th2(g0());
        String A = A(R.string.bluetooth_is_off);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = A;
        j3Var.n = true;
        if (Build.VERSION.SDK_INT >= 33) {
            th2Var.f(R.string.bluetooth_msg2);
            th2Var.h(A(R.string.okay), null);
        } else {
            j3Var.g = A(R.string.Bluetooth_msg);
            th2Var.h(A(R.string.no), null);
            th2Var.j(A(R.string.yes), new gi(this, 2, str));
        }
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }

    public final void y0() {
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(g0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = true;
        th2Var.j(A(R.string.okay), new bi0(this, 5));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(i0())) {
                imageView.setImageResource(R.drawable.ic_cpu_light);
            } else {
                imageView.setImageResource(R.drawable.ic_cpu_dark);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText("/proc/cpuinfo");
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new di0(this, recyclerView, 3).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }

    public final void z0() {
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(g0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = true;
        th2Var.j(A(R.string.okay), new bi0(this, 7));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(i0())) {
                imageView.setImageResource(R.drawable.ic_cpu_light);
            } else {
                imageView.setImageResource(R.drawable.ic_cpu_dark);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(A(R.string.extensions));
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new di0(this, recyclerView, 4).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.h0;
        if (n3Var != null && n3Var.isShowing()) {
            this.h0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.h0 = a2;
        a2.show();
        u0();
    }
}
