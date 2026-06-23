package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.R;
import flar2.devcheck.tests.MultiTouchActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class my0 extends View {
    public static int A;
    public static int v;
    public static int w;
    public static int x;
    public static final int y = 100 + 20;
    public static final int z = 100 + 30;
    public final Paint g;
    public final Paint h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public final boolean[] s;
    public final MultiTouchActivity t;
    public final MultiTouchActivity u;

    public my0(MultiTouchActivity multiTouchActivity, MultiTouchActivity multiTouchActivity2) {
        super(multiTouchActivity);
        this.g = new Paint(1);
        Paint paint = new Paint(1);
        this.h = paint;
        this.i = new float[30];
        this.j = new float[30];
        this.k = new float[30];
        this.l = new float[30];
        this.m = new float[30];
        this.n = new float[30];
        this.o = new float[30];
        this.p = new float[30];
        this.q = new float[30];
        this.r = new float[30];
        this.s = new boolean[30];
        this.t = multiTouchActivity;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(1.0f);
        paint2.setARGB(255, 255, 255, 255);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setTextSize(MultiTouchActivity.J / 10);
        paint.setStrokeWidth(1.0f);
        paint.setARGB(255, 255, 255, 255);
        paint.setStyle(style);
        paint.setTextSize(MultiTouchActivity.J / 10);
        this.u = multiTouchActivity2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.s;
            if (i >= zArr.length) {
                int i3 = A;
                Paint paint = this.h;
                MultiTouchActivity multiTouchActivity = this.u;
                if (i3 == 0) {
                    multiTouchActivity.F.setVisibility(0);
                    canvas.drawText(MultiTouchActivity.K, (MultiTouchActivity.I - paint.measureText(MultiTouchActivity.K)) / 2.0f, MultiTouchActivity.H / 2, paint);
                } else {
                    multiTouchActivity.F.setVisibility(8);
                }
                String str = this.t.getString(R.string.number_touches) + MiGPiFgcCQCVh.cnaGsNV + i2;
                canvas.drawText(str, (MultiTouchActivity.I - paint.measureText(str)) / 2.0f, 100.0f, paint);
                return;
            }
            if (zArr[i]) {
                i2++;
                switch (i) {
                    case 0:
                        v = 0;
                        w = 246;
                        x = 255;
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        v = 0;
                        w = 0;
                        x = 255;
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        v = 0;
                        w = 255;
                        x = 0;
                        break;
                    case 3:
                        v = 255;
                        w = 0;
                        x = 0;
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        v = 255;
                        w = 162;
                        x = 0;
                        break;
                    case 5:
                        v = 206;
                        w = 206;
                        x = 206;
                        break;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        v = 255;
                        w = 240;
                        x = 0;
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        v = 0;
                        w = 255;
                        x = 216;
                        break;
                    case 8:
                        v = 126;
                        w = 255;
                        x = 0;
                        break;
                    case rt0.o /* 9 */:
                        v = 126;
                        w = 0;
                        x = 255;
                        break;
                    case 10:
                        v = 0;
                        w = 246;
                        x = 255;
                        break;
                    case 11:
                        v = 0;
                        w = 0;
                        x = 255;
                        break;
                    case 12:
                        v = 0;
                        w = 255;
                        x = 0;
                        break;
                    case 13:
                        v = 255;
                        w = 0;
                        x = 0;
                        break;
                    case 14:
                        v = 255;
                        w = 102;
                        x = 0;
                        break;
                    case 15:
                        v = 206;
                        w = 206;
                        x = 206;
                        break;
                    case 16:
                        v = 255;
                        w = 240;
                        x = 0;
                        break;
                    case rt0.p /* 17 */:
                        v = 0;
                        w = 255;
                        x = 216;
                        break;
                    case 18:
                        v = 126;
                        w = 255;
                        x = 0;
                        break;
                    case 19:
                        v = 126;
                        w = 0;
                        x = 255;
                        break;
                }
                Paint paint2 = this.g;
                paint2.setStrokeWidth(1.0f);
                paint2.setStyle(Paint.Style.FILL);
                int i4 = MultiTouchActivity.H;
                paint2.setARGB(255, v, w, x);
                float[] fArr = this.i;
                float f = fArr[i];
                float[] fArr2 = this.j;
                canvas.drawCircle(f, fArr2[i], z, paint2);
                paint2.setARGB(255, 0, 0, 0);
                canvas.drawCircle(fArr[i], fArr2[i], y, paint2);
                paint2.setARGB(255, v, w, x);
                canvas.drawCircle(fArr[i], fArr2[i], 100.0f, paint2);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:5|(1:7)|8|9|(1:11)|12|(1:14)|15|(3:17|(2:19|(1:21))|22)|23|24|25|22) */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getAction()
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >> 8
            int r1 = r11.getPointerId(r0)
            int r2 = r11.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r11.getPointerCount()
            r4 = 30
            r5 = 1
            if (r3 > r4) goto Lb0
            r4 = 29
            if (r0 > r4) goto Lb0
            r0 = 0
            r4 = r0
        L23:
            if (r4 >= r3) goto L7a
            int r6 = r11.getPointerId(r4)
            float r7 = r11.getX(r4)
            int r7 = (int) r7
            float r7 = (float) r7
            float[] r8 = r10.i
            r8[r6] = r7
            float r7 = r11.getY(r4)
            int r7 = (int) r7
            float r7 = (float) r7
            float[] r8 = r10.j
            r8[r6] = r7
            float[] r7 = r10.k
            float r8 = r11.getX(r4)
            r7[r6] = r8
            float[] r7 = r10.l
            r8 = 0
            r7[r6] = r8
            float[] r7 = r10.m
            float r9 = r11.getX(r4)
            r7[r6] = r9
            int r7 = flar2.devcheck.tests.MultiTouchActivity.H
            float r7 = (float) r7
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r7 = r7 * r9
            float[] r9 = r10.n
            r9[r6] = r7
            float[] r7 = r10.o
            r7[r6] = r8
            float[] r7 = r10.p
            float r8 = r11.getY(r4)
            r7[r6] = r8
            int r7 = flar2.devcheck.tests.MultiTouchActivity.I
            float r7 = (float) r7
            float[] r8 = r10.q
            r8[r6] = r7
            float[] r7 = r10.r
            float r8 = r11.getY(r4)
            r7[r6] = r8
            int r4 = r4 + 1
            goto L23
        L7a:
            int r3 = r11.getAction()
            if (r3 != 0) goto L85
            int r3 = defpackage.my0.A
            int r3 = r3 + r5
            defpackage.my0.A = r3
        L85:
            int r11 = r11.getAction()
            if (r11 != r5) goto L90
            int r11 = defpackage.my0.A
            int r11 = r11 - r5
            defpackage.my0.A = r11
        L90:
            boolean[] r11 = r10.s
            if (r2 == 0) goto L9d
            r3 = 2
            if (r2 == r3) goto Lae
            r3 = 5
            if (r2 == r3) goto L9d
            r11[r1] = r0
            goto Lb0
        L9d:
            int r0 = flar2.devcheck.tests.MultiTouchActivity.H
            flar2.devcheck.tests.MultiTouchActivity r0 = r10.t     // Catch: java.lang.NullPointerException -> Lae
            java.lang.String r2 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.NullPointerException -> Lae
            android.os.Vibrator r0 = (android.os.Vibrator) r0     // Catch: java.lang.NullPointerException -> Lae
            r2 = 25
            r0.vibrate(r2)     // Catch: java.lang.NullPointerException -> Lae
        Lae:
            r11[r1] = r5
        Lb0:
            r10.invalidate()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
