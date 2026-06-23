package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.internal.CheckableImageButton;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.permissionsSummary.PermissionsSummaryFragment;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import flar2.devcheck.temperature.TemperatureActivity;
import flar2.devcheck.tools.ToolsActivity;
import flar2.devcheck.usage.ScreentimeActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class c71 implements tt1, z42, up, pi1, b41, c11, ww1, gr1, v41, vt1, et1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c71(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.z42
    public void a(c52 c52Var) {
        ScreentimeActivity screentimeActivity = (ScreentimeActivity) this.h;
        int i = ScreentimeActivity.O;
        String str = c52Var.f108a;
        try {
            ApplicationInfo applicationInfo = screentimeActivity.getPackageManager().getApplicationInfo(str, 0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("appInfo", applicationInfo);
            p51 p51Var = new p51();
            p51Var.m0(bundle);
            p51Var.z0(screentimeActivity.s(), str);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // defpackage.et1
    public ft1 b(tp tpVar) {
        Context context = (Context) this.h;
        String str = (String) tpVar.d;
        ko koVar = (ko) tpVar.e;
        koVar.getClass();
        if (str != null && str.length() != 0) {
            return new xe0(context, str, koVar, true, true);
        }
        c.m("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // defpackage.c11
    public boolean c(MenuItem menuItem) {
        TaskManager2Activity taskManager2Activity = (TaskManager2Activity) this.h;
        int i = TaskManager2Activity.V;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_processes) {
            taskManager2Activity.C(1);
            return true;
        }
        if (itemId != R.id.nav_services) {
            return false;
        }
        taskManager2Activity.C(2);
        return true;
    }

    @Override // defpackage.tt1
    public void d() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                f71 f71Var = ((PermissionsSummaryFragment) obj).e0;
                l61 l61Var = f71Var.d;
                List list = (List) l61Var.p.d();
                if (list != null && !list.isEmpty()) {
                    l61Var.m(list);
                }
                f71Var.e.submit(new r60(11, f71Var));
                break;
            case 3:
                bm1 bm1Var = (bm1) obj;
                bm1Var.e0 = false;
                fm1 fm1Var = bm1Var.f0;
                fm1Var.d.execute(new r60(25, fm1Var));
                break;
            default:
                gu1 gu1Var = (gu1) obj;
                gu1Var.f0 = false;
                gu1Var.e0.h();
                break;
        }
    }

    @Override // defpackage.vt1
    public Object e() {
        SQLiteDatabase a2;
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 16:
                zi1 zi1Var = ((w42) obj).i;
                a2 = zi1Var.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + zi1Var.h.c()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                gr grVar = (gr) obj;
                a2 = ((zi1) grVar.i).a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery(YHJbtPFAANaPQ.qYaeZcqqLnOmt, new String[0]);
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (rawQuery.moveToNext()) {
                            fh a3 = nb.a();
                            a3.P(rawQuery.getString(1));
                            a3.j = f91.b(rawQuery.getInt(2));
                            String string = rawQuery.getString(3);
                            a3.i = string == null ? null : Base64.decode(string, 0);
                            arrayList.add(a3.o());
                        }
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ((fh) grVar.j).N((nb) obj2, 1, false);
                        }
                        return null;
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
        }
    }

    @Override // defpackage.ww1
    public void f(String str) {
        ex1 ex1Var = ((TemperatureActivity) this.h).F;
        if (str.equals(ex1Var.s)) {
            return;
        }
        ex1Var.s = str;
        ex1Var.e();
    }

    @Override // defpackage.pi1
    public void g(l30 l30Var) {
        xr1 xr1Var = (xr1) this.h;
        float f = l30Var.f568a;
        List list = (List) l30Var.b;
        if (!Float.isNaN(f) && f >= 0.0f) {
            float min = Math.min(1.0f, Math.max(0.0f, f));
            xr1Var.r0.setProgress(Math.round((1.0f - min) * 100.0f));
            Context i0 = xr1Var.i0();
            xr1Var.r0.setProgressTintList(ColorStateList.valueOf(min >= 0.9f ? i0.getColor(R.color.red) : min >= 0.75f ? i0.getColor(R.color.orange) : min >= 0.5f ? i0.getColor(R.color.yellow) : i0.getColor(R.color.green)));
            xr1Var.q0.setText(String.format(Locale.getDefault(), "%.2f", Float.valueOf(f)));
            if (!xr1Var.x0) {
                xr1Var.p0.setVisibility(0);
                xr1Var.x0 = true;
            }
        }
        if (xr1Var.t0 != null && !list.isEmpty()) {
            xr1Var.t0.v(null, list);
        }
        if (xr1Var.s0 != null && !list.isEmpty() && !xr1Var.w0) {
            xr1Var.s0.setVisibility(0);
            xr1Var.w0 = true;
        }
        xr1Var.u0();
    }

    @Override // defpackage.up
    public void h() {
        uq1 uq1Var = (uq1) this.h;
        CheckableImageButton checkableImageButton = uq1Var.j;
        kk1.U(checkableImageButton, uq1Var.o, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.v41
    public void i(Object obj) {
        ToolsActivity toolsActivity = (ToolsActivity) this.h;
        String str = ToolsActivity.I;
        new tm(toolsActivity, 2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((se2) obj).f932a);
    }

    public void j(boolean z, boolean z2) {
        int i = this.g;
        String str = tEegR.TqkWYrgyfgdkOME;
        tt0 tt0Var = (tt0) this.h;
        switch (i) {
            case 14:
                i51.h(str, z);
                tt0Var.a(z, z2);
                break;
            default:
                i51.h(str, z);
                tt0Var.a(z, z2);
                break;
        }
    }

    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        du1 du1Var = (du1) this.h;
        ArrayList arrayList = du1Var.b;
        db2 db2Var = gb2Var.f329a;
        mm0 b = mm0.b(db2Var.h(519), db2Var.h(64));
        mm0 b2 = mm0.b(db2Var.i(519), db2Var.i(64));
        if (!b.equals(du1Var.c) || !b2.equals(du1Var.d)) {
            du1Var.c = b;
            du1Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((wa1) arrayList.get(size)).f1122a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw iy1.e(arrayList2, size2);
                }
            }
        }
        return gb2Var;
    }
}
