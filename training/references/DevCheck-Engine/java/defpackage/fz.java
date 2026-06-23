package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class fz extends b90 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz(a90 a90Var, int i) {
        super(a90Var);
        this.e = i;
    }

    @Override // defpackage.b90
    public void q() {
        switch (this.e) {
            case 0:
                a90 a90Var = this.b;
                a90Var.u = null;
                CheckableImageButton checkableImageButton = a90Var.m;
                checkableImageButton.setOnLongClickListener(null);
                kk1.N(checkableImageButton, null);
                break;
        }
    }
}
