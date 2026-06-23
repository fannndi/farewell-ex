package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class ug0 extends te1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final ProgressBar F;

    public ug0(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.sat_id);
        this.B = (TextView) view.findViewById(R.id.elevation);
        this.C = (TextView) view.findViewById(R.id.azimuth);
        this.D = (TextView) view.findViewById(R.id.snr);
        this.F = (ProgressBar) view.findViewById(R.id.progress);
        this.E = (ImageView) view.findViewById(R.id.flag);
    }
}
