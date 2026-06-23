package flar2.devcheck;

import android.R;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.n72;
import defpackage.p62;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sl;
import defpackage.u7;
import defpackage.u8;
import defpackage.uz1;
import defpackage.v31;
import defpackage.vq;
import defpackage.wt0;
import defpackage.y62;
import flar2.devcheck.PaywallActivity;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class PaywallActivity extends a5 {
    public static final /* synthetic */ int R = 0;
    public MaterialCardView F;
    public MaterialCardView G;
    public MaterialCardView H;
    public MaterialButton I;
    public MaterialButton J;
    public MaterialButton K;
    public MaterialButton L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public wt0 Q;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_paywall);
        pr.m(getWindow());
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.paywall_root);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.scroll_view);
        int paddingStart = coordinatorLayout.getPaddingStart();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingEnd = coordinatorLayout.getPaddingEnd();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int paddingStart2 = nestedScrollView.getPaddingStart();
        int paddingTop2 = nestedScrollView.getPaddingTop();
        int paddingEnd2 = nestedScrollView.getPaddingEnd();
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        u8 u8Var = new u8(paddingStart, paddingTop, paddingEnd, paddingBottom, 5);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(coordinatorLayout, u8Var);
        p62.c(nestedScrollView, new u8(paddingStart2, paddingTop2, paddingEnd2, paddingBottom2, 6));
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar);
        A(materialToolbar);
        final int i = 1;
        if (r() != null) {
            r().j0(true);
        }
        final int i2 = 0;
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: g61
            public final /* synthetic */ PaywallActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                PaywallActivity paywallActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = PaywallActivity.R;
                        paywallActivity.finish();
                        break;
                    default:
                        paywallActivity.Q.b.f792a.m();
                        break;
                }
            }
        });
        sl r = r();
        Objects.requireNonNull(r);
        r.m0("");
        getWindow().setStatusBarColor(getColor(R.color.transparent));
        getWindow().setNavigationBarColor(getColor(R.color.transparent));
        this.F = (MaterialCardView) findViewById(R.id.card_monthly);
        this.G = (MaterialCardView) findViewById(R.id.card_yearly);
        this.H = (MaterialCardView) findViewById(R.id.card_lifetime);
        this.I = (MaterialButton) findViewById(R.id.button_start_trial);
        this.J = (MaterialButton) findViewById(R.id.button_choose_yearly);
        this.K = (MaterialButton) findViewById(R.id.button_choose_lifetime);
        this.L = (MaterialButton) findViewById(R.id.button_restore);
        this.M = (TextView) findViewById(R.id.monthly_title);
        this.N = (TextView) findViewById(R.id.monthly_price_line);
        this.O = (TextView) findViewById(R.id.yearly_subtitle);
        this.P = (TextView) findViewById(R.id.lifetime_header);
        String string = getString(R.string.loading);
        this.N.setText(string);
        this.O.setText(string);
        this.P.setText(string);
        this.I.setEnabled(false);
        this.J.setEnabled(false);
        this.K.setEnabled(false);
        this.F.setEnabled(false);
        this.G.setEnabled(false);
        this.H.setEnabled(false);
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 1);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(wt0.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        wt0 wt0Var = (wt0) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.Q = wt0Var;
        this.j.a(wt0Var.b.f792a);
        this.Q.b.f792a.d().e(this, new u7(4));
        this.Q.d("devcheck.monthly").e(this, new v31(this) { // from class: f61
            public final /* synthetic */ PaywallActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
            @Override // defpackage.v31
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 408
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.f61.a(java.lang.Object):void");
            }
        });
        this.Q.d("devcheck.annual").e(this, new v31(this) { // from class: f61
            public final /* synthetic */ PaywallActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                /*
                    Method dump skipped, instructions count: 408
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.f61.a(java.lang.Object):void");
            }
        });
        final int i3 = 2;
        this.Q.d("devcheck.lifetime").e(this, new v31(this) { // from class: f61
            public final /* synthetic */ PaywallActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                /*
                    Method dump skipped, instructions count: 408
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.f61.a(java.lang.Object):void");
            }
        });
        this.L.setOnClickListener(new View.OnClickListener(this) { // from class: g61
            public final /* synthetic */ PaywallActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i;
                PaywallActivity paywallActivity = this.h;
                switch (i32) {
                    case 0:
                        int i4 = PaywallActivity.R;
                        paywallActivity.finish();
                        break;
                    default:
                        paywallActivity.Q.b.f792a.m();
                        break;
                }
            }
        });
        String str = uz1.f1060a;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return;
                }
            }
            Toast.makeText(this, getString(R.string.check_network), 0).show();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_paywall, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_manage_subscriptions) {
            return super.onOptionsItemSelected(menuItem);
        }
        uz1.m0(this);
        return true;
    }
}
