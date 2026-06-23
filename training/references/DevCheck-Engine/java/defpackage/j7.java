package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class j7 extends i7 {
    public final /* synthetic */ AppCompatTextView l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.l = appCompatTextView;
    }

    @Override // defpackage.gm2, defpackage.h7
    public final void J(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
