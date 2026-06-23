package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class cx0 extends l60 {
    public final int s;
    public final int t;
    public rw0 u;
    public sw0 v;

    public cx0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.s = 21;
            this.t = 22;
        } else {
            this.s = 22;
            this.t = 21;
        }
    }

    @Override // defpackage.l60, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        nw0 nw0Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.u != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                nw0Var = (nw0) headerViewListAdapter.getWrappedAdapter();
            } else {
                nw0Var = (nw0) adapter;
                i = 0;
            }
            sw0 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= nw0Var.getCount()) ? null : nw0Var.getItem(i2);
            sw0 sw0Var = this.v;
            if (sw0Var != item) {
                MenuBuilder menuBuilder = nw0Var.g;
                if (sw0Var != null) {
                    this.u.f(menuBuilder, sw0Var);
                }
                this.v = item;
                if (item != null) {
                    this.u.o(menuBuilder, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.s) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.t) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (nw0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (nw0) adapter).g.c(false);
        return true;
    }

    public void setHoverListener(rw0 rw0Var) {
        this.u = rw0Var;
    }

    @Override // defpackage.l60, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
