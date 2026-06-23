package defpackage;

import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.MainActivity;
import flar2.devcheck.tests.TestActivity;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class rn implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f901a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rn(Object obj, int i, Object obj2) {
        this.f901a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        int i = this.f901a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                sn snVar = (sn) obj3;
                l01 l01Var = (l01) obj2;
                List list = (List) obj;
                snVar.e0.setRefreshing(false);
                if (!list.isEmpty() && !snVar.g0) {
                    snVar.d0.setTranslationY(r0.getHeight());
                    snVar.d0.setAlpha(0.0f);
                    snVar.d0.animate().translationY(0.0f).setDuration(350L).alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                    snVar.g0 = true;
                    ((MainActivity) snVar.g0()).F = true;
                }
                l01Var.x(list);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ei0 ei0Var = (ei0) obj3;
                l01 l01Var2 = (l01) obj2;
                List list2 = (List) obj;
                ei0Var.e0.setRefreshing(false);
                if (!list2.isEmpty() && !ei0Var.f0) {
                    ei0Var.d0.setTranslationY(r0.getHeight());
                    ei0Var.d0.setAlpha(0.0f);
                    ei0Var.d0.animate().translationY(0.0f).setDuration(400L).alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                    ei0Var.f0 = true;
                }
                l01Var2.x(list2);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                p61 p61Var = (p61) obj3;
                x61 x61Var = (x61) obj2;
                List list3 = (List) obj;
                if (list3 != null) {
                    ArrayList arrayList = x61Var.d;
                    arrayList.clear();
                    arrayList.addAll(list3);
                    x61Var.f();
                    if (!p61Var.h0) {
                        p61Var.g0.setVisibility(8);
                        break;
                    } else {
                        new Handler().postDelayed(new n61(p61Var, 1), 500L);
                        break;
                    }
                }
                break;
            case 3:
                bm1 bm1Var = (bm1) obj3;
                l01 l01Var3 = (l01) obj2;
                List list4 = (List) obj;
                bm1Var.g0.setRefreshing(false);
                if (!list4.isEmpty() && !bm1Var.e0) {
                    bm1Var.d0.setTranslationY(r0.getHeight());
                    bm1Var.d0.setAlpha(0.0f);
                    bm1Var.d0.animate().translationY(0.0f).setDuration(350L).alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                    bm1Var.e0 = true;
                    ((MainActivity) bm1Var.g0()).F = true;
                }
                l01Var3.x(list4);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                v31 v31Var = (v31) obj2;
                if (((zo1) obj3).n.compareAndSet(true, false)) {
                    v31Var.a(obj);
                    break;
                }
                break;
            default:
                TestActivity testActivity = (TestActivity) obj3;
                int i2 = TestActivity.K;
                testActivity.E();
                kx1 kx1Var = new kx1(testActivity, testActivity.H, ((Boolean) obj).booleanValue());
                testActivity.I = kx1Var;
                kx1Var.f = testActivity;
                ((RecyclerView) obj2).setAdapter(kx1Var);
                break;
        }
    }
}
