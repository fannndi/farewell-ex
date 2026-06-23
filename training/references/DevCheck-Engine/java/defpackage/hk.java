package defpackage;

import android.util.Log;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public final class hk implements o82, ex0 {
    public boolean g;
    public Object h;

    public /* synthetic */ hk(Object obj) {
        this.h = obj;
    }

    public hk(pg0 pg0Var, boolean z) {
        this(pg0Var);
        this.g = z;
    }

    @Override // defpackage.ex0
    public boolean G(MenuBuilder menuBuilder) {
        ((rz1) this.h).v.onMenuOpened(108, menuBuilder);
        return true;
    }

    @Override // defpackage.ex0
    public void a(MenuBuilder menuBuilder, boolean z) {
        d2 d2Var;
        rz1 rz1Var = (rz1) this.h;
        if (this.g) {
            return;
        }
        this.g = true;
        ActionMenuView actionMenuView = rz1Var.u.f1015a.g;
        if (actionMenuView != null && (d2Var = actionMenuView.z) != null) {
            d2Var.d();
            z1 z1Var = d2Var.A;
            if (z1Var != null && z1Var.b()) {
                z1Var.j.dismiss();
            }
        }
        rz1Var.v.onPanelClosed(108, menuBuilder);
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // defpackage.o82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gb2 b(android.view.View r17, defpackage.gb2 r18, defpackage.p82 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            db2 r4 = r2.f329a
            r5 = 519(0x207, float:7.27E-43)
            mm0 r5 = r4.h(r5)
            r6 = 32
            mm0 r4 = r4.h(r6)
            java.lang.Object r6 = r0.h
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            boolean r7 = r6.p
            int r8 = r5.b
            int r9 = r5.c
            int r10 = r5.f643a
            r6.x = r8
            int r8 = r1.getLayoutDirection()
            r12 = 1
            if (r8 != r12) goto L2d
            r8 = r12
            goto L2e
        L2d:
            r8 = 0
        L2e:
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            if (r7 == 0) goto L45
            int r13 = r2.a()
            r6.w = r13
            int r11 = r3.d
            int r13 = r13 + r11
        L45:
            boolean r11 = r6.q
            if (r11 == 0) goto L52
            if (r8 == 0) goto L4e
            int r11 = r3.c
            goto L50
        L4e:
            int r11 = r3.f777a
        L50:
            int r14 = r11 + r10
        L52:
            boolean r11 = r6.r
            if (r11 == 0) goto L5f
            if (r8 == 0) goto L5b
            int r3 = r3.f777a
            goto L5d
        L5b:
            int r3 = r3.c
        L5d:
            int r15 = r3 + r9
        L5f:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r8 = r6.t
            if (r8 == 0) goto L71
            int r8 = r3.leftMargin
            if (r8 == r10) goto L71
            r3.leftMargin = r10
            r11 = r12
            goto L72
        L71:
            r11 = 0
        L72:
            boolean r8 = r6.u
            if (r8 == 0) goto L7d
            int r8 = r3.rightMargin
            if (r8 == r9) goto L7d
            r3.rightMargin = r9
            r11 = r12
        L7d:
            boolean r8 = r6.v
            if (r8 == 0) goto L8a
            int r8 = r3.topMargin
            int r5 = r5.b
            if (r8 == r5) goto L8a
            r3.topMargin = r5
            goto L8b
        L8a:
            r12 = r11
        L8b:
            if (r12 == 0) goto L90
            r1.setLayoutParams(r3)
        L90:
            int r3 = r1.getPaddingTop()
            r1.setPadding(r14, r3, r15, r13)
            boolean r0 = r0.g
            if (r0 == 0) goto L9f
            int r1 = r4.d
            r6.n = r1
        L9f:
            if (r7 != 0) goto La5
            if (r0 == 0) goto La4
            goto La5
        La4:
            return r2
        La5:
            r6.W()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk.b(android.view.View, gb2, p82):gb2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (r5.getBoolean("has_iris", r9 >= 29 && r6 != null && r6.getPackageManager() != null && defpackage.u51.b(r6.getPackageManager())) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0168, code lost:
    
        r0.d0.k = true;
        r0.z0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        if (r2 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015c, code lost:
    
        if (r4 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0163, code lost:
    
        if (r4 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.fh r10) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk.c(fh):void");
    }

    public boolean d() {
        return this.g;
    }

    public boolean e(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((pg0) this.h) == null) {
            return d();
        }
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            hk hkVar = px1.f812a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case rt0.p /* 17 */:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return d();
        }
        return false;
    }

    public void f(ao2 ao2Var) {
        if (this.g) {
            int i = bk2.f89a;
            Log.isLoggable("BillingLogger", 5);
        } else {
            try {
                ((fh) this.h).O(new db(ao2Var));
            } catch (Throwable unused) {
                int i2 = bk2.f89a;
                Log.isLoggable("BillingLogger", 5);
            }
        }
    }
}
