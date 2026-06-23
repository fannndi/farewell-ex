package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class vg implements wg, b41 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ vg(BenchmarkSuiteActivity benchmarkSuiteActivity, View view, int i, View view2) {
        this.h = benchmarkSuiteActivity;
        this.i = view;
        this.g = i;
        this.j = view2;
    }

    public /* synthetic */ vg(String str, String str2, String str3, int i) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.g = i;
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        String str = (String) this.h;
        String str2 = (String) this.i;
        String str3 = (String) this.j;
        miVar.h = str;
        miVar.i = str2;
        miVar.j = str3;
        miVar.k = -1;
        miVar.l = this.g;
    }

    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) this.h;
        View view2 = (View) this.i;
        View view3 = (View) this.j;
        int i = BenchmarkSuiteActivity.M;
        mm0 h = gb2Var.f329a.h(647);
        view.setPadding(h.f643a, 0, h.c, 0);
        if (view2 != null) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.g + h.d);
        }
        AppBarLayout appBarLayout = benchmarkSuiteActivity.G;
        if (appBarLayout != null) {
            y62.c(appBarLayout, gb2Var);
        }
        if (view3 != null) {
            y62.c(view3, gb2Var);
        }
        return gb2.b;
    }
}
