package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.temperature.helpers.GlowCardView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bx1 extends td1 {
    public final ww1 d;
    public final ArrayList e = new ArrayList();
    public String f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public bx1(Context context, ww1 ww1Var) {
        context.getApplicationContext();
        this.d = ww1Var;
        this.g = uz1.d(context);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        this.h = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.colorPrimaryAlpha, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.dashboard_red, typedValue, true);
        this.k = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_yellow, typedValue, true);
        this.i = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_orange, typedValue, true);
        this.j = typedValue.data;
        context.getColor(R.color.green);
        context.getColor(R.color.green_alpha);
        context.getTheme().resolveAttribute(R.attr.textPrimary, typedValue, true);
        this.m = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_red_alpha, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.dashboard_yellow_alpha, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.dashboard_orange_alpha, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.card_background_color, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.colorLightBackground, typedValue, true);
        this.l = typedValue.data;
    }

    @Override // defpackage.td1
    public final int c() {
        return this.e.size();
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        String str;
        String str2;
        String str3;
        ax1 ax1Var = (ax1) te1Var;
        zw1 zw1Var = (zw1) this.e.get(i);
        GlowCardView glowCardView = ax1Var.A;
        TextView textView = ax1Var.C;
        bx1 bx1Var = ax1Var.D;
        int i2 = bx1Var.k;
        int i3 = bx1Var.j;
        int i4 = bx1Var.i;
        ax1Var.B.setText(zw1Var.b);
        boolean d = et.f248a.d("prefFahrenheit");
        float f = zw1Var.c;
        if (d) {
            f = ((f * 9.0f) / 5.0f) + 32.0f;
            str = "°F";
        } else {
            str = "°C";
        }
        textView.setText(String.format("%.1f%s", Float.valueOf(f), str));
        int i5 = zw1Var.h;
        if (i5 == 2) {
            textView.setTextColor(i4);
        } else if (i5 == 3) {
            textView.setTextColor(i3);
        } else if (i5 == 4) {
            textView.setTextColor(i2);
        } else {
            textView.setTextColor(bx1Var.m);
        }
        int i6 = zw1Var.h;
        int i7 = bx1Var.l;
        boolean z = bx1Var.g;
        int A = d51.A(i6);
        if (A == 1) {
            i2 = i4;
        } else if (A == 2) {
            i2 = i3;
        } else if (A != 3) {
            i2 = i7;
        }
        int e = ts.e(i2, 2);
        if (z) {
            e = ts.e(i2, 2);
        }
        glowCardView.setCardBackgroundColor(ts.b(e, i7));
        int i8 = 18;
        if (i6 != 1) {
            int e2 = ts.e(i2, 20);
            if (z) {
                e2 = ts.e(i2, 18);
            }
            glowCardView.setGlowDrawable(new i70(glowCardView.getRadius(), e2, z));
        } else {
            glowCardView.setGlowDrawable(null);
        }
        boolean z2 = zw1Var.i;
        if (!z2 && (str2 = zw1Var.f1291a) != null && (str3 = bx1Var.f) != null) {
            z2 = str2.equals(str3);
        }
        glowCardView.setStrokeWidth(z2 ? 3 : 0);
        if (z2) {
            glowCardView.setStrokeColor(bx1Var.h);
        }
        glowCardView.setOnClickListener(new uc(ax1Var, i8, zw1Var));
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        return new ax1(this, d51.j(viewGroup, R.layout.view_temperature_tile, viewGroup, false));
    }

    public final void v(String str, List list) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f = str;
        arrayList.clear();
        arrayList.addAll(list);
        md2.e(new o8(this, arrayList2)).a(new gm2(4, this));
    }
}
