package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class vw1 extends te1 {
    public final TextView A;
    public final TextView B;
    public final RecyclerView C;
    public final LineChart D;
    public final bx1 E;
    public final /* synthetic */ xw1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw1(xw1 xw1Var, View view) {
        super(view);
        this.F = xw1Var;
        this.A = (TextView) view.findViewById(R.id.key_card_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.key_card_tiles_recycler);
        this.C = recyclerView;
        LineChart lineChart = (LineChart) view.findViewById(R.id.key_card_chart);
        this.D = lineChart;
        this.B = (TextView) view.findViewById(R.id.key_card_graph_title);
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager());
        bx1 bx1Var = new bx1(view.getContext(), xw1Var.d);
        this.E = bx1Var;
        recyclerView.setAdapter(bx1Var);
        zd1 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof x10) {
            ((x10) itemAnimator).g = false;
        }
        lineChart.setNoDataText("");
        lineChart.setDrawGridBackground(false);
        lineChart.getDescription().f53a = false;
        lineChart.getLegend().f53a = false;
        lineChart.setTouchEnabled(false);
        lineChart.setPinchZoom(false);
    }
}
