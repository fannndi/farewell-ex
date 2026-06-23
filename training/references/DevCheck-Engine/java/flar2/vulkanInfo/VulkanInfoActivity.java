package flar2.devcheck.vulkanInfo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d01;
import defpackage.d92;
import defpackage.gr;
import defpackage.hn0;
import defpackage.ig1;
import defpackage.j3;
import defpackage.l01;
import defpackage.l72;
import defpackage.n3;
import defpackage.n72;
import defpackage.nz0;
import defpackage.oo1;
import defpackage.op0;
import defpackage.p92;
import defpackage.pr;
import defpackage.py0;
import defpackage.qf;
import defpackage.qy0;
import defpackage.sl;
import defpackage.th2;
import defpackage.uz1;
import defpackage.vq;
import flar2.devcheck.R;
import flar2.devcheck.utils.MyLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class VulkanInfoActivity extends a5 implements nz0, d01 {
    public static final /* synthetic */ int J = 0;
    public RecyclerView F;
    public l01 G;
    public n3 H;
    public d92 I;

    public final void B(String str, String str2) {
        View inflate = getLayoutInflater().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(this);
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = true;
        th2Var.j(getString(R.string.okay), new qf(12, this));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(this)) {
                imageView.setImageResource(R.drawable.ic_cpu_light);
            } else {
                imageView.setImageResource(R.drawable.ic_cpu_dark);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(str);
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        if (str2 == null || str2.isEmpty()) {
            str2 = "—";
        }
        arrayList.add(new hn0(43, "", str2));
        recyclerView.setAdapter(new l01((Context) this, (List) arrayList));
        n3 n3Var = this.H;
        if (n3Var != null && n3Var.isShowing()) {
            this.H.dismiss();
        }
        n3 a2 = th2Var.a();
        this.H = a2;
        a2.show();
        this.H.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (getResources().getDisplayMetrics().widthPixels * 90) / 100;
            if (getResources().getConfiguration().orientation == 2 || getResources().getBoolean(R.bool.isTablet)) {
                i = (getResources().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.H.getWindow().setLayout(i, -2);
            Typeface b = ig1.b(this, R.font.open_sans_semibold);
            TextView textView = (TextView) this.H.findViewById(R.id.alertTitle);
            if (textView != null) {
                textView.setTypeface(b);
            }
        } catch (Exception unused3) {
        }
        try {
            TextView textView2 = (TextView) this.H.findViewById(android.R.id.message);
            if (textView2 != null) {
                textView2.setMovementMethod(new ScrollingMovementMethod());
            }
        } catch (Exception unused4) {
        }
    }

    @Override // defpackage.nz0
    public final void c() {
    }

    @Override // defpackage.d01
    public final void d(String str) {
        String str2;
        String str3;
        if (str.equals(getString(R.string.vulkan_raw_json)) || str.equals("Raw Vulkan JSON")) {
            B(getString(R.string.vulkan_raw_json), this.I.e);
            return;
        }
        boolean equals = str.equals(getString(R.string.vk_device_extensions));
        String str4 = Iyrs.fDXmptdQoRlof;
        if (equals || str.equals("Device Extensions")) {
            String string = getString(R.string.vk_device_extensions);
            d92 d92Var = this.I;
            d92Var.getClass();
            try {
                str2 = d92Var.f.replace(" ", str4);
            } catch (Exception unused) {
                str2 = d92Var.f;
            }
            B(string, str2);
            return;
        }
        if (str.equals(getString(R.string.vk_instance_extensions)) || str.equals(BIxeFreLLop.BwXra)) {
            String string2 = getString(R.string.vk_instance_extensions);
            d92 d92Var2 = this.I;
            d92Var2.getClass();
            try {
                str3 = d92Var2.g.replace(" ", str4);
            } catch (Exception unused2) {
                str3 = d92Var2.g;
            }
            B(string2, str3);
        }
    }

    @Override // defpackage.d01
    public final void j(String str) {
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
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
        collapsingToolbarLayout.setTitle(getString(R.string.vulkan_analysis));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        pr.U(getWindow(), false);
        findViewById(R.id.placeholder);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recyclerview);
        this.F = recyclerView2;
        getBaseContext();
        recyclerView2.setLayoutManager(new MyLinearLayoutManager(1));
        l01 l01Var = new l01((Context) this, (List) new ArrayList());
        this.G = l01Var;
        l01Var.m = this;
        l01Var.j = this;
        this.F.setAdapter(l01Var);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(d92.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        d92 d92Var = (d92) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.I = d92Var;
        if (d92Var.d == null) {
            d92Var.d = new qy0();
        }
        d92Var.d.e(this, new p92(this, 1));
        d92 d92Var2 = this.I;
        d92Var2.c.execute(new oo1(11, d92Var2));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        n3 n3Var = this.H;
        if (n3Var != null) {
            n3Var.dismiss();
        }
    }
}
