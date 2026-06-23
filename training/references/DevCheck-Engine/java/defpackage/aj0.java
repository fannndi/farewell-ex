package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class aj0 extends te1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final LinearLayout D;
    public final GradientDrawable E;

    public aj0(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.bench_rank_device);
        this.B = (TextView) view.findViewById(R.id.bench_rank_soc);
        TextView textView = (TextView) view.findViewById(R.id.bench_rank_percentile_pill);
        this.C = textView;
        this.D = (LinearLayout) view.findViewById(R.id.bench_rank_empty_group);
        float f = view.getResources().getDisplayMetrics().density * 14.0f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        textView.setBackground(gradientDrawable);
    }
}
