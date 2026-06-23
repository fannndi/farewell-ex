package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class i80 extends s70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f415a = 0;
    public final WeakReference b;

    public i80(EditText editText) {
        this.b = new WeakReference(editText);
    }

    public i80(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }

    @Override // defpackage.s70
    public void a() {
        switch (this.f415a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s70
    public final void b() {
        int i = this.f415a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                j80.a((EditText) weakReference.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    break;
                }
                break;
        }
    }
}
