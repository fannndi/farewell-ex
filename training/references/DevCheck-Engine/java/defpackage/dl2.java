package defpackage;

import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class dl2 {
    public int zza;

    public abstract int a(rm2 rm2Var);

    public final byte[] b() {
        try {
            vl2 vl2Var = (vl2) this;
            int e = vl2Var.e();
            byte[] bArr = new byte[e];
            ml2 ml2Var = new ml2(e, bArr);
            rm2 a2 = om2.c.a(vl2Var.getClass());
            my1 my1Var = ml2Var.f641a;
            if (my1Var == null) {
                my1Var = new my1();
                Charset charset = zl2.f1280a;
                my1Var.g = ml2Var;
                ml2Var.f641a = my1Var;
            }
            a2.h(vl2Var, my1Var);
            if (e - ml2Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException(QCeVODiUkb.UkntgymNxzy);
        } catch (IOException e2) {
            jw0.l(d51.y("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }
}
