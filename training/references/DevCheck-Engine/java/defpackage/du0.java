package defpackage;

import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class du0 extends fu0 implements Iterator {
    public final /* synthetic */ int k;

    public du0(gu0 gu0Var, int i) {
        this.k = i;
        gu0Var.getClass();
        this.j = gu0Var;
        this.h = -1;
        this.i = gu0Var.n;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                b();
                int i = this.g;
                gu0 gu0Var = (gu0) this.j;
                if (i >= gu0Var.l) {
                    rw.k();
                    break;
                } else {
                    this.g = i + 1;
                    this.h = i;
                    eu0 eu0Var = new eu0(gu0Var, i);
                    e();
                    break;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                b();
                int i2 = this.g;
                gu0 gu0Var2 = (gu0) this.j;
                if (i2 >= gu0Var2.l) {
                    rw.k();
                    break;
                } else {
                    this.g = i2 + 1;
                    this.h = i2;
                    Object obj = gu0Var2.g[i2];
                    e();
                    break;
                }
            default:
                b();
                int i3 = this.g;
                gu0 gu0Var3 = (gu0) this.j;
                if (i3 >= gu0Var3.l) {
                    rw.k();
                    break;
                } else {
                    this.g = i3 + 1;
                    this.h = i3;
                    Object[] objArr = gu0Var3.h;
                    objArr.getClass();
                    Object obj2 = objArr[this.h];
                    e();
                    break;
                }
        }
        return null;
    }
}
