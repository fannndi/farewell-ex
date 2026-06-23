package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j82 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f468a;

    public j82(View view) {
        this.f468a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f468a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f468a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f468a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(l82 l82Var) {
        View view = (View) this.f468a.get();
        if (view != null) {
            if (l82Var != null) {
                view.animate().setListener(new r1(l82Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f468a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
