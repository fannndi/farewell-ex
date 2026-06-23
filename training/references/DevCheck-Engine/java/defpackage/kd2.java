package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kd2 extends td1 {
    public final jv0 d;

    public kd2(jv0 jv0Var) {
        this.d = jv0Var;
    }

    @Override // defpackage.td1
    public final int c() {
        return this.d.f0.l;
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        jv0 jv0Var = this.d;
        int i2 = jv0Var.f0.g.i + i;
        TextView textView = ((jd2) te1Var).A;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(l52.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        fh fhVar = jv0Var.i0;
        if (l52.b().get(1) == i2) {
            Object obj = fhVar.j;
        } else {
            Object obj2 = fhVar.i;
        }
        throw null;
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        return new jd2((TextView) d51.j(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
