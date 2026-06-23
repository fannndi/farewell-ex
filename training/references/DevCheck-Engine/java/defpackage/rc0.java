package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rc0 implements sw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f883a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc0(int i, Object obj) {
        this.f883a = i;
        this.b = obj;
    }

    @Override // defpackage.sw
    public final void accept(Object obj) {
        switch (this.f883a) {
            case 0:
                sc0 sc0Var = (sc0) obj;
                if (sc0Var == null) {
                    sc0Var = new sc0(-3);
                }
                ((zf) this.b).G(sc0Var);
                return;
            default:
                sc0 sc0Var2 = (sc0) obj;
                synchronized (tc0.c) {
                    try {
                        yo1 yo1Var = tc0.d;
                        ArrayList arrayList = (ArrayList) yo1Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        yo1Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((sw) arrayList.get(i)).accept(sc0Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
