package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k3 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509a = 0;
    public Object b;

    public /* synthetic */ k3() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(u81 u81Var, Looper looper) {
        super(looper);
        this.b = u81Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f509a) {
            case 0:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    break;
                }
                break;
            default:
                if (message.what == 1) {
                    u81 u81Var = (u81) this.b;
                    PreferenceScreen preferenceScreen = u81Var.e0.g;
                    if (preferenceScreen != null) {
                        u81Var.f0.setAdapter(new x81(preferenceScreen));
                        preferenceScreen.i();
                        break;
                    }
                }
                break;
        }
    }
}
