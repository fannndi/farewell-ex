package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class dw1 extends te1 {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public dw1(View view) {
        super(view);
        this.A = (ImageView) view.findViewById(R.id.app_icon);
        this.B = (TextView) view.findViewById(R.id.app_title);
        this.C = (TextView) view.findViewById(R.id.app_cpu);
        this.D = (TextView) view.findViewById(R.id.app_threads);
        this.E = (TextView) view.findViewById(R.id.app_mem);
    }

    public final void r(r91 r91Var) {
        this.C.setText(zv1.w(r91Var.b));
        int i = r91Var.f;
        if (i <= 0) {
            i = r91Var.e;
        }
        this.E.setText(zv1.y(i));
        this.D.setText("Thr " + Math.max(0, r91Var.c));
    }
}
