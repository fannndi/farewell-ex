package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i01 extends xz0 implements View.OnClickListener {
    public ImageView A;
    public TextView B;
    public TextView C;
    public vy0 D;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.D.k(b());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
