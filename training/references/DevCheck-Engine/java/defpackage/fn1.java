package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fn1 extends ln1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public fn1(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.ln1
    public final void a(Matrix matrix, zm1 zm1Var, int i, Canvas canvas) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ln1) obj).a(this.d, zm1Var, i, canvas);
        }
    }
}
