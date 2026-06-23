package defpackage;

import android.content.res.ColorStateList;
import android.media.MediaPlayer;
import flar2.devcheck.R;
import flar2.devcheck.tests.SpeakersActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class pp1 implements MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f802a;
    public final /* synthetic */ SpeakersActivity b;

    public /* synthetic */ pp1(SpeakersActivity speakersActivity, int i) {
        this.f802a = i;
        this.b = speakersActivity;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.f802a;
        SpeakersActivity speakersActivity = this.b;
        switch (i) {
            case 0:
                int i2 = SpeakersActivity.S;
                MediaPlayer create = MediaPlayer.create(speakersActivity, R.raw.left);
                speakersActivity.F = create;
                create.setLooping(false);
                speakersActivity.F.start();
                speakersActivity.K.setImageDrawable(speakersActivity.I);
                speakersActivity.L.setImageDrawable(speakersActivity.J);
                speakersActivity.K.setImageTintList(ColorStateList.valueOf(speakersActivity.G));
                speakersActivity.L.setImageTintList(ColorStateList.valueOf(speakersActivity.H));
                speakersActivity.F.setOnCompletionListener(new pp1(speakersActivity, 1));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i3 = SpeakersActivity.S;
                MediaPlayer create2 = MediaPlayer.create(speakersActivity, R.raw.right);
                speakersActivity.F = create2;
                create2.setLooping(false);
                speakersActivity.F.start();
                speakersActivity.K.setImageDrawable(speakersActivity.J);
                speakersActivity.L.setImageDrawable(speakersActivity.I);
                speakersActivity.K.setImageTintList(ColorStateList.valueOf(speakersActivity.H));
                speakersActivity.L.setImageTintList(ColorStateList.valueOf(speakersActivity.G));
                speakersActivity.F.setOnCompletionListener(new pp1(speakersActivity, 2));
                break;
            default:
                speakersActivity.K.setImageDrawable(speakersActivity.J);
                speakersActivity.L.setImageDrawable(speakersActivity.J);
                speakersActivity.K.setImageTintList(ColorStateList.valueOf(speakersActivity.H));
                speakersActivity.L.setImageTintList(ColorStateList.valueOf(speakersActivity.H));
                break;
        }
    }
}
