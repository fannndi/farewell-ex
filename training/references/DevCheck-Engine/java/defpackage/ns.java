package defpackage;

import flar2.devcheck.cputimes.Sd.tEegR;
import java.util.List;

/* loaded from: classes.dex */
public final class ns {

    /* renamed from: a, reason: collision with root package name */
    public final ps f698a;
    public final os b;
    public final qs c;
    public final qs d;
    public final og e;

    public ns(os osVar, List list) {
        String[] strArr;
        int i;
        this.b = osVar;
        if (list.isEmpty()) {
            strArr = new String[0];
        } else {
            int i2 = ((ms) list.get(0)).b;
            strArr = new String[i2];
            int i3 = 0;
            while (true) {
                i = i2 - 1;
                if (i3 >= i) {
                    break;
                }
                StringBuilder sb = new StringBuilder(tEegR.TRffCREALzFG);
                int i4 = i3 + 1;
                sb.append(i4);
                strArr[i3] = sb.toString();
                i3 = i4;
            }
            strArr[i] = "color";
        }
        this.c = new qs(false, strArr);
        String[] strArr2 = new String[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            strArr2[i5] = ((ms) list.get(i5)).d;
        }
        this.d = new qs(true, strArr2);
        this.e = new og(list);
        this.f698a = new ps((short) 512, (short) 288, a());
    }

    public final int a() {
        int i = this.c.l + 288 + this.d.l;
        og ogVar = this.e;
        int i2 = (ogVar.g * 4) + 16;
        ry1 ry1Var = (ry1) ogVar.j;
        return (((sh[]) ry1Var.f).length * 16) + (((int[]) ry1Var.e).length * 4) + 84 + i2 + i;
    }
}
