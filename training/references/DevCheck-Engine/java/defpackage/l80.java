package defpackage;

/* loaded from: classes.dex */
public final class l80 implements vl0 {
    public final boolean g;

    public l80(boolean z) {
        this.g = z;
    }

    @Override // defpackage.vl0
    public final boolean a() {
        return this.g;
    }

    @Override // defpackage.vl0
    public final x21 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.g ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
