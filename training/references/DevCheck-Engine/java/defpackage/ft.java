package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ft extends kk1 {
    public final /* synthetic */ int i;

    public /* synthetic */ ft(int i) {
        this.i = i;
    }

    public static String h0(oy1 oy1Var) {
        StringBuilder sb = new StringBuilder();
        String str = oy1Var.b;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        String str2 = oy1Var.f768a;
        sb.append(str2 != null ? str2 : "");
        sb.append("|");
        sb.append(oy1Var.c);
        sb.append("|");
        ly1 ly1Var = oy1Var.d;
        sb.append(ly1Var != null ? ly1Var.name() : "null");
        return sb.toString();
    }

    @Override // defpackage.kk1
    public final boolean d(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gt) obj).equals((gt) obj2);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((kc1) obj).equals((kc1) obj2);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                li liVar = ((oi1) obj).f738a;
                long j = liVar.f590a;
                li liVar2 = ((oi1) obj2).f738a;
                return j == liVar2.f590a && liVar.e == liVar2.e && liVar.c == liVar2.c && liVar.r == liVar2.r;
            case 3:
                return ((lp0) obj).equals((lp0) obj2);
            default:
                oy1 oy1Var = (oy1) obj;
                oy1 oy1Var2 = (oy1) obj2;
                if (!bj0.w(oy1Var).equals(bj0.w(oy1Var2))) {
                    return false;
                }
                String str = oy1Var.f768a;
                if (str == null) {
                    str = "";
                }
                String str2 = oy1Var2.f768a;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str.equals(str2)) {
                    return false;
                }
                String str3 = oy1Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = oy1Var2.b;
                return str3.equals(str4 != null ? str4 : "");
        }
    }

    @Override // defpackage.kk1
    public final boolean e(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return true;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return true;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return ((oi1) obj).f738a.f590a == ((oi1) obj2).f738a.f590a;
            case 3:
                return true;
            default:
                return h0((oy1) obj).equals(h0((oy1) obj2));
        }
    }
}
