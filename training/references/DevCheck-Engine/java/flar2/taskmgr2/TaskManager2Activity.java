package flar2.devcheck.taskmgr2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import defpackage.a5;
import defpackage.aa1;
import defpackage.ba1;
import defpackage.c3;
import defpackage.c71;
import defpackage.d51;
import defpackage.g40;
import defpackage.ig1;
import defpackage.iy;
import defpackage.md2;
import defpackage.oo1;
import defpackage.op0;
import defpackage.pr;
import defpackage.sl;
import defpackage.tl0;
import defpackage.uz1;
import defpackage.v91;
import defpackage.wa;
import defpackage.wm1;
import defpackage.x10;
import defpackage.zv1;
import flar2.devcheck.R;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class TaskManager2Activity extends a5 {
    public static final /* synthetic */ int V = 0;
    public ba1 F;
    public zv1 G;
    public TextView H;
    public TextView I;
    public TextView J;
    public ProgressBar K;
    public RecyclerView N;
    public wm1 O;
    public ExecutorService S;
    public boolean L = false;
    public int M = 1;
    public int P = 1;
    public int Q = 2;
    public final Handler R = new Handler(Looper.getMainLooper());
    public boolean T = false;
    public final wa U = new wa(24, this);

    public final void B(RecyclerView recyclerView, int i) {
        int i2 = 2;
        if (this.M == 1) {
            int A = d51.A(i);
            int i3 = A != 1 ? A != 2 ? 1 : 2 : 3;
            this.Q = i3;
            zv1 zv1Var = this.G;
            if (i3 != zv1Var.e) {
                zv1Var.e = i3;
                zv1Var.G(zv1Var.A(zv1Var.h));
            }
            G(i3);
            recyclerView.i0(0);
            return;
        }
        if (i == 3) {
            return;
        }
        int i4 = i == 2 ? 2 : 1;
        this.P = i4;
        wm1 wm1Var = this.O;
        if (i4 != wm1Var.i) {
            wm1Var.i = i4;
            Collections.sort(wm1Var.f, new iy(i2, wm1Var));
            wm1Var.f();
        }
        F(i4);
        this.N.i0(0);
    }

    public final void C(int i) {
        if (this.M == i) {
            return;
        }
        this.M = i;
        boolean z = i == 2;
        this.J.setVisibility(z ? 8 : 0);
        findViewById(R.id.recycler).setVisibility(z ? 8 : 0);
        this.N.setVisibility(z ? 0 : 8);
        if (z) {
            F(this.P);
        } else {
            G(this.Q);
        }
        invalidateOptionsMenu();
        wa waVar = this.U;
        Handler handler = this.R;
        if (z) {
            if (this.S == null) {
                this.S = Executors.newSingleThreadExecutor();
            }
            ExecutorService executorService = this.S;
            if (executorService != null) {
                executorService.execute(new oo1(4, this));
            }
            this.T = true;
            handler.postDelayed(waVar, 3000L);
        } else {
            this.T = false;
            handler.removeCallbacks(waVar);
        }
        E();
    }

    public final void D(MenuItem menuItem, boolean z) {
        if (menuItem == null) {
            return;
        }
        if (z) {
            if (uz1.d(this)) {
                menuItem.setIcon(R.drawable.ic_unfold_less_24);
            } else {
                menuItem.setIcon(R.drawable.ic_unfold_less_24_dark);
            }
            menuItem.setTitle(R.string.collapse_all);
            return;
        }
        if (uz1.d(this)) {
            menuItem.setIcon(R.drawable.ic_unfold_more_24);
        } else {
            menuItem.setIcon(R.drawable.ic_unfold_more_24_dark);
        }
        menuItem.setTitle(R.string.expand_all);
    }

    public final void E() {
        wm1 wm1Var;
        zv1 zv1Var;
        if (this.K == null) {
            return;
        }
        boolean z = true;
        if (this.M != 1 ? !((wm1Var = this.O) == null || wm1Var.f.size() == 0) : !((zv1Var = this.G) == null || zv1Var.f.size() == 0)) {
            z = false;
        }
        this.K.setVisibility(z ? 0 : 8);
    }

    public final void F(int i) {
        this.H.setAlpha(i == 1 ? 1.0f : 0.6f);
        this.I.setAlpha(i == 2 ? 1.0f : 0.6f);
        Typeface b = ig1.b(this, R.font.lato);
        Typeface b2 = ig1.b(this, R.font.lato_semibold);
        this.H.setTypeface(i == 1 ? b2 : b);
        TextView textView = this.I;
        if (i == 2) {
            b = b2;
        }
        textView.setTypeface(b);
    }

    public final void G(int i) {
        this.H.setAlpha(i == 1 ? 1.0f : 0.6f);
        this.I.setAlpha(i == 3 ? 1.0f : 0.6f);
        this.J.setAlpha(i == 2 ? 1.0f : 0.6f);
        Typeface b = ig1.b(this, R.font.lato);
        Typeface b2 = ig1.b(this, R.font.lato_semibold);
        this.H.setTypeface(i == 1 ? b2 : b);
        this.I.setTypeface(i == 3 ? b2 : b);
        TextView textView = this.J;
        if (i == 2) {
            b = b2;
        }
        textView.setTypeface(b);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        pr.m(getWindow());
        setContentView(R.layout.activity_task_manager2);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.task_mgr_root);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        if (constraintLayout != null) {
            op0.a(constraintLayout, true, false, true, false, false, false);
            if (bottomNavigationView != null) {
                op0.a(bottomNavigationView, false, false, false, true, false, false);
            }
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.task_manager));
        this.H = (TextView) findViewById(R.id.sort_name);
        this.I = (TextView) findViewById(R.id.sort_mem);
        this.J = (TextView) findViewById(R.id.sort_cpu);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        s();
        getPackageManager();
        zv1 zv1Var = new zv1(this);
        this.G = zv1Var;
        recyclerView.setAdapter(zv1Var);
        final int i2 = 0;
        if (recyclerView.getItemAnimator() instanceof x10) {
            ((x10) recyclerView.getItemAnimator()).g = false;
        }
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: qv1
            public final /* synthetic */ TaskManager2Activity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                RecyclerView recyclerView2 = recyclerView;
                TaskManager2Activity taskManager2Activity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 1);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i5 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 2);
                        break;
                    default:
                        int i6 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 3);
                        break;
                }
            }
        });
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: qv1
            public final /* synthetic */ TaskManager2Activity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                RecyclerView recyclerView2 = recyclerView;
                TaskManager2Activity taskManager2Activity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 1);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i5 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 2);
                        break;
                    default:
                        int i6 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 3);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: qv1
            public final /* synthetic */ TaskManager2Activity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                RecyclerView recyclerView2 = recyclerView;
                TaskManager2Activity taskManager2Activity = this.h;
                switch (i32) {
                    case 0:
                        int i4 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 1);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i5 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 2);
                        break;
                    default:
                        int i6 = TaskManager2Activity.V;
                        taskManager2Activity.B(recyclerView2, 3);
                        break;
                }
            }
        });
        G(2);
        findViewById(R.id.sort_bar);
        findViewById(R.id.sort_divider);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recycler_services);
        this.N = recyclerView2;
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        wm1 wm1Var = new wm1(this);
        this.O = wm1Var;
        this.N.setAdapter(wm1Var);
        this.N.setHasFixedSize(false);
        BottomNavigationView bottomNavigationView2 = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView2.setSelectedItemId(R.id.nav_processes);
        bottomNavigationView2.setOnItemSelectedListener(new c71(9, this));
        this.K = (ProgressBar) findViewById(R.id.loading_progress);
        E();
        ba1 ba1Var = new ba1(this);
        this.F = ba1Var;
        ba1Var.d.e(this, new g40(i, this));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_taskmanager2, menu);
        D(menu.findItem(R.id.action_toggle_expand_all), this.L);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.S;
        if (executorService != null) {
            executorService.shutdownNow();
            this.S = null;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            k().b();
            return true;
        }
        if (itemId != R.id.action_toggle_expand_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        boolean z = this.L;
        boolean z2 = !z;
        this.L = z2;
        zv1 zv1Var = this.G;
        HashSet hashSet = zv1Var.m;
        zv1Var.l = z2;
        HashSet hashSet2 = zv1Var.g;
        if (z) {
            hashSet2.clear();
            hashSet.clear();
        } else {
            hashSet2.clear();
            for (v91 v91Var : zv1Var.h) {
                if (!hashSet.contains(Integer.valueOf(v91Var.f1075a.f1026a))) {
                    hashSet2.add(Integer.valueOf(v91Var.f1075a.f1026a));
                }
            }
            for (Integer num : zv1Var.j.keySet()) {
                if (!hashSet.contains(num) && ((v91) zv1Var.i.get(num)) != null) {
                    hashSet2.add(num);
                }
            }
        }
        zv1Var.G(zv1Var.A(zv1Var.h));
        D(menuItem, this.L);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        tl0.a("task_manager");
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.action_toggle_expand_all);
        if (findItem != null) {
            findItem.setVisible(this.M == 1);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        tl0.b(this, "task_manager");
        md2.i(this);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.F.getClass();
        ba1 ba1Var = this.F;
        if (!ba1Var.f) {
            ba1Var.f = true;
            ba1Var.m = true;
            if (ba1Var.f) {
                ba1Var.b.post(new aa1(ba1Var));
            }
        }
        if (this.M == 2) {
            if (this.S == null) {
                this.S = Executors.newSingleThreadExecutor();
            }
            ExecutorService executorService = this.S;
            if (executorService != null) {
                executorService.execute(new oo1(4, this));
            }
            this.T = true;
            this.R.postDelayed(this.U, 3000L);
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStop() {
        super.onStop();
        ba1 ba1Var = this.F;
        ba1Var.f = false;
        ba1Var.b.removeCallbacksAndMessages(null);
        this.T = false;
        this.R.removeCallbacks(this.U);
    }
}
