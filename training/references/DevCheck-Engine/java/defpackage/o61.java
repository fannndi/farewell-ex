package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class o61 implements TextWatcher {
    public final /* synthetic */ s61 g;
    public final /* synthetic */ p61 h;

    public o61(p61 p61Var, s61 s61Var) {
        this.h = p61Var;
        this.g = s61Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        p61 p61Var = this.h;
        if (p61Var.h0 && charSequence.toString().isEmpty()) {
            charSequence = "*";
        }
        this.g.j.k(charSequence.toString().trim());
        int length = charSequence.length();
        ImageView imageView = p61Var.d0;
        if (length > 0) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }
}
