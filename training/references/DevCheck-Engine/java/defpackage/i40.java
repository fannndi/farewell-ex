package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class i40 extends ld0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler d0;
    public boolean m0;
    public Dialog o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final wa e0 = new wa(7, this);
    public final e40 f0 = new e40(this);
    public final f40 g0 = new f40(this);
    public int h0 = 0;
    public int i0 = 0;
    public boolean j0 = true;
    public boolean k0 = true;
    public int l0 = -1;
    public final g40 n0 = new g40(0, this);
    public boolean s0 = false;

    @Override // defpackage.ld0
    public final void J() {
        this.K = true;
    }

    @Override // defpackage.ld0
    public void L(Context context) {
        super.L(context);
        this.X.f(this.n0);
        if (this.r0) {
            return;
        }
        this.q0 = false;
    }

    @Override // defpackage.ld0
    public void M(Bundle bundle) {
        super.M(bundle);
        this.d0 = new Handler();
        this.k0 = this.D == 0;
        if (bundle != null) {
            this.h0 = bundle.getInt("android:style", 0);
            this.i0 = bundle.getInt("android:theme", 0);
            this.j0 = bundle.getBoolean("android:cancelable", true);
            this.k0 = bundle.getBoolean("android:showsDialog", this.k0);
            this.l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.ld0
    public void Q() {
        this.K = true;
        Dialog dialog2 = this.o0;
        if (dialog2 != null) {
            this.p0 = true;
            dialog2.setOnDismissListener(null);
            this.o0.dismiss();
            if (!this.q0) {
                onDismiss(this.o0);
            }
            this.o0 = null;
            this.s0 = false;
        }
    }

    @Override // defpackage.ld0
    public final void R() {
        this.K = true;
        if (!this.r0 && !this.q0) {
            this.q0 = true;
        }
        this.X.j(this.n0);
    }

    @Override // defpackage.ld0
    public final LayoutInflater S(Bundle bundle) {
        LayoutInflater S = super.S(bundle);
        boolean z = this.k0;
        if (z && !this.m0) {
            if (z && !this.s0) {
                try {
                    this.m0 = true;
                    Dialog x0 = x0();
                    this.o0 = x0;
                    if (this.k0) {
                        y0(x0, this.h0);
                        Context v = v();
                        if (v != null) {
                            this.o0.setOwnerActivity((Activity) v);
                        }
                        this.o0.setCancelable(this.j0);
                        this.o0.setOnCancelListener(this.f0);
                        this.o0.setOnDismissListener(this.g0);
                        this.s0 = true;
                    } else {
                        this.o0 = null;
                    }
                    this.m0 = false;
                } catch (Throwable th) {
                    this.m0 = false;
                    throw th;
                }
            }
            if (ae0.H(2)) {
                toString();
            }
            Dialog dialog2 = this.o0;
            if (dialog2 != null) {
                return S.cloneInContext(dialog2.getContext());
            }
        } else if (ae0.H(2)) {
            toString();
        }
        return S;
    }

    @Override // defpackage.ld0
    public void Z(Bundle bundle) {
        Dialog dialog2 = this.o0;
        if (dialog2 != null) {
            Bundle onSaveInstanceState = dialog2.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.h0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.i0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.l0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.ld0
    public void a0() {
        this.K = true;
        Dialog dialog2 = this.o0;
        if (dialog2 != null) {
            this.p0 = false;
            dialog2.show();
            View decorView = this.o0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.ld0
    public void b0() {
        this.K = true;
        Dialog dialog2 = this.o0;
        if (dialog2 != null) {
            dialog2.hide();
        }
    }

    @Override // defpackage.ld0
    public final void d0(Bundle bundle) {
        Bundle bundle2;
        this.K = true;
        if (this.o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ld0
    public final void e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.e0(layoutInflater, viewGroup, bundle);
        if (this.M != null || this.o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.p0) {
            return;
        }
        if (ae0.H(3)) {
            toString();
        }
        v0(true, true);
    }

    @Override // defpackage.ld0
    public final tl2 r() {
        return new h40(this, new id0(this));
    }

    public final void u0() {
        v0(true, false);
    }

    public final void v0(boolean z, boolean z2) {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        this.r0 = false;
        Dialog dialog2 = this.o0;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(null);
            this.o0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.d0.getLooper()) {
                    onDismiss(this.o0);
                } else {
                    this.d0.post(this.e0);
                }
            }
        }
        this.p0 = true;
        if (this.l0 >= 0) {
            ae0 y = y();
            int i = this.l0;
            if (i < 0) {
                c.m(d51.q("Bad id: ", i));
                return;
            } else {
                y.w(new zd0(y, i, 1), z);
                this.l0 = -1;
                return;
            }
        }
        yb ybVar = new yb(y());
        ybVar.r = true;
        ybVar.j(this);
        if (z) {
            ybVar.e(true);
        } else {
            ybVar.e(false);
        }
    }

    public int w0() {
        return this.i0;
    }

    public Dialog x0() {
        if (ae0.H(3)) {
            toString();
        }
        return new bu(i0(), w0());
    }

    public void y0(Dialog dialog2, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog2.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog2.requestWindowFeature(1);
    }

    public void z0(ae0 ae0Var, String str) {
        this.q0 = false;
        this.r0 = true;
        ae0Var.getClass();
        yb ybVar = new yb(ae0Var);
        ybVar.r = true;
        ybVar.g(0, this, str, 1);
        ybVar.e(false);
    }
}
