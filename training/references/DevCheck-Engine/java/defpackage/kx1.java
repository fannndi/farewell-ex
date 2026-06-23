package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kx1 extends td1 {
    public final List d;
    public final LayoutInflater e;
    public hx1 f;
    public final Context g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;

    public kx1(Context context, ArrayList arrayList, boolean z) {
        this.e = LayoutInflater.from(context);
        this.d = arrayList;
        this.g = context;
        this.h = z;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        this.i = typedValue.data;
        this.j = context.getColor(R.color.chart_red);
        this.k = context.getColor(R.color.dark_neutral);
    }

    @Override // defpackage.td1
    public final int c() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.td1
    public final int e(int i) {
        try {
            return ((lx1) this.d.get(i)).d;
        } catch (IndexOutOfBoundsException unused) {
            return 1;
        }
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        jx1 jx1Var = (jx1) te1Var;
        int i2 = jx1Var.l;
        TextView textView = jx1Var.A;
        ImageView imageView = jx1Var.C;
        if (i2 == 0 || i2 == 2) {
            return;
        }
        int b = jx1Var.b();
        List list = this.d;
        textView.setText(((lx1) list.get(b)).c);
        jx1Var.B.setImageDrawable(((lx1) list.get(jx1Var.b())).f611a);
        int A = d51.A(((lx1) list.get(jx1Var.b())).b);
        Context context = this.g;
        if (A == 0) {
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_test_notcomplete));
            imageView.setImageTintList(ColorStateList.valueOf(this.k));
        } else if (A == 1) {
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_test_success));
            imageView.setImageTintList(ColorStateList.valueOf(this.i));
        } else if (A == 2) {
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_test_fail));
            imageView.setImageTintList(ColorStateList.valueOf(this.j));
        }
        if (!((lx1) list.get(jx1Var.b())).e || this.h) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_pro, 0, 0, 0);
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        return i != 0 ? i != 2 ? new jx1(this, layoutInflater.inflate(R.layout.tests_list_item, viewGroup, false)) : new ix1(this, layoutInflater.inflate(R.layout.tests_list_bottom, viewGroup, false)) : new ix1(this, layoutInflater.inflate(R.layout.tests_list_header, viewGroup, false));
    }
}
