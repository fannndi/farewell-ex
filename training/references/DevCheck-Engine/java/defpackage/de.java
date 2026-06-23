package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.slider.Slider;
import flar2.devcheck.R;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class de extends ka0 {
    public final Slider q;
    public final Rect r;

    public de(Slider slider) {
        super(slider);
        this.r = new Rect();
        this.q = slider;
    }

    @Override // defpackage.ka0
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            Slider slider = this.q;
            if (i >= slider.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            slider.F(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.ka0
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.ka0
    public final boolean r(int i, int i2, Bundle bundle) {
        Slider slider = this.q;
        if (!slider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !slider.D(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            slider.G();
            slider.postInvalidate();
            return true;
        }
        float f = slider.B0;
        if (f == 0.0f) {
            f = 1.0f;
        }
        if ((slider.x0 - slider.w0) / f > 20.0f) {
            f *= Math.round(r0 / 20.0f);
        }
        if (i2 == 8192) {
            f = -f;
        }
        if (slider.u()) {
            f = -f;
        }
        if (!slider.D(i, pr.j(slider.getValues().get(i).floatValue() + f, slider.getValueFrom(), slider.getValueTo()))) {
            return false;
        }
        slider.setActiveThumbIndex(i);
        l2 l2Var = slider.k1;
        slider.removeCallbacks(l2Var);
        slider.postDelayed(l2Var, slider.h1);
        slider.G();
        slider.postInvalidate();
        return true;
    }

    @Override // defpackage.ka0
    public final void t(int i, c1 c1Var) {
        Object tag;
        AccessibilityNodeInfo accessibilityNodeInfo = c1Var.f104a;
        c1Var.b(v0.m);
        Slider slider = this.q;
        List<Float> values = slider.getValues();
        float floatValue = values.get(i).floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (floatValue > valueFrom) {
                c1Var.a(rt0.y);
            }
            if (floatValue < valueTo) {
                c1Var.a(rt0.x);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
        } catch (ParseException unused) {
            int i2 = fe.m1;
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
        c1Var.i(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        String n = slider.n(floatValue);
        String string = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            string = i == slider.getValues().size() - 1 ? slider.getContext().getString(R.string.material_slider_range_end) : i == 0 ? slider.getContext().getString(R.string.material_slider_range_start) : "";
        }
        WeakHashMap weakHashMap = y62.f1215a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            tag = v62.b(slider);
        } else {
            tag = slider.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string + ", " + n);
        } else if (i3 >= 30) {
            w0.g(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.r;
        slider.F(i, rect);
        c1Var.h(rect);
    }
}
