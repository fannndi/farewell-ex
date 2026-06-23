package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import flar2.devcheck.colorPicker.ColorPickerPalette;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class aq implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq(int i, Object obj) {
        this.f47a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f47a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                pv0 pv0Var = chip.p;
                if (pv0Var != null) {
                    tp tpVar = (tp) ((gm2) pv0Var).h;
                    if (!z ? tpVar.e(chip, tpVar.b) : tpVar.a(chip)) {
                        tpVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.o;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                DashWidgetConfigureActivity dashWidgetConfigureActivity = (DashWidgetConfigureActivity) obj;
                dashWidgetConfigureActivity.K = z;
                dashWidgetConfigureActivity.B();
                break;
            default:
                ColorPickerPalette colorPickerPalette = ((m01) obj).x0;
                if (!z) {
                    colorPickerPalette.setAlpha(1.0f);
                    break;
                } else {
                    colorPickerPalette.setAlpha(0.3f);
                    break;
                }
        }
    }
}
