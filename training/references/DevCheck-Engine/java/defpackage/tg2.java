package defpackage;

/* loaded from: classes.dex */
public final class tg2 extends Exception {
    public final uu g;

    public tg2(uu uuVar) {
        if ((uuVar.h == 0 || uuVar.i == null) ? false : true) {
            this.g = uuVar;
        } else {
            c.m("ResolvableConnectionException can only be created with a connection result containing a resolution.");
            throw null;
        }
    }
}
