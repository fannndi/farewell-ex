package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ae0 {
    public s2 A;
    public s2 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public de0 L;
    public final wa M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public l41 g;
    public final zf l;
    public final CopyOnWriteArrayList m;
    public final sd0 n;
    public final sd0 o;
    public final sd0 p;
    public final sd0 q;
    public final ud0 r;
    public int s;
    public nd0 t;
    public tl2 u;
    public ld0 v;
    public ld0 w;
    public final vd0 x;
    public final ai1 y;
    public s2 z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24a = new ArrayList();
    public final gr c = new gr(6);
    public final qd0 f = new qd0(this);
    public final vc h = new vc(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [sd0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [sd0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [sd0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [sd0] */
    public ae0() {
        Collections.synchronizedMap(new HashMap());
        this.l = new zf(this);
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new sw(this) { // from class: sd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sw
            public final void accept(Object obj) {
                int i2 = i;
                ae0 ae0Var = this.b;
                switch (i2) {
                    case 0:
                        if (ae0Var.J()) {
                            ae0Var.h(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        Integer num = (Integer) obj;
                        if (ae0Var.J() && num.intValue() == 80) {
                            ae0Var.l(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        oy0 oy0Var = (oy0) obj;
                        if (ae0Var.J()) {
                            boolean z = oy0Var.f767a;
                            ae0Var.m(false);
                            break;
                        }
                        break;
                    default:
                        h71 h71Var = (h71) obj;
                        if (ae0Var.J()) {
                            boolean z2 = h71Var.f369a;
                            ae0Var.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new sw(this) { // from class: sd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sw
            public final void accept(Object obj) {
                int i22 = i2;
                ae0 ae0Var = this.b;
                switch (i22) {
                    case 0:
                        if (ae0Var.J()) {
                            ae0Var.h(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        Integer num = (Integer) obj;
                        if (ae0Var.J() && num.intValue() == 80) {
                            ae0Var.l(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        oy0 oy0Var = (oy0) obj;
                        if (ae0Var.J()) {
                            boolean z = oy0Var.f767a;
                            ae0Var.m(false);
                            break;
                        }
                        break;
                    default:
                        h71 h71Var = (h71) obj;
                        if (ae0Var.J()) {
                            boolean z2 = h71Var.f369a;
                            ae0Var.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new sw(this) { // from class: sd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sw
            public final void accept(Object obj) {
                int i22 = i3;
                ae0 ae0Var = this.b;
                switch (i22) {
                    case 0:
                        if (ae0Var.J()) {
                            ae0Var.h(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        Integer num = (Integer) obj;
                        if (ae0Var.J() && num.intValue() == 80) {
                            ae0Var.l(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        oy0 oy0Var = (oy0) obj;
                        if (ae0Var.J()) {
                            boolean z = oy0Var.f767a;
                            ae0Var.m(false);
                            break;
                        }
                        break;
                    default:
                        h71 h71Var = (h71) obj;
                        if (ae0Var.J()) {
                            boolean z2 = h71Var.f369a;
                            ae0Var.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new sw(this) { // from class: sd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sw
            public final void accept(Object obj) {
                int i22 = i4;
                ae0 ae0Var = this.b;
                switch (i22) {
                    case 0:
                        if (ae0Var.J()) {
                            ae0Var.h(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        Integer num = (Integer) obj;
                        if (ae0Var.J() && num.intValue() == 80) {
                            ae0Var.l(false);
                            break;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        oy0 oy0Var = (oy0) obj;
                        if (ae0Var.J()) {
                            boolean z = oy0Var.f767a;
                            ae0Var.m(false);
                            break;
                        }
                        break;
                    default:
                        h71 h71Var = (h71) obj;
                        if (ae0Var.J()) {
                            boolean z2 = h71Var.f369a;
                            ae0Var.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new ud0(this);
        this.s = -1;
        this.x = new vd0(this);
        this.y = new ai1();
        this.C = new ArrayDeque();
        this.M = new wa(11, this);
    }

    public static boolean H(int i) {
        return Log.isLoggable(rQcwh.mWTOmkmVOsR, i);
    }

    public static boolean I(ld0 ld0Var) {
        if (ld0Var.I && ld0Var.J) {
            return true;
        }
        ArrayList q = ld0Var.A.c.q();
        int size = q.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = q.get(i);
            i++;
            ld0 ld0Var2 = (ld0) obj;
            if (ld0Var2 != null) {
                z = I(ld0Var2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(ld0 ld0Var) {
        if (ld0Var == null) {
            return true;
        }
        if (ld0Var.J) {
            return ld0Var.y == null || K(ld0Var.B);
        }
        return false;
    }

    public static boolean L(ld0 ld0Var) {
        if (ld0Var == null) {
            return true;
        }
        ae0 ae0Var = ld0Var.y;
        return ld0Var == ae0Var.w && L(ae0Var.v);
    }

    public final void A(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        gr grVar = this.c;
        boolean z5 = ((yb) arrayList.get(i)).r;
        ArrayList arrayList3 = this.K;
        if (arrayList3 == null) {
            this.K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.K.addAll(grVar.r());
        ld0 ld0Var = this.w;
        int i8 = i;
        boolean z6 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i2) {
                boolean z7 = z5;
                this.K.clear();
                if (!z7 && this.s >= 1) {
                    for (int i10 = i; i10 < i2; i10++) {
                        ArrayList arrayList4 = ((yb) arrayList.get(i10)).c;
                        int size = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList4.get(i11);
                            i11++;
                            ld0 ld0Var2 = ((me0) obj).b;
                            if (ld0Var2 != null && ld0Var2.y != null) {
                                grVar.w(f(ld0Var2));
                            }
                        }
                    }
                }
                for (int i12 = i; i12 < i2; i12++) {
                    yb ybVar = (yb) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                        ybVar.d(-1);
                        ae0 ae0Var = ybVar.s;
                        ArrayList arrayList5 = ybVar.c;
                        boolean z8 = true;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            me0 me0Var = (me0) arrayList5.get(size2);
                            ld0 ld0Var3 = me0Var.b;
                            if (ld0Var3 != null) {
                                if (ld0Var3.P != null) {
                                    ld0Var3.s().f475a = z8;
                                }
                                int i13 = ybVar.h;
                                int i14 = 8194;
                                int i15 = 4097;
                                if (i13 != 4097) {
                                    if (i13 != 8194) {
                                        i14 = 4100;
                                        i15 = 8197;
                                        if (i13 != 8197) {
                                            if (i13 == 4099) {
                                                i14 = 4099;
                                            } else if (i13 != 4100) {
                                                i14 = 0;
                                            }
                                        }
                                    }
                                    i14 = i15;
                                }
                                if (ld0Var3.P != null || i14 != 0) {
                                    ld0Var3.s();
                                    ld0Var3.P.f = i14;
                                }
                                ld0Var3.s();
                                ld0Var3.P.getClass();
                            }
                            switch (me0Var.f629a) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                    ld0Var3.l0(me0Var.d, me0Var.e, me0Var.f, me0Var.g);
                                    z8 = true;
                                    ae0Var.X(ld0Var3, true);
                                    ae0Var.S(ld0Var3);
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                default:
                                    rw.d(me0Var.f629a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    ld0Var3.l0(me0Var.d, me0Var.e, me0Var.f, me0Var.g);
                                    ae0Var.a(ld0Var3);
                                    z8 = true;
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                    ld0Var3.l0(me0Var.d, me0Var.e, me0Var.f, me0Var.g);
                                    ae0Var.getClass();
                                    if (H(2)) {
                                        Objects.toString(ld0Var3);
                                    }
                                    if (ld0Var3.F) {
                                        ld0Var3.F = false;
                                        ld0Var3.Q = !ld0Var3.Q;
                                    }
                                    z8 = true;
                                case 5:
                                    ld0Var3.l0(me0Var.d, me0Var.e, me0Var.f, me0Var.g);
                                    ae0Var.X(ld0Var3, true);
                                    if (H(2)) {
                                        Objects.toString(ld0Var3);
                                    }
                                    if (!ld0Var3.F) {
                                        ld0Var3.F = true;
                                        ld0Var3.Q = !ld0Var3.Q;
                                        ae0Var.a0(ld0Var3);
                                    }
                                    z8 = true;
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                    ld0Var3.l0(me0Var.d, me0Var.e, me0Var.f, me0Var.g);
                                    ae0Var.c(ld0Var3);
                                    z8 = true;
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                    ld0Var3.l0(me0Var.d, me0Var.e, me0Var.f, me0Var.g);
                                    ae0Var.X(ld0Var3, true);
                                    ae0Var.g(ld0Var3);
                                    z8 = true;
                                case 8:
                                    ae0Var.Z(null);
                                    z8 = true;
                                case rt0.o /* 9 */:
                                    ae0Var.Z(ld0Var3);
                                    z8 = true;
                                case 10:
                                    ae0Var.Y(ld0Var3, me0Var.h);
                                    z8 = true;
                            }
                        }
                    } else {
                        ybVar.d(1);
                        ae0 ae0Var2 = ybVar.s;
                        ArrayList arrayList6 = ybVar.c;
                        int size3 = arrayList6.size();
                        for (int i16 = 0; i16 < size3; i16++) {
                            me0 me0Var2 = (me0) arrayList6.get(i16);
                            ld0 ld0Var4 = me0Var2.b;
                            if (ld0Var4 != null) {
                                if (ld0Var4.P != null) {
                                    ld0Var4.s().f475a = false;
                                }
                                int i17 = ybVar.h;
                                if (ld0Var4.P != null || i17 != 0) {
                                    ld0Var4.s();
                                    ld0Var4.P.f = i17;
                                }
                                ld0Var4.s();
                                ld0Var4.P.getClass();
                            }
                            switch (me0Var2.f629a) {
                                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                    ld0Var4.l0(me0Var2.d, me0Var2.e, me0Var2.f, me0Var2.g);
                                    ae0Var2.X(ld0Var4, false);
                                    ae0Var2.a(ld0Var4);
                                    break;
                                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                default:
                                    rw.d(me0Var2.f629a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    ld0Var4.l0(me0Var2.d, me0Var2.e, me0Var2.f, me0Var2.g);
                                    ae0Var2.S(ld0Var4);
                                    break;
                                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                    ld0Var4.l0(me0Var2.d, me0Var2.e, me0Var2.f, me0Var2.g);
                                    ae0Var2.getClass();
                                    if (H(2)) {
                                        Objects.toString(ld0Var4);
                                    }
                                    if (ld0Var4.F) {
                                        break;
                                    } else {
                                        ld0Var4.F = true;
                                        ld0Var4.Q = !ld0Var4.Q;
                                        ae0Var2.a0(ld0Var4);
                                        break;
                                    }
                                case 5:
                                    ld0Var4.l0(me0Var2.d, me0Var2.e, me0Var2.f, me0Var2.g);
                                    ae0Var2.X(ld0Var4, false);
                                    if (H(2)) {
                                        Objects.toString(ld0Var4);
                                    }
                                    if (ld0Var4.F) {
                                        ld0Var4.F = false;
                                        ld0Var4.Q = !ld0Var4.Q;
                                        break;
                                    } else {
                                        break;
                                    }
                                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                    ld0Var4.l0(me0Var2.d, me0Var2.e, me0Var2.f, me0Var2.g);
                                    ae0Var2.g(ld0Var4);
                                    break;
                                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                    ld0Var4.l0(me0Var2.d, me0Var2.e, me0Var2.f, me0Var2.g);
                                    ae0Var2.X(ld0Var4, false);
                                    ae0Var2.c(ld0Var4);
                                    break;
                                case 8:
                                    ae0Var2.Z(ld0Var4);
                                    break;
                                case rt0.o /* 9 */:
                                    ae0Var2.Z(null);
                                    break;
                                case 10:
                                    ae0Var2.Y(ld0Var4, me0Var2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i18 = i; i18 < i2; i18++) {
                    yb ybVar2 = (yb) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size4 = ybVar2.c.size() - 1; size4 >= 0; size4--) {
                            ld0 ld0Var5 = ((me0) ybVar2.c.get(size4)).b;
                            if (ld0Var5 != null) {
                                f(ld0Var5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = ybVar2.c;
                        int size5 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            Object obj2 = arrayList7.get(i19);
                            i19++;
                            ld0 ld0Var6 = ((me0) obj2).b;
                            if (ld0Var6 != null) {
                                f(ld0Var6).k();
                            }
                        }
                    }
                }
                N(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i2; i20++) {
                    ArrayList arrayList8 = ((yb) arrayList.get(i20)).c;
                    int size6 = arrayList8.size();
                    int i21 = 0;
                    while (i21 < size6) {
                        Object obj3 = arrayList8.get(i21);
                        i21++;
                        ld0 ld0Var7 = ((me0) obj3).b;
                        if (ld0Var7 != null && (viewGroup = ld0Var7.L) != null) {
                            hashSet.add(k20.f(viewGroup, G()));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    k20 k20Var = (k20) it.next();
                    k20Var.d = booleanValue;
                    synchronized (k20Var.b) {
                        try {
                            k20Var.g();
                            k20Var.e = false;
                            int size7 = k20Var.b.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    up1 up1Var = (up1) k20Var.b.get(size7);
                                    int d = d51.d(up1Var.c.M);
                                    if (up1Var.f1051a != 2 || d == 2) {
                                        size7--;
                                    } else {
                                        jd0 jd0Var = up1Var.c.P;
                                        k20Var.e = false;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    k20Var.c();
                }
                for (int i22 = i; i22 < i2; i22++) {
                    yb ybVar3 = (yb) arrayList.get(i22);
                    if (((Boolean) arrayList2.get(i22)).booleanValue() && ybVar3.u >= 0) {
                        ybVar3.u = -1;
                    }
                    ybVar3.getClass();
                }
                return;
            }
            yb ybVar4 = (yb) arrayList.get(i8);
            boolean booleanValue2 = ((Boolean) arrayList2.get(i8)).booleanValue();
            ArrayList arrayList9 = this.K;
            if (booleanValue2) {
                z = z5;
                i3 = i8;
                z2 = z6;
                int i23 = 1;
                ArrayList arrayList10 = ybVar4.c;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    me0 me0Var3 = (me0) arrayList10.get(size8);
                    int i24 = me0Var3.f629a;
                    if (i24 != i23) {
                        if (i24 != 3) {
                            switch (i24) {
                                case 8:
                                    ld0Var = null;
                                    break;
                                case rt0.o /* 9 */:
                                    ld0Var = me0Var3.b;
                                    break;
                                case 10:
                                    me0Var3.i = me0Var3.h;
                                    break;
                            }
                            size8--;
                            i23 = 1;
                        }
                        arrayList9.add(me0Var3.b);
                        size8--;
                        i23 = 1;
                    }
                    arrayList9.remove(me0Var3.b);
                    size8--;
                    i23 = 1;
                }
            } else {
                ArrayList arrayList11 = ybVar4.c;
                int i25 = 0;
                while (i25 < arrayList11.size()) {
                    me0 me0Var4 = (me0) arrayList11.get(i25);
                    int i26 = me0Var4.f629a;
                    if (i26 != i9) {
                        if (i26 != 2) {
                            if (i26 == 3 || i26 == 6) {
                                z3 = z5;
                                arrayList9.remove(me0Var4.b);
                                ld0 ld0Var8 = me0Var4.b;
                                if (ld0Var8 == ld0Var) {
                                    arrayList11.add(i25, new me0(9, ld0Var8));
                                    i25++;
                                    i5 = i8;
                                    z4 = z6;
                                    i4 = 1;
                                    ld0Var = null;
                                }
                            } else if (i26 == 7) {
                                z3 = z5;
                                i4 = 1;
                            } else if (i26 != 8) {
                                z3 = z5;
                            } else {
                                z3 = z5;
                                arrayList11.add(i25, new me0(9, ld0Var, 0));
                                me0Var4.c = true;
                                i25++;
                                ld0Var = me0Var4.b;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                        } else {
                            z3 = z5;
                            ld0 ld0Var9 = me0Var4.b;
                            int i27 = ld0Var9.D;
                            int size9 = arrayList9.size() - 1;
                            boolean z9 = false;
                            while (size9 >= 0) {
                                int i28 = i8;
                                ld0 ld0Var10 = (ld0) arrayList9.get(size9);
                                boolean z10 = z6;
                                if (ld0Var10.D != i27) {
                                    i6 = i27;
                                } else if (ld0Var10 == ld0Var9) {
                                    i6 = i27;
                                    z9 = true;
                                } else {
                                    if (ld0Var10 == ld0Var) {
                                        i6 = i27;
                                        i7 = 0;
                                        arrayList11.add(i25, new me0(9, ld0Var10, 0));
                                        i25++;
                                        ld0Var = null;
                                    } else {
                                        i6 = i27;
                                        i7 = 0;
                                    }
                                    me0 me0Var5 = new me0(3, ld0Var10, i7);
                                    me0Var5.d = me0Var4.d;
                                    me0Var5.f = me0Var4.f;
                                    me0Var5.e = me0Var4.e;
                                    me0Var5.g = me0Var4.g;
                                    arrayList11.add(i25, me0Var5);
                                    arrayList9.remove(ld0Var10);
                                    i25++;
                                    ld0Var = ld0Var;
                                }
                                size9--;
                                i27 = i6;
                                z6 = z10;
                                i8 = i28;
                            }
                            i5 = i8;
                            z4 = z6;
                            i4 = 1;
                            if (z9) {
                                arrayList11.remove(i25);
                                i25--;
                            } else {
                                me0Var4.f629a = 1;
                                me0Var4.c = true;
                                arrayList9.add(ld0Var9);
                            }
                        }
                        i25 += i4;
                        i9 = i4;
                        z5 = z3;
                        z6 = z4;
                        i8 = i5;
                    } else {
                        z3 = z5;
                        i4 = i9;
                    }
                    i5 = i8;
                    z4 = z6;
                    arrayList9.add(me0Var4.b);
                    i25 += i4;
                    i9 = i4;
                    z5 = z3;
                    z6 = z4;
                    i8 = i5;
                }
                z = z5;
                i3 = i8;
                z2 = z6;
            }
            z6 = z2 || ybVar4.i;
            i8 = i3 + 1;
            z5 = z;
        }
    }

    public final ld0 B(int i) {
        gr grVar = this.c;
        ArrayList arrayList = (ArrayList) grVar.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ld0 ld0Var = (ld0) arrayList.get(size);
            if (ld0Var != null && ld0Var.C == i) {
                return ld0Var;
            }
        }
        for (je0 je0Var : ((HashMap) grVar.h).values()) {
            if (je0Var != null) {
                ld0 ld0Var2 = je0Var.c;
                if (ld0Var2.C == i) {
                    return ld0Var2;
                }
            }
        }
        return null;
    }

    public final ld0 C(String str) {
        gr grVar = this.c;
        ArrayList arrayList = (ArrayList) grVar.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ld0 ld0Var = (ld0) arrayList.get(size);
            if (ld0Var != null && str.equals(ld0Var.E)) {
                return ld0Var;
            }
        }
        for (je0 je0Var : ((HashMap) grVar.h).values()) {
            if (je0Var != null) {
                ld0 ld0Var2 = je0Var.c;
                if (str.equals(ld0Var2.E)) {
                    return ld0Var2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            k20 k20Var = (k20) it.next();
            if (k20Var.e) {
                H(2);
                k20Var.e = false;
                k20Var.c();
            }
        }
    }

    public final ViewGroup E(ld0 ld0Var) {
        ViewGroup viewGroup = ld0Var.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (ld0Var.D <= 0 || !this.u.C()) {
            return null;
        }
        View B = this.u.B(ld0Var.D);
        if (B instanceof ViewGroup) {
            return (ViewGroup) B;
        }
        return null;
    }

    public final vd0 F() {
        ld0 ld0Var = this.v;
        return ld0Var != null ? ld0Var.y.F() : this.x;
    }

    public final ai1 G() {
        ld0 ld0Var = this.v;
        return ld0Var != null ? ld0Var.y.G() : this.y;
    }

    public final boolean J() {
        ld0 ld0Var = this.v;
        if (ld0Var == null) {
            return true;
        }
        return ld0Var.G() && this.v.y().J();
    }

    public final boolean M() {
        return this.E || this.F;
    }

    public final void N(int i, boolean z) {
        nd0 nd0Var;
        if (this.t == null && i != -1) {
            c.n("No activity");
            return;
        }
        if (z || i != this.s) {
            this.s = i;
            gr grVar = this.c;
            HashMap hashMap = (HashMap) grVar.h;
            ArrayList arrayList = (ArrayList) grVar.i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                je0 je0Var = (je0) hashMap.get(((ld0) obj).l);
                if (je0Var != null) {
                    je0Var.k();
                }
            }
            for (je0 je0Var2 : hashMap.values()) {
                if (je0Var2 != null) {
                    je0Var2.k();
                    ld0 ld0Var = je0Var2.c;
                    if (ld0Var.s && !ld0Var.I()) {
                        grVar.x(je0Var2);
                    }
                }
            }
            b0();
            if (this.D && (nd0Var = this.t) != null && this.s == 7) {
                nd0Var.r.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void O() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.g = false;
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null) {
                ld0Var.A.O();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i, int i2) {
        y(false);
        x(true);
        ld0 ld0Var = this.w;
        if (ld0Var != null && i < 0 && ld0Var.u().P()) {
            return true;
        }
        boolean R = R(this.I, this.J, i, i2);
        if (R) {
            this.b = true;
            try {
                T(this.I, this.J);
            } finally {
                d();
            }
        }
        d0();
        u();
        ((HashMap) this.c.h).values().removeAll(Collections.singleton(null));
        return R;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    yb ybVar = (yb) this.d.get(size);
                    if (i >= 0 && i == ybVar.u) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        yb ybVar2 = (yb) this.d.get(i3 - 1);
                        if (i < 0 || i != ybVar2.u) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((yb) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(ld0 ld0Var) {
        if (H(2)) {
            Objects.toString(ld0Var);
        }
        boolean I = ld0Var.I();
        if (ld0Var.G && I) {
            return;
        }
        gr grVar = this.c;
        synchronized (((ArrayList) grVar.i)) {
            ((ArrayList) grVar.i).remove(ld0Var);
        }
        ld0Var.r = false;
        if (I(ld0Var)) {
            this.D = true;
        }
        ld0Var.s = true;
        a0(ld0Var);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            c.n("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((yb) arrayList.get(i)).r) {
                if (i2 != i) {
                    A(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((yb) arrayList.get(i2)).r) {
                        i2++;
                    }
                }
                A(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            A(arrayList, arrayList2, i2, size);
        }
    }

    public final void U(Parcelable parcelable) {
        zf zfVar;
        int i;
        int i2;
        je0 je0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.o.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.o.getClassLoader());
                arrayList.add((ge0) bundle.getParcelable("state"));
            }
        }
        gr grVar = this.c;
        HashMap hashMap = (HashMap) grVar.j;
        HashMap hashMap2 = (HashMap) grVar.h;
        hashMap.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ge0 ge0Var = (ge0) obj;
            hashMap.put(ge0Var.h, ge0Var);
        }
        be0 be0Var = (be0) bundle3.getParcelable("state");
        if (be0Var == null) {
            return;
        }
        hashMap2.clear();
        ArrayList arrayList2 = be0Var.g;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            zfVar = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            ge0 ge0Var2 = (ge0) ((HashMap) grVar.j).remove((String) obj2);
            if (ge0Var2 != null) {
                ld0 ld0Var = (ld0) this.L.b.get(ge0Var2.h);
                if (ld0Var != null) {
                    if (H(2)) {
                        ld0Var.toString();
                    }
                    je0Var = new je0(zfVar, grVar, ld0Var, ge0Var2);
                } else {
                    je0Var = new je0(this.l, this.c, this.t.o.getClassLoader(), F(), ge0Var2);
                }
                ld0 ld0Var2 = je0Var.c;
                ld0Var2.y = this;
                if (H(2)) {
                    ld0Var2.toString();
                }
                je0Var.m(this.t.o.getClassLoader());
                grVar.w(je0Var);
                je0Var.e = this.s;
            }
        }
        de0 de0Var = this.L;
        de0Var.getClass();
        ArrayList arrayList3 = new ArrayList(de0Var.b.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            ld0 ld0Var3 = (ld0) obj3;
            if (hashMap2.get(ld0Var3.l) == null) {
                if (H(2)) {
                    ld0Var3.toString();
                    Objects.toString(be0Var.g);
                }
                this.L.d(ld0Var3);
                ld0Var3.y = this;
                je0 je0Var2 = new je0(zfVar, grVar, ld0Var3);
                je0Var2.e = 1;
                je0Var2.k();
                ld0Var3.s = true;
                je0Var2.k();
            }
        }
        ArrayList arrayList4 = be0Var.h;
        ((ArrayList) grVar.i).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                ld0 j = grVar.j(str3);
                if (j == null) {
                    c.n(d51.y("No instantiated fragment for (", str3, ")"));
                    return;
                } else {
                    if (H(2)) {
                        j.toString();
                    }
                    grVar.a(j);
                }
            }
        }
        if (be0Var.i != null) {
            this.d = new ArrayList(be0Var.i.length);
            int i7 = 0;
            while (true) {
                zb[] zbVarArr = be0Var.i;
                if (i7 >= zbVarArr.length) {
                    break;
                }
                zb zbVar = zbVarArr[i7];
                ArrayList arrayList5 = zbVar.h;
                yb ybVar = new yb(this);
                int[] iArr = zbVar.g;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    me0 me0Var = new me0();
                    int i10 = i8 + 1;
                    me0Var.f629a = iArr[i8];
                    if (H(i)) {
                        Objects.toString(ybVar);
                        int i11 = iArr[i10];
                    }
                    int i12 = i;
                    me0Var.h = yp0.values()[zbVar.i[i9]];
                    me0Var.i = yp0.values()[zbVar.j[i9]];
                    int i13 = i8 + 2;
                    me0Var.c = iArr[i10] != 0;
                    int i14 = iArr[i13];
                    me0Var.d = i14;
                    int i15 = iArr[i8 + 3];
                    me0Var.e = i15;
                    int i16 = i8 + 5;
                    int i17 = iArr[i8 + 4];
                    me0Var.f = i17;
                    i8 += 6;
                    int i18 = iArr[i16];
                    me0Var.g = i18;
                    ybVar.d = i14;
                    ybVar.e = i15;
                    ybVar.f = i17;
                    ybVar.g = i18;
                    ybVar.b(me0Var);
                    i9++;
                    i = i12;
                }
                int i19 = i;
                ybVar.h = zbVar.k;
                ybVar.k = zbVar.l;
                ybVar.i = true;
                ybVar.l = zbVar.n;
                ybVar.m = zbVar.o;
                ybVar.n = zbVar.p;
                ybVar.o = zbVar.q;
                ybVar.p = zbVar.r;
                ybVar.q = zbVar.s;
                ybVar.r = zbVar.t;
                ybVar.u = zbVar.m;
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    String str4 = (String) arrayList5.get(i20);
                    if (str4 != null) {
                        ((me0) ybVar.c.get(i20)).b = grVar.j(str4);
                    }
                }
                ybVar.d(1);
                if (H(i19)) {
                    ybVar.toString();
                    PrintWriter printWriter = new PrintWriter(new et0());
                    ybVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(ybVar);
                i7++;
                i = i19;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(be0Var.j);
        String str5 = be0Var.k;
        if (str5 != null) {
            ld0 j2 = grVar.j(str5);
            this.w = j2;
            q(j2);
        }
        ArrayList arrayList6 = be0Var.l;
        if (arrayList6 != null) {
            for (int i21 = i2; i21 < arrayList6.size(); i21++) {
                this.j.put((String) arrayList6.get(i21), (ac) be0Var.m.get(i21));
            }
        }
        this.C = new ArrayDeque(be0Var.n);
    }

    public final Bundle V() {
        int i;
        ArrayList arrayList;
        zb[] zbVarArr;
        int size;
        Bundle bundle = new Bundle();
        D();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((k20) it.next()).e();
        }
        y(true);
        this.E = true;
        this.L.g = true;
        gr grVar = this.c;
        grVar.getClass();
        HashMap hashMap = (HashMap) grVar.h;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (je0 je0Var : hashMap.values()) {
            if (je0Var != null) {
                ld0 ld0Var = je0Var.c;
                ge0 ge0Var = new ge0(ld0Var);
                if (ld0Var.g <= -1 || ge0Var.s != null) {
                    ge0Var.s = ld0Var.h;
                } else {
                    Bundle o = je0Var.o();
                    ge0Var.s = o;
                    if (ld0Var.o != null) {
                        if (o == null) {
                            ge0Var.s = new Bundle();
                        }
                        ge0Var.s.putString("android:target_state", ld0Var.o);
                        int i2 = ld0Var.p;
                        if (i2 != 0) {
                            ge0Var.s.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(ld0Var.l);
                if (H(2)) {
                    ld0Var.toString();
                    Objects.toString(ld0Var.h);
                }
            }
        }
        gr grVar2 = this.c;
        grVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) grVar2.j).values());
        if (arrayList3.isEmpty()) {
            H(2);
            return bundle;
        }
        gr grVar3 = this.c;
        synchronized (((ArrayList) grVar3.i)) {
            try {
                i = 0;
                if (((ArrayList) grVar3.i).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) grVar3.i).size());
                    ArrayList arrayList4 = (ArrayList) grVar3.i;
                    int size2 = arrayList4.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList4.get(i3);
                        i3++;
                        ld0 ld0Var2 = (ld0) obj;
                        arrayList.add(ld0Var2.l);
                        if (H(2)) {
                            ld0Var2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
            zbVarArr = null;
        } else {
            zbVarArr = new zb[size];
            for (int i4 = 0; i4 < size; i4++) {
                zbVarArr[i4] = new zb((yb) this.d.get(i4));
                if (H(2)) {
                    Objects.toString(this.d.get(i4));
                }
            }
        }
        be0 be0Var = new be0();
        be0Var.k = null;
        ArrayList arrayList6 = new ArrayList();
        be0Var.l = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        be0Var.m = arrayList7;
        be0Var.g = arrayList2;
        be0Var.h = arrayList;
        be0Var.i = zbVarArr;
        be0Var.j = this.i.get();
        ld0 ld0Var3 = this.w;
        if (ld0Var3 != null) {
            be0Var.k = ld0Var3.l;
        }
        arrayList6.addAll(this.j.keySet());
        arrayList7.addAll(this.j.values());
        be0Var.n = new ArrayList(this.C);
        bundle.putParcelable("state", be0Var);
        for (String str : this.k.keySet()) {
            bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
        }
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            ge0 ge0Var2 = (ge0) obj2;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("state", ge0Var2);
            bundle.putBundle("fragment_" + ge0Var2.h, bundle2);
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.f24a) {
            try {
                if (this.f24a.size() == 1) {
                    this.t.p.removeCallbacks(this.M);
                    this.t.p.post(this.M);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(ld0 ld0Var, boolean z) {
        ViewGroup E = E(ld0Var);
        if (E == null || !(E instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) E).setDrawDisappearingViewsLast(!z);
    }

    public final void Y(ld0 ld0Var, yp0 yp0Var) {
        if (ld0Var == this.c.j(ld0Var.l) && (ld0Var.z == null || ld0Var.y == this)) {
            ld0Var.U = yp0Var;
        } else {
            rw.h("Fragment ", ld0Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void Z(ld0 ld0Var) {
        if (ld0Var != null) {
            if (ld0Var != this.c.j(ld0Var.l) || (ld0Var.z != null && ld0Var.y != this)) {
                rw.h("Fragment ", ld0Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        ld0 ld0Var2 = this.w;
        this.w = ld0Var;
        q(ld0Var2);
        q(this.w);
    }

    public final je0 a(ld0 ld0Var) {
        String str = ld0Var.T;
        if (str != null) {
            le0.c(ld0Var, str);
        }
        if (H(2)) {
            ld0Var.toString();
        }
        je0 f = f(ld0Var);
        ld0Var.y = this;
        gr grVar = this.c;
        grVar.w(f);
        if (!ld0Var.G) {
            grVar.a(ld0Var);
            ld0Var.s = false;
            if (ld0Var.M == null) {
                ld0Var.Q = false;
            }
            if (I(ld0Var)) {
                this.D = true;
            }
        }
        return f;
    }

    public final void a0(ld0 ld0Var) {
        ViewGroup E = E(ld0Var);
        if (E != null) {
            jd0 jd0Var = ld0Var.P;
            if ((jd0Var == null ? 0 : jd0Var.e) + (jd0Var == null ? 0 : jd0Var.d) + (jd0Var == null ? 0 : jd0Var.c) + (jd0Var == null ? 0 : jd0Var.b) > 0) {
                if (E.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    E.setTag(R.id.visible_removing_fragment_view_tag, ld0Var);
                }
                ld0 ld0Var2 = (ld0) E.getTag(R.id.visible_removing_fragment_view_tag);
                jd0 jd0Var2 = ld0Var.P;
                boolean z = jd0Var2 != null ? jd0Var2.f475a : false;
                if (ld0Var2.P == null) {
                    return;
                }
                ld0Var2.s().f475a = z;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(nd0 nd0Var, tl2 tl2Var, ld0 ld0Var) {
        if (this.t != null) {
            c.n("Already attached");
            return;
        }
        this.t = nd0Var;
        this.u = tl2Var;
        this.v = ld0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (ld0Var != 0) {
            copyOnWriteArrayList.add(new wd0(ld0Var));
        } else if (nd0Var != null) {
            copyOnWriteArrayList.add(nd0Var);
        }
        if (this.v != null) {
            d0();
        }
        if (nd0Var != null) {
            l41 k = nd0Var.r.k();
            this.g = k;
            k.a(ld0Var != 0 ? ld0Var : nd0Var, this.h);
        }
        int i = 0;
        if (ld0Var != 0) {
            de0 de0Var = ld0Var.y.L;
            HashMap hashMap = de0Var.c;
            de0 de0Var2 = (de0) hashMap.get(ld0Var.l);
            if (de0Var2 == null) {
                de0Var2 = new de0(de0Var.e);
                hashMap.put(ld0Var.l, de0Var2);
            }
            this.L = de0Var2;
        } else if (nd0Var != null) {
            n72 l = nd0Var.r.l();
            l.getClass();
            ty tyVar = ty.b;
            tyVar.getClass();
            gr grVar = new gr(l, de0.h, tyVar);
            vq a2 = af1.a(de0.class);
            String b = a2.b();
            if (b == null) {
                c.m("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.L = (de0) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        } else {
            this.L = new de0(false);
        }
        this.L.g = M();
        this.c.k = this.L;
        nd0 nd0Var2 = this.t;
        int i2 = 2;
        if (nd0Var2 != null && ld0Var == 0) {
            zf a3 = nd0Var2.a();
            a3.K("android:support:fragments", new rt(i2, this));
            Bundle g = a3.g("android:support:fragments");
            if (g != null) {
                U(g);
            }
        }
        nd0 nd0Var3 = this.t;
        if (nd0Var3 != null) {
            tt ttVar = nd0Var3.r.r;
            String concat = "FragmentManager:".concat(ld0Var != 0 ? d51.u(new StringBuilder(), ld0Var.l, ":") : "");
            int i3 = 1;
            this.z = ttVar.c(concat.concat("StartActivityForResult"), new q2(i3), new td0(this, i3));
            this.A = ttVar.c(concat.concat("StartIntentSenderForResult"), new q2(3), new td0(this, i2));
            this.B = ttVar.c(concat.concat("RequestPermissions"), new q2(i), new td0(this, i));
        }
        nd0 nd0Var4 = this.t;
        if (nd0Var4 != null) {
            nd0Var4.r.f(this.n);
        }
        nd0 nd0Var5 = this.t;
        if (nd0Var5 != null) {
            nd0Var5.r.t.add(this.o);
        }
        nd0 nd0Var6 = this.t;
        if (nd0Var6 != null) {
            nd0Var6.r.v.add(this.p);
        }
        nd0 nd0Var7 = this.t;
        if (nd0Var7 != null) {
            nd0Var7.r.w.add(this.q);
        }
        nd0 nd0Var8 = this.t;
        if (nd0Var8 == null || ld0Var != 0) {
            return;
        }
        fh fhVar = nd0Var8.r.i;
        ((CopyOnWriteArrayList) fhVar.i).add(this.r);
        ((Runnable) fhVar.h).run();
    }

    public final void b0() {
        ArrayList o = this.c.o();
        int size = o.size();
        int i = 0;
        while (i < size) {
            Object obj = o.get(i);
            i++;
            je0 je0Var = (je0) obj;
            ld0 ld0Var = je0Var.c;
            if (ld0Var.N) {
                if (this.b) {
                    this.H = true;
                } else {
                    ld0Var.N = false;
                    je0Var.k();
                }
            }
        }
    }

    public final void c(ld0 ld0Var) {
        if (H(2)) {
            Objects.toString(ld0Var);
        }
        if (ld0Var.G) {
            ld0Var.G = false;
            if (ld0Var.r) {
                return;
            }
            this.c.a(ld0Var);
            if (H(2)) {
                ld0Var.toString();
            }
            if (I(ld0Var)) {
                this.D = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new et0());
        nd0 nd0Var = this.t;
        try {
            if (nd0Var != null) {
                nd0Var.r.dump("  ", null, printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void d0() {
        synchronized (this.f24a) {
            try {
                if (!this.f24a.isEmpty()) {
                    vc vcVar = this.h;
                    vcVar.f107a = true;
                    af0 af0Var = vcVar.c;
                    if (af0Var != null) {
                        af0Var.a();
                    }
                    return;
                }
                vc vcVar2 = this.h;
                ArrayList arrayList = this.d;
                vcVar2.f107a = (arrayList != null ? arrayList.size() : 0) > 0 && L(this.v);
                af0 af0Var2 = vcVar2.c;
                if (af0Var2 != null) {
                    af0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList o = this.c.o();
        int size = o.size();
        int i = 0;
        while (i < size) {
            Object obj = o.get(i);
            i++;
            ViewGroup viewGroup = ((je0) obj).c.L;
            if (viewGroup != null) {
                hashSet.add(k20.f(viewGroup, G()));
            }
        }
        return hashSet;
    }

    public final je0 f(ld0 ld0Var) {
        String str = ld0Var.l;
        gr grVar = this.c;
        je0 je0Var = (je0) ((HashMap) grVar.h).get(str);
        if (je0Var != null) {
            return je0Var;
        }
        je0 je0Var2 = new je0(this.l, grVar, ld0Var);
        je0Var2.m(this.t.o.getClassLoader());
        je0Var2.e = this.s;
        return je0Var2;
    }

    public final void g(ld0 ld0Var) {
        if (H(2)) {
            Objects.toString(ld0Var);
        }
        if (ld0Var.G) {
            return;
        }
        ld0Var.G = true;
        if (ld0Var.r) {
            if (H(2)) {
                ld0Var.toString();
            }
            gr grVar = this.c;
            synchronized (((ArrayList) grVar.i)) {
                ((ArrayList) grVar.i).remove(ld0Var);
            }
            ld0Var.r = false;
            if (I(ld0Var)) {
                this.D = true;
            }
            a0(ld0Var);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null) {
                ld0Var.K = true;
                if (z) {
                    ld0Var.A.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (ld0 ld0Var : this.c.r()) {
                if (ld0Var != null) {
                    if (!ld0Var.F ? ld0Var.A.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null && K(ld0Var)) {
                if (ld0Var.F) {
                    z = false;
                } else {
                    if (ld0Var.I && ld0Var.J) {
                        ld0Var.N(menu, menuInflater);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z2 | ld0Var.A.j(menu, menuInflater);
                }
                if (z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ld0Var);
                    z3 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                ld0 ld0Var2 = (ld0) this.e.get(i);
                if (arrayList == null || !arrayList.contains(ld0Var2)) {
                    ld0Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z3;
    }

    public final void k() {
        boolean z = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((k20) it.next()).e();
        }
        nd0 nd0Var = this.t;
        gr grVar = this.c;
        if (nd0Var != null) {
            z = ((de0) grVar.k).f;
        } else {
            a5 a5Var = nd0Var.o;
            if (a5Var != null) {
                z = true ^ a5Var.isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((ac) it2.next()).g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    de0 de0Var = (de0) grVar.k;
                    de0Var.getClass();
                    H(3);
                    de0Var.c((String) obj);
                }
            }
        }
        t(-1);
        nd0 nd0Var2 = this.t;
        if (nd0Var2 != null) {
            nd0Var2.r.t.remove(this.o);
        }
        nd0 nd0Var3 = this.t;
        if (nd0Var3 != null) {
            nd0Var3.r.s.remove(this.n);
        }
        nd0 nd0Var4 = this.t;
        if (nd0Var4 != null) {
            nd0Var4.r.v.remove(this.p);
        }
        nd0 nd0Var5 = this.t;
        if (nd0Var5 != null) {
            nd0Var5.r.w.remove(this.q);
        }
        nd0 nd0Var6 = this.t;
        if (nd0Var6 != null) {
            fh fhVar = nd0Var6.r.i;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) fhVar.i;
            ud0 ud0Var = this.r;
            copyOnWriteArrayList.remove(ud0Var);
            if (((HashMap) fhVar.j).remove(ud0Var) == null) {
                ((Runnable) fhVar.h).run();
            } else {
                rw.b();
            }
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((xn) it3.next()).cancel();
            }
            this.g = null;
        }
        s2 s2Var = this.z;
        if (s2Var != null) {
            s2Var.n.e(s2Var.m);
            s2 s2Var2 = this.A;
            s2Var2.n.e(s2Var2.m);
            s2 s2Var3 = this.B;
            s2Var3.n.e(s2Var3.m);
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null) {
                ld0Var.K = true;
                if (z) {
                    ld0Var.A.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null && z) {
                ld0Var.A.m(true);
            }
        }
    }

    public final void n() {
        ArrayList q = this.c.q();
        int size = q.size();
        int i = 0;
        while (i < size) {
            Object obj = q.get(i);
            i++;
            ld0 ld0Var = (ld0) obj;
            if (ld0Var != null) {
                ld0Var.T(ld0Var.H());
                ld0Var.A.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.s >= 1) {
            for (ld0 ld0Var : this.c.r()) {
                if (ld0Var != null) {
                    if (!ld0Var.F ? (ld0Var.I && ld0Var.J && ld0Var.U(menuItem)) ? true : ld0Var.A.o(menuItem) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null && !ld0Var.F) {
                ld0Var.A.p();
            }
        }
    }

    public final void q(ld0 ld0Var) {
        if (ld0Var != null) {
            if (ld0Var != this.c.j(ld0Var.l)) {
                return;
            }
            ld0Var.y.getClass();
            boolean L = L(ld0Var);
            Boolean bool = ld0Var.q;
            if (bool == null || bool.booleanValue() != L) {
                ld0Var.q = Boolean.valueOf(L);
                ae0 ae0Var = ld0Var.A;
                ae0Var.d0();
                ae0Var.q(ae0Var.w);
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null && z) {
                ld0Var.A.r(true);
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z;
        boolean z2;
        if (this.s < 1) {
            return false;
        }
        boolean z3 = false;
        for (ld0 ld0Var : this.c.r()) {
            if (ld0Var != null && K(ld0Var)) {
                if (ld0Var.F) {
                    z = false;
                } else {
                    if (ld0Var.I && ld0Var.J) {
                        ld0Var.W(menu);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = ld0Var.A.s(menu) | z2;
                }
                if (z) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (je0 je0Var : ((HashMap) this.c.h).values()) {
                if (je0Var != null) {
                    je0Var.e = i;
                }
            }
            N(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((k20) it.next()).e();
            }
            this.b = false;
            y(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(rt0.s);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ld0 ld0Var = this.v;
        String str = gXdyRQCGVlHW.skaigUyzKM;
        if (ld0Var != null) {
            sb.append(ld0Var.getClass().getSimpleName());
            sb.append(str);
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            nd0 nd0Var = this.t;
            if (nd0Var != null) {
                sb.append(nd0Var.getClass().getSimpleName());
                sb.append(str);
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            b0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        gr grVar = this.c;
        ArrayList arrayList = (ArrayList) grVar.i;
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) grVar.h;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (je0 je0Var : hashMap.values()) {
                printWriter.print(str);
                if (je0Var != null) {
                    ld0 ld0Var = je0Var.c;
                    printWriter.println(ld0Var);
                    ld0Var.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(ld0Var.C));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(ld0Var.D));
                    printWriter.print(" mTag=");
                    printWriter.println(ld0Var.E);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(ld0Var.g);
                    printWriter.print(" mWho=");
                    printWriter.print(ld0Var.l);
                    printWriter.print(tEegR.hQkXRVUKS);
                    printWriter.println(ld0Var.x);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(ld0Var.r);
                    printWriter.print(" mRemoving=");
                    printWriter.print(ld0Var.s);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(ld0Var.t);
                    printWriter.print(" mInLayout=");
                    printWriter.println(ld0Var.u);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(ld0Var.F);
                    printWriter.print(" mDetached=");
                    printWriter.print(ld0Var.G);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(ld0Var.J);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(ld0Var.I);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(ld0Var.H);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(ld0Var.O);
                    if (ld0Var.y != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(ld0Var.y);
                    }
                    if (ld0Var.z != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(ld0Var.z);
                    }
                    if (ld0Var.B != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(ld0Var.B);
                    }
                    if (ld0Var.m != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(ld0Var.m);
                    }
                    if (ld0Var.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(ld0Var.h);
                    }
                    if (ld0Var.i != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(ld0Var.i);
                    }
                    if (ld0Var.j != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(ld0Var.j);
                    }
                    Object C = ld0Var.C(false);
                    if (C != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(C);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(ld0Var.p);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    jd0 jd0Var = ld0Var.P;
                    printWriter.println(jd0Var == null ? false : jd0Var.f475a);
                    jd0 jd0Var2 = ld0Var.P;
                    if ((jd0Var2 == null ? 0 : jd0Var2.b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        jd0 jd0Var3 = ld0Var.P;
                        printWriter.println(jd0Var3 == null ? 0 : jd0Var3.b);
                    }
                    jd0 jd0Var4 = ld0Var.P;
                    if ((jd0Var4 == null ? 0 : jd0Var4.c) != 0) {
                        printWriter.print(str3);
                        printWriter.print(tEegR.NYoiqqrpz);
                        jd0 jd0Var5 = ld0Var.P;
                        printWriter.println(jd0Var5 == null ? 0 : jd0Var5.c);
                    }
                    jd0 jd0Var6 = ld0Var.P;
                    if ((jd0Var6 == null ? 0 : jd0Var6.d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        jd0 jd0Var7 = ld0Var.P;
                        printWriter.println(jd0Var7 == null ? 0 : jd0Var7.d);
                    }
                    jd0 jd0Var8 = ld0Var.P;
                    if ((jd0Var8 == null ? 0 : jd0Var8.e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        jd0 jd0Var9 = ld0Var.P;
                        printWriter.println(jd0Var9 == null ? 0 : jd0Var9.e);
                    }
                    if (ld0Var.L != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(ld0Var.L);
                    }
                    if (ld0Var.M != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(ld0Var.M);
                    }
                    if (ld0Var.v() != null) {
                        n72 l = ld0Var.l();
                        ce0 ce0Var = qs0.c;
                        l.getClass();
                        ty tyVar = ty.b;
                        tyVar.getClass();
                        gr grVar2 = new gr(l, ce0Var, tyVar);
                        vq a2 = af1.a(qs0.class);
                        String b = a2.b();
                        if (b != null) {
                            op1 op1Var = ((qs0) grVar2.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                            if (op1Var.i > 0) {
                                printWriter.print(str3);
                                printWriter.println("Loaders:");
                                if (op1Var.i > 0) {
                                    if (op1Var.h[0] == null) {
                                        printWriter.print(str3);
                                        printWriter.print("  #");
                                        printWriter.print(op1Var.g[0]);
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    rw.b();
                                }
                            }
                        } else {
                            c.m("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + ld0Var.A + ":");
                    ld0Var.A.v(str3.concat(hTYJVDOvZnZlYL.TDx), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                ld0 ld0Var2 = (ld0) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(ld0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                ld0 ld0Var3 = (ld0) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(ld0Var3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                yb ybVar = (yb) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(ybVar.toString());
                ybVar.h(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f24a) {
            try {
                int size4 = this.f24a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (yd0) this.f24a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print(YHJbtPFAANaPQ.bFYvF);
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(yd0 yd0Var, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (this.G) {
                    c.n("FragmentManager has been destroyed");
                    return;
                } else {
                    c.n("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (M()) {
                c.n("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f24a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f24a.add(yd0Var);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            c.n("FragmentManager is already executing transactions");
            return;
        }
        if (this.t == null) {
            if (this.G) {
                c.n("FragmentManager has been destroyed");
                return;
            } else {
                c.n("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.t.p.getLooper()) {
            c.n("Must be called from main thread of fragment host");
            return;
        }
        if (!z && M()) {
            c.n("Can not perform this action after onSaveInstanceState");
        } else if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z) {
        boolean z2;
        ArrayList arrayList;
        x(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.f24a) {
                if (this.f24a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size = this.f24a.size();
                        int i = 0;
                        z2 = false;
                        while (true) {
                            arrayList = this.f24a;
                            if (i >= size) {
                                break;
                            }
                            z2 |= ((yd0) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                        }
                        arrayList.clear();
                        this.t.p.removeCallbacks(this.M);
                    } finally {
                    }
                }
            }
            if (!z2) {
                d0();
                u();
                ((HashMap) this.c.h).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                T(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    public final void z(yb ybVar, boolean z) {
        if (z && (this.t == null || this.G)) {
            return;
        }
        x(z);
        ybVar.a(this.I, this.J);
        this.b = true;
        try {
            T(this.I, this.J);
            d();
            d0();
            u();
            ((HashMap) this.c.h).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }
}
