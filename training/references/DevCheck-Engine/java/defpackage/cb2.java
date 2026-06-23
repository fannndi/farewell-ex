package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* loaded from: classes.dex */
public final class cb2 extends bb2 {
    public cb2(gb2 gb2Var, WindowInsets windowInsets) {
        super(gb2Var, windowInsets);
    }

    @Override // defpackage.va2, defpackage.db2
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(fb2.a(i));
        return boundingRects;
    }

    @Override // defpackage.va2, defpackage.db2
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(fb2.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.va2, defpackage.db2
    public void p() {
    }
}
