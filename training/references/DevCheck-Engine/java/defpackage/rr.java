package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class rr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f903a;
    public final /* synthetic */ sr b;

    public /* synthetic */ rr(sr srVar, int i) {
        this.f903a = i;
        this.b = srVar;
    }

    public final void a(Typeface typeface) {
        int i = this.f903a;
        sr srVar = this.b;
        switch (i) {
            case 0:
                if (srVar.t(typeface)) {
                    srVar.l(false);
                    break;
                }
                break;
            default:
                if (srVar.z(typeface)) {
                    srVar.l(false);
                    break;
                }
                break;
        }
    }
}
