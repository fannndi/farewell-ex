package flar2.devcheck.benchmarkSuite.sanity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.n51;
import defpackage.tc;
import flar2.devcheck.usage.GgP.rlfWzcx;

/* loaded from: classes.dex */
public final class SanityCheckActivity extends Activity {
    public static final /* synthetic */ int j = 0;
    public TextView g;
    public Button h;
    public final Handler i = new Handler(Looper.getMainLooper());

    public final void a() {
        this.h.setEnabled(false);
        this.g.setText("");
        new Thread(new n51(this, 14, getFilesDir()), rlfWzcx.WPQAzYDKpItjrKS).start();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-16777216);
        int i = (int) (getResources().getDisplayMetrics().density * 12.0f);
        linearLayout.setPadding(i, i, i, i);
        TextView textView = new TextView(this);
        textView.setText("Benchmark Suite — Sanity Check");
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(this);
        this.h = button;
        button.setText("Run again");
        this.h.setOnClickListener(new tc(25, this));
        linearLayout.addView(this.h, new LinearLayout.LayoutParams(-1, -2));
        TextView textView2 = new TextView(this);
        this.g = textView2;
        textView2.setTextColor(-16711936);
        this.g.setTypeface(Typeface.MONOSPACE);
        this.g.setTextSize(11.0f);
        this.g.setTextIsSelectable(true);
        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(this.g);
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        setContentView(linearLayout);
        a();
    }
}
