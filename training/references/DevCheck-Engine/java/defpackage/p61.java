package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class p61 extends ld0 implements u61 {
    public ImageView d0;
    public ImageView e0;
    public EditText f0;
    public View g0;
    public boolean h0;
    public final vc i0 = new vc(8, this);

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.h0 = bundle2.getBoolean("allPerms");
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.permissions_search_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        u8 u8Var = new u8(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom(), 7);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(recyclerView, u8Var);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(s61.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        s61 s61Var = (s61) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        qy0 qy0Var = s61Var.j;
        if (this.h0) {
            qy0Var.k("*");
        } else {
            qy0Var.k("");
        }
        EditText editText = (EditText) inflate.findViewById(R.id.search_edittext);
        this.f0 = editText;
        editText.setHint(g0().getString(R.string.search_permissions));
        this.d0 = (ImageView) inflate.findViewById(R.id.search_clear);
        this.e0 = (ImageView) inflate.findViewById(R.id.back_icon);
        this.d0.setVisibility(8);
        this.f0.setVisibility(0);
        this.g0 = inflate.findViewById(R.id.progressbar);
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: m61
            public final /* synthetic */ p61 h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                p61 p61Var = this.h;
                switch (i2) {
                    case 0:
                        if (p61Var.f0.getText().length() <= 0) {
                            p61Var.i0.a();
                            break;
                        } else {
                            p61Var.f0.clearFocus();
                            p61Var.f0.setText("");
                            InputMethodManager inputMethodManager = (InputMethodManager) p61Var.i0().getApplicationContext().getSystemService("input_method");
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(p61Var.f0.getWindowToken(), 0);
                                break;
                            }
                        }
                        break;
                    default:
                        p61Var.f0.setText("");
                        break;
                }
            }
        });
        this.f0.addTextChangedListener(new o61(this, s61Var));
        final int i2 = 1;
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: m61
            public final /* synthetic */ p61 h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                p61 p61Var = this.h;
                switch (i22) {
                    case 0:
                        if (p61Var.f0.getText().length() <= 0) {
                            p61Var.i0.a();
                            break;
                        } else {
                            p61Var.f0.clearFocus();
                            p61Var.f0.setText("");
                            InputMethodManager inputMethodManager = (InputMethodManager) p61Var.i0().getApplicationContext().getSystemService("input_method");
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(p61Var.f0.getWindowToken(), 0);
                                break;
                            }
                        }
                        break;
                    default:
                        p61Var.f0.setText("");
                        break;
                }
            }
        });
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        x61 x61Var = new x61(g0(), new ArrayList(), this);
        recyclerView2.setAdapter(x61Var);
        gr grVar2 = new gr(recyclerView2);
        grVar2.F();
        grVar2.d();
        s61Var.c.e(D(), new rn(this, 2, x61Var));
        qy0Var.e(D(), new nc(22, x61Var));
        if (!this.h0) {
            this.f0.requestFocus();
            this.f0.postDelayed(new n61(this, 0), 100L);
        }
        return inflate;
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
    }

    @Override // defpackage.u61
    public final void p(String str, HashMap hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putSerializable("appPermissionMap", hashMap);
        ae0 s = t().s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ybVar.k(v8.class, bundle);
        ybVar.c(str);
        ybVar.e(false);
    }
}
