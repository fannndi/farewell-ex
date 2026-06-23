package defpackage;

import androidx.emoji2.text.Fk.Iyrs;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class u71 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1024a;
    public final af0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final zu[] f;
    public final tl1 g;
    public final gd h;

    public u71(int i, af0 af0Var) {
        this.f1024a = i;
        this.b = af0Var;
        this.f = new zu[i];
        int i2 = ul1.f1048a;
        this.g = new tl1(i);
        gd gdVar = new gd();
        if (i < 1) {
            c.m(Iyrs.mQUBlHS);
            throw null;
        }
        if (i > 1073741824) {
            c.m("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        gdVar.c = i - 1;
        gdVar.d = new Object[i];
        this.h = gdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0063, code lost:
    
        r0.h(r5, r8.h);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:13:0x0084, B:15:0x0088, B:17:0x008e, B:20:0x0095, B:21:0x00af, B:23:0x00b5, B:27:0x00cd, B:28:0x00d2, B:29:0x00d3, B:30:0x00da), top: B:12:0x0084, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:13:0x0084, B:15:0x0088, B:17:0x008e, B:20:0x0095, B:21:0x00af, B:23:0x00b5, B:27:0x00cd, B:28:0x00d2, B:29:0x00d3, B:30:0x00da), top: B:12:0x0084, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ex r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u71.a(ex):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (zu zuVar : this.f) {
                if (zuVar != null) {
                    zuVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder sb) {
        gd gdVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            nr0 i = tl2.i();
            int i2 = (gdVar.b - gdVar.f333a) & gdVar.c;
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 >= 0) {
                    int i4 = gdVar.b;
                    int i5 = gdVar.f333a;
                    int i6 = gdVar.c;
                    if (i3 < ((i4 - i5) & i6)) {
                        Object obj = ((Object[]) gdVar.d)[(i5 + i3) & i6];
                        obj.getClass();
                        i.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            nr0 e = tl2.e(i);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f1024a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            tl1 tl1Var = this.g;
            tl1Var.getClass();
            sb2.append(Math.max(sl1.m.get(tl1Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + e.b() + ")[" + yr.Z(e, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            zu[] zuVarArr = this.f;
            int length = zuVarArr.length;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                zu zuVar = zuVarArr[i8];
                i7++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i7);
                sb3.append("] - ");
                sb3.append(zuVar != null ? zuVar.g.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (zuVar != null) {
                    zuVar.j(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(zu zuVar) {
        zuVar.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(zuVar);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
