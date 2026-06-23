package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nw0 extends BaseAdapter {
    public final MenuBuilder g;
    public int h = -1;
    public boolean i;
    public final boolean j;
    public final LayoutInflater k;
    public final int l;

    public nw0(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.j = z;
        this.k = layoutInflater;
        this.g = menuBuilder;
        this.l = i;
        a();
    }

    public final void a() {
        MenuBuilder menuBuilder = this.g;
        sw0 sw0Var = menuBuilder.w;
        if (sw0Var != null) {
            menuBuilder.i();
            ArrayList arrayList = menuBuilder.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((sw0) arrayList.get(i)) == sw0Var) {
                    this.h = i;
                    return;
                }
            }
        }
        this.h = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sw0 getItem(int i) {
        ArrayList l;
        boolean z = this.j;
        MenuBuilder menuBuilder = this.g;
        if (z) {
            menuBuilder.i();
            l = menuBuilder.j;
        } else {
            l = menuBuilder.l();
        }
        int i2 = this.h;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (sw0) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.j;
        MenuBuilder menuBuilder = this.g;
        if (z) {
            menuBuilder.i();
            l = menuBuilder.j;
        } else {
            l = menuBuilder.l();
        }
        return this.h < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.k.inflate(this.l, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.g.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        gx0 gx0Var = (gx0) view;
        if (this.i) {
            listMenuItemView.setForceShowIcon(true);
        }
        gx0Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
