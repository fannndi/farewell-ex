package defpackage;

import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.CPUTimeActivity;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class g3 extends ArrayAdapter {
    public final /* synthetic */ int g = 1;
    public final Object h;
    public final Object i;

    public g3(CPUTimeActivity cPUTimeActivity, ArrayList arrayList) {
        super(cPUTimeActivity, 0, arrayList);
        this.i = arrayList;
        this.h = (LayoutInflater) cPUTimeActivity.getSystemService("layout_inflater");
        TypedValue typedValue = new TypedValue();
        cPUTimeActivity.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        ts.e(typedValue.data, 140);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(j3 j3Var, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, android.R.id.text1, charSequenceArr);
        this.i = j3Var;
        this.h = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ArrayList arrayList = (ArrayList) this.i;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            default:
                return super.getCount();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return i;
            default:
                return super.getItemId(i);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((li1) getItem(i)).f592a;
            default:
                return super.getItemViewType(i);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        f51 f51Var;
        View view2;
        g51 g51Var;
        int i2 = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i2) {
            case 0:
                View view3 = super.getView(i, view, viewGroup);
                boolean[] zArr = ((j3) obj2).t;
                if (zArr != null && zArr[i]) {
                    ((AlertController$RecycleListView) obj).setItemChecked(i, true);
                }
                return view3;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                li1 li1Var = (li1) getItem(i);
                if (((li1) getItem(i)).f592a == 0) {
                    if (view == null) {
                        view2 = layoutInflater.inflate(R.layout.list_item_header, viewGroup, false);
                        g51Var = new g51();
                        g51Var.f320a = (TextView) view2.findViewById(R.id.tvHeader);
                        view2.setTag(g51Var);
                    } else {
                        g51Var = (g51) view.getTag();
                        view2 = view;
                    }
                    g51Var.f320a.setText(li1Var.b);
                } else {
                    if (((li1) getItem(i)).f592a == 3) {
                        if (view != null) {
                            return view;
                        }
                        View inflate = layoutInflater.inflate(R.layout.list_item_footer, viewGroup, false);
                        g51 g51Var2 = new g51();
                        inflate.setTag(g51Var2);
                        return inflate;
                    }
                    if (((li1) getItem(i)).f592a != 2) {
                        return view;
                    }
                    if (view == null) {
                        view2 = layoutInflater.inflate(R.layout.list_item_cputime, viewGroup, false);
                        f51Var = new f51();
                        f51Var.f263a = (li1) arrayList.get(i);
                        f51Var.b = (TextView) view2.findViewById(R.id.tvFreq);
                        f51Var.c = (TextView) view2.findViewById(R.id.tvTime);
                        f51Var.d = (TextView) view2.findViewById(R.id.tvPercent);
                        ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.pbPercent);
                        f51Var.e = progressBar;
                        progressBar.setTag(f51Var.f263a);
                        view2.setTag(f51Var);
                    } else {
                        f51Var = (f51) view.getTag();
                        view2 = view;
                    }
                    f51Var.b.setText(li1Var.b);
                    f51Var.c.setText(li1Var.c);
                    f51Var.d.setText(li1Var.d);
                    f51Var.e.setProgress(li1Var.e);
                }
                return view2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 4;
            default:
                return super.getViewTypeCount();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return true;
            default:
                return super.hasStableIds();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return getItemViewType(i) == 1;
            default:
                return super.isEnabled(i);
        }
    }
}
