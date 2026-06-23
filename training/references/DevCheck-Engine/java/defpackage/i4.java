package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class i4 extends r52 implements Animatable {
    public final Context i;
    public r1 j = null;
    public ArrayList k = null;
    public final e4 l = new e4(this);
    public final f4 h = new f4();

    public i4(Context context) {
        this.i = context;
    }

    @Override // defpackage.r52, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        f4 f4Var = this.h;
        f4Var.f260a.draw(canvas);
        if (f4Var.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getAlpha() : this.h.f260a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.h.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getColorFilter() : this.h.f260a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.g != null) {
            return new g4(this.g.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getIntrinsicHeight() : this.h.f260a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getIntrinsicWidth() : this.h.f260a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getOpacity() : this.h.f260a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        if (r3.b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        r3.b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c6, code lost:
    
        r3.b.playTogether(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cd, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.g
            if (r0 == 0) goto L8
            r0.inflate(r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            f4 r3 = r8.h
            if (r0 == r2) goto Lbb
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lbb
        L1f:
            r4 = 2
            if (r0 != r4) goto Lb5
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L5d
            int[] r0 = defpackage.sl.l
            android.content.res.TypedArray r0 = defpackage.op0.F(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L59
            a62 r6 = new a62
            r6.<init>()
            java.lang.ThreadLocal r7 = defpackage.ig1.f428a
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r4, r12)
            r6.g = r4
            r6.l = r5
            e4 r4 = r8.l
            r6.setCallback(r4)
            a62 r4 = r3.f260a
            if (r4 == 0) goto L57
            r5 = 0
            r4.setCallback(r5)
        L57:
            r3.f260a = r6
        L59:
            r0.recycle()
            goto Lb5
        L5d:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb5
            int[] r0 = defpackage.sl.m
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r6 = r0.getResourceId(r2, r5)
            if (r6 == 0) goto Lb2
            android.content.Context r7 = r8.i
            if (r7 == 0) goto La9
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            a62 r7 = r3.f260a
            y52 r7 = r7.h
            x52 r7 = r7.b
            p9 r7 = r7.o
            java.lang.Object r7 = r7.get(r4)
            r6.setTarget(r7)
            java.util.ArrayList r7 = r3.c
            if (r7 != 0) goto L9e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.c = r7
            p9 r7 = new p9
            r7.<init>(r5)
            r3.d = r7
        L9e:
            java.util.ArrayList r5 = r3.c
            r5.add(r6)
            p9 r3 = r3.d
            r3.put(r6, r4)
            goto Lb2
        La9:
            r0.recycle()
            java.lang.String r8 = "Context can't be null when inflating animators"
            defpackage.c.n(r8)
            return
        Lb2:
            r0.recycle()
        Lb5:
            int r0 = r10.next()
            goto L12
        Lbb:
            android.animation.AnimatorSet r8 = r3.b
            if (r8 != 0) goto Lc6
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r3.b = r8
        Lc6:
            android.animation.AnimatorSet r8 = r3.b
            java.util.ArrayList r9 = r3.c
            r8.playTogether(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.isAutoMirrored() : this.h.f260a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.g;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.h.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.isStateful() : this.h.f260a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.h.f260a.setBounds(rect);
        }
    }

    @Override // defpackage.r52, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.g;
        return drawable != null ? drawable.setLevel(i) : this.h.f260a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.g;
        return drawable != null ? drawable.setState(iArr) : this.h.f260a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.h.f260a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.h.f260a.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.h.f260a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.h.f260a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.h.f260a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.h.f260a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.h.f260a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        f4 f4Var = this.h;
        if (f4Var.b.isStarted()) {
            return;
        }
        f4Var.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.h.b.end();
        }
    }
}
