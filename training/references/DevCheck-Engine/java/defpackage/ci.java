package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class ci extends ld0 {
    public vc1 d0;
    public RecyclerView e0;
    public ProgressBar f0;
    public bj0 g0;
    public kt h0;
    public kt i0;

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        n0(true);
    }

    @Override // defpackage.ld0
    public final void N(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_bench_leaderboard, menu);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_rankings, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final void Q() {
        RecyclerView recyclerView = this.e0;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.e0 = null;
        this.f0 = null;
        this.K = true;
    }

    @Override // defpackage.ld0
    public final boolean U(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_leaderboard) {
            return false;
        }
        ym0.v(g0());
        return true;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a("benchmark_rankings");
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "benchmark_rankings");
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        a5 g0 = g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(vc1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d0 = (vc1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.e0 = (RecyclerView) view.findViewById(R.id.bench_rank_list);
        this.f0 = (ProgressBar) view.findViewById(R.id.bench_rank_progress);
        this.g0 = new bj0(bj0.f, 0);
        this.h0 = new kt(new p8(7, this));
        this.i0 = new kt(new gm2(14, this));
        RecyclerView recyclerView = this.e0;
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.e0.setAdapter(new du(new td1[]{this.g0, this.h0, this.i0}));
        this.e0.setHasFixedSize(false);
        this.d0.j.e(D(), new nc(5, this));
    }
}
