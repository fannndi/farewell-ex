package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class fd0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float g;
    public final int h;
    public final int i;
    public final View j;
    public ed0 k;
    public ed0 l;
    public boolean m;
    public int n;
    public final int[] o = new int[2];

    public fd0(View view) {
        this.j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.g = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.h = tapTimeout;
        this.i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        ed0 ed0Var = this.l;
        View view = this.j;
        if (ed0Var != null) {
            view.removeCallbacks(ed0Var);
        }
        ed0 ed0Var2 = this.k;
        if (ed0Var2 != null) {
            view.removeCallbacks(ed0Var2);
        }
    }

    public abstract ro1 b();

    public abstract boolean c();

    public boolean d() {
        ro1 b = b();
        if (b == null || !b.b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.m = false;
        this.n = -1;
        ed0 ed0Var = this.k;
        if (ed0Var != null) {
            this.j.removeCallbacks(ed0Var);
        }
    }
}
