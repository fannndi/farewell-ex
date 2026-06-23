package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.slider.Slider;
import defpackage.a5;
import defpackage.c;
import defpackage.c3;
import defpackage.op0;
import defpackage.pr;
import defpackage.qc;
import defpackage.sl;
import flar2.devcheck.R;
import flar2.devcheck.tests.BrightnessActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public class BrightnessActivity extends a5 {
    public static final /* synthetic */ int F = 0;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        float f;
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_brightness);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.backlight));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        ((ImageView) findViewById(R.id.big_icon)).setImageDrawable(getDrawable(R.drawable.ic_big_brightness));
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: ul
            public final /* synthetic */ BrightnessActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                BrightnessActivity brightnessActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = BrightnessActivity.F;
                        sharedPreferences2.edit().putBoolean(brightnessActivity.getString(R.string.backlight), true).commit();
                        brightnessActivity.finish();
                        break;
                    default:
                        int i5 = BrightnessActivity.F;
                        sharedPreferences2.edit().putBoolean(brightnessActivity.getString(R.string.backlight), false).commit();
                        brightnessActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: ul
            public final /* synthetic */ BrightnessActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                BrightnessActivity brightnessActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = BrightnessActivity.F;
                        sharedPreferences2.edit().putBoolean(brightnessActivity.getString(R.string.backlight), true).commit();
                        brightnessActivity.finish();
                        break;
                    default:
                        int i5 = BrightnessActivity.F;
                        sharedPreferences2.edit().putBoolean(brightnessActivity.getString(R.string.backlight), false).commit();
                        brightnessActivity.finish();
                        break;
                }
            }
        });
        Slider slider = (Slider) findViewById(R.id.brightness_slider);
        slider.setLabelFormatter(new c(12));
        try {
            f = Settings.System.getInt(getContentResolver(), "screen_brightness") / 255.0f;
        } catch (Settings.SettingNotFoundException unused) {
            f = 0.0f;
        }
        if (f >= 0.0f && f <= 1.0f) {
            try {
                slider.setValue(f);
            } catch (IllegalStateException unused2) {
            }
        }
        slider.a(new qc(this, 2));
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        getWindow().setAttributes(attributes);
    }
}
