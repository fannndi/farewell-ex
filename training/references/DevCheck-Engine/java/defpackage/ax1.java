package defpackage;

import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.temperature.helpers.GlowCardView;

/* loaded from: classes.dex */
public final class ax1 extends te1 {
    public final GlowCardView A;
    public final TextView B;
    public final TextView C;
    public final /* synthetic */ bx1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(bx1 bx1Var, View view) {
        super(view);
        this.D = bx1Var;
        this.A = (GlowCardView) view;
        this.B = (TextView) view.findViewById(R.id.tile_label);
        this.C = (TextView) view.findViewById(R.id.tile_value);
    }
}
