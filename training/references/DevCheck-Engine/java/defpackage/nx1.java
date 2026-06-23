package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class nx1 extends je2 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ TextPaint e;
    public final /* synthetic */ je2 f;
    public final /* synthetic */ ox1 g;

    public nx1(ox1 ox1Var, Context context, TextPaint textPaint, je2 je2Var) {
        this.g = ox1Var;
        this.d = context;
        this.e = textPaint;
        this.f = je2Var;
    }

    @Override // defpackage.je2
    public final void L(int i) {
        this.f.L(i);
    }

    @Override // defpackage.je2
    public final void M(Typeface typeface, boolean z) {
        this.g.f(this.d, this.e, typeface);
        this.f.M(typeface, z);
    }
}
