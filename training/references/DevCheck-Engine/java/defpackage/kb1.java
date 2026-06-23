package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class kb1 {

    /* renamed from: a, reason: collision with root package name */
    public qi2 f526a;

    public /* synthetic */ kb1(kb1 kb1Var) {
        this.f526a = kb1Var.f526a;
    }

    public void a(nf1 nf1Var) {
        if (nf1Var == null || nf1Var.isEmpty()) {
            c.m("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        ql0 listIterator = nf1Var.listIterator(0);
        while (listIterator.hasNext()) {
            lb1 lb1Var = (lb1) listIterator.next();
            if (!"play_pass_subs".equals(lb1Var.b)) {
                hashSet.add(lb1Var.b);
            }
        }
        if (hashSet.size() <= 1) {
            this.f526a = qi2.k(nf1Var);
        } else {
            c.m("All products should be of the same product type.");
        }
    }
}
