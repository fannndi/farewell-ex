package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class bz extends BaseAdapter implements Filterable {
    public boolean g;
    public boolean h;
    public Cursor i;
    public int j;
    public zy k;
    public az l;
    public cz m;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.i;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                zy zyVar = this.k;
                if (zyVar != null) {
                    cursor2.unregisterContentObserver(zyVar);
                }
                az azVar = this.l;
                if (azVar != null) {
                    cursor2.unregisterDataSetObserver(azVar);
                }
            }
            this.i = cursor;
            if (cursor != null) {
                zy zyVar2 = this.k;
                if (zyVar2 != null) {
                    cursor.registerContentObserver(zyVar2);
                }
                az azVar2 = this.l;
                if (azVar2 != null) {
                    cursor.registerDataSetObserver(azVar2);
                }
                this.j = cursor.getColumnIndexOrThrow("_id");
                this.g = true;
                notifyDataSetChanged();
            } else {
                this.j = -1;
                this.g = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.g || (cursor = this.i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.g) {
            return null;
        }
        this.i.moveToPosition(i);
        if (view == null) {
            ts1 ts1Var = (ts1) this;
            view = ts1Var.p.inflate(ts1Var.o, viewGroup, false);
        }
        a(view, this.i);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.m == null) {
            cz czVar = new cz();
            czVar.f161a = this;
            this.m = czVar;
        }
        return this.m;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.g || (cursor = this.i) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.g && (cursor = this.i) != null && cursor.moveToPosition(i)) {
            return this.i.getLong(this.j);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.g) {
            c.n("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.i.moveToPosition(i)) {
            c.n(d51.q("couldn't move cursor to position ", i));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.i);
        return view;
    }
}
