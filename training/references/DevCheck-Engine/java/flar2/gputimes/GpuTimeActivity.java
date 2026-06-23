package flar2.devcheck.gputimes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.a9;
import defpackage.c3;
import defpackage.i51;
import defpackage.k5;
import defpackage.op0;
import defpackage.pr;
import defpackage.tc;
import defpackage.vg0;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class GpuTimeActivity extends a5 {
    public static final /* synthetic */ int J = 0;
    public RecyclerView F;
    public TextView G;
    public vg0 H;
    public final ArrayList I = new ArrayList();

    public static String B(long j) {
        long j2 = j / 3600000;
        long j3 = j / 60000;
        return String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3 - TimeUnit.HOURS.toMinutes(j2)), Long.valueOf((j / 1000) - TimeUnit.MINUTES.toSeconds(j3)));
    }

    public static void C(ArrayList arrayList, String str, String str2) {
        String lowerCase = str2.toLowerCase(Locale.US);
        for (String str3 : E(str)) {
            if (str3.toLowerCase(Locale.US).contains(lowerCase)) {
                arrayList.add(str + "/" + str3 + "/devfreq/" + str3 + "/trans_stat");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List E(java.lang.String r7) {
        /*
            java.lang.String r0 = "ls "
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            java.io.File[] r1 = r1.listFiles()
            r2 = 0
            if (r1 == 0) goto L27
            int r3 = r1.length
            if (r3 <= 0) goto L27
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r1.length
            r7.<init>(r0)
            int r0 = r1.length
        L18:
            if (r2 >= r0) goto L26
            r3 = r1[r2]
            java.lang.String r3 = r3.getName()
            r7.add(r3)
            int r2 = r2 + 1
            goto L18
        L26:
            return r7
        L27:
            java.lang.String r1 = r0.concat(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = defpackage.ju0.u(r1)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L59
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L38
            goto L59
        L38:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L62
            r3.<init>()     // Catch: java.lang.Throwable -> L62
            r4 = 0
            java.lang.String r4 = flar2.devcheck.permissionsSummary.xEua.bPnJ.JgCzjoQHj     // Catch: java.lang.Throwable -> L62
            java.lang.String[] r1 = r1.split(r4)     // Catch: java.lang.Throwable -> L62
            int r4 = r1.length     // Catch: java.lang.Throwable -> L62
        L45:
            if (r2 >= r4) goto L5b
            r5 = r1[r2]     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L62
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L56
            r3.add(r5)     // Catch: java.lang.Throwable -> L62
        L56:
            int r2 = r2 + 1
            goto L45
        L59:
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L62
        L5b:
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L62
            return r3
        L62:
            java.lang.String r1 = "prefRoot"
            java.lang.Boolean r1 = defpackage.i51.b(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r1.<init>()     // Catch: java.lang.Throwable -> Lc5
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc5
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> Lc5
            i61 r7 = defpackage.wn1.a(r7)     // Catch: java.lang.Throwable -> Lc5
            rg1 r7 = r7.o()     // Catch: java.lang.Throwable -> Lc5
            boolean r0 = r7.e()     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lc5
            java.util.List r0 = r7.c()     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lc5
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc5
            java.util.List r1 = r7.c()     // Catch: java.lang.Throwable -> Lc5
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lc5
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc5
            java.util.List r7 = r7.c()     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lc5
        Laa:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto Laa
            r0.add(r1)     // Catch: java.lang.Throwable -> Lc5
            goto Laa
        Lc4:
            return r0
        Lc5:
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.gputimes.GpuTimeActivity.E(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String F(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.gputimes.GpuTimeActivity.F(android.content.Context):java.lang.String");
    }

    public final void D() {
        boolean booleanValue = i51.b("prefGPUTimeSort").booleanValue();
        ArrayList arrayList = this.I;
        if (booleanValue) {
            Collections.sort(arrayList, new a9(8));
        } else {
            Collections.sort(arrayList, new a9(9));
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        pr.m(getWindow());
        setContentView(R.layout.activity_gputime);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.gputime_toolbar);
        A(materialToolbar);
        if (r() != null) {
            r().j0(true);
            r().l0(R.string.gpu_times);
        }
        materialToolbar.setNavigationOnClickListener(new tc(10, this));
        View findViewById = findViewById(R.id.gputime_coord_layout);
        MaterialToolbar materialToolbar2 = (MaterialToolbar) findViewById(R.id.gputime_toolbar);
        View findViewById2 = findViewById(R.id.gputime_list);
        if (findViewById != null && materialToolbar2 != null && findViewById2 != null) {
            op0.a(findViewById, true, true, true, false, false, false);
            op0.a(findViewById2, false, false, false, true, false, false);
        }
        this.F = (RecyclerView) findViewById(R.id.gputime_list);
        this.G = (TextView) findViewById(R.id.gputime_empty);
        this.F.setLayoutManager(new LinearLayoutManager(1));
        vg0 vg0Var = new vg0(this.I);
        this.H = vg0Var;
        this.F.setAdapter(vg0Var);
        new Thread(new k5(this, 17, getApplicationContext()), "GpuTimeLoad").start();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gputime, menu);
        if (i51.b("prefGPUTimeSort").booleanValue()) {
            menu.findItem(R.id.action_sort).setTitle(R.string.sort_by_freq);
            return true;
        }
        menu.findItem(R.id.action_sort).setTitle(R.string.sort_by_usage);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_sort) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        }
        boolean booleanValue = i51.b("prefGPUTimeSort").booleanValue();
        i51.h("prefGPUTimeSort", !booleanValue);
        menuItem.setTitle(!booleanValue ? R.string.sort_by_freq : R.string.sort_by_usage);
        D();
        this.H.f();
        return true;
    }
}
