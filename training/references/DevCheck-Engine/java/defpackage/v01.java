package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v01 {

    /* renamed from: a, reason: collision with root package name */
    public final MenuBuilder f1062a;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final ArrayList b = new ArrayList();

    public v01(MenuBuilder menuBuilder) {
        this.f1062a = menuBuilder;
        b();
    }

    public final MenuItem a(int i) {
        return (MenuItem) this.b.get(i);
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        int i = 0;
        while (true) {
            MenuBuilder menuBuilder = this.f1062a;
            if (i >= menuBuilder.f.size()) {
                break;
            }
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(d51.m(arrayList, 1) instanceof s50) && item.isVisible()) {
                    arrayList.add(new s50());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.c++;
                    if (item2.isVisible()) {
                        this.d++;
                    }
                }
                arrayList.add(new s50());
            } else {
                arrayList.add(item);
                this.c++;
                if (item.isVisible()) {
                    this.d++;
                    this.e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(d51.m(arrayList, 1) instanceof s50)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
