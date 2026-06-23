package defpackage;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public abstract class i60 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
