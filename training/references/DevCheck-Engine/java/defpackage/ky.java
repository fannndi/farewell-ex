package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.PermissionsSummaryFragment;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ky implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f556a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ View f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ky(TextView textView, TextView textView2, ProgressBar progressBar, TextView textView3, TextView textView4, TextView textView5) {
        this.b = textView;
        this.d = textView2;
        this.c = progressBar;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
    }

    public /* synthetic */ ky(PermissionsSummaryFragment permissionsSummaryFragment, TextView textView, View view, RecyclerView recyclerView, View view2, SwipeRefreshLayout swipeRefreshLayout) {
        this.d = permissionsSummaryFragment;
        this.b = textView;
        this.f = view;
        this.e = recyclerView;
        this.c = view2;
        this.g = swipeRefreshLayout;
    }

    public /* synthetic */ ky(my myVar, boolean[] zArr, View view, ProgressBar progressBar, TextView textView, fj fjVar) {
        this.d = myVar;
        this.e = zArr;
        this.f = view;
        this.c = progressBar;
        this.b = textView;
        this.g = fjVar;
    }

    public /* synthetic */ ky(zg0 zg0Var, View view, View view2, boolean[] zArr, View view3, View view4) {
        this.d = zg0Var;
        this.f = view;
        this.c = view2;
        this.e = zArr;
        this.b = view3;
        this.g = view4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.v31
    public final void a(Object obj) {
        String A;
        int v0;
        char c;
        int i;
        int i2 = this.f556a;
        Object obj2 = this.g;
        View view = this.c;
        Object obj3 = this.e;
        View view2 = this.f;
        View view3 = this.b;
        Object obj4 = this.d;
        switch (i2) {
            case 0:
                my myVar = (my) obj4;
                boolean[] zArr = (boolean[]) obj3;
                ProgressBar progressBar = (ProgressBar) view;
                TextView textView = (TextView) view3;
                fj fjVar = (fj) obj2;
                ey1 ey1Var = (ey1) obj;
                if (ey1Var != null) {
                    float f = ey1Var.f254a;
                    if (!Float.isNaN(f)) {
                        zArr[0] = true;
                        float f2 = f >= 0.0f ? f : 0.0f;
                        if (f2 >= 1.0f) {
                            A = myVar.A(R.string.thermal_headroom_critical);
                            v0 = myVar.v0(R.attr.dashboard_red, -1754827);
                        } else if (f2 >= 0.9f) {
                            A = myVar.A(R.string.thermal_headroom_very_low);
                            v0 = myVar.v0(R.attr.dashboard_orange, -1737728);
                        } else if (f2 >= 0.6f) {
                            A = myVar.A(R.string.thermal_headroom_limited);
                            v0 = myVar.v0(R.attr.dashboard_yellow, -16121);
                        } else if (f2 >= 0.3f) {
                            A = myVar.A(R.string.thermal_headroom_normal);
                            v0 = myVar.v0(R.attr.colorPrimary, -14776091);
                        } else {
                            A = myVar.A(R.string.thermal_headroom_high);
                            v0 = myVar.v0(R.attr.colorPrimary, -14776091);
                        }
                        progressBar.setProgress((int) Math.min(100.0f, f2 * 100.0f));
                        progressBar.setProgressTintList(ColorStateList.valueOf(v0));
                        textView.setText(String.format(Locale.US, "%.2f", Float.valueOf(f2)) + " · " + A);
                        view2.setVisibility(0);
                        fjVar.run();
                        break;
                    }
                }
                zArr[0] = false;
                view2.setVisibility(8);
                fjVar.run();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                TextView textView2 = (TextView) view3;
                TextView textView3 = (TextView) obj4;
                ProgressBar progressBar2 = (ProgressBar) view;
                TextView textView4 = (TextView) obj3;
                TextView textView5 = (TextView) view2;
                TextView textView6 = (TextView) obj2;
                mr1 mr1Var = (mr1) obj;
                if (mr1Var != null) {
                    textView2.setText(mr1Var.f651a);
                    textView3.setText(mr1Var.b);
                    progressBar2.setProgress(mr1Var.f);
                    progressBar2.setSecondaryProgress(mr1Var.g);
                    textView4.setText(mr1Var.c);
                    textView5.setText(mr1Var.d);
                    textView6.setText(mr1Var.e);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                zg0 zg0Var = (zg0) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                View view4 = (View) obj2;
                ah0 ah0Var = (ah0) obj;
                if (view2 != null && view2.getVisibility() != 8) {
                    view2.setVisibility(8);
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                if (ah0Var != null) {
                    float f3 = ah0Var.b;
                    float f4 = ah0Var.f28a;
                    float f5 = ah0Var.c;
                    if (zg0Var.e0 != null && zg0Var.f0 != null) {
                        if (!zArr2[0] && !Float.isNaN(f5) && f5 > 0.0f) {
                            zArr2[0] = true;
                            zg0Var.e0.g(0.0f, f5);
                        }
                        if (!Float.isNaN(f4)) {
                            view3.setVisibility(0);
                            zg0Var.e0.c(0, f4);
                        }
                        if (!Float.isNaN(f3)) {
                            view4.setVisibility(0);
                            zg0Var.f0.c(0, f3);
                            break;
                        }
                    }
                }
                break;
            default:
                PermissionsSummaryFragment permissionsSummaryFragment = (PermissionsSummaryFragment) obj4;
                TextView textView7 = (TextView) view3;
                RecyclerView recyclerView = (RecyclerView) obj3;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj2;
                List<a71> list = (List) obj;
                if (list != null) {
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    int i7 = -1;
                    for (a71 a71Var : list) {
                        String str = a71Var.b;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1154451111:
                                if (str.equals("MEDIUM_RISK")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -316678230:
                                if (str.equals("special_access")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 930203866:
                                if (str.equals("TRUSTED_APPS")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2123201356:
                                if (str.equals(XmJDY.LtSDsfVFXlz)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                a71Var.a().size();
                                permissionsSummaryFragment.g0().getString(R.string.apps);
                                if (a71Var.a().isEmpty()) {
                                    permissionsSummaryFragment.g0().getString(R.string.none);
                                    i = 1;
                                } else {
                                    i = 1;
                                    if (a71Var.a().size() == 1) {
                                        a71Var.a().size();
                                        permissionsSummaryFragment.g0().getString(R.string.app);
                                    }
                                }
                                i5 = i6;
                                continue;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                String str2 = a71Var.a().size() + " " + permissionsSummaryFragment.g0().getString(R.string.apps);
                                if (a71Var.a().isEmpty()) {
                                    str2 = permissionsSummaryFragment.g0().getString(R.string.none);
                                } else if (a71Var.a().size() == 1) {
                                    str2 = a71Var.a().size() + " " + permissionsSummaryFragment.g0().getString(R.string.app);
                                }
                                textView7.setText(str2);
                                view2.setOnClickListener(new d71(permissionsSummaryFragment, 0));
                                i4 = i6;
                                break;
                            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                i7 = i6;
                                break;
                            case 3:
                                a71Var.a().size();
                                permissionsSummaryFragment.g0().getString(R.string.apps);
                                if (a71Var.a().isEmpty()) {
                                    permissionsSummaryFragment.g0().getString(R.string.none);
                                } else if (a71Var.a().size() == 1) {
                                    a71Var.a().size();
                                    permissionsSummaryFragment.g0().getString(R.string.app);
                                }
                                i3 = i6;
                                break;
                        }
                        i = 1;
                        i6 += i;
                    }
                    ArrayList arrayList = new ArrayList(list);
                    if (i3 >= 0 && i4 >= 0 && i5 >= 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(i3));
                        arrayList2.add(Integer.valueOf(i5));
                        arrayList2.add(Integer.valueOf(i4));
                        if (i7 >= 0) {
                            arrayList2.add(Integer.valueOf(i7));
                        }
                        Collections.sort(arrayList2);
                        Collections.reverse(arrayList2);
                        int size = arrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj5 = arrayList2.get(i8);
                            i8++;
                            arrayList.remove(((Integer) obj5).intValue());
                        }
                    }
                    recyclerView.setAdapter(new x61(permissionsSummaryFragment.g0(), arrayList, permissionsSummaryFragment));
                    view.setVisibility(8);
                    swipeRefreshLayout.setRefreshing(false);
                    break;
                }
                break;
        }
    }
}
