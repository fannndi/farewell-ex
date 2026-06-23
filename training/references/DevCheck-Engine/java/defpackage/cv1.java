package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class cv1 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f156a;
    public int b;
    public View c;
    public TabLayout d;
    public fv1 e;

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence)) {
            this.e.setContentDescription(charSequence);
        }
        this.f156a = charSequence;
        fv1 fv1Var = this.e;
        if (fv1Var != null) {
            fv1Var.d();
        }
    }
}
