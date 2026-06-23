package flar2.devcheck.widgets.batteryWidget;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.slider.KtNX.kle.shRZEcAQGbvjQ;
import com.google.android.material.slider.Slider;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d10;
import defpackage.gr;
import defpackage.i51;
import defpackage.je2;
import defpackage.jg;
import defpackage.n3;
import defpackage.n72;
import defpackage.nc;
import defpackage.p62;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.qc;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.tl2;
import defpackage.u8;
import defpackage.uc;
import defpackage.uz1;
import defpackage.vc;
import defpackage.vq;
import defpackage.wc;
import defpackage.y62;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class BatteryWidgetConfigureActivity extends a5 {
    public static final /* synthetic */ int T = 0;
    public n3 F;
    public TextView G;
    public TextView H;
    public View I;
    public FrameLayout J;
    public WeakReference K;
    public int L;
    public int M;
    public int N;
    public int O;
    public String P;
    public RemoteViews Q;
    public int R = 0;
    public EditText S;

    /* loaded from: classes2.dex */
    public abstract class c2020060317 extends a5 {
        public static final void onPause(BatteryWidgetConfigureActivity batteryWidgetConfigureActivity) {
            super.onPause();
            n3 n3Var = batteryWidgetConfigureActivity.F;
            if (n3Var != null && n3Var.isShowing()) {
                batteryWidgetConfigureActivity.F.dismiss();
            }
            WeakReference weakReference = batteryWidgetConfigureActivity.K;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    /* loaded from: classes2.dex */
    public abstract class c2020060318 extends a5 {
        public static final void onCreate(final BatteryWidgetConfigureActivity batteryWidgetConfigureActivity, Bundle bundle) {
            int i = Build.VERSION.SDK_INT;
            if (i < 31) {
                c3.z(batteryWidgetConfigureActivity);
            } else if (uz1.h0(batteryWidgetConfigureActivity)) {
                batteryWidgetConfigureActivity.setTheme(R.style.AppThemeMaterial3Dark);
            } else {
                batteryWidgetConfigureActivity.setTheme(R.style.AppThemeMaterial3Light);
            }
            super.onCreate(bundle);
            final int i2 = 1;
            batteryWidgetConfigureActivity.k().a(batteryWidgetConfigureActivity, new vc(i2, batteryWidgetConfigureActivity));
            final int i3 = 0;
            batteryWidgetConfigureActivity.setResult(0);
            batteryWidgetConfigureActivity.setContentView(R.layout.widget_battery_configure);
            pr.m(batteryWidgetConfigureActivity.getWindow());
            FrameLayout frameLayout = (FrameLayout) batteryWidgetConfigureActivity.findViewById(R.id.root);
            u8 u8Var = new u8(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom(), 2);
            WeakHashMap weakHashMap = y62.f1215a;
            p62.c(frameLayout, u8Var);
            batteryWidgetConfigureActivity.getWindow().setStatusBarColor(0);
            Bundle extras = batteryWidgetConfigureActivity.getIntent().getExtras();
            if (extras != null) {
                batteryWidgetConfigureActivity.R = extras.getInt("appWidgetId", 0);
            }
            if (batteryWidgetConfigureActivity.R == 0) {
                batteryWidgetConfigureActivity.finish();
                return;
            }
            batteryWidgetConfigureActivity.K = new WeakReference(batteryWidgetConfigureActivity);
            rj rjVar = new rj((pj) ((MainApp) batteryWidgetConfigureActivity.getApplication()).g.g, 0);
            n72 l = batteryWidgetConfigureActivity.l();
            py0 h = batteryWidgetConfigureActivity.h();
            l.getClass();
            gr grVar = new gr(l, rjVar, h);
            vq a2 = af1.a(sj.class);
            String b = a2.b();
            if (b == null) {
                c.m("Local and anonymous classes can not be ViewModels");
                return;
            }
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(batteryWidgetConfigureActivity, new nc(3, batteryWidgetConfigureActivity));
            batteryWidgetConfigureActivity.J = (FrameLayout) batteryWidgetConfigureActivity.findViewById(R.id.widget_container);
            batteryWidgetConfigureActivity.H = (TextView) batteryWidgetConfigureActivity.findViewById(R.id.opacity_value);
            Slider slider = (Slider) batteryWidgetConfigureActivity.findViewById(R.id.opacity_slider);
            slider.t.add(new wc(batteryWidgetConfigureActivity, 1));
            slider.a(new qc(batteryWidgetConfigureActivity, 1));
            int N = sl.N(batteryWidgetConfigureActivity.R, "battery_opacity_");
            batteryWidgetConfigureActivity.L = N;
            if (N < 0 || N > 100) {
                batteryWidgetConfigureActivity.L = 100;
            }
            slider.setValue(batteryWidgetConfigureActivity.L);
            batteryWidgetConfigureActivity.H.setText(batteryWidgetConfigureActivity.L + "%");
            batteryWidgetConfigureActivity.M = tl2.m(batteryWidgetConfigureActivity, batteryWidgetConfigureActivity.R);
            final ImageView imageView = (ImageView) batteryWidgetConfigureActivity.findViewById(R.id.widget_color_preview);
            batteryWidgetConfigureActivity.E(imageView, batteryWidgetConfigureActivity.M);
            batteryWidgetConfigureActivity.findViewById(R.id.widget_color_row).setOnClickListener(new View.OnClickListener() { // from class: kg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    final int i5 = 2;
                    final int i6 = 1;
                    final int i7 = 0;
                    final ImageView imageView2 = imageView;
                    final BatteryWidgetConfigureActivity batteryWidgetConfigureActivity2 = batteryWidgetConfigureActivity;
                    switch (i4) {
                        case 0:
                            int i8 = BatteryWidgetConfigureActivity.T;
                            String string = batteryWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                            int i9 = batteryWidgetConfigureActivity2.M;
                            if (i9 == 0) {
                                i9 = tl2.r(batteryWidgetConfigureActivity2);
                            }
                            rt0.J(batteryWidgetConfigureActivity2, string, i9, new m92() { // from class: ig
                                @Override // defpackage.m92
                                public final void a(int i10) {
                                    int i11 = i5;
                                    ImageView imageView3 = imageView2;
                                    BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                    switch (i11) {
                                        case 0:
                                            batteryWidgetConfigureActivity3.O = i10;
                                            batteryWidgetConfigureActivity3.F(imageView3, i10);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            batteryWidgetConfigureActivity3.N = i10;
                                            BatteryWidgetConfigureActivity.D(imageView3, i10);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            batteryWidgetConfigureActivity3.M = i10;
                                            batteryWidgetConfigureActivity3.E(imageView3, i10);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: gg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i10 = i7;
                                    ImageView imageView3 = imageView2;
                                    BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                    switch (i10) {
                                        case 0:
                                            batteryWidgetConfigureActivity3.M = 0;
                                            batteryWidgetConfigureActivity3.E(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            batteryWidgetConfigureActivity3.O = 0;
                                            batteryWidgetConfigureActivity3.F(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            batteryWidgetConfigureActivity3.N = 0;
                                            BatteryWidgetConfigureActivity.D(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i10 = BatteryWidgetConfigureActivity.T;
                            String string2 = batteryWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                            int i11 = batteryWidgetConfigureActivity2.N;
                            if (i11 == 0) {
                                i11 = je2.y(batteryWidgetConfigureActivity2);
                            }
                            rt0.J(batteryWidgetConfigureActivity2, string2, i11, new m92() { // from class: ig
                                @Override // defpackage.m92
                                public final void a(int i102) {
                                    int i112 = i6;
                                    ImageView imageView3 = imageView2;
                                    BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                    switch (i112) {
                                        case 0:
                                            batteryWidgetConfigureActivity3.O = i102;
                                            batteryWidgetConfigureActivity3.F(imageView3, i102);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            batteryWidgetConfigureActivity3.N = i102;
                                            BatteryWidgetConfigureActivity.D(imageView3, i102);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            batteryWidgetConfigureActivity3.M = i102;
                                            batteryWidgetConfigureActivity3.E(imageView3, i102);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: gg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i102 = i5;
                                    ImageView imageView3 = imageView2;
                                    BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                    switch (i102) {
                                        case 0:
                                            batteryWidgetConfigureActivity3.M = 0;
                                            batteryWidgetConfigureActivity3.E(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            batteryWidgetConfigureActivity3.O = 0;
                                            batteryWidgetConfigureActivity3.F(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            batteryWidgetConfigureActivity3.N = 0;
                                            BatteryWidgetConfigureActivity.D(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            int i12 = BatteryWidgetConfigureActivity.T;
                            String string3 = batteryWidgetConfigureActivity2.getString(R.string.widget_label_color);
                            int i13 = batteryWidgetConfigureActivity2.O;
                            if (i13 == 0) {
                                i13 = c3.q(batteryWidgetConfigureActivity2);
                            }
                            rt0.J(batteryWidgetConfigureActivity2, string3, i13, new m92() { // from class: ig
                                @Override // defpackage.m92
                                public final void a(int i102) {
                                    int i112 = i7;
                                    ImageView imageView3 = imageView2;
                                    BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                    switch (i112) {
                                        case 0:
                                            batteryWidgetConfigureActivity3.O = i102;
                                            batteryWidgetConfigureActivity3.F(imageView3, i102);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            batteryWidgetConfigureActivity3.N = i102;
                                            BatteryWidgetConfigureActivity.D(imageView3, i102);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            batteryWidgetConfigureActivity3.M = i102;
                                            batteryWidgetConfigureActivity3.E(imageView3, i102);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: gg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i102 = i6;
                                    ImageView imageView3 = imageView2;
                                    BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                    switch (i102) {
                                        case 0:
                                            batteryWidgetConfigureActivity3.M = 0;
                                            batteryWidgetConfigureActivity3.E(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            batteryWidgetConfigureActivity3.O = 0;
                                            batteryWidgetConfigureActivity3.F(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            batteryWidgetConfigureActivity3.N = 0;
                                            BatteryWidgetConfigureActivity.D(imageView3, 0);
                                            batteryWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            View findViewById = batteryWidgetConfigureActivity.findViewById(R.id.widget_accent_row);
            if (i >= 31) {
                batteryWidgetConfigureActivity.N = je2.r(batteryWidgetConfigureActivity, batteryWidgetConfigureActivity.R);
                final ImageView imageView2 = (ImageView) batteryWidgetConfigureActivity.findViewById(R.id.widget_accent_preview);
                BatteryWidgetConfigureActivity.D(imageView2, batteryWidgetConfigureActivity.N);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: kg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i2;
                        final int i5 = 2;
                        final int i6 = 1;
                        final int i7 = 0;
                        final ImageView imageView22 = imageView2;
                        final BatteryWidgetConfigureActivity batteryWidgetConfigureActivity2 = batteryWidgetConfigureActivity;
                        switch (i4) {
                            case 0:
                                int i8 = BatteryWidgetConfigureActivity.T;
                                String string = batteryWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                                int i9 = batteryWidgetConfigureActivity2.M;
                                if (i9 == 0) {
                                    i9 = tl2.r(batteryWidgetConfigureActivity2);
                                }
                                rt0.J(batteryWidgetConfigureActivity2, string, i9, new m92() { // from class: ig
                                    @Override // defpackage.m92
                                    public final void a(int i102) {
                                        int i112 = i5;
                                        ImageView imageView3 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i112) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.O = i102;
                                                batteryWidgetConfigureActivity3.F(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.N = i102;
                                                BatteryWidgetConfigureActivity.D(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.M = i102;
                                                batteryWidgetConfigureActivity3.E(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: gg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i7;
                                        ImageView imageView3 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.M = 0;
                                                batteryWidgetConfigureActivity3.E(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.O = 0;
                                                batteryWidgetConfigureActivity3.F(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.N = 0;
                                                BatteryWidgetConfigureActivity.D(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i10 = BatteryWidgetConfigureActivity.T;
                                String string2 = batteryWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                                int i11 = batteryWidgetConfigureActivity2.N;
                                if (i11 == 0) {
                                    i11 = je2.y(batteryWidgetConfigureActivity2);
                                }
                                rt0.J(batteryWidgetConfigureActivity2, string2, i11, new m92() { // from class: ig
                                    @Override // defpackage.m92
                                    public final void a(int i102) {
                                        int i112 = i6;
                                        ImageView imageView3 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i112) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.O = i102;
                                                batteryWidgetConfigureActivity3.F(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.N = i102;
                                                BatteryWidgetConfigureActivity.D(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.M = i102;
                                                batteryWidgetConfigureActivity3.E(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: gg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i5;
                                        ImageView imageView3 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.M = 0;
                                                batteryWidgetConfigureActivity3.E(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.O = 0;
                                                batteryWidgetConfigureActivity3.F(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.N = 0;
                                                BatteryWidgetConfigureActivity.D(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i12 = BatteryWidgetConfigureActivity.T;
                                String string3 = batteryWidgetConfigureActivity2.getString(R.string.widget_label_color);
                                int i13 = batteryWidgetConfigureActivity2.O;
                                if (i13 == 0) {
                                    i13 = c3.q(batteryWidgetConfigureActivity2);
                                }
                                rt0.J(batteryWidgetConfigureActivity2, string3, i13, new m92() { // from class: ig
                                    @Override // defpackage.m92
                                    public final void a(int i102) {
                                        int i112 = i7;
                                        ImageView imageView3 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i112) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.O = i102;
                                                batteryWidgetConfigureActivity3.F(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.N = i102;
                                                BatteryWidgetConfigureActivity.D(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.M = i102;
                                                batteryWidgetConfigureActivity3.E(imageView3, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: gg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i6;
                                        ImageView imageView3 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.M = 0;
                                                batteryWidgetConfigureActivity3.E(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.O = 0;
                                                batteryWidgetConfigureActivity3.F(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.N = 0;
                                                BatteryWidgetConfigureActivity.D(imageView3, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
            } else {
                findViewById.setVisibility(8);
            }
            View findViewById2 = batteryWidgetConfigureActivity.findViewById(R.id.widget_label_row);
            if (i >= 31) {
                batteryWidgetConfigureActivity.O = c3.p(batteryWidgetConfigureActivity, batteryWidgetConfigureActivity.R);
                final ImageView imageView3 = (ImageView) batteryWidgetConfigureActivity.findViewById(R.id.widget_label_preview);
                batteryWidgetConfigureActivity.F(imageView3, batteryWidgetConfigureActivity.O);
                final int i4 = 2;
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: kg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i42 = i4;
                        final int i5 = 2;
                        final int i6 = 1;
                        final int i7 = 0;
                        final ImageView imageView22 = imageView3;
                        final BatteryWidgetConfigureActivity batteryWidgetConfigureActivity2 = batteryWidgetConfigureActivity;
                        switch (i42) {
                            case 0:
                                int i8 = BatteryWidgetConfigureActivity.T;
                                String string = batteryWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                                int i9 = batteryWidgetConfigureActivity2.M;
                                if (i9 == 0) {
                                    i9 = tl2.r(batteryWidgetConfigureActivity2);
                                }
                                rt0.J(batteryWidgetConfigureActivity2, string, i9, new m92() { // from class: ig
                                    @Override // defpackage.m92
                                    public final void a(int i102) {
                                        int i112 = i5;
                                        ImageView imageView32 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i112) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.O = i102;
                                                batteryWidgetConfigureActivity3.F(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.N = i102;
                                                BatteryWidgetConfigureActivity.D(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.M = i102;
                                                batteryWidgetConfigureActivity3.E(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: gg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i7;
                                        ImageView imageView32 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.M = 0;
                                                batteryWidgetConfigureActivity3.E(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.O = 0;
                                                batteryWidgetConfigureActivity3.F(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.N = 0;
                                                BatteryWidgetConfigureActivity.D(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i10 = BatteryWidgetConfigureActivity.T;
                                String string2 = batteryWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                                int i11 = batteryWidgetConfigureActivity2.N;
                                if (i11 == 0) {
                                    i11 = je2.y(batteryWidgetConfigureActivity2);
                                }
                                rt0.J(batteryWidgetConfigureActivity2, string2, i11, new m92() { // from class: ig
                                    @Override // defpackage.m92
                                    public final void a(int i102) {
                                        int i112 = i6;
                                        ImageView imageView32 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i112) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.O = i102;
                                                batteryWidgetConfigureActivity3.F(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.N = i102;
                                                BatteryWidgetConfigureActivity.D(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.M = i102;
                                                batteryWidgetConfigureActivity3.E(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: gg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i5;
                                        ImageView imageView32 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.M = 0;
                                                batteryWidgetConfigureActivity3.E(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.O = 0;
                                                batteryWidgetConfigureActivity3.F(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.N = 0;
                                                BatteryWidgetConfigureActivity.D(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i12 = BatteryWidgetConfigureActivity.T;
                                String string3 = batteryWidgetConfigureActivity2.getString(R.string.widget_label_color);
                                int i13 = batteryWidgetConfigureActivity2.O;
                                if (i13 == 0) {
                                    i13 = c3.q(batteryWidgetConfigureActivity2);
                                }
                                rt0.J(batteryWidgetConfigureActivity2, string3, i13, new m92() { // from class: ig
                                    @Override // defpackage.m92
                                    public final void a(int i102) {
                                        int i112 = i7;
                                        ImageView imageView32 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i112) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.O = i102;
                                                batteryWidgetConfigureActivity3.F(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.N = i102;
                                                BatteryWidgetConfigureActivity.D(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.M = i102;
                                                batteryWidgetConfigureActivity3.E(imageView32, i102);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: gg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i102 = i6;
                                        ImageView imageView32 = imageView22;
                                        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity3 = batteryWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                batteryWidgetConfigureActivity3.M = 0;
                                                batteryWidgetConfigureActivity3.E(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                batteryWidgetConfigureActivity3.O = 0;
                                                batteryWidgetConfigureActivity3.F(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                batteryWidgetConfigureActivity3.N = 0;
                                                BatteryWidgetConfigureActivity.D(imageView32, 0);
                                                batteryWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
            } else {
                findViewById2.setVisibility(8);
            }
            batteryWidgetConfigureActivity.G = (TextView) batteryWidgetConfigureActivity.findViewById(R.id.title_text);
            String o = d10.o(batteryWidgetConfigureActivity);
            batteryWidgetConfigureActivity.P = o;
            batteryWidgetConfigureActivity.G.setText(o);
            batteryWidgetConfigureActivity.G.setOnClickListener(new jg(batteryWidgetConfigureActivity, i2));
            batteryWidgetConfigureActivity.B();
        }
    }

    public static void D(ImageView imageView, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (i == 0) {
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(6, -7829368);
        } else {
            gradientDrawable.setColor(i);
            gradientDrawable.setStroke(3, 1082163328);
        }
        gradientDrawable.setSize(96, 96);
        imageView.setImageDrawable(gradientDrawable);
    }

    public final void B() {
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.widget_battery_square);
        this.Q = remoteViews;
        remoteViews.setViewVisibility(R.id.loading, 8);
        this.Q.setViewVisibility(R.id.title_layout, 8);
        this.Q.setTextViewText(R.id.title, this.P);
        Intent registerReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1);
        this.Q.setTextViewText(R.id.free, String.valueOf(intExtra));
        this.Q.setProgressBar(R.id.pbPercent, 100, intExtra, false);
        int i = Build.VERSION.SDK_INT;
        RemoteViews remoteViews2 = this.Q;
        if (i >= 31) {
            remoteViews2.setFloat(R.id.image, "setAlpha", this.L / 100.0f);
        } else {
            remoteViews2.setInt(R.id.image, bOxzFZXgEkjph.mnMCTzXhEZkLL, (int) (this.L * 2.55d));
        }
        tl2.c(this.Q, this.M);
        int i2 = this.N;
        if (i2 != 0) {
            je2.c(this.Q, i2, "setProgressTintList", R.id.pbPercent);
            int o = je2.o(this.N);
            this.Q.setTextColor(R.id.free, o);
            this.Q.setTextColor(R.id.percent, o);
        }
        c3.a(this.Q, this.O, R.id.title, R.id.misc);
        View view = this.I;
        if (view != null) {
            this.J.removeView(view);
        }
        View apply = this.Q.apply(this, this.J);
        this.I = apply;
        this.J.addView(apply);
    }

    public final void C(boolean z) {
        Button button = (Button) findViewById(R.id.add_button);
        if (!z) {
            button.setText(getString(R.string.buy_now));
            button.setOnClickListener(new jg(this, 2));
            return;
        }
        i51.i("prefHardwareDB", z);
        findViewById(R.id.pro_message).setVisibility(8);
        if (Build.VERSION.SDK_INT >= 33 && checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            button.setOnClickListener(new jg(this, 3));
            return;
        }
        button.setOnClickListener(new uc(this, 1, button));
        if (sl.f(this.R, "battery_opacity_")) {
            button.setText(getString(R.string.apply));
        }
    }

    public final void E(ImageView imageView, int i) {
        if (i == 0) {
            i = tl2.r(this);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(3, 1082163328);
        gradientDrawable.setSize(96, 96);
        imageView.setImageDrawable(gradientDrawable);
    }

    public final void F(ImageView imageView, int i) {
        if (i == 0) {
            i = c3.q(this);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(3, 1082163328);
        gradientDrawable.setSize(96, 96);
        imageView.setImageDrawable(gradientDrawable);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        shRZEcAQGbvjQ.nIAItTVpC.invoke(null, this, bundle);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        shRZEcAQGbvjQ.sVtYXWXJ.invoke(null, this);
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 226) {
            int length = iArr.length;
            C(i51.b("prefHardwareDB").booleanValue());
        }
    }
}
