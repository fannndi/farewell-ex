package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class un0 implements sn1, Closeable {
    public static final ArrayList l = new ArrayList(0);
    public static final String m;
    public static final byte[] n;
    public AbstractList i;
    public wn1 k;
    public final ArrayList g = new ArrayList();
    public final rg1 h = new rg1(0);
    public List j = l;

    static {
        String uuid = UUID.randomUUID().toString();
        m = uuid;
        n = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(StandardCharsets.UTF_8);
    }

    public un0() {
    }

    public un0(wn1 wn1Var) {
        this.k = wn1Var;
    }

    public final void a(String... strArr) {
        if (strArr.length > 0) {
            this.g.add(new dt(strArr));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dt) obj).getClass();
        }
    }

    public final rg1 e() {
        List list = this.j;
        boolean z = list == l;
        AbstractList abstractList = this.i;
        rg1 rg1Var = this.h;
        rg1Var.c = abstractList;
        if (z) {
            list = null;
        }
        rg1Var.d = list;
        if (z) {
            this.k.getClass();
        }
        List list2 = (List) rg1Var.c;
        if (list2 != null && list2 == ((List) rg1Var.d)) {
            if (ju0.f497a == null) {
                ju0.f497a = Collections.synchronizedCollection(n01.b()).getClass();
            }
            if (!ju0.f497a.isInstance(list2)) {
                List synchronizedList = Collections.synchronizedList((List) rg1Var.c);
                rg1Var.c = synchronizedList;
                rg1Var.d = synchronizedList;
            }
        }
        try {
            try {
                this.k.e(this);
                close();
                rg1Var.c = this.i;
                rg1Var.d = z ? null : this.j;
                return rg1Var;
            } catch (IOException e) {
                if (e instanceof yn1) {
                    rg1 rg1Var2 = rg1.f;
                    close();
                    rg1Var.c = this.i;
                    rg1Var.d = z ? null : this.j;
                    return rg1Var2;
                }
                rg1 rg1Var3 = rg1.e;
                close();
                rg1Var.c = this.i;
                rg1Var.d = z ? null : this.j;
                return rg1Var3;
            }
        } catch (Throwable th) {
            close();
            rg1Var.c = this.i;
            rg1Var.d = z ? null : this.j;
            throw th;
        }
    }

    @Override // defpackage.sn1
    public final void j(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        ExecutorService executorService = wn1.m;
        rg1 rg1Var = this.h;
        Future submit = executorService.submit(new or1(inputStream, (List) rg1Var.c, 1));
        Future submit2 = executorService.submit(new or1(inputStream2, (List) rg1Var.d, 0));
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            for (String str : ((dt) obj).g) {
                outputStream.write(str.getBytes(StandardCharsets.UTF_8));
                outputStream.write(10);
            }
        }
        outputStream.write(n);
        outputStream.flush();
        try {
            rg1Var.b = ((Integer) submit.get()).intValue();
            submit2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }

    public void l(Executor executor, h61 h61Var) {
        this.k.h.execute(new b9(11, this, executor, h61Var));
    }
}
