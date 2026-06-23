package defpackage;

import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k50 {

    /* renamed from: a, reason: collision with root package name */
    public final String f515a;
    public final int b;
    public final int c;

    public k50(int i, String str, int i2) {
        this.f515a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k50)) {
            return false;
        }
        k50 k50Var = (k50) obj;
        return this.f515a.equals(k50Var.f515a) && this.b == k50Var.b && this.c == k50Var.c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f515a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f515a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(RIhTGWkqQvGL.FBSdr);
        return d51.t(sb, this.c, YHJbtPFAANaPQ.FbalmoFSFSqyPCq);
    }
}
