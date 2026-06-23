package flar2.devcheck.taskmgr;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.c3;
import defpackage.ca1;
import defpackage.g40;
import defpackage.ig1;
import defpackage.md2;
import defpackage.op0;
import defpackage.pr;
import defpackage.r91;
import defpackage.sl;
import defpackage.uz1;
import defpackage.x10;
import defpackage.z91;
import defpackage.zv1;
import flar2.devcheck.R;
import flar2.devcheck.taskmgr.TaskManagerActivity;
import java.util.HashSet;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class TaskManagerActivity extends a5 {
    public ca1 F;
    public zv1 G;
    public TextView H;
    public TextView I;
    public TextView J;
    public boolean K = false;

    public final void B(MenuItem menuItem, boolean z) {
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

    public final void C(int i) {
        this.H.setAlpha(i == 1 ? 1.0f : 0.6f);
        this.I.setAlpha(i == 3 ? 1.0f : 0.6f);
        this.J.setAlpha(i == 2 ? 1.0f : 0.6f);
        Typeface b = ig1.b(this, R.font.lato_semibold);
        Typeface b2 = ig1.b(this, R.font.lato);
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
        setContentView(R.layout.activity_task_manager);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.task_mgr_root);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        if (constraintLayout != null && recyclerView != null) {
            op0.a(constraintLayout, true, false, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
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
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recycler);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        zv1 zv1Var = new zv1(s(), getPackageManager());
        this.G = zv1Var;
        recyclerView2.setAdapter(zv1Var);
        final int i2 = 0;
        if (recyclerView2.getItemAnimator() instanceof x10) {
            ((x10) recyclerView2.getItemAnimator()).g = false;
        }
        recyclerView2.setItemAnimator(null);
        recyclerView2.setHasFixedSize(true);
        this.H.setOnClickListener(new View.OnClickListener(this) { // from class: aw1
            public final /* synthetic */ TaskManagerActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                TaskManagerActivity taskManagerActivity = this.h;
                switch (i3) {
                    case 0:
                        taskManagerActivity.G.H(1);
                        taskManagerActivity.C(1);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        taskManagerActivity.G.H(3);
                        taskManagerActivity.C(3);
                        break;
                    default:
                        taskManagerActivity.G.H(2);
                        taskManagerActivity.C(2);
                        break;
                }
            }
        });
        this.I.setOnClickListener(new View.OnClickListener(this) { // from class: aw1
            public final /* synthetic */ TaskManagerActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                TaskManagerActivity taskManagerActivity = this.h;
                switch (i3) {
                    case 0:
                        taskManagerActivity.G.H(1);
                        taskManagerActivity.C(1);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        taskManagerActivity.G.H(3);
                        taskManagerActivity.C(3);
                        break;
                    default:
                        taskManagerActivity.G.H(2);
                        taskManagerActivity.C(2);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: aw1
            public final /* synthetic */ TaskManagerActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                TaskManagerActivity taskManagerActivity = this.h;
                switch (i32) {
                    case 0:
                        taskManagerActivity.G.H(1);
                        taskManagerActivity.C(1);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        taskManagerActivity.G.H(3);
                        taskManagerActivity.C(3);
                        break;
                    default:
                        taskManagerActivity.G.H(2);
                        taskManagerActivity.C(2);
                        break;
                }
            }
        });
        C(1);
        ca1 ca1Var = new ca1(this);
        this.F = ca1Var;
        ca1Var.e.e(this, new g40(i3, this));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_taskmanager, menu);
        B(menu.findItem(R.id.action_toggle_expand_all), this.K);
        return true;
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
        boolean z = this.K;
        boolean z2 = !z;
        this.K = z2;
        zv1 zv1Var = this.G;
        HashSet hashSet = zv1Var.m;
        zv1Var.l = z2;
        HashSet hashSet2 = zv1Var.g;
        if (z) {
            hashSet2.clear();
            hashSet.clear();
        } else {
            hashSet2.clear();
            for (r91 r91Var : zv1Var.h) {
                if (!hashSet.contains(Integer.valueOf(r91Var.f878a.f827a))) {
                    hashSet2.add(Integer.valueOf(r91Var.f878a.f827a));
                }
            }
            for (Integer num : zv1Var.j.keySet()) {
                if (!hashSet.contains(num) && ((r91) zv1Var.i.get(num)) != null) {
                    hashSet2.add(num);
                }
            }
        }
        zv1Var.F(zv1Var.z(zv1Var.h));
        B(menuItem, this.K);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        md2.i(this);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.F.getClass();
        ca1 ca1Var = this.F;
        if (ca1Var.g) {
            return;
        }
        ca1Var.g = true;
        if (ca1Var.g) {
            ca1Var.c.post(new z91(ca1Var));
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStop() {
        super.onStop();
        ca1 ca1Var = this.F;
        ca1Var.g = false;
        ca1Var.c.removeCallbacksAndMessages(null);
    }
}
