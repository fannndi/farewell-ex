package defpackage;

import android.widget.RadioGroup;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class sc implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f926a;
    public final /* synthetic */ RadioGroup b;
    public final /* synthetic */ a5 c;

    public /* synthetic */ sc(a5 a5Var, RadioGroup radioGroup, int i) {
        this.f926a = i;
        this.c = a5Var;
        this.b = radioGroup;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.f926a;
        RadioGroup radioGroup2 = this.b;
        a5 a5Var = this.c;
        switch (i2) {
            case 0:
                int i3 = BarDetailWidgetConfigureActivity.T;
                ((BarDetailWidgetConfigureActivity) a5Var).K = radioGroup2.findViewById(i).getTag().toString();
                break;
            default:
                int i4 = DashWidgetConfigureActivity.V;
                ((DashWidgetConfigureActivity) a5Var).J = radioGroup2.findViewById(i).getTag().toString();
                break;
        }
    }
}
