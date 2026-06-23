package defpackage;

import android.graphics.Color;
import flar2.devcheck.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class lt0 implements is {
    public final /* synthetic */ MainActivity g;

    @Override // defpackage.is
    public final void k(int i) {
        MainActivity mainActivity = this.g;
        String str = MainActivity.U;
        int i2 = i51.b("prefDarkTheme").booleanValue() ? 2 : 1;
        if (i == -1) {
            if (i51.b("prefDC").booleanValue()) {
                c3.c(mainActivity, i2);
                return;
            } else {
                i51.j(6, "prefColor");
                c3.c(mainActivity, i2);
                return;
            }
        }
        int parseColor = Color.parseColor("#ffa000");
        int parseColor2 = Color.parseColor("#4587BF");
        int parseColor3 = Color.parseColor("#607D8B");
        int parseColor4 = Color.parseColor("#4e9b45");
        int parseColor5 = Color.parseColor("#E66260");
        int parseColor6 = Color.parseColor("#3f8095");
        int parseColor7 = Color.parseColor("#E66C46");
        int parseColor8 = Color.parseColor("#E4648F");
        int parseColor9 = Color.parseColor("#6F7BC1");
        if (i == parseColor) {
            i51.j(3, "prefColor");
            c3.c(mainActivity, i2);
            return;
        }
        if (i == parseColor2) {
            i51.j(4, "prefColor");
            c3.c(mainActivity, i2);
            return;
        }
        if (i == parseColor3) {
            i51.j(5, "prefColor");
            c3.c(mainActivity, i2);
            return;
        }
        if (i == parseColor4) {
            i51.j(6, "prefColor");
            c3.c(mainActivity, i2);
            return;
        }
        if (i == parseColor5) {
            i51.j(7, "prefColor");
            c3.c(mainActivity, i2);
            return;
        }
        if (i == parseColor6) {
            i51.j(8, "prefColor");
            c3.c(mainActivity, i2);
            return;
        }
        if (i == parseColor7) {
            i51.j(9, "prefColor");
            c3.c(mainActivity, i2);
        } else if (i == parseColor8) {
            i51.j(10, "prefColor");
            c3.c(mainActivity, i2);
        } else if (i == parseColor9) {
            i51.j(11, "prefColor");
            c3.c(mainActivity, i2);
        }
    }
}
