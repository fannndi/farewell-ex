package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class kz0 extends xz0 implements View.OnClickListener {
    public final ImageView A;
    public final TextView B;
    public oz0 C;

    public kz0(View view) {
        super(view);
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.header_hide_card);
        this.B = (TextView) view.findViewById(R.id.header_hide_title);
        this.A = (ImageView) view.findViewById(R.id.header_hide_arrow);
        materialCardView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.C.k(b());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
