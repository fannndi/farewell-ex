package flar2.devcheck.cputimes;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.a9;
import defpackage.b41;
import defpackage.c3;
import defpackage.g3;
import defpackage.i51;
import defpackage.ju0;
import defpackage.or;
import defpackage.p62;
import defpackage.p8;
import defpackage.pr;
import defpackage.sm;
import defpackage.tm;
import defpackage.ts0;
import defpackage.u8;
import defpackage.uz1;
import defpackage.y62;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.nativebridge.xm.oWuW;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class CPUTimeActivity extends a5 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int U = 0;
    public ListView F;
    public g3 G;
    public SwipeRefreshLayout H;
    public final ArrayList I = new ArrayList();
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public Spinner O;
    public MaterialToolbar P;
    public View Q;
    public View R;
    public int S;
    public int T;

    public static String B(long j) {
        long j2 = j * 10;
        long j3 = j2 / 3600000;
        long j4 = j2 / 60000;
        return String.format("%02d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4 - TimeUnit.HOURS.toMinutes(j3)), Long.valueOf((j2 / 1000) - TimeUnit.MINUTES.toSeconds(j4)));
    }

    public final void C() {
        new tm(this, 0).executeOnExecutor(MainApp.h, new Void[0]);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String b;
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_cputime);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cputime_container);
        ListView listView = (ListView) findViewById(R.id.list);
        final int paddingStart = linearLayout.getPaddingStart();
        final int paddingTop = linearLayout.getPaddingTop();
        final int paddingEnd = linearLayout.getPaddingEnd();
        final int paddingBottom = linearLayout.getPaddingBottom();
        listView.getPaddingStart();
        listView.getPaddingTop();
        listView.getPaddingEnd();
        listView.getPaddingBottom();
        b41 b41Var = new b41() { // from class: rm
            @Override // defpackage.b41
            public final gb2 v(View view, gb2 gb2Var) {
                int i = CPUTimeActivity.U;
                mm0 h = gb2Var.f329a.h(647);
                LinearLayout linearLayout2 = linearLayout;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
                marginLayoutParams.setMargins(h.f643a, 0, h.c, 0);
                linearLayout2.setLayoutParams(marginLayoutParams);
                view.setPadding(paddingStart, paddingTop + h.b, paddingEnd, paddingBottom);
                return gb2Var;
            }
        };
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(linearLayout, b41Var);
        p62.c(listView, new u8(paddingStart, paddingTop, paddingEnd, paddingBottom, 3));
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar);
        this.P = materialToolbar;
        A(materialToolbar);
        final int i = 1;
        r().j0(true);
        if (uz1.d(this)) {
            this.P.setPopupTheme(R.style.MyPopupMenuStyleDark);
        }
        r().m0("");
        ((TextView) findViewById(R.id.mainActivityTitle)).setText(getString(R.string.cpu_times));
        this.F = (ListView) findViewById(R.id.list);
        this.F.addHeaderView(getLayoutInflater().inflate(R.layout.activity_cputime_fakeheader, this.F, false));
        g3 g3Var = new g3(this, new ArrayList());
        this.G = g3Var;
        this.F.setAdapter((ListAdapter) g3Var);
        this.O = (Spinner) findViewById(R.id.cluster_spinner);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) pr.J(true)).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(ju0.i(((Integer) ((or) ((Map.Entry) it.next()).getValue()).f754a.get(0)).intValue()));
        }
        if (arrayList.isEmpty()) {
            finish();
            return;
        }
        this.K = (String) arrayList.get(0);
        int i2 = 4;
        if (arrayList.size() == 2) {
            this.L = (String) arrayList.get(1);
            this.M = null;
            this.N = null;
        } else if (arrayList.size() == 3) {
            this.L = (String) arrayList.get(1);
            this.M = (String) arrayList.get(2);
            this.N = null;
        } else if (arrayList.size() == 4) {
            this.L = (String) arrayList.get(1);
            this.M = (String) arrayList.get(2);
            this.N = (String) arrayList.get(3);
        } else {
            this.L = null;
            this.M = null;
            this.N = null;
        }
        boolean q = uz1.q(this.L);
        Spinner spinner = this.O;
        if (q) {
            spinner.setOnItemSelectedListener(this);
            Map J = pr.J(true);
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = (HashMap) J;
            if (!hashMap.isEmpty()) {
                int size = hashMap.size();
                if (size == 1) {
                    arrayList2.add(ts0.b(this, R.string.sysgraphs_cpu_cores));
                } else {
                    ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    arrayList4.sort(new a9(i2));
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        hashMap2.put((Integer) ((Map.Entry) arrayList4.get(i3)).getKey(), Integer.valueOf(i3));
                    }
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj = arrayList3.get(i4);
                        i4++;
                        Map.Entry entry = (Map.Entry) obj;
                        int intValue = ((Integer) hashMap2.get(entry.getKey())).intValue();
                        if (intValue == 0) {
                            b = ts0.b(this, R.string.sysgraphs_cpu_efficiency_cores);
                        } else if (intValue == size - 1) {
                            b = ((or) entry.getValue()).f754a.size() == 1 ? ts0.b(this, R.string.sysgraphs_cpu_prime_core) : ts0.b(this, R.string.sysgraphs_cpu_performance_cores);
                        } else {
                            b = ts0.b(this, R.string.sysgraphs_cpu_performance_cores);
                        }
                        arrayList2.add(b);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            int i5 = (uz1.q(this.L) ? 1 : 0) + 1 + (this.M != null ? 1 : 0) + (this.N != null ? 1 : 0);
            int i6 = 0;
            while (i6 < i5) {
                if (i6 < arrayList2.size()) {
                    arrayList5.add((String) arrayList2.get(i6));
                } else {
                    arrayList5.add(getString(i6 != 0 ? i6 != 1 ? i6 != 2 ? R.string.fourth_cluster : R.string.perf_cluster : R.string.big_cluster : R.string.little_cluster));
                }
                i6++;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.cputimes_spinner_item, arrayList5);
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            this.O.setAdapter((SpinnerAdapter) arrayAdapter);
            if (i51.b("prefCPUTimecluster2").booleanValue() && arrayList5.size() > 1) {
                this.O.setSelection(1);
            }
            if (i51.b("prefCPUTimecluster3").booleanValue() && arrayList5.size() > 2) {
                this.O.setSelection(2);
            }
            if (i51.b("prefCPUTimecluster4").booleanValue() && arrayList5.size() > 3) {
                this.O.setSelection(3);
            }
        } else {
            spinner.setVisibility(8);
        }
        if (!uz1.q(this.L)) {
            this.J = this.K;
        } else if (i51.b("prefCPUTimecluster2").booleanValue()) {
            this.J = this.L;
        } else if (i51.b("prefCPUTimecluster3").booleanValue()) {
            this.J = this.M;
        } else if (i51.b("prefCPUTimecluster4").booleanValue()) {
            this.J = this.N;
        } else {
            this.J = this.K;
        }
        this.Q = findViewById(R.id.cputime_header);
        this.R = findViewById(R.id.header_shadow);
        this.S = getResources().getDimensionPixelSize(R.dimen.header_height_cputime);
        this.T = (-r1) - 100;
        int i7 = (getResources().getBoolean(R.bool.isTablet) || getResources().getBoolean(R.bool.isTablet10)) ? 320 : (getResources().getBoolean(R.bool.isNexus6) && getResources().getBoolean(R.bool.isLandscape)) ? 420 : getResources().getBoolean(R.bool.isLandscape) ? 350 : getResources().getBoolean(R.bool.isNexus6) ? 530 : 450;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.cputime_swipe_container);
        this.H = swipeRefreshLayout;
        swipeRefreshLayout.g(i7);
        this.H.setOnRefreshListener(new p8(13, this));
        Button button = (Button) findViewById(R.id.cputime_reset);
        Button button2 = (Button) findViewById(R.id.cputime_restore);
        final int i8 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: qm
            public final /* synthetic */ CPUTimeActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i8;
                CPUTimeActivity cPUTimeActivity = this.h;
                switch (i9) {
                    case 0:
                        int i10 = CPUTimeActivity.U;
                        i51.l(oWuW.qAtPRdCYvlVyqyk, Long.toString((SystemClock.elapsedRealtime() - SystemClock.uptimeMillis()) / 10));
                        i51.h("prefCPUTimeSaveOffsets", true);
                        StringBuilder sb = new StringBuilder();
                        String[] w = uz1.w(cPUTimeActivity.K);
                        int length = w.length;
                        int i11 = 0;
                        while (true) {
                            String str = yFbVsaLCWAtQC.YwgL;
                            if (i11 >= length) {
                                i51.l("prefCPUTimeOffsetsLittle", sb.toString());
                                StringBuilder sb2 = new StringBuilder();
                                for (String str2 : uz1.w(cPUTimeActivity.L)) {
                                    try {
                                        sb2.append(str2.split("\\s+")[1]);
                                        sb2.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                    }
                                }
                                i51.l("prefCPUTimeOffsetsBig", sb2.toString());
                                StringBuilder sb3 = new StringBuilder();
                                for (String str3 : uz1.w(cPUTimeActivity.M)) {
                                    try {
                                        sb3.append(str3.split("\\s+")[1]);
                                        sb3.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                    }
                                }
                                i51.l("prefCPUTimeOffsetsPerf", sb3.toString());
                                StringBuilder sb4 = new StringBuilder();
                                for (String str4 : uz1.w(cPUTimeActivity.N)) {
                                    try {
                                        sb4.append(str4.split("\\s+")[1]);
                                        sb4.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                    }
                                }
                                i51.l("prefCPUTimeOffsets12", sb4.toString());
                                cPUTimeActivity.C();
                                break;
                            } else {
                                String str5 = w[i11];
                                if (!str5.contains(bOxzFZXgEkjph.sBiftlMsIo) && !str5.contains("N/A")) {
                                    try {
                                        sb.append(str5.split("\\s+")[1]);
                                        sb.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                    }
                                }
                                i11++;
                            }
                        }
                        break;
                    default:
                        int i12 = CPUTimeActivity.U;
                        i51.h("prefCPUTimeSaveOffsets", false);
                        cPUTimeActivity.C();
                        break;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: qm
            public final /* synthetic */ CPUTimeActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9 = i;
                CPUTimeActivity cPUTimeActivity = this.h;
                switch (i9) {
                    case 0:
                        int i10 = CPUTimeActivity.U;
                        i51.l(oWuW.qAtPRdCYvlVyqyk, Long.toString((SystemClock.elapsedRealtime() - SystemClock.uptimeMillis()) / 10));
                        i51.h("prefCPUTimeSaveOffsets", true);
                        StringBuilder sb = new StringBuilder();
                        String[] w = uz1.w(cPUTimeActivity.K);
                        int length = w.length;
                        int i11 = 0;
                        while (true) {
                            String str = yFbVsaLCWAtQC.YwgL;
                            if (i11 >= length) {
                                i51.l("prefCPUTimeOffsetsLittle", sb.toString());
                                StringBuilder sb2 = new StringBuilder();
                                for (String str2 : uz1.w(cPUTimeActivity.L)) {
                                    try {
                                        sb2.append(str2.split("\\s+")[1]);
                                        sb2.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                    }
                                }
                                i51.l("prefCPUTimeOffsetsBig", sb2.toString());
                                StringBuilder sb3 = new StringBuilder();
                                for (String str3 : uz1.w(cPUTimeActivity.M)) {
                                    try {
                                        sb3.append(str3.split("\\s+")[1]);
                                        sb3.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused2) {
                                    }
                                }
                                i51.l("prefCPUTimeOffsetsPerf", sb3.toString());
                                StringBuilder sb4 = new StringBuilder();
                                for (String str4 : uz1.w(cPUTimeActivity.N)) {
                                    try {
                                        sb4.append(str4.split("\\s+")[1]);
                                        sb4.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                    }
                                }
                                i51.l("prefCPUTimeOffsets12", sb4.toString());
                                cPUTimeActivity.C();
                                break;
                            } else {
                                String str5 = w[i11];
                                if (!str5.contains(bOxzFZXgEkjph.sBiftlMsIo) && !str5.contains("N/A")) {
                                    try {
                                        sb.append(str5.split("\\s+")[1]);
                                        sb.append(str);
                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                    }
                                }
                                i11++;
                            }
                        }
                        break;
                    default:
                        int i12 = CPUTimeActivity.U;
                        i51.h("prefCPUTimeSaveOffsets", false);
                        cPUTimeActivity.C();
                        break;
                }
            }
        });
        this.F.setOnScrollListener(new sm(this, button, button2));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cputime, menu);
        if (i51.b("prefCPUTimeDeepSleep").booleanValue()) {
            menu.findItem(R.id.action_deepsleep).setTitle(R.string.show_deep_sleep);
        } else {
            menu.findItem(R.id.action_deepsleep).setTitle(R.string.hide_deep_sleep);
        }
        if (i51.b("prefCPUTimeSort").booleanValue()) {
            menu.findItem(R.id.action_sort).setTitle(R.string.sort_by_freq);
            return true;
        }
        menu.findItem(R.id.action_sort).setTitle(R.string.sort_by_usage);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        try {
            int count = this.O.getAdapter().getCount();
            Spinner spinner = this.O;
            if (i < count) {
                spinner.setSelection(i);
            } else {
                spinner.setSelection(0);
            }
            String str = yFbVsaLCWAtQC.Jjv;
            if (i == 1) {
                i51.h("prefCPUTimecluster2", true);
                i51.h("prefCPUTimecluster3", false);
                i51.h(str, false);
                this.J = this.L;
            } else if (i == 2) {
                i51.h("prefCPUTimecluster3", true);
                i51.h("prefCPUTimecluster2", false);
                i51.h(str, false);
                this.J = this.M;
            } else if (i == 3) {
                i51.h("prefCPUTimecluster3", false);
                i51.h("prefCPUTimecluster2", false);
                i51.h(str, true);
                this.J = this.N;
            } else {
                i51.h("prefCPUTimecluster2", false);
                i51.h("prefCPUTimecluster3", false);
                i51.h(str, false);
                this.J = this.K;
            }
            C();
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
            return true;
        }
        if (itemId == R.id.action_deepsleep) {
            if (i51.b("prefCPUTimeDeepSleep").booleanValue()) {
                menuItem.setTitle(R.string.hide_deep_sleep);
                i51.h("prefCPUTimeDeepSleep", false);
            } else {
                menuItem.setTitle(R.string.show_deep_sleep);
                i51.h("prefCPUTimeDeepSleep", true);
            }
            C();
            return true;
        }
        if (itemId != R.id.action_sort) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (i51.b("prefCPUTimeSort").booleanValue()) {
            menuItem.setTitle(R.string.sort_by_usage);
            i51.h("prefCPUTimeSort", false);
        } else {
            menuItem.setTitle(R.string.sort_by_freq);
            i51.h("prefCPUTimeSort", true);
        }
        C();
        return true;
    }

    @Override // defpackage.zt, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
            try {
                Method declaredMethod = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(menu, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
        super.onPreparePanel(i, view, menu);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        C();
    }
}
