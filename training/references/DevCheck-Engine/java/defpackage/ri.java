package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ri extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f896a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ri(Object obj, int i, Object obj2) {
        this.f896a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ri(Object obj, Object obj2, int i, boolean z) {
        this.f896a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f896a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TextView textView = (TextView) obj2;
                textView.setText((String) obj);
                textView.animate().alpha(1.0f).setDuration(180L).start();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                View view = (View) obj2;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                hideBottomViewOnScrollBehavior.k = null;
                if (hideBottomViewOnScrollBehavior.j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                View view2 = (View) obj2;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                hideViewOnScrollBehavior.k = null;
                if (hideViewOnScrollBehavior.j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            case 3:
                ((p9) obj2).remove(animator);
                ((z02) obj).u.remove(animator);
                break;
            default:
                ma2 ma2Var = (ma2) obj2;
                ma2Var.f621a.e(1.0f);
                ia2.f((View) obj, ma2Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f896a) {
            case 3:
                ((z02) this.c).u.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
