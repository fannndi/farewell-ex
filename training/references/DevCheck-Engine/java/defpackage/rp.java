package defpackage;

import android.view.GestureDetector;
import android.view.View;

/* loaded from: classes.dex */
public abstract class rp extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public int g = 0;
    public fj0 h;
    public final GestureDetector i;
    public final mp j;

    public rp(mp mpVar) {
        this.j = mpVar;
        this.i = new GestureDetector(mpVar.getContext(), this);
    }
}
