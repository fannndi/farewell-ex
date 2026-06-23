package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class i7 extends gm2 {
    public final /* synthetic */ AppCompatTextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(AppCompatTextView appCompatTextView) {
        super(8, appCompatTextView);
        this.k = appCompatTextView;
    }

    @Override // defpackage.gm2, defpackage.h7
    public final void C(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.gm2, defpackage.h7
    public final void k(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
