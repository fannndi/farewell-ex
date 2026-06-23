package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class u90 implements sa0 {
    public final /* synthetic */ int g;
    public final db1 h;

    public /* synthetic */ u90(db1 db1Var, int i) {
        this.g = i;
        this.h = db1Var;
    }

    @Override // defpackage.db1
    public final Object get() {
        int i = this.g;
        db1 db1Var = this.h;
        switch (i) {
            case 0:
                String packageName = ((Context) db1Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                jw0.f("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new gk1(Integer.valueOf(gk1.j).intValue(), (Context) db1Var.get(), "com.google.android.datatransport.events");
        }
    }
}
