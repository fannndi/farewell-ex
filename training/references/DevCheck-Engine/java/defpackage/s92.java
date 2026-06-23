package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class s92 extends te1 {
    public final MaterialCardView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final ImageView J;
    public final ImageView K;
    public final ProgressBar L;
    public final View M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final /* synthetic */ t92 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s92(t92 t92Var, View view) {
        super(view);
        this.Q = t92Var;
        this.A = (MaterialCardView) view.findViewById(R.id.item_card);
        this.B = (TextView) view.findViewById(R.id.name);
        this.D = (TextView) view.findViewById(R.id.level);
        this.E = (TextView) view.findViewById(R.id.capabilities);
        this.F = (TextView) view.findViewById(R.id.congestion);
        this.C = (TextView) view.findViewById(R.id.channel);
        this.G = (TextView) view.findViewById(R.id.vendor);
        this.H = (TextView) view.findViewById(R.id.mac);
        this.J = (ImageView) view.findViewById(R.id.current);
        this.L = (ProgressBar) view.findViewById(R.id.signal_bar);
        this.K = (ImageView) view.findViewById(R.id.lock);
        this.M = view.findViewById(R.id.badge_row);
        this.N = (TextView) view.findViewById(R.id.badge_band);
        this.O = (TextView) view.findViewById(R.id.badge_standard);
        this.P = (TextView) view.findViewById(R.id.badge_wps);
        this.I = (TextView) view.findViewById(R.id.distance);
        view.setOnClickListener(new i02(2, this));
    }
}
