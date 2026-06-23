package defpackage;

import android.os.IBinder;

/* loaded from: classes.dex */
public final /* synthetic */ class lo1 implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f600a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lo1(int i, Object obj) {
        this.f600a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.f600a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mo1 mo1Var = (mo1) obj;
                mo1Var.g = null;
                mo1.j.remove(mo1Var);
                break;
            default:
                po1 po1Var = (po1) obj;
                if (!po1Var.i) {
                    po1Var.i = true;
                    po1.j.post(new oo1(0, po1Var));
                    break;
                }
                break;
        }
    }
}
