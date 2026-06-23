package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class ep0 extends te1 {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final LinearLayout J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;

    public ep0(View view) {
        super(view);
        this.A = (ImageView) view.findViewById(R.id.image_icon);
        this.B = (TextView) view.findViewById(R.id.text_name);
        this.C = (TextView) view.findViewById(R.id.badge_router);
        this.D = (TextView) view.findViewById(R.id.badge_self);
        this.E = (TextView) view.findViewById(R.id.badge_access_point);
        this.F = (TextView) view.findViewById(R.id.text_ip);
        this.G = (TextView) view.findViewById(R.id.text_latency);
        this.H = (TextView) view.findViewById(R.id.text_type);
        this.I = (TextView) view.findViewById(R.id.text_vendor_mac);
        this.J = (LinearLayout) view.findViewById(R.id.layout_services);
        this.K = (TextView) view.findViewById(R.id.chip_webui);
        this.L = (TextView) view.findViewById(R.id.chip_upnp);
        this.M = (TextView) view.findViewById(R.id.chip_bonjour);
        this.N = (TextView) view.findViewById(R.id.chip_smb);
    }

    public static boolean r(TextView textView, boolean z) {
        if (z) {
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(8);
        return false;
    }
}
