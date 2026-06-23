package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dq extends ka0 {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // defpackage.ka0
    public final int n(float f, float f2) {
        RectF closeIconTouchBounds;
        Rect rect = Chip.D;
        Chip chip = this.q;
        if (!chip.d()) {
            return 0;
        }
        closeIconTouchBounds = chip.getCloseIconTouchBounds();
        return closeIconTouchBounds.contains(f, f2) ? 1 : 0;
    }

    @Override // defpackage.ka0
    public final void o(ArrayList arrayList) {
        fq fqVar;
        arrayList.add(0);
        Rect rect = Chip.D;
        Chip chip = this.q;
        if (!chip.d() || (fqVar = chip.k) == null || !fqVar.a0 || chip.n == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // defpackage.ka0
    public final boolean r(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.n;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.z) {
                    chip.y.w(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.ka0
    public final void s(c1 c1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1Var.f104a;
        Chip chip = this.q;
        fq fqVar = chip.k;
        accessibilityNodeInfo.setCheckable(fqVar != null && fqVar.g0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1Var.i(chip.getAccessibilityClassName());
        c1Var.m(chip.getText());
    }

    @Override // defpackage.ka0
    public final void t(int i, c1 c1Var) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c1Var.f104a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            c1Var.h(Chip.D);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        c1Var.h(closeIconTouchBoundsInt);
        c1Var.b(v0.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        c1Var.i(Button.class.getName());
    }

    @Override // defpackage.ka0
    public final void u(int i, boolean z) {
        Chip chip = this.q;
        if (i == 1) {
            chip.t = z;
        }
        fq fqVar = chip.k;
        boolean z2 = chip.t;
        boolean z3 = false;
        if (fqVar.b0 != null) {
            z3 = fqVar.d0(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : fq.V0);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }
}
