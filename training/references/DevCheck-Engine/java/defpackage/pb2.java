package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class pb2 {

    /* renamed from: a, reason: collision with root package name */
    public final zb2 f782a;
    public final List b;
    public final ArrayList c;
    public final ArrayList d = new ArrayList();
    public boolean e;

    static {
        ai1.k("WorkContinuationImpl");
    }

    public pb2(zb2 zb2Var, List list) {
        this.f782a = zb2Var;
        this.b = list;
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((x41) list.get(i)).f1164a.toString();
            uuid.getClass();
            this.c.add(uuid);
            this.d.add(uuid);
        }
    }

    public static HashSet a(pb2 pb2Var) {
        HashSet hashSet = new HashSet();
        pb2Var.getClass();
        return hashSet;
    }
}
