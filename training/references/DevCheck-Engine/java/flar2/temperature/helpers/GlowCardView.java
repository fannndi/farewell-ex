package flar2.devcheck.temperature.helpers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import defpackage.i70;

/* loaded from: classes.dex */
public class GlowCardView extends MaterialCardView {
    public i70 u;
    public final Paint v;
    public int w;
    public int x;
    public final RectF y;

    public GlowCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = 0;
        this.x = 0;
        this.y = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.0f);
        paint.setColor(0);
        super.setStrokeWidth(0);
        super.setStrokeColor(0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        i70 i70Var = this.u;
        if (i70Var != null) {
            i70Var.setBounds(0, 0, getWidth(), getHeight());
            this.u.draw(canvas);
        }
        int i = this.w;
        if (i <= 0 || this.x == 0) {
            return;
        }
        float f = i / 2.0f;
        float radius = getRadius();
        RectF rectF = this.y;
        rectF.set(f, f, getWidth() - f, getHeight() - f);
        canvas.drawRoundRect(rectF, radius, radius, this.v);
    }

    public void setGlowDrawable(i70 i70Var) {
        this.u = i70Var;
        invalidate();
    }

    @Override // com.google.android.material.card.MaterialCardView
    public void setStrokeColor(int i) {
        this.x = i;
        this.v.setColor(i);
        super.setStrokeColor(0);
        invalidate();
    }

    @Override // com.google.android.material.card.MaterialCardView
    public void setStrokeWidth(int i) {
        this.w = i;
        this.v.setStrokeWidth(i);
        super.setStrokeWidth(0);
        invalidate();
    }
}
