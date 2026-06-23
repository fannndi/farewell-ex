package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import flar2.devcheck.R;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class tm1 extends dl {
    public int A0;
    public LinearLayout B0;
    public ChipGroup C0;
    public TextView D0;
    public LinearLayout E0;
    public String u0;
    public int v0 = -1;
    public ArrayList w0;
    public int x0;
    public int y0;
    public int z0;

    @Override // defpackage.dl
    public final bl A0() {
        return new ga1(i0(), 1);
    }

    public final void B0(LinearLayout linearLayout, String str, int i, int i2) {
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(str);
        textView.setTextSize(11.0f);
        textView.setTextColor(i2);
        textView.setIncludeFontPadding(false);
        textView.setPadding(E0(8), E0(2), E0(8), E0(2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(E0(20));
        gradientDrawable.setColor(i);
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = E0(6);
        linearLayout.addView(textView, layoutParams);
    }

    public final void C0(LayoutInflater layoutInflater, String str, String str2) {
        View inflate = layoutInflater.inflate(R.layout.item_sheet_kv_row, (ViewGroup) this.B0, false);
        TextView textView = (TextView) inflate.findViewById(R.id.kv_label);
        TextView textView2 = (TextView) inflate.findViewById(R.id.kv_value);
        textView.setText(str);
        textView2.setText(str2);
        this.B0.addView(inflate);
    }

    public final Chip D0(final int i, String str, int i2, boolean z, final ApplicationInfo applicationInfo) {
        Drawable x;
        Chip chip = new Chip(this.C0.getContext(), null);
        int i3 = z ? -1 : this.y0;
        int i4 = z ? this.z0 : this.A0;
        chip.setText(str);
        chip.setCheckable(false);
        chip.setClickable(true);
        chip.setFocusable(true);
        chip.setChipBackgroundColor(ColorStateList.valueOf(i4));
        chip.setElevation(0.0f);
        chip.setChipStrokeColor(ColorStateList.valueOf(this.z0));
        chip.setChipStrokeWidth(0.0f);
        chip.setChipCornerRadius(F0(42.0f));
        chip.setTextColor(i3);
        chip.setTextSize(2, 13.0f);
        chip.setChipMinHeight(F0(28.0f));
        chip.setChipStartPadding(F0(4.0f));
        chip.setChipEndPadding(F0(6.0f));
        chip.setAllCaps(false);
        chip.setEllipsize(TextUtils.TruncateAt.END);
        chip.setMaxLines(1);
        chip.setRippleColor(ColorStateList.valueOf(ts.e(this.z0, 60)));
        if (i2 != 0) {
            TypedValue typedValue = new TypedValue();
            if (i0().getTheme().resolveAttribute(i2, typedValue, true) && (x = k32.x(i0(), typedValue.resourceId)) != null) {
                Drawable mutate = x.mutate();
                mutate.setTint(i3);
                chip.setChipIcon(mutate);
                chip.setChipIconVisible(true);
                chip.setChipIconSize(F0(14.0f));
                chip.setIconStartPadding(F0(6.0f));
                chip.setTextStartPadding(F0(4.0f));
            }
        }
        chip.setOnClickListener(new View.OnClickListener() { // from class: sm1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                String str3 = nyGJ.FcUXmOINQB;
                tm1 tm1Var = tm1.this;
                a5 t = tm1Var.t();
                if (t == null || (str2 = tm1Var.u0) == null) {
                    return;
                }
                int i5 = i;
                try {
                    if (i5 == R.id.action_open) {
                        Intent launchIntentForPackage = t.getPackageManager().getLaunchIntentForPackage(tm1Var.u0);
                        if (launchIntentForPackage != null) {
                            tm1Var.s0(launchIntentForPackage);
                            return;
                        } else {
                            Toast.makeText(tm1Var.i0(), tm1Var.A(R.string.not_found), 0).show();
                            return;
                        }
                    }
                    if (i5 == R.id.action_details) {
                        ApplicationInfo applicationInfo2 = applicationInfo;
                        if (applicationInfo2 != null) {
                            p51 p51Var = new p51();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("appInfo", applicationInfo2);
                            p51Var.m0(bundle);
                            p51Var.z0(t.s(), "package_info");
                            return;
                        }
                        return;
                    }
                    if (i5 == R.id.action_uninstall) {
                        Intent intent = new Intent("android.intent.action.DELETE");
                        intent.setData(Uri.parse(str3 + tm1Var.u0));
                        tm1Var.s0(intent);
                        return;
                    }
                    if (i5 == R.id.action_kill) {
                        ju0.q0("am force-stop ".concat(ju0.r0(str2)));
                        Toast.makeText(tm1Var.i0(), tm1Var.A(R.string.stopping) + " " + tm1Var.u0, 0).show();
                        tm1Var.v0(false, false);
                    }
                } catch (Exception unused) {
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

    public final boolean G0() {
        ArrayList arrayList = this.w0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if ((((pm1) obj).q & 8) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.sheet_service_list, viewGroup, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02cf, code lost:
    
        r2 = flar2.devcheck.R.string.system;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c3, code lost:
    
        if (G0() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c9, code lost:
    
        if (G0() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02cb, code lost:
    
        r2 = flar2.devcheck.R.string.taskmgr_persistent_system;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02d2, code lost:
    
        C0(r1, A(flar2.devcheck.R.string.type), A(r2));
     */
    @Override // defpackage.dl, defpackage.ld0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm1.c0(android.view.View, android.os.Bundle):void");
    }
}
