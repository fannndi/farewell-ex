package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class hm0 implements im0 {
    public final InputContentInfo g;

    public hm0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.g = new InputContentInfo(uri, clipDescription, uri2);
    }

    public hm0(Object obj) {
        this.g = (InputContentInfo) obj;
    }

    @Override // defpackage.im0
    public final ClipDescription d() {
        return this.g.getDescription();
    }

    @Override // defpackage.im0
    public final Object f() {
        return this.g;
    }

    @Override // defpackage.im0
    public final Uri g() {
        return this.g.getContentUri();
    }

    @Override // defpackage.im0
    public final void i() {
        this.g.requestPermission();
    }

    @Override // defpackage.im0
    public final Uri j() {
        return this.g.getLinkUri();
    }
}
