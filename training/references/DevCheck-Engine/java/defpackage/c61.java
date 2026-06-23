package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class c61 extends b90 {
    public final int e;
    public EditText f;
    public final tc g;

    public c61(a90 a90Var, int i) {
        super(a90Var);
        this.e = R.drawable.design_password_eye;
        this.g = new tc(23, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.b90
    public final void b() {
        p();
    }

    @Override // defpackage.b90
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.b90
    public final int d() {
        return this.e;
    }

    @Override // defpackage.b90
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.b90
    public final boolean j() {
        return true;
    }

    @Override // defpackage.b90
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.b90
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.b90
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.b90
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
