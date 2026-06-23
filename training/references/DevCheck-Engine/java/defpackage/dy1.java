package defpackage;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.Sd.tEegR;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class dy1 extends ld0 {
    public ex1 d0;
    public ImageView e0;
    public TextView f0;
    public TextView g0;
    public TextView h0;
    public LinearLayout i0;
    public ProgressBar j0;
    public TextView k0;
    public LinearLayout l0;
    public final LinkedHashMap m0 = new LinkedHashMap();
    public int n0;
    public int o0;
    public int p0;
    public int q0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_system_graphs_thermals, viewGroup, false);
        inflate.findViewById(R.id.thermal_status_card);
        this.e0 = (ImageView) inflate.findViewById(R.id.thermal_status_icon);
        this.f0 = (TextView) inflate.findViewById(R.id.thermal_status_title);
        this.g0 = (TextView) inflate.findViewById(R.id.thermal_status_message);
        this.h0 = (TextView) inflate.findViewById(R.id.thermal_android_status);
        this.i0 = (LinearLayout) inflate.findViewById(R.id.thermal_headroom_row);
        this.j0 = (ProgressBar) inflate.findViewById(R.id.thermal_headroom_bar);
        this.k0 = (TextView) inflate.findViewById(R.id.thermal_headroom_value);
        this.l0 = (LinearLayout) inflate.findViewById(R.id.thermals_charts);
        this.n0 = u0(R.attr.colorPrimary, -14776091);
        this.o0 = u0(R.attr.dashboard_yellow, -16121);
        this.p0 = u0(R.attr.dashboard_orange, -26624);
        this.q0 = u0(R.attr.dashboard_red, -769226);
        a5 g0 = g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(ex1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        String str = tEegR.HoHYwGQGZzUiu;
        this.d0 = (ex1) grVar.t(a2, str.concat(b));
        a5 g02 = g0();
        n72 l2 = g02.l();
        l72 g2 = g02.g();
        gr grVar2 = new gr(l2, g2, d51.i(g02, l2, g2));
        vq a3 = af1.a(lu1.class);
        String b2 = a3.b();
        if (b2 == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        grVar2.t(a3, str.concat(b2));
        this.d0.d.e(D(), new nc(27, this));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        this.d0.f();
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        ex1 ex1Var = this.d0;
        if (ex1Var.n) {
            return;
        }
        ex1Var.n = true;
        ex1Var.p.k();
        ex1Var.f.post(ex1Var.t);
    }

    public final int u0(int i, int i2) {
        TypedValue typedValue = new TypedValue();
        return i0().getTheme().resolveAttribute(i, typedValue, true) ? typedValue.data : i2;
    }
}
