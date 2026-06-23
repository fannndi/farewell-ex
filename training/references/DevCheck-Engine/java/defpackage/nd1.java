package defpackage;

import android.media.AudioRecord;
import flar2.devcheck.tests.MicActivity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class nd1 extends TimerTask {
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ od1 h;

    public nd1(od1 od1Var, byte[] bArr) {
        this.h = od1Var;
        this.g = bArr;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        od1 od1Var = this.h;
        boolean z = od1Var.b;
        AudioRecord audioRecord = od1Var.f728a;
        if (!z) {
            audioRecord.stop();
            od1Var.d.release();
            return;
        }
        int i = od1Var.c;
        byte[] bArr = this.g;
        short s = 0;
        audioRecord.read(bArr, 0, i);
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        if (length > 0) {
            Arrays.sort(sArr);
            s = sArr[length - 1];
        }
        MicActivity micActivity = od1Var.e;
        if (micActivity != null) {
            micActivity.runOnUiThread(new xj(s, 4, micActivity));
        }
    }
}
