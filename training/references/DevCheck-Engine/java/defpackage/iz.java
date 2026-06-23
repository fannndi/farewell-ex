package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class iz extends tv0 {
    public final RectF s;

    public iz(cn1 cn1Var, RectF rectF) {
        super(cn1Var);
        this.s = rectF;
    }

    public iz(iz izVar) {
        super(izVar);
        this.s = izVar.s;
    }

    @Override // defpackage.tv0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        jz jzVar = new jz(this);
        jzVar.N = this;
        jzVar.invalidateSelf();
        return jzVar;
    }
}
