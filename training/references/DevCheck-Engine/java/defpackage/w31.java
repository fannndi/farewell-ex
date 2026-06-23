package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class w31 {

    /* renamed from: a, reason: collision with root package name */
    public final bn0 f1109a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public w31(bn0 bn0Var, int[] iArr, String[] strArr) {
        Set singleton;
        bn0Var.getClass();
        iArr.getClass();
        strArr.getClass();
        this.f1109a = bn0Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length != strArr.length) {
            c.n("Check failed.");
            throw null;
        }
        if (strArr.length == 0) {
            singleton = r80.g;
        } else {
            singleton = Collections.singleton(strArr[0]);
            singleton.getClass();
        }
        this.d = singleton;
    }
}
