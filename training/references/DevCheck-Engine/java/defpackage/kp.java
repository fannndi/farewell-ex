package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.widget.FrameLayout;
import flar2.devcheck.MainActivity;
import flar2.devcheck.R;
import flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db;
import flar2.devcheck.benchmarkSuite.backend.BenchmarkSubmission;
import flar2.devcheck.hwData.DeviceInfo;
import flar2.devcheck.ui.root.IShizukuAidlInterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class kp implements jn, o41 {
    public final /* synthetic */ int g;
    public Object h;
    public Object i;

    public kp(int i) {
        this.g = i;
        switch (i) {
            case 5:
                this.h = new NumberFormat[2];
                break;
            default:
                this.h = Choreographer.getInstance();
                this.i = Looper.myLooper();
                break;
        }
    }

    public /* synthetic */ kp(int i, boolean z) {
        this.g = i;
    }

    public kp(be1 be1Var) {
        this.g = 11;
        this.h = be1Var;
        j62 j62Var = new j62();
        j62Var.f465a = 0;
        this.i = j62Var;
    }

    public kp(BatteryMonitor2Db batteryMonitor2Db) {
        this.g = 0;
        this.h = batteryMonitor2Db;
        new g8(batteryMonitor2Db, 4);
        new jp(batteryMonitor2Db, 0);
        new h8(batteryMonitor2Db, 8);
        this.i = new h8(batteryMonitor2Db, 9);
    }

    public kp(h91 h91Var) {
        this.g = 9;
        this.i = new ConcurrentHashMap();
        this.h = h91Var;
    }

    public /* synthetic */ kp(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    public kp(ju1 ju1Var, ld0 ld0Var, FrameLayout frameLayout) {
        this.g = 7;
        this.h = ld0Var;
        this.i = frameLayout;
    }

    public kp(la1 la1Var, gr grVar) {
        this.g = 12;
        la1Var.getClass();
        grVar.getClass();
        this.h = la1Var;
        this.i = grVar;
    }

    public kp(xj1 xj1Var) {
        this.g = 10;
        this.h = xj1Var;
        this.i = new zf(xj1Var);
    }

    /* JADX WARN: Finally extract failed */
    public static String n(String str, g91 g91Var) {
        int ordinal;
        int i;
        List c;
        try {
            ordinal = g91Var.ordinal();
            i = 0;
        } catch (Throwable unused) {
        }
        if (ordinal == 0) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str), rt0.x);
            try {
                StringBuilder sb = new StringBuilder();
                do {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(readLine);
                    i += readLine.length() + 1;
                } while (i < 65536);
                String sb2 = sb.length() == 0 ? null : sb.toString();
                bufferedReader.close();
                return sb2;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (ordinal == 1) {
            IShizukuAidlInterface iShizukuAidlInterface = fo1.f298a;
            if (iShizukuAidlInterface != null) {
                return iShizukuAidlInterface.readTextFile(str, rt0.B);
            }
            throw new IllegalStateException("ShizukuExec not bound");
        }
        if (ordinal == 2) {
            rg1 o = wn1.a("cat " + str).o();
            if (o.e() && (c = o.c()) != null && !c.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                while (i < c.size()) {
                    if (i > 0) {
                        sb3.append('\n');
                    }
                    sb3.append((String) c.get(i));
                    i++;
                }
                if (sb3.length() != 0) {
                    return sb3.toString();
                }
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:95:0x059d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public android.net.Uri a() {
        /*
            Method dump skipped, instructions count: 2834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp.a():android.net.Uri");
    }

    @Override // defpackage.o41
    public void b(xo2 xo2Var) {
        switch (this.g) {
            case 13:
                vd2 vd2Var = (vd2) this.h;
                nv1 nv1Var = (nv1) this.i;
                synchronized (vd2Var.f) {
                    vd2Var.e.remove(nv1Var);
                }
                return;
            default:
                vo2 vo2Var = (vo2) this.h;
                nv1 nv1Var2 = (nv1) this.i;
                synchronized (vo2Var.f) {
                    vo2Var.e.remove(nv1Var2);
                }
                return;
        }
    }

    public View c(int i, int i2, int i3, int i4) {
        View u;
        j62 j62Var = (j62) this.i;
        be1 be1Var = (be1) this.h;
        int d = be1Var.d();
        int c = be1Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (be1Var.f79a) {
                case 0:
                    u = be1Var.b.u(i);
                    break;
                default:
                    u = be1Var.b.u(i);
                    break;
            }
            int b = be1Var.b(u);
            int a2 = be1Var.a(u);
            j62Var.b = d;
            j62Var.c = c;
            j62Var.d = b;
            j62Var.e = a2;
            if (i3 != 0) {
                j62Var.f465a = i3;
                if (j62Var.a()) {
                    return u;
                }
            }
            if (i4 != 0) {
                j62Var.f465a = i4;
                if (j62Var.a()) {
                    view = u;
                }
            }
            i += i5;
        }
        return view;
    }

    public String d(double d, boolean z) {
        NumberFormat[] numberFormatArr = (NumberFormat[]) this.h;
        if (numberFormatArr[z ? 1 : 0] == null) {
            numberFormatArr[z ? 1 : 0] = NumberFormat.getNumberInstance();
            x82 x82Var = (x82) this.i;
            double a2 = z ? x82Var.a(false) : x82Var.d.c;
            x82 x82Var2 = (x82) this.i;
            double b = a2 - (z ? x82Var2.b(false) : x82Var2.d.d);
            if (b < 0.1d) {
                numberFormatArr[z ? 1 : 0].setMaximumFractionDigits(6);
            } else if (b < 1.0d) {
                numberFormatArr[z ? 1 : 0].setMaximumFractionDigits(4);
            } else if (b < 20.0d) {
                numberFormatArr[z ? 1 : 0].setMaximumFractionDigits(3);
            } else if (b < 100.0d) {
                numberFormatArr[z ? 1 : 0].setMaximumFractionDigits(1);
            } else {
                numberFormatArr[z ? 1 : 0].setMaximumFractionDigits(0);
            }
        }
        return numberFormatArr[z ? 1 : 0].format(d);
    }

    public String[] e() {
        MainActivity mainActivity = (MainActivity) this.h;
        long elapsedRealtime = SystemClock.elapsedRealtime() - SystemClock.uptimeMillis();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf((elapsedRealtime / 1000) % 60);
        String valueOf2 = String.valueOf((elapsedRealtime / 60000) % 60);
        String valueOf3 = String.valueOf((elapsedRealtime / 3600000) % 24);
        String valueOf4 = String.valueOf(elapsedRealtime / 86400000);
        StringBuilder sb = new StringBuilder();
        if (!valueOf4.equals("0")) {
            sb.append(valueOf4);
            sb.append("d ");
        }
        if (!valueOf3.equals("0")) {
            sb.append(valueOf3);
            sb.append("h ");
        }
        if (!valueOf2.equals("0")) {
            sb.append(valueOf2);
            sb.append("m ");
        }
        String u = d51.u(sb, valueOf, "s");
        String valueOf5 = String.valueOf((elapsedRealtime2 / 1000) % 60);
        String valueOf6 = String.valueOf((elapsedRealtime2 / 60000) % 60);
        String valueOf7 = String.valueOf((elapsedRealtime2 / 3600000) % 24);
        String valueOf8 = String.valueOf(elapsedRealtime2 / 86400000);
        StringBuilder sb2 = new StringBuilder();
        if (!valueOf8.equals("0")) {
            sb2.append(valueOf8);
            sb2.append("d ");
        }
        if (!valueOf7.equals("0")) {
            sb2.append(valueOf7);
            sb2.append("h ");
        }
        if (!valueOf6.equals("0")) {
            sb2.append(valueOf6);
            sb2.append("m ");
        }
        String u2 = d51.u(sb2, valueOf5, "s");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(mainActivity.getString(R.string.deep_sleep));
        sb3.append(": ");
        sb3.append(u);
        sb3.append(" (");
        return new String[]{d51.t(sb3, (int) ((elapsedRealtime / elapsedRealtime2) * 100.0f), "%)"), mainActivity.getString(R.string.uptime) + ": " + u2};
    }

    public boolean f(View view) {
        j62 j62Var = (j62) this.i;
        be1 be1Var = (be1) this.h;
        int d = be1Var.d();
        int c = be1Var.c();
        int b = be1Var.b(view);
        int a2 = be1Var.a(view);
        j62Var.b = d;
        j62Var.c = c;
        j62Var.d = b;
        j62Var.e = a2;
        j62Var.f465a = 24579;
        return j62Var.a();
    }

    public void g() {
        ((xj1) this.h).a();
    }

    @Override // defpackage.jn
    public void h(IOException iOException) {
        ((yh) this.i).c();
    }

    public void i(Bundle bundle) {
        xj1 xj1Var = (xj1) this.h;
        yj1 yj1Var = xj1Var.f1186a;
        if (!xj1Var.e) {
            xj1Var.a();
        }
        if (yj1Var.q().c.compareTo(yp0.j) >= 0) {
            jw0.g("performRestore cannot be called when owner is ", yj1Var.q().c);
            return;
        }
        if (xj1Var.g) {
            c.n("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = rt0.u("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        xj1Var.f = bundle2;
        xj1Var.g = true;
    }

    public void j(Bundle bundle) {
        xj1 xj1Var = (xj1) this.h;
        Bundle d = md2.d((z51[]) Arrays.copyOf(new z51[0], 0));
        Bundle bundle2 = xj1Var.f;
        if (bundle2 != null) {
            d.putAll(bundle2);
        }
        synchronized (xj1Var.c) {
            for (Map.Entry entry : xj1Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a2 = ((vj1) entry.getValue()).a();
                str.getClass();
                d.putBundle(str, a2);
            }
        }
        if (d.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", d);
    }

    public String k(String str) {
        g91 g91Var;
        String n;
        g91 g91Var2;
        String n2;
        g91 g91Var3 = (g91) ((ConcurrentHashMap) this.i).get(str);
        if (g91Var3 != null) {
            String n3 = n(str, g91Var3);
            if (n3 != null) {
                return n3;
            }
            ((ConcurrentHashMap) this.i).remove(str);
        }
        g91 g91Var4 = g91.g;
        String n4 = n(str, g91Var4);
        if (n4 != null) {
            ((ConcurrentHashMap) this.i).put(str, g91Var4);
            return n4;
        }
        if (((h91) this.h).b && (n2 = n(str, (g91Var2 = g91.h))) != null) {
            ((ConcurrentHashMap) this.i).put(str, g91Var2);
            return n2;
        }
        if (!((h91) this.h).f370a || (n = n(str, (g91Var = g91.i))) == null) {
            return null;
        }
        ((ConcurrentHashMap) this.i).put(str, g91Var);
        return n;
    }

    public String l(String str) {
        String k = k(str);
        if (k == null) {
            return null;
        }
        int indexOf = k.indexOf(10);
        if (indexOf >= 0) {
            k = k.substring(0, indexOf);
        }
        return k.trim();
    }

    @Override // defpackage.jn
    public void m(lg1 lg1Var) {
        yh yhVar = (yh) this.i;
        li liVar = (li) yhVar.g;
        try {
            int i = lg1Var.j;
            if (i == 200 || i == 201) {
                String str = ((BenchmarkSubmission) this.h).runId;
                long j = liVar.f590a;
                fh fhVar = (fh) yhVar.h;
                ((ExecutorService) fhVar.j).execute(new fj(fhVar, liVar, str, (Context) yhVar.i, (Deque) yhVar.j, (DeviceInfo) yhVar.k, 0));
            } else if (i == 401 || i == 403) {
                long j2 = liVar.f590a;
                fh fhVar2 = (fh) yhVar.h;
                ((ExecutorService) fhVar2.j).execute(new ej(fhVar2, liVar, (Context) yhVar.i, (Deque) yhVar.j, (DeviceInfo) yhVar.k, 0));
            } else {
                yhVar.c();
            }
            lg1Var.close();
        } catch (Throwable th) {
            try {
                lg1Var.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public void o(vq1 vq1Var, m52 m52Var) {
        vq1Var.getClass();
        gr grVar = (gr) this.i;
        ((lm1) grVar.h).execute(new b9(18, this, vq1Var, m52Var));
    }

    public void p(vq1 vq1Var, int i) {
        vq1Var.getClass();
        gr grVar = (gr) this.i;
        ((lm1) grVar.h).execute(new hr1((la1) this.h, vq1Var, false, i));
    }
}
