package defpackage;

import Cwd.ynLVXgis;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class v8 extends ld0 implements o51 {
    public View d0;
    public MaterialToolbar e0;
    public String f0;
    public HashMap g0;
    public f71 h0;
    public RecyclerView k0;
    public boolean i0 = false;
    public boolean j0 = false;
    public String l0 = "";

    @Override // defpackage.ld0
    public final void K(int i, int i2, Intent intent) {
        super.K(i, i2, intent);
        if (i2 == -1 && i == 312) {
            try {
                MainApp.h.submit(new hk2(this, intent, 5, false));
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.g0 = (HashMap) bundle2.getSerializable("appPermissionMap");
            this.f0 = this.m.getString("title");
        }
        if (this.f0 == null) {
            this.f0 = "TODO";
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.permissions_apps_fragment, viewGroup, false);
        this.d0 = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        u8 u8Var = new u8(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom(), 0);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(recyclerView, u8Var);
        this.e0 = (MaterialToolbar) this.d0.findViewById(R.id.toolbar);
        g0().A(this.e0);
        sl r = g0().r();
        Objects.requireNonNull(r);
        int i2 = 1;
        r.j0(true);
        if (uz1.d(i0())) {
            g0().getWindow().setStatusBarColor(i0().getColor(R.color.cardview_dark_background));
        } else {
            g0().getWindow().setStatusBarColor(i0().getColor(R.color.cardview_light_background));
        }
        String str = this.f0;
        str.getClass();
        if (str.equals("special_access")) {
            this.e0.setTitle(g0().getString(R.string.special_access));
        } else if (str.equals("accessibility")) {
            this.e0.setTitle(g0().getString(R.string.accessibility));
        } else {
            String str2 = this.f0;
            try {
                str2 = uz1.b(str2.substring(str2.lastIndexOf(".") + 1).replace("_", " "));
            } catch (Exception unused) {
            }
            this.e0.setTitle(str2);
        }
        this.k0 = (RecyclerView) this.d0.findViewById(R.id.recyclerview);
        this.k0.setLayoutManager(new LinearLayoutManager(1));
        n8 n8Var = new n8(g0(), new ArrayList());
        n8Var.f = this;
        this.k0.setAdapter(n8Var);
        View findViewById = this.d0.findViewById(R.id.progressbar);
        findViewById.setVisibility(0);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(f71.class);
        String b = a2.b();
        if (b == null) {
            c.m(ynLVXgis.BRTd);
            return null;
        }
        this.h0 = (f71) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.d0.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new p8(i, this));
        f71 f71Var = this.h0;
        l61 l61Var = f71Var.d;
        if (f71Var.c == null) {
            ew0 ew0Var = new ew0(0);
            f71Var.c = ew0Var;
            ew0Var.l(l61Var, new e71(f71Var, i2));
        }
        f71Var.c.i((List) l61Var.d());
        f71Var.c.e(D(), new q8(this, n8Var, swipeRefreshLayout, findViewById, 0));
        return this.d0;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        if (this.j0) {
            f71 f71Var = this.h0;
            l61 l61Var = f71Var.d;
            List list = (List) l61Var.p.d();
            if (list != null && !list.isEmpty()) {
                l61Var.m(list);
            }
            f71Var.e.submit(new r60(11, f71Var));
            this.j0 = false;
        }
    }

    @Override // defpackage.o51
    public final void b(ApplicationInfo applicationInfo) {
        String str;
        String[] strArr;
        try {
            PackageManager packageManager = i0().getPackageManager();
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 0);
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = applicationInfo.splitNames;
                if (strArr != null) {
                    str = applicationInfo.loadLabel(packageManager).toString().replace(" ", "") + "-" + packageInfo.versionName + ".apks";
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.TITLE", str);
                    this.l0 = applicationInfo.packageName;
                    t0(intent, 312);
                }
            }
            str = applicationInfo.loadLabel(packageManager).toString().replace(" ", "") + "-" + packageInfo.versionName + ".apk";
            intent.setType(CDsMEtnUjndKau.lTUdDWihMYsvlIA);
            intent.putExtra("android.intent.extra.TITLE", str);
            this.l0 = applicationInfo.packageName;
            t0(intent, 312);
        } catch (Exception unused) {
        }
    }

    public final void u0(String str) {
        try {
            ApplicationInfo applicationInfo = i0().getPackageManager().getApplicationInfo(str, 0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("appInfo", applicationInfo);
            p51 p51Var = new p51();
            p51Var.w0 = this;
            p51Var.m0(bundle);
            p51Var.z0(u(), applicationInfo.packageName);
            this.j0 = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
