package defpackage;

import android.view.ViewGroup;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d12 {

    /* renamed from: a, reason: collision with root package name */
    public static final xa f165a = new xa();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, z02 z02Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (z02Var == null) {
            z02Var = f165a;
        }
        z02 clone = z02Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((z02) obj).x(viewGroup);
            }
        }
        clone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            rw.b();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        c12 c12Var = new c12();
        c12Var.g = clone;
        c12Var.h = viewGroup;
        viewGroup.addOnAttachStateChangeListener(c12Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(c12Var);
    }

    public static p9 b() {
        p9 p9Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (p9Var = (p9) weakReference.get()) != null) {
            return p9Var;
        }
        p9 p9Var2 = new p9(0);
        threadLocal.set(new WeakReference(p9Var2));
        return p9Var2;
    }
}
