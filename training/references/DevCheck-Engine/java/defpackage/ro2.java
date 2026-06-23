package defpackage;

import androidx.core.widget.rsm.gXdyRQCGVlHW;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class ro2 implements kk2 {
    public static final boolean j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", UQdsoaJMID.RMTROteXfdWcwAK));
    public static final Logger k = Logger.getLogger(ro2.class.getName());
    public static final xc1 l;
    public static final Object m;
    public volatile Object g;
    public volatile um2 h;
    public volatile oo2 i;

    static {
        xc1 lo2Var;
        try {
            lo2Var = new vn2(AtomicReferenceFieldUpdater.newUpdater(oo2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(oo2.class, oo2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(ro2.class, oo2.class, "i"), AtomicReferenceFieldUpdater.newUpdater(ro2.class, um2.class, "h"), AtomicReferenceFieldUpdater.newUpdater(ro2.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            lo2Var = new lo2();
        }
        Throwable th2 = th;
        l = lo2Var;
        if (th2 != null) {
            k.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        m = new Object();
    }

    public static void d(ro2 ro2Var) {
        oo2 oo2Var;
        um2 um2Var;
        um2 um2Var2;
        um2 um2Var3;
        do {
            oo2Var = ro2Var.i;
        } while (!l.Q(ro2Var, oo2Var, oo2.c));
        while (true) {
            um2Var = null;
            if (oo2Var == null) {
                break;
            }
            Thread thread = oo2Var.f750a;
            if (thread != null) {
                oo2Var.f750a = null;
                LockSupport.unpark(thread);
            }
            oo2Var = oo2Var.b;
        }
        do {
            um2Var2 = ro2Var.h;
        } while (!l.O(ro2Var, um2Var2, um2.d));
        while (true) {
            um2Var3 = um2Var;
            um2Var = um2Var2;
            if (um2Var == null) {
                break;
            }
            um2Var2 = um2Var.c;
            um2Var.c = um2Var3;
        }
        while (um2Var3 != null) {
            Runnable runnable = um2Var3.f1050a;
            um2 um2Var4 = um2Var3.c;
            f(runnable, um2Var3.b);
            um2Var3 = um2Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            k.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof il2) {
            Throwable th = ((il2) obj).f439a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof dm2) {
            throw new ExecutionException(((dm2) obj).f199a);
        }
        if (obj == m) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.kk2
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        um2 um2Var = this.h;
        um2 um2Var2 = um2.d;
        if (um2Var != um2Var2) {
            um2 um2Var3 = new um2(runnable, executor);
            do {
                um2Var3.c = um2Var;
                if (l.O(this, um2Var, um2Var3)) {
                    return;
                } else {
                    um2Var = this.h;
                }
            } while (um2Var != um2Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.g;
        if (obj != null) {
            return false;
        }
        if (!l.P(this, obj, j ? new il2(new CancellationException("Future.cancel() was called.")) : z ? il2.b : il2.c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(oo2 oo2Var) {
        oo2Var.f750a = null;
        while (true) {
            oo2 oo2Var2 = this.i;
            if (oo2Var2 != oo2.c) {
                oo2 oo2Var3 = null;
                while (oo2Var2 != null) {
                    oo2 oo2Var4 = oo2Var2.b;
                    if (oo2Var2.f750a != null) {
                        oo2Var3 = oo2Var2;
                    } else if (oo2Var3 != null) {
                        oo2Var3.b = oo2Var4;
                        if (oo2Var3.f750a == null) {
                            break;
                        }
                    } else if (!l.Q(this, oo2Var2, oo2Var4)) {
                        break;
                    }
                    oo2Var2 = oo2Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        oo2 oo2Var = oo2.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.g;
        if (obj2 != null) {
            return h(obj2);
        }
        oo2 oo2Var2 = this.i;
        if (oo2Var2 != oo2Var) {
            oo2 oo2Var3 = new oo2();
            do {
                xc1 xc1Var = l;
                xc1Var.M(oo2Var3, oo2Var2);
                if (xc1Var.Q(this, oo2Var2, oo2Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(oo2Var3);
                            throw new InterruptedException();
                        }
                        obj = this.g;
                    } while (obj == null);
                    return h(obj);
                }
                oo2Var2 = this.i;
            } while (oo2Var2 != oo2Var);
        }
        return h(this.g);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        oo2 oo2Var = oo2.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.g;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            oo2 oo2Var2 = this.i;
            if (oo2Var2 != oo2Var) {
                oo2 oo2Var3 = new oo2();
                do {
                    xc1 xc1Var = l;
                    xc1Var.M(oo2Var3, oo2Var2);
                    if (xc1Var.Q(this, oo2Var2, oo2Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(oo2Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.g;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(oo2Var3);
                    } else {
                        oo2Var2 = this.i;
                    }
                } while (oo2Var2 != oo2Var);
            }
            return h(this.g);
        }
        while (nanos > 0) {
            Object obj3 = this.g;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String ro2Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder("Waited ");
        sb.append(j2);
        String str = gXdyRQCGVlHW.udfw;
        sb.append(str);
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + str + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(str);
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            sb2 = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(d51.s(sb2, " for ", ro2Var));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g instanceof il2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.g instanceof il2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
