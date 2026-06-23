package flar2.devcheck.tests;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
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
import defpackage.pp1;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.tc;
import defpackage.vq;
import defpackage.w5;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.tests.SpeakersActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public class SpeakersActivity extends a5 {
    public static final /* synthetic */ int S = 0;
    public MediaPlayer F;
    public int G;
    public int H;
    public Drawable I;
    public Drawable J;
    public ImageView K;
    public ImageView L;
    public int M;
    public AudioManager N;
    public TextView O;
    public Button P;
    public w5 Q;
    public IntentFilter R;

    public final boolean B() {
        for (AudioDeviceInfo audioDeviceInfo : this.N.getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void C() {
        MediaPlayer mediaPlayer = this.F;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.F.stop();
            }
            this.F.reset();
            this.F.release();
            this.F = null;
        }
        boolean B = B();
        TextView textView = this.O;
        if (B) {
            textView.setVisibility(0);
            this.O.setText(R.string.disconnect_headphones);
            return;
        }
        textView.setVisibility(8);
        MediaPlayer create = MediaPlayer.create(this, R.raw.mono);
        this.F = create;
        create.setLooping(false);
        this.F.start();
        this.K.setImageDrawable(this.I);
        this.K.setImageTintList(ColorStateList.valueOf(this.G));
        this.L.setImageTintList(ColorStateList.valueOf(this.G));
        this.L.setImageDrawable(this.I);
        this.F.setOnCompletionListener(new pp1(this, 0));
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_speakers);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.speakers));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        this.K = (ImageView) findViewById(R.id.speaker_left);
        this.L = (ImageView) findViewById(R.id.speaker_right);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: qp1
            public final /* synthetic */ SpeakersActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                SpeakersActivity speakersActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = SpeakersActivity.S;
                        sharedPreferences2.edit().putBoolean(speakersActivity.getString(R.string.speakers), true).commit();
                        speakersActivity.finish();
                        break;
                    default:
                        int i5 = SpeakersActivity.S;
                        sharedPreferences2.edit().putBoolean(speakersActivity.getString(R.string.speakers), false).commit();
                        speakersActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: qp1
            public final /* synthetic */ SpeakersActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                SpeakersActivity speakersActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = SpeakersActivity.S;
                        sharedPreferences2.edit().putBoolean(speakersActivity.getString(R.string.speakers), true).commit();
                        speakersActivity.finish();
                        break;
                    default:
                        int i5 = SpeakersActivity.S;
                        sharedPreferences2.edit().putBoolean(speakersActivity.getString(R.string.speakers), false).commit();
                        speakersActivity.finish();
                        break;
                }
            }
        });
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        this.G = typedValue.data;
        this.H = getColor(R.color.neutral);
        this.I = getDrawable(R.drawable.ic_big_speaker_on);
        this.J = getDrawable(R.drawable.ic_big_speaker_off);
        Button button = (Button) findViewById(R.id.play_again);
        this.P = button;
        button.setOnClickListener(new tc(27, this));
        this.R = new IntentFilter("android.intent.action.HEADSET_PLUG");
        this.Q = new w5(18, this);
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.N = audioManager;
        int streamVolume = audioManager.getStreamVolume(3);
        this.M = streamVolume;
        if (streamVolume < 7) {
            this.N.setStreamVolume(3, 7, 0);
        }
        this.O = (TextView) findViewById(R.id.connect_headset);
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b != null) {
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(25, this));
        } else {
            c.m("Local and anonymous classes can not be ViewModels");
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
        w5 w5Var = this.Q;
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
        int i = this.M;
        if (i < 7) {
            this.N.setStreamVolume(3, i, 0);
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        registerReceiver(this.Q, this.R);
        if (this.N.getStreamVolume(3) < 7) {
            this.N.setStreamVolume(3, 7, 0);
        }
        C();
    }
}
