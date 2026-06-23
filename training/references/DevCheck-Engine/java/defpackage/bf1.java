package defpackage;

/* loaded from: classes.dex */
public final class bf1 {
    public static String a(xf0 xf0Var) {
        String obj = xf0Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
