package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreBarView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kt extends kr0 {
    public static final ft g = new ft(0);
    public static final ft h = new ft(2);
    public static final ft i = new ft(3);
    public final /* synthetic */ int e = 2;
    public final Object f;

    public kt(gm2 gm2Var) {
        super(i);
        this.f = gm2Var;
    }

    public kt(p8 p8Var) {
        super(g);
        this.f = p8Var;
    }

    public kt(p8 p8Var, byte b) {
        super(h);
        this.f = p8Var;
    }

    public static void w(TextView textView, JSONObject jSONObject, String str) {
        double optDouble = jSONObject == null ? 0.0d : jSONObject.optDouble(str, 0.0d);
        if (optDouble <= 0.0d || Double.isNaN(optDouble)) {
            textView.setText("—");
        } else {
            textView.setText(NumberFormat.getIntegerInstance(Locale.getDefault()).format(Math.round(optDouble)));
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    @Override // defpackage.td1
    public final void l(te1 te1Var, int i2) {
        char c;
        int i3;
        ?? r4;
        int i4 = this.e;
        y9 y9Var = this.d;
        switch (i4) {
            case 0:
                ht htVar = (ht) te1Var;
                gt gtVar = (gt) y9Var.f.get(i2);
                jt[] jtVarArr = htVar.E;
                jc1 jc1Var = gtVar.f352a;
                ChipGroup chipGroup = htVar.A;
                htVar.G = true;
                try {
                    chipGroup.removeAllViews();
                    LayoutInflater from = LayoutInflater.from(chipGroup.getContext());
                    ArrayList arrayList = jc1Var.f474a;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        oc1 oc1Var = (oc1) obj;
                        Chip chip = (Chip) from.inflate(R.layout.item_bench_rankings_scope_chip, (ViewGroup) chipGroup, false);
                        chip.setTag(oc1Var.f727a);
                        chip.setText(oc1Var.b);
                        chip.setChecked(oc1Var.f727a.equals(jc1Var.b));
                        chipGroup.addView(chip);
                    }
                    htVar.G = false;
                    htVar.B.setText(jc1Var.c);
                    TextView textView = htVar.C;
                    String str = jc1Var.d;
                    if (str == null) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(str);
                        textView.setVisibility(0);
                    }
                    TextView textView2 = htVar.D;
                    String str2 = jc1Var.e;
                    if (str2 == null) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(str2);
                        textView2.setVisibility(0);
                    }
                    List list = gtVar.b;
                    for (int i6 = 0; i6 < 4; i6++) {
                        if (i6 < list.size()) {
                            jt jtVar = jtVarArr[i6];
                            qc1 qc1Var = (qc1) list.get(i6);
                            float f = htVar.F;
                            GradientDrawable gradientDrawable = jtVar.g;
                            TextView textView3 = jtVar.c;
                            TextView textView4 = jtVar.b;
                            textView4.setText(qc1Var.b);
                            textView4.setTextColor(qc1Var.c);
                            pc1 pc1Var = qc1Var.d;
                            ScoreBarView scoreBarView = jtVar.d;
                            int i7 = pc1Var.f783a;
                            double d = pc1Var.d;
                            scoreBarView.setAccentColor(i7);
                            scoreBarView.setBidirectional(pc1Var.b);
                            scoreBarView.setShowTick(pc1Var.c);
                            scoreBarView.b(d, pc1Var.e && Double.compare(jtVar.f, d) != 0);
                            jtVar.f = d;
                            mc1 mc1Var = qc1Var.e;
                            if (mc1Var == null) {
                                textView3.setVisibility(8);
                                i3 = 0;
                            } else {
                                gradientDrawable.setCornerRadius(f);
                                gradientDrawable.setColor(mc1Var.b);
                                textView3.setText(mc1Var.f624a);
                                i3 = 0;
                                textView3.setVisibility(0);
                            }
                            jtVar.e.setText(qc1Var.f);
                            jtVarArr[i6].f495a.setVisibility(i3);
                            c = '\b';
                        } else {
                            c = '\b';
                            jtVarArr[i6].f495a.setVisibility(8);
                        }
                    }
                    return;
                } catch (Throwable th) {
                    htVar.G = false;
                    throw th;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                JSONObject jSONObject = null;
                gj0 gj0Var = (gj0) te1Var;
                li liVar = ((oi1) y9Var.f.get(i2)).f738a;
                View view = gj0Var.g;
                gj0Var.A.setText(DateUtils.formatDateTime(view.getContext(), liVar.b, 65553));
                gj0Var.B.setText(liVar.e > 0.0d ? NumberFormat.getIntegerInstance(Locale.getDefault()).format(Math.round(liVar.e)) : "—");
                gj0Var.C.setVisibility(liVar.r > 0 ? 0 : 8);
                String str3 = liVar.f;
                if (str3 != null && !str3.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str3);
                    } catch (Throwable unused) {
                    }
                }
                w(gj0Var.D, jSONObject, "cpu");
                w(gj0Var.E, jSONObject, "memory");
                w(gj0Var.F, jSONObject, "disk");
                w(gj0Var.G, jSONObject, "gpu");
                view.setOnClickListener(new uc(this, 7, liVar));
                return;
            default:
                mp0 mp0Var = (mp0) te1Var;
                lp0 lp0Var = (lp0) y9Var.f.get(i2);
                np0[] np0VarArr = mp0Var.C;
                int min = Math.min(lp0Var.f602a.size(), 3);
                int i8 = 0;
                for (int i9 = 3; i8 < i9; i9 = 3) {
                    if (i8 < min) {
                        boolean z = i8 == min + (-1);
                        np0 np0Var = np0VarArr[i8];
                        lc1 lc1Var = (lc1) lp0Var.f602a.get(i8);
                        float f2 = mp0Var.D;
                        GradientDrawable gradientDrawable2 = np0Var.m;
                        TextView textView5 = np0Var.e;
                        np0Var.n = lc1Var;
                        np0Var.b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(lc1Var.b)));
                        np0Var.c.setText(lc1Var.c);
                        np0Var.d.setText(lc1Var.d);
                        np0Var.f.setText(lc1Var.e);
                        View view2 = np0Var.f696a;
                        view2.setBackgroundColor(lc1Var.h);
                        np0Var.k.setVisibility(z ? 8 : 0);
                        nc1 nc1Var = lc1Var.m;
                        np0Var.l.setColor(nc1Var != null ? nc1Var.f674a : -8355712);
                        if (nc1Var != null) {
                            np0Var.g.setText(nc1Var.b);
                            np0Var.h.setText(nc1Var.c);
                            np0Var.i.setText(nc1Var.d);
                            np0Var.j.setText(nc1Var.e);
                        }
                        mc1 mc1Var2 = lc1Var.i;
                        if (mc1Var2 == null) {
                            textView5.setVisibility(8);
                            r4 = 0;
                        } else {
                            gradientDrawable2.setCornerRadius(f2);
                            gradientDrawable2.setColor(mc1Var2.b);
                            textView5.setText(mc1Var2.f624a);
                            r4 = 0;
                            textView5.setVisibility(0);
                        }
                        boolean z2 = lc1Var.j != null ? true : r4;
                        view2.setClickable(z2);
                        view2.setFocusable(z2);
                        np0VarArr[i8].f696a.setVisibility(r4);
                    } else {
                        np0 np0Var2 = np0VarArr[i8];
                        np0Var2.n = null;
                        np0Var2.f696a.setVisibility(8);
                    }
                    i8++;
                }
                mp0Var.B.setVisibility(lp0Var.b ? 0 : 8);
                return;
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i2) {
        int i3 = this.e;
        Object obj = this.f;
        switch (i3) {
            case 0:
                return new ht(d51.j(viewGroup, R.layout.item_bench_rankings_compare, viewGroup, false), (p8) obj);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new gj0(d51.j(viewGroup, R.layout.item_bench_history_row, viewGroup, false));
            default:
                return new mp0(d51.j(viewGroup, R.layout.item_bench_rankings_leaderboard, viewGroup, false), (gm2) obj);
        }
    }
}
