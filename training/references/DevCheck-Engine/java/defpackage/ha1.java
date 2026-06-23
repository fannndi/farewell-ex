package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.Fk.Iyrs;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import flar2.devcheck.R;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class ha1 extends dl {
    public LinearLayout A0;
    public LinearLayout B0;
    public LinearLayout C0;
    public TextView D0;
    public View E0;
    public ImageButton F0;
    public ChipGroup G0;
    public ExecutorService L0;
    public String v0;
    public ImageView w0;
    public TextView x0;
    public TextView y0;
    public LinearLayout z0;
    public int u0 = -1;
    public String H0 = null;
    public String I0 = null;
    public long J0 = 0;
    public boolean K0 = false;
    public final HashMap M0 = new HashMap();
    public final HashMap N0 = new HashMap();
    public long O0 = 100;
    public long P0 = 0;

    public static String G0(int i) {
        if (i <= 0) {
            return "0 MB";
        }
        double d = i / 1024.0d;
        return d < 1024.0d ? String.format(Locale.US, "%.0f MB", Double.valueOf(d)) : String.format(Locale.US, "%.2f GB", Double.valueOf(d / 1024.0d));
    }

    public static void J0(a5 a5Var, int i, String str) {
        ha1 ha1Var = new ha1();
        Bundle bundle = new Bundle();
        bundle.putInt("uid", i);
        if (str != null) {
            bundle.putString("pkg", str);
        }
        ha1Var.m0(bundle);
        ha1Var.z0(a5Var.s(), "process_sheet");
    }

    @Override // defpackage.dl
    public final bl A0() {
        return new ga1(i0(), 0);
    }

    public final void B0(LayoutInflater layoutInflater, LinearLayout linearLayout, String str, String str2) {
        View inflate = layoutInflater.inflate(R.layout.item_sheet_kv_row, (ViewGroup) linearLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.kv_label);
        TextView textView2 = (TextView) inflate.findViewById(R.id.kv_value);
        textView.setText(str2);
        textView2.setText("—");
        linearLayout.addView(inflate);
        this.M0.put(str, textView2);
        this.N0.put(str, inflate);
    }

    public final void C0(List list) {
        String str = this.u0 + hTYJVDOvZnZlYL.qiCHMmoDAgywHNB + TextUtils.join(",", list);
        if (str.equals(this.I0)) {
            return;
        }
        this.I0 = str;
        this.C0.removeAllViews();
        boolean isEmpty = list.isEmpty();
        TextView textView = this.D0;
        if (isEmpty) {
            textView.setVisibility(8);
            this.E0.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        this.E0.setVisibility(0);
        int color = z().getColor(android.R.color.darker_gray, g0().getTheme());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            TextView textView2 = new TextView(v());
            textView2.setTextSize(13.0f);
            textView2.setTypeface(Typeface.MONOSPACE);
            textView2.setTextColor(color);
            textView2.setText(str2);
            textView2.setPadding(0, E0(2), 0, E0(2));
            this.C0.addView(textView2);
        }
    }

    public final Chip D0(final int i, String str, int i2, boolean z, final String str2, final ApplicationInfo applicationInfo) {
        Drawable x;
        TypedValue typedValue = new TypedValue();
        i0().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i3 = typedValue.data;
        i0().getTheme().resolveAttribute(R.attr.card_background_color, typedValue, true);
        int i4 = typedValue.data;
        i0().getTheme().resolveAttribute(R.attr.textSecondary, typedValue, true);
        int i5 = typedValue.data;
        Chip chip = new Chip(this.G0.getContext(), null);
        if (z) {
            i5 = -1;
        }
        int b = z ? i3 : ts.b(ts.e(i3, 40), i4);
        chip.setText(str);
        chip.setCheckable(false);
        chip.setClickable(true);
        chip.setFocusable(true);
        chip.setChipBackgroundColor(ColorStateList.valueOf(b));
        chip.setElevation(0.0f);
        chip.setChipStrokeColor(ColorStateList.valueOf(i3));
        chip.setChipStrokeWidth(0.0f);
        chip.setChipCornerRadius(F0(42.0f));
        chip.setTextColor(i5);
        chip.setTextSize(2, 13.0f);
        chip.setChipMinHeight(F0(28.0f));
        chip.setChipStartPadding(F0(4.0f));
        chip.setChipEndPadding(F0(6.0f));
        chip.setAllCaps(false);
        chip.setEllipsize(TextUtils.TruncateAt.END);
        chip.setMaxLines(1);
        chip.setRippleColor(ColorStateList.valueOf(ts.e(i3, 60)));
        if (i2 != 0) {
            TypedValue typedValue2 = new TypedValue();
            if (i0().getTheme().resolveAttribute(i2, typedValue2, true) && (x = k32.x(i0(), typedValue2.resourceId)) != null) {
                Drawable mutate = x.mutate();
                mutate.setTint(i5);
                chip.setChipIcon(mutate);
                chip.setChipIconVisible(true);
                chip.setChipIconSize(F0(14.0f));
                chip.setIconStartPadding(F0(6.0f));
                chip.setTextStartPadding(F0(4.0f));
            }
        }
        chip.setOnClickListener(new View.OnClickListener() { // from class: fa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3 = XmJDY.FFfenwCKjBLsUm;
                ha1 ha1Var = ha1.this;
                a5 t = ha1Var.t();
                if (t != null) {
                    int i6 = i;
                    String str4 = str2;
                    try {
                        if (i6 == R.id.action_open) {
                            Intent launchIntentForPackage = t.getPackageManager().getLaunchIntentForPackage(str4);
                            if (launchIntentForPackage != null) {
                                ha1Var.s0(launchIntentForPackage);
                                return;
                            } else {
                                Toast.makeText(ha1Var.i0(), ha1Var.A(R.string.not_found), 0).show();
                                return;
                            }
                        }
                        if (i6 == R.id.action_details) {
                            ApplicationInfo applicationInfo2 = applicationInfo;
                            if (applicationInfo2 != null) {
                                p51 p51Var = new p51();
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("appInfo", applicationInfo2);
                                p51Var.m0(bundle);
                                p51Var.z0(t.s(), nyGJ.NZNhnmV);
                                return;
                            }
                            return;
                        }
                        if (i6 == R.id.action_uninstall) {
                            Intent intent = new Intent("android.intent.action.DELETE");
                            intent.setData(Uri.parse(str3.concat(str4)));
                            ha1Var.s0(intent);
                        } else if (i6 == R.id.action_kill) {
                            ju0.q0("am force-stop ".concat(ju0.r0(str4)));
                            Toast.makeText(ha1Var.i0(), ha1Var.A(R.string.stopping) + " " + str4, 0).show();
                            ha1Var.v0(false, false);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
        return chip;
    }

    public final int E0(int i) {
        return (int) (i * z().getDisplayMetrics().density);
    }

    public final float F0(float f) {
        return f * z().getDisplayMetrics().density;
    }

    public final void H0(int i, String str) {
        View view = (View) this.N0.get(str);
        if (i > 0) {
            if (view != null) {
                view.setVisibility(0);
            }
            I0(str, G0(i));
        } else if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void I0(String str, String str2) {
        TextView textView = (TextView) this.M0.get(str);
        if (textView != null) {
            textView.setText(str2);
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.sheet_process_details, viewGroup, false);
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void Q() {
        ExecutorService executorService = this.L0;
        if (executorService != null) {
            executorService.shutdownNow();
            this.L0 = null;
        }
        super.Q();
    }

    @Override // defpackage.dl, defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        super.c0(view, bundle);
        Bundle bundle2 = this.m;
        this.u0 = bundle2 != null ? bundle2.getInt("uid", -1) : -1;
        Bundle bundle3 = this.m;
        this.v0 = bundle3 != null ? bundle3.getString("pkg") : null;
        if (this.u0 < 0) {
            v0(false, false);
            return;
        }
        try {
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            this.O0 = sysconf;
            if (sysconf <= 0) {
                this.O0 = 100L;
            }
        } catch (Throwable unused) {
        }
        this.P0 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        this.w0 = (ImageView) view.findViewById(R.id.sheet_icon);
        this.x0 = (TextView) view.findViewById(R.id.sheet_title);
        this.y0 = (TextView) view.findViewById(R.id.sheet_subtitle);
        this.z0 = (LinearLayout) view.findViewById(R.id.process_rows);
        this.A0 = (LinearLayout) view.findViewById(R.id.memory_rows);
        this.B0 = (LinearLayout) view.findViewById(R.id.children_container);
        this.C0 = (LinearLayout) view.findViewById(R.id.services_container);
        this.D0 = (TextView) view.findViewById(R.id.section_services);
        this.E0 = view.findViewById(R.id.services_card);
        this.F0 = (ImageButton) view.findViewById(R.id.more_actions);
        this.G0 = (ChipGroup) view.findViewById(R.id.pill_row);
        LayoutInflater from = LayoutInflater.from(view.getContext());
        B0(from, this.z0, "uid", A(R.string.uid));
        B0(from, this.z0, "cpu", A(R.string.cpu));
        B0(from, this.z0, "threads", A(R.string.taskmgr_threads));
        B0(from, this.z0, Iyrs.mcKhvSm, A(R.string.uptime));
        B0(from, this.z0, "cpu_time", A(R.string.taskmgr_cpu_time));
        B0(from, this.z0, "oom", A(R.string.taskmgr_oom_adj));
        B0(from, this.z0, "state", A(R.string.state));
        B0(from, this.A0, "pss", A(R.string.taskmgr_pss));
        B0(from, this.A0, "rss", A(R.string.taskmgr_rss));
        B0(from, this.A0, "peak_rss", A(R.string.taskmgr_peak_rss));
        B0(from, this.A0, "swap", A(R.string.taskmgr_swap));
        B0(from, this.A0, "java_heap", A(R.string.taskmgr_java_heap));
        B0(from, this.A0, "native_heap", A(R.string.taskmgr_native_heap));
        B0(from, this.A0, "graphics", A(R.string.taskmgr_graphics));
        a5 t = t();
        if (t instanceof TaskManager2Activity) {
            ((TaskManager2Activity) t).F.d.e(D(), new nc(23, this));
        }
        this.F0.setOnClickListener(new tc(24, this));
    }
}
