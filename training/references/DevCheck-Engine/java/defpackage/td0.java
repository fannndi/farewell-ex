package defpackage;

import java.util.ArrayList;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class td0 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f982a;
    public final /* synthetic */ ae0 b;

    public /* synthetic */ td0(ae0 ae0Var, int i) {
        this.f982a = i;
        this.b = ae0Var;
    }

    @Override // defpackage.p2
    public final void a(Object obj) {
        int i = this.f982a;
        ae0 ae0Var = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                xd0 xd0Var = (xd0) ae0Var.C.pollFirst();
                if (xd0Var != null) {
                    String str = xd0Var.g;
                    int i3 = xd0Var.h;
                    ld0 l = ae0Var.c.l(str);
                    if (l != null) {
                        l.X(i3, strArr, iArr);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                o2 o2Var = (o2) obj;
                xd0 xd0Var2 = (xd0) ae0Var.C.pollFirst();
                if (xd0Var2 != null) {
                    String str2 = xd0Var2.g;
                    int i4 = xd0Var2.h;
                    ld0 l2 = ae0Var.c.l(str2);
                    if (l2 != null) {
                        l2.K(i4, o2Var.g, o2Var.h);
                        break;
                    }
                }
                break;
            default:
                o2 o2Var2 = (o2) obj;
                xd0 xd0Var3 = (xd0) ae0Var.C.pollFirst();
                if (xd0Var3 != null) {
                    String str3 = xd0Var3.g;
                    int i5 = xd0Var3.h;
                    ld0 l3 = ae0Var.c.l(str3);
                    if (l3 != null) {
                        l3.K(i5, o2Var2.g, o2Var2.h);
                        break;
                    }
                }
                break;
        }
    }
}
