package defpackage;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class u01 extends MenuBuilder {
    public final Class A;
    public final int B;

    public u01(Context context, Class cls, int i) {
        super(context);
        this.A = cls;
        this.B = i;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final sw0 a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.B;
        if (size <= i4) {
            w();
            sw0 a2 = super.a(i, i2, i3, charSequence);
            v();
            return a2;
        }
        String simpleName = this.A.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        c.m(d51.u(sb, simpleName, "#getMaxItemCount()"));
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.A.getSimpleName().concat(" does not support submenus"));
    }
}
