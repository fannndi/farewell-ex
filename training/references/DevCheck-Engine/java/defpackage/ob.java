package defpackage;

import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ob extends au {
    public q52 f;
    public int l;
    public int m;
    public final ArrayList r;
    public final int g = -7829368;
    public float h = 1.0f;
    public final int i = -7829368;
    public final float j = 1.0f;
    public float[] k = new float[0];
    public final int n = 6;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    public final boolean s = true;
    public float t = 0.0f;
    public float u = 0.0f;
    public boolean v = false;
    public boolean w = false;
    public float x = 0.0f;
    public float y = 0.0f;
    public float z = 0.0f;

    public ob() {
        this.d = n52.c(10.0f);
        this.b = n52.c(5.0f);
        this.c = n52.c(5.0f);
        this.r = new ArrayList();
    }

    public void b(float f, float f2) {
        float f3 = this.v ? this.y : f - this.t;
        float f4 = this.w ? this.x : f2 + this.u;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.y = f3;
        this.x = f4;
        this.z = Math.abs(f4 - f3);
    }

    public final String c(int i) {
        return (i < 0 || i >= this.k.length) ? qJTtDWNCVUDjB.cPULPM : e().a(this.k[i]);
    }

    public final String d() {
        String str = "";
        for (int i = 0; i < this.k.length; i++) {
            String c = c(i);
            if (c != null && str.length() < c.length()) {
                str = c;
            }
        }
        return str;
    }

    public final q52 e() {
        q52 q52Var = this.f;
        if (q52Var == null || ((q52Var instanceof h10) && ((h10) q52Var).b != this.m)) {
            int i = this.m;
            h10 h10Var = new h10();
            h10Var.b = i;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 == 0) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("0");
            }
            h10Var.f359a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
            this.f = h10Var;
        }
        return this.f;
    }
}
