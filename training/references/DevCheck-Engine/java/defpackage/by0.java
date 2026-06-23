package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class by0 extends BaseAdapter {
    public static final int j = l52.c(null).getMaximum(4);
    public static final int k = (l52.c(null).getMaximum(7) + l52.c(null).getMaximum(5)) - 1;
    public final ay0 g;
    public fh h;
    public final zm i;

    public by0(ay0 ay0Var, zm zmVar) {
        this.g = ay0Var;
        this.i = zmVar;
        throw null;
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int i = this.i.k;
        ay0 ay0Var = this.g;
        Calendar calendar = ay0Var.g;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + ay0Var.j : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < c() || i > f()) {
            return null;
        }
        int c = (i - c()) + 1;
        Calendar a2 = l52.a(this.g.g);
        a2.set(5, c);
        return Long.valueOf(a2.getTimeInMillis());
    }

    public final boolean e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= this.i.i.g;
        }
        return false;
    }

    public final int f() {
        return (c() + this.g.k) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return k;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.g.j;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.h == null) {
            this.h = new fh(context, 10);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) d51.j(viewGroup, R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c = i - c();
        if (c >= 0) {
            ay0 ay0Var = this.g;
            if (c < ay0Var.k) {
                textView.setTag(ay0Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                l52.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            l52.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
