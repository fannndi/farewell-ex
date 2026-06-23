package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class je1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f478a;
    public int b;
    public Set c;

    public final void a() {
        SparseArray sparseArray = this.f478a;
        for (int i = 0; i < sparseArray.size(); i++) {
            ie1 ie1Var = (ie1) sparseArray.valueAt(i);
            ArrayList arrayList = ie1Var.f425a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                bw0.c(((te1) obj).g);
            }
            ie1Var.f425a.clear();
        }
    }

    public final ie1 b(int i) {
        SparseArray sparseArray = this.f478a;
        ie1 ie1Var = (ie1) sparseArray.get(i);
        if (ie1Var != null) {
            return ie1Var;
        }
        ie1 ie1Var2 = new ie1();
        sparseArray.put(i, ie1Var2);
        return ie1Var2;
    }
}
