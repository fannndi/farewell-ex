package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public abstract class qu0 {

    /* renamed from: a, reason: collision with root package name */
    public final PathInterpolator f862a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public xb f;

    public qu0(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = kk1.J(context, R.attr.motionDurationMedium2, 300);
        this.d = kk1.J(context, R.attr.motionDurationShort3, 150);
        this.e = kk1.J(context, R.attr.motionDurationShort2, 100);
    }
}
