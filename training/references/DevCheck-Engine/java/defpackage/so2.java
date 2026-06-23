package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class so2 {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f948a;
    public wo2 b;
    public zo2 c;
    public boolean d;

    public final void finalize() {
        zo2 zo2Var;
        wo2 wo2Var = this.b;
        if (wo2Var != null) {
            uo2 uo2Var = wo2Var.h;
            if (!uo2Var.isDone()) {
                if (ro2.l.P(uo2Var, null, new dm2(new z(4, "The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f948a)))))) {
                    ro2.d(uo2Var);
                }
            }
        }
        if (this.d || (zo2Var = this.c) == null) {
            return;
        }
        zo2Var.i(null);
    }
}
