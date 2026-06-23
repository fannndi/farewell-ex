package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
public abstract class ko {

    /* renamed from: a, reason: collision with root package name */
    public final int f543a;

    public /* synthetic */ ko(int i) {
        this.f543a = i;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = ym0.d(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public abstract void a(se0 se0Var);

    public abstract void c(se0 se0Var);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public void i(se0 se0Var) {
    }

    public abstract void j();

    public abstract void k(se0 se0Var);

    public abstract void l(se0 se0Var, int i, int i2);

    public abstract void m(se0 se0Var);

    public abstract void n(se0 se0Var);

    public abstract void o(se0 se0Var, int i, int i2);

    public abstract eh1 p(se0 se0Var);
}
