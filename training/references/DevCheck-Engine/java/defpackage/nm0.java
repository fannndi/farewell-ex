package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nm0 extends dn2 {
    public final View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public nm0(View view) {
        this.b = view;
    }

    @Override // defpackage.dn2
    public final void a(ma2 ma2Var) {
        this.b.setTranslationY(0.0f);
    }

    @Override // defpackage.dn2
    public final void b(ma2 ma2Var) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // defpackage.dn2
    public final gb2 c(gb2 gb2Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((ma2) it.next()).f621a.d() & 8) != 0) {
                this.b.setTranslationY(o4.c(this.d, r0.f621a.c(), 0));
                break;
            }
        }
        return gb2Var;
    }

    @Override // defpackage.dn2
    public final zf d(ma2 ma2Var, zf zfVar) {
        View view = this.b;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return zfVar;
    }
}
