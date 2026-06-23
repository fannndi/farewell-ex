package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e4 implements Drawable.Callback {
    public final /* synthetic */ i4 g;

    public e4(i4 i4Var) {
        this.g = i4Var;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.g.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.g.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.g.unscheduleSelf(runnable);
    }
}
