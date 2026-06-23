package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class rg implements wg, m1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ rg(int i, dn dnVar) {
        this.g = i;
        this.h = dnVar;
    }

    public /* synthetic */ rg(SideSheetBehavior sideSheetBehavior, int i) {
        this.h = sideSheetBehavior;
        this.g = i;
    }

    @Override // defpackage.m1
    public boolean b(View view) {
        ((SideSheetBehavior) this.h).w(this.g);
        return true;
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        dn dnVar = (dn) this.h;
        miVar.f634a = this.g;
        miVar.r = dnVar;
        miVar.o = 0;
        miVar.h = null;
        miVar.i = null;
        miVar.j = null;
        miVar.k = -1;
        miVar.l = 0;
        int i = miVar.g;
        miVar.d = null;
        miVar.e = null;
        miVar.f = -1;
        miVar.g = i;
    }
}
