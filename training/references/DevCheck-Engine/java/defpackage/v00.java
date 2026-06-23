package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class v00 extends dn2 {
    public final np b;
    public final Paint c;
    public Paint d;
    public final Paint e;

    public v00(np npVar, i82 i82Var) {
        super(i82Var);
        this.b = npVar;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(n52.c(9.0f));
        Paint paint3 = new Paint(1);
        this.d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(2.0f);
        this.d.setColor(Color.rgb(255, 187, 115));
    }

    public final void l(w00 w00Var) {
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(w00Var.h);
    }

    public abstract void m(Canvas canvas);

    public abstract void n(Canvas canvas);

    public abstract void o(Canvas canvas, fj0[] fj0VarArr);

    public abstract void p(Canvas canvas);

    public abstract void q();

    public boolean r(qp qpVar) {
        return ((float) qpVar.getData().g()) < ((float) qpVar.getMaxVisibleCount()) * ((i82) this.f202a).i;
    }
}
