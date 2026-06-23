package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class vw implements uw, ww {
    public final /* synthetic */ int g = 0;
    public ClipData h;
    public int i;
    public int j;
    public Uri k;
    public Bundle l;

    public /* synthetic */ vw() {
    }

    public vw(vw vwVar) {
        ClipData clipData = vwVar.h;
        clipData.getClass();
        this.h = clipData;
        int i = vwVar.i;
        if (i < 0) {
            Locale locale = Locale.US;
            c.m("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            c.m(bOxzFZXgEkjph.pHCEOul);
            throw null;
        }
        this.i = i;
        int i2 = vwVar.j;
        if ((i2 & 1) == i2) {
            this.j = i2;
            this.k = vwVar.k;
            this.l = vwVar.l;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.uw
    public void D(Uri uri) {
        this.k = uri;
    }

    @Override // defpackage.uw
    public void M(int i) {
        this.j = i;
    }

    @Override // defpackage.ww
    public int b() {
        return this.i;
    }

    @Override // defpackage.uw
    public xw build() {
        return new xw(new vw(this));
    }

    @Override // defpackage.ww
    public ClipData d() {
        return this.h;
    }

    @Override // defpackage.uw
    public void setExtras(Bundle bundle) {
        this.l = bundle;
    }

    public String toString() {
        String str;
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Uri uri = this.k;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.h.getDescription());
                sb.append(", source=");
                int i = this.i;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.j;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return d51.u(sb, this.l != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ww
    public int w() {
        return this.j;
    }

    @Override // defpackage.ww
    public ContentInfo y() {
        return null;
    }
}
