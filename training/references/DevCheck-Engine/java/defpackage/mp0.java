package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class mp0 extends te1 {
    public final LinearLayout A;
    public final TextView B;
    public final np0[] C;
    public final float D;

    public mp0(View view, gm2 gm2Var) {
        super(view);
        this.C = new np0[3];
        this.A = (LinearLayout) view.findViewById(R.id.bench_rank_leaderboard_list);
        TextView textView = (TextView) view.findViewById(R.id.bench_rank_leaderboard_view_more);
        this.B = textView;
        textView.setOnClickListener(new tc(13, gm2Var));
        this.D = view.getResources().getDisplayMetrics().density * 8.0f;
        LayoutInflater from = LayoutInflater.from(view.getContext());
        for (int i = 0; i < 3; i++) {
            View inflate = from.inflate(R.layout.item_bench_rankings_top3_row, (ViewGroup) this.A, false);
            this.A.addView(inflate);
            this.C[i] = new np0(inflate, gm2Var);
        }
    }
}
