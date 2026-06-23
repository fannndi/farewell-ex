package defpackage;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ie0 {

    /* renamed from: a, reason: collision with root package name */
    public cu f424a;
    public he0 b;
    public pd1 c;
    public ViewPager2 d;
    public long e = -1;
    public final /* synthetic */ ju1 f;

    public ie0(ju1 ju1Var) {
        this.f = ju1Var;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        rw.n(yFbVsaLCWAtQC.cAdXmhlrH, parent);
        return null;
    }

    public final void b(boolean z) {
        int currentItem;
        ld0 ld0Var;
        ju1 ju1Var = this.f;
        ArrayList arrayList = ju1Var.m;
        h70 h70Var = ju1Var.j;
        ft0 ft0Var = ju1Var.f;
        ae0 ae0Var = ju1Var.e;
        if (ae0Var.M() || this.d.getScrollState() != 0 || ft0Var.g() == 0 || arrayList.size() == 0 || (currentItem = this.d.getCurrentItem()) >= arrayList.size()) {
            return;
        }
        long j = currentItem;
        if ((j != this.e || z) && (ld0Var = (ld0) ft0Var.b(j)) != null && ld0Var.G()) {
            this.e = j;
            ae0Var.getClass();
            yb ybVar = new yb(ae0Var);
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            ld0 ld0Var2 = null;
            for (int i2 = 0; i2 < ft0Var.g(); i2++) {
                long d = ft0Var.d(i2);
                ld0 ld0Var3 = (ld0) ft0Var.h(i2);
                if (ld0Var3.G()) {
                    if (d != this.e) {
                        ybVar.l(ld0Var3, yp0.j);
                        h70Var.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = ((CopyOnWriteArrayList) h70Var.g).iterator();
                        if (it.hasNext()) {
                            throw d51.l(it);
                        }
                        arrayList2.add(arrayList3);
                    } else {
                        ld0Var2 = ld0Var3;
                    }
                    ld0Var3.o0(d == this.e);
                }
            }
            if (ld0Var2 != null) {
                ybVar.l(ld0Var2, yp0.k);
                h70Var.getClass();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = ((CopyOnWriteArrayList) h70Var.g).iterator();
                if (it2.hasNext()) {
                    throw d51.l(it2);
                }
                arrayList2.add(arrayList4);
            }
            if (ybVar.c.isEmpty()) {
                return;
            }
            ybVar.f();
            Collections.reverse(arrayList2);
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                h70Var.getClass();
                h70.m((List) obj);
            }
        }
    }
}
