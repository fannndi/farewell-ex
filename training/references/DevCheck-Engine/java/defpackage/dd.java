package defpackage;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class dd extends rp {
    public Matrix k;
    public Matrix l;
    public it0 m;
    public it0 n;
    public float o;
    public float p;
    public float q;
    public fd r;
    public VelocityTracker s;
    public long t;
    public it0 u;
    public it0 v;
    public float w;
    public float x;

    public static float d(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final it0 a(float f, float f2) {
        i82 viewPortHandler = ((cd) this.j).getViewPortHandler();
        float f3 = f - viewPortHandler.b.left;
        b();
        return it0.b(f3, -((r0.getMeasuredHeight() - f2) - viewPortHandler.j()));
    }

    public final void b() {
        fd fdVar = this.r;
        mp mpVar = this.j;
        if (fdVar == null) {
            cd cdVar = (cd) mpVar;
            cdVar.b0.getClass();
            cdVar.c0.getClass();
        }
        if (this.r != null) {
            ((cd) mpVar).j();
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.l.set(this.k);
        it0 it0Var = this.m;
        it0Var.h = motionEvent.getX();
        it0Var.i = motionEvent.getY();
        cd cdVar = (cd) this.j;
        fj0 c = cdVar.c(motionEvent.getX(), motionEvent.getY());
        this.r = c != null ? (fd) ((ed) cdVar.h).e(c.e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        cd cdVar = (cd) this.j;
        cdVar.getOnChartGestureListener();
        if (cdVar.L && ((ed) cdVar.getData()).g() > 0) {
            it0 a2 = a(motionEvent.getX(), motionEvent.getY());
            float f = cdVar.P ? 1.4f : 1.0f;
            float f2 = cdVar.Q ? 1.4f : 1.0f;
            float f3 = a2.h;
            float f4 = a2.i;
            i82 i82Var = cdVar.x;
            Matrix matrix = cdVar.j0;
            i82Var.getClass();
            matrix.reset();
            matrix.set(i82Var.f417a);
            matrix.postScale(f, f2, f3, -f4);
            cdVar.x.k(matrix, cdVar, false);
            cdVar.a();
            cdVar.postInvalidate();
            boolean z = cdVar.g;
            it0.d(a2);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ((cd) this.j).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((cd) this.j).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mp mpVar = this.j;
        cd cdVar = (cd) mpVar;
        cdVar.getOnChartGestureListener();
        if (!cdVar.i) {
            return false;
        }
        fj0 c = cdVar.c(motionEvent.getX(), motionEvent.getY());
        if (c == null || c.a(this.h)) {
            mpVar.d(null);
            this.h = null;
        } else {
            mpVar.d(c);
            this.h = c;
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        fj0 c;
        VelocityTracker velocityTracker;
        Matrix matrix = this.l;
        it0 it0Var = this.v;
        it0 it0Var2 = this.u;
        it0 it0Var3 = this.n;
        it0 it0Var4 = this.m;
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.g == 0) {
            this.i.onTouchEvent(motionEvent);
        }
        mp mpVar = this.j;
        cd cdVar = (cd) mpVar;
        if (!cdVar.N && !cdVar.O && !cdVar.P && !cdVar.Q) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.s;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, n52.c);
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > n52.b || Math.abs(yVelocity) > n52.b) && this.g == 1 && cdVar.j) {
                    it0Var.h = 0.0f;
                    it0Var.i = 0.0f;
                    this.t = AnimationUtils.currentAnimationTimeMillis();
                    it0Var2.h = motionEvent.getX();
                    it0Var2.i = motionEvent.getY();
                    it0Var.h = xVelocity;
                    it0Var.i = yVelocity;
                    mpVar.postInvalidateOnAnimation();
                }
                int i2 = this.g;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    cdVar.a();
                    cdVar.postInvalidate();
                }
                this.g = 0;
                ViewParent parent = cdVar.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.s = null;
                }
                mpVar.getOnChartGestureListener();
            } else if (action == 2) {
                int i3 = this.g;
                if (i3 == 1) {
                    ViewParent parent2 = cdVar.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    float x = cdVar.N ? motionEvent.getX() - it0Var4.h : 0.0f;
                    float y = cdVar.O ? motionEvent.getY() - it0Var4.i : 0.0f;
                    this.k.set(matrix);
                    ((cd) mpVar).getOnChartGestureListener();
                    b();
                    this.k.postTranslate(x, y);
                } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                    ViewParent parent3 = cdVar.getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                    if ((cdVar.P || cdVar.Q) && motionEvent.getPointerCount() >= 2) {
                        cdVar.getOnChartGestureListener();
                        float d = d(motionEvent);
                        if (d > this.x) {
                            it0 a2 = a(it0Var3.h, it0Var3.i);
                            i82 viewPortHandler = cdVar.getViewPortHandler();
                            int i4 = this.g;
                            if (i4 == 4) {
                                float f = d / this.q;
                                boolean z = f < 1.0f;
                                boolean z2 = !z ? viewPortHandler.i >= viewPortHandler.h : viewPortHandler.i <= viewPortHandler.g;
                                if (!z ? viewPortHandler.j < viewPortHandler.f : viewPortHandler.j > viewPortHandler.e) {
                                    i = 1;
                                }
                                float f2 = cdVar.P ? f : 1.0f;
                                float f3 = cdVar.Q ? f : 1.0f;
                                if (i != 0 || z2) {
                                    this.k.set(matrix);
                                    this.k.postScale(f2, f3, a2.h, a2.i);
                                }
                            } else if (i4 == 2 && cdVar.P) {
                                float abs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.o;
                                if (abs >= 1.0f ? viewPortHandler.i < viewPortHandler.h : viewPortHandler.i > viewPortHandler.g) {
                                    this.k.set(matrix);
                                    this.k.postScale(abs, 1.0f, a2.h, a2.i);
                                }
                            } else if (i4 == 3 && cdVar.Q) {
                                float abs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.p;
                                if (abs2 >= 1.0f ? viewPortHandler.j < viewPortHandler.f : viewPortHandler.j > viewPortHandler.e) {
                                    this.k.set(matrix);
                                    this.k.postScale(1.0f, abs2, a2.h, a2.i);
                                }
                            }
                            it0.d(a2);
                        }
                    }
                } else if (i3 == 0) {
                    float x2 = motionEvent.getX() - it0Var4.h;
                    float y2 = motionEvent.getY() - it0Var4.i;
                    if (Math.abs((float) Math.sqrt((y2 * y2) + (x2 * x2))) > this.w && (cdVar.N || cdVar.O)) {
                        i82 i82Var = cdVar.x;
                        if (i82Var.b() && i82Var.c()) {
                            i82 i82Var2 = cdVar.x;
                            if (i82Var2.l <= 0.0f && i82Var2.m <= 0.0f) {
                                boolean z3 = cdVar.M;
                                if (z3 && z3 && (c = cdVar.c(motionEvent.getX(), motionEvent.getY())) != null && !c.a(this.h)) {
                                    this.h = c;
                                    cdVar.d(c);
                                }
                            }
                        }
                        float abs3 = Math.abs(motionEvent.getX() - it0Var4.h);
                        float abs4 = Math.abs(motionEvent.getY() - it0Var4.i);
                        if ((cdVar.N || abs4 >= abs3) && (cdVar.O || abs4 <= abs3)) {
                            this.g = 1;
                        }
                    }
                }
            } else if (action == 3) {
                this.g = 0;
                mpVar.getOnChartGestureListener();
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker4 = this.s;
                    velocityTracker4.computeCurrentVelocity(1000, n52.c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float xVelocity2 = velocityTracker4.getXVelocity(pointerId2);
                    float yVelocity2 = velocityTracker4.getYVelocity(pointerId2);
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i >= pointerCount) {
                            break;
                        }
                        if (i != actionIndex) {
                            int pointerId3 = motionEvent.getPointerId(i);
                            if ((velocityTracker4.getYVelocity(pointerId3) * yVelocity2) + (velocityTracker4.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                velocityTracker4.clear();
                                break;
                            }
                        }
                        i++;
                    }
                    this.g = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent4 = cdVar.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(true);
                }
                c(motionEvent);
                this.o = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.p = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float d2 = d(motionEvent);
                this.q = d2;
                if (d2 > 10.0f) {
                    if (cdVar.K) {
                        this.g = 4;
                    } else {
                        boolean z4 = cdVar.P;
                        if (z4 != cdVar.Q) {
                            this.g = z4 ? 2 : 3;
                        } else {
                            this.g = this.o > this.p ? 2 : 3;
                        }
                    }
                }
                float x3 = motionEvent.getX(1) + motionEvent.getX(0);
                float y3 = motionEvent.getY(1) + motionEvent.getY(0);
                it0Var3.h = x3 / 2.0f;
                it0Var3.i = y3 / 2.0f;
            }
        } else {
            mpVar.getOnChartGestureListener();
            it0Var.h = 0.0f;
            it0Var.i = 0.0f;
            c(motionEvent);
        }
        i82 viewPortHandler2 = cdVar.getViewPortHandler();
        Matrix matrix2 = this.k;
        viewPortHandler2.k(matrix2, mpVar, true);
        this.k = matrix2;
        return true;
    }
}
