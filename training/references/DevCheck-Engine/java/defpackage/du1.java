package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class du1 {

    /* renamed from: a, reason: collision with root package name */
    public final bu1 f208a;
    public final ArrayList b = new ArrayList();
    public mm0 c;
    public mm0 d;
    public int e;

    public du1(ViewGroup viewGroup) {
        View view;
        mm0 mm0Var = mm0.e;
        this.c = mm0Var;
        this.d = mm0Var;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        bu1 bu1Var = new bu1(this, viewGroup.getContext(), viewGroup);
        this.f208a = bu1Var;
        bu1Var.setVisibility(8);
        bu1Var.setWillNotDraw(true);
        c71 c71Var = new c71(6, this);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(bu1Var, c71Var);
        y62.q(bu1Var, new cu1(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(bu1Var, 0);
        } else {
            view.addOnAttachStateChangeListener(new pd0(viewGroup, bu1Var));
        }
    }
}
