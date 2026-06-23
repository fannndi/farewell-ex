package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bt implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98a;
    public final /* synthetic */ lf0 b;

    public /* synthetic */ bt(lf0 lf0Var, int i) {
        this.f98a = i;
        this.b = lf0Var;
    }

    @Override // defpackage.v31
    public final /* synthetic */ void a(Object obj) {
        int i = this.f98a;
        lf0 lf0Var = this.b;
        switch (i) {
            case 0:
                ((at) lf0Var).j(obj);
                break;
            default:
                ((x20) lf0Var).j(obj);
                break;
        }
    }

    public final lf0 b() {
        int i = this.f98a;
        lf0 lf0Var = this.b;
        switch (i) {
            case 0:
                return (at) lf0Var;
            default:
                return (x20) lf0Var;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.f98a;
        lf0 lf0Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof v31) || !(obj instanceof bt) || ((at) lf0Var) != ((bt) obj).b()) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof v31) || !(obj instanceof bt) || ((x20) lf0Var) != ((bt) obj).b()) {
                    break;
                }
                break;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f98a;
        lf0 lf0Var = this.b;
        switch (i) {
            case 0:
                return ((at) lf0Var).hashCode();
            default:
                return ((x20) lf0Var).hashCode();
        }
    }
}
