package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class n52 {

    /* renamed from: a, reason: collision with root package name */
    public static DisplayMetrics f665a = null;
    public static int b = 50;
    public static int c = 8000;
    public static final float d;
    public static final Rect e;
    public static final Paint.FontMetrics f;
    public static final Rect g;
    public static final e10 h;
    public static final Rect i;
    public static final Paint.FontMetrics j;

    static {
        Double.longBitsToDouble(1L);
        d = Float.intBitsToFloat(1);
        e = new Rect();
        f = new Paint.FontMetrics();
        g = new Rect();
        h = new e10(1);
        new Rect();
        i = new Rect();
        j = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = e;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static ra0 b(Paint paint, String str) {
        ra0 ra0Var = (ra0) ra0.j.b();
        ra0Var.h = 0.0f;
        ra0Var.i = 0.0f;
        Rect rect = g;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        ra0Var.h = rect.width();
        ra0Var.i = rect.height();
        return ra0Var;
    }

    public static float c(float f2) {
        DisplayMetrics displayMetrics = f665a;
        return displayMetrics == null ? f2 : f2 * displayMetrics.density;
    }

    public static void d(Canvas canvas, String str, float f2, float f3, Paint paint, it0 it0Var) {
        Paint.FontMetrics fontMetrics = j;
        float fontMetrics2 = paint.getFontMetrics(fontMetrics);
        paint.getTextBounds(str, 0, str.length(), i);
        float f4 = 0.0f - r4.left;
        float f5 = (-fontMetrics.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (it0Var.h != 0.0f || it0Var.i != 0.0f) {
            f4 -= r4.width() * it0Var.h;
            f5 -= fontMetrics2 * it0Var.i;
        }
        canvas.drawText(str, f4 + f2, f5 + f3, paint);
        paint.setTextAlign(textAlign);
    }

    public static ra0 e(float f2, float f3) {
        float abs = Math.abs(((float) Math.sin(0.0d)) * f3) + Math.abs(((float) Math.cos(0.0d)) * f2);
        float abs2 = Math.abs(f3 * ((float) Math.cos(0.0d))) + Math.abs(f2 * ((float) Math.sin(0.0d)));
        ra0 ra0Var = (ra0) ra0.j.b();
        ra0Var.h = abs;
        ra0Var.i = abs2;
        return ra0Var;
    }

    public static void f(Context context) {
        if (context == null) {
            b = ViewConfiguration.getMinimumFlingVelocity();
            c = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            b = viewConfiguration.getScaledMinimumFlingVelocity();
            c = viewConfiguration.getScaledMaximumFlingVelocity();
            f665a = context.getResources().getDisplayMetrics();
        }
    }

    public static float g(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2) || d2 == 0.0d) {
            return 0.0f;
        }
        return Math.round(d2 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2 < 0.0d ? -d2 : d2)))));
    }
}
