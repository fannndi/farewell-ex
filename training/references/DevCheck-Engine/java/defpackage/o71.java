package defpackage;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o71 extends rp {
    public it0 k;
    public float l;
    public ArrayList m;
    public long n;
    public float o;

    public final void a(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList = this.m;
        float i = ((m71) this.j).i(f, f2);
        n71 n71Var = new n71();
        n71Var.f667a = currentAnimationTimeMillis;
        n71Var.b = i;
        arrayList.add(n71Var);
        for (int size = arrayList.size(); size - 2 > 0 && currentAnimationTimeMillis - ((n71) arrayList.get(0)).f667a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((m71) this.j).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mp mpVar = this.j;
        m71 m71Var = (m71) mpVar;
        m71Var.getOnChartGestureListener();
        if (!m71Var.i) {
            return false;
        }
        fj0 c = m71Var.c(motionEvent.getX(), motionEvent.getY());
        if (c == null || c.a(this.h)) {
            mpVar.d(null);
            this.h = null;
            return true;
        }
        mpVar.d(c);
        this.h = c;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float abs;
        ArrayList arrayList = this.m;
        it0 it0Var = this.k;
        if (!this.i.onTouchEvent(motionEvent)) {
            mp mpVar = this.j;
            m71 m71Var = (m71) mpVar;
            if (m71Var.K) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    mpVar.getOnChartGestureListener();
                    this.o = 0.0f;
                    arrayList.clear();
                    if (m71Var.j) {
                        a(x, y);
                    }
                    this.l = m71Var.i(x, y) - m71Var.getRawRotationAngle();
                    it0Var.h = x;
                    it0Var.i = y;
                } else {
                    if (action == 1) {
                        if (m71Var.j) {
                            this.o = 0.0f;
                            a(x, y);
                            if (arrayList.isEmpty()) {
                                abs = 0.0f;
                            } else {
                                n71 n71Var = (n71) arrayList.get(0);
                                n71 n71Var2 = (n71) d51.m(arrayList, 1);
                                n71 n71Var3 = n71Var;
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    n71Var3 = (n71) arrayList.get(size);
                                    if (n71Var3.b != n71Var2.b) {
                                        break;
                                    }
                                }
                                float f = (n71Var2.f667a - n71Var.f667a) / 1000.0f;
                                if (f == 0.0f) {
                                    f = 0.1f;
                                }
                                boolean z = n71Var2.b >= n71Var3.b;
                                if (Math.abs(r8 - r10) > 270.0d) {
                                    z = !z;
                                }
                                float f2 = n71Var2.b;
                                float f3 = n71Var.b;
                                if (f2 - f3 > 180.0d) {
                                    n71Var.b = (float) (f3 + 360.0d);
                                } else if (f3 - f2 > 180.0d) {
                                    n71Var2.b = (float) (f2 + 360.0d);
                                }
                                abs = Math.abs((n71Var2.b - n71Var.b) / f);
                                if (!z) {
                                    abs = -abs;
                                }
                            }
                            this.o = abs;
                            if (abs != 0.0f) {
                                this.n = AnimationUtils.currentAnimationTimeMillis();
                                DisplayMetrics displayMetrics = n52.f665a;
                                mpVar.postInvalidateOnAnimation();
                            }
                        }
                        ViewParent parent = m71Var.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        this.g = 0;
                        mpVar.getOnChartGestureListener();
                        return true;
                    }
                    if (action == 2) {
                        if (m71Var.j) {
                            a(x, y);
                        }
                        if (this.g == 0) {
                            float f4 = x - it0Var.h;
                            float f5 = y - it0Var.i;
                            if (((float) Math.sqrt((f5 * f5) + (f4 * f4))) > n52.c(8.0f)) {
                                this.g = 6;
                                ViewParent parent2 = m71Var.getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                mpVar.getOnChartGestureListener();
                                return true;
                            }
                        }
                        if (this.g == 6) {
                            m71Var.setRotationAngle(m71Var.i(x, y) - this.l);
                            m71Var.invalidate();
                        }
                        mpVar.getOnChartGestureListener();
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
