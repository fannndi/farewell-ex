package defpackage;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u40 implements co, pa0, tt1, o41 {
    public final /* synthetic */ int g;
    public Object h;
    public Object i;

    public u40() {
        this.g = 11;
        this.h = new yo1(0);
        this.i = new ft0();
    }

    public /* synthetic */ u40(int i) {
        this.g = i;
    }

    public u40(int i, int i2) {
        this.g = 7;
        this.h = new int[]{i, i2};
        this.i = new float[]{0.0f, 1.0f};
    }

    public u40(int i, int i2, int i3) {
        this.g = 7;
        this.h = new int[]{i, i2, i3};
        this.i = new float[]{0.0f, 0.5f, 1.0f};
    }

    public u40(CardView cardView) {
        this.g = 4;
        this.i = cardView;
    }

    public u40(BatteryMonitor2Db batteryMonitor2Db) {
        this.g = 0;
        this.h = batteryMonitor2Db;
        new g8(batteryMonitor2Db, 5);
        new jp(batteryMonitor2Db, 1);
        new h8(batteryMonitor2Db, 10);
        this.i = new h8(batteryMonitor2Db, 11);
    }

    public u40(hf2 hf2Var, j70 j70Var) {
        this.g = 1;
        this.i = "ClientTelemetry.API";
        this.h = hf2Var;
    }

    public /* synthetic */ u40(Object obj) {
        this.g = 8;
        this.i = obj;
        this.h = new ArrayList();
    }

    public /* synthetic */ u40(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    public /* synthetic */ u40(Object obj, Object obj2, int i, boolean z) {
        this.g = i;
        this.i = obj;
        this.h = obj2;
    }

    public u40(ArrayList arrayList, ArrayList arrayList2) {
        this.g = 7;
        int size = arrayList.size();
        this.h = new int[size];
        this.i = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.h)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.i)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.pa0
    public int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = ((la0) this.h).h;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.i;
        int i = extendedFloatingActionButton2.o0;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.o41
    public void b(xo2 xo2Var) {
        ((Map) ((xi0) this.i).h).remove((nv1) this.h);
    }

    @Override // defpackage.pa0
    public int c() {
        return ((ExtendedFloatingActionButton) this.i).h0;
    }

    @Override // defpackage.tt1
    public void d() {
        ((rp1) this.i).d0 = false;
        sp1 sp1Var = (sp1) this.h;
        sp1Var.d.submit(new b9(15, sp1Var, (List) sp1Var.e.d(), new ArrayList()));
    }

    @Override // defpackage.pa0
    public int e() {
        return ((ExtendedFloatingActionButton) this.i).g0;
    }

    public void f(String str, Object obj) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        ((ArrayList) this.h).add(sb.toString());
    }

    public void g(te1 te1Var, sh shVar) {
        yo1 yo1Var = (yo1) this.h;
        g72 g72Var = (g72) yo1Var.get(te1Var);
        if (g72Var == null) {
            g72Var = g72.a();
            yo1Var.put(te1Var, g72Var);
        }
        g72Var.c = shVar;
        g72Var.f322a |= 8;
    }

    public lb1 h() {
        if ("first_party".equals((String) this.i)) {
            c.m("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (((String) this.h) == null) {
            c.m("Product id must be provided.");
            return null;
        }
        if (((String) this.i) != null) {
            return new lb1(this);
        }
        c.m("Product type must be provided.");
        return null;
    }

    public sh i(te1 te1Var, int i) {
        g72 g72Var;
        sh shVar;
        yo1 yo1Var = (yo1) this.h;
        int d = yo1Var.d(te1Var);
        if (d >= 0 && (g72Var = (g72) yo1Var.i(d)) != null) {
            int i2 = g72Var.f322a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                g72Var.f322a = i3;
                if (i == 4) {
                    shVar = g72Var.b;
                } else if (i == 8) {
                    shVar = g72Var.c;
                } else {
                    c.m("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    yo1Var.g(d);
                    g72Var.f322a = 0;
                    g72Var.b = null;
                    g72Var.c = null;
                    g72.d.c(g72Var);
                }
                return shVar;
            }
        }
        return null;
    }

    public void j(te1 te1Var) {
        g72 g72Var = (g72) ((yo1) this.h).get(te1Var);
        if (g72Var == null) {
            return;
        }
        g72Var.f322a &= -2;
    }

    @Override // defpackage.pa0
    public int k() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        la0 la0Var = (la0) this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.i;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return la0Var.k();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return la0Var.k();
    }

    @Override // defpackage.pa0
    public ViewGroup.LayoutParams l() {
        int i = ((ExtendedFloatingActionButton) this.i).o0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    public void m(te1 te1Var) {
        ft0 ft0Var = (ft0) this.i;
        int g = ft0Var.g() - 1;
        while (true) {
            if (g < 0) {
                break;
            }
            if (te1Var == ft0Var.h(g)) {
                Object[] objArr = ft0Var.i;
                Object obj = objArr[g];
                Object obj2 = om0.j;
                if (obj != obj2) {
                    objArr[g] = obj2;
                    ft0Var.g = true;
                }
            } else {
                g--;
            }
        }
        g72 g72Var = (g72) ((yo1) this.h).remove(te1Var);
        if (g72Var != null) {
            g72Var.f322a = 0;
            g72Var.b = null;
            g72Var.c = null;
            g72.d.c(g72Var);
        }
    }

    public void n(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.i;
        cardView.j.set(i, i2, i3, i4);
        Rect rect = cardView.i;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public xo2 o(Object obj) {
        ke2 ke2Var = (ke2) this.h;
        te2 te2Var = new te2(ke2Var.b, ((bf2) this.i).f81a, ((Long) obj).longValue());
        xo2 xo2Var = new xo2();
        xo2Var.f(te2Var);
        return xo2Var;
    }

    @Override // defpackage.co
    public void onCancel() {
        ((Animator) this.h).end();
        if (ae0.H(2)) {
            Objects.toString((up1) this.i);
        }
    }

    public String toString() {
        switch (this.g) {
            case 8:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.i.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
