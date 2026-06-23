package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class bq extends je2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bq(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    private final void e0(int i) {
    }

    @Override // defpackage.je2
    public final void L(int i) {
        switch (this.d) {
            case 0:
                break;
            default:
                rx1 rx1Var = (rx1) this.e;
                rx1Var.e = true;
                qx1 qx1Var = (qx1) rx1Var.f.get();
                if (qx1Var != null) {
                    qx1Var.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.je2
    public final void M(Typeface typeface, boolean z) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                fq fqVar = chip.k;
                chip.setText(fqVar.S0 ? fqVar.U : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    rx1 rx1Var = (rx1) obj;
                    rx1Var.e = true;
                    qx1 qx1Var = (qx1) rx1Var.f.get();
                    if (qx1Var != null) {
                        qx1Var.a();
                        break;
                    }
                }
                break;
        }
    }
}
