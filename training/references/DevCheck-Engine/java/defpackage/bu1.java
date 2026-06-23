package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bu1 extends View {
    public final /* synthetic */ ViewGroup g;
    public final /* synthetic */ du1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu1(du1 du1Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.h = du1Var;
        this.g = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        du1 du1Var = this.h;
        ArrayList arrayList = du1Var.b;
        Drawable background = this.g.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (du1Var.e != color) {
            du1Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((wa1) arrayList.get(size)).f1122a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw iy1.e(arrayList2, size2);
                }
            }
        }
    }
}
