package defpackage;

import android.graphics.Color;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pq0 extends fd {
    public final boolean A;
    public boolean p;
    public boolean q;
    public float r;
    public float s;
    public int t;
    public final ArrayList u;
    public final int v;
    public final float w;
    public final float x;
    public final float y;
    public boolean z;

    public pq0(ArrayList arrayList, String str) {
        super(str, arrayList);
        this.p = true;
        this.q = true;
        this.r = 0.5f;
        this.r = n52.c(0.5f);
        Color.rgb(140, 234, 255);
        this.s = 2.5f;
        this.t = 1;
        this.u = null;
        this.v = -1;
        this.w = 8.0f;
        this.x = 4.0f;
        this.y = 0.2f;
        this.z = true;
        this.A = true;
        ArrayList arrayList2 = new ArrayList();
        this.u = arrayList2;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public final void n(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.s = n52.c(f);
    }
}
