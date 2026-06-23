package defpackage;

import Cwd.ynLVXgis;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.nativebridge.xm.oWuW;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f0 implements bs0 {
    public static final boolean j = Boolean.parseBoolean(System.getProperty(aEQQDLUUMo.WDUoZjkKc, "false"));
    public static final Logger k = Logger.getLogger(f0.class.getName());
    public static final rt0 l;
    public static final Object m;
    public volatile Object g;
    public volatile b0 h;
    public volatile e0 i;

    static {
        rt0 d0Var;
        try {
            d0Var = new c0(AtomicReferenceFieldUpdater.newUpdater(e0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e0.class, e0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f0.class, e0.class, "i"), AtomicReferenceFieldUpdater.newUpdater(f0.class, b0.class, "h"), AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            d0Var = new d0();
        }
        l = d0Var;
        if (th != null) {
            k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        m = new Object();
    }

    public static void d(f0 f0Var) {
        e0 e0Var;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        do {
            e0Var = f0Var.i;
        } while (!l.d(f0Var, e0Var, e0.c));
        while (true) {
            b0Var = null;
            if (e0Var == null) {
                break;
            }
            Thread thread = e0Var.f214a;
            if (thread != null) {
                e0Var.f214a = null;
                LockSupport.unpark(thread);
            }
            e0Var = e0Var.b;
        }
        do {
            b0Var2 = f0Var.h;
        } while (!l.b(f0Var, b0Var2, b0.d));
        while (true) {
            b0Var3 = b0Var;
            b0Var = b0Var2;
            if (b0Var == null) {
                break;
            }
            b0Var2 = b0Var.c;
            b0Var.c = b0Var3;
        }
        while (b0Var3 != null) {
            b0 b0Var4 = b0Var3.c;
            e(b0Var3.f59a, b0Var3.b);
            b0Var3 = b0Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof y) {
            Throwable th = ((y) obj).f1202a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a0) {
            throw new ExecutionException(((a0) obj).f3a);
        }
        if (obj == m) {
            return null;
        }
        return obj;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.bs0
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        b0 b0Var = this.h;
        b0 b0Var2 = b0.d;
        if (b0Var != b0Var2) {
            b0 b0Var3 = new b0(runnable, executor);
            do {
                b0Var3.c = b0Var;
                if (l.b(this, b0Var, b0Var3)) {
                    return;
                } else {
                    b0Var = this.h;
                }
            } while (b0Var != b0Var2);
        }
        e(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        try {
            Object g = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g == this ? ynLVXgis.AoWMByvDe : String.valueOf(g));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.g;
        if (obj != null) {
            return false;
        }
        if (!l.c(this, obj, j ? new y(new CancellationException("Future.cancel() was called."), z) : z ? y.b : y.c)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        e0 e0Var = e0.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.g;
        if (obj2 != null) {
            return f(obj2);
        }
        e0 e0Var2 = this.i;
        if (e0Var2 != e0Var) {
            e0 e0Var3 = new e0();
            do {
                rt0 rt0Var = l;
                rt0Var.z(e0Var3, e0Var2);
                if (rt0Var.d(this, e0Var2, e0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(e0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.g;
                    } while (obj == null);
                    return f(obj);
                }
                e0Var2 = this.i;
            } while (e0Var2 != e0Var);
        }
        return f(this.g);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        e0 e0Var = e0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.g;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            e0 e0Var2 = this.i;
            if (e0Var2 != e0Var) {
                e0 e0Var3 = new e0();
                do {
                    rt0 rt0Var = l;
                    rt0Var.z(e0Var3, e0Var2);
                    if (rt0Var.d(this, e0Var2, e0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(e0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.g;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(e0Var3);
                    } else {
                        e0Var2 = this.i;
                    }
                } while (e0Var2 != e0Var);
            }
            return f(this.g);
        }
        while (nanos > 0) {
            Object obj3 = this.g;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String f0Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + CDsMEtnUjndKau.ftEnjHFIwdK;
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(d51.s(str, " for ", f0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(e0 e0Var) {
        e0Var.f214a = null;
        while (true) {
            e0 e0Var2 = this.i;
            if (e0Var2 == e0.c) {
                return;
            }
            e0 e0Var3 = null;
            while (e0Var2 != null) {
                e0 e0Var4 = e0Var2.b;
                if (e0Var2.f214a != null) {
                    e0Var3 = e0Var2;
                } else if (e0Var3 != null) {
                    e0Var3.b = e0Var4;
                    if (e0Var3.f214a == null) {
                        break;
                    }
                } else if (!l.d(this, e0Var2, e0Var4)) {
                    break;
                }
                e0Var2 = e0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g instanceof y;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.g != null;
    }

    public boolean j(Throwable th) {
        if (!l.c(this, null, new a0(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.g instanceof y) {
            sb.append(oWuW.SJElWfVQdAJB);
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
