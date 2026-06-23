package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class lo0 {
    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            to0 to0Var = new to0(new rr1(sb));
            to0Var.n = 1;
            mo0.f648a.getClass();
            mo0.e(to0Var, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
