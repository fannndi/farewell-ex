package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class uv1 extends te1 {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final GradientDrawable G;

    public uv1(View view) {
        super(view);
        this.A = (ImageView) view.findViewById(R.id.app_icon);
        this.B = (TextView) view.findViewById(R.id.app_title);
        this.C = (TextView) view.findViewById(R.id.app_cpu);
        this.D = (TextView) view.findViewById(R.id.app_threads);
        this.E = (TextView) view.findViewById(R.id.app_mem);
        TextView textView = (TextView) view.findViewById(R.id.state_chip);
        this.F = textView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.G = gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(view.getResources().getDisplayMetrics().density * 8.0f);
        textView.setBackground(gradientDrawable);
    }

    public final void r(v91 v91Var) {
        cf cfVar;
        this.C.setText(zv1.v(v91Var.b));
        int i = v91Var.f;
        this.E.setText(i > 0 ? zv1.x(i) : "");
        this.D.setText("Thr " + Math.max(0, v91Var.c));
        int i2 = v91Var.f1075a.f1026a;
        int i3 = v91Var.g;
        int i4 = v91Var.h;
        if (i2 >= 0 && i2 < 10000) {
            cfVar = new cf(-5242848, "SYS");
        } else if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i4 >= 0) {
            if (i3 != Integer.MAX_VALUE && i3 > 0) {
                if (i3 == 100) {
                    cfVar = new cf(-13730510, "FG");
                } else if (i3 == 125) {
                    cfVar = new cf(-13070788, "FGS");
                } else if (i3 == 200) {
                    cfVar = new cf(-15108398, "VIS");
                } else if (i3 == 230 || i3 == 270) {
                    cfVar = new cf(-1683200, "PCPT");
                } else if (i3 == 300) {
                    cfVar = new cf(-689152, "SVC");
                }
            }
            cfVar = null;
        } else {
            cfVar = new cf(-5242848, "SYS");
        }
        TextView textView = this.F;
        if (cfVar == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(cfVar.b);
        this.G.setColor(cfVar.f122a);
    }
}
