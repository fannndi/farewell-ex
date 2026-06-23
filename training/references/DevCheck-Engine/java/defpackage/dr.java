package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class dr extends b90 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final tc j;
    public final ar k;
    public AnimatorSet l;
    public ValueAnimator m;

    public dr(a90 a90Var) {
        super(a90Var);
        this.j = new tc(6, this);
        this.k = new ar(0, this);
        this.e = kk1.J(a90Var.getContext(), R.attr.motionDurationShort3, 100);
        this.f = kk1.J(a90Var.getContext(), R.attr.motionDurationShort3, 150);
        this.g = kk1.K(a90Var.getContext(), R.attr.motionEasingLinearInterpolator, o4.f715a);
        this.h = kk1.K(a90Var.getContext(), R.attr.motionEasingEmphasizedInterpolator, o4.d);
    }

    @Override // defpackage.b90
    public final void a() {
        if (this.b.v != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.b90
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.b90
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.b90
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.b90
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.b90
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.b90
    public final void l(EditText editText) {
        this.i = editText;
        this.f71a.setEndIconVisible(t());
    }

    @Override // defpackage.b90
    public final void o(boolean z) {
        if (this.b.v == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.b90
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: br
            public final /* synthetic */ dr b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                dr drVar = this.b;
                switch (i2) {
                    case 0:
                        drVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = drVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: br
            public final /* synthetic */ dr b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                dr drVar = this.b;
                switch (i22) {
                    case 0:
                        drVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = drVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new cr(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: br
            public final /* synthetic */ dr b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                dr drVar = this.b;
                switch (i22) {
                    case 0:
                        drVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = drVar.d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new cr(this, i));
    }

    @Override // defpackage.b90
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new l2(24, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.d.hasFocus()) && ((this.i.getText().length() > 0) || (this.b.v != null));
    }
}
