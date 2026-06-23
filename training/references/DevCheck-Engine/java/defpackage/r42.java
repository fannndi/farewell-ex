package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r42 implements jp0, Serializable {
    public af0 g;
    public Object h;

    @Override // defpackage.jp0
    public final Object getValue() {
        if (this.h == ai1.o) {
            af0 af0Var = this.g;
            af0Var.getClass();
            this.h = af0Var.a();
            this.g = null;
        }
        return this.h;
    }

    public final String toString() {
        return this.h != ai1.o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
