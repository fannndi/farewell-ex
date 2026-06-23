package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.nativebridge.xm.oWuW;
import java.util.ArrayList;
import java.util.List;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public class gu1 extends ld0 implements b01, h01, gz0, d01, f01 {
    public RecyclerView d0;
    public wu1 e0;
    public boolean f0 = false;
    public n3 g0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.tab_fragment2, viewGroup, false);
        this.d0 = (RecyclerView) inflate.findViewById(R.id.fragment_recyclerview);
        i0();
        this.d0.setLayoutManager(new LinearLayoutManager(1));
        l01 l01Var = new l01(i0(), (List) new ArrayList());
        l01Var.g = this;
        l01Var.k = this;
        l01Var.l = this;
        l01Var.p = this;
        l01Var.j = this;
        this.d0.setAdapter(l01Var);
        int i = (i0().getResources().getBoolean(R.bool.isTablet) || i0().getResources().getBoolean(R.bool.isTablet10)) ? 320 : (i0().getResources().getBoolean(R.bool.isNexus6) && i0().getResources().getBoolean(R.bool.isLandscape)) ? 420 : i0().getResources().getBoolean(R.bool.isLandscape) ? 350 : i0().getResources().getBoolean(R.bool.isNexus6) ? 530 : 450;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.g(i);
        swipeRefreshLayout.setOnRefreshListener(new c71(7, this));
        swipeRefreshLayout.setRefreshing(true);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(wu1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        wu1 wu1Var = (wu1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.e0 = wu1Var;
        wu1Var.h();
        wu1Var.c.e(D(), new bh(5, this, swipeRefreshLayout, l01Var));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a(CDsMEtnUjndKau.SSPXFwfvkGTolT);
        n3 n3Var = this.g0;
        if (n3Var != null) {
            n3Var.dismiss();
        }
    }

    @Override // defpackage.ld0
    public final void X(int i, String[] strArr, int[] iArr) {
        if (i == 123) {
            try {
                if (iArr.length == 0) {
                    return;
                }
                if (iArr[0] == 0) {
                    this.e0.h();
                } else {
                    if (r0("android.permission.READ_PHONE_STATE")) {
                        return;
                    }
                    Toast.makeText(i0(), R.string.permission_denied, 0).show();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "system");
    }

    @Override // defpackage.gz0
    public final void c(String str) {
        ((ClipboardManager) i0().getApplicationContext().getSystemService(BIxeFreLLop.EzdUvCKUwDl)).setPrimaryClip(ClipData.newPlainText(oWuW.JURKjSfexvadkH, str));
        Toast.makeText(i0(), R.string.copied_to_clipboard, 0).show();
    }

    @Override // defpackage.d01
    public final void d(String str) {
        try {
            if (str.equals(A(R.string.fingerprint).toString())) {
                v0();
            } else if (str.equals(A(R.string.radio).toString())) {
                w0();
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.b01
    public final void e() {
        try {
            f0(new String[]{"android.permission.READ_PHONE_STATE"}, 123);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.f01
    public final void i(String str) {
        if (str.equals(A(R.string.operating_system))) {
            uz1.w0(i0());
            return;
        }
        if (str.equals(A(R.string.device))) {
            Context i0 = i0();
            String str2 = uz1.f1060a;
            try {
                try {
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(YSHrxiHkAFcciU.taLoDHEs, yttXLrAeLjN.EQhpuZXTvKFIv));
                        intent.addFlags(268435456);
                        i0.startActivity(intent);
                    } catch (Exception unused) {
                        Intent intent2 = new Intent(CGvJMCDBOmCdj.BvMe);
                        intent2.addFlags(268435456);
                        i0.startActivity(intent2);
                    }
                } catch (Exception unused2) {
                    Intent intent3 = new Intent(aEQQDLUUMo.TVDVT);
                    intent3.addFlags(268435456);
                    i0.startActivity(intent3);
                }
            } catch (Exception unused3) {
            }
        }
    }

    @Override // defpackage.d01
    public final void j(String str) {
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
    }

    @Override // defpackage.h01
    public final void o() {
    }

    public final void u0() {
        this.g0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (z().getDisplayMetrics().widthPixels * 90) / 100;
            if (z().getConfiguration().orientation == 2 || z().getBoolean(R.bool.isTablet)) {
                i = (z().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.g0.getWindow().setLayout(i, -2);
        } catch (Exception unused) {
        }
    }

    public final void v0() {
        th2 th2Var = new th2(g0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.n = true;
        th2Var.k(R.string.fingerprint);
        j3Var.g = Build.FINGERPRINT;
        th2Var.j(A(R.string.okay), new fu1(this, 1));
        n3 a2 = th2Var.a();
        this.g0 = a2;
        a2.show();
        u0();
    }

    public final void w0() {
        th2 th2Var = new th2(g0());
        String radioVersion = Build.getRadioVersion();
        if (radioVersion == null || radioVersion.isEmpty()) {
            radioVersion = A(R.string.not_available);
        }
        String A = A(R.string.radio);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = A;
        j3Var.n = true;
        j3Var.g = radioVersion;
        th2Var.j(A(R.string.okay), new fu1(this, 0));
        n3 a2 = th2Var.a();
        this.g0 = a2;
        a2.show();
        u0();
    }
}
