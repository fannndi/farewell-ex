package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class qw0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, ex0 {
    public ls1 g;
    public n3 h;
    public qr0 i;

    @Override // defpackage.ex0
    public final boolean G(MenuBuilder menuBuilder) {
        return false;
    }

    @Override // defpackage.ex0
    public final void a(MenuBuilder menuBuilder, boolean z) {
        n3 n3Var;
        if ((z || menuBuilder == this.g) && (n3Var = this.h) != null) {
            n3Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ls1 ls1Var = this.g;
        qr0 qr0Var = this.i;
        if (qr0Var.l == null) {
            qr0Var.l = new pr0(qr0Var);
        }
        ls1Var.q(qr0Var.l.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.i.a(this.g, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ls1 ls1Var = this.g;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.h.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.h.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                ls1Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return ls1Var.performShortcut(i, keyEvent, 0);
    }
}
