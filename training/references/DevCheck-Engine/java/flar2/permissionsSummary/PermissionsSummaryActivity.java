package flar2.devcheck.permissionsSummary;

import android.os.Bundle;
import android.widget.FrameLayout;
import defpackage.a5;
import defpackage.c3;
import defpackage.op0;
import defpackage.pr;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class PermissionsSummaryActivity extends a5 {
    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.permissions_summary_activity);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.root);
        if (frameLayout == null) {
            return;
        }
        op0.a(frameLayout, true, false, true, false, false, false);
    }
}
