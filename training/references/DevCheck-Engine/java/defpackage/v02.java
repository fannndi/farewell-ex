package defpackage;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class v02 extends h02 {
    @Override // defpackage.h02
    public final void g() {
        i82 i82Var = (i82) this.c;
        Matrix matrix = (Matrix) this.b;
        matrix.reset();
        matrix.postTranslate(i82Var.b.left, i82Var.d - i82Var.j());
    }
}
