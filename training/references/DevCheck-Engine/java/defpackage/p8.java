package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.usage.NetworkUsageActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class p8 implements tt1, wg, jq, pi1, s41, m1, l31, ld1, v41, oz0, z42 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ p8(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    public /* synthetic */ p8(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj2;
    }

    @Override // defpackage.z42
    public void a(c52 c52Var) {
        NetworkUsageActivity networkUsageActivity = (NetworkUsageActivity) this.h;
        int i = NetworkUsageActivity.W;
        String str = c52Var.f108a;
        try {
            ApplicationInfo applicationInfo = networkUsageActivity.getPackageManager().getApplicationInfo(str, 0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("appInfo", applicationInfo);
            p51 p51Var = new p51();
            p51Var.m0(bundle);
            p51Var.z0(networkUsageActivity.s(), str);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // defpackage.m1
    public boolean b(View view) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.h;
        int i = BottomSheetDragHandleView.t;
        return bottomSheetDragHandleView.c();
    }

    @Override // defpackage.ld1
    public String c(float f) {
        long j = (long) (f * 1024.0f * 1024.0f);
        Context i0 = ((zg0) this.h).i0();
        String str = uz1.f1060a;
        return Formatter.formatFileSize(i0, j);
    }

    @Override // defpackage.tt1
    public void d() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                v8 v8Var = (v8) obj;
                v8Var.i0 = false;
                f71 f71Var = v8Var.h0;
                l61 l61Var = f71Var.d;
                List list = (List) l61Var.p.d();
                if (list != null && !list.isEmpty()) {
                    l61Var.m(list);
                }
                f71Var.e.submit(new r60(11, f71Var));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                lf lfVar = (lf) obj;
                lfVar.h0 = false;
                fg fgVar = lfVar.f0;
                fgVar.d.execute(new l2(9, fgVar));
                break;
            case rt0.o /* 9 */:
                n02 n02Var = (n02) obj;
                n02Var.g = null;
                n02Var.i = false;
                n02Var.h = false;
                n02Var.f.clear();
                n02Var.e();
                n02Var.d();
                break;
            case 13:
                CPUTimeActivity cPUTimeActivity = (CPUTimeActivity) obj;
                cPUTimeActivity.H.postDelayed(new l2(20, cPUTimeActivity), 250L);
                break;
            case 14:
                sn snVar = (sn) obj;
                snVar.g0 = false;
                un unVar = snVar.h0;
                unVar.d.execute(new l2(21, unVar));
                break;
            case 18:
                p00 p00Var = (p00) obj;
                int i2 = p00.H1;
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation.setDuration(300L);
                    p00Var.a1.startAnimation(loadAnimation);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation2.setDuration(300L);
                    p00Var.c1.startAnimation(loadAnimation2);
                    p00Var.l1.startAnimation(loadAnimation2);
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation3.setDuration(340L);
                    p00Var.g1.startAnimation(loadAnimation3);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation4.setDuration(360L);
                    p00Var.i1.startAnimation(loadAnimation4);
                    Animation loadAnimation5 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation5.setDuration(380L);
                    p00Var.h1.startAnimation(loadAnimation5);
                    Animation loadAnimation6 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation6.setDuration(400L);
                    p00Var.j1.startAnimation(loadAnimation6);
                    Animation loadAnimation7 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation7.setDuration(410L);
                    p00Var.k1.startAnimation(loadAnimation7);
                    Animation loadAnimation8 = AnimationUtils.loadAnimation(p00Var.i0(), R.anim.slide_up_card);
                    loadAnimation8.setDuration(420L);
                    p00Var.f1.startAnimation(loadAnimation8);
                } catch (NullPointerException unused) {
                }
                int i3 = 1;
                p00Var.y0.setText(uz1.A(true), TextView.BufferType.NORMAL);
                p00Var.z0.setImageDrawable(uz1.z(p00Var.i0()));
                p00Var.z0();
                ExecutorService executorService = MainApp.h;
                executorService.execute(new zz(p00Var, 2));
                p00Var.x0();
                executorService.execute(new zz(p00Var, i3));
                executorService.execute(new zz(p00Var, 4));
                Handler handler = p00Var.D1;
                if (handler != null) {
                    handler.post(new i00(p00Var, i3));
                }
                try {
                    p00Var.g0().findViewById(R.id.appbar).animate().setInterpolator(new DecelerateInterpolator()).translationY(0.0f).start();
                } catch (Exception unused2) {
                }
                p00Var.Y0.setRefreshing(false);
                break;
            case 21:
                ei0 ei0Var = (ei0) obj;
                ei0Var.f0 = false;
                ei0Var.g0.l();
                break;
            default:
                u11 u11Var = (u11) obj;
                u11Var.g0 = false;
                u11Var.f0.k();
                break;
        }
    }

    @Override // defpackage.l31
    public Object e() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 16:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    c3 c3Var = ef1.f230a;
                    jw0.l("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + ef1.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    jw0.l("Failed to invoke constructor '" + ef1.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return q42.f817a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // defpackage.jq
    public void f(ChipGroup chipGroup, ArrayList arrayList) {
        View findViewById;
        String str;
        xg xgVar = (xg) this.h;
        if (arrayList.isEmpty() || (findViewById = chipGroup.findViewById(((Integer) arrayList.get(0)).intValue())) == null || (str = (String) findViewById.getTag()) == null || str.equals(xgVar.a1)) {
            return;
        }
        xgVar.a1 = str;
        qh qhVar = xgVar.Z0;
        if (qhVar != null) {
            xgVar.B0(qhVar, str);
        }
    }

    @Override // defpackage.pi1
    public void g(l30 l30Var) {
        si siVar = (si) this.h;
        float f = l30Var.f568a;
        List list = (List) l30Var.b;
        if (!Float.isNaN(f) && f >= 0.0f) {
            float min = Math.min(1.0f, Math.max(0.0f, f));
            siVar.q0.setProgress(Math.round((1.0f - min) * 100.0f));
            Context i0 = siVar.i0();
            siVar.q0.setProgressTintList(ColorStateList.valueOf(min >= 0.9f ? i0.getColor(R.color.red) : min >= 0.75f ? i0.getColor(R.color.orange) : min >= 0.5f ? i0.getColor(R.color.yellow) : i0.getColor(R.color.green)));
            siVar.p0.setText(String.format(Locale.getDefault(), "%.2f", Float.valueOf(f)));
            if (!siVar.x0) {
                siVar.o0.setVisibility(0);
                siVar.x0 = true;
            }
        }
        if (siVar.s0 != null && !list.isEmpty()) {
            siVar.s0.v(null, list);
        }
        if (siVar.r0 != null && !list.isEmpty() && !siVar.w0) {
            siVar.r0.setVisibility(0);
            siVar.w0 = true;
        }
        siVar.w0();
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        miVar.q.add((oi) this.h);
    }

    @Override // defpackage.v41
    public void i(Object obj) {
        vm0 vm0Var = (vm0) this.h;
        te2 te2Var = (te2) obj;
        tm0 b = tm0.b();
        synchronized (b) {
            try {
                if (((te2) b.c) == null) {
                    b.c = te2Var;
                    if (te2Var != null) {
                        Iterator it = ((CopyOnWriteArrayList) b.b).iterator();
                        while (it.hasNext()) {
                            ((Handler) b.f996a).post(new k5((sm0) it.next(), 20, te2Var));
                        }
                        ((CopyOnWriteArrayList) b.b).clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((AtomicBoolean) vm0Var.b).set(false);
    }

    @Override // defpackage.s41
    public void j(Exception exc) {
        ((yh) this.h).c();
    }

    @Override // defpackage.oz0
    public void k(int i) {
        kz0 kz0Var = (kz0) this.h;
        boolean z = l01.G;
        ImageView imageView = kz0Var.A;
        if (z) {
            imageView.setImageResource(R.drawable.ic_action_down);
        } else {
            imageView.setImageResource(R.drawable.ic_action_down_light);
        }
    }

    public po l(fh fhVar) {
        qo qoVar = (qo) this.h;
        URL url = (URL) fhVar.h;
        if (Log.isLoggable(op0.w("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(qoVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) fhVar.j;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    h70 h70Var = qoVar.f854a;
                    ab abVar = (ab) fhVar.i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ko0 ko0Var = (ko0) h70Var.g;
                    so0 so0Var = new so0(bufferedWriter, ko0Var.f544a, ko0Var.b, ko0Var.c, ko0Var.d);
                    so0Var.e(abVar);
                    so0Var.g();
                    so0Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(op0.w("CctTransportBackend"), 4)) {
                        String.format(UQdsoaJMID.iLmTaXvJfhC, valueOf);
                    }
                    op0.g("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    op0.g("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new po(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new po(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            po poVar = new po(responseCode, null, ib.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f421a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return poVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException | UnknownHostException unused) {
            Log.isLoggable(op0.w("CctTransportBackend"), 6);
            return new po(500, null, 0L);
        } catch (IOException | w80 unused2) {
            Log.isLoggable(op0.w("CctTransportBackend"), 6);
            return new po(400, null, 0L);
        }
    }

    public boolean m(h70 h70Var, int i, Bundle bundle) {
        uw uwVar;
        g6 g6Var = (g6) this.h;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((im0) h70Var.g).i();
                Parcelable parcelable = (Parcelable) ((im0) h70Var.g).f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(Gvyagftz.RsOjlTBDT, parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        im0 im0Var = (im0) h70Var.g;
        ClipData clipData = new ClipData(im0Var.d(), new ClipData.Item(im0Var.g()));
        if (i2 >= 31) {
            uwVar = new gm2(clipData, 2);
        } else {
            vw vwVar = new vw();
            vwVar.h = clipData;
            vwVar.i = 2;
            uwVar = vwVar;
        }
        uwVar.D(im0Var.j());
        uwVar.setExtras(bundle);
        return y62.k(g6Var, uwVar.build()) == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r7 != 3) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.Object r6 = r6.h
            hb0 r6 = (defpackage.hb0) r6
            android.view.View r0 = r6.j
            boolean r1 = r6.l
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            float r1 = r7.getX()
            float r3 = r7.getY()
            android.graphics.Rect r4 = r6.a()
            int r7 = r7.getAction()
            r5 = 1
            if (r7 == 0) goto L86
            if (r7 == r5) goto L82
            r1 = 2
            if (r7 == r1) goto L29
            r0 = 3
            if (r7 == r0) goto L82
            goto La2
        L29:
            boolean r7 = r6.s
            if (r7 != 0) goto L72
            android.view.View r7 = r6.i
            float r1 = r6.n
            float r2 = r6.o
            boolean r7 = r6.d(r7, r1, r2)
            if (r7 == 0) goto L72
            float r7 = r6.o
            float r7 = r3 - r7
            float r7 = java.lang.Math.abs(r7)
            int r1 = r6.b
            float r1 = (float) r1
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L72
            float r7 = r6.n
            float r1 = r6.o
            boolean r7 = r6.d(r0, r7, r1)
            if (r7 == 0) goto L5b
            float r7 = r6.p
            r6.q = r7
            int r7 = r6.m
            r6.r = r7
            goto L6f
        L5b:
            r6.q = r3
            int r7 = r4.top
            float r7 = (float) r7
            float r7 = r3 - r7
            int r0 = r6.h
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r7 = r7 - r0
            int r7 = (int) r7
            r6.r = r7
            r6.g(r7)
        L6f:
            r6.h(r5)
        L72:
            boolean r7 = r6.s
            if (r7 == 0) goto La2
            int r7 = r6.r
            float r0 = r6.q
            float r0 = r3 - r0
            int r0 = (int) r0
            int r7 = r7 + r0
            r6.g(r7)
            goto La2
        L82:
            r6.h(r2)
            goto La2
        L86:
            r6.n = r1
            r6.o = r3
            float r7 = r0.getAlpha()
            r2 = 0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto La2
            boolean r7 = r6.d(r0, r1, r3)
            if (r7 == 0) goto La2
            r6.q = r3
            int r7 = r6.m
            r6.r = r7
            r6.h(r5)
        La2:
            r6.p = r3
            boolean r6 = r6.s
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8.n(android.view.MotionEvent):boolean");
    }
}
