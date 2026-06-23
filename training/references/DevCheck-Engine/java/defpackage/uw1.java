package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.temperature.helpers.GlowCardView;

/* loaded from: classes.dex */
public final class uw1 extends te1 {
    public final GlowCardView A;
    public final TextView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final LinearLayout F;
    public final TextView G;
    public final ProgressBar H;
    public final /* synthetic */ xw1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(xw1 xw1Var, View view) {
        super(view);
        this.I = xw1Var;
        this.A = (GlowCardView) view;
        this.B = (TextView) view.findViewById(R.id.banner_title);
        this.C = (TextView) view.findViewById(R.id.banner_message);
        this.D = (ImageView) view.findViewById(R.id.banner_icon);
        this.E = (TextView) view.findViewById(R.id.banner_android_status);
        this.F = (LinearLayout) view.findViewById(R.id.banner_headroom_row);
        this.G = (TextView) view.findViewById(R.id.headroom_value_label);
        this.H = (ProgressBar) view.findViewById(R.id.headroom_bar);
    }
}
