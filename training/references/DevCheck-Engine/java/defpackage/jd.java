package defpackage;

/* loaded from: classes.dex */
public final class jd extends hv {
    public int n;
    public int o;
    public kd p;

    public boolean getAllowsGoneWidget() {
        return this.p.t0;
    }

    public int getMargin() {
        return this.p.u0;
    }

    public int getType() {
        return this.n;
    }

    @Override // defpackage.hv
    public final void h(iw iwVar, boolean z) {
        int i = this.n;
        this.o = i;
        if (z) {
            if (i == 5) {
                this.o = 1;
            } else if (i == 6) {
                this.o = 0;
            }
        } else if (i == 5) {
            this.o = 0;
        } else if (i == 6) {
            this.o = 1;
        }
        if (iwVar instanceof kd) {
            ((kd) iwVar).s0 = this.o;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.p.t0 = z;
    }

    public void setDpMargin(int i) {
        this.p.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.p.u0 = i;
    }

    public void setType(int i) {
        this.n = i;
    }
}
