package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class pr1 extends IOException {
    public final j90 g;

    public pr1(j90 j90Var) {
        super("stream was reset: " + j90Var);
        this.g = j90Var;
    }
}
