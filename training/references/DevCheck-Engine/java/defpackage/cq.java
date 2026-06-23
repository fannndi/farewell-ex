package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class cq extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f148a;

    public cq(Chip chip) {
        this.f148a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        fq fqVar = this.f148a.k;
        if (fqVar != null) {
            fqVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
