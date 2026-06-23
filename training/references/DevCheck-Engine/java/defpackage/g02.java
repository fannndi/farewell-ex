package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class g02 extends vv0 implements qx1 {
    public CharSequence N;
    public final Context O;
    public final Paint.FontMetrics P;
    public final rx1 Q;
    public final vk R;
    public final Rect S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public int Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;

    public g02(Context context, int i) {
        super(context, null, 0, i);
        this.P = new Paint.FontMetrics();
        rx1 rx1Var = new rx1(this);
        this.Q = rx1Var;
        this.R = new vk(2, this);
        this.S = new Rect();
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.e0 = 1.0f;
        this.O = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = rx1Var.f910a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float F() {
        int i;
        Rect rect = this.S;
        if (((rect.right - getBounds().right) - this.Z) - this.W < 0) {
            i = ((rect.right - getBounds().right) - this.Z) - this.W;
        } else {
            if (((rect.left - getBounds().left) - this.Z) + this.W <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.Z) + this.W;
        }
        return i;
    }

    public final x31 G() {
        float f = -F();
        float width = (float) ((getBounds().width() - (Math.sqrt(2.0d) * this.Y)) / 2.0d);
        return new x31(new ku0(this.Y), Math.min(Math.max(f, -width), width));
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float F = F();
        float f = (float) (-((Math.sqrt(2.0d) * this.Y) - this.Y));
        canvas.scale(this.a0, this.b0, (getBounds().width() * this.c0) + getBounds().left, (getBounds().height() * this.d0) + getBounds().top);
        canvas.translate(F, f);
        super.draw(canvas);
        if (this.N == null) {
            canvas2 = canvas;
        } else {
            float centerY = getBounds().centerY();
            rx1 rx1Var = this.Q;
            TextPaint textPaint = rx1Var.f910a;
            Paint.FontMetrics fontMetrics = this.P;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (rx1Var.g != null) {
                textPaint.drawableState = getState();
                rx1Var.g.d(this.O, rx1Var.f910a, rx1Var.b);
                textPaint.setAlpha((int) (this.e0 * 255.0f));
            }
            CharSequence charSequence = this.N;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.Q.f910a.getTextSize(), this.V);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.T * 2;
        CharSequence charSequence = this.N;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.Q.a(charSequence.toString())), this.U);
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.X) {
            bn1 l = k().l();
            l.k = G();
            setShapeAppearanceModel(l.a());
        }
    }
}
