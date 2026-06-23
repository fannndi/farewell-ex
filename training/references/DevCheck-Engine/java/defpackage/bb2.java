package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class bb2 extends ab2 {
    public static final gb2 w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = gb2.h(null, windowInsets);
    }

    public bb2(gb2 gb2Var, WindowInsets windowInsets) {
        super(gb2Var, windowInsets);
    }

    @Override // defpackage.za2, defpackage.va2, defpackage.db2
    public mm0 h(int i) {
        Insets insets;
        insets = this.c.getInsets(fb2.a(i));
        return mm0.d(insets);
    }

    @Override // defpackage.za2, defpackage.va2, defpackage.db2
    public mm0 i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(fb2.a(i));
        return mm0.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.va2, defpackage.db2
    public void o(View view) {
    }
}
