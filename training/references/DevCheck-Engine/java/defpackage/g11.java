package defpackage;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class g11 {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
