package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class rz1 extends sl {
    public final ArrayList A;
    public final wa B;
    public final tz1 u;
    public final Window.Callback v;
    public final qz1 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public rz1(Toolbar toolbar, CharSequence charSequence, u5 u5Var) {
        super(4);
        this.A = new ArrayList();
        this.B = new wa(29, this);
        qz1 qz1Var = new qz1(this);
        toolbar.getClass();
        tz1 tz1Var = new tz1(toolbar, false);
        this.u = tz1Var;
        u5Var.getClass();
        this.v = u5Var;
        tz1Var.k = u5Var;
        toolbar.setOnMenuItemClickListener(qz1Var);
        if (!tz1Var.g) {
            tz1Var.h = charSequence;
            if ((tz1Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (tz1Var.g) {
                    y62.p(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.w = new qz1(this);
    }

    @Override // defpackage.sl
    public final Context J() {
        return this.u.f1015a.getContext();
    }

    @Override // defpackage.sl
    public final boolean K() {
        tz1 tz1Var = this.u;
        Toolbar toolbar = tz1Var.f1015a;
        wa waVar = this.B;
        toolbar.removeCallbacks(waVar);
        Toolbar toolbar2 = tz1Var.f1015a;
        WeakHashMap weakHashMap = y62.f1215a;
        toolbar2.postOnAnimation(waVar);
        return true;
    }

    @Override // defpackage.sl
    public final void R() {
    }

    @Override // defpackage.sl
    public final void S() {
        this.u.f1015a.removeCallbacks(this.B);
    }

    @Override // defpackage.sl
    public final boolean V(int i, KeyEvent keyEvent) {
        Menu u0 = u0();
        if (u0 == null) {
            return false;
        }
        u0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return u0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.sl
    public final boolean W(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            X();
        }
        return true;
    }

    @Override // defpackage.sl
    public final boolean X() {
        return this.u.f1015a.u();
    }

    @Override // defpackage.sl
    public final boolean h() {
        d2 d2Var;
        ActionMenuView actionMenuView = this.u.f1015a.g;
        return (actionMenuView == null || (d2Var = actionMenuView.z) == null || !d2Var.d()) ? false : true;
    }

    @Override // defpackage.sl
    public final boolean i() {
        sw0 sw0Var;
        mz1 mz1Var = this.u.f1015a.S;
        if (mz1Var == null || (sw0Var = mz1Var.h) == null) {
            return false;
        }
        if (mz1Var == null) {
            sw0Var = null;
        }
        if (sw0Var == null) {
            return true;
        }
        sw0Var.collapseActionView();
        return true;
    }

    @Override // defpackage.sl
    public final void i0(boolean z) {
    }

    @Override // defpackage.sl
    public final void j0(boolean z) {
        tz1 tz1Var = this.u;
        tz1Var.a((tz1Var.b & (-5)) | 4);
    }

    @Override // defpackage.sl
    public final void k0(boolean z) {
    }

    @Override // defpackage.sl
    public final void l0(int i) {
        tz1 tz1Var = this.u;
        CharSequence text = i != 0 ? tz1Var.f1015a.getContext().getText(i) : null;
        tz1Var.g = true;
        Toolbar toolbar = tz1Var.f1015a;
        tz1Var.h = text;
        if ((tz1Var.b & 8) != 0) {
            toolbar.setTitle(text);
            if (tz1Var.g) {
                y62.p(toolbar.getRootView(), text);
            }
        }
    }

    @Override // defpackage.sl
    public final void m0(String str) {
        tz1 tz1Var = this.u;
        tz1Var.g = true;
        Toolbar toolbar = tz1Var.f1015a;
        tz1Var.h = str;
        if ((tz1Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (tz1Var.g) {
                y62.p(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.sl
    public final void n0(CharSequence charSequence) {
        tz1 tz1Var = this.u;
        if (tz1Var.g) {
            return;
        }
        Toolbar toolbar = tz1Var.f1015a;
        tz1Var.h = charSequence;
        if ((tz1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (tz1Var.g) {
                y62.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.sl
    public final void o(boolean z) {
        if (z == this.z) {
            return;
        }
        this.z = z;
        ArrayList arrayList = this.A;
        if (arrayList.size() > 0) {
            throw iy1.e(arrayList, 0);
        }
    }

    public final Menu u0() {
        boolean z = this.y;
        tz1 tz1Var = this.u;
        if (!z) {
            hk hkVar = new hk(this);
            qz1 qz1Var = new qz1(this);
            Toolbar toolbar = tz1Var.f1015a;
            toolbar.T = hkVar;
            toolbar.U = qz1Var;
            ActionMenuView actionMenuView = toolbar.g;
            if (actionMenuView != null) {
                actionMenuView.A = hkVar;
                actionMenuView.B = qz1Var;
            }
            this.y = true;
        }
        return tz1Var.f1015a.getMenu();
    }

    @Override // defpackage.sl
    public final int y() {
        return this.u.b;
    }
}
