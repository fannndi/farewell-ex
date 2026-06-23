package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public abstract class re extends View {
    public lf0 g;
    public List h;
    public float i;
    public int j;
    public float k;
    public float l;
    public int m;
    public int n;
    public int o;
    public int p;
    public float q;
    public int r;
    public Paint s;
    public Paint t;

    private final float getBarPosition() {
        return this.l / this.m;
    }

    private final int getBaseLine() {
        return getHeight() / 2;
    }

    private final int getEndBar() {
        return Math.min(this.h.size(), getStartBar() + this.r);
    }

    private final int getStartBar() {
        return Math.max(0, ((int) getBarPosition()) - (this.r / 2));
    }

    public final lf0 getAmpNormalizer() {
        return this.g;
    }

    public final List<Integer> getAmps() {
        return this.h;
    }

    public final int getApproximateBarDuration() {
        return this.j;
    }

    public final int getBarDuration() {
        return this.p;
    }

    public final float getBarWidth() {
        return this.q;
    }

    public final long getCurrentDuration() {
        return ((long) this.l) * this.n;
    }

    public final float getCursorPosition() {
        return this.l;
    }

    public final float getMaxAmp() {
        return this.i;
    }

    public final float getSpaceBetweenBar() {
        return this.k;
    }

    public final int getTickCount() {
        return this.o;
    }

    public final int getTickDuration() {
        return this.n;
    }

    public final int getTickPerBar() {
        return this.m;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.g = qe.j;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        if (!this.h.isEmpty()) {
            int startBar = getStartBar();
            int endBar = getEndBar();
            while (startBar < endBar) {
                float width = (getWidth() / 2) - ((this.q + this.k) * (getBarPosition() - startBar));
                float baseLine = getBaseLine() + (r2 / 2);
                float max = baseLine - ((int) (Math.max(0.01f, Math.min(((Number) this.h.get(startBar)).floatValue() / this.i, 0.9f)) * getHeight()));
                if (width <= getWidth() / 2) {
                    Paint paint = this.s;
                    if (paint == null) {
                        ym0.A("loadedBarPrimeColor");
                        throw null;
                    }
                    canvas2 = canvas;
                    canvas2.drawLine(width, baseLine, width, max, paint);
                } else {
                    canvas2 = canvas;
                    Paint paint2 = this.t;
                    if (paint2 == null) {
                        ym0.A("backgroundBarPrimeColor");
                        throw null;
                    }
                    canvas2.drawLine(width, baseLine, width, max, paint2);
                }
                startBar++;
                canvas = canvas2;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.r = (int) (getWidth() / (this.q + this.k));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.r = (int) (i / (this.q + this.k));
    }

    public final void setAmpNormalizer(lf0 lf0Var) {
        lf0Var.getClass();
        this.g = lf0Var;
    }

    public final void setAmps(List<Integer> list) {
        list.getClass();
        this.h = list;
    }

    public final void setApproximateBarDuration(int i) {
        this.j = i;
    }

    public final void setBarDuration(int i) {
        this.p = i;
    }

    public final void setBarWidth(float f) {
        if (this.q > 0.0f) {
            this.q = f;
            Paint paint = this.t;
            if (paint == null) {
                ym0.A("backgroundBarPrimeColor");
                throw null;
            }
            paint.setStrokeWidth(f);
            Paint paint2 = this.s;
            if (paint2 != null) {
                paint2.setStrokeWidth(f);
            } else {
                ym0.A("loadedBarPrimeColor");
                throw null;
            }
        }
    }

    public final void setCursorPosition(float f) {
        this.l = f;
    }

    public final void setMaxAmp(float f) {
        this.i = f;
    }

    public final void setSpaceBetweenBar(float f) {
        this.k = f;
    }

    public final void setTickCount(int i) {
        this.o = i;
    }

    public final void setTickDuration(int i) {
        this.n = i;
    }

    public final void setTickPerBar(int i) {
        this.m = i;
    }
}
