package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class g6 extends EditText implements u41 {
    public final w2 g;
    public final g7 h;
    public final kp i;
    public final zx1 j;
    public final zf k;
    public f6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        ez1.a(context);
        by1.a(this, getContext());
        w2 w2Var = new w2(this);
        this.g = w2Var;
        w2Var.k(attributeSet, R.attr.editTextStyle);
        g7 g7Var = new g7(this);
        this.h = g7Var;
        g7Var.f(attributeSet, R.attr.editTextStyle);
        g7Var.b();
        kp kpVar = new kp(2, false);
        kpVar.h = this;
        this.i = kpVar;
        this.j = new zx1();
        zf zfVar = new zf(this);
        this.k = zfVar;
        zfVar.D(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener A = zfVar.A(keyListener);
        if (A == keyListener) {
            return;
        }
        super.setKeyListener(A);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private f6 getSuperCaller() {
        if (this.l == null) {
            this.l = new f6(this);
        }
        return this.l;
    }

    @Override // defpackage.u41
    public final xw a(xw xwVar) {
        this.j.getClass();
        return zx1.a(this, xwVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w2 w2Var = this.g;
        if (w2Var != null) {
            w2Var.a();
        }
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return rt0.L(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        kp kpVar;
        if (Build.VERSION.SDK_INT >= 28 || (kpVar = this.i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) kpVar.i;
        return textClassifier == null ? a7.a((TextView) kpVar.h) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            g7 r1 = r7.h
            r1.getClass()
            defpackage.g7.h(r8, r0, r7)
            defpackage.op0.G(r8, r0, r7)
            if (r0 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L78
            java.lang.String[] r2 = defpackage.y62.h(r7)
            if (r2 == 0) goto L78
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            defpackage.m70.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            p8 r2 = new p8
            r6 = 22
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4e
            fm0 r1 = new fm0
            r1.<init>(r0, r2)
        L4c:
            r0 = r1
            goto L78
        L4e:
            java.lang.String[] r6 = defpackage.c3.b
            if (r1 < r5) goto L5a
            java.lang.String[] r1 = defpackage.m70.b(r8)
            if (r1 == 0) goto L6e
        L58:
            r6 = r1
            goto L6e
        L5a:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5f
            goto L6e
        L5f:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6b
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6b:
            if (r1 == 0) goto L6e
            goto L58
        L6e:
            int r1 = r6.length
            if (r1 != 0) goto L72
            goto L78
        L72:
            gm0 r1 = new gm0
            r1.<init>(r0, r2)
            goto L4c
        L78:
            zf r7 = r7.k
            a80 r7 = r7.F(r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g6.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && y62.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = n6.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        uw uwVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || y62.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                uwVar = new gm2(primaryClip, 1);
            } else {
                vw vwVar = new vw();
                vwVar.h = primaryClip;
                vwVar.i = 1;
                uwVar = vwVar;
            }
            uwVar.M(i == 16908322 ? 0 : 1);
            y62.k(this, uwVar.build());
        }
        return true;
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(rt0.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.k.O(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.k.A(keyListener));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        g7 g7Var = this.h;
        g7Var.l(colorStateList);
        g7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        g7 g7Var = this.h;
        g7Var.m(mode);
        g7Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        kp kpVar;
        if (Build.VERSION.SDK_INT >= 28 || (kpVar = this.i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kpVar.i = textClassifier;
        }
    }
}
