package defpackage;

import android.os.PowerManager$OnThermalStatusChangedListener;

/* loaded from: classes.dex */
public final class qy1 implements PowerManager$OnThermalStatusChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c71 f867a;

    public qy1(c71 c71Var) {
        this.f867a = c71Var;
    }

    public final void onThermalStatusChanged(int i) {
        ((qy0) ((ry1) this.f867a.h).d).i(Integer.valueOf(i));
    }
}
