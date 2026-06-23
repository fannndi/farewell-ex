package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.TranslateActivity;
import java.lang.ref.WeakReference;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class kk implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final Object h;

    public /* synthetic */ kk(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    public kk(lk lkVar) {
        this.g = 0;
        this.h = new WeakReference(lkVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((lk) weakReference.get()).e(true);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                yr0 yr0Var = (yr0) obj;
                yr0Var.B0 = i;
                yr0Var.A0 = -1;
                dialogInterface.dismiss();
                break;
            default:
                Intent intent = new Intent(YHJbtPFAANaPQ.VAm);
                intent.setData(Uri.parse("https://oskwvu0.oneskyapp.com/collaboration/project/90019"));
                try {
                    ((TranslateActivity) obj).startActivity(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
        }
    }
}
