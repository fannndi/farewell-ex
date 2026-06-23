package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public final class vr0 implements View.OnTouchListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vr0(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                wr0 wr0Var = (wr0) obj;
                tr0 tr0Var = wr0Var.x;
                Handler handler = wr0Var.B;
                k6 k6Var = wr0Var.F;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && k6Var != null && k6Var.isShowing() && x >= 0 && x < k6Var.getWidth() && y >= 0 && y < k6Var.getHeight()) {
                    handler.postDelayed(tr0Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(tr0Var);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
