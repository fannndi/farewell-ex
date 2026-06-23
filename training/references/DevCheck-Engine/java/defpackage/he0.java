package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class he0 extends vd1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f379a;
    public final /* synthetic */ Object b;

    public /* synthetic */ he0(int i, Object obj) {
        this.f379a = i;
        this.b = obj;
    }

    @Override // defpackage.vd1
    public final void a() {
        int i = this.f379a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ie0) obj).b(true);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                f11 f11Var = (f11) obj;
                f11Var.e = f11Var.c.c();
                eu euVar = f11Var.d;
                ((du) euVar.e).f();
                euVar.e();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                recyclerView.n0.f = true;
                recyclerView.a0(true);
                if (!recyclerView.k.j()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            default:
                ((z30) obj).a();
                break;
        }
    }

    @Override // defpackage.vd1
    public final void b(int i, int i2, Object obj) {
        int i3 = this.f379a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                f11 f11Var = (f11) obj2;
                eu euVar = f11Var.d;
                ((du) euVar.e).f983a.d(i + euVar.f(f11Var), i2, obj);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.k(null);
                w2 w2Var = recyclerView.k;
                ArrayList arrayList = (ArrayList) w2Var.c;
                if (i2 >= 1) {
                    arrayList.add(w2Var.l(obj, 4, i, i2));
                    w2Var.f1107a |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((z30) obj2).a();
                break;
        }
    }

    @Override // defpackage.vd1
    public final void c(int i, int i2) {
        int i3 = this.f379a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                f11 f11Var = (f11) obj;
                f11Var.e += i2;
                eu euVar = f11Var.d;
                ((du) euVar.e).i(i + euVar.f(f11Var), i2);
                if (f11Var.e > 0 && f11Var.c.c == 2) {
                    euVar.e();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                w2 w2Var = recyclerView.k;
                ArrayList arrayList = (ArrayList) w2Var.c;
                if (i2 >= 1) {
                    arrayList.add(w2Var.l(null, 1, i, i2));
                    w2Var.f1107a |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((z30) obj).a();
                break;
        }
    }

    @Override // defpackage.vd1
    public final void d(int i, int i2) {
        int i3 = this.f379a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                f11 f11Var = (f11) obj;
                eu euVar = f11Var.d;
                int f = euVar.f(f11Var);
                ((du) euVar.e).h(i + f, i2 + f);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                w2 w2Var = recyclerView.k;
                ArrayList arrayList = (ArrayList) w2Var.c;
                if (i != i2) {
                    arrayList.add(w2Var.l(null, 8, i, i2));
                    w2Var.f1107a |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((z30) obj).a();
                break;
        }
    }

    @Override // defpackage.vd1
    public final void e(int i, int i2) {
        int i3 = this.f379a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                a();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                f11 f11Var = (f11) obj;
                f11Var.e -= i2;
                eu euVar = f11Var.d;
                ((du) euVar.e).j(i + euVar.f(f11Var), i2);
                if (f11Var.e < 1 && f11Var.c.c == 2) {
                    euVar.e();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.k(null);
                w2 w2Var = recyclerView.k;
                ArrayList arrayList = (ArrayList) w2Var.c;
                if (i2 >= 1) {
                    arrayList.add(w2Var.l(null, 2, i, i2));
                    w2Var.f1107a |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
            default:
                ((z30) obj).a();
                break;
        }
    }

    @Override // defpackage.vd1
    public void f() {
        td1 td1Var;
        int i = this.f379a;
        Object obj = this.b;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((f11) obj).d.e();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView.j != null && (td1Var = recyclerView.s) != null) {
                    int A = d51.A(td1Var.c);
                    if (A != 1) {
                        if (A == 2) {
                        }
                    } else if (td1Var.c() <= 0) {
                    }
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.z || !recyclerView.y) {
            recyclerView.G = true;
            recyclerView.requestLayout();
        } else {
            qd1 qd1Var = recyclerView.o;
            WeakHashMap weakHashMap = y62.f1215a;
            recyclerView.postOnAnimation(qd1Var);
        }
    }
}
