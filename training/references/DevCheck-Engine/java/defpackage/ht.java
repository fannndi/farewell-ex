package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class ht extends te1 {
    public final ChipGroup A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final jt[] E;
    public final float F;
    public boolean G;

    public ht(View view, p8 p8Var) {
        super(view);
        this.E = new jt[4];
        this.A = (ChipGroup) view.findViewById(R.id.bench_rank_scope_chips);
        this.B = (TextView) view.findViewById(R.id.bench_rank_overall_score);
        this.C = (TextView) view.findViewById(R.id.bench_rank_overall_comparison);
        this.D = (TextView) view.findViewById(R.id.bench_rank_overall_delta);
        this.F = view.getResources().getDisplayMetrics().density * 10.0f;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bench_rank_sections_list);
        LayoutInflater from = LayoutInflater.from(view.getContext());
        for (int i = 0; i < 4; i++) {
            View inflate = from.inflate(R.layout.item_bench_rankings_section, (ViewGroup) linearLayout, false);
            linearLayout.addView(inflate);
            this.E[i] = new jt(inflate);
        }
        this.A.setOnCheckedStateChangeListener(new tb(this, 6, p8Var));
    }
}
