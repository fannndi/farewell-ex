package defpackage;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n92 {
    public static int f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f669a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.f669a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n92 n92Var = (n92) arrayList.get(i);
                if (this.e == n92Var.b) {
                    c(this.c, n92Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(dr0 dr0Var, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.f669a;
        if (arrayList.size() == 0) {
            return 0;
        }
        jw jwVar = (jw) ((iw) arrayList.get(0)).T;
        dr0Var.t();
        jwVar.b(dr0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((iw) arrayList.get(i2)).b(dr0Var, false);
        }
        if (i == 0 && jwVar.z0 > 0) {
            kk1.b(jwVar, dr0Var, arrayList, 0);
        }
        if (i == 1 && jwVar.A0 > 0) {
            kk1.b(jwVar, dr0Var, arrayList, 1);
        }
        try {
            dr0Var.p();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            e.toString();
            Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", "");
            printStream.getClass();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iw iwVar = (iw) arrayList.get(i3);
            x42 x42Var = new x42();
            new WeakReference(iwVar);
            dr0.n(iwVar.I);
            dr0.n(iwVar.J);
            dr0.n(iwVar.K);
            dr0.n(iwVar.L);
            dr0.n(iwVar.M);
            this.d.add(x42Var);
        }
        if (i == 0) {
            n = dr0.n(jwVar.I);
            n2 = dr0.n(jwVar.K);
            dr0Var.t();
        } else {
            n = dr0.n(jwVar.J);
            n2 = dr0.n(jwVar.L);
            dr0Var.t();
        }
        return n2 - n;
    }

    public final void c(int i, n92 n92Var) {
        int i2 = n92Var.b;
        ArrayList arrayList = this.f669a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            iw iwVar = (iw) obj;
            ArrayList arrayList2 = n92Var.f669a;
            if (!arrayList2.contains(iwVar)) {
                arrayList2.add(iwVar);
            }
            if (i == 0) {
                iwVar.n0 = i2;
            } else {
                iwVar.o0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String t = d51.t(sb, this.b, "] <");
        ArrayList arrayList = this.f669a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            t = t + " " + ((iw) obj).h0;
        }
        return t.concat(" >");
    }
}
