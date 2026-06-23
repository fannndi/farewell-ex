package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class k01 extends xz0 implements View.OnClickListener {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public vy0 E;

    public k01(View view) {
        super(view);
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.item_card);
        this.A = (ImageView) view.findViewById(R.id.item_icon);
        this.B = (TextView) view.findViewById(R.id.item_title);
        this.C = (TextView) view.findViewById(R.id.item_summary);
        this.D = (TextView) view.findViewById(R.id.item_summary2);
        materialCardView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.E.k(b());
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
    }
}
