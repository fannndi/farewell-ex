package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import defpackage.a5;
import defpackage.c3;
import defpackage.my0;
import flar2.devcheck.R;
import flar2.devcheck.tests.MultiTouchActivity;

/* loaded from: classes.dex */
public class MultiTouchActivity extends a5 {
    public static int H;
    public static int I;
    public static int J;
    public static String K;
    public View F;
    public my0 G;

    public final void B() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = getResources().getConfiguration().orientation;
            int i2 = displayMetrics.heightPixels;
            if (i == 1) {
                H = i2;
                I = displayMetrics.widthPixels;
            } else {
                H = i2;
                I = displayMetrics.widthPixels;
            }
        } catch (Exception unused) {
            H = displayMetrics.heightPixels;
            I = displayMetrics.widthPixels;
        }
        J = displayMetrics.densityDpi;
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        B();
        this.G.invalidate();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(5126);
        getWindow().setBackgroundDrawable(getDrawable(R.drawable.app_background_dark));
        B();
        K = getString(R.string.touch_message);
        getString(R.string.number_touches);
        setContentView(R.layout.activity_multitouch);
        this.F = findViewById(R.id.buttons);
        this.G = new my0(this, this);
        ((FrameLayout) findViewById(R.id.container)).addView(this.G);
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        final int i = 0;
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: ny0
            public final /* synthetic */ MultiTouchActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                MultiTouchActivity multiTouchActivity = this.h;
                switch (i2) {
                    case 0:
                        int i3 = MultiTouchActivity.H;
                        sharedPreferences2.edit().putBoolean(multiTouchActivity.getString(R.string.multitouch), true).commit();
                        multiTouchActivity.finish();
                        break;
                    default:
                        int i4 = MultiTouchActivity.H;
                        sharedPreferences2.edit().putBoolean(multiTouchActivity.getString(R.string.multitouch), false).commit();
                        multiTouchActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: ny0
            public final /* synthetic */ MultiTouchActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                MultiTouchActivity multiTouchActivity = this.h;
                switch (i22) {
                    case 0:
                        int i3 = MultiTouchActivity.H;
                        sharedPreferences2.edit().putBoolean(multiTouchActivity.getString(R.string.multitouch), true).commit();
                        multiTouchActivity.finish();
                        break;
                    default:
                        int i4 = MultiTouchActivity.H;
                        sharedPreferences2.edit().putBoolean(multiTouchActivity.getString(R.string.multitouch), false).commit();
                        multiTouchActivity.finish();
                        break;
                }
            }
        });
    }
}
