package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class u6 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ u6(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CharSequence convertSelectionToString;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                w6 w6Var = (w6) obj;
                z6 z6Var = w6Var.M;
                z6Var.setSelection(i);
                if (z6Var.getOnItemClickListener() != null) {
                    z6Var.performItemClick(view, i, w6Var.J.getItemId(i));
                }
                w6Var.dismiss();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                pu0 pu0Var = (pu0) obj;
                wr0 wr0Var = pu0Var.k;
                convertSelectionToString = pu0Var.convertSelectionToString(i < 0 ? !wr0Var.F.isShowing() ? null : wr0Var.i.getSelectedItem() : pu0Var.getAdapter().getItem(i));
                pu0Var.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = pu0Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !wr0Var.F.isShowing() ? null : wr0Var.i.getSelectedView();
                        i = !wr0Var.F.isShowing() ? -1 : wr0Var.i.getSelectedItemPosition();
                        j = !wr0Var.F.isShowing() ? Long.MIN_VALUE : wr0Var.i.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(wr0Var.i, view, i, j);
                }
                wr0Var.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
