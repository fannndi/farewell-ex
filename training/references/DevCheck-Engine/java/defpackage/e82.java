package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class e82 extends RecyclerView {
    public final /* synthetic */ ViewPager2 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e82(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.R0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.R0.z.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.R0;
        accessibilityEvent.setFromIndex(viewPager2.j);
        accessibilityEvent.setToIndex(viewPager2.j);
        accessibilityEvent.setSource((ViewPager2) viewPager2.z.k);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.R0.x && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.R0.x && super.onTouchEvent(motionEvent);
    }
}
