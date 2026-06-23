package defpackage;

import android.os.Bundle;
import android.view.View;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.PermissionsSummaryFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class d71 implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ PermissionsSummaryFragment h;

    public /* synthetic */ d71(PermissionsSummaryFragment permissionsSummaryFragment, int i) {
        this.g = i;
        this.h = permissionsSummaryFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.g;
        PermissionsSummaryFragment permissionsSummaryFragment = this.h;
        switch (i) {
            case 0:
                ae0 s = permissionsSummaryFragment.t().s();
                s.getClass();
                yb ybVar = new yb(s);
                ybVar.r = true;
                ybVar.k(rp1.class, null);
                ybVar.c(permissionsSummaryFragment.A(R.string.special_access));
                ybVar.e(false);
                break;
            default:
                ae0 s2 = permissionsSummaryFragment.t().s();
                s2.getClass();
                yb ybVar2 = new yb(s2);
                ybVar2.r = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("allPerms", true);
                ybVar2.k(p61.class, bundle);
                ybVar2.c(permissionsSummaryFragment.A(R.string.all_permissions));
                ybVar2.e(false);
                break;
        }
    }
}
