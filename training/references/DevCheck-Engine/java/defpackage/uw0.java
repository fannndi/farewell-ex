package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class uw0 extends FrameLayout implements qr {
    public final CollapsibleActionView g;

    /* JADX WARN: Multi-variable type inference failed */
    public uw0(View view) {
        super(view.getContext());
        this.g = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.qr
    public final void onActionViewCollapsed() {
        this.g.onActionViewCollapsed();
    }

    @Override // defpackage.qr
    public final void onActionViewExpanded() {
        this.g.onActionViewExpanded();
    }
}
