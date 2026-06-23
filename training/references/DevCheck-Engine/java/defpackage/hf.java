package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.util.ArrayMap;
import android.view.ContentInfo;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hf {
    public static /* synthetic */ ContentInfo.Builder f(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo h(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ RemoteViews k(ArrayMap arrayMap) {
        return new RemoteViews(arrayMap);
    }

    public static /* bridge */ /* synthetic */ boolean u(Exception exc) {
        return exc instanceof ForegroundServiceStartNotAllowedException;
    }
}
