package defpackage;

import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class rw1 extends te1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    public rw1(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.sensor_title);
        this.B = (TextView) view.findViewById(R.id.sensor_subtitle);
        this.C = (TextView) view.findViewById(R.id.sensor_details);
    }
}
