package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class m00 extends AppCompatTextView {
    public boolean n;

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.n) {
            return;
        }
        try {
            if (getText().toString().trim().equals(charSequence.toString().trim())) {
                return;
            }
            this.n = true;
            try {
                super.setText("", bufferType);
                append(charSequence);
            } finally {
                this.n = false;
            }
        } catch (Exception unused) {
        }
    }
}
