package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreRingView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class si extends ld0 {
    public static final String[] E0 = {"cpu", "memory", "disk", "gpu"};
    public static final String[] F0 = {"CPU", "MEMORY", "DISK", "GPU"};
    public vc D0;
    public jj d0;
    public TextView e0;
    public TextView f0;
    public TextView g0;
    public MaterialButton h0;
    public ScoreRingView i0;
    public LinearLayout j0;
    public MaterialCardView k0;
    public LinearLayout l0;
    public MaterialCardView m0;
    public TextView n0;
    public LinearLayout o0;
    public TextView p0;
    public ProgressBar q0;
    public RecyclerView r0;
    public bx1 s0;
    public qi1 t0;
    public Integer u0;
    public GradientDrawable v0;
    public String y0;
    public String z0;
    public boolean w0 = false;
    public boolean x0 = false;
    public int A0 = 0;
    public double B0 = -1.0d;
    public final HashMap C0 = new HashMap();

    public static int v0(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }

    public static int x0(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_running, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final void Q() {
        this.K = true;
        qi1 qi1Var = this.t0;
        if (qi1Var != null) {
            qi1Var.c();
            this.t0 = null;
        }
        ry1.f(g0().getApplication()).l();
    }

    @Override // defpackage.ld0
    public final void T(boolean z) {
        vc vcVar = this.D0;
        if (vcVar != null) {
            vcVar.f107a = !z;
            af0 af0Var = vcVar.c;
            if (af0Var != null) {
                af0Var.a();
            }
        }
    }

    @Override // defpackage.ld0
    public final void b0() {
        pi piVar;
        this.K = true;
        jj jjVar = this.d0;
        if (jjVar == null || (piVar = (pi) ((qy0) jjVar.c.c).d()) == null) {
            return;
        }
        int i = piVar.f790a;
        if ((i == 2 || i == 3) && !g0().isChangingConfigurations()) {
            this.d0.e();
        }
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        this.e0 = (TextView) view.findViewById(R.id.bench_running_phase);
        this.f0 = (TextView) view.findViewById(R.id.bench_running_section);
        this.g0 = (TextView) view.findViewById(R.id.bench_running_counter);
        this.h0 = (MaterialButton) view.findViewById(R.id.bench_running_cancel);
        this.i0 = (ScoreRingView) view.findViewById(R.id.bench_running_ring);
        this.j0 = (LinearLayout) view.findViewById(R.id.bench_running_section_tracker);
        this.k0 = (MaterialCardView) view.findViewById(R.id.bench_running_results_card);
        this.l0 = (LinearLayout) view.findViewById(R.id.bench_running_results_list);
        this.m0 = (MaterialCardView) view.findViewById(R.id.bench_running_thermal_card);
        this.n0 = (TextView) view.findViewById(R.id.bench_running_thermal_status);
        this.o0 = (LinearLayout) view.findViewById(R.id.bench_running_headroom_group);
        this.p0 = (TextView) view.findViewById(R.id.bench_running_headroom_value);
        this.q0 = (ProgressBar) view.findViewById(R.id.bench_running_headroom_bar);
        this.r0 = (RecyclerView) view.findViewById(R.id.bench_running_sensor_grid);
        Context i0 = i0();
        this.r0.setLayoutManager(new GridLayoutManager());
        final int i = 0;
        this.r0.setNestedScrollingEnabled(false);
        zd1 itemAnimator = this.r0.getItemAnimator();
        if (itemAnimator instanceof x10) {
            ((x10) itemAnimator).g = false;
        }
        bx1 bx1Var = new bx1(i0, new c(11));
        this.s0 = bx1Var;
        this.r0.setAdapter(bx1Var);
        a5 g0 = g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(jj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d0 = (jj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.h0.setOnClickListener(new tc(2, this));
        final int i2 = 1;
        this.D0 = new vc(this, !H());
        g0().k().a(D(), this.D0);
        this.i0.setCaption(A(R.string.benchmark_running_live_score_label).toUpperCase(Locale.getDefault()));
        this.i0.setArcFraction(0.0d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ry(0));
        arrayList.add(new ry(2));
        arrayList.add(new y40(i0().getApplicationContext()));
        arrayList.add(new ry(1));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            for (os1 os1Var : ((mg) obj).b()) {
                this.C0.put(os1Var.getId(), os1Var);
            }
        }
        Context i02 = i0();
        this.j0.removeAllViews();
        for (int i4 = 0; i4 < 4; i4++) {
            LinearLayout linearLayout = new LinearLayout(i02);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView = new TextView(i02);
            textView.setText(F0[i4]);
            textView.setTextSize(2, 11.0f);
            textView.setLetterSpacing(0.1f);
            textView.setTextColor(x0(i02, R.attr.textTertiary, -7829368));
            View view2 = new View(i02);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, v0(i02, 4));
            layoutParams.topMargin = v0(i02, 6);
            layoutParams.leftMargin = v0(i02, 8);
            layoutParams.rightMargin = v0(i02, 8);
            view2.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(v0(i02, 2));
            gradientDrawable.setColor(x0(i02, R.attr.colorDivider, 579373192));
            view2.setBackground(gradientDrawable);
            view2.setTag(R.id.bench_running_section_tracker, gradientDrawable);
            linearLayout.addView(textView);
            linearLayout.addView(view2);
            this.j0.addView(linearLayout);
        }
        ((qy0) this.d0.c.c).e(D(), new v31(this) { // from class: qi
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
            @Override // defpackage.v31
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r24) {
                /*
                    Method dump skipped, instructions count: 1222
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.a(java.lang.Object):void");
            }
        });
        ry1 f = ry1.f(g0().getApplication());
        f.k();
        ((qy0) f.d).e(D(), new v31(this) { // from class: qi
            public final /* synthetic */ si b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj2) {
                /*
                    Method dump skipped, instructions count: 1222
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.a(java.lang.Object):void");
            }
        });
        qi1 qi1Var = new qi1(i0(), new p8(8, this));
        this.t0 = qi1Var;
        qi1Var.b();
    }

    public final void u0() {
        pi piVar;
        int i;
        jj jjVar = this.d0;
        if (jjVar == null || (piVar = (pi) ((qy0) jjVar.c.c).d()) == null || !((i = piVar.f790a) == 2 || i == 3)) {
            this.d0.e();
            return;
        }
        th2 th2Var = new th2(i0());
        th2Var.k(R.string.benchmark_suite_cancel_confirm_title);
        th2Var.f(R.string.benchmark_suite_cancel_confirm_body);
        th2Var.i(R.string.benchmark_suite_cancel_confirm_positive, new qf(4, this));
        th2Var.g(R.string.benchmark_suite_cancel_confirm_negative, null);
        th2Var.l();
    }

    public final void w0() {
        boolean z = this.u0 != null;
        qi1 qi1Var = this.t0;
        boolean z2 = qi1Var != null && qi1Var.e;
        boolean z3 = this.o0.getVisibility() == 0;
        if (z || z2 || z3) {
            this.m0.setVisibility(0);
        }
    }

    public final void y0(double d, boolean z) {
        if (Math.abs(d - this.B0) < 0.5d) {
            return;
        }
        this.B0 = d;
        this.i0.b(d, z);
    }
}
