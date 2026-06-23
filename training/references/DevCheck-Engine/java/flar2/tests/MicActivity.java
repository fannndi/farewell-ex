package flar2.devcheck.tests;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import android.os.Bundle;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.imn.iivisu.RecorderVisualizer;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.jv;
import defpackage.n72;
import defpackage.nc;
import defpackage.od1;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.tc;
import defpackage.uz1;
import defpackage.vq;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.tests.MicActivity;
import java.util.Objects;
import java.util.Timer;

/* loaded from: classes.dex */
public class MicActivity extends a5 {
    public static final /* synthetic */ int K = 0;
    public ImageView F;
    public int G;
    public int H;
    public od1 I;
    public RecorderVisualizer J;

    public final void B() {
        Context applicationContext = getApplicationContext();
        String str = GFUHKHDfiFuPm.uCXyEVlRvCfod;
        if (pr.g(applicationContext, str) != 0) {
            requestPermissions(new String[]{str}, 323);
            return;
        }
        od1 od1Var = new od1();
        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
        try {
            AudioRecord audioRecord = new AudioRecord(1, 44100, 16, 2, minBufferSize);
            od1Var.f728a = audioRecord;
            od1Var.d = NoiseSuppressor.create(audioRecord.getAudioSessionId());
            if (od1Var.f728a.getState() == 1) {
                od1Var.c = minBufferSize;
            }
        } catch (Exception unused) {
        }
        this.I = od1Var;
        od1Var.e = this;
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_mic);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.relativeLayout);
        if (constraintLayout != null) {
            op0.a(constraintLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i2 = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.mic));
        final int i3 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        this.F = (ImageView) findViewById(R.id.big_icon);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: px0
            public final /* synthetic */ MicActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                MicActivity micActivity = this.h;
                switch (i4) {
                    case 0:
                        int i5 = MicActivity.K;
                        sharedPreferences2.edit().putBoolean(micActivity.getString(R.string.mic), true).commit();
                        micActivity.finish();
                        break;
                    default:
                        int i6 = MicActivity.K;
                        sharedPreferences2.edit().putBoolean(micActivity.getString(R.string.mic), false).commit();
                        micActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: px0
            public final /* synthetic */ MicActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                MicActivity micActivity = this.h;
                switch (i4) {
                    case 0:
                        int i5 = MicActivity.K;
                        sharedPreferences2.edit().putBoolean(micActivity.getString(R.string.mic), true).commit();
                        micActivity.finish();
                        break;
                    default:
                        int i6 = MicActivity.K;
                        sharedPreferences2.edit().putBoolean(micActivity.getString(R.string.mic), false).commit();
                        micActivity.finish();
                        break;
                }
            }
        });
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, i3);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(16, this));
        this.G = getColor(R.color.neutral);
        this.H = uz1.R(this);
        this.J = (RecorderVisualizer) findViewById(R.id.visualizer);
        try {
            i = getResources().getConfiguration().screenWidthDp;
        } catch (NullPointerException unused) {
            i = 300;
        }
        View findViewById = findViewById(R.id.center);
        View findViewById2 = findViewById(R.id.test_buttons);
        try {
            jv jvVar = new jv(this.J.getLayoutParams());
            jvVar.setMargins(uz1.l(this, 15.0f), 0, uz1.l(this, 45 - i), 0);
            jvVar.j = findViewById.getId();
            jvVar.k = findViewById2.getId();
            this.J.setLayoutParams(jvVar);
        } catch (Exception unused2) {
        }
        this.F.setOnClickListener(new tc(17, this));
        B();
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onDestroy() {
        od1 od1Var = this.I;
        if (od1Var != null) {
            if (od1Var.b) {
                od1Var.b = false;
                Timer timer = od1Var.f;
                if (timer != null) {
                    timer.cancel();
                }
            }
            try {
                od1 od1Var2 = this.I;
                od1Var2.b = false;
                Timer timer2 = od1Var2.f;
                if (timer2 != null) {
                    timer2.cancel();
                }
                od1Var2.f728a.release();
                od1Var2.f728a = null;
                od1Var2.f = null;
            } catch (NullPointerException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        od1 od1Var = this.I;
        if (od1Var != null && od1Var.b) {
            this.F.setImageResource(R.drawable.ic_big_mic_off);
            this.F.setImageTintList(ColorStateList.valueOf(this.G));
            od1 od1Var2 = this.I;
            od1Var2.b = false;
            Timer timer = od1Var2.f;
            if (timer != null) {
                timer.cancel();
            }
        }
        super.onPause();
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 323 || iArr.length <= 0) {
            return;
        }
        if (iArr[0] == 0) {
            B();
        } else {
            Toast.makeText(this, R.string.permission_denied, 0).show();
        }
    }
}
