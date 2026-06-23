package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q72 {

    /* renamed from: a, reason: collision with root package name */
    public final View f822a;
    public int b;
    public int c;
    public int d;

    public q72(View view) {
        this.f822a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.f822a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = y62.f1215a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
