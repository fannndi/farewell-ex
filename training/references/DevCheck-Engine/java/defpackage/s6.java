package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class s6 implements y6, DialogInterface.OnClickListener {
    public n3 g;
    public t6 h;
    public CharSequence i;
    public final /* synthetic */ z6 j;

    public s6(z6 z6Var) {
        this.j = z6Var;
    }

    @Override // defpackage.y6
    public final boolean b() {
        n3 n3Var = this.g;
        if (n3Var != null) {
            return n3Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.y6
    public final int c() {
        return 0;
    }

    @Override // defpackage.y6
    public final void dismiss() {
        n3 n3Var = this.g;
        if (n3Var != null) {
            n3Var.dismiss();
            this.g = null;
        }
    }

    @Override // defpackage.y6
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.y6
    public final void g(CharSequence charSequence) {
        this.i = charSequence;
    }

    @Override // defpackage.y6
    public final void h(Drawable drawable) {
    }

    @Override // defpackage.y6
    public final void j(int i) {
    }

    @Override // defpackage.y6
    public final void k(int i) {
    }

    @Override // defpackage.y6
    public final void l(int i) {
    }

    @Override // defpackage.y6
    public final void m(int i, int i2) {
        if (this.h == null) {
            return;
        }
        z6 z6Var = this.j;
        th2 th2Var = new th2(z6Var.getPopupContext());
        j3 j3Var = (j3) th2Var.h;
        CharSequence charSequence = this.i;
        if (charSequence != null) {
            j3Var.e = charSequence;
        }
        t6 t6Var = this.h;
        int selectedItemPosition = z6Var.getSelectedItemPosition();
        j3Var.q = t6Var;
        j3Var.r = this;
        j3Var.w = selectedItemPosition;
        j3Var.v = true;
        n3 a2 = th2Var.a();
        this.g = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.l.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.g.show();
    }

    @Override // defpackage.y6
    public final int n() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        z6 z6Var = this.j;
        z6Var.setSelection(i);
        if (z6Var.getOnItemClickListener() != null) {
            z6Var.performItemClick(null, i, this.h.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.y6
    public final CharSequence p() {
        return this.i;
    }

    @Override // defpackage.y6
    public final void q(ListAdapter listAdapter) {
        this.h = (t6) listAdapter;
    }
}
