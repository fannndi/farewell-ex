package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class t81 extends ae1 {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f971a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ u81 d;

    public t81(u81 u81Var) {
        this.d = u81Var;
    }

    @Override // defpackage.ae1
    public final void c(Rect rect, View view, RecyclerView recyclerView) {
        if (f(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.ae1
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (this.f971a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (f(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f971a.setBounds(0, height, width, this.b + height);
                this.f971a.draw(canvas);
            }
        }
    }

    public final boolean f(View view, RecyclerView recyclerView) {
        te1 M = recyclerView.M(view);
        if (!(M instanceof c91) || !((c91) M).E) {
            return false;
        }
        boolean z = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        te1 M2 = recyclerView.M(recyclerView.getChildAt(indexOfChild + 1));
        return (M2 instanceof c91) && ((c91) M2).D;
    }
}
