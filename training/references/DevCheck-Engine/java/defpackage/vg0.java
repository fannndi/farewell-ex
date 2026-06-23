package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.gputimes.GpuTimeActivity;
import flar2.devcheck.tools.GpsActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class vg0 extends td1 {
    public final /* synthetic */ int d = 0;
    public final List e;

    public vg0(GpsActivity gpsActivity, ArrayList arrayList) {
        this.e = arrayList;
    }

    public vg0(ArrayList arrayList) {
        this.e = arrayList;
    }

    @Override // defpackage.td1
    public final int c() {
        int i = this.d;
        List list = this.e;
        switch (i) {
            case 0:
                if (list == null) {
                    return 0;
                }
                return list.size();
            default:
                if (list.isEmpty()) {
                    return 0;
                }
                return list.size() + 1;
        }
    }

    @Override // defpackage.td1
    public final int e(int i) {
        switch (this.d) {
            case 0:
                try {
                    return ((nj1) this.e.get(i)).g;
                } catch (Exception unused) {
                    return 1;
                }
            default:
                return i == 0 ? 0 : 1;
        }
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        int i2 = this.d;
        List list = this.e;
        switch (i2) {
            case 0:
                ug0 ug0Var = (ug0) te1Var;
                int i3 = ug0Var.l;
                ProgressBar progressBar = ug0Var.F;
                TextView textView = ug0Var.D;
                TextView textView2 = ug0Var.C;
                TextView textView3 = ug0Var.B;
                if (i3 != 0 && i3 != 2) {
                    ug0Var.A.setText(((nj1) list.get(ug0Var.b())).f687a);
                    textView3.setText(((nj1) list.get(ug0Var.b())).c);
                    textView2.setText(((nj1) list.get(ug0Var.b())).d);
                    textView.setText(((nj1) list.get(ug0Var.b())).b);
                    if (((nj1) list.get(ug0Var.b())).f == 99) {
                        progressBar.setVisibility(4);
                        textView.setTypeface(textView.getTypeface(), 1);
                        textView2.setTypeface(textView2.getTypeface(), 1);
                        textView3.setTypeface(textView3.getTypeface(), 1);
                    } else {
                        progressBar.setVisibility(0);
                        progressBar.setProgress(((nj1) list.get(ug0Var.b())).f);
                        textView.setTypeface(textView.getTypeface(), 0);
                        textView2.setTypeface(textView2.getTypeface(), 0);
                        textView3.setTypeface(textView3.getTypeface(), 0);
                    }
                    ug0Var.E.setImageDrawable(((nj1) list.get(ug0Var.b())).e);
                    break;
                }
                break;
            default:
                if (i != 0) {
                    dh0 dh0Var = (dh0) te1Var;
                    TextView textView4 = dh0Var.C;
                    ProgressBar progressBar2 = dh0Var.D;
                    TextView textView5 = dh0Var.B;
                    eh0 eh0Var = (eh0) list.get(i - 1);
                    boolean z = eh0Var.c;
                    long j = eh0Var.b;
                    TextView textView6 = dh0Var.A;
                    if (!z) {
                        Locale locale = Locale.US;
                        textView6.setText((eh0Var.f232a / 1000000) + " MHz");
                        textView5.setText(GpuTimeActivity.B(j));
                        progressBar2.setProgress(Math.round(eh0Var.d));
                        textView4.setText(String.format(locale, "%.1f%%", Float.valueOf(eh0Var.d)));
                        break;
                    } else {
                        textView6.setText(R.string.total);
                        textView5.setText(GpuTimeActivity.B(j));
                        progressBar2.setProgress(100);
                        textView4.setText("100.0%");
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                Context context = viewGroup.getContext();
                return i != 0 ? i != 2 ? new ug0(LayoutInflater.from(context).inflate(R.layout.tools_satellite_item, viewGroup, false)) : new tg0(LayoutInflater.from(context).inflate(R.layout.tests_list_bottom, viewGroup, false)) : new tg0(LayoutInflater.from(context).inflate(R.layout.tools_satellite_header, viewGroup, false));
            default:
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                return i == 0 ? new ch0(from.inflate(R.layout.list_item_gputime_header, viewGroup, false)) : new dh0(from.inflate(R.layout.list_item_gputime, viewGroup, false));
        }
    }
}
