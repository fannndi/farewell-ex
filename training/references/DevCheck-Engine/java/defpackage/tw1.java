package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class tw1 extends te1 {
    public final TextView A;
    public final RecyclerView B;
    public final bx1 C;

    public tw1(xw1 xw1Var, View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.all_sensors_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.all_sensors_recycler);
        this.B = recyclerView;
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager());
        bx1 bx1Var = new bx1(view.getContext(), xw1Var.d);
        this.C = bx1Var;
        recyclerView.setAdapter(bx1Var);
        zd1 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof x10) {
            ((x10) itemAnimator).g = false;
        }
    }
}
