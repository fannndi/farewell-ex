package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class r10 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ x10 i;

    public /* synthetic */ r10(x10 x10Var, ArrayList arrayList, int i) {
        this.g = i;
        this.i = x10Var;
        this.h = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.g;
        int i2 = 0;
        ArrayList arrayList = this.h;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    x10 x10Var = this.i;
                    if (i2 >= size) {
                        arrayList.clear();
                        x10Var.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        w10 w10Var = (w10) obj;
                        te1 te1Var = w10Var.f1106a;
                        int i3 = w10Var.b;
                        int i4 = w10Var.c;
                        int i5 = w10Var.d;
                        int i6 = w10Var.e;
                        x10Var.getClass();
                        View view = te1Var.g;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        x10Var.p.add(te1Var);
                        animate.setDuration(x10Var.e).setListener(new t10(x10Var, te1Var, i7, view, i8, animate)).start();
                    }
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int size2 = arrayList.size();
                while (true) {
                    x10 x10Var2 = this.i;
                    if (i2 >= size2) {
                        arrayList.clear();
                        x10Var2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        v10 v10Var = (v10) obj2;
                        ArrayList arrayList2 = x10Var2.r;
                        long j = x10Var2.f;
                        te1 te1Var2 = v10Var.f1063a;
                        View view2 = te1Var2 == null ? null : te1Var2.g;
                        te1 te1Var3 = v10Var.b;
                        View view3 = te1Var3 != null ? te1Var3.g : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(v10Var.f1063a);
                            duration.translationX(v10Var.e - v10Var.c);
                            duration.translationY(v10Var.f - v10Var.d);
                            duration.alpha(0.0f).setListener(new u10(x10Var2, v10Var, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(v10Var.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new u10(x10Var2, v10Var, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    x10 x10Var3 = this.i;
                    if (i2 >= size3) {
                        arrayList.clear();
                        x10Var3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        te1 te1Var4 = (te1) obj3;
                        x10Var3.getClass();
                        View view4 = te1Var4.g;
                        ViewPropertyAnimator animate3 = view4.animate();
                        x10Var3.o.add(te1Var4);
                        animate3.alpha(1.0f).setDuration(x10Var3.c).setListener(new s10(x10Var3, te1Var4, view4, animate3)).start();
                    }
                }
        }
    }
}
