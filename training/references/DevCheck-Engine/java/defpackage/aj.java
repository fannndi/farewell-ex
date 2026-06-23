package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class aj extends he1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ld0 c;

    public /* synthetic */ aj(ld0 ld0Var, Object obj, int i) {
        this.f32a = i;
        this.c = ld0Var;
        this.b = obj;
    }

    @Override // defpackage.he1
    public void a(RecyclerView recyclerView, int i) {
        y51 y51Var;
        RecyclerView recyclerView2;
        switch (this.f32a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                e eVar = (e) this.b;
                jv0 jv0Var = (jv0) this.c;
                if (i == 0 && (y51Var = jv0Var.r0) != null) {
                    View e = y51Var.e((LinearLayoutManager) jv0Var.k0.getLayoutManager());
                    if (e != null) {
                        te1 N = RecyclerView.N(e);
                        int K = (N == null || (recyclerView2 = N.x) == null) ? -1 : recyclerView2.K(N);
                        if (K != -1) {
                            jv0Var.g0 = eVar.v(K);
                            jv0Var.p0.setText(eVar.v(K).c());
                            jv0Var.A0(K);
                        }
                    }
                    jv0Var.z0();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.he1
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f32a;
        ld0 ld0Var = this.c;
        Object obj = this.b;
        switch (i3) {
            case 0:
                cj cjVar = (cj) ld0Var;
                if (i2 > 0 && ((LinearLayoutManager) obj).Q0() >= cjVar.f0.d.size() - 5) {
                    cjVar.e0.d();
                    break;
                }
                break;
            default:
                e eVar = (e) obj;
                jv0 jv0Var = (jv0) ld0Var;
                RecyclerView recyclerView2 = jv0Var.k0;
                int P0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).P0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).Q0();
                if (jv0Var.r0 == null) {
                    jv0Var.g0 = eVar.v(P0);
                }
                jv0Var.p0.setText(eVar.v(P0).c());
                jv0Var.A0(P0);
                break;
        }
    }
}
