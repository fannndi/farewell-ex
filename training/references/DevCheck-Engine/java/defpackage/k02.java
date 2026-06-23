package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k02 extends td1 {
    public cj e;
    public p8 f;
    public gc1 g;
    public final ArrayList d = new ArrayList();
    public double h = 0.0d;
    public double i = 0.0d;

    @Override // defpackage.td1
    public final int c() {
        return (this.g == null ? 0 : 1) + this.d.size();
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        TypedArray obtainStyledAttributes;
        n02 n02Var;
        j02 j02Var = (j02) te1Var;
        gc1 gc1Var = this.g;
        boolean z = gc1Var != null && i == 0;
        if (!z) {
            gc1Var = (gc1) this.d.get(i - (gc1Var == null ? 0 : 1));
        }
        View view = j02Var.g;
        ImageView imageView = j02Var.B;
        TextView textView = j02Var.A;
        ImageButton imageButton = j02Var.C;
        TextView textView2 = j02Var.F;
        Context context = view.getContext();
        Locale locale = Locale.getDefault();
        int i2 = gc1Var.f331a;
        double d = gc1Var.g;
        String str = gc1Var.d;
        textView.setText(String.format(locale, "%d", Integer.valueOf(i2)));
        TextView textView3 = j02Var.D;
        String str2 = gc1Var.e;
        String str3 = gc1Var.b;
        if (str2 == null || str2.isEmpty()) {
            str2 = str3;
        }
        textView3.setText(str2);
        TextView textView4 = j02Var.E;
        String str4 = gc1Var.f;
        String str5 = gc1Var.c;
        if (str4 == null || str4.isEmpty()) {
            str4 = str5;
        }
        textView4.setText(str4);
        boolean z2 = z;
        j02Var.G.setText(String.format(Locale.getDefault(), "%,.0f", Double.valueOf(d)));
        double v = v();
        j02Var.H.setProgress(v > 0.0d ? (int) Math.round(Math.max(1.0d, Math.min(100.0d, (d * 100.0d) / v))) : 100);
        cj cjVar = this.e;
        boolean z3 = (cjVar == null || cjVar.D0 == null) ? false : true;
        boolean z4 = z3 && str != null && (n02Var = cjVar.e0) != null && n02Var.l.containsKey(str);
        boolean z5 = (!z3 || str == null || str.isEmpty()) ? false : true;
        boolean z6 = z2 && !z3;
        textView.setVisibility((z5 || z6) ? 4 : 0);
        imageView.setVisibility(z5 ? 0 : 8);
        imageButton.setVisibility(z6 ? 0 : 8);
        if (z5) {
            imageView.setImageResource(z4 ? R.drawable.ic_bench_select_on : R.drawable.ic_bench_select_off);
        }
        if (z6) {
            imageButton.setImageResource(R.drawable.ic_bench_pin_off);
            imageButton.setOnClickListener(new i02(0, this));
        } else {
            imageButton.setOnClickListener(null);
        }
        if (z4) {
            obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorPrimary});
            try {
                int color = obtainStyledAttributes.getColor(0, -11760651);
                obtainStyledAttributes.recycle();
                view.setBackgroundColor((color & 16777215) | 855638016);
                textView2.setVisibility(8);
            } finally {
            }
        } else if (gc1Var.h) {
            obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorPrimary});
            try {
                int color2 = obtainStyledAttributes.getColor(0, -11760651);
                obtainStyledAttributes.recycle();
                view.setBackgroundColor((color2 & 16777215) | 520093696);
                if (j02Var.I == null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    j02Var.I = gradientDrawable;
                    gradientDrawable.setShape(0);
                    j02Var.I.setCornerRadius(Math.round(8.0f * context.getResources().getDisplayMetrics().density));
                    textView2.setBackground(j02Var.I);
                }
                j02Var.I.setColor(color2);
                textView2.setText(context.getString(R.string.benchmark_rankings_leaderboard_you).toUpperCase(Locale.getDefault()));
                textView2.setVisibility(0);
            } finally {
            }
        } else {
            view.setBackgroundColor(0);
            textView2.setVisibility(8);
        }
        if (str == null || str.isEmpty() || this.e == null) {
            view.setClickable(false);
            view.setLongClickable(false);
            view.setOnClickListener(null);
            view.setOnLongClickListener(null);
            return;
        }
        view.setClickable(true);
        view.setLongClickable(true);
        view.setOnClickListener(new uc(this, 19, gc1Var));
        view.setOnLongClickListener(new sv1(this, gc1Var, 2));
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        return new j02(d51.j(viewGroup, R.layout.item_bench_rankings_row, viewGroup, false));
    }

    public final double v() {
        double d = this.h;
        gc1 gc1Var = this.g;
        if (gc1Var != null) {
            double d2 = gc1Var.g;
            if (d2 > d) {
                d = d2;
            }
        }
        double d3 = this.i;
        return d3 > d ? d3 : d;
    }
}
