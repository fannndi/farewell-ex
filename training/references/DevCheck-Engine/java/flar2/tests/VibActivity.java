package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.c3;
import defpackage.op0;
import defpackage.pr;
import defpackage.sl;
import defpackage.uz1;
import flar2.devcheck.R;
import flar2.devcheck.tests.VibActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public class VibActivity extends a5 {
    public static final /* synthetic */ int H = 0;
    public Vibrator F;
    public ImageView G;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_flashlight);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.vibration));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        ImageView imageView = (ImageView) findViewById(R.id.big_icon);
        this.G = imageView;
        imageView.setImageDrawable(getDrawable(R.drawable.ic_big_vibration));
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: i62
            public final /* synthetic */ VibActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                VibActivity vibActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = VibActivity.H;
                        sharedPreferences2.edit().putBoolean(vibActivity.getString(R.string.vibration), true).commit();
                        vibActivity.finish();
                        break;
                    default:
                        int i5 = VibActivity.H;
                        sharedPreferences2.edit().putBoolean(vibActivity.getString(R.string.vibration), false).commit();
                        vibActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: i62
            public final /* synthetic */ VibActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                VibActivity vibActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = VibActivity.H;
                        sharedPreferences2.edit().putBoolean(vibActivity.getString(R.string.vibration), true).commit();
                        vibActivity.finish();
                        break;
                    default:
                        int i5 = VibActivity.H;
                        sharedPreferences2.edit().putBoolean(vibActivity.getString(R.string.vibration), false).commit();
                        vibActivity.finish();
                        break;
                }
            }
        });
        this.F = (Vibrator) getSystemService("vibrator");
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        Vibrator vibrator = this.F;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.F != null) {
            this.G.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake));
            this.G.setImageTintList(ColorStateList.valueOf(uz1.R(this)));
            this.F.vibrate(new long[]{400, 60, 400, 500}, 0);
        }
    }
}
