package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class i3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView g;
    public final /* synthetic */ m3 h;
    public final /* synthetic */ j3 i;

    public i3(j3 j3Var, AlertController$RecycleListView alertController$RecycleListView, m3 m3Var) {
        this.i = j3Var;
        this.g = alertController$RecycleListView;
        this.h = m3Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        j3 j3Var = this.i;
        boolean[] zArr = j3Var.t;
        AlertController$RecycleListView alertController$RecycleListView = this.g;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        j3Var.x.onClick(this.h.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
