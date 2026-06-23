package flar2.devcheck.widgets.dashWidget;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.bottomnavigation.ES.nscsSk;
import com.google.android.material.slider.Slider;
import defpackage.a5;
import defpackage.af1;
import defpackage.aq;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.je2;
import defpackage.n3;
import defpackage.n72;
import defpackage.nc;
import defpackage.p62;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.qc;
import defpackage.rj;
import defpackage.rt0;
import defpackage.sc;
import defpackage.sj;
import defpackage.sl;
import defpackage.tl2;
import defpackage.u8;
import defpackage.uz;
import defpackage.uz1;
import defpackage.vc;
import defpackage.vq;
import defpackage.wc;
import defpackage.wz;
import defpackage.y62;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class DashWidgetConfigureActivity extends a5 {
    public static final /* synthetic */ int V = 0;
    public n3 F;
    public TextView G;
    public View H;
    public FrameLayout I;
    public String J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public String P;
    public WeakReference Q;
    public RemoteViews R;
    public TextView S;
    public int T = 0;
    public EditText U;

    /* loaded from: classes2.dex */
    public abstract class c2020060317 extends a5 {
        public static final void onCreate(final DashWidgetConfigureActivity dashWidgetConfigureActivity, Bundle bundle) {
            int i = Build.VERSION.SDK_INT;
            if (i < 31) {
                c3.z(dashWidgetConfigureActivity);
            } else if (uz1.h0(dashWidgetConfigureActivity)) {
                dashWidgetConfigureActivity.setTheme(R.style.AppThemeMaterial3Dark);
            } else {
                dashWidgetConfigureActivity.setTheme(R.style.AppThemeMaterial3Light);
            }
            super.onCreate(bundle);
            dashWidgetConfigureActivity.k().a(dashWidgetConfigureActivity, new vc(4, dashWidgetConfigureActivity));
            final int i2 = 0;
            dashWidgetConfigureActivity.setResult(0);
            dashWidgetConfigureActivity.setContentView(R.layout.widget_dash_configure);
            pr.m(dashWidgetConfigureActivity.getWindow());
            FrameLayout frameLayout = (FrameLayout) dashWidgetConfigureActivity.findViewById(R.id.root);
            u8 u8Var = new u8(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), frameLayout.getPaddingBottom(), 4);
            WeakHashMap weakHashMap = y62.f1215a;
            p62.c(frameLayout, u8Var);
            dashWidgetConfigureActivity.getWindow().setStatusBarColor(0);
            Bundle extras = dashWidgetConfigureActivity.getIntent().getExtras();
            if (extras != null) {
                dashWidgetConfigureActivity.T = extras.getInt("appWidgetId", 0);
            }
            if (dashWidgetConfigureActivity.T == 0) {
                dashWidgetConfigureActivity.finish();
                return;
            }
            dashWidgetConfigureActivity.Q = new WeakReference(dashWidgetConfigureActivity);
            rj rjVar = new rj((pj) ((MainApp) dashWidgetConfigureActivity.getApplication()).g.g, 0);
            n72 l = dashWidgetConfigureActivity.l();
            py0 h = dashWidgetConfigureActivity.h();
            l.getClass();
            gr grVar = new gr(l, rjVar, h);
            vq a2 = af1.a(sj.class);
            String b = a2.b();
            if (b == null) {
                c.m("Local and anonymous classes can not be ViewModels");
                return;
            }
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(dashWidgetConfigureActivity, new nc(10, dashWidgetConfigureActivity));
            dashWidgetConfigureActivity.I = (FrameLayout) dashWidgetConfigureActivity.findViewById(R.id.widget_container);
            dashWidgetConfigureActivity.S = (TextView) dashWidgetConfigureActivity.findViewById(R.id.title_text);
            String q = rt0.q(dashWidgetConfigureActivity);
            dashWidgetConfigureActivity.P = q;
            dashWidgetConfigureActivity.S.setText(q);
            final int i3 = 1;
            dashWidgetConfigureActivity.S.setOnClickListener(new uz(dashWidgetConfigureActivity, i3));
            dashWidgetConfigureActivity.G = (TextView) dashWidgetConfigureActivity.findViewById(R.id.opacity_value);
            Slider slider = (Slider) dashWidgetConfigureActivity.findViewById(R.id.opacity_slider);
            final int i4 = 2;
            slider.t.add(new wc(dashWidgetConfigureActivity, i4));
            slider.a(new qc(dashWidgetConfigureActivity, 3));
            int N = sl.N(dashWidgetConfigureActivity.T, GFUHKHDfiFuPm.UIyzjlyYwwdvgJ);
            dashWidgetConfigureActivity.L = N;
            if (N < 0 || N > 100) {
                dashWidgetConfigureActivity.L = 100;
            }
            slider.setValue(dashWidgetConfigureActivity.L);
            dashWidgetConfigureActivity.G.setText(dashWidgetConfigureActivity.L + "%");
            dashWidgetConfigureActivity.M = tl2.m(dashWidgetConfigureActivity, dashWidgetConfigureActivity.T);
            final ImageView imageView = (ImageView) dashWidgetConfigureActivity.findViewById(R.id.widget_color_preview);
            dashWidgetConfigureActivity.D(imageView, dashWidgetConfigureActivity.M);
            dashWidgetConfigureActivity.findViewById(R.id.widget_color_row).setOnClickListener(new View.OnClickListener() { // from class: vz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i2;
                    final ImageView imageView2 = imageView;
                    final DashWidgetConfigureActivity dashWidgetConfigureActivity2 = dashWidgetConfigureActivity;
                    switch (i5) {
                        case 0:
                            int i6 = DashWidgetConfigureActivity.V;
                            String string = dashWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                            int i7 = dashWidgetConfigureActivity2.M;
                            if (i7 == 0) {
                                i7 = tl2.r(dashWidgetConfigureActivity2);
                            }
                            final int i8 = 2;
                            rt0.J(dashWidgetConfigureActivity2, string, i7, new m92() { // from class: sz
                                @Override // defpackage.m92
                                public final void a(int i9) {
                                    int i10 = i8;
                                    ImageView imageView3 = imageView2;
                                    DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                    switch (i10) {
                                        case 0:
                                            dashWidgetConfigureActivity3.N = i9;
                                            DashWidgetConfigureActivity.C(imageView3, i9);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            dashWidgetConfigureActivity3.O = i9;
                                            dashWidgetConfigureActivity3.E(imageView3, i9);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            dashWidgetConfigureActivity3.M = i9;
                                            dashWidgetConfigureActivity3.D(imageView3, i9);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: tz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i9 = i8;
                                    ImageView imageView3 = imageView2;
                                    DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                    switch (i9) {
                                        case 0:
                                            dashWidgetConfigureActivity3.N = 0;
                                            DashWidgetConfigureActivity.C(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            dashWidgetConfigureActivity3.O = 0;
                                            dashWidgetConfigureActivity3.E(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            dashWidgetConfigureActivity3.M = 0;
                                            dashWidgetConfigureActivity3.D(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i9 = DashWidgetConfigureActivity.V;
                            String string2 = dashWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                            int i10 = dashWidgetConfigureActivity2.N;
                            if (i10 == 0) {
                                i10 = je2.y(dashWidgetConfigureActivity2);
                            }
                            final int i11 = 0;
                            rt0.J(dashWidgetConfigureActivity2, string2, i10, new m92() { // from class: sz
                                @Override // defpackage.m92
                                public final void a(int i92) {
                                    int i102 = i11;
                                    ImageView imageView3 = imageView2;
                                    DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                    switch (i102) {
                                        case 0:
                                            dashWidgetConfigureActivity3.N = i92;
                                            DashWidgetConfigureActivity.C(imageView3, i92);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            dashWidgetConfigureActivity3.O = i92;
                                            dashWidgetConfigureActivity3.E(imageView3, i92);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            dashWidgetConfigureActivity3.M = i92;
                                            dashWidgetConfigureActivity3.D(imageView3, i92);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: tz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i92 = i11;
                                    ImageView imageView3 = imageView2;
                                    DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                    switch (i92) {
                                        case 0:
                                            dashWidgetConfigureActivity3.N = 0;
                                            DashWidgetConfigureActivity.C(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            dashWidgetConfigureActivity3.O = 0;
                                            dashWidgetConfigureActivity3.E(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            dashWidgetConfigureActivity3.M = 0;
                                            dashWidgetConfigureActivity3.D(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            int i12 = DashWidgetConfigureActivity.V;
                            String string3 = dashWidgetConfigureActivity2.getString(R.string.widget_label_color);
                            int i13 = dashWidgetConfigureActivity2.O;
                            if (i13 == 0) {
                                i13 = c3.q(dashWidgetConfigureActivity2);
                            }
                            final int i14 = 1;
                            rt0.J(dashWidgetConfigureActivity2, string3, i13, new m92() { // from class: sz
                                @Override // defpackage.m92
                                public final void a(int i92) {
                                    int i102 = i14;
                                    ImageView imageView3 = imageView2;
                                    DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                    switch (i102) {
                                        case 0:
                                            dashWidgetConfigureActivity3.N = i92;
                                            DashWidgetConfigureActivity.C(imageView3, i92);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            dashWidgetConfigureActivity3.O = i92;
                                            dashWidgetConfigureActivity3.E(imageView3, i92);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            dashWidgetConfigureActivity3.M = i92;
                                            dashWidgetConfigureActivity3.D(imageView3, i92);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            }, new Runnable() { // from class: tz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i92 = i14;
                                    ImageView imageView3 = imageView2;
                                    DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                    switch (i92) {
                                        case 0:
                                            dashWidgetConfigureActivity3.N = 0;
                                            DashWidgetConfigureActivity.C(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                            dashWidgetConfigureActivity3.O = 0;
                                            dashWidgetConfigureActivity3.E(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                        default:
                                            dashWidgetConfigureActivity3.M = 0;
                                            dashWidgetConfigureActivity3.D(imageView3, 0);
                                            dashWidgetConfigureActivity3.B();
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            View findViewById = dashWidgetConfigureActivity.findViewById(R.id.widget_accent_row);
            if (i >= 31) {
                dashWidgetConfigureActivity.N = je2.r(dashWidgetConfigureActivity, dashWidgetConfigureActivity.T);
                final ImageView imageView2 = (ImageView) dashWidgetConfigureActivity.findViewById(R.id.widget_accent_preview);
                DashWidgetConfigureActivity.C(imageView2, dashWidgetConfigureActivity.N);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: vz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i3;
                        final ImageView imageView22 = imageView2;
                        final DashWidgetConfigureActivity dashWidgetConfigureActivity2 = dashWidgetConfigureActivity;
                        switch (i5) {
                            case 0:
                                int i6 = DashWidgetConfigureActivity.V;
                                String string = dashWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                                int i7 = dashWidgetConfigureActivity2.M;
                                if (i7 == 0) {
                                    i7 = tl2.r(dashWidgetConfigureActivity2);
                                }
                                final int i8 = 2;
                                rt0.J(dashWidgetConfigureActivity2, string, i7, new m92() { // from class: sz
                                    @Override // defpackage.m92
                                    public final void a(int i92) {
                                        int i102 = i8;
                                        ImageView imageView3 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = i92;
                                                DashWidgetConfigureActivity.C(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = i92;
                                                dashWidgetConfigureActivity3.E(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = i92;
                                                dashWidgetConfigureActivity3.D(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: tz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i92 = i8;
                                        ImageView imageView3 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i92) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = 0;
                                                DashWidgetConfigureActivity.C(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = 0;
                                                dashWidgetConfigureActivity3.E(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = 0;
                                                dashWidgetConfigureActivity3.D(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i9 = DashWidgetConfigureActivity.V;
                                String string2 = dashWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                                int i10 = dashWidgetConfigureActivity2.N;
                                if (i10 == 0) {
                                    i10 = je2.y(dashWidgetConfigureActivity2);
                                }
                                final int i11 = 0;
                                rt0.J(dashWidgetConfigureActivity2, string2, i10, new m92() { // from class: sz
                                    @Override // defpackage.m92
                                    public final void a(int i92) {
                                        int i102 = i11;
                                        ImageView imageView3 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = i92;
                                                DashWidgetConfigureActivity.C(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = i92;
                                                dashWidgetConfigureActivity3.E(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = i92;
                                                dashWidgetConfigureActivity3.D(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: tz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i92 = i11;
                                        ImageView imageView3 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i92) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = 0;
                                                DashWidgetConfigureActivity.C(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = 0;
                                                dashWidgetConfigureActivity3.E(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = 0;
                                                dashWidgetConfigureActivity3.D(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i12 = DashWidgetConfigureActivity.V;
                                String string3 = dashWidgetConfigureActivity2.getString(R.string.widget_label_color);
                                int i13 = dashWidgetConfigureActivity2.O;
                                if (i13 == 0) {
                                    i13 = c3.q(dashWidgetConfigureActivity2);
                                }
                                final int i14 = 1;
                                rt0.J(dashWidgetConfigureActivity2, string3, i13, new m92() { // from class: sz
                                    @Override // defpackage.m92
                                    public final void a(int i92) {
                                        int i102 = i14;
                                        ImageView imageView3 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = i92;
                                                DashWidgetConfigureActivity.C(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = i92;
                                                dashWidgetConfigureActivity3.E(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = i92;
                                                dashWidgetConfigureActivity3.D(imageView3, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: tz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i92 = i14;
                                        ImageView imageView3 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i92) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = 0;
                                                DashWidgetConfigureActivity.C(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = 0;
                                                dashWidgetConfigureActivity3.E(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = 0;
                                                dashWidgetConfigureActivity3.D(imageView3, 0);
                                                dashWidgetConfigureActivity3.B();
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
            View findViewById2 = dashWidgetConfigureActivity.findViewById(R.id.widget_label_row);
            if (i >= 31) {
                dashWidgetConfigureActivity.O = c3.p(dashWidgetConfigureActivity, dashWidgetConfigureActivity.T);
                final ImageView imageView3 = (ImageView) dashWidgetConfigureActivity.findViewById(R.id.widget_label_preview);
                dashWidgetConfigureActivity.E(imageView3, dashWidgetConfigureActivity.O);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: vz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        final ImageView imageView22 = imageView3;
                        final DashWidgetConfigureActivity dashWidgetConfigureActivity2 = dashWidgetConfigureActivity;
                        switch (i5) {
                            case 0:
                                int i6 = DashWidgetConfigureActivity.V;
                                String string = dashWidgetConfigureActivity2.getString(R.string.widget_bg_color);
                                int i7 = dashWidgetConfigureActivity2.M;
                                if (i7 == 0) {
                                    i7 = tl2.r(dashWidgetConfigureActivity2);
                                }
                                final int i8 = 2;
                                rt0.J(dashWidgetConfigureActivity2, string, i7, new m92() { // from class: sz
                                    @Override // defpackage.m92
                                    public final void a(int i92) {
                                        int i102 = i8;
                                        ImageView imageView32 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = i92;
                                                DashWidgetConfigureActivity.C(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = i92;
                                                dashWidgetConfigureActivity3.E(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = i92;
                                                dashWidgetConfigureActivity3.D(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: tz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i92 = i8;
                                        ImageView imageView32 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i92) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = 0;
                                                DashWidgetConfigureActivity.C(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = 0;
                                                dashWidgetConfigureActivity3.E(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = 0;
                                                dashWidgetConfigureActivity3.D(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i9 = DashWidgetConfigureActivity.V;
                                String string2 = dashWidgetConfigureActivity2.getString(R.string.widget_accent_color);
                                int i10 = dashWidgetConfigureActivity2.N;
                                if (i10 == 0) {
                                    i10 = je2.y(dashWidgetConfigureActivity2);
                                }
                                final int i11 = 0;
                                rt0.J(dashWidgetConfigureActivity2, string2, i10, new m92() { // from class: sz
                                    @Override // defpackage.m92
                                    public final void a(int i92) {
                                        int i102 = i11;
                                        ImageView imageView32 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = i92;
                                                DashWidgetConfigureActivity.C(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = i92;
                                                dashWidgetConfigureActivity3.E(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = i92;
                                                dashWidgetConfigureActivity3.D(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: tz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i92 = i11;
                                        ImageView imageView32 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i92) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = 0;
                                                DashWidgetConfigureActivity.C(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = 0;
                                                dashWidgetConfigureActivity3.E(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = 0;
                                                dashWidgetConfigureActivity3.D(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                int i12 = DashWidgetConfigureActivity.V;
                                String string3 = dashWidgetConfigureActivity2.getString(R.string.widget_label_color);
                                int i13 = dashWidgetConfigureActivity2.O;
                                if (i13 == 0) {
                                    i13 = c3.q(dashWidgetConfigureActivity2);
                                }
                                final int i14 = 1;
                                rt0.J(dashWidgetConfigureActivity2, string3, i13, new m92() { // from class: sz
                                    @Override // defpackage.m92
                                    public final void a(int i92) {
                                        int i102 = i14;
                                        ImageView imageView32 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i102) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = i92;
                                                DashWidgetConfigureActivity.C(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = i92;
                                                dashWidgetConfigureActivity3.E(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = i92;
                                                dashWidgetConfigureActivity3.D(imageView32, i92);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                        }
                                    }
                                }, new Runnable() { // from class: tz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i92 = i14;
                                        ImageView imageView32 = imageView22;
                                        DashWidgetConfigureActivity dashWidgetConfigureActivity3 = dashWidgetConfigureActivity2;
                                        switch (i92) {
                                            case 0:
                                                dashWidgetConfigureActivity3.N = 0;
                                                DashWidgetConfigureActivity.C(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                                dashWidgetConfigureActivity3.O = 0;
                                                dashWidgetConfigureActivity3.E(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
                                                break;
                                            default:
                                                dashWidgetConfigureActivity3.M = 0;
                                                dashWidgetConfigureActivity3.D(imageView32, 0);
                                                dashWidgetConfigureActivity3.B();
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
            SwitchCompat switchCompat = (SwitchCompat) dashWidgetConfigureActivity.findViewById(R.id.show_clock);
            if (sl.f(dashWidgetConfigureActivity.T, "dash_clock_")) {
                dashWidgetConfigureActivity.K = sl.M(dashWidgetConfigureActivity.T);
            } else {
                dashWidgetConfigureActivity.K = true;
            }
            switchCompat.setChecked(dashWidgetConfigureActivity.K);
            switchCompat.setOnCheckedChangeListener(new aq(1, dashWidgetConfigureActivity));
            dashWidgetConfigureActivity.B();
            RadioGroup radioGroup = (RadioGroup) dashWidgetConfigureActivity.findViewById(R.id.click_radiogroup);
            radioGroup.setOnCheckedChangeListener(new sc(dashWidgetConfigureActivity, radioGroup, 1));
            String O = sl.O(dashWidgetConfigureActivity.T, "dash_onclick_");
            dashWidgetConfigureActivity.J = O;
            if (O == null) {
                dashWidgetConfigureActivity.J = "CONFIGURE";
            }
            while (i2 < radioGroup.getChildCount()) {
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i2);
                if (radioButton.getTag().equals(dashWidgetConfigureActivity.J)) {
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
        this.R = new RemoteViews(getPackageName(), R.layout.widget_dash);
        wz wzVar = new wz(getApplicationContext());
        this.R.setViewVisibility(R.id.loading, 8);
        this.R.setViewVisibility(R.id.title_layout, 8);
        RemoteViews remoteViews = this.R;
        String str = this.P;
        if (str == null) {
            str = wzVar.f1153a;
        }
        remoteViews.setTextViewText(R.id.model, str);
        this.R.setTextViewText(R.id.soc, wzVar.b);
        this.R.setTextViewText(R.id.uptime2, wzVar.c);
        this.R.setTextViewText(R.id.data_total, wzVar.i);
        this.R.setTextViewText(R.id.temperature, wzVar.h);
        this.R.setTextViewText(R.id.battery_level, wzVar.j);
        this.R.setTextViewText(R.id.date, wzVar.n);
        this.R.setTextViewText(R.id.free, wzVar.d);
        this.R.setTextViewText(R.id.free2, wzVar.e);
        this.R.setImageViewResource(R.id.battery_icon, wzVar.k);
        this.R.setImageViewResource(R.id.logo, wzVar.l);
        if (wzVar.m) {
            this.R.setInt(R.id.logo, hTYJVDOvZnZlYL.JwBFp, -1);
        }
        this.R.setProgressBar(R.id.pbPercent, 100, wzVar.f, false);
        this.R.setProgressBar(R.id.pbPercent2, 100, wzVar.g, false);
        this.R.setViewVisibility(R.id.clock_layout, this.K ? 0 : 8);
        int i = Build.VERSION.SDK_INT;
        RemoteViews remoteViews2 = this.R;
        int i2 = this.L;
        if (i >= 31) {
            remoteViews2.setFloat(R.id.image, "setAlpha", i2 / 100.0f);
        } else {
            remoteViews2.setInt(R.id.image, "setImageAlpha", (int) (i2 * 2.55d));
        }
        tl2.c(this.R, this.M);
        je2.b(this.R, this.N, R.id.textclock, R.id.model, R.id.uptime2, R.id.free, R.id.free2, R.id.battery_level, R.id.temperature, R.id.data_total);
        je2.c(this.R, this.N, "setProgressTintList", R.id.pbPercent, R.id.pbPercent2);
        je2.c(this.R, this.N, "setImageTintList", R.id.battery_icon);
        c3.a(this.R, this.O, R.id.date, R.id.soc, R.id.uptime1, R.id.title, R.id.title2, R.id.title_battery, R.id.title_temperature, R.id.title_data, R.id.data_since, R.id.battery_remaining);
        View view = this.H;
        if (view != null) {
            this.I.removeView(view);
        }
        View apply = this.R.apply(getApplicationContext(), this.I);
        this.H = apply;
        this.I.addView(apply);
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
        nscsSk.jKhJnvSigGYw.invoke(null, this, bundle);
    }
}
