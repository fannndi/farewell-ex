package defpackage;

import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class g01 extends xz0 {
    public final TextView A;
    public final TextView B;

    public g01(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.item_title);
        this.B = (TextView) view.findViewById(R.id.item_summary);
    }
}
