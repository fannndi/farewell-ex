package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class uk1 implements vk1 {
    public final ScrollFeedbackProvider g;

    public uk1(NestedScrollView nestedScrollView) {
        this.g = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.vk1
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.g.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.vk1
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.g.onScrollProgress(i, i2, i3, i4);
    }
}
