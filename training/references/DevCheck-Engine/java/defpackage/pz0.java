package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class pz0 extends xz0 implements View.OnClickListener {
    public final TextView A;
    public final TextView B;
    public oz0 C;

    public pz0(View view) {
        super(view);
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.item_card);
        this.A = (TextView) view.findViewById(R.id.item_title);
        this.B = (TextView) view.findViewById(R.id.item_summary);
        materialCardView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.C.k(b());
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
