package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class f5 extends CheckedTextView {
    public final g5 g;
    public final w2 h;
    public final g7 i;
    public h6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f5(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            defpackage.ez1.a(r9)
            r5 = 2130968799(0x7f0400df, float:1.7546262E38)
            r8.<init>(r9, r10, r5)
            android.content.Context r9 = r8.getContext()
            defpackage.by1.a(r8, r9)
            g7 r9 = new g7
            r9.<init>(r8)
            r8.i = r9
            r9.f(r10, r5)
            r9.b()
            w2 r9 = new w2
            r9.<init>(r8)
            r8.h = r9
            r9.k(r10, r5)
            g5 r9 = new g5
            r9.<init>(r8)
            r8.g = r9
            android.content.Context r9 = r8.getContext()
            r6 = 0
            int[] r2 = defpackage.zb1.l
            fh r9 = defpackage.fh.G(r5, r6, r9, r10, r2)
            java.lang.Object r0 = r9.i
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.i
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r3 = r10
            defpackage.y62.n(r0, r1, r2, r3, r4, r5)
            r8 = 1
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L68
            int r8 = r7.getResourceId(r8, r6)     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L68
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            android.graphics.drawable.Drawable r8 = defpackage.k32.x(r10, r8)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            goto L7f
        L65:
            r0 = move-exception
            r8 = r0
            goto Lac
        L68:
            boolean r8 = r7.hasValue(r6)     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L7f
            int r8 = r7.getResourceId(r6, r6)     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L7f
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L65
            android.graphics.drawable.Drawable r8 = defpackage.k32.x(r10, r8)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L65
        L7f:
            r8 = 2
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto L8d
            android.content.res.ColorStateList r8 = r9.v(r8)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkTintList(r8)     // Catch: java.lang.Throwable -> L65
        L8d:
            r8 = 3
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L65
            if (r10 == 0) goto La1
            r10 = -1
            int r8 = r7.getInt(r8, r10)     // Catch: java.lang.Throwable -> L65
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = defpackage.z50.c(r8, r10)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkTintMode(r8)     // Catch: java.lang.Throwable -> L65
        La1:
            r9.L()
            h6 r8 = r0.getEmojiTextViewHelper()
            r8.b(r3, r5)
            return
        Lac:
            r9.L()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private h6 getEmojiTextViewHelper() {
        if (this.j == null) {
            this.j = new h6(this);
        }
        return this.j;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.b();
        }
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.a();
        }
        g5 g5Var = this.g;
        if (g5Var != null) {
            g5Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return rt0.L(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        w2 w2Var = this.h;
        if (w2Var != null) {
            return w2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w2 w2Var = this.h;
        if (w2Var != null) {
            return w2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g5 g5Var = this.g;
        if (g5Var != null) {
            return g5Var.f319a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        g5 g5Var = this.g;
        if (g5Var != null) {
            return g5Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.i.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        op0.G(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(k32.x(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g5 g5Var = this.g;
        if (g5Var != null) {
            if (g5Var.e) {
                g5Var.e = false;
            } else {
                g5Var.e = true;
                g5Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(rt0.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w2 w2Var = this.h;
        if (w2Var != null) {
            w2Var.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g5 g5Var = this.g;
        if (g5Var != null) {
            g5Var.f319a = colorStateList;
            g5Var.c = true;
            g5Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g5 g5Var = this.g;
        if (g5Var != null) {
            g5Var.b = mode;
            g5Var.d = true;
            g5Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        g7 g7Var = this.i;
        g7Var.l(colorStateList);
        g7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        g7 g7Var = this.i;
        g7Var.m(mode);
        g7Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        g7 g7Var = this.i;
        if (g7Var != null) {
            g7Var.g(context, i);
        }
    }
}
