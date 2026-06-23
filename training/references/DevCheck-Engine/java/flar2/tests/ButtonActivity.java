package flar2.devcheck.tests;

import Cwd.YSHrxiHkAFcciU;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.c3;
import defpackage.l2;
import defpackage.op0;
import defpackage.pr;
import defpackage.sl;
import flar2.devcheck.R;
import flar2.devcheck.tests.ButtonActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public class ButtonActivity extends a5 {
    public static final /* synthetic */ int H = 0;
    public TextView F;
    public Vibrator G;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_buttons);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.buttons));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        ((TextView) findViewById(R.id.isWorking)).setText(getString(R.string.button_feedback));
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: jm
            public final /* synthetic */ ButtonActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ButtonActivity buttonActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = ButtonActivity.H;
                        sharedPreferences2.edit().putBoolean(buttonActivity.getString(R.string.buttons), true).commit();
                        buttonActivity.finish();
                        break;
                    default:
                        int i5 = ButtonActivity.H;
                        sharedPreferences2.edit().putBoolean(buttonActivity.getString(R.string.buttons), false).commit();
                        buttonActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: jm
            public final /* synthetic */ ButtonActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ButtonActivity buttonActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = ButtonActivity.H;
                        sharedPreferences2.edit().putBoolean(buttonActivity.getString(R.string.buttons), true).commit();
                        buttonActivity.finish();
                        break;
                    default:
                        int i5 = ButtonActivity.H;
                        sharedPreferences2.edit().putBoolean(buttonActivity.getString(R.string.buttons), false).commit();
                        buttonActivity.finish();
                        break;
                }
            }
        });
        TextView textView = (TextView) findViewById(R.id.button_summary);
        this.F = textView;
        textView.setText(YSHrxiHkAFcciU.VzFWUeiVheaQ);
    }

    @Override // defpackage.a5, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        String string;
        if (i == 3 || i == 4) {
            super.onKeyDown(i, keyEvent);
            return true;
        }
        new Handler().post(new l2(19, this));
        StringBuilder sb = new StringBuilder();
        try {
            string = KeyEvent.keyCodeToString(i).substring(8);
        } catch (Exception unused) {
            string = getString(R.string.unknown);
        }
        sb.append(string);
        sb.append(" (");
        sb.append(i);
        sb.append(")");
        this.F.setText(sb.toString());
        return true;
    }
}
