package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class np0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f696a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final GradientDrawable l;
    public final GradientDrawable m;
    public lc1 n;

    public np0(View view, gm2 gm2Var) {
        this.f696a = view;
        TextView textView = (TextView) view.findViewById(R.id.bench_rank_top3_medal);
        this.b = textView;
        this.c = (TextView) view.findViewById(R.id.bench_rank_top3_device);
        this.d = (TextView) view.findViewById(R.id.bench_rank_top3_soc);
        TextView textView2 = (TextView) view.findViewById(R.id.bench_rank_top3_you_pill);
        this.e = textView2;
        this.f = (TextView) view.findViewById(R.id.bench_rank_top3_score);
        this.g = (TextView) view.findViewById(R.id.bench_rank_top3_cat_cpu);
        this.h = (TextView) view.findViewById(R.id.bench_rank_top3_cat_memory);
        this.i = (TextView) view.findViewById(R.id.bench_rank_top3_cat_disk);
        this.j = (TextView) view.findViewById(R.id.bench_rank_top3_cat_gpu);
        this.k = view.findViewById(R.id.bench_rank_top3_divider);
        float f = view.getResources().getDisplayMetrics().density * 12.0f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.l = gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        textView.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.m = gradientDrawable2;
        gradientDrawable2.setShape(0);
        textView2.setBackground(gradientDrawable2);
        view.setOnClickListener(new uc(this, 9, gm2Var));
    }
}
