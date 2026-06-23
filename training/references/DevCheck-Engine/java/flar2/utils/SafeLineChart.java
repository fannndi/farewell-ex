package flar2.devcheck.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.LineChart;

/* loaded from: classes.dex */
public class SafeLineChart extends LineChart {
    public SafeLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.cd, defpackage.mp, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }
}
