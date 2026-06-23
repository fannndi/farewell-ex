package flar2.devcheck;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import defpackage.a5;
import defpackage.c3;
import defpackage.i51;
import defpackage.ju0;
import defpackage.sl;
import defpackage.tc;
import defpackage.uz1;
import flar2.devcheck.nativebridge.xm.oWuW;
import java.util.Objects;

/* loaded from: classes.dex */
public class FeedbackActivity extends a5 {
    public static final /* synthetic */ int S = 0;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public EditText R;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_feedback);
        try {
            MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar);
            A(materialToolbar);
            sl r = r();
            Objects.requireNonNull(r);
            r.j0(true);
            if (uz1.d(this)) {
                materialToolbar.setPopupTheme(R.style.MyPopupMenuStyleDark);
            }
            r().m0(getString(R.string.report));
        } catch (Exception unused) {
        }
        this.R = (EditText) findViewById(R.id.feedback_text);
        if (uz1.d(this)) {
            this.R.setBackground(getDrawable(R.drawable.edittext_background_dark));
        }
        this.F = (TextView) findViewById(R.id.phone_model);
        this.G = (TextView) findViewById(R.id.android_version);
        this.L = (TextView) findViewById(R.id.manufacturer);
        this.H = (TextView) findViewById(R.id.model);
        this.I = (TextView) findViewById(R.id.product);
        this.J = (TextView) findViewById(R.id.device);
        this.O = (TextView) findViewById(R.id.board);
        this.K = (TextView) findViewById(R.id.hardware);
        this.N = (TextView) findViewById(R.id.hardware_short);
        this.M = (TextView) findViewById(R.id.soc);
        this.P = (TextView) findViewById(R.id.cpu);
        this.Q = (TextView) findViewById(R.id.bm_version);
        this.F.setText(uz1.A(true));
        this.L.setText(Build.MANUFACTURER);
        this.H.setText(Build.MODEL);
        this.J.setText(Build.DEVICE);
        this.I.setText(Build.PRODUCT);
        this.O.setText(Build.BOARD);
        this.K.setText(ju0.J());
        try {
            this.N.setText(i51.e("prefHardware").replace(getString(R.string.hardware) + ": ", ""));
        } catch (NullPointerException unused2) {
            this.N.setText("NPE");
        }
        try {
            this.M.setText(i51.e(qJTtDWNCVUDjB.DUIouigIufKno));
        } catch (NullPointerException unused3) {
            this.M.setText("NPE");
        }
        try {
            this.P.setText(uz1.z0(uz1.K(UQdsoaJMID.AQv)));
        } catch (NullPointerException unused4) {
            this.P.setText("NPE");
        }
        String str = Build.VERSION.RELEASE;
        this.G.setText(oWuW.olXT + str);
        this.Q.setText("DevCheck 642");
        ((Button) findViewById(R.id.feedback_button)).setOnClickListener(new tc(9, this));
    }
}
