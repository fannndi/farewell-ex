package defpackage;

import android.telephony.euicc.EuiccManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p0 {
    public static /* bridge */ /* synthetic */ EuiccManager f(Object obj) {
        return (EuiccManager) obj;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }
}
