package flar2.devcheck.benchmarkSuite.calibration;

import Cwd.YSHrxiHkAFcciU;
import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.Fk.Iyrs;
import com.google.android.material.bottomnavigation.ES.nscsSk;
import defpackage.k5;
import defpackage.rt0;
import flar2.devcheck.benchmarkSuite.calibration.CalibrationActivity;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.permissionsSummary.VUpU.kYxonkLwz;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.io.File;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class CalibrationActivity extends Activity {
    public static final /* synthetic */ int q = 0;
    public TextView g;
    public TextView h;
    public ProgressBar i;
    public Button j;
    public Button k;
    public Button l;
    public final Handler m = new Handler(Looper.getMainLooper());
    public Thread n;
    public volatile String o;
    public volatile File p;

    /* loaded from: classes2.dex */
    public abstract class c2020060317 extends Activity {
        public static final void onStop(CalibrationActivity calibrationActivity) {
            calibrationActivity.getWindow().clearFlags(rt0.s);
            super.onStop();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class c2020060318 extends Activity {
        public static final void onDestroy(CalibrationActivity calibrationActivity) {
            Thread thread = calibrationActivity.n;
            if (thread != null) {
                thread.interrupt();
            }
            calibrationActivity.getWindow().clearFlags(rt0.s);
            super.onDestroy();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class c2020060319 extends Activity {
        public static final void onCreate(final CalibrationActivity calibrationActivity, Bundle bundle) {
            super.onCreate(bundle);
            calibrationActivity.getWindow().addFlags(rt0.s);
            LinearLayout linearLayout = new LinearLayout(calibrationActivity);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-16777216);
            int i = (int) (calibrationActivity.getResources().getDisplayMetrics().density * 12.0f);
            linearLayout.setPadding(i, i, i, i);
            TextView textView = new TextView(calibrationActivity);
            textView.setText("Benchmark Suite — Calibration");
            textView.setTextColor(-1);
            textView.setTextSize(18.0f);
            textView.setGravity(17);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
            TextView textView2 = new TextView(calibrationActivity);
            calibrationActivity.h = textView2;
            textView2.setTextColor(-1);
            calibrationActivity.h.setTextSize(12.0f);
            calibrationActivity.h.setGravity(17);
            calibrationActivity.h.setText("starting...");
            linearLayout.addView(calibrationActivity.h, new LinearLayout.LayoutParams(-1, -2));
            ProgressBar progressBar = new ProgressBar(calibrationActivity, null, R.attr.progressBarStyleHorizontal);
            calibrationActivity.i = progressBar;
            progressBar.setMax(100);
            linearLayout.addView(calibrationActivity.i, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(calibrationActivity);
            linearLayout2.setOrientation(0);
            Button button = new Button(calibrationActivity);
            calibrationActivity.j = button;
            button.setText("Run again");
            calibrationActivity.j.setEnabled(false);
            final int i2 = 0;
            calibrationActivity.j.setOnClickListener(new View.OnClickListener() { // from class: an
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardManager clipboardManager;
                    String str;
                    int i3 = i2;
                    CalibrationActivity calibrationActivity2 = calibrationActivity;
                    switch (i3) {
                        case 0:
                            int i4 = CalibrationActivity.q;
                            calibrationActivity2.a();
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            if (calibrationActivity2.o != null && (clipboardManager = (ClipboardManager) calibrationActivity2.getSystemService(XmJDY.dsg)) != null) {
                                clipboardManager.setPrimaryClip(ClipData.newPlainText(tEegR.IsKHUXrQI, calibrationActivity2.o));
                                Toast.makeText(calibrationActivity2, "Copied " + calibrationActivity2.o.length() + " chars", 0).show();
                                break;
                            }
                            break;
                        default:
                            if (calibrationActivity2.o != null) {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType(YSHrxiHkAFcciU.HAiajliMsLKYJ);
                                intent.putExtra("android.intent.extra.TEXT", calibrationActivity2.o);
                                if (calibrationActivity2.p != null) {
                                    str = " — " + calibrationActivity2.p.getName();
                                } else {
                                    str = "";
                                }
                                intent.putExtra("android.intent.extra.SUBJECT", "DevCheck calibration".concat(str));
                                calibrationActivity2.startActivity(Intent.createChooser(intent, "Share calibration JSON"));
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout2.addView(calibrationActivity.j, new LinearLayout.LayoutParams(0, -2, 1.0f));
            Button button2 = new Button(calibrationActivity);
            calibrationActivity.k = button2;
            button2.setText("Copy JSON");
            calibrationActivity.k.setEnabled(false);
            final int i3 = 1;
            calibrationActivity.k.setOnClickListener(new View.OnClickListener() { // from class: an
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardManager clipboardManager;
                    String str;
                    int i32 = i3;
                    CalibrationActivity calibrationActivity2 = calibrationActivity;
                    switch (i32) {
                        case 0:
                            int i4 = CalibrationActivity.q;
                            calibrationActivity2.a();
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            if (calibrationActivity2.o != null && (clipboardManager = (ClipboardManager) calibrationActivity2.getSystemService(XmJDY.dsg)) != null) {
                                clipboardManager.setPrimaryClip(ClipData.newPlainText(tEegR.IsKHUXrQI, calibrationActivity2.o));
                                Toast.makeText(calibrationActivity2, "Copied " + calibrationActivity2.o.length() + " chars", 0).show();
                                break;
                            }
                            break;
                        default:
                            if (calibrationActivity2.o != null) {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType(YSHrxiHkAFcciU.HAiajliMsLKYJ);
                                intent.putExtra("android.intent.extra.TEXT", calibrationActivity2.o);
                                if (calibrationActivity2.p != null) {
                                    str = " — " + calibrationActivity2.p.getName();
                                } else {
                                    str = "";
                                }
                                intent.putExtra("android.intent.extra.SUBJECT", "DevCheck calibration".concat(str));
                                calibrationActivity2.startActivity(Intent.createChooser(intent, "Share calibration JSON"));
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout2.addView(calibrationActivity.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            Button button3 = new Button(calibrationActivity);
            calibrationActivity.l = button3;
            button3.setText("Share");
            calibrationActivity.l.setEnabled(false);
            final int i4 = 2;
            calibrationActivity.l.setOnClickListener(new View.OnClickListener() { // from class: an
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardManager clipboardManager;
                    String str;
                    int i32 = i4;
                    CalibrationActivity calibrationActivity2 = calibrationActivity;
                    switch (i32) {
                        case 0:
                            int i42 = CalibrationActivity.q;
                            calibrationActivity2.a();
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            if (calibrationActivity2.o != null && (clipboardManager = (ClipboardManager) calibrationActivity2.getSystemService(XmJDY.dsg)) != null) {
                                clipboardManager.setPrimaryClip(ClipData.newPlainText(tEegR.IsKHUXrQI, calibrationActivity2.o));
                                Toast.makeText(calibrationActivity2, "Copied " + calibrationActivity2.o.length() + " chars", 0).show();
                                break;
                            }
                            break;
                        default:
                            if (calibrationActivity2.o != null) {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType(YSHrxiHkAFcciU.HAiajliMsLKYJ);
                                intent.putExtra("android.intent.extra.TEXT", calibrationActivity2.o);
                                if (calibrationActivity2.p != null) {
                                    str = " — " + calibrationActivity2.p.getName();
                                } else {
                                    str = "";
                                }
                                intent.putExtra("android.intent.extra.SUBJECT", "DevCheck calibration".concat(str));
                                calibrationActivity2.startActivity(Intent.createChooser(intent, "Share calibration JSON"));
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout2.addView(calibrationActivity.l, new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            TextView textView3 = new TextView(calibrationActivity);
            calibrationActivity.g = textView3;
            textView3.setTextColor(-16711936);
            calibrationActivity.g.setTypeface(Typeface.MONOSPACE);
            calibrationActivity.g.setTextSize(11.0f);
            calibrationActivity.g.setTextIsSelectable(true);
            ScrollView scrollView = new ScrollView(calibrationActivity);
            scrollView.addView(calibrationActivity.g);
            linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
            calibrationActivity.setContentView(linearLayout);
            calibrationActivity.a();
        }
    }

    public final void a() {
        this.j.setEnabled(false);
        this.k.setEnabled(false);
        this.l.setEnabled(false);
        this.g.setText(Iyrs.dlEwyGFvSNpe);
        this.h.setText("running...");
        this.i.setProgress(0);
        this.o = null;
        this.p = null;
        Thread thread = new Thread(new k5(this, 9, getApplicationContext()), "benchSuite-calibration");
        this.n = thread;
        thread.start();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        nscsSk.fAacPJiTSghLNgu.invoke(null, this, bundle);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        kYxonkLwz.yfyyjGXLFytamk.invoke(null, this);
    }

    @Override // android.app.Activity
    public final void onStop() {
        nscsSk.omDG.invoke(null, this);
    }
}
