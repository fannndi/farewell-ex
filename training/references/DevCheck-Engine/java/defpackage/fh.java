package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Trace;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.backend.BenchmarkSubmission;
import flar2.devcheck.benchmarkSuite.history.BenchmarkHistoryDb;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.zip.Adler32;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fh implements im0, pa0, gp1, jn, sa0 {
    public static volatile fh k;
    public static volatile fh l;
    public static final Object m = new Object();
    public static final String[] n = {"_googlecast._tcp.", "_airplay._tcp.", GFUHKHDfiFuPm.GxVwBkYyIwVrNVF, "_http._tcp.", "_ssh._tcp.", "_ipp._tcp.", "_printer._tcp.", "_spotify-connect._tcp.", "_sonos._tcp.", "_adb._tcp.", "_androidtvremote2._tcp.", "_googlezone._tcp.", "_googcrossdevice._tcp.", "_nv_shield_remote._tcp.", "_ghp._tcp.", "_meshcop._udp."};
    public final /* synthetic */ int g;
    public Object h;
    public Object i;
    public Object j;

    public fh() {
        this.g = 23;
        this.h = Executors.newScheduledThreadPool(2, new xf(4));
        this.i = new HashSet();
    }

    public /* synthetic */ fh(int i) {
        this.g = i;
    }

    public /* synthetic */ fh(int i, Object obj, Object obj2, Object obj3) {
        this.g = i;
        this.j = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public fh(Context context, int i) {
        String str;
        BenchmarkHistoryDb benchmarkHistoryDb;
        this.g = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.h = context.getApplicationContext();
                this.j = new HashSet();
                this.i = new HashMap();
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                this.i = new ConcurrentHashMap();
                this.j = Collections.synchronizedList(new ArrayList());
                this.h = (NsdManager) context.getSystemService("servicediscovery");
                return;
            case 10:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(md2.u(R.attr.materialCalendarStyle, context, jv0.class.getCanonicalName()).data, yb1.z);
                this.h = gm2.Q(context, obtainStyledAttributes.getResourceId(4, 0));
                gm2.Q(context, obtainStyledAttributes.getResourceId(2, 0));
                gm2.Q(context, obtainStyledAttributes.getResourceId(3, 0));
                gm2.Q(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList o = tl2.o(context, obtainStyledAttributes, 7);
                this.i = gm2.Q(context, obtainStyledAttributes.getResourceId(9, 0));
                gm2.Q(context, obtainStyledAttributes.getResourceId(8, 0));
                this.j = gm2.Q(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(o.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
            case 16:
                this.i = ju0.J();
                this.j = ju0.K();
                try {
                    try {
                        InputStream open = context.getAssets().open("socs.json");
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        open.close();
                        str = new String(bArr, StandardCharsets.UTF_8);
                    } catch (Exception unused) {
                        str = null;
                    }
                    this.h = new JSONObject(str);
                    return;
                } catch (JSONException unused2) {
                    this.h = null;
                    return;
                }
            default:
                this.j = Executors.newSingleThreadExecutor(new xf(1));
                this.h = context;
                BenchmarkHistoryDb benchmarkHistoryDb2 = BenchmarkHistoryDb.l;
                if (benchmarkHistoryDb2 == null) {
                    synchronized (BenchmarkHistoryDb.class) {
                        try {
                            if (BenchmarkHistoryDb.l == null) {
                                bh1 e = ym0.e(context.getApplicationContext(), BenchmarkHistoryDb.class, "devcheck_benchmarks.db");
                                e.a(BenchmarkHistoryDb.m, BenchmarkHistoryDb.n, BenchmarkHistoryDb.o, BenchmarkHistoryDb.p, BenchmarkHistoryDb.q, BenchmarkHistoryDb.r, BenchmarkHistoryDb.s);
                                e.p = true;
                                e.q = true;
                                e.r = false;
                                BenchmarkHistoryDb.l = (BenchmarkHistoryDb) e.b();
                            }
                            benchmarkHistoryDb = BenchmarkHistoryDb.l;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    benchmarkHistoryDb2 = benchmarkHistoryDb;
                }
                this.i = benchmarkHistoryDb2;
                return;
        }
    }

    public fh(Context context, TypedArray typedArray) {
        this.g = 26;
        this.h = context;
        this.i = typedArray;
    }

    public fh(SystemForegroundService systemForegroundService) {
        this.g = 25;
        this.h = new gq0(systemForegroundService);
        this.i = new Handler(Looper.getMainLooper());
    }

    public fh(BenchmarkSubmission benchmarkSubmission, yh yhVar, Context context) {
        this.g = 6;
        this.i = benchmarkSubmission;
        this.j = yhVar;
        this.h = context;
    }

    public fh(gr grVar) {
        this.g = 8;
        this.h = grVar;
        f20 f20Var = (f20) grVar.j;
        f20Var.getClass();
        this.i = new zc1(f20Var);
        e20 e20Var = (e20) grVar.k;
        e20Var.getClass();
        this.j = new yc1(e20Var);
    }

    public fh(gr grVar, pg0 pg0Var, p10 p10Var, Set set) {
        this.g = 14;
        this.h = pg0Var;
        this.i = grVar;
        this.j = p10Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new o1(2, str));
        }
    }

    public /* synthetic */ fh(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    public fh(Runnable runnable) {
        this.g = 21;
        this.i = new CopyOnWriteArrayList();
        this.j = new HashMap();
        this.h = runnable;
    }

    public fh(Matcher matcher, CharSequence charSequence) {
        this.g = 19;
        charSequence.getClass();
        this.h = matcher;
        this.i = new nu0(this);
    }

    public fh(jw jwVar) {
        this.g = 4;
        this.h = new ArrayList();
        this.i = new ue();
        this.j = jwVar;
    }

    public fh(nb nbVar, v80 v80Var, i42 i42Var, l12 l12Var) {
        this.g = 28;
        this.h = nbVar;
        this.i = v80Var;
        this.j = l12Var;
    }

    public fh(ru0 ru0Var, View view) {
        this.g = 20;
        int i = Build.VERSION.SDK_INT;
        this.h = i >= 34 ? new uu0() : i >= 33 ? new su0() : null;
        this.i = ru0Var;
        this.j = view;
    }

    public static fh B(Context context) {
        if (l == null) {
            synchronized (m) {
                try {
                    if (l == null) {
                        l = new fh(context, 1);
                    }
                } finally {
                }
            }
        }
        return l;
    }

    public static fh G(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new fh(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private final void H(IOException iOException) {
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z) {
        v32[] v32VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (v32VarArr = (v32[]) editable.getSpans(selectionStart, selectionEnd, v32.class)) != null && v32VarArr.length > 0) {
                for (v32 v32Var : v32VarArr) {
                    int spanStart = editable.getSpanStart(v32Var);
                    int spanEnd = editable.getSpanEnd(v32Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static fh u(Context context) {
        fh fhVar;
        fh fhVar2 = k;
        if (fhVar2 != null) {
            return fhVar2;
        }
        synchronized (fh.class) {
            try {
                if (k == null) {
                    k = new fh(context.getApplicationContext(), 0);
                }
                fhVar = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fhVar;
    }

    public h70 A(String str) {
        try {
            return new h70(((JSONObject) this.h).getJSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean C(CharSequence charSequence, int i, int i2, u32 u32Var) {
        if ((u32Var.c & 3) == 0) {
            p10 p10Var = (p10) this.j;
            kx0 b = u32Var.b();
            int a2 = b.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b.j).getShort(a2 + b.g);
            }
            p10Var.getClass();
            ThreadLocal threadLocal = p10.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = p10Var.f770a.hasGlyph(sb.toString());
            int i3 = u32Var.c & 4;
            u32Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (u32Var.c & 3) == 2;
    }

    public void D(long j) {
        zg x = ((BenchmarkHistoryDb) this.i).x();
        dh1 dh1Var = (dh1) x.g;
        dh1Var.b();
        h8 h8Var = (h8) x.m;
        ze0 a2 = h8Var.a();
        a2.d(1, j);
        try {
            dh1Var.c();
            try {
                a2.e();
                dh1Var.v();
            } finally {
                dh1Var.r();
            }
        } finally {
            h8Var.c(a2);
        }
    }

    public boolean E(int i, kv kvVar, iw iwVar) {
        ue ueVar = (ue) this.i;
        int[] iArr = iwVar.p0;
        int[] iArr2 = iwVar.t;
        ueVar.f1037a = iArr[0];
        ueVar.b = iArr[1];
        ueVar.c = iwVar.q();
        ueVar.d = iwVar.k();
        ueVar.i = false;
        ueVar.j = i;
        boolean z = ueVar.f1037a == 3;
        boolean z2 = ueVar.b == 3;
        boolean z3 = z && iwVar.W > 0.0f;
        boolean z4 = z2 && iwVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            ueVar.f1037a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            ueVar.b = 1;
        }
        kvVar.b(iwVar, ueVar);
        iwVar.O(ueVar.e);
        iwVar.L(ueVar.f);
        iwVar.E = ueVar.h;
        iwVar.I(ueVar.g);
        ueVar.j = 0;
        return ueVar.i;
    }

    public xg1 F(int i) {
        zg x = ((BenchmarkHistoryDb) this.i).x();
        x.getClass();
        gh1 a2 = gh1.a(1, RIhTGWkqQvGL.pyPTXtFrnnQY);
        a2.d(1, i);
        en0 j = ((dh1) x.g).j();
        String[] strArr = {"benchmark_run"};
        yg ygVar = new yg(x, a2, 1);
        j.b.g(strArr);
        xi0 xi0Var = j.g;
        xi0Var.getClass();
        return new xg1((dh1) xi0Var.g, xi0Var, false, strArr, ygVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(defpackage.dn r24, java.util.List r25, int r26) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.I(dn, java.util.List, int):void");
    }

    public void J(xp0 xp0Var) {
        qm1 qm1Var = (qm1) this.j;
        if (qm1Var != null) {
            qm1Var.run();
        }
        qm1 qm1Var2 = new qm1((gq0) this.h, xp0Var);
        this.j = qm1Var2;
        ((Handler) this.i).postAtFrontOfQueue(qm1Var2);
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, e80 e80Var) {
        int i4;
        char c;
        f80 f80Var = new f80((mx0) ((gr) this.i).j);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = f80Var.c.f659a;
                mx0 mx0Var = sparseArray == null ? null : (mx0) sparseArray.get(codePointAt);
                if (f80Var.f269a == 2) {
                    if (mx0Var != null) {
                        f80Var.c = mx0Var;
                        f80Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            f80Var.a();
                        } else if (codePointAt != 65039) {
                            mx0 mx0Var2 = f80Var.c;
                            if (mx0Var2.b != null) {
                                if (f80Var.f != 1) {
                                    f80Var.d = mx0Var2;
                                    f80Var.a();
                                } else if (f80Var.b()) {
                                    f80Var.d = f80Var.c;
                                    f80Var.a();
                                } else {
                                    f80Var.a();
                                }
                                c = 3;
                            } else {
                                f80Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (mx0Var == null) {
                    f80Var.a();
                    c = 1;
                } else {
                    f80Var.f269a = 2;
                    f80Var.c = mx0Var;
                    f80Var.f = 1;
                    c = 2;
                }
                f80Var.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !C(charSequence, i4, i6, f80Var.d.b)) {
                        z2 = e80Var.f(charSequence, i4, i6, f80Var.d.b);
                        i5++;
                    }
                }
            }
        }
        if (f80Var.f269a == 2 && f80Var.c.b != null && ((f80Var.f > 1 || f80Var.b()) && i5 < i3 && z2 && (z || !C(charSequence, i4, i6, f80Var.c.b)))) {
            e80Var.f(charSequence, i4, i6, f80Var.c.b);
        }
        return e80Var.a();
    }

    public void L() {
        ((TypedArray) this.i).recycle();
    }

    public synchronized void M(mj1 mj1Var) {
        if (mj1Var == null) {
            return;
        }
        ((HashSet) this.i).add(mj1Var);
    }

    public void N(nb nbVar, int i, boolean z) {
        lb lbVar = (lb) this.j;
        Context context = (Context) this.h;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = nbVar.f670a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        d91 d91Var = nbVar.c;
        adler32.update(allocate.putInt(f91.a(d91Var)).array());
        byte[] bArr = nbVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        op0.g("JobInfoScheduler", yFbVsaLCWAtQC.RrHH, nbVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((zi1) this.i).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(f91.a(d91Var))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(lbVar.a(d91Var, longValue, i));
            Set set = ((mb) lbVar.b.get(d91Var)).c;
            if (set.contains(ck1.g)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ck1.i)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ck1.h)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(LogFactory.PRIORITY_KEY, f91.a(d91Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {nbVar, Integer.valueOf(value), Long.valueOf(lbVar.a(d91Var, longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable(op0.w("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void O(db dbVar) {
        jw0 jw0Var = new jw0(29);
        l12 l12Var = (l12) this.j;
        nb nbVar = (nb) this.h;
        v80 v80Var = (v80) this.i;
        d20 d20Var = l12Var.c;
        fh a2 = nb.a();
        a2.P(nbVar.f670a);
        a2.j = d91.g;
        a2.i = nbVar.b;
        nb o = a2.o();
        yf yfVar = new yf(3, false);
        yfVar.g = new HashMap();
        yfVar.e = Long.valueOf(l12Var.f565a.c());
        yfVar.f = Long.valueOf(l12Var.b.c());
        yfVar.b = "PLAY_BILLING_LIBRARY";
        yfVar.d = new s80(v80Var, dbVar.f183a.b());
        yfVar.c = null;
        d20Var.b.execute(new b9(d20Var, o, jw0Var, yfVar.c()));
    }

    public void P(String str) {
        if (str != null) {
            this.h = str;
        } else {
            jw0.f("Null backendName");
        }
    }

    public void Q(jw jwVar, int i, int i2, int i3) {
        jwVar.getClass();
        int i4 = jwVar.b0;
        int i5 = jwVar.c0;
        jwVar.b0 = 0;
        jwVar.c0 = 0;
        jwVar.O(i2);
        jwVar.L(i3);
        if (i4 < 0) {
            jwVar.b0 = 0;
        } else {
            jwVar.b0 = i4;
        }
        if (i5 < 0) {
            jwVar.c0 = 0;
        } else {
            jwVar.c0 = i5;
        }
        jw jwVar2 = (jw) this.j;
        jwVar2.t0 = i;
        jwVar2.U();
    }

    public synchronized void R(mj1 mj1Var) {
        if (mj1Var == null) {
            return;
        }
        ((HashSet) this.i).remove(mj1Var);
    }

    public void S(jw jwVar) {
        ArrayList arrayList = (ArrayList) this.h;
        arrayList.clear();
        int size = jwVar.q0.size();
        for (int i = 0; i < size; i++) {
            iw iwVar = (iw) jwVar.q0.get(i);
            int[] iArr = iwVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(iwVar);
            }
        }
        jwVar.s0.b = true;
    }

    @Override // defpackage.pa0
    public int a() {
        int i = ((ExtendedFloatingActionButton) this.j).o0;
        return i == -1 ? ((u40) this.h).a() : (i == 0 || i == -2) ? ((la0) this.i).h.getMeasuredHeight() : i;
    }

    @Override // defpackage.gp1
    public lp1 b() {
        return (zc1) this.i;
    }

    @Override // defpackage.pa0
    public int c() {
        return ((ExtendedFloatingActionButton) this.j).h0;
    }

    @Override // defpackage.im0
    public ClipDescription d() {
        return (ClipDescription) this.i;
    }

    @Override // defpackage.pa0
    public int e() {
        return ((ExtendedFloatingActionButton) this.j).g0;
    }

    @Override // defpackage.im0
    public Object f() {
        return null;
    }

    @Override // defpackage.im0
    public Uri g() {
        return (Uri) this.h;
    }

    @Override // defpackage.db1
    public Object get() {
        switch (this.g) {
            case 24:
                return new fh((Context) ((db1) this.h).get(), (zi1) ((db1) this.i).get(), (lb) ((pg0) this.j).get(), 18, false);
            default:
                return new l12(new i42(), new x42(), (d20) ((yh) this.h).get(), (w42) ((zg) this.i).get(), (gr) ((gr) this.j).get());
        }
    }

    @Override // defpackage.jn
    public void h(IOException iOException) {
        switch (this.g) {
            case 5:
                break;
            default:
                ((yh) this.j).c();
                break;
        }
    }

    @Override // defpackage.im0
    public void i() {
    }

    @Override // defpackage.im0
    public Uri j() {
        return (Uri) this.j;
    }

    @Override // defpackage.pa0
    public int k() {
        int i = ((ExtendedFloatingActionButton) this.j).n0;
        return i == -1 ? ((u40) this.h).k() : (i == 0 || i == -2) ? ((la0) this.i).k() : i;
    }

    @Override // defpackage.pa0
    public ViewGroup.LayoutParams l() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.j;
        int i = extendedFloatingActionButton.n0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.o0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // defpackage.jn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.lg1 r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.m(lg1):void");
    }

    @Override // defpackage.gp1
    public ap1 n() {
        return (yc1) this.j;
    }

    public nb o() {
        String str = ((String) this.h) == null ? " backendName" : "";
        if (((d91) this.j) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new nb((String) this.h, (byte[]) this.i, (d91) this.j);
        }
        c.n("Missing required properties:".concat(str));
        return null;
    }

    public void q(Bundle bundle) {
        HashSet hashSet = (HashSet) this.j;
        String string = ((Context) this.h).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (em0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    s((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new pt(e);
            }
        }
    }

    public Map r() {
        if (((NsdManager) this.h) == null) {
            return Collections.EMPTY_MAP;
        }
        System.currentTimeMillis();
        try {
            String[] strArr = n;
            for (int i = 0; i < 16; i++) {
                String str = strArr[i];
                tk tkVar = new tk(this, str);
                ((List) this.j).add(tkVar);
                try {
                    ((NsdManager) this.h).discoverServices(str, 1, tkVar);
                } catch (Exception unused) {
                }
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException unused2) {
            }
            System.currentTimeMillis();
            synchronized (((List) this.j)) {
                Iterator it = ((List) this.j).iterator();
                while (it.hasNext()) {
                    try {
                        ((NsdManager) this.h).stopServiceDiscovery((NsdManager.DiscoveryListener) it.next());
                    } catch (Exception unused3) {
                    }
                }
                ((List) this.j).clear();
            }
            return new ConcurrentHashMap((ConcurrentHashMap) this.i);
        } catch (Throwable th) {
            synchronized (((List) this.j)) {
                Iterator it2 = ((List) this.j).iterator();
                while (it2.hasNext()) {
                    try {
                        ((NsdManager) this.h).stopServiceDiscovery((NsdManager.DiscoveryListener) it2.next());
                    } catch (Exception unused4) {
                    }
                }
                ((List) this.j).clear();
                throw th;
            }
        }
    }

    public Object s(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.i;
        String str = BFtDZYxPcpGN.QzWJTmZrq;
        if (bw0.o()) {
            try {
                Trace.beginSection(bw0.A(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(str + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                em0 em0Var = (em0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = em0Var.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            s(cls2, hashSet);
                        }
                    }
                }
                obj = em0Var.b((Context) this.h);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new pt(th);
            }
        }
        return obj;
    }

    public void t(hr hrVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.h;
        ab1 ab1Var = new ab1(byteArrayOutputStream, hashMap, (HashMap) this.i, (m31) this.j);
        m31 m31Var = (m31) hashMap.get(hr.class);
        if (m31Var != null) {
            m31Var.a(hrVar, ab1Var);
        } else {
            throw new w80("No encoder for " + hr.class);
        }
    }

    public ColorStateList v(int i) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = pr.q((Context) this.h, resourceId)) == null) ? typedArray.getColorStateList(i) : q;
    }

    public Drawable w(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : k32.x((Context) this.h, resourceId);
    }

    public Drawable x(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.i).hasValue(i) || (resourceId = ((TypedArray) this.i).getResourceId(i, 0)) == 0) {
            return null;
        }
        e6 a2 = e6.a();
        Context context = (Context) this.h;
        synchronized (a2) {
            d = a2.f222a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface y(int i, int i2, b7 b7Var) {
        int resourceId = ((TypedArray) this.i).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.j) == null) {
            this.j = new TypedValue();
        }
        Context context = (Context) this.h;
        TypedValue typedValue = (TypedValue) this.j;
        ThreadLocal threadLocal = ig1.f428a;
        if (context.isRestricted()) {
            return null;
        }
        return ig1.c(context, resourceId, typedValue, i2, b7Var, true, false);
    }

    public h70 z() {
        h70 h70Var;
        JSONObject jSONObject = (JSONObject) this.h;
        int i = 0;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            int i2 = 0;
            loop0: while (true) {
                h70Var = null;
                while (keys.hasNext()) {
                    String next = keys.next();
                    String str = (String) this.i;
                    if (str != null && str.contains(next)) {
                        try {
                            if (next.length() > i2) {
                                h70Var = new h70(jSONObject.getJSONObject(next));
                                i2 = next.length();
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }
                break loop0;
            }
        } else {
            h70Var = null;
        }
        if (h70Var == null && jSONObject != null) {
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (((String) this.j).contains(next2)) {
                    try {
                        if (next2.length() > i) {
                            h70Var = new h70(jSONObject.getJSONObject(next2));
                            i = next2.length();
                        }
                    } catch (JSONException unused2) {
                        h70Var = null;
                    }
                }
            }
        }
        return h70Var;
    }
}
