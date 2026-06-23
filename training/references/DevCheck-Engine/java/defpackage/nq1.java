package defpackage;

import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class nq1 extends WindowManager.LayoutParams {
    public final int g;
    public final int h;
    public final int i;

    public nq1(oq1 oq1Var, int i, boolean z, int i2, int i3) {
        super(200, 200, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 262176, -3);
        int j = oq1Var.j();
        ((WindowManager.LayoutParams) this).flags |= 8;
        if (!ym0.q(j, rt0.u)) {
            ((WindowManager.LayoutParams) this).flags |= rt0.t;
        }
        int i4 = ((WindowManager.LayoutParams) this).width;
        int width = oq1Var.h.getDefaultDisplay().getWidth();
        my1 my1Var = oq1.m;
        ((WindowManager.LayoutParams) this).x = ((i * 100) + (((HashMap) my1Var.g).size() * 100)) % (width - i4);
        int i5 = ((WindowManager.LayoutParams) this).height;
        Display defaultDisplay = oq1Var.h.getDefaultDisplay();
        ((WindowManager.LayoutParams) this).y = ((((i * 20000) / (defaultDisplay.getWidth() - ((WindowManager.LayoutParams) this).width)) + ((WindowManager.LayoutParams) this).x) + (((HashMap) my1Var.g).size() * 100)) % (defaultDisplay.getHeight() - i5);
        ((WindowManager.LayoutParams) this).gravity = 51;
        this.g = 10;
        this.i = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        ((WindowManager.LayoutParams) this).width = -2;
        ((WindowManager.LayoutParams) this).height = -2;
        if (z) {
            ((WindowManager.LayoutParams) this).flags |= 16;
        }
        if (i2 != -2147483647) {
            ((WindowManager.LayoutParams) this).x = i2;
        }
        if (i3 != -2147483647) {
            ((WindowManager.LayoutParams) this).y = i3;
        }
        Display defaultDisplay2 = oq1Var.h.getDefaultDisplay();
        int width2 = defaultDisplay2.getWidth();
        int height = defaultDisplay2.getHeight();
        int i6 = ((WindowManager.LayoutParams) this).x;
        if (i6 == Integer.MAX_VALUE) {
            ((WindowManager.LayoutParams) this).x = width2 - (-2);
        } else if (i6 == Integer.MIN_VALUE) {
            ((WindowManager.LayoutParams) this).x = (width2 - (-2)) / 2;
        }
        int i7 = ((WindowManager.LayoutParams) this).y;
        if (i7 == Integer.MAX_VALUE) {
            ((WindowManager.LayoutParams) this).y = height - (-2);
        } else if (i7 == Integer.MIN_VALUE) {
            ((WindowManager.LayoutParams) this).y = (height - (-2)) / 2;
        }
    }
}
