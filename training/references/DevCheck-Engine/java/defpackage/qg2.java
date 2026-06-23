package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class qg2 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f841a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        f841a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }
}
