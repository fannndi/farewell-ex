package defpackage;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ko0 implements u80 {
    public static final io0 f;
    public static final io0 g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f544a;
    public final HashMap b;
    public final ho0 c;
    public boolean d;
    public static final ho0 e = new ho0(0);
    public static final jo0 h = new jo0();

    /* JADX WARN: Type inference failed for: r0v1, types: [io0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [io0] */
    static {
        final int i = 0;
        f = new o52() { // from class: io0
            @Override // defpackage.t80
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((p52) obj2).b((String) obj);
                        break;
                    default:
                        ((p52) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new o52() { // from class: io0
            @Override // defpackage.t80
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((p52) obj2).b((String) obj);
                        break;
                    default:
                        ((p52) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public ko0() {
        HashMap hashMap = new HashMap();
        this.f544a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final u80 a(Class cls, m31 m31Var) {
        this.f544a.put(cls, m31Var);
        this.b.remove(cls);
        return this;
    }
}
