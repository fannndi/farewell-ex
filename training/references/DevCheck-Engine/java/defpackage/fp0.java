package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class fp0 extends td1 {
    public final ArrayList d = new ArrayList();
    public final p8 e;

    public fp0(p8 p8Var) {
        this.e = p8Var;
        u(true);
    }

    @Override // defpackage.td1
    public final int c() {
        return this.d.size();
    }

    @Override // defpackage.td1
    public final long d(int i) {
        return -1L;
    }

    @Override // defpackage.td1
    public final int e(int i) {
        return ((gp0) this.d.get(i)).k.i;
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        ep0 ep0Var = (ep0) te1Var;
        int i2 = ep0Var.l;
        View view = ep0Var.g;
        ArrayList arrayList = this.d;
        if (i2 == 1) {
            ((dp0) ep0Var).O.setText(view.getContext().getString(R.string.devices) + " • " + ((gp0) arrayList.get(i)).k.b);
            return;
        }
        gp0 gp0Var = (gp0) arrayList.get(i);
        TextView textView = ep0Var.I;
        TextView textView2 = ep0Var.G;
        cp0 cp0Var = gp0Var.k;
        String str = gp0Var.j;
        ImageView imageView = ep0Var.A;
        boolean z = cp0Var.f;
        int i3 = R.drawable.ic_router;
        if (!z) {
            switch (cp0Var.A.ordinal()) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    i3 = R.drawable.ic_lan_nas;
                    break;
                case 3:
                    i3 = R.drawable.ic_printer;
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    i3 = R.drawable.ic_lan_tv;
                    break;
                case 5:
                    i3 = R.drawable.ic_computer;
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    i3 = R.drawable.ic_lan_phone;
                    break;
                default:
                    i3 = R.drawable.ic_lan;
                    break;
            }
        }
        imageView.setImageResource(i3);
        ep0Var.B.setText(gp0Var.f349a);
        ep0Var.C.setVisibility(cp0Var.f ? 0 : 8);
        ep0Var.D.setVisibility(cp0Var.e ? 0 : 8);
        ep0Var.E.setVisibility(cp0Var.h ? 0 : 8);
        ep0Var.F.setText(gp0Var.b);
        if (TextUtils.isEmpty(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        if (TextUtils.isEmpty(gp0Var.i)) {
            ep0Var.H.setVisibility(8);
        }
        String str2 = gp0Var.d;
        String str3 = gp0Var.c;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            str2 = d51.s(str3, " • ", str2);
        } else if (TextUtils.isEmpty(str2)) {
            str2 = !TextUtils.isEmpty(str3) ? str3 : null;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        ep0Var.J.setVisibility(ep0.r(ep0Var.N, gp0Var.h) | ((ep0.r(ep0Var.K, gp0Var.e) | ep0.r(ep0Var.L, gp0Var.f)) | ep0.r(ep0Var.M, gp0Var.g)) ? 0 : 8);
        view.setOnClickListener(new uc(this.e, 8, cp0Var));
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new ep0(d51.j(viewGroup, R.layout.item_lan_device, viewGroup, false));
        }
        View j = d51.j(viewGroup, R.layout.recyclerlist_header, viewGroup, false);
        dp0 dp0Var = new dp0(j);
        dp0Var.O = (TextView) j.findViewById(R.id.header_title);
        return dp0Var;
    }
}
