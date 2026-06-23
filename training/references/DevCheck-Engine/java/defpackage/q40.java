package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class q40 extends c30 {
    public int m;

    public q40(o92 o92Var) {
        super(o92Var);
        if (o92Var instanceof lj0) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.c30
    public final void d(int i) {
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
}
