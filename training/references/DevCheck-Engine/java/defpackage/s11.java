package defpackage;

import android.view.View;
import android.widget.CheckBox;
import flar2.devcheck.R;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class s11 extends ld {
    public CheckBox A0;
    public e21 t0;
    public CheckBox u0;
    public CheckBox v0;
    public CheckBox w0;
    public CheckBox x0;
    public CheckBox y0;
    public CheckBox z0;

    @Override // defpackage.ld
    public final int B0() {
        return R.layout.bottom_sheet_network_filter;
    }

    @Override // defpackage.ld
    public final void C0(View view) {
        a5 t = t();
        if (t == null) {
            A0();
            return;
        }
        n72 l = t.l();
        l72 g = t.g();
        gr grVar = new gr(l, g, d51.i(t, l, g));
        vq a2 = af1.a(e21.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.t0 = (e21) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.u0 = (CheckBox) view.findViewById(R.id.checkbox_filter_router);
        this.v0 = (CheckBox) view.findViewById(R.id.checkbox_filter_computer);
        this.w0 = (CheckBox) view.findViewById(R.id.checkbox_filter_mobile);
        this.x0 = (CheckBox) view.findViewById(R.id.checkbox_filter_tv);
        this.y0 = (CheckBox) view.findViewById(R.id.checkbox_filter_nas);
        this.z0 = (CheckBox) view.findViewById(R.id.checkbox_filter_printer);
        this.A0 = (CheckBox) view.findViewById(R.id.checkbox_filter_unknown);
        EnumSet copyOf = EnumSet.copyOf(this.t0.g);
        this.u0.setChecked(copyOf.contains(bp0.h));
        this.v0.setChecked(copyOf.contains(bp0.l));
        this.w0.setChecked(copyOf.contains(bp0.m));
        this.x0.setChecked(copyOf.contains(bp0.k));
        this.y0.setChecked(copyOf.contains(bp0.i));
        this.z0.setChecked(copyOf.contains(bp0.j));
        this.A0.setChecked(copyOf.contains(bp0.g));
        tc tcVar = new tc(19, this);
        this.u0.setOnClickListener(tcVar);
        this.v0.setOnClickListener(tcVar);
        this.w0.setOnClickListener(tcVar);
        this.x0.setOnClickListener(tcVar);
        this.y0.setOnClickListener(tcVar);
        this.z0.setOnClickListener(tcVar);
        this.A0.setOnClickListener(tcVar);
    }
}
