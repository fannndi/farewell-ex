package flar2.devcheck.permissionsSummary;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.ae0;
import defpackage.af1;
import defpackage.bh;
import defpackage.c;
import defpackage.c71;
import defpackage.dd2;
import defpackage.e71;
import defpackage.ew0;
import defpackage.f71;
import defpackage.gi1;
import defpackage.gr;
import defpackage.gz;
import defpackage.i51;
import defpackage.jy;
import defpackage.ky;
import defpackage.l61;
import defpackage.l72;
import defpackage.ld0;
import defpackage.n72;
import defpackage.p61;
import defpackage.p62;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.u61;
import defpackage.u8;
import defpackage.v31;
import defpackage.v8;
import defpackage.vq;
import defpackage.y62;
import defpackage.yb;
import defpackage.yl0;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.PermissionsSummaryFragment;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class PermissionsSummaryFragment extends ld0 implements u61 {
    public HorizontalBarChart d0;
    public f71 e0;

    public static String u0(String str) {
        int indexOf = str.indexOf(" ", 10);
        if (indexOf <= 0 || indexOf >= str.length()) {
            return str;
        }
        return str.substring(0, indexOf) + "\n" + str.substring(indexOf);
    }

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        n0(true);
    }

    @Override // defpackage.ld0
    public final void N(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_permissions, menu);
        menu.findItem(R.id.action_search);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.permissions_summary_fragment, viewGroup, false);
        NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(R.id.nestedscrollview);
        u8 u8Var = new u8(nestedScrollView.getPaddingStart(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingEnd(), nestedScrollView.getPaddingBottom(), 8);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(nestedScrollView, u8Var);
        t().A((MaterialToolbar) inflate.findViewById(R.id.toolbar));
        t().r().j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) inflate.findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(A(R.string.permissions));
        g0().getWindow().setStatusBarColor(i0().getColor(android.R.color.transparent));
        pr.U(g0().getWindow(), false);
        gr grVar = new gr(l(), new rj((pj) ((MainApp) g0().getApplication()).g.g, 0), h());
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(D(), new v31(this) { // from class: b71
            public final /* synthetic */ PermissionsSummaryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                float w;
                float w2;
                int i2 = i;
                PermissionsSummaryFragment permissionsSummaryFragment = this.b;
                switch (i2) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            permissionsSummaryFragment.g0().onBackPressed();
                            break;
                        }
                        break;
                    default:
                        jc jcVar = (jc) obj;
                        DecimalFormat decimalFormat = new DecimalFormat("#");
                        e10 e10Var = new e10(1, (byte) 0);
                        e10Var.b = decimalFormat;
                        jcVar.d = e10Var;
                        int R = uz1.R(permissionsSummaryFragment.i0());
                        float[] fArr = new float[3];
                        float red = Color.red(R) / 255.0f;
                        float green = Color.green(R) / 255.0f;
                        float blue = Color.blue(R) / 255.0f;
                        float max = Math.max(red, Math.max(green, blue));
                        float min = Math.min(red, Math.min(green, blue));
                        float f = max + min;
                        float f2 = f / 2.0f;
                        fArr[2] = f2;
                        if (max == min) {
                            fArr[1] = 0.0f;
                            fArr[0] = 0.0f;
                        } else {
                            float f3 = max - min;
                            if (f2 > 0.5f) {
                                f = (2.0f - max) - min;
                            }
                            fArr[1] = f3 / f;
                            if (max == red) {
                                fArr[0] = ((green - blue) / f3) + (green < blue ? 6 : 0);
                            } else if (max == green) {
                                fArr[0] = ((blue - red) / f3) + 2.0f;
                            } else if (max == blue) {
                                fArr[0] = ((red - green) / f3) + 4.0f;
                            }
                            fArr[0] = fArr[0] / 6.0f;
                        }
                        float f4 = f2 + 0.03f;
                        fArr[2] = f4;
                        float max2 = Math.max(0.0f, Math.min(f4, 1.0f));
                        fArr[2] = max2;
                        float f5 = fArr[0];
                        float f6 = fArr[1];
                        if (f6 == 0.0f) {
                            w2 = max2;
                            w = w2;
                        } else {
                            float f7 = max2 < 0.5f ? (1.0f + f6) * max2 : (max2 + f6) - (f6 * max2);
                            float f8 = (2.0f * max2) - f7;
                            max2 = rt0.w(f8, f7, f5 + 0.33333334f);
                            w = rt0.w(f8, f7, f5);
                            w2 = rt0.w(f8, f7, f5 - 0.33333334f);
                        }
                        Color.rgb((int) (max2 * 255.0f), (int) (w * 255.0f), (int) (w2 * 255.0f));
                        jcVar.l(R);
                        ArrayList arrayList = jcVar.b;
                        arrayList.clear();
                        arrayList.add(Integer.valueOf(R));
                        HorizontalBarChart horizontalBarChart = permissionsSummaryFragment.d0;
                        ic icVar = new ic(jcVar);
                        icVar.j = 0.85f;
                        horizontalBarChart.setData(icVar);
                        dd2 xAxis = permissionsSummaryFragment.d0.getXAxis();
                        xAxis.C = 2;
                        xAxis.o = false;
                        xAxis.f53a = true;
                        xAxis.p = false;
                        gd2 axisLeft = permissionsSummaryFragment.d0.getAxisLeft();
                        axisLeft.f53a = false;
                        axisLeft.v = true;
                        axisLeft.y = 0.0f;
                        axisLeft.z = Math.abs(axisLeft.x - 0.0f);
                        axisLeft.o = false;
                        gd2 axisRight = permissionsSummaryFragment.d0.getAxisRight();
                        axisRight.f53a = false;
                        axisRight.o = false;
                        float f9 = ((ic) permissionsSummaryFragment.d0.getData()).c;
                        permissionsSummaryFragment.d0.setScaleEnabled(false);
                        permissionsSummaryFragment.d0.setTouchEnabled(false);
                        permissionsSummaryFragment.d0.getXAxis().e = R;
                        np npVar = permissionsSummaryFragment.d0.y;
                        f70 f70Var = tl2.g;
                        npVar.getClass();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(npVar, "phaseY", 0.0f, 1.0f);
                        ofFloat.setInterpolator(f70Var);
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(npVar.f695a);
                        ofFloat.start();
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        View findViewById = inflate.findViewById(R.id.progressbar);
        findViewById.setVisibility(0);
        HorizontalBarChart horizontalBarChart = (HorizontalBarChart) inflate.findViewById(R.id.chart);
        this.d0 = horizontalBarChart;
        horizontalBarChart.getAxisRight().o = false;
        this.d0.getAxisLeft().o = false;
        this.d0.getXAxis().o = false;
        this.d0.getXAxis().p = false;
        this.d0.getAxisLeft().p = false;
        this.d0.getXAxis().a(12.0f);
        HorizontalBarChart horizontalBarChart2 = this.d0;
        gi1 gi1Var = new gi1(horizontalBarChart2, horizontalBarChart2.getAnimator(), this.d0.getViewPortHandler());
        gi1Var.n = 24.0f;
        this.d0.setRenderer(gi1Var);
        this.d0.getLegend().f53a = false;
        this.d0.getDescription().f53a = false;
        int i2 = 4;
        String[] strArr = Build.VERSION.SDK_INT >= 33 ? new String[]{null, u0(A(R.string.health_connect)), u0(A(R.string.other)), u0(A(R.string.permissions_hardware)), u0(A(R.string.calendar)), u0(A(R.string.accessibility)), u0(A(R.string.notifications)), u0(A(R.string.permissions_files_media)), u0(A(R.string.location)), u0(A(R.string.permissions_phone_contacts))} : new String[]{null, u0(A(R.string.health_connect)), u0(A(R.string.other)), u0(A(R.string.permissions_hardware)), u0(A(R.string.calendar)), u0(A(R.string.accessibility)), u0(A(R.string.permissions_files_media)), u0(A(R.string.location)), u0(A(R.string.permissions_phone_contacts))};
        dd2 xAxis = this.d0.getXAxis();
        yl0 yl0Var = new yl0();
        yl0Var.f1236a = strArr;
        yl0Var.b = strArr.length;
        xAxis.f = yl0Var;
        HorizontalBarChart horizontalBarChart3 = this.d0;
        horizontalBarChart3.setXAxisRenderer(new gz(horizontalBarChart3.getViewPortHandler(), this.d0.getXAxis(), this.d0.f0));
        View findViewById2 = inflate.findViewById(R.id.special_access);
        TextView textView = (TextView) inflate.findViewById(R.id.special_access_count);
        View findViewById3 = inflate.findViewById(R.id.all_permissions);
        TextView textView2 = (TextView) inflate.findViewById(R.id.all_perms_count);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar2 = new gr(l, g, h);
        vq a3 = af1.a(f71.class);
        String b2 = a3.b();
        if (b2 == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.e0 = (f71) grVar2.t(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) inflate.findViewById(R.id.toggleButton);
        if (i51.b("ppss").booleanValue()) {
            materialButtonToggleGroup.l(R.id.all, true);
        } else {
            materialButtonToggleGroup.l(R.id.user, true);
        }
        materialButtonToggleGroup.s.add(new jy(2, this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new c71(0, this));
        f71 f71Var = this.e0;
        l61 l61Var = f71Var.d;
        if (f71Var.c == null) {
            ew0 ew0Var = new ew0(0);
            f71Var.c = ew0Var;
            ew0Var.l(l61Var, new e71(f71Var, 1));
        }
        f71Var.c.i((List) l61Var.d());
        f71Var.c.e(D(), new ky(this, textView, findViewById2, recyclerView, findViewById, swipeRefreshLayout));
        f71 f71Var2 = this.e0;
        if (f71Var2.g == null) {
            ew0 ew0Var2 = new ew0(0);
            f71Var2.g = ew0Var2;
            ew0Var2.l(f71Var2.f, new e71(f71Var2, 0));
        }
        f71Var2.g.e(D(), new bh(i2, this, findViewById3, textView2));
        final int i3 = 1;
        this.e0.d.r.e(D(), new v31(this) { // from class: b71
            public final /* synthetic */ PermissionsSummaryFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                float w;
                float w2;
                int i22 = i3;
                PermissionsSummaryFragment permissionsSummaryFragment = this.b;
                switch (i22) {
                    case 0:
                        if (!((Boolean) obj).booleanValue()) {
                            permissionsSummaryFragment.g0().onBackPressed();
                            break;
                        }
                        break;
                    default:
                        jc jcVar = (jc) obj;
                        DecimalFormat decimalFormat = new DecimalFormat("#");
                        e10 e10Var = new e10(1, (byte) 0);
                        e10Var.b = decimalFormat;
                        jcVar.d = e10Var;
                        int R = uz1.R(permissionsSummaryFragment.i0());
                        float[] fArr = new float[3];
                        float red = Color.red(R) / 255.0f;
                        float green = Color.green(R) / 255.0f;
                        float blue = Color.blue(R) / 255.0f;
                        float max = Math.max(red, Math.max(green, blue));
                        float min = Math.min(red, Math.min(green, blue));
                        float f = max + min;
                        float f2 = f / 2.0f;
                        fArr[2] = f2;
                        if (max == min) {
                            fArr[1] = 0.0f;
                            fArr[0] = 0.0f;
                        } else {
                            float f3 = max - min;
                            if (f2 > 0.5f) {
                                f = (2.0f - max) - min;
                            }
                            fArr[1] = f3 / f;
                            if (max == red) {
                                fArr[0] = ((green - blue) / f3) + (green < blue ? 6 : 0);
                            } else if (max == green) {
                                fArr[0] = ((blue - red) / f3) + 2.0f;
                            } else if (max == blue) {
                                fArr[0] = ((red - green) / f3) + 4.0f;
                            }
                            fArr[0] = fArr[0] / 6.0f;
                        }
                        float f4 = f2 + 0.03f;
                        fArr[2] = f4;
                        float max2 = Math.max(0.0f, Math.min(f4, 1.0f));
                        fArr[2] = max2;
                        float f5 = fArr[0];
                        float f6 = fArr[1];
                        if (f6 == 0.0f) {
                            w2 = max2;
                            w = w2;
                        } else {
                            float f7 = max2 < 0.5f ? (1.0f + f6) * max2 : (max2 + f6) - (f6 * max2);
                            float f8 = (2.0f * max2) - f7;
                            max2 = rt0.w(f8, f7, f5 + 0.33333334f);
                            w = rt0.w(f8, f7, f5);
                            w2 = rt0.w(f8, f7, f5 - 0.33333334f);
                        }
                        Color.rgb((int) (max2 * 255.0f), (int) (w * 255.0f), (int) (w2 * 255.0f));
                        jcVar.l(R);
                        ArrayList arrayList = jcVar.b;
                        arrayList.clear();
                        arrayList.add(Integer.valueOf(R));
                        HorizontalBarChart horizontalBarChart4 = permissionsSummaryFragment.d0;
                        ic icVar = new ic(jcVar);
                        icVar.j = 0.85f;
                        horizontalBarChart4.setData(icVar);
                        dd2 xAxis2 = permissionsSummaryFragment.d0.getXAxis();
                        xAxis2.C = 2;
                        xAxis2.o = false;
                        xAxis2.f53a = true;
                        xAxis2.p = false;
                        gd2 axisLeft = permissionsSummaryFragment.d0.getAxisLeft();
                        axisLeft.f53a = false;
                        axisLeft.v = true;
                        axisLeft.y = 0.0f;
                        axisLeft.z = Math.abs(axisLeft.x - 0.0f);
                        axisLeft.o = false;
                        gd2 axisRight = permissionsSummaryFragment.d0.getAxisRight();
                        axisRight.f53a = false;
                        axisRight.o = false;
                        float f9 = ((ic) permissionsSummaryFragment.d0.getData()).c;
                        permissionsSummaryFragment.d0.setScaleEnabled(false);
                        permissionsSummaryFragment.d0.setTouchEnabled(false);
                        permissionsSummaryFragment.d0.getXAxis().e = R;
                        np npVar = permissionsSummaryFragment.d0.y;
                        f70 f70Var = tl2.g;
                        npVar.getClass();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(npVar, "phaseY", 0.0f, 1.0f);
                        ofFloat.setInterpolator(f70Var);
                        ofFloat.setDuration(250L);
                        ofFloat.addUpdateListener(npVar.f695a);
                        ofFloat.start();
                        break;
                }
            }
        });
        return inflate;
    }

    @Override // defpackage.ld0
    public final boolean U(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_search) {
            return false;
        }
        ae0 s = t().s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ybVar.k(p61.class, null);
        ybVar.c(A(R.string.search_permissions));
        ybVar.e(false);
        return true;
    }

    @Override // defpackage.u61
    public final void p(String str, HashMap hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putSerializable("appPermissionMap", hashMap);
        ae0 s = t().s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ybVar.k(v8.class, bundle);
        ybVar.c(str);
        ybVar.e(false);
    }
}
