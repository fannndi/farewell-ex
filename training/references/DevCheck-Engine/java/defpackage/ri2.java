package defpackage;

import Cwd.ynLVXgis;

/* loaded from: classes.dex */
public final class ri2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f897a;
    public final Object b;
    public final Object c;

    public ri2(Object obj, Object obj2, Object obj3) {
        this.f897a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f897a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.b) + ynLVXgis.okR + String.valueOf(obj) + "=" + String.valueOf(this.c));
    }
}
