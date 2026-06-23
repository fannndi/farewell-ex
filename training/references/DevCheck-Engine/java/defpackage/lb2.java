package defpackage;

/* loaded from: classes.dex */
public final class lb2 extends kb2 {
    @Override // defpackage.kb2, defpackage.om0
    public final boolean E() {
        int systemBarsAppearance;
        systemBarsAppearance = this.l.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.kb2, defpackage.om0
    public final void K(boolean z) {
        this.l.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.kb2, defpackage.om0
    public final void L(boolean z) {
        this.l.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
