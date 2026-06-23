package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class j02 extends te1 {
    public final TextView A;
    public final ImageView B;
    public final ImageButton C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ProgressBar H;
    public GradientDrawable I;

    public j02(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.bench_rank_row_rank);
        this.B = (ImageView) view.findViewById(R.id.bench_rank_row_check);
        this.C = (ImageButton) view.findViewById(R.id.bench_rank_row_pin);
        this.D = (TextView) view.findViewById(R.id.bench_rank_row_device);
        this.E = (TextView) view.findViewById(R.id.bench_rank_row_soc);
        this.F = (TextView) view.findViewById(R.id.bench_rank_row_you_pill);
        this.G = (TextView) view.findViewById(R.id.bench_rank_row_score);
        this.H = (ProgressBar) view.findViewById(R.id.bench_rank_row_bar);
    }
}
