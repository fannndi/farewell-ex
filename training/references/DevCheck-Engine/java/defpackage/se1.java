package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class se1 implements Runnable {
    public int g;
    public int h;
    public OverScroller i;
    public Interpolator j;
    public boolean k;
    public boolean l;
    public final /* synthetic */ RecyclerView m;

    public se1(RecyclerView recyclerView) {
        this.m = recyclerView;
        rd1 rd1Var = RecyclerView.P0;
        this.j = rd1Var;
        this.k = false;
        this.l = false;
        this.i = new OverScroller(recyclerView.getContext(), rd1Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.m;
        recyclerView.setScrollState(2);
        this.h = 0;
        this.g = 0;
        Interpolator interpolator = this.j;
        rd1 rd1Var = RecyclerView.P0;
        if (interpolator != rd1Var) {
            this.j = rd1Var;
            this.i = new OverScroller(recyclerView.getContext(), rd1Var);
        }
        this.i.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.k) {
            this.l = true;
            return;
        }
        RecyclerView recyclerView = this.m;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = y62.f1215a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.m;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.P0;
        }
        if (this.j != interpolator) {
            this.j = interpolator;
            this.i = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.h = 0;
        this.g = 0;
        recyclerView.setScrollState(2);
        this.i.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.m;
        int[] iArr = recyclerView.z0;
        if (recyclerView.t == null) {
            recyclerView.removeCallbacks(this);
            this.i.abortAnimation();
            return;
        }
        this.l = false;
        this.k = true;
        recyclerView.p();
        OverScroller overScroller = this.i;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.g;
            int i6 = currY - this.h;
            this.g = currX;
            this.h = currY;
            int o = RecyclerView.o(i5, recyclerView.O, recyclerView.Q, recyclerView.getWidth());
            int o2 = RecyclerView.o(i6, recyclerView.P, recyclerView.R, recyclerView.getHeight());
            int[] iArr2 = recyclerView.z0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(o, o2, 1, iArr2, null)) {
                o -= iArr[0];
                o2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o, o2);
            }
            if (recyclerView.s != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.h0(o, o2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = o - i7;
                int i10 = o2 - i8;
                cr0 cr0Var = recyclerView.t.e;
                if (cr0Var != null && !cr0Var.d && cr0Var.e) {
                    int b = recyclerView.n0.b();
                    if (b == 0) {
                        cr0Var.i();
                    } else if (cr0Var.f151a >= b) {
                        cr0Var.f151a = b - 1;
                        cr0Var.g(i7, i8);
                    } else {
                        cr0Var.g(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = o;
                i2 = o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.v.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.z0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.x(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            cr0 cr0Var2 = recyclerView.t.e;
            if ((cr0Var2 == null || !cr0Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.z();
                        if (recyclerView.O.isFinished()) {
                            recyclerView.O.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.A();
                        if (recyclerView.Q.isFinished()) {
                            recyclerView.Q.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.P.isFinished()) {
                            recyclerView.P.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.N0) {
                    gd gdVar = recyclerView.m0;
                    int[] iArr4 = (int[]) gdVar.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    gdVar.c = 0;
                }
            } else {
                b();
                bg0 bg0Var = recyclerView.l0;
                if (bg0Var != null) {
                    bg0Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                wd1.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        cr0 cr0Var3 = recyclerView.t.e;
        if (cr0Var3 != null && cr0Var3.d) {
            cr0Var3.g(0, 0);
        }
        this.k = false;
        if (!this.l) {
            recyclerView.setScrollState(0);
            recyclerView.p0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = y62.f1215a;
            recyclerView.postOnAnimation(this);
        }
    }
}
