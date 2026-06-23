package defpackage;

import android.view.View;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class gw1 extends te1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public gw1(View view) {
        super(view);
        this.A = (TextView) view.findViewById(R.id.pid);
        this.B = (TextView) view.findViewById(R.id.proc_name);
        this.C = (TextView) view.findViewById(R.id.proc_state);
        this.D = (TextView) view.findViewById(R.id.proc_threads);
        this.E = (TextView) view.findViewById(R.id.proc_cpu);
        this.F = (TextView) view.findViewById(R.id.proc_mem);
        view.setImportantForAccessibility(2);
    }
}
