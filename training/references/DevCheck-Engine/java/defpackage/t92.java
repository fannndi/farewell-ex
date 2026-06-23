package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import flar2.devcheck.R;
import flar2.devcheck.tools.WifiActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t92 extends td1 {
    public Context d;
    public final ArrayList e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public t92(WifiActivity wifiActivity, ArrayList arrayList) {
        this.d = wifiActivity;
        this.e = arrayList;
        this.g = wifiActivity.getColor(R.color.green);
        this.h = wifiActivity.getColor(R.color.yellow);
        this.f = wifiActivity.getColor(R.color.red);
        TypedValue typedValue = new TypedValue();
        wifiActivity.getTheme().resolveAttribute(R.attr.colorPrimaryAlpha, typedValue, true);
        this.j = typedValue.data;
        wifiActivity.getTheme().resolveAttribute(R.attr.card_background_color, typedValue, true);
        this.i = typedValue.data;
    }

    @Override // defpackage.td1
    public final int c() {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    @Override // defpackage.td1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.te1 r23, int r24) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t92.l(te1, int):void");
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        this.d = viewGroup.getContext();
        return new s92(this, LayoutInflater.from(this.d).inflate(R.layout.tools_wifi_item, viewGroup, false));
    }
}
