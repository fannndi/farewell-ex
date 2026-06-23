package defpackage;

import android.widget.LinearLayout;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.PermissionsSummaryFragment;
import flar2.devcheck.usage.NetworkUsageActivity;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class jy implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f502a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy(int i, Object obj) {
        this.f502a = i;
        this.b = obj;
    }

    @Override // defpackage.dv0
    public final void a(int i, boolean z) {
        g52 g52Var;
        vm0 a2;
        int i2 = this.f502a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                my myVar = (my) obj;
                if (z) {
                    int i3 = i == R.id.cpu_mode_core ? 1 : 0;
                    myVar.r0 = i3;
                    i51.j(i3, "prefSysGraphsCpuMode");
                    int i4 = myVar.r0;
                    LinearLayout linearLayout = myVar.n0;
                    if (i4 != 0) {
                        linearLayout.setVisibility(8);
                        myVar.q0.setVisibility(0);
                        break;
                    } else {
                        linearLayout.setVisibility(0);
                        myVar.q0.setVisibility(8);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                NetworkUsageActivity networkUsageActivity = (NetworkUsageActivity) obj;
                int i5 = NetworkUsageActivity.W;
                if (z) {
                    if (i == R.id.today) {
                        g52Var = g52.g;
                    } else if (i == R.id.last_seven_days) {
                        g52Var = g52.h;
                    } else if (i == R.id.last_thirty_days) {
                        g52Var = g52.i;
                    }
                    networkUsageActivity.G.f(g52Var);
                    y42 y42Var = (y42) networkUsageActivity.G.g.d();
                    if (y42Var != null && (a2 = y42Var.a(g52Var)) != null) {
                        networkUsageActivity.B(g52Var, y42Var, a2);
                        break;
                    }
                }
                break;
            default:
                PermissionsSummaryFragment permissionsSummaryFragment = (PermissionsSummaryFragment) obj;
                if (i == R.id.all) {
                    i51.h("ppss", z);
                    f71 f71Var = permissionsSummaryFragment.e0;
                    l61 l61Var = f71Var.d;
                    List list = (List) l61Var.p.d();
                    if (list != null && !list.isEmpty()) {
                        l61Var.m(list);
                    }
                    f71Var.e.submit(new r60(11, f71Var));
                    break;
                }
                break;
        }
    }
}
