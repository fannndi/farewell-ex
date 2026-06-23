package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.button.MaterialButton;
import flar2.devcheck.MainApp;
import flar2.devcheck.MonitorActivity;
import flar2.devcheck.R;
import flar2.devcheck.gputimes.GpuTimeActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ k5(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0209 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021f A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0271 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b0 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c1 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a6 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020d A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x0071, B:12:0x00b6, B:14:0x00be, B:18:0x00d0, B:22:0x00e3, B:29:0x00c6, B:31:0x00fe, B:32:0x0112, B:34:0x0118, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x0148, B:52:0x014e, B:54:0x0154, B:56:0x015c, B:58:0x0164, B:60:0x016c, B:62:0x0176, B:64:0x0180, B:66:0x018a, B:68:0x0194, B:70:0x019e, B:73:0x01e8, B:75:0x0209, B:76:0x0213, B:78:0x021f, B:79:0x0229, B:81:0x0271, B:83:0x0284, B:84:0x029e, B:88:0x02b0, B:90:0x02cc, B:91:0x02c1, B:93:0x02a6, B:94:0x027b, B:95:0x0223, B:96:0x020d, B:108:0x02f2), top: B:10:0x0071 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.a():void");
    }

    private final void b() {
        a5 t;
        StringBuilder sb;
        p00 p00Var = (p00) this.h;
        String str = (String) this.i;
        int i = p00.H1;
        try {
            if (p00Var.G() && (t = p00Var.t()) != null && !t.isFinishing()) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                t.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                StringBuilder sb2 = new StringBuilder();
                String str2 = ILBLnlCHDVqsSN.MTNreMIpbLxPK;
                if (i3 > i2) {
                    sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(str2);
                    sb.append(i2);
                } else {
                    sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(str2);
                    sb.append(i3);
                }
                sb2.append(sb.toString());
                sb2.append("  ");
                sb2.append(Math.round(t.getWindowManager().getDefaultDisplay().getRefreshRate()));
                sb2.append("Hz");
                String sb3 = sb2.toString();
                p00Var.M0.setText(str);
                p00Var.N0.setText(sb3);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private final void c() {
        long j;
        List list;
        GpuTimeActivity gpuTimeActivity = (GpuTimeActivity) this.h;
        String F = GpuTimeActivity.F((Context) this.i);
        if (F == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(F));
                j = 0;
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || readLine.startsWith("Total")) {
                                break;
                            }
                            String trim = readLine.trim();
                            if (!trim.isEmpty()) {
                                if (trim.startsWith("*")) {
                                    trim = trim.substring(1).trim();
                                }
                                int indexOf = trim.indexOf(58);
                                if (indexOf > 0) {
                                    try {
                                        long parseLong = Long.parseLong(trim.substring(0, indexOf).trim());
                                        String trim2 = trim.substring(indexOf + 1).trim();
                                        if (!trim2.isEmpty()) {
                                            String[] split = trim2.split("\\s+");
                                            long parseLong2 = Long.parseLong(split[split.length - 1]);
                                            arrayList.add(new eh0(parseLong, parseLong2, false));
                                            j += parseLong2;
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                        } finally {
                        }
                    } catch (IOException unused2) {
                    }
                }
                bufferedReader.close();
            } catch (IOException unused3) {
                j = 0;
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((eh0) obj).d = j > 0 ? (r6.b * 100.0f) / j : 0.0f;
            }
            list = arrayList;
        }
        gpuTimeActivity.runOnUiThread(new k5(gpuTimeActivity, 18, list));
    }

    private final void d() {
        GpuTimeActivity gpuTimeActivity = (GpuTimeActivity) this.h;
        List list = (List) this.i;
        ArrayList arrayList = gpuTimeActivity.I;
        arrayList.clear();
        arrayList.addAll(list);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            long j = 0;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j += ((eh0) obj).b;
            }
            eh0 eh0Var = new eh0(-1L, j, true);
            eh0Var.d = 100.0f;
            arrayList.add(eh0Var);
        }
        gpuTimeActivity.D();
        gpuTimeActivity.H.f();
        boolean isEmpty = arrayList.isEmpty();
        TextView textView = gpuTimeActivity.G;
        if (!isEmpty) {
            textView.setVisibility(8);
            gpuTimeActivity.F.setVisibility(0);
        } else {
            textView.setText(R.string.gputime_unavailable);
            gpuTimeActivity.G.setVisibility(0);
            gpuTimeActivity.F.setVisibility(8);
        }
    }

    private final void e() {
        ei0 ei0Var = (ei0) this.h;
        try {
            ei0Var.g0().registerReceiver(ei0Var.j0, (IntentFilter) this.i);
            if (Build.VERSION.SDK_INT < 31) {
                ei0Var.i0.cancelDiscovery();
                ei0Var.i0.startDiscovery();
            } else if (pr.g(ei0Var.i0(), "android.permission.BLUETOOTH_SCAN") == 0) {
                ei0Var.i0.cancelDiscovery();
                ei0Var.i0.startDiscovery();
            } else {
                ei0Var.f0(new String[]{"android.permission.BLUETOOTH_SCAN"}, 133);
            }
            View inflate = ei0Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
            th2 th2Var = new th2(ei0Var.g0());
            j3 j3Var = (j3) th2Var.h;
            j3Var.s = inflate;
            j3Var.n = true;
            th2Var.h(ei0Var.A(R.string.cancel), new bi0(ei0Var, 3));
            th2Var.j(ei0Var.A(R.string.settings), new bi0(ei0Var, 4));
            ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
            try {
                if (uz1.d(ei0Var.i0())) {
                    imageView.setImageResource(R.drawable.ic_bluetooth_dark);
                } else {
                    imageView.setImageResource(R.drawable.ic_bluetooth_light);
                }
            } catch (Exception unused) {
            }
            try {
                ((TextView) inflate.findViewById(R.id.info_title)).setText(ei0Var.A(R.string.nearby_devices));
            } catch (Exception unused2) {
            }
            ei0Var.k0 = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
            ei0Var.i0();
            ei0Var.k0.setLayoutManager(new LinearLayoutManager(1));
            l01 l01Var = new l01(ei0Var.i0(), (List) ei0Var.m0);
            ei0Var.l0 = l01Var;
            ei0Var.k0.setAdapter(l01Var);
            n3 n3Var = ei0Var.h0;
            if (n3Var != null && n3Var.isShowing()) {
                ei0Var.h0.dismiss();
            }
            n3 a2 = th2Var.a();
            ei0Var.h0 = a2;
            a2.show();
            ei0Var.u0();
        } catch (IllegalStateException unused3) {
        }
    }

    private final void f() {
        try {
            ((sm0) this.h).a((te2) this.i);
        } catch (Throwable unused) {
        }
    }

    private final void g() {
        tm0 tm0Var = (tm0) this.h;
        try {
            ((sm0) this.i).a((te2) tm0Var.c);
        } catch (Throwable unused) {
        }
    }

    private final void h() {
        JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.h;
        JobParameters jobParameters = (JobParameters) this.i;
        int i = JobInfoSchedulerService.g;
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }

    private final void i() {
        MainApp mainApp = (MainApp) this.h;
        int[] iArr = (int[]) this.i;
        ExecutorService executorService = MainApp.h;
        for (int i = 0; i < 7; i++) {
            try {
                ig1.b(mainApp, iArr[i]);
            } catch (Throwable unused) {
            }
        }
    }

    private final void j() {
        Executor executor = (Executor) this.h;
        rn1 rn1Var = (rn1) this.i;
        try {
            wn1 k = rt0.k();
            if (executor == null) {
                rn1Var.a(k);
            } else {
                executor.execute(new k5(rn1Var, 25, k));
            }
        } catch (w21 unused) {
        }
    }

    private final void k() {
        ((rn1) this.h).a((wn1) this.i);
    }

    private final void l() {
        cu0 cu0Var = (cu0) this.h;
        cu0Var.c.i((ArrayList) this.i);
    }

    private final void m() {
        MaterialButton materialButton = (MaterialButton) this.h;
        Runnable runnable = (Runnable) this.i;
        int[] iArr = MaterialButton.T;
        runnable.run();
        LinearLayout.LayoutParams layoutParams = materialButton.I;
        if (layoutParams != null) {
            materialButton.setLayoutParams(layoutParams);
            materialButton.I = null;
            materialButton.F = -2.1474836E9f;
        }
        materialButton.requestLayout();
    }

    private final void n() {
        MonitorActivity monitorActivity = (MonitorActivity) this.h;
        Class cls = (Class) this.i;
        int i = MonitorActivity.Z;
        try {
            oq1.v(monitorActivity.getApplicationContext(), cls);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0314  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.run():void");
    }
}
