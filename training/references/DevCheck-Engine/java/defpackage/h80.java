package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h80 extends c3 {
    public final g80 j;

    public h80(TextView textView) {
        this.j = new g80(textView);
    }

    @Override // defpackage.c3
    public final void L(boolean z) {
        if (u70.k != null) {
            this.j.L(z);
        }
    }

    @Override // defpackage.c3
    public final void N(boolean z) {
        boolean z2 = u70.k != null;
        g80 g80Var = this.j;
        if (z2) {
            g80Var.N(z);
        } else {
            g80Var.l = z;
        }
    }

    @Override // defpackage.c3
    public final TransformationMethod R(TransformationMethod transformationMethod) {
        return !(u70.k != null) ? transformationMethod : this.j.R(transformationMethod);
    }

    @Override // defpackage.c3
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        return !(u70.k != null) ? inputFilterArr : this.j.r(inputFilterArr);
    }

    @Override // defpackage.c3
    public final boolean t() {
        return this.j.l;
    }
}
