package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.List;

/* loaded from: classes.dex */
public final class u5 implements Window.Callback {
    public final Window.Callback g;
    public qz1 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ a6 l;

    public u5(a6 a6Var, Window.Callback callback) {
        this.l = a6Var;
        if (callback != null) {
            this.g = callback;
        } else {
            c.m("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.i = true;
            callback.onContentChanged();
        } finally {
            this.i = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.g.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.g.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        ba2.a(this.g, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.g.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.j;
        Window.Callback callback = this.g;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.l.w(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.g.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            a6 a6Var = this.l;
            a6Var.D();
            sl slVar = a6Var.t;
            if (slVar == null || !slVar.V(keyCode, keyEvent)) {
                z5 z5Var = a6Var.S;
                if (z5Var == null || !a6Var.J(z5Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (a6Var.S == null) {
                        z5 C = a6Var.C(0);
                        a6Var.K(C, keyEvent);
                        boolean J = a6Var.J(C, keyEvent.getKeyCode(), keyEvent);
                        C.k = false;
                        if (J) {
                        }
                    }
                    return false;
                }
                z5 z5Var2 = a6Var.S;
                if (z5Var2 != null) {
                    z5Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.g.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.g.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.g.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.g.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.g.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.g.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.i) {
            this.g.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuBuilder)) {
            return this.g.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        qz1 qz1Var = this.h;
        if (qz1Var != null) {
            View view = i == 0 ? new View(qz1Var.g.u.f1015a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.g.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.g.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.g.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            a6 a6Var = this.l;
            a6Var.D();
            sl slVar = a6Var.t;
            if (slVar != null) {
                slVar.o(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.k) {
            this.g.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        a6 a6Var = this.l;
        if (i == 108) {
            a6Var.D();
            sl slVar = a6Var.t;
            if (slVar != null) {
                slVar.o(false);
                return;
            }
            return;
        }
        if (i == 0) {
            z5 C = a6Var.C(i);
            if (C.m) {
                a6Var.u(C, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        ca2.a(this.g, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
        if (i == 0 && menuBuilder == null) {
            return false;
        }
        if (menuBuilder != null) {
            menuBuilder.y = true;
        }
        qz1 qz1Var = this.h;
        if (qz1Var != null && i == 0) {
            rz1 rz1Var = qz1Var.g;
            if (!rz1Var.x) {
                rz1Var.u.l = true;
                rz1Var.x = true;
            }
        }
        boolean onPreparePanel = this.g.onPreparePanel(i, view, menu);
        if (menuBuilder != null) {
            menuBuilder.y = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuBuilder menuBuilder = this.l.C(0).h;
        if (menuBuilder != null) {
            d(list, menuBuilder, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.g.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return aa2.a(this.g, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.g.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.g.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        a6 a6Var = this.l;
        if (!a6Var.E || i != 0) {
            return aa2.b(this.g, callback, i);
        }
        gr grVar = new gr(a6Var.q, callback);
        j2 n = a6Var.n(grVar);
        if (n != null) {
            return grVar.m(n);
        }
        return null;
    }
}
