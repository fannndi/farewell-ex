package defpackage;

import android.view.Choreographer;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ox0 implements Choreographer.FrameCallback {
    public long b = 0;
    public int c = 0;
    public final ArrayList d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f764a = Choreographer.getInstance();

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2 = j / 1000000;
        long j3 = this.b;
        if (j3 > 0) {
            long j4 = j2 - j3;
            this.c = this.c + 1;
            if (j4 > 250) {
                double d = (r2 * 1000) / j4;
                this.b = j2;
                int i = 0;
                this.c = 0;
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qa0 qa0Var = (qa0) obj;
                    DecimalFormat decimalFormat = qa0Var.f829a;
                    boolean booleanValue = zx0.b("prefFPSStatusBar").booleanValue();
                    TextView textView = qa0Var.b.q;
                    if (booleanValue) {
                        textView.setText(decimalFormat.format(d));
                    } else {
                        textView.setText(d51.v(decimalFormat, d, new StringBuilder(), " fps"));
                    }
                }
            }
        } else {
            this.b = j2;
        }
        this.f764a.postFrameCallback(this);
    }
}
