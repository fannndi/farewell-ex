package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pr0 extends BaseAdapter {
    public int g = -1;
    public final /* synthetic */ qr0 h;

    public pr0(qr0 qr0Var) {
        this.h = qr0Var;
        a();
    }

    public final void a() {
        MenuBuilder menuBuilder = this.h.i;
        sw0 sw0Var = menuBuilder.w;
        if (sw0Var != null) {
            menuBuilder.i();
            ArrayList arrayList = menuBuilder.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((sw0) arrayList.get(i)) == sw0Var) {
                    this.g = i;
                    return;
                }
            }
        }
        this.g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sw0 getItem(int i) {
        qr0 qr0Var = this.h;
        MenuBuilder menuBuilder = qr0Var.i;
        menuBuilder.i();
        ArrayList arrayList = menuBuilder.j;
        qr0Var.getClass();
        int i2 = this.g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (sw0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        qr0 qr0Var = this.h;
        MenuBuilder menuBuilder = qr0Var.i;
        menuBuilder.i();
        int size = menuBuilder.j.size();
        qr0Var.getClass();
        return this.g < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.h.h.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((gx0) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
