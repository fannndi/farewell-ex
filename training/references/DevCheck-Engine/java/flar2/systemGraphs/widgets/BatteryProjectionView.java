package flar2.devcheck.systemGraphs.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.d51;
import defpackage.ts0;
import flar2.devcheck.R;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class BatteryProjectionView extends View {
    public static final int[] M = {0, 25, 50, 75, 100};
    public boolean A;
    public long B;
    public long C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final int I;
    public final int J;
    public final DateFormat K;
    public final Date L;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public final Paint p;
    public final Paint q;
    public final Paint r;
    public final Paint s;
    public final Paint.FontMetrics t;
    public final Path u;
    public TextView v;
    public String w;
    public final ArrayDeque x;
    public float y;
    public float z;

    public BatteryProjectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        DateFormat timeInstance;
        this.g = new Paint(1);
        this.h = new Paint(1);
        this.i = new Paint(1);
        this.j = new Paint(1);
        this.k = new Paint(1);
        this.l = new Paint(1);
        this.m = new Paint(1);
        this.n = new Paint(1);
        this.o = new Paint(1);
        this.p = new Paint(1);
        this.q = new Paint(1);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.t = new Paint.FontMetrics();
        this.u = new Path();
        this.x = new ArrayDeque();
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.L = new Date();
        float f = getResources().getDisplayMetrics().density;
        this.D = 1.8f * f;
        this.E = 1.0f;
        this.F = 11.0f * f;
        float f2 = 4.0f * f;
        this.G = 8.0f * f;
        this.H = f2;
        try {
            timeInstance = android.text.format.DateFormat.getTimeFormat(ts0.a(context.getApplicationContext()));
        } catch (Throwable unused) {
            timeInstance = DateFormat.getTimeInstance(3, Locale.getDefault());
        }
        this.K = timeInstance;
        int b = b(R.attr.colorPrimary, -14776091);
        int b2 = b(R.attr.colorDivider, 579373192);
        this.I = b2;
        int d = d(b, 90);
        int b3 = b(R.attr.textTertiary, -7829368);
        this.J = b3;
        int d2 = d(b(R.attr.textPrimary, -16777216), 18);
        int b4 = b(R.attr.textPrimary, -14540254);
        Paint paint = this.g;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.g.setStrokeWidth(this.D);
        this.g.setStrokeJoin(Paint.Join.ROUND);
        Paint paint2 = this.g;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.g.setColor(b);
        this.h.setStyle(style);
        this.h.setStrokeWidth(this.D);
        this.h.setStrokeCap(cap);
        this.h.setColor(d(b, 180));
        this.h.setPathEffect(new DashPathEffect(new float[]{6.0f * f, f2}, 0.0f));
        this.i.setStyle(style);
        this.i.setStrokeWidth(this.E);
        this.i.setColor(b2);
        this.j.setStyle(style);
        this.j.setStrokeWidth(this.E);
        this.j.setColor(d);
        this.k.setStyle(style);
        this.k.setStrokeWidth(this.E);
        this.k.setColor(b3);
        this.k.setPathEffect(new DashPathEffect(new float[]{f2, f2}, 0.0f));
        this.l.setStyle(style);
        this.l.setStrokeWidth(this.E * 1.4f);
        this.l.setColor(d(b3, 200));
        this.l.setPathEffect(new DashPathEffect(new float[]{2.0f * f, f * 5.0f}, 0.0f));
        Paint paint3 = this.m;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        this.m.setColor(d2);
        this.n.setStyle(style2);
        this.n.setColor(b4);
        this.n.setTextSize(this.F);
        this.n.setTextAlign(Paint.Align.LEFT);
        Paint[] paintArr = {this.o, this.p, this.q};
        for (int i = 0; i < 3; i++) {
            Paint paint4 = paintArr[i];
            paint4.setStyle(Paint.Style.FILL);
            paint4.setColor(this.J);
            paint4.setTextSize(this.G);
        }
        Paint paint5 = this.o;
        Paint.Align align = Paint.Align.LEFT;
        paint5.setTextAlign(align);
        this.p.setTextAlign(Paint.Align.CENTER);
        this.q.setTextAlign(Paint.Align.RIGHT);
        this.r.setStyle(Paint.Style.FILL);
        this.r.setColor(d(b(R.attr.textTertiary, -7829368), 176));
        this.r.setTextSize(this.G);
        this.r.setTextAlign(align);
        this.s.setStyle(Paint.Style.STROKE);
        this.s.setStrokeWidth(this.E);
        this.s.setColor(this.I);
    }

    public static int d(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public final String a(long j) {
        Date date = this.L;
        date.setTime(j);
        return this.K.format(date);
    }

    public final int b(int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void c() {
        String format;
        if (this.v == null) {
            return;
        }
        if (Float.isNaN(this.z)) {
            format = "";
        } else {
            float f = this.z;
            if (f < 1.0f) {
                format = "<1 m";
            } else if (f < 60.0f) {
                format = String.format(Locale.getDefault(), "%.0f m", Float.valueOf(f));
            } else {
                long j = (long) (f / 60.0f);
                format = String.format(Locale.getDefault(), "%dh %02dm", Long.valueOf(j), Long.valueOf((long) (f - (j * 60.0f))));
            }
        }
        if (format.equals(this.w)) {
            return;
        }
        this.w = format;
        this.v.setText(format);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        long j2;
        float f;
        float f2;
        ArrayDeque arrayDeque = this.x;
        if (arrayDeque.isEmpty() || Float.isNaN(this.y)) {
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        Paint paint = this.r;
        Paint.FontMetrics fontMetrics = this.t;
        paint.getFontMetrics(fontMetrics);
        float measureText = paint.measureText("100%");
        float f3 = getResources().getDisplayMetrics().density * 6.0f;
        float f4 = fontMetrics.descent;
        float f5 = fontMetrics.ascent;
        float f6 = (f4 - f5) / 2.0f;
        float f7 = (f5 + f4) / 2.0f;
        float paddingLeft = getPaddingLeft() + measureText + f3;
        float f8 = this.D;
        float f9 = paddingLeft + f8;
        float paddingLeft2 = (getPaddingLeft() + width) - f8;
        Paint.FontMetrics fontMetrics2 = this.o.getFontMetrics();
        float paddingTop = f6 + getPaddingTop() + f8;
        float paddingTop2 = ((getPaddingTop() + height) - f8) - (fontMetrics2.descent - fontMetrics2.ascent);
        float f10 = this.H;
        float f11 = paddingTop2 - f10;
        float f12 = paddingLeft2 - f9;
        float f13 = f11 - paddingTop;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        float f14 = paddingLeft2;
        if (Float.isNaN(this.z)) {
            j = 60000;
            j2 = currentTimeMillis + 60000;
        } else {
            j = 60000;
            j2 = ((long) (this.z * 60000.0f)) + currentTimeMillis;
        }
        long j3 = j2;
        float f15 = f9;
        long max = Math.max(j, j3 - currentTimeMillis);
        float max2 = f12 * Math.max(0.08f, Math.min(0.5f, 300000.0f / (max + 300000)));
        float f16 = f15 + max2;
        float f17 = f14 - f16;
        float f18 = f13 / 100.0f;
        float paddingLeft3 = getPaddingLeft();
        int i = 0;
        while (i < 5) {
            int i2 = M[i];
            long j4 = max;
            float f19 = f11 - (i2 * f18);
            float f20 = f15;
            float f21 = paddingLeft3;
            float f22 = f14;
            float f23 = f7;
            canvas.drawLine(f20, f19, f22, f19, this.s);
            canvas.drawText(d51.o(i2, "%"), f21, f19 - f23, paint);
            i++;
            paddingLeft3 = f21;
            currentTimeMillis = currentTimeMillis;
            max = j4;
            f7 = f23;
            f10 = f10;
            f11 = f11;
            j3 = j3;
            arrayDeque = arrayDeque;
            paddingTop = paddingTop;
            f15 = f20;
            f14 = f22;
        }
        float f24 = paddingTop;
        float f25 = f15;
        float f26 = f14;
        long j5 = j3;
        long j6 = currentTimeMillis;
        float f27 = f10;
        float f28 = f11;
        long j7 = max;
        long uptimeMillis = SystemClock.uptimeMillis();
        Path path = this.u;
        path.reset();
        Iterator it = arrayDeque.iterator();
        boolean z = true;
        while (it.hasNext()) {
            float[] fArr = (float[]) it.next();
            long j8 = (long) fArr[0];
            float f29 = fArr[1];
            long j9 = uptimeMillis - j8;
            if (j9 < 0) {
                j9 = 0;
            }
            if (j9 > 300000) {
                j9 = 300000;
            }
            float f30 = (((300000 - j9) / 300000.0f) * max2) + f25;
            float f31 = f28 - (f29 * f18);
            if (z) {
                path.moveTo(f30, f31);
                z = false;
            } else {
                path.lineTo(f30, f31);
            }
        }
        canvas.drawPath(path, this.g);
        canvas.drawLine(f16, f24, f16, f28, this.k);
        if (Float.isNaN(this.z)) {
            f = f16;
            f2 = f26;
        } else {
            float f32 = this.A ? 100.0f : 0.0f;
            float f33 = f28 - (this.y * f18);
            float f34 = f28 - (f32 * f18);
            canvas.drawLine(f25, f34, f26, f34, this.j);
            canvas.drawLine(f16, f33, f26, f34, this.h);
            f = f16;
            f2 = f26;
        }
        char c = '\f';
        int i3 = 11;
        if (!Float.isNaN(this.z)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j6);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i4 = 6;
            calendar.add(6, 1);
            while (calendar.getTimeInMillis() < j5) {
                float timeInMillis = (((calendar.getTimeInMillis() - j6) / j7) * f17) + f;
                Calendar calendar2 = calendar;
                int i5 = i4;
                canvas.drawLine(timeInMillis, f24, timeInMillis, f28, this.l);
                calendar2.add(i5, 1);
                i4 = i5;
                i3 = i3;
                c = '\f';
                calendar = calendar2;
                j7 = j7;
            }
        }
        long j10 = j7;
        int i6 = i3;
        float f35 = (f28 + f27) - fontMetrics2.ascent;
        String a2 = a(j6);
        Paint paint2 = this.p;
        canvas.drawText(a2, f, f35, paint2);
        boolean isNaN = Float.isNaN(this.z);
        Paint paint3 = this.q;
        if (!isNaN) {
            canvas.drawText(a(j5), f2, f35, paint3);
        }
        if (Float.isNaN(this.z)) {
            return;
        }
        long j11 = 3600000;
        if (j10 <= 3600000) {
            j11 = 900000;
        } else if (j10 <= 10800000) {
            j11 = 1800000;
        } else if (j10 > 21600000) {
            j11 = j10 <= 43200000 ? 7200000L : j10 <= 86400000 ? 14400000L : 21600000L;
        }
        String a3 = a(j6);
        String a4 = a(j5);
        float measureText2 = paint2.measureText(a3) / 2.0f;
        float measureText3 = paint3.measureText(a4);
        float f36 = getResources().getDisplayMetrics().density * 4.0f;
        float f37 = (f - measureText2) - f36;
        float f38 = measureText2 + f + f36;
        float f39 = (f2 - measureText3) - f36;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(j6);
        calendar3.set(i6, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        long timeInMillis2 = calendar3.getTimeInMillis();
        while (timeInMillis2 <= j6) {
            timeInMillis2 += j11;
        }
        while (timeInMillis2 < j5) {
            float f40 = f39;
            float f41 = f38;
            long j12 = j10;
            float f42 = (((timeInMillis2 - j6) / j12) * f17) + f;
            String a5 = a(timeInMillis2);
            float measureText4 = paint2.measureText(a5) / 2.0f;
            float f43 = f42 + measureText4;
            if (f43 <= f40 && (f42 - measureText4 >= f41 || f43 <= f37)) {
                canvas.drawText(a5, f42, f35, paint2);
            }
            timeInMillis2 += j11;
            j10 = j12;
            f39 = f40;
            f38 = f41;
        }
    }

    public void setValueLabel(TextView textView) {
        this.v = textView;
        this.w = null;
        c();
    }
}
