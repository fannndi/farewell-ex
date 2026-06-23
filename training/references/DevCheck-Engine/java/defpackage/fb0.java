package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.temperature.TemperatureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class fb0 extends he1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb0(int i, Object obj) {
        this.f273a = i;
        this.b = obj;
    }

    @Override // defpackage.he1
    public void a(RecyclerView recyclerView, int i) {
        yw1 yw1Var;
        switch (this.f273a) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                TemperatureActivity temperatureActivity = (TemperatureActivity) this.b;
                boolean z = i == 0;
                temperatureActivity.K = z;
                if (z && temperatureActivity.L && (yw1Var = temperatureActivity.M) != null) {
                    temperatureActivity.H.w(yw1Var);
                    temperatureActivity.L = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.he1
    public void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f273a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ib0 ib0Var = (ib0) obj;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = ib0Var.f422a;
                int computeVerticalScrollRange = ib0Var.s.computeVerticalScrollRange();
                int i5 = ib0Var.r;
                ib0Var.t = computeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int computeHorizontalScrollRange = ib0Var.s.computeHorizontalScrollRange();
                int i6 = ib0Var.q;
                boolean z = computeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                ib0Var.u = z;
                boolean z2 = ib0Var.t;
                if (!z2 && !z) {
                    if (ib0Var.v != 0) {
                        ib0Var.i(0);
                        break;
                    }
                } else {
                    if (z2) {
                        float f = i5;
                        ib0Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                        ib0Var.k = Math.min(i5, (i5 * i5) / computeVerticalScrollRange);
                    }
                    if (ib0Var.u) {
                        float f2 = computeHorizontalScrollOffset;
                        float f3 = i6;
                        ib0Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                        ib0Var.n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
                    }
                    int i7 = ib0Var.v;
                    if (i7 == 0 || i7 == 1) {
                        ib0Var.i(1);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((eb0) obj).run();
                break;
        }
    }
}
