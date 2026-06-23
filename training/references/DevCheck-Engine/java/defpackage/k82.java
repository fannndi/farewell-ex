package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k82 {
    public Interpolator c;
    public l82 d;
    public boolean e;
    public long b = -1;
    public final sz1 f = new sz1(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f519a = new ArrayList();

    public final void a() {
        if (this.e) {
            ArrayList arrayList = this.f519a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((j82) obj).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList arrayList = this.f519a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j82 j82Var = (j82) obj;
            long j = this.b;
            if (j >= 0) {
                j82Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) j82Var.f468a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                j82Var.d(this.f);
            }
            View view2 = (View) j82Var.f468a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
