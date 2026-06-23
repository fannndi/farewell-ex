package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n21 extends ld {
    public e21 t0;
    public RadioGroup u0;
    public RadioButton v0;
    public RadioButton w0;
    public RadioButton x0;
    public RadioButton y0;
    public boolean z0 = false;

    @Override // defpackage.ld
    public final int B0() {
        return R.layout.bottom_sheet_network_sort;
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
        this.u0 = (RadioGroup) view.findViewById(R.id.radio_group_sort);
        this.v0 = (RadioButton) view.findViewById(R.id.radio_sort_ip);
        this.w0 = (RadioButton) view.findViewById(R.id.radio_sort_name);
        this.x0 = (RadioButton) view.findViewById(R.id.radio_sort_type);
        this.y0 = (RadioButton) view.findViewById(R.id.radio_sort_latency);
        int i = this.t0.e;
        this.z0 = true;
        int A = d51.A(i);
        if (A == 0) {
            this.v0.setChecked(true);
        } else if (A == 1) {
            this.w0.setChecked(true);
        } else if (A == 2) {
            this.x0.setChecked(true);
        } else if (A == 3) {
            this.y0.setChecked(true);
        }
        this.z0 = false;
        this.u0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: m21
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                n21 n21Var = n21.this;
                if (n21Var.z0) {
                    return;
                }
                int i3 = i2 == R.id.radio_sort_ip ? 1 : i2 == R.id.radio_sort_name ? 2 : i2 == R.id.radio_sort_type ? 3 : i2 == R.id.radio_sort_latency ? 4 : 0;
                if (i3 != 0 && i3 != n21Var.t0.e) {
                    e21 e21Var = n21Var.t0;
                    e21Var.e = i3;
                    ArrayList arrayList = e21Var.f;
                    if (arrayList != null) {
                        e21Var.r(arrayList);
                    }
                    Context v = n21Var.v();
                    if (v != null) {
                        v.getSharedPreferences("network_mapper_prefs", 0).edit().putInt("sort_mode", d51.A(i3)).apply();
                    }
                }
                n21Var.A0();
            }
        });
    }
}
