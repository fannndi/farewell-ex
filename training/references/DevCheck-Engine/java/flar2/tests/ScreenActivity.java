package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import defpackage.a5;
import defpackage.c3;
import defpackage.tc;
import flar2.devcheck.R;
import flar2.devcheck.tests.ScreenActivity;

/* loaded from: classes.dex */
public class ScreenActivity extends a5 {
    public static final int[] K = {-16777216, -16777216, -1, -65536, -16711936, -16776961, -16777216};
    public View F;
    public View G;
    public View H;
    public TextView I;
    public int J = 0;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_screen);
        getWindow().getDecorView().setSystemUiVisibility(5126);
        this.G = findViewById(R.id.container);
        this.F = findViewById(R.id.message);
        this.H = findViewById(R.id.button_layout);
        this.I = (TextView) findViewById(R.id.working_msg);
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        final int i = 0;
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: ok1
            public final /* synthetic */ ScreenActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ScreenActivity screenActivity = this.h;
                switch (i2) {
                    case 0:
                        int[] iArr = ScreenActivity.K;
                        sharedPreferences2.edit().putBoolean(screenActivity.getString(R.string.display), true).commit();
                        screenActivity.finish();
                        break;
                    default:
                        int[] iArr2 = ScreenActivity.K;
                        sharedPreferences2.edit().putBoolean(screenActivity.getString(R.string.display), false).commit();
                        screenActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: ok1
            public final /* synthetic */ ScreenActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ScreenActivity screenActivity = this.h;
                switch (i22) {
                    case 0:
                        int[] iArr = ScreenActivity.K;
                        sharedPreferences2.edit().putBoolean(screenActivity.getString(R.string.display), true).commit();
                        screenActivity.finish();
                        break;
                    default:
                        int[] iArr2 = ScreenActivity.K;
                        sharedPreferences2.edit().putBoolean(screenActivity.getString(R.string.display), false).commit();
                        screenActivity.finish();
                        break;
                }
            }
        });
        this.G.setOnClickListener(new tc(26, this));
    }
}
