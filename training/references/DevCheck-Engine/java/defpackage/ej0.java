package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ej0 extends om0 {
    public final /* synthetic */ int l;

    @Override // defpackage.om0
    public final int u(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.l) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.om0
    public final int x() {
        switch (this.l) {
            case 0:
                return 1;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 2;
            default:
                return 0;
        }
    }

    @Override // defpackage.om0
    public final ViewPropertyAnimator y(View view, int i) {
        switch (this.l) {
            case 0:
                return view.animate().translationY(i);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
