package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class dh0 extends te1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ProgressBar D;

    public dh0(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.tvFreq);
        this.B = (TextView) view.findViewById(R.id.tvTime);
        this.C = (TextView) view.findViewById(R.id.tvPercent);
        this.D = (ProgressBar) view.findViewById(R.id.pbPercent);
    }
}
