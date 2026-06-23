package defpackage;

import flar2.devcheck.nativebridge.xm.oWuW;

/* loaded from: classes.dex */
public class o22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat(oWuW.WWVx.concat("java-lang-class-unsupported")));
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
    }
}
