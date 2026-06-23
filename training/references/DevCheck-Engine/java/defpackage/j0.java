package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skydoves.colorpickerview.ColorPickerView;

/* loaded from: classes.dex */
public abstract class j0 extends FrameLayout {
    public ColorPickerView g;
    public final Paint h;
    public final Paint i;
    public float j;
    public int k;
    public Drawable l;
    public int m;
    public int n;
    public int o;
    public final ImageView p;
    public String q;
    public boolean r;

    public j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = 1.0f;
        int i = 0;
        this.k = 0;
        this.m = 2;
        this.n = -16777216;
        this.o = -1;
        this.r = false;
        b(attributeSet);
        this.h = new Paint(1);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(this.m);
        this.i.setColor(this.n);
        setBackgroundColor(-1);
        this.p = new ImageView(getContext());
        Drawable drawable = this.l;
        if (drawable != null) {
            setSelectorDrawable(drawable);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new i0(i, this));
    }

    public abstract int a();

    public abstract void b(AttributeSet attributeSet);

    public final float c(float f) {
        float width = getWidth() - (this.p.getWidth() / 2);
        if (f >= width) {
            return width;
        }
        if (f <= getSelectorSize() / 2.0f) {
            return 0.0f;
        }
        return f - (getSelectorSize() / 2.0f);
    }

    public final void d() {
        this.o = this.g.getPureColor();
        f(this.h);
        invalidate();
    }

    public abstract void e();

    public abstract void f(Paint paint);

    public final void g(int i) {
        float width = this.p.getWidth() / 2.0f;
        float f = i;
        float width2 = (f - width) / ((getWidth() - width) - width);
        this.j = width2;
        if (width2 < 0.0f) {
            this.j = 0.0f;
        }
        if (this.j > 1.0f) {
            this.j = 1.0f;
        }
        int c = (int) c(f);
        this.k = c;
        this.p.setX(c);
        this.g.b(a());
    }

    public int getBorderHalfSize() {
        return (int) (this.m * 0.5f);
    }

    public float getSelectorPosition() {
        return this.j;
    }

    public int getSelectorSize() {
        return this.p.getWidth();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float measuredHeight = getMeasuredHeight();
        canvas.drawRect(0.0f, 0.0f, width, measuredHeight, this.h);
        canvas.drawRect(0.0f, 0.0f, width, measuredHeight, this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.g != null) {
            int actionMasked = motionEvent.getActionMasked();
            ImageView imageView = this.p;
            if (actionMasked != 0 && actionMasked != 1 && actionMasked != 2) {
                imageView.setPressed(false);
                return false;
            }
            imageView.setPressed(true);
            if (motionEvent.getX() <= getWidth() && motionEvent.getX() >= 0.0f) {
                float x = motionEvent.getX();
                float width = imageView.getWidth() / 2.0f;
                float width2 = getWidth() - width;
                if (x > width2) {
                    x = width2;
                }
                float f = (x - width) / (width2 - width);
                this.j = f;
                if (f < 0.0f) {
                    this.j = 0.0f;
                }
                if (this.j > 1.0f) {
                    this.j = 1.0f;
                }
                int c = (int) c(new Point((int) motionEvent.getX(), (int) motionEvent.getY()).x);
                this.k = c;
                imageView.setX(c);
                if (this.g.getActionMode() != i2.h) {
                    this.g.b(a());
                } else if (motionEvent.getAction() == 1) {
                    this.g.b(a());
                }
                this.g.getFlagView();
                float width3 = getWidth() - imageView.getWidth();
                if (imageView.getX() >= width3) {
                    imageView.setX(width3);
                }
                if (imageView.getX() <= 0.0f) {
                    imageView.setX(0.0f);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.p.setVisibility(z ? 0 : 4);
        setClickable(z);
    }

    public void setSelectorByHalfSelectorPosition(float f) {
        this.j = Math.min(f, 1.0f);
        int c = (int) c(((getWidth() * f) - (getSelectorSize() * 0.5f)) - getBorderHalfSize());
        this.k = c;
        this.p.setX(c);
        this.r = true;
    }

    public void setSelectorDrawable(Drawable drawable) {
        removeView(this.p);
        this.l = drawable;
        this.p.setImageDrawable(drawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.p, layoutParams);
    }

    public void setSelectorPosition(float f) {
        this.j = Math.min(f, 1.0f);
        int c = (int) c(((getWidth() * f) - getSelectorSize()) - getBorderHalfSize());
        this.k = c;
        this.p.setX(c);
        this.r = true;
    }
}
