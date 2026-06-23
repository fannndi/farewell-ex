package defpackage;

import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class uv0 extends kk1 {
    public final int i;

    public uv0(int i) {
        this.i = i;
    }

    @Override // defpackage.kk1
    public final void O(Object obj, float f) {
        vv0 vv0Var = (vv0) obj;
        float[] fArr = vv0Var.I;
        if (fArr != null) {
            int i = this.i;
            if (fArr[i] != f) {
                fArr[i] = f;
                p8 p8Var = vv0Var.K;
                if (p8Var != null) {
                    float j = vv0Var.j();
                    MaterialButton materialButton = (MaterialButton) p8Var.h;
                    int i2 = (int) (j * 0.11f);
                    if (materialButton.K != i2) {
                        materialButton.K = i2;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                vv0Var.invalidateSelf();
            }
        }
    }

    @Override // defpackage.kk1
    public final float u(Object obj) {
        float[] fArr = ((vv0) obj).I;
        if (fArr != null) {
            return fArr[this.i];
        }
        return 0.0f;
    }
}
