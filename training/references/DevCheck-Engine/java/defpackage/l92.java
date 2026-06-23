package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import com.skydoves.colorpickerview.ColorPickerView;

/* loaded from: classes.dex */
public final class l92 implements TextWatcher {
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ int[] h;
    public final /* synthetic */ GradientDrawable i;
    public final /* synthetic */ boolean[] j;
    public final /* synthetic */ ColorPickerView k;

    public l92(boolean[] zArr, int[] iArr, GradientDrawable gradientDrawable, boolean[] zArr2, ColorPickerView colorPickerView) {
        this.g = zArr;
        this.h = iArr;
        this.i = gradientDrawable;
        this.j = zArr2;
        this.k = colorPickerView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean[] zArr = this.j;
        if (this.g[0]) {
            return;
        }
        String trim = editable.toString().trim();
        if (trim.length() == 6) {
            try {
                int parseColor = Color.parseColor("#".concat(trim)) | (-16777216);
                this.h[0] = parseColor;
                this.i.setColor(parseColor);
                zArr[0] = true;
                this.k.setInitialColor(parseColor);
                zArr[0] = false;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
