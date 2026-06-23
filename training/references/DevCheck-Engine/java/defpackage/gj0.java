package defpackage;

import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class gj0 extends te1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public gj0(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.bench_row_date);
        this.B = (TextView) view.findViewById(R.id.bench_row_score);
        this.C = (TextView) view.findViewById(R.id.bench_row_throttled);
        this.D = (TextView) view.findViewById(R.id.bench_row_cat_cpu);
        this.E = (TextView) view.findViewById(R.id.bench_row_cat_memory);
        this.F = (TextView) view.findViewById(R.id.bench_row_cat_disk);
        this.G = (TextView) view.findViewById(R.id.bench_row_cat_gpu);
    }
}
