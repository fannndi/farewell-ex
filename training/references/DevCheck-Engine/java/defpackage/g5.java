package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f319a = null;
    public PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public final TextView f;

    public /* synthetic */ g5(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList(this.f319a);
                }
                if (this.d) {
                    mutate.setTintMode(this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        f5 f5Var = (f5) this.f;
        Drawable checkMarkDrawable = f5Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList(this.f319a);
                }
                if (this.d) {
                    mutate.setTintMode(this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(f5Var.getDrawableState());
                }
                f5Var.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.widget.TextView r8 = r8.f
            r0 = r8
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r8 = r0.getContext()
            r6 = 0
            int[] r2 = defpackage.zb1.m
            fh r8 = defpackage.fh.G(r10, r6, r8, r9, r2)
            java.lang.Object r1 = r8.i
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r8.i
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r3 = r9
            r5 = r10
            defpackage.y62.n(r0, r1, r2, r3, r4, r5)
            r9 = 1
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L3f
            int r9 = r7.getResourceId(r9, r6)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L3f
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r9 = defpackage.k32.x(r10, r9)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            goto L56
        L3c:
            r0 = move-exception
            r9 = r0
            goto L7c
        L3f:
            boolean r9 = r7.hasValue(r6)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L56
            int r9 = r7.getResourceId(r6, r6)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L56
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r9 = defpackage.k32.x(r10, r9)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3c
        L56:
            r9 = 2
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L64
            android.content.res.ColorStateList r9 = r8.v(r9)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3c
        L64:
            r9 = 3
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L78
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3c
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.z50.c(r9, r10)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3c
        L78:
            r8.L()
            return
        L7c:
            r8.L()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5.c(android.util.AttributeSet, int):void");
    }
}
