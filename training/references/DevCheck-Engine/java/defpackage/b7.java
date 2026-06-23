package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b7 extends sl {
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ WeakReference w;
    public final /* synthetic */ g7 x;

    public b7(g7 g7Var, int i, int i2, WeakReference weakReference) {
        super(14);
        this.x = g7Var;
        this.u = i;
        this.v = i2;
        this.w = weakReference;
    }

    @Override // defpackage.sl
    public final void T(int i) {
    }

    @Override // defpackage.sl
    public final void U(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.u) != -1) {
            typeface = f7.a(typeface, i, (this.v & 2) != 0);
        }
        g7 g7Var = this.x;
        if (g7Var.m) {
            g7Var.l = typeface;
            TextView textView = (TextView) this.w.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = g7Var.j;
                if (isAttachedToWindow) {
                    textView.post(new c7(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
