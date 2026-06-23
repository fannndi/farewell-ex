package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* loaded from: classes.dex */
public final class ev0 implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ e h;
    public final /* synthetic */ jv0 i;

    public /* synthetic */ ev0(jv0 jv0Var, e eVar, int i) {
        this.g = i;
        this.i = jv0Var;
        this.h = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.g;
        e eVar = this.h;
        jv0 jv0Var = this.i;
        switch (i) {
            case 0:
                int P0 = ((LinearLayoutManager) jv0Var.k0.getLayoutManager()).P0();
                eVar.i = 2;
                jv0Var.w0(eVar.v(P0 + 1));
                break;
            default:
                int Q0 = ((LinearLayoutManager) jv0Var.k0.getLayoutManager()).Q0();
                eVar.i = 1;
                jv0Var.w0(eVar.v(Q0 - 1));
                break;
        }
    }
}
