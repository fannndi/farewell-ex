package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import flar2.devcheck.tests.MicActivity;
import java.util.Timer;

/* loaded from: classes.dex */
public final class od1 {

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f728a;
    public boolean b;
    public int c;
    public NoiseSuppressor d;
    public MicActivity e;
    public Timer f;

    public final void a() {
        try {
            this.f = new Timer();
            this.f728a.startRecording();
            this.b = true;
            this.f.schedule(new nd1(this, new byte[this.c]), 0L, 50L);
        } catch (NullPointerException unused) {
            this.b = false;
        }
    }
}
