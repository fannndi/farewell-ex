package flar2.devcheck.manifest;

import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.ar;
import defpackage.au0;
import defpackage.bh;
import defpackage.bj;
import defpackage.bu0;
import defpackage.c;
import defpackage.c3;
import defpackage.cu0;
import defpackage.ew0;
import defpackage.gr;
import defpackage.n72;
import defpackage.nc;
import defpackage.op0;
import defpackage.pr;
import defpackage.py0;
import defpackage.sl;
import defpackage.tc;
import defpackage.v31;
import defpackage.vq;
import defpackage.y30;
import flar2.devcheck.R;
import flar2.devcheck.manifest.ManifestActivity;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ManifestActivity extends a5 {
    public static int N;
    public RecyclerView F;
    public au0 G;
    public EditText H;
    public ImageView I;
    public TextView J;
    public ImageView K;
    public cu0 L;
    public bj M;

    @Override // defpackage.zt, android.app.Activity
    public final void onBackPressed() {
        if (!this.H.hasFocus()) {
            super.onBackPressed();
            return;
        }
        this.H.setText("");
        this.H.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.H.getWindowToken(), 0);
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.manifest_activity);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        if (coordinatorLayout != null && recyclerView != null && appBarLayout != null) {
            op0.a(coordinatorLayout, true, true, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        ((AppBarLayout) findViewById(R.id.app_bar)).setOutlineProvider(null);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i2 = typedValue.data;
        final int i3 = 0;
        boolean booleanExtra = getIntent().getBooleanExtra(gXdyRQCGVlHW.UDixkXX, false);
        ApplicationInfo applicationInfo = (ApplicationInfo) getIntent().getParcelableExtra("appinfo");
        ((ProgressBar) findViewById(R.id.progressBar)).setIndeterminateTintList(ColorStateList.valueOf(i2));
        View findViewById = findViewById(R.id.progress);
        View findViewById2 = findViewById(R.id.placeholder);
        this.F = (RecyclerView) findViewById(R.id.recyclerview);
        this.G = new au0(this);
        this.F.setLayoutManager(new LinearLayoutManager(1));
        this.F.setAdapter(this.G);
        gr grVar = new gr(this.F);
        grVar.F();
        grVar.d();
        this.H = (EditText) findViewById(R.id.search_edittext);
        ImageView imageView = (ImageView) findViewById(R.id.search_clear);
        this.I = imageView;
        imageView.setVisibility(8);
        this.K = (ImageView) findViewById(R.id.search_next);
        bj bjVar = new bj(i, this);
        this.M = bjVar;
        this.H.addTextChangedListener(bjVar);
        int i4 = 15;
        this.I.setOnClickListener(new tc(15, this));
        TextView textView = (TextView) findViewById(R.id.count);
        this.J = textView;
        textView.setVisibility(8);
        this.H.setOnFocusChangeListener(new ar(2, (FrameLayout) findViewById(R.id.toolbar_container)));
        y30 y30Var = new y30(getApplication(), applicationInfo, booleanExtra);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar2 = new gr(l, y30Var, h);
        vq a2 = af1.a(cu0.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        cu0 cu0Var = (cu0) grVar2.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.L = cu0Var;
        cu0Var.i.e(this, new v31(this) { // from class: yt0
            public final /* synthetic */ ManifestActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i5 = i3;
                ManifestActivity manifestActivity = this.b;
                switch (i5) {
                    case 0:
                        manifestActivity.G.e = (String) obj;
                        break;
                    default:
                        List list = (List) obj;
                        int i6 = ManifestActivity.N;
                        boolean isEmpty = list.isEmpty();
                        TextView textView2 = manifestActivity.J;
                        if (!isEmpty) {
                            textView2.setVisibility(0);
                            manifestActivity.J.setText((ManifestActivity.N + 1) + " " + manifestActivity.getString(R.string.of) + " " + list.size());
                            manifestActivity.K.setVisibility(0);
                            manifestActivity.K.setOnClickListener(new uc(manifestActivity, 11, list));
                            break;
                        } else {
                            textView2.setVisibility(8);
                            manifestActivity.K.setVisibility(8);
                            ManifestActivity.N = 0;
                            break;
                        }
                }
            }
        });
        this.L.j.e(this, new v31(this) { // from class: yt0
            public final /* synthetic */ ManifestActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i5 = i;
                ManifestActivity manifestActivity = this.b;
                switch (i5) {
                    case 0:
                        manifestActivity.G.e = (String) obj;
                        break;
                    default:
                        List list = (List) obj;
                        int i6 = ManifestActivity.N;
                        boolean isEmpty = list.isEmpty();
                        TextView textView2 = manifestActivity.J;
                        if (!isEmpty) {
                            textView2.setVisibility(0);
                            manifestActivity.J.setText((ManifestActivity.N + 1) + " " + manifestActivity.getString(R.string.of) + " " + list.size());
                            manifestActivity.K.setVisibility(0);
                            manifestActivity.K.setOnClickListener(new uc(manifestActivity, 11, list));
                            break;
                        } else {
                            textView2.setVisibility(8);
                            manifestActivity.K.setVisibility(8);
                            ManifestActivity.N = 0;
                            break;
                        }
                }
            }
        });
        cu0 cu0Var2 = this.L;
        if (cu0Var2.c == null) {
            ew0 ew0Var = new ew0(0);
            cu0Var2.c = ew0Var;
            ew0Var.l(cu0Var2.i, new nc(i4, cu0Var2));
            cu0Var2.f.submit(new bu0(cu0Var2, 0));
        }
        cu0Var2.c.e(this, new bh(3, this, findViewById, findViewById2));
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.L.i.k(ILBLnlCHDVqsSN.TRnGCJi);
    }

    @Override // defpackage.a5
    public final boolean z() {
        onBackPressed();
        return true;
    }
}
