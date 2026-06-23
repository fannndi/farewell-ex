package defpackage;

import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;

/* loaded from: classes.dex */
public final class v80 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1073a;

    public v80(String str) {
        if (str != null) {
            this.f1073a = str;
        } else {
            jw0.f("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        return this.f1073a.equals(((v80) obj).f1073a);
    }

    public final int hashCode() {
        return this.f1073a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d51.u(new StringBuilder(RIhTGWkqQvGL.wapFTcFLN), this.f1073a, "\"}");
    }
}
