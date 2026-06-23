package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ky0 implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ly0 f557a;

    public ky0(ly0 ly0Var) {
        this.f557a = ly0Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        ly0 ly0Var = this.f557a;
        HashSet hashSet = ly0Var.B0;
        boolean z2 = ly0Var.C0;
        if (z) {
            ly0Var.C0 = hashSet.add(ly0Var.E0[i].toString()) | z2;
        } else {
            ly0Var.C0 = hashSet.remove(ly0Var.E0[i].toString()) | z2;
        }
    }
}
