package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class h3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ m3 g;
    public final /* synthetic */ j3 h;

    public h3(j3 j3Var, m3 m3Var) {
        this.h = j3Var;
        this.g = m3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        j3 j3Var = this.h;
        DialogInterface.OnClickListener onClickListener = j3Var.r;
        m3 m3Var = this.g;
        onClickListener.onClick(m3Var.b, i);
        if (j3Var.v) {
            return;
        }
        m3Var.b.dismiss();
    }
}
