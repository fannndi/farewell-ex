package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g4 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f316a;

    public g4(Drawable.ConstantState constantState) {
        this.f316a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f316a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f316a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        i4 i4Var = new i4(null);
        Drawable newDrawable = this.f316a.newDrawable();
        i4Var.g = newDrawable;
        newDrawable.setCallback(i4Var.l);
        return i4Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        i4 i4Var = new i4(null);
        Drawable newDrawable = this.f316a.newDrawable(resources);
        i4Var.g = newDrawable;
        newDrawable.setCallback(i4Var.l);
        return i4Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        i4 i4Var = new i4(null);
        Drawable newDrawable = this.f316a.newDrawable(resources, theme);
        i4Var.g = newDrawable;
        newDrawable.setCallback(i4Var.l);
        return i4Var;
    }
}
