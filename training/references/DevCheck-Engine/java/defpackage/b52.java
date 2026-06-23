package defpackage;

import android.graphics.drawable.Drawable;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b52 extends td1 {
    public final int d;
    public final ArrayList e = new ArrayList();
    public long f = 0;
    public long g = 0;
    public z42 h;

    public b52(int i) {
        this.d = i;
    }

    @Override // defpackage.td1
    public final int c() {
        return this.e.size();
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        a52 a52Var = (a52) te1Var;
        c52 c52Var = (c52) this.e.get(i);
        TextView textView = a52Var.B;
        TextView textView2 = a52Var.E;
        TextView textView3 = a52Var.C;
        ProgressBar progressBar = a52Var.F;
        TextView textView4 = a52Var.D;
        View view = a52Var.g;
        String str = c52Var.b;
        d52 d52Var = c52Var.e;
        textView.setText(str);
        Drawable drawable = c52Var.c;
        ImageView imageView = a52Var.A;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageDrawable(null);
        }
        view.setOnClickListener(new uc(this, 20, c52Var));
        if (this.d == 0) {
            long j = c52Var.d;
            long j2 = this.g;
            int min = j2 <= 0 ? 0 : Math.min(100, Math.max(0, (int) Math.round((j * 100.0d) / j2)));
            String B = uz1.B(view.getContext(), c52Var.d);
            if (textView3 != null) {
                textView3.setText(B + " • " + min + "%");
                textView3.setVisibility(0);
            }
            if (textView4 != null) {
                textView4.setText("");
                textView4.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setText("");
                textView2.setVisibility(8);
            }
            if (progressBar != null) {
                long j3 = this.f;
                if (j3 <= 0) {
                    progressBar.setMax(1);
                    progressBar.setProgress(0);
                    return;
                } else {
                    int min2 = (int) Math.min(2147483647L, j3);
                    int min3 = (int) Math.min(2147483647L, c52Var.d);
                    progressBar.setMax(min2);
                    progressBar.setProgress(Math.min(min2, Math.max(0, min3)));
                    return;
                }
            }
            return;
        }
        long j4 = d52Var.f174a + d52Var.b;
        long j5 = d52Var.c + d52Var.d;
        String formatShortFileSize = Formatter.formatShortFileSize(view.getContext(), j4);
        String formatShortFileSize2 = Formatter.formatShortFileSize(view.getContext(), j5);
        if (textView3 != null) {
            textView3.setText("Wi-Fi " + formatShortFileSize + "  •  Mobile " + formatShortFileSize2);
            textView3.setVisibility(0);
        }
        String formatShortFileSize3 = Formatter.formatShortFileSize(view.getContext(), d52Var.b + d52Var.d + d52Var.f174a + d52Var.c);
        String formatShortFileSize4 = Formatter.formatShortFileSize(view.getContext(), d52Var.f174a + d52Var.c);
        String formatShortFileSize5 = Formatter.formatShortFileSize(view.getContext(), d52Var.b + d52Var.d);
        if (textView4 != null) {
            textView4.setText(formatShortFileSize3);
            textView4.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText("↓ " + formatShortFileSize4 + "  ↑ " + formatShortFileSize5);
            textView2.setVisibility(0);
        } else if (textView4 != null) {
            textView4.setText(formatShortFileSize3 + "\n↓ " + formatShortFileSize4 + "  ↑ " + formatShortFileSize5);
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        int i2 = this.d;
        View j = d51.j(viewGroup, i2 == 0 ? R.layout.item_usage_app_screentime : R.layout.item_usage_app, viewGroup, false);
        a52 a52Var = new a52(j);
        a52Var.A = (ImageView) j.findViewById(R.id.icon);
        a52Var.B = (TextView) j.findViewById(R.id.title);
        a52Var.C = (TextView) j.findViewById(R.id.subtitle);
        a52Var.D = (TextView) j.findViewById(R.id.value);
        a52Var.E = (TextView) j.findViewById(R.id.value2);
        if (i2 == 0) {
            a52Var.F = (ProgressBar) j.findViewById(R.id.progress);
            return a52Var;
        }
        a52Var.F = null;
        return a52Var;
    }

    public final void v(List list) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.f = 0L;
        this.g = 0L;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c52 c52Var = (c52) it.next();
                long max = Math.max(0L, c52Var.d);
                arrayList.add(c52Var);
                this.g += max;
                if (max > this.f) {
                    this.f = max;
                }
            }
        }
        f();
    }
}
