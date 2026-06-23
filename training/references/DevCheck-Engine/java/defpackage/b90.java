package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class b90 {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f71a;
    public final a90 b;
    public final Context c;
    public final CheckableImageButton d;

    public b90(a90 a90Var) {
        this.f71a = a90Var.g;
        this.b = a90Var;
        this.c = a90Var.getContext();
        this.d = a90Var.m;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof s60;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(c1 c1Var) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public final void p() {
        this.b.f(false);
    }

    public void q() {
    }

    public void r() {
    }
}
