package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class ga1 extends bl {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga1(Context context, int i) {
        super(context);
        this.m = i;
    }

    @Override // defpackage.bl, defpackage.bu, android.app.Dialog
    public final void onStart() {
        switch (this.m) {
            case 0:
                try {
                    Method declaredMethod = c6.class.getDeclaredMethod("onStart", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, null);
                } catch (Throwable unused) {
                    super.onStart();
                }
                new Handler(Looper.getMainLooper()).postDelayed(new r60(13, this), 50L);
                break;
            default:
                try {
                    Method declaredMethod2 = c6.class.getDeclaredMethod("onStart", null);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(this, null);
                } catch (Throwable unused2) {
                    super.onStart();
                }
                new Handler(Looper.getMainLooper()).postDelayed(new r60(26, this), 50L);
                break;
        }
    }
}
