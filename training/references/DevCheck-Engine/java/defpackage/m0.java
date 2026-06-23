package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class m0 extends ClickableSpan {
    public final int g;
    public final c1 h;
    public final int i;

    public m0(int i, c1 c1Var, int i2) {
        this.g = i;
        this.h = c1Var;
        this.i = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.g);
        this.h.f104a.performAction(this.i, bundle);
    }
}
