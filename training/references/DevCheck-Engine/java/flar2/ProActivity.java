package flar2.devcheck;

import android.view.View;
import android.widget.TextView;
import defpackage.a5;
import defpackage.ra1;
import defpackage.uc;
import defpackage.wt0;

/* loaded from: classes.dex */
public class ProActivity extends a5 {
    public static final /* synthetic */ int M = 0;
    public View F;
    public View G;
    public View H;
    public TextView I;
    public TextView J;
    public TextView K;
    public wt0 L;

    public final void B(ra1 ra1Var, View view) {
        if (ra1Var != null) {
            view.setTag(ra1Var.a().b + "\n" + ra1Var.a().f723a);
            String str = (String) view.getTag();
            if (view.getId() == R.id.bm_pro_1_card) {
                this.I.setText(str);
            }
            if (view.getId() == R.id.bm_pro_2_card) {
                this.J.setText(str);
            }
            if (view.getId() == R.id.bm_pro_3_card) {
                this.K.setText(str);
            }
            view.setEnabled(true);
            view.setOnClickListener(new uc(this, 13, ra1Var));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r0.isConnected() != false) goto L22;
     */
    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.ProActivity.onCreate(android.os.Bundle):void");
    }
}
