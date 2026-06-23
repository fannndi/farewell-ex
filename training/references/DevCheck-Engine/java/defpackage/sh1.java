package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import com.pairip.VMRunner;

/* loaded from: classes.dex */
public final class sh1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f937a = 0;
    public Object b;
    public final Object c;

    public sh1(th1 th1Var) {
        this.c = th1Var;
        this.b = new Messenger(new Handler(Looper.getMainLooper(), th1Var));
    }

    public sh1(zf zfVar) {
        this.c = zfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("rXR7w1PmdOMiEHDd", new Object[]{this, context, intent});
    }
}
