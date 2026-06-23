package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class lm0 implements View.OnTouchListener {
    public final Dialog g;
    public final int h;
    public final int i;
    public final int j;

    public lm0(Dialog dialog2, Rect rect) {
        this.g = dialog2;
        this.h = rect.left;
        this.i = rect.top;
        this.j = ViewConfiguration.get(dialog2.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.h;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.i, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.j) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.g.onTouchEvent(obtain);
    }
}
