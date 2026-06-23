package defpackage;

import java.net.Proxy;

/* loaded from: classes.dex */
public abstract /* synthetic */ class nu {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f701a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f701a = iArr;
    }
}
