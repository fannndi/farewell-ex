package defpackage;

/* loaded from: classes.dex */
public final class nt implements dx {
    public static final nt h = new nt(0);
    public static final nt i = new nt(1);
    public final /* synthetic */ int g;

    public /* synthetic */ nt(int i2) {
        this.g = i2;
    }

    private final void a(Object obj) {
    }

    @Override // defpackage.dx
    public final qx d() {
        switch (this.g) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return n80.g;
        }
    }

    @Override // defpackage.dx
    public final void g(Object obj) {
        switch (this.g) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.g) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
