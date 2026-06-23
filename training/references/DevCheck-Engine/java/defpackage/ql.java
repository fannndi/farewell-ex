package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EdgeEffect;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.jjoe64.graphview.GraphView;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ql extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ql(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.g) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDragHandleView) this.h).k;
                if (bottomSheetBehavior != null && bottomSheetBehavior.J) {
                    bottomSheetBehavior.O(5);
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((BottomSheetDragHandleView) obj).isClickable();
            default:
                x82 x82Var = (x82) obj;
                GraphView graphView = x82Var.c;
                if (graphView.p) {
                    return true;
                }
                if (!x82Var.g || x82Var.f) {
                    return false;
                }
                EdgeEffect edgeEffect = (EdgeEffect) x82Var.m.g;
                edgeEffect.onRelease();
                edgeEffect.isFinished();
                EdgeEffect edgeEffect2 = (EdgeEffect) x82Var.n.g;
                edgeEffect2.onRelease();
                edgeEffect2.isFinished();
                EdgeEffect edgeEffect3 = (EdgeEffect) x82Var.k.g;
                edgeEffect3.onRelease();
                edgeEffect3.isFinished();
                EdgeEffect edgeEffect4 = (EdgeEffect) x82Var.l.g;
                edgeEffect4.onRelease();
                edgeEffect4.isFinished();
                x82Var.j.forceFinished(true);
                WeakHashMap weakHashMap = y62.f1215a;
                graphView.postInvalidateOnAnimation();
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.g) {
            case 0:
                ((BottomSheetDragHandleView) this.h).performLongClick(motionEvent.getX(), motionEvent.getY());
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        if (r8 < 0.0d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r2.f375a += r10;
        r2.b += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        r10 = r10 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r8 > 0.0d) goto L49;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r23, android.view.MotionEvent r24, float r25, float r26) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.g) {
            case 0:
                BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.h;
                int i = BottomSheetDragHandleView.t;
                return bottomSheetDragHandleView.c();
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }
}
