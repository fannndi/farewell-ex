package defpackage;

import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class c30 implements w20 {
    public final o92 d;
    public int f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public o92 f106a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public q40 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public c30(o92 o92Var) {
        this.d = o92Var;
    }

    @Override // defpackage.w20
    public final void a(w20 w20Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((c30) obj).j) {
                return;
            }
        }
        this.c = true;
        o92 o92Var = this.f106a;
        if (o92Var != null) {
            o92Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        c30 c30Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            c30 c30Var2 = (c30) obj2;
            if (!(c30Var2 instanceof q40)) {
                i++;
                c30Var = c30Var2;
            }
        }
        if (c30Var != null && i == 1 && c30Var.j) {
            q40 q40Var = this.i;
            if (q40Var != null) {
                if (!q40Var.j) {
                    return;
                } else {
                    this.f = this.h * q40Var.g;
                }
            }
            d(c30Var.g + this.f);
        }
        o92 o92Var2 = this.f106a;
        if (o92Var2 != null) {
            o92Var2.a(this);
        }
    }

    public final void b(o92 o92Var) {
        this.k.add(o92Var);
        if (this.j) {
            o92Var.a(o92Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            w20 w20Var = (w20) obj;
            w20Var.a(w20Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                str = "UNKNOWN";
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                str = "TOP";
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
