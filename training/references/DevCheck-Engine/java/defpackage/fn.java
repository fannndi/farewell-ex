package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.PowerManager;
import android.util.SparseArray;
import java.util.Locale;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public final class fn {

    /* renamed from: a, reason: collision with root package name */
    public final int f297a;
    public final int b;
    public final Object c;
    public final Object d;

    public fn(a90 a90Var, fh fhVar) {
        this.c = new SparseArray();
        this.d = a90Var;
        TypedArray typedArray = (TypedArray) fhVar.i;
        this.f297a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(53, 0);
    }

    public fn(Context context, en enVar) {
        this.c = context.getApplicationContext();
        this.f297a = Math.max(1, Math.min(10, 3));
        this.b = Math.max(0, 10);
        this.d = enVar;
    }

    public static String b(r30 r30Var) {
        String str = r30Var.g;
        String str2 = r30Var.f;
        String str3 = yttXLrAeLjN.dRyQgA;
        String s = (str2 == null || str == null) ? r30Var.e : d51.s(str2, str3, str);
        Locale locale = Locale.ROOT;
        return "device: " + r30Var.f872a + str3 + r30Var.b + " (" + r30Var.c + ") | SoC: " + s + " | API " + r30Var.j + " | thermal=" + r30Var.r + " | batt=" + r30Var.p + "%" + (r30Var.q ? " (charging)" : "");
    }

    public static int e(PowerManager powerManager) {
        int currentThermalStatus;
        if (powerManager != null && Build.VERSION.SDK_INT >= 29) {
            try {
                currentThermalStatus = powerManager.getCurrentThermalStatus();
                return currentThermalStatus;
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public boolean a(PowerManager powerManager) {
        long nanoTime = System.nanoTime() + 4000000000L;
        en enVar = (en) this.d;
        int i = 4;
        if (enVar != null) {
            enVar.L(4);
            enVar.I(4);
        }
        while (System.nanoTime() < nanoTime) {
            try {
                Thread.sleep(500L);
                int e = e(powerManager);
                if (e >= 0 && e < 2) {
                    break;
                }
                int max = (int) Math.max(0L, ((nanoTime - System.nanoTime()) + 999999999) / 1000000000);
                if (max != i && enVar != null) {
                    enVar.I(max);
                    i = max;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                if (enVar == null) {
                    return false;
                }
                enVar.K();
                return false;
            }
        }
        if (enVar == null) {
            return true;
        }
        enVar.K();
        return true;
    }

    public void c(String str) {
        en enVar = (en) this.d;
        if (enVar != null) {
            enVar.n(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x03ce, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.dn d() {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn.d():dn");
    }
}
