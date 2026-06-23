package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bj0 extends kr0 {
    public static final ft f = new ft(1);
    public static final ft g = new ft(4);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj0(kk1 kk1Var, int i) {
        super(kk1Var);
        this.e = i;
    }

    public static String w(oy1 oy1Var) {
        StringBuilder sb = new StringBuilder("role:       ");
        ly1 ly1Var = oy1Var.d;
        sb.append(ly1Var != null ? ly1Var.name() : "null");
        sb.append("\ndie/skin:   ");
        int i = oy1Var.e;
        sb.append(i != 0 ? iy1.h(i) : "null");
        sb.append("\ntemp:       ");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%.1f °C", Float.valueOf(oy1Var.f)));
        sb.append("\nwarning:    ");
        sb.append(String.format(locale, "%.1f °C", Float.valueOf(oy1Var.g)));
        sb.append("\ncritical:   ");
        sb.append(String.format(locale, "%.1f °C", Float.valueOf(oy1Var.h)));
        sb.append("\nminDisplay: ");
        sb.append(String.format(locale, "%.1f °C", Float.valueOf(oy1Var.i)));
        sb.append("\nmaxDisplay: ");
        sb.append(String.format(locale, "%.1f °C", Float.valueOf(oy1Var.j)));
        sb.append("\nloadRatio:  ");
        sb.append(String.format(locale, "%.2f", Float.valueOf(oy1Var.k)));
        sb.append("\ncolorLevel: ");
        sb.append(oy1Var.l);
        return sb.toString();
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        int i2 = this.e;
        y9 y9Var = this.d;
        switch (i2) {
            case 0:
                aj0 aj0Var = (aj0) te1Var;
                kc1 kc1Var = (kc1) y9Var.f.get(i);
                TextView textView = aj0Var.C;
                aj0Var.A.setText(kc1Var.f527a);
                aj0Var.B.setText(kc1Var.b);
                aj0Var.D.setVisibility(kc1Var.c ? 8 : 0);
                mc1 mc1Var = kc1Var.d;
                if (mc1Var != null) {
                    aj0Var.E.setColor(mc1Var.b);
                    textView.setText(mc1Var.f624a);
                    textView.setVisibility(0);
                    break;
                } else {
                    textView.setVisibility(8);
                    break;
                }
            default:
                rw1 rw1Var = (rw1) te1Var;
                oy1 oy1Var = (oy1) y9Var.f.get(i);
                String str = oy1Var.f768a;
                boolean z = str == null || str.length() == 0;
                String str2 = oy1Var.f768a;
                if (z) {
                    if (str2 == null || str2.length() == 0) {
                        String str3 = oy1Var.b;
                        str2 = (str3 == null || str3.length() == 0) ? "Unknown" : oy1Var.b;
                    } else {
                        str2 = oy1Var.f768a;
                    }
                }
                rw1Var.A.setText(str2);
                StringBuilder sb = new StringBuilder();
                String str4 = oy1Var.b;
                if (str4 != null && str4.length() != 0) {
                    sb.append(oy1Var.b);
                }
                sb.append("  (type=");
                sb.append(oy1Var.c);
                sb.append(")");
                rw1Var.B.setText(sb.toString().trim());
                rw1Var.C.setText(w(oy1Var));
                break;
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        switch (this.e) {
            case 0:
                return new aj0(d51.j(viewGroup, R.layout.item_bench_rankings_hero, viewGroup, false));
            default:
                return new rw1(d51.j(viewGroup, R.layout.temperature_sensor_item, viewGroup, false));
        }
    }
}
