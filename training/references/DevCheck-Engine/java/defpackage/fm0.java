package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class fm0 extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8 f295a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm0(InputConnection inputConnection, p8 p8Var) {
        super(inputConnection, false);
        this.f295a = p8Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        h70 h70Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            h70Var = new h70(new hm0(inputContentInfo));
        }
        if (this.f295a.m(h70Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
