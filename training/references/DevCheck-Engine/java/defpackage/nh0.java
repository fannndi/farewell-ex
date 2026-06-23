package defpackage;

import flar2.devcheck.hwData.DeviceInfo;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class nh0 {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f682a;
    public final ConcurrentHashMap b;
    public final zf c;
    public final fo0 d;
    public final List e;
    public final boolean f;
    public final dd0 g;

    public nh0() {
        oh0 oh0Var = oh0.q;
        this.f682a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        ba0 ba0Var = oh0Var.f734a;
        new HashMap(oh0Var.b);
        this.f = oh0Var.g;
        this.g = oh0Var.h;
        oh0.a(oh0Var.c);
        oh0.a(oh0Var.d);
        oh0.a(oh0Var.i);
        this.c = oh0.o;
        this.d = oh0.p;
        this.e = oh0.r;
    }

    /* JADX WARN: Finally extract failed */
    public final Object a(String str) {
        Object obj;
        l32 l32Var = new l32(DeviceInfo.class);
        ro0 ro0Var = new ro0(new StringReader(str));
        ro0Var.u = 2;
        boolean z = true;
        ro0Var.u = 1;
        try {
            try {
                try {
                    try {
                        try {
                            ro0Var.Q();
                            z = false;
                            c22 b = b(l32Var);
                            Class cls = l32Var.f569a;
                            obj = b.b(ro0Var);
                            Class C = k32.C(cls);
                            if (obj != null && !C.isInstance(obj)) {
                                throw new ClassCastException("Type adapter '" + b + "' returned wrong type; requested " + cls + " but got instance of " + obj.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            ro0Var.u = 2;
                        } catch (IOException e) {
                            throw new no0(e);
                        }
                    } catch (IllegalStateException e2) {
                        throw new no0(e2);
                    }
                } catch (AssertionError e3) {
                    throw new AssertionError("AssertionError (GSON 2.14.0): " + e3.getMessage(), e3);
                }
            } catch (EOFException e4) {
                if (!z) {
                    throw new no0(e4);
                }
                ro0Var.u = 2;
                obj = null;
            }
            if (obj != null) {
                try {
                    if (ro0Var.Q() != 10) {
                        throw new no0("JSON document was not fully consumed.");
                    }
                } catch (xt0 e5) {
                    throw new no0(e5);
                } catch (IOException e6) {
                    throw new no0(e6);
                }
            }
            return obj;
        } catch (Throwable th) {
            ro0Var.u = 2;
            throw th;
        }
    }

    public final c22 b(l32 l32Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        c22 c22Var = (c22) concurrentHashMap.get(l32Var);
        if (c22Var != null) {
            return c22Var;
        }
        ThreadLocal threadLocal = this.f682a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            c22 c22Var2 = (c22) map.get(l32Var);
            if (c22Var2 != null) {
                return c22Var2;
            }
            z = false;
        }
        try {
            mh0 mh0Var = new mh0();
            map.put(l32Var, mh0Var);
            Iterator it = this.e.iterator();
            c22 c22Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c22Var3 = ((d22) it.next()).a(this, l32Var);
                if (c22Var3 != null) {
                    if (mh0Var.f631a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    mh0Var.f631a = c22Var3;
                    map.put(l32Var, c22Var3);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (c22Var3 == null) {
                rw.o("GSON (2.14.0) cannot handle ", l32Var);
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return c22Var3;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String c(Object obj) {
        boolean z = this.f;
        dd0 dd0Var = this.g;
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            try {
                to0 to0Var = new to0(new rr1(sb));
                to0Var.F(dd0Var);
                to0Var.o = z;
                to0Var.G(2);
                to0Var.q = false;
                d(to0Var);
                return sb.toString();
            } catch (IOException e) {
                throw new no0(e);
            }
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb2 = new StringBuilder();
        try {
            to0 to0Var2 = new to0(new rr1(sb2));
            to0Var2.F(dd0Var);
            to0Var2.o = z;
            to0Var2.G(2);
            to0Var2.q = false;
            e(obj, cls, to0Var2);
            return sb2.toString();
        } catch (IOException e2) {
            throw new no0(e2);
        }
    }

    public final void d(to0 to0Var) {
        oo0 oo0Var = oo0.g;
        int i = to0Var.n;
        boolean z = to0Var.o;
        boolean z2 = to0Var.q;
        to0Var.o = this.f;
        to0Var.q = false;
        if (i == 2) {
            to0Var.n = 1;
        }
        try {
            try {
                mo0.f648a.getClass();
                mo0.e(to0Var, oo0Var);
                to0Var.G(i);
                to0Var.o = z;
                to0Var.q = z2;
            } catch (IOException e) {
                throw new no0(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            to0Var.G(i);
            to0Var.o = z;
            to0Var.q = z2;
            throw th;
        }
    }

    public final void e(Object obj, Class cls, to0 to0Var) {
        c22 b = b(new l32(cls));
        int i = to0Var.n;
        if (i == 2) {
            to0Var.n = 1;
        }
        boolean z = to0Var.o;
        boolean z2 = to0Var.q;
        to0Var.o = this.f;
        to0Var.q = false;
        try {
            try {
                b.c(to0Var, obj);
            } catch (IOException e) {
                throw new no0(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } finally {
            to0Var.G(i);
            to0Var.o = z;
            to0Var.q = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
