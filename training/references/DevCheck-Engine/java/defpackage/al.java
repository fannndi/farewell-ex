package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import flar2.devcheck.R;
import flar2.devcheck.bottomDrawer.BottomDrawer;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public final Context f35a;
    public final bl b;
    public BottomSheetBehavior c;
    public BottomDrawer d;
    public CoordinatorLayout e;
    public float g;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final boolean h = true;

    public al(Context context, bl blVar) {
        this.f35a = context;
        this.b = blVar;
    }

    public final BottomDrawer a() {
        BottomDrawer bottomDrawer = this.d;
        if (bottomDrawer != null) {
            return bottomDrawer;
        }
        ym0.A(bPnJ.taH);
        throw null;
    }

    public final void b() {
        float f = this.g;
        CoordinatorLayout coordinatorLayout = this.e;
        if (f <= 1.0f) {
            if (coordinatorLayout == null) {
                ym0.A("coordinator");
                throw null;
            }
            Drawable background = coordinatorLayout.getBackground();
            if (background != null) {
                background.setAlpha((int) (255.0f * this.g));
                return;
            }
            return;
        }
        if (coordinatorLayout == null) {
            ym0.A("coordinator");
            throw null;
        }
        Drawable background2 = coordinatorLayout.getBackground();
        if (background2 != null) {
            background2.setAlpha(255);
        }
    }

    public final FrameLayout c(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Context context = this.f35a;
        View inflate = View.inflate(context, R.layout.bottom_drawer_layout, null);
        inflate.getClass();
        FrameLayout frameLayout = (FrameLayout) inflate;
        View findViewById = frameLayout.findViewById(R.id.bottom_sheet_coordinator);
        findViewById.getClass();
        this.e = (CoordinatorLayout) findViewById;
        if (i != 0 && view == null) {
            LayoutInflater from = LayoutInflater.from(context);
            CoordinatorLayout coordinatorLayout = this.e;
            if (coordinatorLayout == null) {
                ym0.A("coordinator");
                throw null;
            }
            view = from.inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        CoordinatorLayout coordinatorLayout2 = this.e;
        if (coordinatorLayout2 == null) {
            ym0.A("coordinator");
            throw null;
        }
        View findViewById2 = coordinatorLayout2.findViewById(R.id.bottom_sheet_drawer);
        findViewById2.getClass();
        this.d = (BottomDrawer) findViewById2;
        BottomSheetBehavior E = BottomSheetBehavior.E(a());
        this.c = E;
        E.O(5);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        BottomSheetBehavior bottomSheetBehavior = this.c;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(displayMetrics.heightPixels / 2);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.c;
        int i2 = 1;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.M(true);
        }
        BottomSheetBehavior bottomSheetBehavior3 = this.c;
        bottomSheetBehavior3.getClass();
        bottomSheetBehavior3.l = uz1.l(context, 640.0f);
        if (layoutParams == null) {
            a().addView(view);
        } else {
            a().addView(view, layoutParams);
        }
        a();
        CoordinatorLayout coordinatorLayout3 = this.e;
        if (coordinatorLayout3 == null) {
            ym0.A("coordinator");
            throw null;
        }
        coordinatorLayout3.getBackground().setAlpha((int) this.g);
        BottomSheetBehavior bottomSheetBehavior4 = this.c;
        if (bottomSheetBehavior4 != null) {
            zk zkVar = new zk(0, this);
            ArrayList arrayList = bottomSheetBehavior4.c0;
            if (!arrayList.contains(zkVar)) {
                arrayList.add(zkVar);
            }
        }
        yk ykVar = new yk();
        ykVar.f1235a = new xk(this, 0);
        ykVar.b = new xk(this, 1);
        this.f.add(ykVar);
        CoordinatorLayout coordinatorLayout4 = this.e;
        if (coordinatorLayout4 == null) {
            ym0.A("coordinator");
            throw null;
        }
        coordinatorLayout4.findViewById(R.id.touch_outside).setOnClickListener(new tc(4, this));
        y62.o(a(), new le(i2, this));
        a().setOnTouchListener(new wk());
        return frameLayout;
    }
}
