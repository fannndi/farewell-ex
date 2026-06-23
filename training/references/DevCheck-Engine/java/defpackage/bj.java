package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import flar2.devcheck.manifest.ManifestActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class bj implements TextWatcher {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bj(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.g) {
            case 0:
                cj cjVar = (cj) this.h;
                l2 l2Var = cjVar.v0;
                Handler handler = cjVar.d0;
                String obj = editable == null ? "" : editable.toString();
                cjVar.u0 = obj;
                cjVar.C0(obj);
                handler.removeCallbacks(l2Var);
                handler.postDelayed(l2Var, 300L);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.g;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.g;
        int i5 = 0;
        Object obj = this.h;
        switch (i4) {
            case 0:
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ManifestActivity.N = 0;
                ManifestActivity manifestActivity = (ManifestActivity) obj;
                manifestActivity.L.i.k(charSequence.toString());
                boolean isEmpty = charSequence.toString().isEmpty();
                ImageView imageView = manifestActivity.I;
                if (!isEmpty) {
                    imageView.setVisibility(0);
                    break;
                } else {
                    imageView.setVisibility(8);
                    break;
                }
            default:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.v.getText();
                searchView.g0 = text;
                boolean isEmpty2 = TextUtils.isEmpty(text);
                searchView.v(!isEmpty2);
                if (searchView.e0 && !searchView.U && isEmpty2) {
                    searchView.A.setVisibility(8);
                } else {
                    i5 = 8;
                }
                searchView.C.setVisibility(i5);
                searchView.r();
                searchView.u();
                if (searchView.Q != null && !TextUtils.equals(charSequence, searchView.f0)) {
                    cl1 cl1Var = searchView.Q;
                    String charSequence2 = charSequence.toString();
                    w7 w7Var = (w7) cl1Var;
                    w7Var.getClass();
                    try {
                        w7Var.k0.f.k(charSequence2);
                    } catch (NullPointerException unused) {
                    }
                }
                searchView.f0 = charSequence.toString();
                break;
        }
    }
}
