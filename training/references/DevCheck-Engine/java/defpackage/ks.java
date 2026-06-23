package defpackage;

import com.skydoves.colorpickerview.ColorPickerView;

/* loaded from: classes.dex */
public final /* synthetic */ class ks implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ ColorPickerView h;
    public final /* synthetic */ int i;

    public /* synthetic */ ks(ColorPickerView colorPickerView, int i, int i2) {
        this.g = i2;
        this.h = colorPickerView;
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        int i2 = this.i;
        ColorPickerView colorPickerView = this.h;
        switch (i) {
            case 0:
                int i3 = ColorPickerView.B;
                try {
                    colorPickerView.g(i2);
                    break;
                } catch (IllegalAccessException unused) {
                    return;
                }
            default:
                int i4 = ColorPickerView.B;
                try {
                    colorPickerView.g(i2);
                    break;
                } catch (IllegalAccessException unused2) {
                    return;
                }
        }
    }
}
