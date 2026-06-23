package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class lz0 extends xz0 implements View.OnClickListener {
    public TextView A;
    public ImageView B;
    public vy0 C;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.C.k(b());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
