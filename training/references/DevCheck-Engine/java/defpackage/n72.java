package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class n72 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f668a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f668a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((i72) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
