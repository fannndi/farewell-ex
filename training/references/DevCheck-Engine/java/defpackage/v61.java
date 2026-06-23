package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v61 extends w61 {
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final ImageView I;
    public final /* synthetic */ x61 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v61(x61 x61Var, View view) {
        super(x61Var, view);
        this.J = x61Var;
        this.E = (TextView) view.findViewById(R.id.title);
        this.F = (TextView) view.findViewById(R.id.desc);
        this.G = (TextView) view.findViewById(R.id.description);
        this.I = (ImageView) view.findViewById(R.id.icon);
        this.H = (TextView) view.findViewById(R.id.granted);
        view.setOnClickListener(this);
    }

    @Override // defpackage.w61, android.view.View.OnClickListener
    public final void onClick(View view) {
        x61 x61Var = this.J;
        ArrayList arrayList = x61Var.d;
        u61 u61Var = x61Var.f;
        if (u61Var != null) {
            u61Var.p(((a71) arrayList.get(b())).b, ((a71) arrayList.get(b())).a());
        }
    }
}
