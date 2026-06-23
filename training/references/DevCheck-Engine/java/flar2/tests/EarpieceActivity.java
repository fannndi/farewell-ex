package flar2.devcheck.tests;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.n72;
import defpackage.nc;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.tc;
import defpackage.vi0;
import defpackage.vq;
import defpackage.w5;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.tests.EarpieceActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class EarpieceActivity extends a5 {
    public static final /* synthetic */ int R = 0;
    public MediaPlayer F;
    public int G;
    public int H;
    public ImageView I;
    public int J;
    public AudioManager K;
    public Drawable L;
    public Drawable M;
    public w5 N;
    public IntentFilter O;
    public Button P;
    public TextView Q;

    public final void B() {
        List<AudioDeviceInfo> availableCommunicationDevices;
        this.K.setMode(2);
        this.K.setSpeakerphoneOn(false);
        setVolumeControlStream(0);
        AudioAttributes build = new AudioAttributes.Builder().setLegacyStreamType(0).build();
        if (Build.VERSION.SDK_INT >= 31) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            availableCommunicationDevices = this.K.getAvailableCommunicationDevices();
            int size = arrayList.size();
            int i = 0;
            loop0: while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) obj;
                for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
                    if (audioDeviceInfo.getType() == num.intValue()) {
                        this.K.setCommunicationDevice(audioDeviceInfo);
                        break loop0;
                    }
                }
            }
        }
        MediaPlayer mediaPlayer = this.F;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.F.stop();
            }
            this.F.reset();
            this.F.release();
            this.F = null;
        }
        MediaPlayer create = MediaPlayer.create(this, R.raw.mono, build, 1);
        this.F = create;
        create.setLooping(false);
        this.F.start();
        this.I.setImageDrawable(this.L);
        this.I.setImageTintList(ColorStateList.valueOf(this.G));
        this.F.setOnCompletionListener(new vi0(this, 3));
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_earpiece);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.earpiece));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        this.O = new IntentFilter("android.intent.action.HEADSET_PLUG");
        this.N = new w5(10, this);
        this.I = (ImageView) findViewById(R.id.speaker_right);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: e70
            public final /* synthetic */ EarpieceActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                EarpieceActivity earpieceActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = EarpieceActivity.R;
                        sharedPreferences2.edit().putBoolean(earpieceActivity.getString(R.string.earpiece), true).commit();
                        earpieceActivity.finish();
                        break;
                    default:
                        int i5 = EarpieceActivity.R;
                        sharedPreferences2.edit().putBoolean(earpieceActivity.getString(R.string.earpiece), false).commit();
                        earpieceActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: e70
            public final /* synthetic */ EarpieceActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                EarpieceActivity earpieceActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = EarpieceActivity.R;
                        sharedPreferences2.edit().putBoolean(earpieceActivity.getString(R.string.earpiece), true).commit();
                        earpieceActivity.finish();
                        break;
                    default:
                        int i5 = EarpieceActivity.R;
                        sharedPreferences2.edit().putBoolean(earpieceActivity.getString(R.string.earpiece), false).commit();
                        earpieceActivity.finish();
                        break;
                }
            }
        });
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
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
        ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(11, this));
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        this.G = typedValue.data;
        this.H = getColor(R.color.neutral);
        this.L = getDrawable(R.drawable.ic_big_speaker_on);
        this.M = getDrawable(R.drawable.ic_big_speaker_off);
        Button button = (Button) findViewById(R.id.play_again);
        this.P = button;
        button.setOnClickListener(new tc(8, this));
        this.Q = (TextView) findViewById(R.id.connect_headset);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.K = audioManager;
        int streamVolume = audioManager.getStreamVolume(0);
        this.J = streamVolume;
        if (streamVolume < 10) {
            this.K.setStreamVolume(0, 10, 0);
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.F;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.F.stop();
            }
            this.F.reset();
            this.F.release();
            this.F = null;
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        w5 w5Var = this.N;
        if (w5Var != null) {
            unregisterReceiver(w5Var);
        }
        MediaPlayer mediaPlayer = this.F;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.F.stop();
            }
            this.F.reset();
            this.F.release();
            this.F = null;
        }
        this.I.setImageDrawable(this.M);
        this.I.setImageTintList(ColorStateList.valueOf(this.H));
        int i = this.J;
        if (i < 9) {
            this.K.setStreamVolume(0, i, 0);
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        registerReceiver(this.N, this.O);
        if (this.K.getStreamVolume(0) < 9) {
            this.K.setStreamVolume(0, 9, 0);
        }
        B();
    }
}
