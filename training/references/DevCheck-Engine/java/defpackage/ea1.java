package defpackage;

import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class ea1 extends lh1 {
    public final dl0 b;

    public ea1() {
        super(null);
        this.b = new da1(this);
    }

    @Override // defpackage.lh1
    public IBinder g(Intent intent) {
        return this.b;
    }

    @Override // defpackage.lh1
    public boolean k(Intent intent) {
        return false;
    }
}
