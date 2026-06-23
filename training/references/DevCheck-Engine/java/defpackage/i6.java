package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class i6 extends ImageButton {
    public final w2 g;
    public final rg1 h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ez1.a(context);
        this.i = false;
        by1.a(this, getContext());
        w2 w2Var = new w2(this);
        this.g = w2Var;
        w2Var.k(attributeSet, i);
        rg1 rg1Var = new rg1(this);
        this.h = rg1Var;
        rg1Var.f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.a();
        }
        rg1 rg1Var = this.h;
        if (rg1Var != null) {
            rg1Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        w2 w2Var = this.g;
        if (w2Var != null) {
            return w2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w2 w2Var = this.g;
        if (w2Var != null) {
            return w2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        wu wuVar;
        rg1 rg1Var = this.h;
        if (rg1Var == null || (wuVar = (wu) rg1Var.d) == null) {
            return null;
        }
        return (ColorStateList) wuVar.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        wu wuVar;
        rg1 rg1Var = this.h;
        if (rg1Var == null || (wuVar = (wu) rg1Var.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) wuVar.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.h.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        rg1 rg1Var = this.h;
        if (rg1Var != null) {
            rg1Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        rg1 rg1Var = this.h;
        if (rg1Var != null && drawable != null && !this.i) {
            rg1Var.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (rg1Var != null) {
            rg1Var.a();
            if (this.i) {
                return;
            }
            ImageView imageView = (ImageView) rg1Var.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(rg1Var.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        rg1 rg1Var = this.h;
        ImageView imageView = (ImageView) rg1Var.c;
        if (i != 0) {
            Drawable x = k32.x(imageView.getContext(), i);
            if (x != null) {
                z50.a(x);
            }
            imageView.setImageDrawable(x);
        } else {
            imageView.setImageDrawable(null);
        }
        rg1Var.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        rg1 rg1Var = this.h;
        if (rg1Var != null) {
            rg1Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        rg1 rg1Var = this.h;
        if (rg1Var != null) {
            if (((wu) rg1Var.d) == null) {
                rg1Var.d = new wu();
            }
            wu wuVar = (wu) rg1Var.d;
            wuVar.c = colorStateList;
            wuVar.b = true;
            rg1Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        rg1 rg1Var = this.h;
        if (rg1Var != null) {
            if (((wu) rg1Var.d) == null) {
                rg1Var.d = new wu();
            }
            wu wuVar = (wu) rg1Var.d;
            wuVar.d = mode;
            wuVar.f1148a = true;
            rg1Var.a();
        }
    }
}
