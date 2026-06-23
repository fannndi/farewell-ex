package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreBarView;

/* loaded from: classes.dex */
public final class jt {

    /* renamed from: a, reason: collision with root package name */
    public final View f495a;
    public final TextView b;
    public final TextView c;
    public final ScoreBarView d;
    public final TextView e;
    public double f = Double.NaN;
    public final GradientDrawable g;

    public jt(View view) {
        this.f495a = view;
        this.b = (TextView) view.findViewById(R.id.bench_rank_section_name);
        TextView textView = (TextView) view.findViewById(R.id.bench_rank_section_delta_pill);
        this.c = textView;
        this.d = (ScoreBarView) view.findViewById(R.id.bench_rank_section_bar);
        this.e = (TextView) view.findViewById(R.id.bench_rank_section_detail);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.g = gradientDrawable;
        gradientDrawable.setShape(0);
        textView.setBackground(gradientDrawable);
    }
}
