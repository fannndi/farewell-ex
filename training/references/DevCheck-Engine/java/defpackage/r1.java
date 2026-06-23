package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class r1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f870a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(int i, Object obj) {
        this.f870a = i;
        this.b = obj;
    }

    public r1(l82 l82Var, View view) {
        this.f870a = 11;
        this.b = l82Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f870a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.C = null;
                actionBarOverlayLayout.p = false;
                break;
            case 5:
                ((td) obj).d();
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.q = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case 11:
                ((l82) obj).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.f870a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.C = null;
                actionBarOverlayLayout.p = false;
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                i4 i4Var = (i4) obj;
                ArrayList arrayList = new ArrayList(i4Var.k);
                int size = arrayList.size();
                while (i2 < size) {
                    ((wd) arrayList.get(i2)).a(i4Var);
                    i2++;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                super.onAnimationEnd(animator);
                fe feVar = (fe) obj;
                ViewGroup E = ju0.E(feVar);
                ViewOverlay overlay = E != null ? E.getOverlay() : null;
                if (overlay != null) {
                    ArrayList arrayList2 = feVar.r;
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        overlay.remove((g02) obj2);
                    }
                    break;
                }
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.P(5);
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Y.get()).requestLayout();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                s60 s60Var = (s60) obj;
                s60Var.p();
                s60Var.r.start();
                break;
            case 5:
                ((td) obj).e();
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                vu0 vu0Var = (vu0) obj;
                vu0Var.b.setTranslationY(0.0f);
                vu0Var.b(0.0f);
                break;
            case rt0.o /* 9 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 10:
                ((z02) obj).m();
                animator.removeListener(this);
                break;
            case 11:
                ((l82) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f870a) {
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                super.onAnimationRepeat(animator);
                sq0 sq0Var = (sq0) this.b;
                sq0Var.f = (sq0Var.f + 1) % sq0Var.e.e.length;
                sq0Var.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.f870a;
        Object obj = this.b;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                i4 i4Var = (i4) obj;
                ArrayList arrayList = new ArrayList(i4Var.k);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((wd) arrayList.get(i2)).b(i4Var);
                }
                break;
            case 5:
                ((td) obj).f(animator);
                break;
            case 11:
                ((l82) obj).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
