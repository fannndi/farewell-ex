package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ol1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml1 f744a = new ml1(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(ml1 ml1Var) {
        ml1Var.getClass();
        if (ml1Var.f != null || ml1Var.g != null) {
            c.m(Gvyagftz.sizZP);
            return;
        }
        if (ml1Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        ml1 ml1Var2 = f744a;
        ml1 ml1Var3 = (ml1) atomicReference.getAndSet(ml1Var2);
        if (ml1Var3 == ml1Var2) {
            return;
        }
        int i = ml1Var3 != null ? ml1Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(ml1Var3);
            return;
        }
        ml1Var.f = ml1Var3;
        ml1Var.b = 0;
        ml1Var.c = i + rt0.y;
        atomicReference.set(ml1Var);
    }

    public static final ml1 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        ml1 ml1Var = f744a;
        ml1 ml1Var2 = (ml1) atomicReference.getAndSet(ml1Var);
        if (ml1Var2 == ml1Var) {
            return new ml1();
        }
        if (ml1Var2 == null) {
            atomicReference.set(null);
            return new ml1();
        }
        atomicReference.set(ml1Var2.f);
        ml1Var2.f = null;
        ml1Var2.c = 0;
        return ml1Var2;
    }
}
