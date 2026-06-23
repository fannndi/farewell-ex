package defpackage;

import android.content.res.ColorStateList;
import android.media.MediaPlayer;
import flar2.devcheck.R;
import flar2.devcheck.tests.EarpieceActivity;
import flar2.devcheck.tests.HeadsetActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class vi0 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1087a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ vi0(a5 a5Var, int i) {
        this.f1087a = i;
        this.b = a5Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.f1087a;
        a5 a5Var = this.b;
        switch (i) {
            case 0:
                HeadsetActivity headsetActivity = (HeadsetActivity) a5Var;
                int i2 = HeadsetActivity.S;
                MediaPlayer create = MediaPlayer.create(headsetActivity, R.raw.left);
                headsetActivity.F = create;
                create.setLooping(false);
                headsetActivity.F.start();
                headsetActivity.K.setImageDrawable(headsetActivity.I);
                headsetActivity.L.setImageDrawable(headsetActivity.J);
                headsetActivity.K.setImageTintList(ColorStateList.valueOf(headsetActivity.G));
                headsetActivity.L.setImageTintList(ColorStateList.valueOf(headsetActivity.H));
                headsetActivity.F.setOnCompletionListener(new vi0(headsetActivity, 1));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                HeadsetActivity headsetActivity2 = (HeadsetActivity) a5Var;
                int i3 = HeadsetActivity.S;
                MediaPlayer create2 = MediaPlayer.create(headsetActivity2, R.raw.right);
                headsetActivity2.F = create2;
                create2.setLooping(false);
                headsetActivity2.F.start();
                headsetActivity2.K.setImageDrawable(headsetActivity2.J);
                headsetActivity2.L.setImageDrawable(headsetActivity2.I);
                headsetActivity2.K.setImageTintList(ColorStateList.valueOf(headsetActivity2.H));
                headsetActivity2.L.setImageTintList(ColorStateList.valueOf(headsetActivity2.G));
                headsetActivity2.F.setOnCompletionListener(new vi0(headsetActivity2, 2));
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                HeadsetActivity headsetActivity3 = (HeadsetActivity) a5Var;
                headsetActivity3.K.setImageDrawable(headsetActivity3.J);
                headsetActivity3.L.setImageDrawable(headsetActivity3.J);
                headsetActivity3.K.setImageTintList(ColorStateList.valueOf(headsetActivity3.H));
                headsetActivity3.L.setImageTintList(ColorStateList.valueOf(headsetActivity3.H));
                break;
            default:
                EarpieceActivity earpieceActivity = (EarpieceActivity) a5Var;
                earpieceActivity.I.setImageDrawable(earpieceActivity.M);
                earpieceActivity.I.setImageTintList(ColorStateList.valueOf(earpieceActivity.H));
                break;
        }
    }
}
