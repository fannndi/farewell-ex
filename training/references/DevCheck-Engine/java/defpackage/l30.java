package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l30 {

    /* renamed from: a, reason: collision with root package name */
    public final float f568a;
    public final Object b;

    public l30(String str, float f) {
        this.b = str;
        this.f568a = f;
    }

    public l30(List list, float f) {
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.f568a = f;
    }
}
