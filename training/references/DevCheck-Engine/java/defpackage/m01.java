package defpackage;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.media.RfwE.BIxeFreLLop;
import flar2.devcheck.R;
import flar2.devcheck.colorPicker.ColorPickerPalette;

/* loaded from: classes.dex */
public class m01 extends i40 implements is {
    public int A0;
    public SwitchCompat C0;
    public n3 t0;
    public int v0;
    public lt0 w0;
    public ColorPickerPalette x0;
    public ProgressBar y0;
    public int z0;
    public int[] u0 = null;
    public int B0 = R.string.color_picker_default_title;

    @Override // defpackage.i40, defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.B0 = bundle2.getInt("title_id");
            this.v0 = this.m.getInt(BIxeFreLLop.FPxHawJvkZZmpE);
            this.A0 = this.m.getInt("size");
        }
        if (bundle != null) {
            this.u0 = bundle.getIntArray("colors");
            this.z0 = bundle.getInt("selected_color");
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        int i = (z().getDisplayMetrics().widthPixels * 70) / 100;
        try {
            if (z().getConfiguration().orientation == 2 || z().getBoolean(R.bool.isTablet)) {
                i = (z().getDisplayMetrics().widthPixels * 40) / 100;
            }
        } catch (NullPointerException unused) {
        }
        this.o0.getWindow().setLayout(i, -2);
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        bundle.putIntArray("colors", this.u0);
        bundle.putSerializable("selected_color", Integer.valueOf(this.z0));
    }

    @Override // defpackage.is
    public final void k(int i) {
        if (i != this.z0) {
            this.z0 = i;
            this.x0.a(this.u0, i);
        }
    }

    @Override // defpackage.i40
    public final Dialog x0() {
        ProgressBar progressBar;
        int[] iArr;
        View inflate = LayoutInflater.from(g0()).inflate(R.layout.color_picker_dialog, (ViewGroup) null);
        this.y0 = (ProgressBar) inflate.findViewById(android.R.id.progress);
        ColorPickerPalette colorPickerPalette = (ColorPickerPalette) inflate.findViewById(R.id.color_picker);
        this.x0 = colorPickerPalette;
        int i = this.A0;
        colorPickerPalette.j = this.v0;
        Resources resources = colorPickerPalette.getResources();
        if (i == 1) {
            colorPickerPalette.l = resources.getDimensionPixelSize(R.dimen.color_swatch_large);
            colorPickerPalette.i = resources.getDimensionPixelSize(R.dimen.color_swatch_margins_large);
        } else {
            colorPickerPalette.l = resources.getDimensionPixelSize(R.dimen.color_swatch_small);
            colorPickerPalette.i = resources.getDimensionPixelSize(R.dimen.color_swatch_margins_small);
        }
        colorPickerPalette.k = this;
        colorPickerPalette.g = resources.getString(R.string.color_swatch_description);
        colorPickerPalette.h = resources.getString(R.string.color_swatch_description_selected);
        int i2 = 8;
        if (this.u0 != null && (progressBar = this.y0) != null && this.x0 != null) {
            progressBar.setVisibility(8);
            ColorPickerPalette colorPickerPalette2 = this.x0;
            if (colorPickerPalette2 != null && (iArr = this.u0) != null) {
                colorPickerPalette2.a(iArr, this.z0);
            }
            this.x0.setVisibility(0);
        }
        this.C0 = (SwitchCompat) inflate.findViewById(R.id.material_you);
        if (d70.a()) {
            boolean booleanValue = i51.b("prefDC").booleanValue();
            SwitchCompat switchCompat = this.C0;
            if (booleanValue) {
                switchCompat.setChecked(true);
                this.x0.setAlpha(0.3f);
            } else {
                switchCompat.setChecked(false);
                this.x0.setAlpha(1.0f);
            }
            this.C0.setOnCheckedChangeListener(new aq(2, this));
        } else {
            this.C0.setVisibility(8);
            i51.h("prefDC", false);
        }
        th2 th2Var = new th2(g0());
        th2Var.k(this.B0);
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = false;
        th2Var.i(R.string.okay, new qf(i2, this));
        th2Var.g(R.string.cancel, null);
        n3 a2 = th2Var.a();
        this.t0 = a2;
        a2.setCanceledOnTouchOutside(false);
        return this.t0;
    }
}
