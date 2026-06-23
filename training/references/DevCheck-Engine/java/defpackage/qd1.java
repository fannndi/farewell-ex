package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qd1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ RecyclerView h;

    public /* synthetic */ qd1(RecyclerView recyclerView, int i) {
        this.g = i;
        this.h = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.g;
        RecyclerView recyclerView = this.h;
        switch (i) {
            case 0:
                if (recyclerView.A && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.y) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.D) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.C = true;
                        break;
                    }
                }
                break;
            default:
                zd1 zd1Var = recyclerView.S;
                if (zd1Var != null) {
                    x10 x10Var = (x10) zd1Var;
                    long j = x10Var.d;
                    ArrayList arrayList = x10Var.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = x10Var.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = x10Var.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = x10Var.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            te1 te1Var = (te1) obj;
                            View view = te1Var.g;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            x10Var.q.add(te1Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new s10(x10Var, te1Var, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            x10Var.m.add(arrayList6);
                            arrayList2.clear();
                            r10 r10Var = new r10(x10Var, arrayList6, 0);
                            if (z2) {
                                r10Var.run();
                            } else {
                                View view2 = ((w10) arrayList6.get(0)).f1106a.g;
                                WeakHashMap weakHashMap = y62.f1215a;
                                view2.postOnAnimationDelayed(r10Var, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            x10Var.n.add(arrayList7);
                            arrayList3.clear();
                            r10 r10Var2 = new r10(x10Var, arrayList7, 1);
                            if (z2) {
                                r10Var2.run();
                            } else {
                                View view3 = ((v10) arrayList7.get(0)).f1063a.g;
                                WeakHashMap weakHashMap2 = y62.f1215a;
                                view3.postOnAnimationDelayed(r10Var2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            x10Var.l.add(arrayList8);
                            arrayList4.clear();
                            r10 r10Var3 = new r10(x10Var, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? x10Var.e : 0L, isEmpty3 ? 0L : x10Var.f) + j;
                                z = false;
                                View view4 = ((te1) arrayList8.get(0)).g;
                                WeakHashMap weakHashMap3 = y62.f1215a;
                                view4.postOnAnimationDelayed(r10Var3, max);
                                recyclerView.t0 = z;
                                break;
                            } else {
                                r10Var3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.t0 = z;
        }
    }
}
