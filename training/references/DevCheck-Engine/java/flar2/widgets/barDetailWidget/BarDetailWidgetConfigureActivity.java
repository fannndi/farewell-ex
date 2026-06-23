package flar2.devcheck.widgets.barDetailWidget;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.slider.KtNX.kle.TjguQfQF;
import com.google.android.material.slider.Slider;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.je2;
import defpackage.n72;
import defpackage.nc;
import defpackage.om0;
import defpackage.p62;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.qc;
import defpackage.rj;
import defpackage.sc;
import defpackage.sj;
import defpackage.sl;
import defpackage.tb;
import defpackage.tl2;
import defpackage.u8;
import defpackage.uz1;
import defpackage.vc;
import defpackage.vq;
import defpackage.wc;
import defpackage.y62;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class BarDetailWidgetConfigureActivity extends a5 {
    public static final /* synthetic */ int T = 0;
    public TextView F;
    public View G;
    public FrameLayout H;
    public RemoteViews I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public String P;
    public String Q;
    public int R;
    public int S = 0;

    /* loaded from: classes2.dex */
    public abstract class c2020060317 extends a5 {
        public static final void onCreate(final BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity, Bundle bundle) {
            int i = Build.VERSION.SDK_INT;
            if (i < 31) {
                c3.z(barDetailWidgetConfigureActivity);
            } else if (uz1.h0(barDetailWidgetConfigureActivity)) {
                barDetailWidgetConfigureActivity.setTheme(R.style.AppThemeMaterial3Dark);
            } else {
                barDetailWidgetConfigureActivity.setTheme(R.style.AppThemeMaterial3Light);
            }
            super.onCreate(bundle);
            final int i2 = 0;
            barDetailWidgetConfigureActivity.k().a(barDetailWidgetConfigureActivity, new vc(i2, barDetailWidgetConfigureActivity));
            barDetailWidgetConfigureActivity.setResult(0);
            barDetailWidgetConfigureActivity.setContentView(R.layout.widget_bar_detail_configure);
            pr.m(barDetailWidgetConfigureActivity.getWindow());
            FrameLayout frameLayout = (FrameLayout) barDetailWidgetConfigureActivity.findViewById(R.id.root);
            u8 u8Var = new u8(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom(), 1);
            WeakHashMap weakHashMap = y62.f1215a;
            p62.c(frameLayout, u8Var);
            barDetailWidgetConfigureActivity.getWindow().setStatusBarColor(0);
            Bundle extras = barDetailWidgetConfigureActivity.getIntent().getExtras();
            if (extras != null) {
                barDetailWidgetConfigureActivity.S = extras.getInt("appWidgetId", 0);
            }
            if (barDetailWidgetConfigureActivity.S == 0) {
                barDetailWidgetConfigureActivity.finish();
                return;
            }
            rj rjVar = new rj((pj) ((MainApp) barDetailWidgetConfigureActivity.getApplication()).g.g, 0);
            n72 l = barDetailWidgetConfigureActivity.l();
            py0 h = barDetailWidgetConfigureActivity.h();
            l.getClass();
            gr grVar = new gr(l, rjVar, h);
            vq a2 = af1.a(sj.class);
            String b = a2.b();
            if (b == null) {
                c.m(ILBLnlCHDVqsSN.kZfIOauEyZSAQ);
                return;
            }
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(barDetailWidgetConfigureActivity, new nc(i2, barDetailWidgetConfigureActivity));
            barDetailWidgetConfigureActivity.H = (FrameLayout) barDetailWidgetConfigureActivity.findViewById(R.id.widget_container);
            barDetailWidgetConfigureActivity.F = (TextView) barDetailWidgetConfigureActivity.findViewById(R.id.opacity_value);
            Slider slider = (Slider) barDetailWidgetConfigureActivity.findViewById(R.id.opacity_slider);
            slider.t.add(new wc(barDetailWidgetConfigureActivity, i2));
            slider.a(new qc(barDetailWidgetConfigureActivity, 0));
            int N = sl.N(barDetailWidgetConfigureActivity.S, XmJDY.bXeHOhLPfzDrHb);
            barDetailWidgetConfigureActivity.L = N;
            if (N < 0 || N > 100) {
                barDetailWidgetConfigureActivity.L = 100;
            }
            slider.setValue(barDetailWidgetConfigureActivity.L);
            barDetailWidgetConfigureActivity.F.setText(barDetailWidgetConfigureActivity.L + "%");
            barDetailWidgetConfigureActivity.B();
            barDetailWidgetConfigureActivity.M = tl2.m(barDetailWidgetConfigureActivity, barDetailWidgetConfigureActivity.S);
            final ImageView imageView = (ImageView) barDetailWidgetConfigureActivity.findViewById(R.id.widget_color_preview);
            barDetailWidgetConfigureActivity.D(imageView, barDetailWidgetConfigureActivity.M);
            barDetailWidgetConfigureActivity.B();
            barDetailWidgetConfigureActivity.findViewById(R.id.widget_color_row).setOnClickListener(new View.OnClickListener() { // from class: rc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    final ImageView imageView2 = imageView;
                    final BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity2 = barDetailWidgetConfigureActivity;
                    switch (i3) {
                        case 0:
                            int i4 = BarDetailWidgetConfigureActivity.T;
                            String string = barDetailWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                            int i5 = barDetailWidgetConfigureActivity2.M;
                            if (i5 == 0) {
                                i5 = tl2.r(barDetailWidgetConfigureActivity2);
                            }
                            final int i6 = 2;
                            rt0.J(barDetailWidgetConfigureActivity2, string, i5, new m92() { // from class: oc
                                @Override // defpackage.m92
                                public final void a(int i7) {
                                    int i8 = i6;
                                    ImageView imageView3 = imageView2;
                                    BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                    switch (i8) {
                                        case 0:
                                            barDetailWidgetConfigureActivity3.N = i7;
                                            BarDetailWidgetConfigureActivity.C(imageView3, i7);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            barDetailWidgetConfigureActivity3.O = i7;
                                            barDetailWidgetConfigureActivity3.E(imageView3, i7);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            barDetailWidgetConfigureActivity3.M = i7;
                                            barDetailWidgetConfigureActivity3.D(imageView3, i7);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: pc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i7 = i6;
                                    ImageView imageView3 = imageView2;
                                    BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                    switch (i7) {
                                        case 0:
                                            barDetailWidgetConfigureActivity3.N = 0;
                                            BarDetailWidgetConfigureActivity.C(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            barDetailWidgetConfigureActivity3.O = 0;
                                            barDetailWidgetConfigureActivity3.E(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            barDetailWidgetConfigureActivity3.M = 0;
                                            barDetailWidgetConfigureActivity3.D(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i7 = BarDetailWidgetConfigureActivity.T;
                            String string2 = barDetailWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                            int i8 = barDetailWidgetConfigureActivity2.N;
                            if (i8 == 0) {
                                i8 = je2.y(barDetailWidgetConfigureActivity2);
                            }
                            final int i9 = 0;
                            rt0.J(barDetailWidgetConfigureActivity2, string2, i8, new m92() { // from class: oc
                                @Override // defpackage.m92
                                public final void a(int i72) {
                                    int i82 = i9;
                                    ImageView imageView3 = imageView2;
                                    BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                    switch (i82) {
                                        case 0:
                                            barDetailWidgetConfigureActivity3.N = i72;
                                            BarDetailWidgetConfigureActivity.C(imageView3, i72);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            barDetailWidgetConfigureActivity3.O = i72;
                                            barDetailWidgetConfigureActivity3.E(imageView3, i72);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            barDetailWidgetConfigureActivity3.M = i72;
                                            barDetailWidgetConfigureActivity3.D(imageView3, i72);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: pc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i72 = i9;
                                    ImageView imageView3 = imageView2;
                                    BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                    switch (i72) {
                                        case 0:
                                            barDetailWidgetConfigureActivity3.N = 0;
                                            BarDetailWidgetConfigureActivity.C(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            barDetailWidgetConfigureActivity3.O = 0;
                                            barDetailWidgetConfigureActivity3.E(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            barDetailWidgetConfigureActivity3.M = 0;
                                            barDetailWidgetConfigureActivity3.D(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            int i10 = BarDetailWidgetConfigureActivity.T;
                            String string3 = barDetailWidgetConfigureActivity2.getString(R.string.widget_label_color);
                            int i11 = barDetailWidgetConfigureActivity2.O;
                            if (i11 == 0) {
                                i11 = c3.q(barDetailWidgetConfigureActivity2);
                            }
                            final int i12 = 1;
                            rt0.J(barDetailWidgetConfigureActivity2, string3, i11, new m92() { // from class: oc
                                @Override // defpackage.m92
                                public final void a(int i72) {
                                    int i82 = i12;
                                    ImageView imageView3 = imageView2;
                                    BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                    switch (i82) {
                                        case 0:
                                            barDetailWidgetConfigureActivity3.N = i72;
                                            BarDetailWidgetConfigureActivity.C(imageView3, i72);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            barDetailWidgetConfigureActivity3.O = i72;
                                            barDetailWidgetConfigureActivity3.E(imageView3, i72);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            barDetailWidgetConfigureActivity3.M = i72;
                                            barDetailWidgetConfigureActivity3.D(imageView3, i72);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: pc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i72 = i12;
                                    ImageView imageView3 = imageView2;
                                    BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                    switch (i72) {
                                        case 0:
                                            barDetailWidgetConfigureActivity3.N = 0;
                                            BarDetailWidgetConfigureActivity.C(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            barDetailWidgetConfigureActivity3.O = 0;
                                            barDetailWidgetConfigureActivity3.E(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            barDetailWidgetConfigureActivity3.M = 0;
                                            barDetailWidgetConfigureActivity3.D(imageView3, 0);
                                            barDetailWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            View findViewById = barDetailWidgetConfigureActivity.findViewById(R.id.widget_accent_row);
            final int i3 = 1;
            if (i >= 31) {
                barDetailWidgetConfigureActivity.N = je2.r(barDetailWidgetConfigureActivity, barDetailWidgetConfigureActivity.S);
                final ImageView imageView2 = (ImageView) barDetailWidgetConfigureActivity.findViewById(R.id.widget_accent_preview);
                BarDetailWidgetConfigureActivity.C(imageView2, barDetailWidgetConfigureActivity.N);
                barDetailWidgetConfigureActivity.B();
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: rc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32 = i3;
                        final ImageView imageView22 = imageView2;
                        final BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity2 = barDetailWidgetConfigureActivity;
                        switch (i32) {
                            case 0:
                                int i4 = BarDetailWidgetConfigureActivity.T;
                                String string = barDetailWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                                int i5 = barDetailWidgetConfigureActivity2.M;
                                if (i5 == 0) {
                                    i5 = tl2.r(barDetailWidgetConfigureActivity2);
                                }
                                final int i6 = 2;
                                rt0.J(barDetailWidgetConfigureActivity2, string, i5, new m92() { // from class: oc
                                    @Override // defpackage.m92
                                    public final void a(int i72) {
                                        int i82 = i6;
                                        ImageView imageView3 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i82) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = i72;
                                                BarDetailWidgetConfigureActivity.C(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = i72;
                                                barDetailWidgetConfigureActivity3.E(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = i72;
                                                barDetailWidgetConfigureActivity3.D(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: pc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i72 = i6;
                                        ImageView imageView3 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i72) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = 0;
                                                BarDetailWidgetConfigureActivity.C(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = 0;
                                                barDetailWidgetConfigureActivity3.E(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = 0;
                                                barDetailWidgetConfigureActivity3.D(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i7 = BarDetailWidgetConfigureActivity.T;
                                String string2 = barDetailWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                                int i8 = barDetailWidgetConfigureActivity2.N;
                                if (i8 == 0) {
                                    i8 = je2.y(barDetailWidgetConfigureActivity2);
                                }
                                final int i9 = 0;
                                rt0.J(barDetailWidgetConfigureActivity2, string2, i8, new m92() { // from class: oc
                                    @Override // defpackage.m92
                                    public final void a(int i72) {
                                        int i82 = i9;
                                        ImageView imageView3 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i82) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = i72;
                                                BarDetailWidgetConfigureActivity.C(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = i72;
                                                barDetailWidgetConfigureActivity3.E(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = i72;
                                                barDetailWidgetConfigureActivity3.D(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: pc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i72 = i9;
                                        ImageView imageView3 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i72) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = 0;
                                                BarDetailWidgetConfigureActivity.C(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = 0;
                                                barDetailWidgetConfigureActivity3.E(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = 0;
                                                barDetailWidgetConfigureActivity3.D(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i10 = BarDetailWidgetConfigureActivity.T;
                                String string3 = barDetailWidgetConfigureActivity2.getString(R.string.widget_label_color);
                                int i11 = barDetailWidgetConfigureActivity2.O;
                                if (i11 == 0) {
                                    i11 = c3.q(barDetailWidgetConfigureActivity2);
                                }
                                final int i12 = 1;
                                rt0.J(barDetailWidgetConfigureActivity2, string3, i11, new m92() { // from class: oc
                                    @Override // defpackage.m92
                                    public final void a(int i72) {
                                        int i82 = i12;
                                        ImageView imageView3 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i82) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = i72;
                                                BarDetailWidgetConfigureActivity.C(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = i72;
                                                barDetailWidgetConfigureActivity3.E(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = i72;
                                                barDetailWidgetConfigureActivity3.D(imageView3, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: pc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i72 = i12;
                                        ImageView imageView3 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i72) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = 0;
                                                BarDetailWidgetConfigureActivity.C(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = 0;
                                                barDetailWidgetConfigureActivity3.E(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = 0;
                                                barDetailWidgetConfigureActivity3.D(imageView3, 0);
                                                barDetailWidgetConfigureActivity3.B();
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
            View findViewById2 = barDetailWidgetConfigureActivity.findViewById(R.id.widget_label_row);
            final int i4 = 2;
            if (i >= 31) {
                barDetailWidgetConfigureActivity.O = c3.p(barDetailWidgetConfigureActivity, barDetailWidgetConfigureActivity.S);
                final ImageView imageView3 = (ImageView) barDetailWidgetConfigureActivity.findViewById(R.id.widget_label_preview);
                barDetailWidgetConfigureActivity.E(imageView3, barDetailWidgetConfigureActivity.O);
                barDetailWidgetConfigureActivity.B();
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: rc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32 = i4;
                        final ImageView imageView22 = imageView3;
                        final BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity2 = barDetailWidgetConfigureActivity;
                        switch (i32) {
                            case 0:
                                int i42 = BarDetailWidgetConfigureActivity.T;
                                String string = barDetailWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                                int i5 = barDetailWidgetConfigureActivity2.M;
                                if (i5 == 0) {
                                    i5 = tl2.r(barDetailWidgetConfigureActivity2);
                                }
                                final int i6 = 2;
                                rt0.J(barDetailWidgetConfigureActivity2, string, i5, new m92() { // from class: oc
                                    @Override // defpackage.m92
                                    public final void a(int i72) {
                                        int i82 = i6;
                                        ImageView imageView32 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i82) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = i72;
                                                BarDetailWidgetConfigureActivity.C(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = i72;
                                                barDetailWidgetConfigureActivity3.E(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = i72;
                                                barDetailWidgetConfigureActivity3.D(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: pc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i72 = i6;
                                        ImageView imageView32 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i72) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = 0;
                                                BarDetailWidgetConfigureActivity.C(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = 0;
                                                barDetailWidgetConfigureActivity3.E(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = 0;
                                                barDetailWidgetConfigureActivity3.D(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i7 = BarDetailWidgetConfigureActivity.T;
                                String string2 = barDetailWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                                int i8 = barDetailWidgetConfigureActivity2.N;
                                if (i8 == 0) {
                                    i8 = je2.y(barDetailWidgetConfigureActivity2);
                                }
                                final int i9 = 0;
                                rt0.J(barDetailWidgetConfigureActivity2, string2, i8, new m92() { // from class: oc
                                    @Override // defpackage.m92
                                    public final void a(int i72) {
                                        int i82 = i9;
                                        ImageView imageView32 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i82) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = i72;
                                                BarDetailWidgetConfigureActivity.C(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = i72;
                                                barDetailWidgetConfigureActivity3.E(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = i72;
                                                barDetailWidgetConfigureActivity3.D(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: pc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i72 = i9;
                                        ImageView imageView32 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i72) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = 0;
                                                BarDetailWidgetConfigureActivity.C(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = 0;
                                                barDetailWidgetConfigureActivity3.E(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = 0;
                                                barDetailWidgetConfigureActivity3.D(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i10 = BarDetailWidgetConfigureActivity.T;
                                String string3 = barDetailWidgetConfigureActivity2.getString(R.string.widget_label_color);
                                int i11 = barDetailWidgetConfigureActivity2.O;
                                if (i11 == 0) {
                                    i11 = c3.q(barDetailWidgetConfigureActivity2);
                                }
                                final int i12 = 1;
                                rt0.J(barDetailWidgetConfigureActivity2, string3, i11, new m92() { // from class: oc
                                    @Override // defpackage.m92
                                    public final void a(int i72) {
                                        int i82 = i12;
                                        ImageView imageView32 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i82) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = i72;
                                                BarDetailWidgetConfigureActivity.C(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = i72;
                                                barDetailWidgetConfigureActivity3.E(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = i72;
                                                barDetailWidgetConfigureActivity3.D(imageView32, i72);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: pc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i72 = i12;
                                        ImageView imageView32 = imageView22;
                                        BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity3 = barDetailWidgetConfigureActivity2;
                                        switch (i72) {
                                            case 0:
                                                barDetailWidgetConfigureActivity3.N = 0;
                                                BarDetailWidgetConfigureActivity.C(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                barDetailWidgetConfigureActivity3.O = 0;
                                                barDetailWidgetConfigureActivity3.E(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                barDetailWidgetConfigureActivity3.M = 0;
                                                barDetailWidgetConfigureActivity3.D(imageView32, 0);
                                                barDetailWidgetConfigureActivity3.B();
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
            ChipGroup chipGroup = (ChipGroup) barDetailWidgetConfigureActivity.findViewById(R.id.type_chipgroup);
            try {
                ArrayList arrayList = new ArrayList();
                File[] externalFilesDirs = barDetailWidgetConfigureActivity.getExternalFilesDirs(null);
                if (externalFilesDirs.length > 1) {
                    arrayList.add(externalFilesDirs[1].toString());
                }
                if (externalFilesDirs.length > 2) {
                    arrayList.add(externalFilesDirs[2].toString());
                }
                Collections.addAll(arrayList, "/sdcard2", "/mnt/external_sd", "/mnt/external_sd", Gvyagftz.dTZMrTnYOzuE, "/storage/sdcard1/", "/storage/usbcard1/", "/storage/external_SD/", "/mnt/extsdcard/", YHJbtPFAANaPQ.gNUjKXVovPY, "/storage/extsdcard/");
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    String str = (String) obj;
                    if (uz1.q(str) && !sl.G(barDetailWidgetConfigureActivity, new File(str))[0].equals("0.00B")) {
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            chipGroup.removeView(chipGroup.findViewById(R.id.chip_sdcard));
            if (!om0.B()) {
                chipGroup.removeView(chipGroup.findViewById(R.id.chip_zram));
            }
            chipGroup.setOnCheckedStateChangeListener(new tb(barDetailWidgetConfigureActivity, i4, chipGroup));
            chipGroup.setSelectionRequired(true);
            String O = sl.O(barDetailWidgetConfigureActivity.S, "bar_type_");
            barDetailWidgetConfigureActivity.J = O;
            if (O == null) {
                barDetailWidgetConfigureActivity.J = "RAM";
            }
            for (int i6 = 0; i6 < chipGroup.getChildCount(); i6++) {
                Chip chip = (Chip) chipGroup.getChildAt(i6);
                if (chip.getTag().equals(barDetailWidgetConfigureActivity.J)) {
                    chip.setChecked(true);
                }
            }
            RadioGroup radioGroup = (RadioGroup) barDetailWidgetConfigureActivity.findViewById(R.id.click_radiogroup);
            radioGroup.setOnCheckedChangeListener(new sc(barDetailWidgetConfigureActivity, radioGroup, 0));
            String O2 = sl.O(barDetailWidgetConfigureActivity.S, "bar_onclick_");
            barDetailWidgetConfigureActivity.K = O2;
            if (O2 == null) {
                barDetailWidgetConfigureActivity.K = "CONFIGURE";
            }
            while (i2 < radioGroup.getChildCount()) {
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i2);
                if (radioButton.getTag().equals(barDetailWidgetConfigureActivity.K)) {
                    radioButton.setChecked(true);
                }
                i2++;
            }
        }
    }

    public static void C(ImageView imageView, int i) {
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
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.widget_bar_detail);
        this.I = remoteViews;
        remoteViews.setViewVisibility(R.id.loading, 8);
        this.I.setViewVisibility(R.id.title_layout, 8);
        String str = this.P;
        if (str != null) {
            this.I.setTextViewText(R.id.title, str);
        }
        String str2 = this.Q;
        if (str2 != null) {
            this.I.setTextViewText(R.id.free, str2);
        }
        this.I.setProgressBar(R.id.pbPercent, 100, this.R, false);
        int i = Build.VERSION.SDK_INT;
        RemoteViews remoteViews2 = this.I;
        if (i >= 31) {
            remoteViews2.setFloat(R.id.image, "setAlpha", this.L / 100.0f);
        } else {
            remoteViews2.setInt(R.id.image, "setImageAlpha", (int) (this.L * 2.55d));
        }
        tl2.c(this.I, this.M);
        je2.b(this.I, this.N, R.id.free);
        je2.c(this.I, this.N, "setProgressTintList", R.id.pbPercent);
        c3.a(this.I, this.O, R.id.title);
        View view = this.G;
        if (view != null) {
            this.H.removeView(view);
        }
        View apply = this.I.apply(this, this.H);
        this.G = apply;
        this.H.addView(apply);
    }

    public final void D(ImageView imageView, int i) {
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

    public final void E(ImageView imageView, int i) {
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
        TjguQfQF.RhWQOvgynv.invoke(null, this, bundle);
    }
}
