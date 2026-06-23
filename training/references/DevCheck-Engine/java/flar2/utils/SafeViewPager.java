package flar2.devcheck.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.g82;

/* loaded from: classes.dex */
public class SafeViewPager extends g82 {
    public SafeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.g82, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.g82, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            return false;
        }
    }
}
