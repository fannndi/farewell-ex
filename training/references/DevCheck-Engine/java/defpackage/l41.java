package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class l41 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f572a;
    public final j9 b = new j9();
    public c41 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public l41(Runnable runnable) {
        OnBackInvokedCallback a2;
        this.f572a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a2 = h41.f364a.a(new d41(this, 0), new d41(this, 1), new e41(this, 0), new e41(this, 1));
            } else {
                a2 = f41.f261a.a(new e41(this, 2));
            }
            this.d = a2;
        }
    }

    public final void a(eq0 eq0Var, c41 c41Var) {
        eq0Var.getClass();
        c41Var.getClass();
        gq0 q = eq0Var.q();
        if (q.c == yp0.g) {
            return;
        }
        c41Var.b.add(new i41(this, q, c41Var));
        d();
        c41Var.c = new k41(0, this, l41.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object obj;
        j9 j9Var = this.b;
        ListIterator listIterator = j9Var.listIterator(j9Var.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((c41) obj).f107a) {
                    break;
                }
            }
        }
        c41 c41Var = (c41) obj;
        this.c = null;
        if (c41Var != null) {
            c41Var.a();
        } else {
            this.f572a.run();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        f41 f41Var = f41.f261a;
        if (z && !this.f) {
            f41Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            f41Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z = this.g;
        boolean z2 = false;
        j9 j9Var = this.b;
        if (j9Var == null || !j9Var.isEmpty()) {
            Iterator<E> it = j9Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((c41) it.next()).f107a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z2);
    }
}
