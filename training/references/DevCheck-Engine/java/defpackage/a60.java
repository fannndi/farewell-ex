package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class a60 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ a60(b60 b60Var, int i) {
        this.f10a = i;
        this.b = b60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f10a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                super.onAnimationEnd(animator);
                b60 b60Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = b60Var.m;
                if (arrayList != null && !b60Var.n) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((wd) obj).a(b60Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f10a) {
            case 0:
                super.onAnimationStart(animator);
                b60 b60Var = this.b;
                ArrayList arrayList = b60Var.m;
                if (arrayList != null && !b60Var.n) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((wd) obj).b(b60Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
